package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.d.f */
/* compiled from: PG */
public enum C128541f implements C62957cd {
    WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED(0),
    NOT_LISTENING(1),
    LISTENING(2),
    RECOGNIZING(3),
    ANSWERING(4);
    

    /* renamed from: f */
    public final int f353463f;

    private C128541f(int i) {
        this.f353463f = i;
    }

    /* renamed from: a */
    public static C128541f m209785a(int i) {
        if (i == 0) {
            return WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return NOT_LISTENING;
        }
        if (i == 2) {
            return LISTENING;
        }
        if (i == 3) {
            return RECOGNIZING;
        }
        if (i != 4) {
            return null;
        }
        return ANSWERING;
    }

    /* renamed from: b */
    public static C62959cf m209786b() {
        return C128540e.f353456a;
    }

    public final int getNumber() {
        return this.f353463f;
    }

    public final String toString() {
        return Integer.toString(this.f353463f);
    }
}
