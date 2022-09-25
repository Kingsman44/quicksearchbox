package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bb */
/* compiled from: PG */
public enum C134564bb implements C62957cd {
    UNKNOWN(0),
    CLEAR_ALL(1),
    UPDATE_OR_APPEND(2),
    REMOVE(3),
    REQUIRED(4);
    

    /* renamed from: f */
    public final int f366469f;

    private C134564bb(int i) {
        this.f366469f = i;
    }

    /* renamed from: a */
    public static C134564bb m218286a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CLEAR_ALL;
        }
        if (i == 2) {
            return UPDATE_OR_APPEND;
        }
        if (i == 3) {
            return REMOVE;
        }
        if (i != 4) {
            return null;
        }
        return REQUIRED;
    }

    /* renamed from: b */
    public static C62959cf m218287b() {
        return C134563ba.f366462a;
    }

    public final int getNumber() {
        return this.f366469f;
    }

    public final String toString() {
        return Integer.toString(this.f366469f);
    }
}
