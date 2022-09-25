package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fj */
/* compiled from: PG */
public enum C14334fj implements C62957cd {
    UNSPECIFIED_MEDIA_TILE_SUB_TYPE(0),
    MEDIA_COMPACT(1),
    MEDIA_EXPANDED(2),
    MEDIA_LOADING_COMPACT(3),
    MEDIA_LOADING_EXPANDED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f43376g;

    private C14334fj(int i) {
        this.f43376g = i;
    }

    /* renamed from: a */
    public static C14334fj m30610a(int i) {
        if (i == 0) {
            return UNSPECIFIED_MEDIA_TILE_SUB_TYPE;
        }
        if (i == 1) {
            return MEDIA_COMPACT;
        }
        if (i == 2) {
            return MEDIA_EXPANDED;
        }
        if (i == 3) {
            return MEDIA_LOADING_COMPACT;
        }
        if (i != 4) {
            return null;
        }
        return MEDIA_LOADING_EXPANDED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43376g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
