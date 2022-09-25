package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.cx */
/* compiled from: PG */
public enum C135022cx implements C62957cd {
    MAIN_FEED(1),
    SECOND_SCREEN(2),
    FULL_COVERAGE(3),
    CHANNELS(4),
    RELATED_VIDEOS(5);
    

    /* renamed from: f */
    public final int f367686f;

    private C135022cx(int i) {
        this.f367686f = i;
    }

    /* renamed from: a */
    public static C135022cx m218950a(int i) {
        if (i == 1) {
            return MAIN_FEED;
        }
        if (i == 2) {
            return SECOND_SCREEN;
        }
        if (i == 3) {
            return FULL_COVERAGE;
        }
        if (i == 4) {
            return CHANNELS;
        }
        if (i != 5) {
            return null;
        }
        return RELATED_VIDEOS;
    }

    /* renamed from: b */
    public static C62959cf m218951b() {
        return C135021cw.f367679a;
    }

    public final int getNumber() {
        return this.f367686f;
    }

    public final String toString() {
        return Integer.toString(this.f367686f);
    }
}
