package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.rb */
/* compiled from: PG */
public enum C60470rb implements C62957cd {
    SUCCESS(0),
    USER_RECOVERABLE_ERROR(1),
    GOOGLE_AUTH_EXCEPTION(2),
    IO_EXCEPTION(3),
    TIMEOUT(4),
    INTERRUPTED(5),
    FETCH_OMITTED(6);
    

    /* renamed from: h */
    public final int f163657h;

    private C60470rb(int i) {
        this.f163657h = i;
    }

    /* renamed from: a */
    public static C60470rb m92594a(int i) {
        switch (i) {
            case 0:
                return SUCCESS;
            case 1:
                return USER_RECOVERABLE_ERROR;
            case 2:
                return GOOGLE_AUTH_EXCEPTION;
            case 3:
                return IO_EXCEPTION;
            case 4:
                return TIMEOUT;
            case 5:
                return INTERRUPTED;
            case 6:
                return FETCH_OMITTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92595b() {
        return C60469ra.f163648a;
    }

    public final int getNumber() {
        return this.f163657h;
    }

    public final String toString() {
        return Integer.toString(this.f163657h);
    }
}
