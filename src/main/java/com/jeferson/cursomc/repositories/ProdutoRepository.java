package com.jeferson.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jeferson.cursomc.domain.Categoria;
import com.jeferson.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
//	@Query("Select distinct obj from Produto obj Inner join obj.categorias cat where obj.nome like %:nome% and cat in :categorias")
//	Page<Produto> search(@Param("nome")String nome, @Param("categorias")List<Categoria> categorias, Pageable pageRequest);
	
	@Transactional(readOnly=true)
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(@Param("nome")String nome, @Param("categorias")List<Categoria> categorias, Pageable pageRequest);

}


//OBS: findDistinctByNomeContainingAndCategoriasIn para subistituir a query em cima do metodo