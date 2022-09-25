package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.ci */
/* compiled from: PG */
public enum C49878ci implements C62957cd {
    USER_TYPE_UNKNOWN(0),
    FIRST_USER(1),
    NOT_FIRST_USER(2);
    

    /* renamed from: d */
    public final int f129627d;

    private C49878ci(int i) {
        this.f129627d = i;
    }

    /* renamed from: a */
    public static C49878ci m85757a(int i) {
        if (i == 0) {
            return USER_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return FIRST_USER;
        }
        if (i != 2) {
            return null;
        }
        return NOT_FIRST_USER;
    }

    /* renamed from: b */
    public static C62959cf m85758b() {
        return C49877ch.f129622a;
    }

    public final int getNumber() {
        return this.f129627d;
    }

    public final String toString() {
        return Integer.toString(this.f129627d);
    }
}
