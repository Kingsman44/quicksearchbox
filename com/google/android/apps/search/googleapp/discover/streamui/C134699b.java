package com.google.android.apps.search.googleapp.discover.streamui;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.b */
/* compiled from: PG */
public enum C134699b implements C62957cd {
    CLEARCUT_EVENT_TYPE_UNSPECIFIED(0),
    MAIN_FEED(1),
    CHANNEL(2);
    

    /* renamed from: d */
    public final int f366817d;

    private C134699b(int i) {
        this.f366817d = i;
    }

    /* renamed from: a */
    public static C134699b m218534a(int i) {
        if (i == 0) {
            return CLEARCUT_EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return MAIN_FEED;
        }
        if (i != 2) {
            return null;
        }
        return CHANNEL;
    }

    /* renamed from: b */
    public static C62959cf m218535b() {
        return C134694a.f366801a;
    }

    public final int getNumber() {
        return this.f366817d;
    }

    public final String toString() {
        return Integer.toString(this.f366817d);
    }
}
