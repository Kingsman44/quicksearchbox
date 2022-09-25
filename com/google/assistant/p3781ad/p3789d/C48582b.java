package com.google.assistant.p3781ad.p3789d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ad.d.b */
/* compiled from: PG */
public enum C48582b implements C62957cd {
    UNKNOWN_ACTION(0),
    START_EXERCISE(1),
    STOP_EXERCISE(2),
    PAUSE_EXERCISE(3),
    RESUME_EXERCISE(4),
    CREATE_TAXI_RESERVATION(5),
    GET_TAXI_RESERVATION(6),
    CANCEL_TAXI_RESERVATION(7),
    GET_ACCOUNT(9),
    CREATE_MONEY_TRANSFER(10),
    GET_INVOICE(11),
    PAY_INVOICE(12),
    ORDER_MENU_ITEM(13),
    GET_DIGITAL_DOCUMENT(14),
    GET_SOCIAL_MEDIA_PROFILE(15),
    OPEN_APP_FEATURE(8);
    

    /* renamed from: q */
    public final int f125574q;

    private C48582b(int i) {
        this.f125574q = i;
    }

    /* renamed from: a */
    public static C48582b m85243a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION;
            case 1:
                return START_EXERCISE;
            case 2:
                return STOP_EXERCISE;
            case 3:
                return PAUSE_EXERCISE;
            case 4:
                return RESUME_EXERCISE;
            case 5:
                return CREATE_TAXI_RESERVATION;
            case 6:
                return GET_TAXI_RESERVATION;
            case 7:
                return CANCEL_TAXI_RESERVATION;
            case 8:
                return OPEN_APP_FEATURE;
            case 9:
                return GET_ACCOUNT;
            case 10:
                return CREATE_MONEY_TRANSFER;
            case 11:
                return GET_INVOICE;
            case 12:
                return PAY_INVOICE;
            case 13:
                return ORDER_MENU_ITEM;
            case 14:
                return GET_DIGITAL_DOCUMENT;
            case 15:
                return GET_SOCIAL_MEDIA_PROFILE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85244b() {
        return C48547a.f125422a;
    }

    public final int getNumber() {
        return this.f125574q;
    }

    public final String toString() {
        return Integer.toString(this.f125574q);
    }
}
