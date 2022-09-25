package com.google.p5177r.p5178a.p5179a.p5180a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.r.a.a.a.b */
/* compiled from: PG */
public enum C66274b implements C62957cd {
    UNKNOWN_API_FEATURE(0),
    CALL_INTENT_API_CALL_PHONE_NUMBER(1),
    CALL_INTENT_API_TARGETED_CALL(2),
    CALL_INTENT_API_SELF_CALL(5),
    INTENT_API_OPEN_SETTINGS(3),
    INTENT_API_OPEN_BLOCKED_CONTACTS(4),
    SERVICE_API_GET_REGISTRATION_INFO(6),
    SERVICE_API_GET_REGISTERED_ID_TYPE(7),
    DUO_KIT_REQUESTS(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f180242k;

    private C66274b(int i) {
        this.f180242k = i;
    }

    /* renamed from: a */
    public static C66274b m96848a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_API_FEATURE;
            case 1:
                return CALL_INTENT_API_CALL_PHONE_NUMBER;
            case 2:
                return CALL_INTENT_API_TARGETED_CALL;
            case 3:
                return INTENT_API_OPEN_SETTINGS;
            case 4:
                return INTENT_API_OPEN_BLOCKED_CONTACTS;
            case 5:
                return CALL_INTENT_API_SELF_CALL;
            case 6:
                return SERVICE_API_GET_REGISTRATION_INFO;
            case 7:
                return SERVICE_API_GET_REGISTERED_ID_TYPE;
            case 8:
                return DUO_KIT_REQUESTS;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f180242k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
