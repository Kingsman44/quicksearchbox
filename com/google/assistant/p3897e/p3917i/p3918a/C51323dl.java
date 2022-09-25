package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.dl */
/* compiled from: PG */
public enum C51323dl implements C62957cd {
    UNSPECIFIED_PROJECTION_STATE(0),
    PROJECTION_STATE_INACTIVE(1),
    PROJECTION_STATE_READY_TO_PROJECT(2),
    PROJECTION_STATE_ACTIVE_FOREGROUND(3),
    PROJECTION_STATE_ACTIVE_BACKGROUND(4);
    

    /* renamed from: f */
    public final int f133626f;

    private C51323dl(int i) {
        this.f133626f = i;
    }

    /* renamed from: a */
    public static C51323dl m86129a(int i) {
        if (i == 0) {
            return UNSPECIFIED_PROJECTION_STATE;
        }
        if (i == 1) {
            return PROJECTION_STATE_INACTIVE;
        }
        if (i == 2) {
            return PROJECTION_STATE_READY_TO_PROJECT;
        }
        if (i == 3) {
            return PROJECTION_STATE_ACTIVE_FOREGROUND;
        }
        if (i != 4) {
            return null;
        }
        return PROJECTION_STATE_ACTIVE_BACKGROUND;
    }

    /* renamed from: b */
    public static C62959cf m86130b() {
        return C51322dk.f133619a;
    }

    public final int getNumber() {
        return this.f133626f;
    }

    public final String toString() {
        return Integer.toString(this.f133626f);
    }
}
