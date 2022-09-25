package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.ei */
/* compiled from: PG */
public enum C51347ei implements C62957cd {
    UNKNOWN_POSITIONAL_ATTRIBUTE(0),
    ZERO_VELOCITY(1),
    FACE_DOWN(2),
    IN_HAND_AT_EAR(3),
    IN_HAND_FOR_DICTATION(4),
    IN_HAND_GENERAL_USE(5),
    IN_HAND_DANGLING_ON_THE_SIDE(6),
    IN_POCKET_OR_BAG(7);
    

    /* renamed from: i */
    public final int f133743i;

    private C51347ei(int i) {
        this.f133743i = i;
    }

    /* renamed from: a */
    public static C51347ei m86143a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_POSITIONAL_ATTRIBUTE;
            case 1:
                return ZERO_VELOCITY;
            case 2:
                return FACE_DOWN;
            case 3:
                return IN_HAND_AT_EAR;
            case 4:
                return IN_HAND_FOR_DICTATION;
            case 5:
                return IN_HAND_GENERAL_USE;
            case 6:
                return IN_HAND_DANGLING_ON_THE_SIDE;
            case 7:
                return IN_POCKET_OR_BAG;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86144b() {
        return C51346eh.f133733a;
    }

    public final int getNumber() {
        return this.f133743i;
    }

    public final String toString() {
        return Integer.toString(this.f133743i);
    }
}
