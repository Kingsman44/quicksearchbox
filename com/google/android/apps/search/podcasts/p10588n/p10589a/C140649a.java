package com.google.android.apps.search.podcasts.p10588n.p10589a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.podcasts.n.a.a */
/* compiled from: PG */
public enum C140649a implements C62957cd {
    PUBLICATION_DATE_DESC(0),
    PUBLICATION_DATE_ASC(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f382021d;

    private C140649a(int i) {
        this.f382021d = i;
    }

    /* renamed from: a */
    public static C140649a m228441a(int i) {
        if (i == 0) {
            return PUBLICATION_DATE_DESC;
        }
        if (i != 1) {
            return null;
        }
        return PUBLICATION_DATE_ASC;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f382021d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
