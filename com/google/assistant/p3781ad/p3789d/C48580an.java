package com.google.assistant.p3781ad.p3789d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ad.d.an */
/* compiled from: PG */
public enum C48580an implements C62957cd {
    UNKNOWN(0),
    PERSONALIZED_QUERY(1),
    ON_DEVICE_APP(2),
    ON_DEVICE_CONTACT_FROM_ICING(3),
    ON_DEVICE_APP_RESULT(4),
    FALLBACK(5),
    ZERO_STATE(6),
    DEVICE_CONTACT(7),
    WEATHER(8),
    ZERO_PREFIX_CARD(9),
    ICING_CONTACT(10),
    GEO(11),
    MEDIA(12),
    TOP_CONTACT(13),
    VIDEO(14),
    GEO_CHIP(15),
    ENTITY(16),
    MEDIA_ENTITY(32),
    CALCULATOR(17),
    ACTIVE_MESSAGE(18),
    ICON_SHORTCUT(19),
    APP_SHORTCUTS(34),
    APP_ICON(20),
    APP_ACTION(21),
    APP_DONATION(35),
    APP_ACTIONS_SLICE(38),
    HOME_AUTOMATION(33),
    ON_DEVICE_URL_CHROME(22),
    ON_DEVICE_URL(23),
    HABIT_QUERY(24),
    HABIT_APP_ICON(25),
    TAPAS_SERVER_FALLBACK(26),
    TAPAS_SERVER_PRODUCTIVITY(27),
    ANSWER(28),
    SLICE(29),
    RULE_BASED(30),
    CORRECTION(31),
    SEARCH_X_ON_Y(36),
    INTERNET_CHANNEL(37),
    PERSONAL_URL(39),
    APP_PLACEHOLDER(40),
    UNRECOGNIZED(-1);
    

    /* renamed from: Q */
    private final int f125555Q;

    private C48580an(int i) {
        this.f125555Q = i;
    }

    /* renamed from: a */
    public static C48580an m85240a(String str) {
        return (C48580an) Enum.valueOf(C48580an.class, str);
    }

    /* renamed from: b */
    public static C48580an m85241b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PERSONALIZED_QUERY;
            case 2:
                return ON_DEVICE_APP;
            case 3:
                return ON_DEVICE_CONTACT_FROM_ICING;
            case 4:
                return ON_DEVICE_APP_RESULT;
            case 5:
                return FALLBACK;
            case 6:
                return ZERO_STATE;
            case 7:
                return DEVICE_CONTACT;
            case 8:
                return WEATHER;
            case 9:
                return ZERO_PREFIX_CARD;
            case 10:
                return ICING_CONTACT;
            case 11:
                return GEO;
            case 12:
                return MEDIA;
            case 13:
                return TOP_CONTACT;
            case 14:
                return VIDEO;
            case 15:
                return GEO_CHIP;
            case 16:
                return ENTITY;
            case 17:
                return CALCULATOR;
            case 18:
                return ACTIVE_MESSAGE;
            case 19:
                return ICON_SHORTCUT;
            case 20:
                return APP_ICON;
            case 21:
                return APP_ACTION;
            case 22:
                return ON_DEVICE_URL_CHROME;
            case 23:
                return ON_DEVICE_URL;
            case 24:
                return HABIT_QUERY;
            case 25:
                return HABIT_APP_ICON;
            case 26:
                return TAPAS_SERVER_FALLBACK;
            case 27:
                return TAPAS_SERVER_PRODUCTIVITY;
            case 28:
                return ANSWER;
            case 29:
                return SLICE;
            case 30:
                return RULE_BASED;
            case 31:
                return CORRECTION;
            case 32:
                return MEDIA_ENTITY;
            case 33:
                return HOME_AUTOMATION;
            case 34:
                return APP_SHORTCUTS;
            case 35:
                return APP_DONATION;
            case 36:
                return SEARCH_X_ON_Y;
            case 37:
                return INTERNET_CHANNEL;
            case 38:
                return APP_ACTIONS_SLICE;
            case 39:
                return PERSONAL_URL;
            case 40:
                return APP_PLACEHOLDER;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m85242c() {
        return C48579am.f125511a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f125555Q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
