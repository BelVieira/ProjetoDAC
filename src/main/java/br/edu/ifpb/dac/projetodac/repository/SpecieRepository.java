package br.edu.ifpb.dac.projetodac.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.projetodac.model.SpecieModel;

@Repository
public interface SpecieRepository extends PagingAndSortingRepository<SpecieModel, Integer> {
	Pageable firstPageWithTwoElements = PageRequest.of(0, 2);

	List<SpecieModel> findAllByKey(int chave, Pageable firstPageWithTwoElements);

}