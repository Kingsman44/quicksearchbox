package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.aq */
/* compiled from: PG */
public enum C39267aq implements C62957cd {
    UNSPECIFIED(0),
    AUDIO_ERROR(1),
    SODA_ERROR(2),
    INVALID_REQUEST(3);
    

    /* renamed from: e */
    public final int f103438e;

    private C39267aq(int i) {
        this.f103438e = i;
    }

    /* renamed from: a */
    public static C39267aq m68687a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return AUDIO_ERROR;
        }
        if (i == 2) {
            return SODA_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return INVALID_REQUEST;
    }

    /* renamed from: b */
    public static C62959cf m68688b() {
        return C39266ap.f103432a;
    }

    public final int getNumber() {
        return this.f103438e;
    }

    public final String toString() {
        return Integer.toString(this.f103438e);
    }
}
