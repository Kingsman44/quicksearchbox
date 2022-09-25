package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.b */
/* compiled from: PG */
public enum C80422b implements C62957cd {
    UNKNOWN_CONTEXT_TYPE(0),
    ISSUED_QUERY(1),
    QUERY_ANSWER(2),
    SCREEN_CONTEXT(3),
    SEARCH_BOX(4);
    

    /* renamed from: f */
    public final int f220735f;

    private C80422b(int i) {
        this.f220735f = i;
    }

    /* renamed from: a */
    public static C80422b m128155a(int i) {
        if (i == 0) {
            return UNKNOWN_CONTEXT_TYPE;
        }
        if (i == 1) {
            return ISSUED_QUERY;
        }
        if (i == 2) {
            return QUERY_ANSWER;
        }
        if (i == 3) {
            return SCREEN_CONTEXT;
        }
        if (i != 4) {
            return null;
        }
        return SEARCH_BOX;
    }

    /* renamed from: b */
    public static C62959cf m128156b() {
        return C80408a.f220682a;
    }

    public final int getNumber() {
        return this.f220735f;
    }

    public final String toString() {
        return Integer.toString(this.f220735f);
    }
}
