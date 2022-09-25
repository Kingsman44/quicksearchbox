package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lo */
/* compiled from: PG */
public enum C14501lo implements C62957cd {
    UNSPECIFIED_NAVIGATION_TILE_SUB_TYPE(0),
    DESTINATION_SUGGESTION_COMPACT(1),
    DESTINATION_SUGGESTION_COMPACT_LOADING(2),
    DESTINATION_SUGGESTION_EXPANDED(3),
    DESTINATION_SUGGESTION_EXPANDED_LOADING(4),
    DESTINATION_SEARCH(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f43871h;

    private C14501lo(int i) {
        this.f43871h = i;
    }

    /* renamed from: a */
    public static C14501lo m30628a(int i) {
        if (i == 0) {
            return UNSPECIFIED_NAVIGATION_TILE_SUB_TYPE;
        }
        if (i == 1) {
            return DESTINATION_SUGGESTION_COMPACT;
        }
        if (i == 2) {
            return DESTINATION_SUGGESTION_COMPACT_LOADING;
        }
        if (i == 3) {
            return DESTINATION_SUGGESTION_EXPANDED;
        }
        if (i == 4) {
            return DESTINATION_SUGGESTION_EXPANDED_LOADING;
        }
        if (i != 5) {
            return null;
        }
        return DESTINATION_SEARCH;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43871h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
