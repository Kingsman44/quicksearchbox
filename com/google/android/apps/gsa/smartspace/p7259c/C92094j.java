package com.google.android.apps.gsa.smartspace.p7259c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.smartspace.c.j */
/* compiled from: PG */
public enum C92094j implements C62957cd {
    AT_A_GLANCE(1),
    CALENDAR_EVENTS(2),
    UPCOMING_FLIGHTS(3),
    TRAFFIC_INFORMATION(4),
    REMINDERS(5),
    WORK_PROFILE(6),
    AT_HOME(7),
    AT_STORE(8),
    AT_RESTAURANT(9),
    AT_TRANSIT_STATION(10),
    HEADPHONES(11),
    RIDE_SHARE(12),
    ALARM(13),
    APP_SUGGESTIONS(14),
    GAS_STATION(15),
    HOME_CONTROLS(16),
    LOYALTY_CARD(17),
    MEDIA_RECOMMENDATIONS(18),
    NIGHT_SOUNDS(19),
    QUERY_SONG(20),
    SHOPPING_LIST(21),
    TV_REMOTE(22),
    WEATHER(23),
    NAVIGATE_TO(24),
    LOCATION(25),
    FREQUENT_HOME_QUERIES(26),
    DEBUG(27),
    PARKING(28),
    ORDER_COFFEE(29),
    SPORTS(30),
    STOCK(31),
    BIRTHDAY(32),
    WEATHER_ALERT(33),
    LOCATION_FEEDBACK(34),
    BLOCKING_BT_DEVICES(35),
    RESTAURANT_DEEPLINK(36),
    AT_WORK(37),
    FLASHLIGHT(38),
    UPCOMING_BUNDLE(39),
    ADJUST_ALARM(40),
    DRIVE_MODE(41),
    MEDIA_HEADS_UP(42),
    GROCERY(43),
    HOTEL(44),
    COMMUTE(45),
    CROSS_DEVICE_TIMER(46),
    AIR_QUALITY(47);
    

    /* renamed from: V */
    public final int f256786V;

    private C92094j(int i) {
        this.f256786V = i;
    }

    /* renamed from: a */
    public static C92094j m151126a(int i) {
        switch (i) {
            case 1:
                return AT_A_GLANCE;
            case 2:
                return CALENDAR_EVENTS;
            case 3:
                return UPCOMING_FLIGHTS;
            case 4:
                return TRAFFIC_INFORMATION;
            case 5:
                return REMINDERS;
            case 6:
                return WORK_PROFILE;
            case 7:
                return AT_HOME;
            case 8:
                return AT_STORE;
            case 9:
                return AT_RESTAURANT;
            case 10:
                return AT_TRANSIT_STATION;
            case 11:
                return HEADPHONES;
            case 12:
                return RIDE_SHARE;
            case 13:
                return ALARM;
            case 14:
                return APP_SUGGESTIONS;
            case 15:
                return GAS_STATION;
            case 16:
                return HOME_CONTROLS;
            case 17:
                return LOYALTY_CARD;
            case 18:
                return MEDIA_RECOMMENDATIONS;
            case 19:
                return NIGHT_SOUNDS;
            case 20:
                return QUERY_SONG;
            case 21:
                return SHOPPING_LIST;
            case 22:
                return TV_REMOTE;
            case 23:
                return WEATHER;
            case 24:
                return NAVIGATE_TO;
            case 25:
                return LOCATION;
            case 26:
                return FREQUENT_HOME_QUERIES;
            case 27:
                return DEBUG;
            case 28:
                return PARKING;
            case 29:
                return ORDER_COFFEE;
            case 30:
                return SPORTS;
            case 31:
                return STOCK;
            case 32:
                return BIRTHDAY;
            case 33:
                return WEATHER_ALERT;
            case 34:
                return LOCATION_FEEDBACK;
            case 35:
                return BLOCKING_BT_DEVICES;
            case 36:
                return RESTAURANT_DEEPLINK;
            case 37:
                return AT_WORK;
            case 38:
                return FLASHLIGHT;
            case 39:
                return UPCOMING_BUNDLE;
            case 40:
                return ADJUST_ALARM;
            case 41:
                return DRIVE_MODE;
            case 42:
                return MEDIA_HEADS_UP;
            case 43:
                return GROCERY;
            case 44:
                return HOTEL;
            case 45:
                return COMMUTE;
            case 46:
                return CROSS_DEVICE_TIMER;
            case 47:
                return AIR_QUALITY;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f256786V;
    }

    public final String toString() {
        return Integer.toString(this.f256786V);
    }
}
