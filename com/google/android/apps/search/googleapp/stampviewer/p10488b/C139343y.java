package com.google.android.apps.search.googleapp.stampviewer.p10488b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.y */
/* compiled from: PG */
public enum C139343y implements C62957cd {
    VIEWER_MODE_UNSPECIFIED(0),
    VIEWER_MODE_FULLSCREEN(1),
    VIEWER_MODE_INLINE(2);
    

    /* renamed from: d */
    public final int f378967d;

    private C139343y(int i) {
        this.f378967d = i;
    }

    /* renamed from: a */
    public static C139343y m226483a(int i) {
        if (i == 0) {
            return VIEWER_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return VIEWER_MODE_FULLSCREEN;
        }
        if (i != 2) {
            return null;
        }
        return VIEWER_MODE_INLINE;
    }

    /* renamed from: b */
    public static C62959cf m226484b() {
        return C139342x.f378962a;
    }

    public final int getNumber() {
        return this.f378967d;
    }

    public final String toString() {
        return Integer.toString(this.f378967d);
    }
}
