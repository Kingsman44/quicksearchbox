package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.hb */
/* compiled from: PG */
public enum C55133hb implements C62957cd {
    NONE(0),
    APP_NAME(42),
    CONSTANT_PREFERRED_APP_NAME(7),
    CONSTANT_PREFERRED_APP_PACKAGE(14),
    CONSTANT_DEFAULT_SMS_APP_PACKAGE(15),
    CONSTANT_CREATION_RESULT_ID(23),
    CONSTANT_NUMBER_OF_RESULTS(34),
    CONTACT_NAME(4),
    CONTACT_RELATIONSHIP_NAME(8),
    CONTACT_EMAIL_ADDRESS(1),
    CONTACT_POSTAL_ADDRESS(36),
    CONTACT_PHONE_NUMBER(2),
    CONTACT_ENDPOINT_TYPE(5),
    CONTACT_QUERY(9),
    CONTACT_URI(13),
    CONTACT_GPLUS_PROFILE_ID(19),
    CONTACT_APP_SPECIFIC_ENDPOINT_ID(29),
    ENTITY_TITLE(6),
    ENTITY_VALUE(3),
    ENTITY_VALUE_WITH_AUDIO_URI_FOR_TTS(44),
    ENTITY_ICING_APP_COMPONENT_NAME(24),
    ENTITY_ICING_EXTRA_DATA(31),
    ENTITY_TYPE(26),
    ENTITY_VOCALIZED_PERFORM_PROMPT(43),
    LOCATION_MARKER_URL(10),
    LOCATION_PHONE_NUMBER(11),
    LOCATION_TITLE(22),
    SERVER_LOCATION_STREET(37),
    SERVER_LOCATION_LOCALITY(38),
    SERVER_LOCATION_PHONE_TYPE(41),
    DOCUMENT_URI(12),
    SETTING_ENABLED(39),
    TIME_HOUR(16),
    TIME_MINUTE(17),
    FORMATTED_DATE_TIME(25),
    TIME_DURATION_SECONDS(20),
    FORMATTED_TIME_DURATION(27),
    DATE_TIME_MS(18),
    RECURRENCE_DAY_OF_WEEK(28),
    FORMATTED_RECURRENCE(30),
    MEDIA_CONTROL_PENDING_COMMAND(32),
    MEDIA_PLAYING_APP_PACKAGE(33),
    LIST_ITEM_POSITION(35),
    FORMATTED_LIST_ITEMS(40);
    

    /* renamed from: S */
    public final int f145118S;

    private C55133hb(int i) {
        this.f145118S = i;
    }

    /* renamed from: a */
    public static C55133hb m87600a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return CONTACT_EMAIL_ADDRESS;
            case 2:
                return CONTACT_PHONE_NUMBER;
            case 3:
                return ENTITY_VALUE;
            case 4:
                return CONTACT_NAME;
            case 5:
                return CONTACT_ENDPOINT_TYPE;
            case 6:
                return ENTITY_TITLE;
            case 7:
                return CONSTANT_PREFERRED_APP_NAME;
            case 8:
                return CONTACT_RELATIONSHIP_NAME;
            case 9:
                return CONTACT_QUERY;
            case 10:
                return LOCATION_MARKER_URL;
            case 11:
                return LOCATION_PHONE_NUMBER;
            case 12:
                return DOCUMENT_URI;
            case 13:
                return CONTACT_URI;
            case 14:
                return CONSTANT_PREFERRED_APP_PACKAGE;
            case 15:
                return CONSTANT_DEFAULT_SMS_APP_PACKAGE;
            case 16:
                return TIME_HOUR;
            case 17:
                return TIME_MINUTE;
            case 18:
                return DATE_TIME_MS;
            case 19:
                return CONTACT_GPLUS_PROFILE_ID;
            case 20:
                return TIME_DURATION_SECONDS;
            case 22:
                return LOCATION_TITLE;
            case 23:
                return CONSTANT_CREATION_RESULT_ID;
            case 24:
                return ENTITY_ICING_APP_COMPONENT_NAME;
            case 25:
                return FORMATTED_DATE_TIME;
            case 26:
                return ENTITY_TYPE;
            case 27:
                return FORMATTED_TIME_DURATION;
            case 28:
                return RECURRENCE_DAY_OF_WEEK;
            case 29:
                return CONTACT_APP_SPECIFIC_ENDPOINT_ID;
            case 30:
                return FORMATTED_RECURRENCE;
            case 31:
                return ENTITY_ICING_EXTRA_DATA;
            case 32:
                return MEDIA_CONTROL_PENDING_COMMAND;
            case 33:
                return MEDIA_PLAYING_APP_PACKAGE;
            case 34:
                return CONSTANT_NUMBER_OF_RESULTS;
            case 35:
                return LIST_ITEM_POSITION;
            case 36:
                return CONTACT_POSTAL_ADDRESS;
            case 37:
                return SERVER_LOCATION_STREET;
            case 38:
                return SERVER_LOCATION_LOCALITY;
            case 39:
                return SETTING_ENABLED;
            case 40:
                return FORMATTED_LIST_ITEMS;
            case 41:
                return SERVER_LOCATION_PHONE_TYPE;
            case 42:
                return APP_NAME;
            case 43:
                return ENTITY_VOCALIZED_PERFORM_PROMPT;
            case 44:
                return ENTITY_VALUE_WITH_AUDIO_URI_FOR_TTS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87601b() {
        return C55132ha.f145072a;
    }

    public final int getNumber() {
        return this.f145118S;
    }

    public final String toString() {
        return Integer.toString(this.f145118S);
    }
}
