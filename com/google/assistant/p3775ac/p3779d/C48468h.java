package com.google.assistant.p3775ac.p3779d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ac.d.h */
/* compiled from: PG */
public enum C48468h implements C62957cd {
    UNKNOWN_MODE(0),
    NEW_USER_INPUT_PLATE(1),
    ACTIVATED_USER_INPUT_PLATE(2),
    OVERAPP_SUGGESTION_INPUT_PLATE(3),
    NOTIFICATION_SUGGESTION(4),
    WARMER_WELCOME_FRAME(5),
    HANDS_FREE_SUGGESTION(6);
    

    /* renamed from: h */
    public final int f125214h;

    private C48468h(int i) {
        this.f125214h = i;
    }

    /* renamed from: a */
    public static C48468h m85227a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MODE;
            case 1:
                return NEW_USER_INPUT_PLATE;
            case 2:
                return ACTIVATED_USER_INPUT_PLATE;
            case 3:
                return OVERAPP_SUGGESTION_INPUT_PLATE;
            case 4:
                return NOTIFICATION_SUGGESTION;
            case 5:
                return WARMER_WELCOME_FRAME;
            case 6:
                return HANDS_FREE_SUGGESTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85228b() {
        return C48467g.f125205a;
    }

    public final int getNumber() {
        return this.f125214h;
    }

    public final String toString() {
        return Integer.toString(this.f125214h);
    }
}
