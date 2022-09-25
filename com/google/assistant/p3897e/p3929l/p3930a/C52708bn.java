package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.l.a.bn */
/* compiled from: PG */
public enum C52708bn implements C62957cd {
    BT_TRIGGER_UNKNOWN_STATE(0),
    BT_TRIGGER_DEFAULT(1),
    BT_TRIGGER_USER_ENABLED(2),
    BT_TRIGGER_USER_DISABLED(3),
    BT_TRIGGER_USER_ENABLED_ASK(4),
    BT_TRIGGER_USER_ENABLED_AUTO(5);
    

    /* renamed from: g */
    public final int f138363g;

    private C52708bn(int i) {
        this.f138363g = i;
    }

    /* renamed from: a */
    public static C52708bn m86698a(int i) {
        if (i == 0) {
            return BT_TRIGGER_UNKNOWN_STATE;
        }
        if (i == 1) {
            return BT_TRIGGER_DEFAULT;
        }
        if (i == 2) {
            return BT_TRIGGER_USER_ENABLED;
        }
        if (i == 3) {
            return BT_TRIGGER_USER_DISABLED;
        }
        if (i == 4) {
            return BT_TRIGGER_USER_ENABLED_ASK;
        }
        if (i != 5) {
            return null;
        }
        return BT_TRIGGER_USER_ENABLED_AUTO;
    }

    /* renamed from: b */
    public static C62959cf m86699b() {
        return C52707bm.f138355a;
    }

    public final int getNumber() {
        return this.f138363g;
    }

    public final String toString() {
        return Integer.toString(this.f138363g);
    }
}
