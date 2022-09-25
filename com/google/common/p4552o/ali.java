package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.ali */
/* compiled from: PG */
public enum ali implements C62957cd {
    UNSPECIFIED(0),
    CALENDAR_EVENTS(1),
    REMINDERS(2),
    WORK_PROFILE(3),
    AT_HOME(4),
    AT_STORE(5),
    AT_TRANSIT_STATION(6),
    HEADPHONES(7),
    LOCATION(8),
    SPORTS(9),
    ASSISTANT_PERSONAL_RESULTS(10),
    LOCKSCREEN_PERSONAL_RESULTS(11),
    PROACTIVE_PERSONAL_RESULTS(12),
    AGSA_LOCATION_ACCESS(13),
    GOOGLE_LOCATION_HISTORY(14),
    ASSISTANT_HOME_ADDRESS(15),
    UPCOMING_FLIGHTS(16),
    TRAFFIC_INFORMATION(17),
    STOCK(18),
    BIRTHDAY(19),
    WEATHER_ALERT(20),
    AMBIENT_MODE(21),
    ALARM(22),
    WEB_AND_APP_ACTIVITY(23),
    WEATHER(24),
    UPCOMING_BUNDLE(25),
    AT_A_GLANCE(26),
    NOTIFICATION_READ(27);
    

    /* renamed from: C */
    public final int f159059C;

    private ali(int i) {
        this.f159059C = i;
    }

    /* renamed from: a */
    public static ali m92430a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return CALENDAR_EVENTS;
            case 2:
                return REMINDERS;
            case 3:
                return WORK_PROFILE;
            case 4:
                return AT_HOME;
            case 5:
                return AT_STORE;
            case 6:
                return AT_TRANSIT_STATION;
            case 7:
                return HEADPHONES;
            case 8:
                return LOCATION;
            case 9:
                return SPORTS;
            case 10:
                return ASSISTANT_PERSONAL_RESULTS;
            case 11:
                return LOCKSCREEN_PERSONAL_RESULTS;
            case 12:
                return PROACTIVE_PERSONAL_RESULTS;
            case 13:
                return AGSA_LOCATION_ACCESS;
            case 14:
                return GOOGLE_LOCATION_HISTORY;
            case 15:
                return ASSISTANT_HOME_ADDRESS;
            case 16:
                return UPCOMING_FLIGHTS;
            case 17:
                return TRAFFIC_INFORMATION;
            case 18:
                return STOCK;
            case 19:
                return BIRTHDAY;
            case 20:
                return WEATHER_ALERT;
            case 21:
                return AMBIENT_MODE;
            case 22:
                return ALARM;
            case 23:
                return WEB_AND_APP_ACTIVITY;
            case 24:
                return WEATHER;
            case 25:
                return UPCOMING_BUNDLE;
            case 26:
                return AT_A_GLANCE;
            case 27:
                return NOTIFICATION_READ;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92431b() {
        return alh.f159029a;
    }

    public final int getNumber() {
        return this.f159059C;
    }

    public final String toString() {
        return Integer.toString(this.f159059C);
    }
}
