package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.air */
/* compiled from: PG */
public enum air implements C62957cd {
    UNKNOWN(0),
    COPY_DEVICE_CONTACT_FOR_SPEEDDIAL(1),
    COPY_DEVICE_CONTACT_FOR_FAMILY_GROUP(2),
    COPY_PROFILE_DATA_FOR_SPEEDDIAL(3);
    

    /* renamed from: e */
    public final int f129426e;

    private air(int i) {
        this.f129426e = i;
    }

    /* renamed from: a */
    public static air m85751a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return COPY_DEVICE_CONTACT_FOR_SPEEDDIAL;
        }
        if (i == 2) {
            return COPY_DEVICE_CONTACT_FOR_FAMILY_GROUP;
        }
        if (i != 3) {
            return null;
        }
        return COPY_PROFILE_DATA_FOR_SPEEDDIAL;
    }

    /* renamed from: b */
    public static C62959cf m85752b() {
        return aiq.f129420a;
    }

    public final int getNumber() {
        return this.f129426e;
    }

    public final String toString() {
        return Integer.toString(this.f129426e);
    }
}
