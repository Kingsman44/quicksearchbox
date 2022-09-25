package com.google.android.apps.search.googleapp.search.srp.error;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.w */
/* compiled from: PG */
public enum C137824w implements C62957cd {
    ERROR_REQUEST_DATA_UNAVAILABLE(1),
    ERROR_VS_MIC_PERMISSION(2),
    ERROR_VOICE_SEARCH_NO_CONNECTIVITY(3);
    

    /* renamed from: d */
    public static final C62958ce f374968d = null;

    /* renamed from: e */
    private final int f374970e;

    static {
        f374968d = new C137823v();
    }

    private C137824w(int i) {
        this.f374970e = i;
    }

    /* renamed from: a */
    public static C137824w m224056a(int i) {
        if (i == 1) {
            return ERROR_REQUEST_DATA_UNAVAILABLE;
        }
        if (i == 2) {
            return ERROR_VS_MIC_PERMISSION;
        }
        if (i != 3) {
            return null;
        }
        return ERROR_VOICE_SEARCH_NO_CONNECTIVITY;
    }

    public final int getNumber() {
        return this.f374970e;
    }

    public final String toString() {
        return Integer.toString(this.f374970e);
    }
}
