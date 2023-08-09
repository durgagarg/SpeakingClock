package com.org.wisdomleaf.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.wisdomleaf.service.ClockService;
import com.org.wisdomleaf.utils.SpeakingClockUtils;

@Service
public class ClockServiceImpl implements ClockService {
	
	@Autowired
	private SpeakingClockUtils speakingClockUtils;

	@Override
	public String Showresult(String input) {
		String yourTime =  speakingClockUtils.parseTime(input);
		return yourTime;
	}

}
