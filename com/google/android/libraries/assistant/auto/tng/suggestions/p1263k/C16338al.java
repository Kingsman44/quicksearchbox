package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.al */
/* compiled from: PG */
public enum C16338al implements C62957cd {
    NOTIFICATION_CATEGORY_UNKNOWN(0),
    NOTIFICATION_CATEGORY_MESSAGE(1),
    NOTIFICATION_CATEGORY_CALL(2);
    

    /* renamed from: d */
    public final int f48108d;

    private C16338al(int i) {
        this.f48108d = i;
    }

    /* renamed from: a */
    public static C16338al m33335a(int i) {
        if (i == 0) {
            return NOTIFICATION_CATEGORY_UNKNOWN;
        }
        if (i == 1) {
            return NOTIFICATION_CATEGORY_MESSAGE;
        }
        if (i != 2) {
            return null;
        }
        return NOTIFICATION_CATEGORY_CALL;
    }

    /* renamed from: b */
    public static C62959cf m33336b() {
        return C16337ak.f48103a;
    }

    public final int getNumber() {
        return this.f48108d;
    }

    public final String toString() {
        return Integer.toString(this.f48108d);
    }
}
