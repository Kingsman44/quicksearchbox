package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.profile.a.b.a.av */
/* compiled from: PG */
public enum C44009av implements C62957cd {
    UNDEFINED(0),
    SHORT(1),
    STANDARD(2),
    NEVER(3),
    NONE(4);
    

    /* renamed from: f */
    public final int f114561f;

    private C44009av(int i) {
        this.f114561f = i;
    }

    /* renamed from: a */
    public static C44009av m77693a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return SHORT;
        }
        if (i == 2) {
            return STANDARD;
        }
        if (i == 3) {
            return NEVER;
        }
        if (i != 4) {
            return null;
        }
        return NONE;
    }

    /* renamed from: b */
    public static C62959cf m77694b() {
        return C44008au.f114554a;
    }

    public final int getNumber() {
        return this.f114561f;
    }

    public final String toString() {
        return Integer.toString(this.f114561f);
    }
}
