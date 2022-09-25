package com.google.android.gms.p10747b.p10748a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.gms.b.a.b */
/* compiled from: PG */
public enum C142954b implements C62957cd {
    UNSPECIFIED_FIX(0),
    DO_NOTHING(1),
    TEST_ONLY_FIX(2),
    FILE_DELETION(3),
    EXEC_SQL_FIX(4),
    SEND_BROADCAST(5),
    WEBVIEW_SAFEMODE_FIX(6),
    LOCAL_APP_ERROR(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f387880j;

    private C142954b(int i) {
        this.f387880j = i;
    }

    /* renamed from: a */
    public static C142954b m231901a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_FIX;
            case 1:
                return DO_NOTHING;
            case 2:
                return TEST_ONLY_FIX;
            case 3:
                return FILE_DELETION;
            case 4:
                return EXEC_SQL_FIX;
            case 5:
                return SEND_BROADCAST;
            case 6:
                return WEBVIEW_SAFEMODE_FIX;
            case 7:
                return LOCAL_APP_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m231902b() {
        return C142953a.f387869a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f387880j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
