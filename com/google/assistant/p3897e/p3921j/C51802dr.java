package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.dr */
/* compiled from: PG */
public enum C51802dr implements C62957cd {
    ALL_YOUTUBE_CONTENT(1),
    NO_RESTRICTED_CONTENT(2);
    

    /* renamed from: c */
    public final int f135922c;

    private C51802dr(int i) {
        this.f135922c = i;
    }

    /* renamed from: a */
    public static C51802dr m86386a(int i) {
        if (i == 1) {
            return ALL_YOUTUBE_CONTENT;
        }
        if (i != 2) {
            return null;
        }
        return NO_RESTRICTED_CONTENT;
    }

    /* renamed from: b */
    public static C62959cf m86387b() {
        return C51801dq.f135918a;
    }

    public final int getNumber() {
        return this.f135922c;
    }

    public final String toString() {
        return Integer.toString(this.f135922c);
    }
}
