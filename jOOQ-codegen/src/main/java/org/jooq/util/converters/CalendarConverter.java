package org.jooq.util.converters;


import org.jooq.Converter;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarConverter implements Converter<Timestamp, GregorianCalendar> {

    public GregorianCalendar from(Timestamp databaseObject) {
        GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        calendar.setTimeInMillis(databaseObject.getTime());
        return calendar;
    }

    public Timestamp to(GregorianCalendar userObject) {
        return new Timestamp(userObject.getTime().getTime());
    }

    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    public Class<GregorianCalendar> toType() {
        return GregorianCalendar.class;
    }
}
