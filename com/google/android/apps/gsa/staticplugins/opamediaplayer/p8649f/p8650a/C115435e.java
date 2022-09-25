package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.e */
/* compiled from: PG */
public enum C115435e implements C62957cd {
    DEFAULT_FEEDBACK_TYPE(0),
    MISPRONOUNCED_WORD(1),
    MISPRONOUNCED_NUMBER_OR_SYMBOL(2),
    MISPRONOUNCED_ABBREVIATIONS(3),
    MISPRONOUNCED_NAME(4),
    WRONG_STRESS(5),
    MISSING_OR_MISPLACED_PAUSE(6),
    SPEED_TOO_FAST_OR_SLOW(7),
    POOR_AUDIO_QUALITY(8),
    VOICE_CUTTING_OFF(9),
    OTHER(10);
    

    /* renamed from: l */
    public final int f320274l;

    private C115435e(int i) {
        this.f320274l = i;
    }

    /* renamed from: a */
    public static C115435e m191424a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_FEEDBACK_TYPE;
            case 1:
                return MISPRONOUNCED_WORD;
            case 2:
                return MISPRONOUNCED_NUMBER_OR_SYMBOL;
            case 3:
                return MISPRONOUNCED_ABBREVIATIONS;
            case 4:
                return MISPRONOUNCED_NAME;
            case 5:
                return WRONG_STRESS;
            case 6:
                return MISSING_OR_MISPLACED_PAUSE;
            case 7:
                return SPEED_TOO_FAST_OR_SLOW;
            case 8:
                return POOR_AUDIO_QUALITY;
            case 9:
                return VOICE_CUTTING_OFF;
            case 10:
                return OTHER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m191425b() {
        return C115434d.f320261a;
    }

    public final int getNumber() {
        return this.f320274l;
    }

    public final String toString() {
        return Integer.toString(this.f320274l);
    }
}
