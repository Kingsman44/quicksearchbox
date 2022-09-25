package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bj */
/* compiled from: PG */
public enum C134572bj implements C62957cd {
    UNDEFINED_ROLE(0),
    STRUCTURE_MODIFICATION(1),
    CONTENT(2),
    TOKEN(3),
    REQUIRED_CONTENT(4),
    ROOT(5),
    NON_ROOT_STREAM(8);
    

    /* renamed from: h */
    public final int f366496h;

    private C134572bj(int i) {
        this.f366496h = i;
    }

    /* renamed from: a */
    public static C134572bj m218290a(int i) {
        if (i == 0) {
            return UNDEFINED_ROLE;
        }
        if (i == 1) {
            return STRUCTURE_MODIFICATION;
        }
        if (i == 2) {
            return CONTENT;
        }
        if (i == 3) {
            return TOKEN;
        }
        if (i == 4) {
            return REQUIRED_CONTENT;
        }
        if (i == 5) {
            return ROOT;
        }
        if (i != 8) {
            return null;
        }
        return NON_ROOT_STREAM;
    }

    /* renamed from: b */
    public static C62959cf m218291b() {
        return C134571bi.f366487a;
    }

    public final int getNumber() {
        return this.f366496h;
    }

    public final String toString() {
        return Integer.toString(this.f366496h);
    }
}
