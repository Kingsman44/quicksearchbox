package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.oj */
/* compiled from: PG */
public enum C51618oj implements C62957cd {
    UNKNOWN_TRIGGER_TYPE(0),
    HOTWORD(1),
    GAZE(2),
    TOUCH(3),
    HOTQUERY(4),
    APP_INITIATED(5),
    CONTINUED_CONVERSATION(6);
    

    /* renamed from: h */
    public final int f134529h;

    private C51618oj(int i) {
        this.f134529h = i;
    }

    /* renamed from: a */
    public static C51618oj m86252a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TRIGGER_TYPE;
            case 1:
                return HOTWORD;
            case 2:
                return GAZE;
            case 3:
                return TOUCH;
            case 4:
                return HOTQUERY;
            case 5:
                return APP_INITIATED;
            case 6:
                return CONTINUED_CONVERSATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86253b() {
        return C51617oi.f134520a;
    }

    public final int getNumber() {
        return this.f134529h;
    }

    public final String toString() {
        return Integer.toString(this.f134529h);
    }
}
