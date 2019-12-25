package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TeamDao;
import com.example.demo.models.Team;

@Service(value = "teamService")
public class TeamServiceImpl implements TeamService {
	@Autowired
	TeamDao teamDao;

	@Override
	public Object getTeams() {
		
		
		return teamDao.getTeams();
	}
	
	
	@Override
    public Object addTeam(Team team) {
        return teamDao.addTeam(team);
    }

	

}
