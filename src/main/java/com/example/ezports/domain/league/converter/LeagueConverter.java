package com.example.ezports.domain.league.converter;

import com.example.ezports.domain.league.dto.LeagueResponseDTO;
import com.example.ezports.domain.league.entity.League;
import com.example.ezports.domain.mapping.dto.ParticipantResponseDTO;
import com.example.ezports.domain.mapping.entity.Participant;
import com.example.ezports.domain.match.dto.MatchResponseDTO;
import com.example.ezports.domain.match.entity.Match;
import com.example.ezports.domain.team.dto.TeamResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LeagueConverter {
    public League toLeague(String leagueName, String information) {
        return League.builder()
                .name(leagueName)
                .information(information)
                .logoUrl("")
                .build();
    }

    public LeagueResponseDTO.createLeague toCreateLeague(League league) {
        return LeagueResponseDTO.createLeague.builder()
                .id(league.getId())
                .name(league.getName())
                .information(league.getInformation())
                .build();
    }

    public LeagueResponseDTO.getLeague toGetLeague(League league, List<TeamResponseDTO.getParticipantTeam> teams, List<MatchResponseDTO.getLeagueMatch> matches) {
        return LeagueResponseDTO.getLeague.builder()
                .id(league.getId())
                .name(league.getName())
                .information(league.getInformation())
                .logoUrl(league.getLogoUrl())
                .teams(teams)
                .matches(matches)
                .build();
    }
}
