package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.kw */
/* compiled from: PG */
public enum C52252kw implements C62957cd {
    STATE_SYNC_METHOD_UNSPECIFIED(0),
    DIALOG_STATE_PARAMS(1);
    

    /* renamed from: c */
    public final int f137129c;

    private C52252kw(int i) {
        this.f137129c = i;
    }

    /* renamed from: a */
    public static C52252kw m86553a(int i) {
        if (i == 0) {
            return STATE_SYNC_METHOD_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return DIALOG_STATE_PARAMS;
    }

    /* renamed from: b */
    public static C62959cf m86554b() {
        return C52251kv.f137125a;
    }

    public final int getNumber() {
        return this.f137129c;
    }

    public final String toString() {
        return Integer.toString(this.f137129c);
    }
}
