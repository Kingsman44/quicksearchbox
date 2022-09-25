package p3186j$.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* renamed from: j$.time.TimeConversions */
public class TimeConversions {
    public static Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return Instant.ofEpochSecond(instant.getEpochSecond(), (long) instant.getNano());
    }

    public static ZonedDateTime convert(ZonedDateTime zonedDateTime) {
        ZoneId zoneId = null;
        if (zonedDateTime == null) {
            return null;
        }
        int year = zonedDateTime.getYear();
        int monthValue = zonedDateTime.getMonthValue();
        int dayOfMonth = zonedDateTime.getDayOfMonth();
        int hour = zonedDateTime.getHour();
        int minute = zonedDateTime.getMinute();
        int second = zonedDateTime.getSecond();
        int n = zonedDateTime.mo43222n();
        ZoneId zone = zonedDateTime.getZone();
        if (zone != null) {
            zoneId = ZoneId.of(zone.getId());
        }
        return ZonedDateTime.of(year, monthValue, dayOfMonth, hour, minute, second, n, zoneId);
    }
}
