package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.gl */
/* compiled from: PG */
public enum C37633gl implements C62957cd {
    AUDIOTACTILE_FEEDBACK_STATUS_UNKNOWN(0),
    AUDIOTACTILE_FEEDBACK_STATUS_SUCCESS(1),
    AUDIOTACTILE_FEEDBACK_STATUS_FAILURE_INVALID_PARAMS(2);
    

    /* renamed from: d */
    public final int f100000d;

    private C37633gl(int i) {
        this.f100000d = i;
    }

    /* renamed from: a */
    public static C37633gl m66602a(int i) {
        if (i == 0) {
            return AUDIOTACTILE_FEEDBACK_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return AUDIOTACTILE_FEEDBACK_STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return AUDIOTACTILE_FEEDBACK_STATUS_FAILURE_INVALID_PARAMS;
    }

    /* renamed from: b */
    public static C62959cf m66603b() {
        return C37632gk.f99995a;
    }

    public final int getNumber() {
        return this.f100000d;
    }

    public final String toString() {
        return Integer.toString(this.f100000d);
    }
}
