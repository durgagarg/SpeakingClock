package com.org.wisdomleaf;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.org.wisdomleaf.utils.SpeakingClockUtils;

@SpringBootTest
public class SpeakingClockUtilsTest {

	
	@Test(expected=NumberFormatException.class)
	 public void invalidInput_Test() {
        SpeakingClockUtils speakingClockUtils =  new SpeakingClockUtils();
		speakingClockUtils.parseTime("12:aa");
    }
	@Test
    public void Midday_Test() {
		SpeakingClockUtils speakingClockUtils = new SpeakingClockUtils();
        assertEquals("It's Midday", speakingClockUtils.parseTime("12:00"));
    }
	@Test
    public void MidNight_Test() {
		SpeakingClockUtils speakingClockUtils = new SpeakingClockUtils();
        assertEquals("It's Midnight", speakingClockUtils.parseTime("24:00"));
    }
	@Test
    public void WordTime_Test() {
		SpeakingClockUtils speakingClockUtils = new SpeakingClockUtils();
        assertEquals("It's one fifty", speakingClockUtils.parseTime("1:50"));
    }
}
