package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.de */
/* compiled from: PG */
public enum C50808de implements C62957cd {
    MATCH_TARGET_UNSPECIFIED(0),
    NOTIFICATION_TITLE(1),
    NOTIFICATION_TEXT(2);
    

    /* renamed from: d */
    public final int f132262d;

    private C50808de(int i) {
        this.f132262d = i;
    }

    /* renamed from: a */
    public static C50808de m85945a(int i) {
        if (i == 0) {
            return MATCH_TARGET_UNSPECIFIED;
        }
        if (i == 1) {
            return NOTIFICATION_TITLE;
        }
        if (i != 2) {
            return null;
        }
        return NOTIFICATION_TEXT;
    }

    /* renamed from: b */
    public static C62959cf m85946b() {
        return C50807dd.f132257a;
    }

    public final int getNumber() {
        return this.f132262d;
    }

    public final String toString() {
        return Integer.toString(this.f132262d);
    }
}
