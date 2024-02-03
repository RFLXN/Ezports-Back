package com.example.ezports.domain.mapping.repository;

import com.example.ezports.domain.league.entity.League;
import com.example.ezports.domain.mapping.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    List<Participant> findAllByLeague(League league);
}
