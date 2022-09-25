package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.fg */
/* compiled from: PG */
public enum C55084fg implements C62957cd {
    UNKNOWN_CONTACT_METHOD(0),
    PHONE_NUMBER(1),
    EMAIL_ADDRESS(2),
    POSTAL_ADDRESS(3),
    GAIA_ID(4),
    APP_SPECIFIC_ENDPOINT_ID(5),
    ALL_METHODS(6);
    

    /* renamed from: h */
    public final int f144948h;

    private C55084fg(int i) {
        this.f144948h = i;
    }

    /* renamed from: a */
    public static C55084fg m87580a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTACT_METHOD;
            case 1:
                return PHONE_NUMBER;
            case 2:
                return EMAIL_ADDRESS;
            case 3:
                return POSTAL_ADDRESS;
            case 4:
                return GAIA_ID;
            case 5:
                return APP_SPECIFIC_ENDPOINT_ID;
            case 6:
                return ALL_METHODS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87581b() {
        return C55083ff.f144939a;
    }

    public final int getNumber() {
        return this.f144948h;
    }

    public final String toString() {
        return Integer.toString(this.f144948h);
    }
}
