package com.google.p4283bv.p4373g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.g.b */
/* compiled from: PG */
public enum C57667b implements C62957cd {
    UNKNOWN(0),
    INIT(4),
    NONE(1),
    SEND_EMAIL(2),
    SEARCH_EMAIL(3),
    SENSITIVE_AOG_CONVERSATION(5),
    SMART_HOME_PROVIDE_PIN(6),
    SEARCH_DRIVE(8),
    READ_MESSAGE(9),
    SEND_MESSAGE(10),
    BROADCAST(11),
    CALL(14),
    NOTES_AND_LISTS(15),
    DEVICE_ACTIONS_AUTH(16),
    INTERPRETER_MODE(17),
    VOICE_MATCH_ENROLLMENT(18),
    REMINDERS(19),
    DESIGNED_FOR_FAMILY(20),
    CALENDAR(21),
    HEALTH_AND_FITNESS(22),
    MEDIA_PROVIDER_SPOTIFY(23),
    APP_ACTION_HEALTH(24),
    DG_HOME_FEED(25),
    SEARCH_GSUITE(26),
    ASSISTANT_SURVEY(27),
    ASSISTANT_MEMORY(28),
    DEPRECATED_SENSITIVE_HEALTH_CONVERSATION(13),
    DEPRECATED_READ_CALENDAR(7),
    DEPRECATED_WRITE_CALENDAR(12);
    

    /* renamed from: D */
    public final int f154045D;

    private C57667b(int i) {
        this.f154045D = i;
    }

    /* renamed from: a */
    public static C57667b m88514a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NONE;
            case 2:
                return SEND_EMAIL;
            case 3:
                return SEARCH_EMAIL;
            case 4:
                return INIT;
            case 5:
                return SENSITIVE_AOG_CONVERSATION;
            case 6:
                return SMART_HOME_PROVIDE_PIN;
            case 7:
                return DEPRECATED_READ_CALENDAR;
            case 8:
                return SEARCH_DRIVE;
            case 9:
                return READ_MESSAGE;
            case 10:
                return SEND_MESSAGE;
            case 11:
                return BROADCAST;
            case 12:
                return DEPRECATED_WRITE_CALENDAR;
            case 13:
                return DEPRECATED_SENSITIVE_HEALTH_CONVERSATION;
            case 14:
                return CALL;
            case 15:
                return NOTES_AND_LISTS;
            case 16:
                return DEVICE_ACTIONS_AUTH;
            case 17:
                return INTERPRETER_MODE;
            case 18:
                return VOICE_MATCH_ENROLLMENT;
            case 19:
                return REMINDERS;
            case 20:
                return DESIGNED_FOR_FAMILY;
            case 21:
                return CALENDAR;
            case 22:
                return HEALTH_AND_FITNESS;
            case 23:
                return MEDIA_PROVIDER_SPOTIFY;
            case 24:
                return APP_ACTION_HEALTH;
            case 25:
                return DG_HOME_FEED;
            case 26:
                return SEARCH_GSUITE;
            case 27:
                return ASSISTANT_SURVEY;
            case 28:
                return ASSISTANT_MEMORY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88515b() {
        return C57666a.f154014a;
    }

    public final int getNumber() {
        return this.f154045D;
    }

    public final String toString() {
        return Integer.toString(this.f154045D);
    }
}
