package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.u */
/* compiled from: PG */
public enum C80587u implements C62957cd {
    CLICK_DEFAULT(0),
    CLICK_WHOLE_PLATE(1),
    CLICK_SUGGESTION_TEXT_SECOND_LINE_ONLY(2),
    CLICK_DISABLED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f221219f;

    private C80587u(int i) {
        this.f221219f = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221219f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
