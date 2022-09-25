package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cg */
/* compiled from: PG */
public enum C125106cg implements C62957cd {
    KEYBOARD_TIP_EVENT_UNSPECIFIED(0),
    ONBOARDING_HEADER_SHOWN(1),
    ONBOARDING_DISMISSED_EXPLICIT(2),
    ONBOARDING_HEADER_PRESSED(3),
    EDUCATION_TIP_SHOWN(4),
    EDUCATION_TIP_DISMISSED_EXPLICIT(5),
    MIC_TIP_SHOWN(6),
    MIC_TIP_DISMISSED_EXPLICIT(7),
    VOICE_CORRECTION_TIP_SHOWN(8),
    VOICE_CORRECTION_TIP_DISMISSED_EXPLICIT(9),
    BUTTON_TIP_SHOWN(10),
    BUTTON_TIP_DISMISSED_EXPLICIT(11),
    OVERLAY_LEARNING_CENTER_TIP_SHOWN(12),
    OVERLAY_LEARNING_CENTER_TIP_DISMISSED_EXPLICIT(13),
    SPELL_IT_OUT_TIP_SHOWN(14),
    SPELL_IT_OUT_TIP_DISMISSED_EXPLICIT(15),
    UNRECOGNIZED(-1);
    

    /* renamed from: r */
    private final int f345136r;

    private C125106cg(int i) {
        this.f345136r = i;
    }

    /* renamed from: a */
    public static C125106cg m205000a(int i) {
        switch (i) {
            case 0:
                return KEYBOARD_TIP_EVENT_UNSPECIFIED;
            case 1:
                return ONBOARDING_HEADER_SHOWN;
            case 2:
                return ONBOARDING_DISMISSED_EXPLICIT;
            case 3:
                return ONBOARDING_HEADER_PRESSED;
            case 4:
                return EDUCATION_TIP_SHOWN;
            case 5:
                return EDUCATION_TIP_DISMISSED_EXPLICIT;
            case 6:
                return MIC_TIP_SHOWN;
            case 7:
                return MIC_TIP_DISMISSED_EXPLICIT;
            case 8:
                return VOICE_CORRECTION_TIP_SHOWN;
            case 9:
                return VOICE_CORRECTION_TIP_DISMISSED_EXPLICIT;
            case 10:
                return BUTTON_TIP_SHOWN;
            case 11:
                return BUTTON_TIP_DISMISSED_EXPLICIT;
            case 12:
                return OVERLAY_LEARNING_CENTER_TIP_SHOWN;
            case 13:
                return OVERLAY_LEARNING_CENTER_TIP_DISMISSED_EXPLICIT;
            case 14:
                return SPELL_IT_OUT_TIP_SHOWN;
            case 15:
                return SPELL_IT_OUT_TIP_DISMISSED_EXPLICIT;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f345136r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
