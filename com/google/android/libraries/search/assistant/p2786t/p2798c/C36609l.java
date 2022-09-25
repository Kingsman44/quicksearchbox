package com.google.android.libraries.search.assistant.p2786t.p2798c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.t.c.l */
/* compiled from: PG */
public enum C36609l implements C62957cd {
    NOTIFICATION_OBSERVER_UNKNOWN(0),
    NOTIFICATION_OBSERVER_AUTO_SUGGESTIONS(1),
    NOTIFICATION_OBSERVER_MORRIS(2),
    NOTIFICATION_OBSERVER_AUTO_READ(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f95451f;

    private C36609l(int i) {
        this.f95451f = i;
    }

    /* renamed from: a */
    public static C36609l m65137a(int i) {
        if (i == 0) {
            return NOTIFICATION_OBSERVER_UNKNOWN;
        }
        if (i == 1) {
            return NOTIFICATION_OBSERVER_AUTO_SUGGESTIONS;
        }
        if (i == 2) {
            return NOTIFICATION_OBSERVER_MORRIS;
        }
        if (i != 3) {
            return null;
        }
        return NOTIFICATION_OBSERVER_AUTO_READ;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f95451f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
