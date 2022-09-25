package com.google.common.p4552o.p4554b.p4555a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.b.a.x */
/* compiled from: PG */
public enum C59644x implements C62957cd {
    ERROR_REASON_UNSPECIFIED(0),
    ERROR_REASON_JOB_SCHEDULER(1),
    ERROR_REASON_FILE_DELETION(2),
    ERROR_REASON_IO_EXCEPTION(3),
    ERROR_REASON_RUNTIME_EXCEPTION(4);
    

    /* renamed from: f */
    public final int f159916f;

    private C59644x(int i) {
        this.f159916f = i;
    }

    /* renamed from: a */
    public static C59644x m92471a(int i) {
        if (i == 0) {
            return ERROR_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return ERROR_REASON_JOB_SCHEDULER;
        }
        if (i == 2) {
            return ERROR_REASON_FILE_DELETION;
        }
        if (i == 3) {
            return ERROR_REASON_IO_EXCEPTION;
        }
        if (i != 4) {
            return null;
        }
        return ERROR_REASON_RUNTIME_EXCEPTION;
    }

    /* renamed from: b */
    public static C62959cf m92472b() {
        return C59643w.f159909a;
    }

    public final int getNumber() {
        return this.f159916f;
    }

    public final String toString() {
        return Integer.toString(this.f159916f);
    }
}
