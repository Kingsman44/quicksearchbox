package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.d */
/* compiled from: PG */
public enum C80501d implements C62957cd {
    UNKNOWN(0),
    SUGGESTION(1),
    KEYBOARD_INPUT(2),
    FLUID_ACTION(3),
    LOCKED_SCREEN(4),
    MESSAGE_NOTIFICATION(5),
    TITAN_VOICE_PLATE(6);
    

    /* renamed from: h */
    public final int f220989h;

    private C80501d(int i) {
        this.f220989h = i;
    }

    /* renamed from: a */
    public static C80501d m128182a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SUGGESTION;
            case 2:
                return KEYBOARD_INPUT;
            case 3:
                return FLUID_ACTION;
            case 4:
                return LOCKED_SCREEN;
            case 5:
                return MESSAGE_NOTIFICATION;
            case 6:
                return TITAN_VOICE_PLATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128183b() {
        return C80500c.f220980a;
    }

    public final int getNumber() {
        return this.f220989h;
    }

    public final String toString() {
        return Integer.toString(this.f220989h);
    }
}
