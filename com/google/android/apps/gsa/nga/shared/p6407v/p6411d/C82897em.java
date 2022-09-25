package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.em */
/* compiled from: PG */
public enum C82897em implements C62957cd {
    UNSPECIFIED(0),
    SUCCESS(1),
    FAILURE(2),
    CANCEL(3),
    POSTPONED(4);
    

    /* renamed from: f */
    public final int f226123f;

    private C82897em(int i) {
        this.f226123f = i;
    }

    /* renamed from: a */
    public static C82897em m132419a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return FAILURE;
        }
        if (i == 3) {
            return CANCEL;
        }
        if (i != 4) {
            return null;
        }
        return POSTPONED;
    }

    /* renamed from: b */
    public static C62959cf m132420b() {
        return C82896el.f226116a;
    }

    public final int getNumber() {
        return this.f226123f;
    }

    public final String toString() {
        return Integer.toString(this.f226123f);
    }
}
