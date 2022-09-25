package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nb */
/* compiled from: PG */
public enum C14542nb implements C62957cd {
    UNKNOWN_TYPE(0),
    MEDIA(1),
    CALL(2),
    ONGOING_CALL(3),
    MESSAGE(4),
    NAVIGATION(5),
    LIVE_MAP(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f43993i;

    private C14542nb(int i) {
        this.f43993i = i;
    }

    /* renamed from: a */
    public static C14542nb m30637a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return MEDIA;
        }
        if (i == 2) {
            return CALL;
        }
        if (i == 3) {
            return ONGOING_CALL;
        }
        if (i == 4) {
            return MESSAGE;
        }
        if (i == 5) {
            return NAVIGATION;
        }
        if (i != 7) {
            return null;
        }
        return LIVE_MAP;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43993i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
