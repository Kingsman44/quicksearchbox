package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.kr */
/* compiled from: PG */
public enum C51518kr implements C62957cd {
    UNKNOWN(0),
    DATE_TIME(2),
    ADDRESS(3),
    EMAIL(4),
    FLIGHT_NUMBER(5),
    PHONE(6),
    URL(7),
    LANGUAGE(8),
    CONTACT(9),
    WEBREF(10),
    POS_TAG(11),
    APP(12),
    NUMBER(13),
    DURATION(14),
    GRAMMAR(15),
    SPAN(16),
    MONEY(17),
    APP_ACTIONS(18),
    PERCENTAGE(19),
    PERSON_NAME(20),
    UNINTENDED_QUERY(21);
    

    /* renamed from: v */
    public final int f134242v;

    private C51518kr(int i) {
        this.f134242v = i;
    }

    /* renamed from: a */
    public static C51518kr m86208a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        switch (i) {
            case 2:
                return DATE_TIME;
            case 3:
                return ADDRESS;
            case 4:
                return EMAIL;
            case 5:
                return FLIGHT_NUMBER;
            case 6:
                return PHONE;
            case 7:
                return URL;
            case 8:
                return LANGUAGE;
            case 9:
                return CONTACT;
            case 10:
                return WEBREF;
            case 11:
                return POS_TAG;
            case 12:
                return APP;
            case 13:
                return NUMBER;
            case 14:
                return DURATION;
            case 15:
                return GRAMMAR;
            case 16:
                return SPAN;
            case 17:
                return MONEY;
            case 18:
                return APP_ACTIONS;
            case 19:
                return PERCENTAGE;
            case 20:
                return PERSON_NAME;
            case 21:
                return UNINTENDED_QUERY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86209b() {
        return C51517kq.f134219a;
    }

    public final int getNumber() {
        return this.f134242v;
    }

    public final String toString() {
        return Integer.toString(this.f134242v);
    }
}
