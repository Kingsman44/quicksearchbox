package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.podcasts.l.u */
/* compiled from: PG */
public enum C140509u implements C62957cd {
    AUTOPLAY_DEFAULT(0),
    AUTOPLAY_SHOW(1),
    AUTOPLAY_DOWNLOAD(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f381635e;

    private C140509u(int i) {
        this.f381635e = i;
    }

    /* renamed from: a */
    public static C140509u m228215a(int i) {
        if (i == 0) {
            return AUTOPLAY_DEFAULT;
        }
        if (i == 1) {
            return AUTOPLAY_SHOW;
        }
        if (i != 2) {
            return null;
        }
        return AUTOPLAY_DOWNLOAD;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f381635e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
