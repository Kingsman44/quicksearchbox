package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.c.b.c.q */
/* compiled from: PG */
public enum C17072q implements C62957cd {
    UNKNOWN(0),
    PREPARING(1),
    READY_TO_DOWNLOAD(2),
    DOWNLOADING(3),
    FINISHED_SUCCESS(4),
    FINISHED_FAILURE(5),
    FINISHED_CANCELLED(6);
    

    /* renamed from: h */
    public final int f49699h;

    private C17072q(int i) {
        this.f49699h = i;
    }

    /* renamed from: a */
    public static C17072q m34237a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PREPARING;
            case 2:
                return READY_TO_DOWNLOAD;
            case 3:
                return DOWNLOADING;
            case 4:
                return FINISHED_SUCCESS;
            case 5:
                return FINISHED_FAILURE;
            case 6:
                return FINISHED_CANCELLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m34238b() {
        return C17071p.f49690a;
    }

    public final int getNumber() {
        return this.f49699h;
    }

    public final String toString() {
        return Integer.toString(this.f49699h);
    }
}
