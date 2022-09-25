package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.ay */
/* compiled from: PG */
public enum C51697ay implements C62957cd {
    SURROUNDING_USERS(1),
    AUTHENTICATED_USER_ONLY(2);
    

    /* renamed from: c */
    public final int f135627c;

    private C51697ay(int i) {
        this.f135627c = i;
    }

    /* renamed from: a */
    public static C51697ay m86363a(int i) {
        if (i == 1) {
            return SURROUNDING_USERS;
        }
        if (i != 2) {
            return null;
        }
        return AUTHENTICATED_USER_ONLY;
    }

    /* renamed from: b */
    public static C62959cf m86364b() {
        return C51696ax.f135623a;
    }

    public final int getNumber() {
        return this.f135627c;
    }

    public final String toString() {
        return Integer.toString(this.f135627c);
    }
}
