package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.dg */
/* compiled from: PG */
public enum C50810dg implements C62957cd {
    REGEX_MATCH_TYPE_UNSPECIFIED(0),
    CONTAINS_MATCH(1),
    MATCH_ENTIRE(2);
    

    /* renamed from: d */
    public final int f132268d;

    private C50810dg(int i) {
        this.f132268d = i;
    }

    /* renamed from: a */
    public static C50810dg m85947a(int i) {
        if (i == 0) {
            return REGEX_MATCH_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CONTAINS_MATCH;
        }
        if (i != 2) {
            return null;
        }
        return MATCH_ENTIRE;
    }

    /* renamed from: b */
    public static C62959cf m85948b() {
        return C50809df.f132263a;
    }

    public final int getNumber() {
        return this.f132268d;
    }

    public final String toString() {
        return Integer.toString(this.f132268d);
    }
}
