package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ad.a.a.a.a.b.a.b.a.a.b */
/* compiled from: PG */
public enum C63124b implements C62957cd {
    UNKNOWN(0),
    TRY_DICTATION(1),
    STICKY_MIC(2),
    ACTION_BUTTONS(3),
    VOICE_CORRECTION(4),
    HEYG_TYPE(5),
    ACTION_BUTTON_SAY_PREFIX(6),
    OVERLAY_LEARNING_CENTER(7),
    STOP_CHIP(8),
    CLEAR_ALL_CHIP(9),
    SPELL_IT_OUT(10),
    EMOJI_SUGGESTION_CHIP(11),
    UNRECOGNIZED(-1);
    

    /* renamed from: n */
    private final int f170458n;

    private C63124b(int i) {
        this.f170458n = i;
    }

    /* renamed from: a */
    public static C63124b m96184a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TRY_DICTATION;
            case 2:
                return STICKY_MIC;
            case 3:
                return ACTION_BUTTONS;
            case 4:
                return VOICE_CORRECTION;
            case 5:
                return HEYG_TYPE;
            case 6:
                return ACTION_BUTTON_SAY_PREFIX;
            case 7:
                return OVERLAY_LEARNING_CENTER;
            case 8:
                return STOP_CHIP;
            case 9:
                return CLEAR_ALL_CHIP;
            case 10:
                return SPELL_IT_OUT;
            case 11:
                return EMOJI_SUGGESTION_CHIP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96185b() {
        return C63123a.f170443a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f170458n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
