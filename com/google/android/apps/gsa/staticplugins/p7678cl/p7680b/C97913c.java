package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.c */
/* compiled from: PG */
public enum C97913c implements C62957cd {
    UNKNOWN(0),
    DOWNLOADING(2),
    DOWNLOADED(3),
    FAILED(4),
    FILE_MISSING(5),
    CANCELLED(6),
    QUEUED_TO_DOWNLOAD(7);
    

    /* renamed from: h */
    public final int f273392h;

    private C97913c(int i) {
        this.f273392h = i;
    }

    /* renamed from: a */
    public static C97913c m162190a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        switch (i) {
            case 2:
                return DOWNLOADING;
            case 3:
                return DOWNLOADED;
            case 4:
                return FAILED;
            case 5:
                return FILE_MISSING;
            case 6:
                return CANCELLED;
            case 7:
                return QUEUED_TO_DOWNLOAD;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m162191b() {
        return C97901b.f273350a;
    }

    public final int getNumber() {
        return this.f273392h;
    }

    public final String toString() {
        return Integer.toString(this.f273392h);
    }
}
