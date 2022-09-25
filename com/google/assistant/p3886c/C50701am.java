package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.am */
/* compiled from: PG */
public enum C50701am implements C62957cd {
    UNKNOWN(0),
    DEBUG(1),
    HOME_CONTROLS(2),
    ORDER_COFFEE(3),
    PLAY_MEDIA(4),
    RIDESHARE(5),
    SHOPPING_LIST(6),
    AT_TRANSIT_STOP(7),
    RESTAURANT_DEEPLINK(8),
    CALL_RECOMMENDATIONS(9),
    SET_ALARM(10),
    QUERY_SONG(11),
    FLIGHT(12),
    HOME_CONTEXT(14),
    HEADPHONE_CONTEXT(15),
    WEATHER_TODAY(16),
    WEATHER_NEXT_DAY(17),
    AGENDA_TODAY(18),
    AGENDA_NEXT_DAY(19),
    NEXT_STOP_COMMUTE(20),
    NIGHT_SOUNDS(21),
    DO_NOT_DISTURB(22),
    STORE_CONTEXT(23),
    APP_SUGGESTIONS(25),
    LOYALTY_CARD(26),
    GAS_STATION_PAYMENT(27),
    TV_REMOTE(28),
    NAVIGATE_TO(29),
    FREQ_HOME_QUERIES(30),
    PARKING_PAYMENT(31),
    LOCATION_FEEDBACK(32),
    BLOCKING_BT_DEVICES(33),
    RESTAURANT_CONTEXT(34),
    WORK_CONTEXT(35),
    TURN_OFF_FLASHLIGHT(36),
    PLAY_MEDIA_ACTIVE(37),
    ADJUST_ALARM(38),
    DRIVE_MODE(39),
    MEDIA_HEADS_UP(40);
    

    /* renamed from: N */
    public final int f131953N;

    private C50701am(int i) {
        this.f131953N = i;
    }

    /* renamed from: a */
    public static C50701am m85887a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DEBUG;
            case 2:
                return HOME_CONTROLS;
            case 3:
                return ORDER_COFFEE;
            case 4:
                return PLAY_MEDIA;
            case 5:
                return RIDESHARE;
            case 6:
                return SHOPPING_LIST;
            case 7:
                return AT_TRANSIT_STOP;
            case 8:
                return RESTAURANT_DEEPLINK;
            case 9:
                return CALL_RECOMMENDATIONS;
            case 10:
                return SET_ALARM;
            case 11:
                return QUERY_SONG;
            case 12:
                return FLIGHT;
            case 14:
                return HOME_CONTEXT;
            case 15:
                return HEADPHONE_CONTEXT;
            case 16:
                return WEATHER_TODAY;
            case 17:
                return WEATHER_NEXT_DAY;
            case 18:
                return AGENDA_TODAY;
            case 19:
                return AGENDA_NEXT_DAY;
            case 20:
                return NEXT_STOP_COMMUTE;
            case 21:
                return NIGHT_SOUNDS;
            case 22:
                return DO_NOT_DISTURB;
            case 23:
                return STORE_CONTEXT;
            case 25:
                return APP_SUGGESTIONS;
            case 26:
                return LOYALTY_CARD;
            case 27:
                return GAS_STATION_PAYMENT;
            case 28:
                return TV_REMOTE;
            case 29:
                return NAVIGATE_TO;
            case 30:
                return FREQ_HOME_QUERIES;
            case 31:
                return PARKING_PAYMENT;
            case 32:
                return LOCATION_FEEDBACK;
            case 33:
                return BLOCKING_BT_DEVICES;
            case 34:
                return RESTAURANT_CONTEXT;
            case 35:
                return WORK_CONTEXT;
            case 36:
                return TURN_OFF_FLASHLIGHT;
            case 37:
                return PLAY_MEDIA_ACTIVE;
            case 38:
                return ADJUST_ALARM;
            case 39:
                return DRIVE_MODE;
            case 40:
                return MEDIA_HEADS_UP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85888b() {
        return C50700al.f131912a;
    }

    public final int getNumber() {
        return this.f131953N;
    }

    public final String toString() {
        return Integer.toString(this.f131953N);
    }
}
