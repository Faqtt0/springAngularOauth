package com.algamoneyapi.repository.lancamento;

import com.algamoneyapi.model.Lancamento;
import com.algamoneyapi.repository.filter.LancamentoFilter;
import com.algamoneyapi.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {

	Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
