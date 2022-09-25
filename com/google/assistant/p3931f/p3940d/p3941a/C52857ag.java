package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.f.d.a.ag */
/* compiled from: PG */
public enum C52857ag implements C62957cd {
    UNSPECIFIED(0),
    MOBILE(1),
    ANDROID_AUTO(2),
    WEAR_OS(3),
    SPEAKER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f138676g;

    private C52857ag(int i) {
        this.f138676g = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f138676g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
