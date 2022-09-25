package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.e.ep */
/* compiled from: PG */
public enum C51936ep implements C62957cd {
    DEFAULT(0),
    CALL(1),
    MESSAGE(2),
    READ_MESSAGE(18),
    REPLY_MESSAGE(19),
    REMINDER(3),
    REMINDER_CHIPPY(14),
    REMINDER_PORTMON(16),
    EVENT(4),
    ALARM(5),
    TIMER(6),
    CACHE_DISCLAIMER(7),
    EMAIL(8),
    TELL_MY_FAMILY(9),
    DIALER_SMART_REPLY(10),
    PAY_FOR_GAS(11),
    TRANSACTION(12),
    WHATS_NEW(13),
    GEPPETTO_HELP_CARD(15),
    DEVICE_SETTINGS(17);
    

    /* renamed from: u */
    public final int f136236u;

    private C51936ep(int i) {
        this.f136236u = i;
    }

    /* renamed from: a */
    public static C51936ep m86435a(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return CALL;
            case 2:
                return MESSAGE;
            case 3:
                return REMINDER;
            case 4:
                return EVENT;
            case 5:
                return ALARM;
            case 6:
                return TIMER;
            case 7:
                return CACHE_DISCLAIMER;
            case 8:
                return EMAIL;
            case 9:
                return TELL_MY_FAMILY;
            case 10:
                return DIALER_SMART_REPLY;
            case 11:
                return PAY_FOR_GAS;
            case 12:
                return TRANSACTION;
            case 13:
                return WHATS_NEW;
            case 14:
                return REMINDER_CHIPPY;
            case 15:
                return GEPPETTO_HELP_CARD;
            case 16:
                return REMINDER_PORTMON;
            case 17:
                return DEVICE_SETTINGS;
            case 18:
                return READ_MESSAGE;
            case 19:
                return REPLY_MESSAGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86436b() {
        return C51935eo.f136214a;
    }

    public final int getNumber() {
        return this.f136236u;
    }

    public final String toString() {
        return Integer.toString(this.f136236u);
    }
}
