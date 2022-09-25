package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.g.b.a.h */
/* compiled from: PG */
public enum C52943h implements C62957cd {
    EXECUTION_MODE_UNKNOWN(0),
    EXECUTION_MODE_ANDROID_INTENT(1),
    EXECUTION_MODE_ANDROID_INTENT_WEB_LINK(2),
    EXECUTION_MODE_BUILT_IN_INTENT(3),
    EXECUTION_MODE_REMOTE_ACTIONS(4);
    

    /* renamed from: f */
    public final int f138822f;

    private C52943h(int i) {
        this.f138822f = i;
    }

    /* renamed from: a */
    public static C52943h m86756a(int i) {
        if (i == 0) {
            return EXECUTION_MODE_UNKNOWN;
        }
        if (i == 1) {
            return EXECUTION_MODE_ANDROID_INTENT;
        }
        if (i == 2) {
            return EXECUTION_MODE_ANDROID_INTENT_WEB_LINK;
        }
        if (i == 3) {
            return EXECUTION_MODE_BUILT_IN_INTENT;
        }
        if (i != 4) {
            return null;
        }
        return EXECUTION_MODE_REMOTE_ACTIONS;
    }

    /* renamed from: b */
    public static C62959cf m86757b() {
        return C52942g.f138815a;
    }

    public final int getNumber() {
        return this.f138822f;
    }

    public final String toString() {
        return Integer.toString(this.f138822f);
    }
}
