package com.google.android.libraries.search.p2904c;

/* renamed from: com.google.android.libraries.search.c.bq */
/* compiled from: PG */
public final class C37412bq {
    /* renamed from: a */
    public static /* synthetic */ String m66436a(int i) {
        return i != 1 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? "null" : "DEACTIVATED_CLIENT_REQUESTED" : "DEACTIVATED_NEW_CLIENT" : "FAILED_DEACTIVATING_GRPC_STATUS_NOT_RECEIVED" : "FAILED_DEACTIVATING_DUE_TO_INACTIVE_CLIENT" : "UNKNOWN_DEACTIVATING_STATUS";
    }

    /* renamed from: b */
    public static int m66437b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 5) {
            return i != 6 ? 0 : 7;
        }
        return 6;
    }
}
