package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.z */
/* compiled from: PG */
public enum C38284z implements C62957cd {
    UNSET_END_OF_DATA_STATUS(0),
    SUCCESS(1);
    

    /* renamed from: c */
    public final int f101427c;

    private C38284z(int i) {
        this.f101427c = i;
    }

    /* renamed from: a */
    public static C38284z m67597a(int i) {
        if (i == 0) {
            return UNSET_END_OF_DATA_STATUS;
        }
        if (i != 1) {
            return null;
        }
        return SUCCESS;
    }

    /* renamed from: b */
    public static C62959cf m67598b() {
        return C38268y.f101383a;
    }

    public final int getNumber() {
        return this.f101427c;
    }

    public final String toString() {
        return Integer.toString(this.f101427c);
    }
}
