package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.e.h */
/* compiled from: PG */
public enum C127929h implements C62957cd {
    UNKNOWN(0),
    EXPERIMENT_FLAG_DISABLED(1),
    CONTINUED_CONVERSATION_ENABLED(2),
    LOCALE_INVALID(3),
    ACCESSIBILITY_MANAGER_AND_SERVICES_REQUIRING_EARCON_ENABLED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f352145g;

    private C127929h(int i) {
        this.f352145g = i;
    }

    /* renamed from: a */
    public static C127929h m209048a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return EXPERIMENT_FLAG_DISABLED;
        }
        if (i == 2) {
            return CONTINUED_CONVERSATION_ENABLED;
        }
        if (i == 3) {
            return LOCALE_INVALID;
        }
        if (i != 4) {
            return null;
        }
        return ACCESSIBILITY_MANAGER_AND_SERVICES_REQUIRING_EARCON_ENABLED;
    }

    /* renamed from: b */
    public static C62959cf m209049b() {
        return C127928g.f352137a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f352145g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
