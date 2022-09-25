package com.google.knowledge.p4671b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.knowledge.b.ax */
/* compiled from: PG */
public enum C61805ax implements C62957cd {
    UNKNOWN(0),
    SMS_MESSAGE(1),
    CHAT_MESSAGE(2),
    GROUP_CHAT_MESSAGE(3);
    

    /* renamed from: e */
    public final int f166955e;

    private C61805ax(int i) {
        this.f166955e = i;
    }

    /* renamed from: a */
    public static C61805ax m94466a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SMS_MESSAGE;
        }
        if (i == 2) {
            return CHAT_MESSAGE;
        }
        if (i != 3) {
            return null;
        }
        return GROUP_CHAT_MESSAGE;
    }

    /* renamed from: b */
    public static C62959cf m94467b() {
        return C61804aw.f166949a;
    }

    public final int getNumber() {
        return this.f166955e;
    }

    public final String toString() {
        return Integer.toString(this.f166955e);
    }
}
