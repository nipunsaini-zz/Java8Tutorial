package com.java8;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class DateAndTime {

	public static void main(String[] args) {
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		System.out.println(millis);
		
		Instant instant = clock.instant();
		Date date = Date.from(instant);
		System.out.println(date);
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println(zones);
		
		ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
		System.out.println(indiaZone.getRules());
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime time = LocalTime.of(23, 53, 50);
		System.out.println(time);
		
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		LocalDate yesterday = today.minusDays(1);
		LocalDate newYear = LocalDate.of(2016, Month.JANUARY, 1);
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(yesterday);
		System.out.println(newYear);
		
		DayOfWeek dayOfWeek = newYear.getDayOfWeek();
		System.out.println(dayOfWeek);
		
		LocalDateTime localDateTime = LocalDateTime.of(2016, Month.APRIL, 4, 16, 30, 50);
		DayOfWeek day = localDateTime.getDayOfWeek();
		Month month = localDateTime.getMonth();
		System.out.println(day);
		System.out.println(month);

	}

}
