package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.k.a.t */
/* compiled from: PG */
public enum C67242t implements C62957cd {
    NO_PREAMBLE(0),
    HOTWORD(1),
    MICROPHONE_TAP(2),
    ENROLLMENT(3),
    SEAMLESS_HOTWORD(4),
    SEAMLESS_MICROPHONE_TAP(5),
    SEAMLESS_HOTWORD_BEEP(6),
    SEAMLESS_MICROPHONE_TAP_BEEP(7),
    MAGIC_MIC_PREAMBLE(8),
    SEAMLESS_TTS(9),
    INSTANT_SOUND_SEARCH_PREAMBLE(12),
    HOTWORD_BARGE_IN_ERASED_PREAMBLE(13),
    HOTWORD_BARGE_IN_PREAMBLE(14),
    HOTWORD_BARGE_IN_TTS(15),
    ENROLLMENT_GOOGLE_HOME(16),
    ENROLLMENT_INDIGO(17),
    HEY_ROBOT_PREAMBLE(18),
    HOTGAZE_PREAMBLE(19),
    ENROLLMENT_TISID(20),
    HOTQUERY(21);
    

    /* renamed from: u */
    public final int f182766u;

    private C67242t(int i) {
        this.f182766u = i;
    }

    /* renamed from: a */
    public static C67242t m97443a(int i) {
        switch (i) {
            case 0:
                return NO_PREAMBLE;
            case 1:
                return HOTWORD;
            case 2:
                return MICROPHONE_TAP;
            case 3:
                return ENROLLMENT;
            case 4:
                return SEAMLESS_HOTWORD;
            case 5:
                return SEAMLESS_MICROPHONE_TAP;
            case 6:
                return SEAMLESS_HOTWORD_BEEP;
            case 7:
                return SEAMLESS_MICROPHONE_TAP_BEEP;
            case 8:
                return MAGIC_MIC_PREAMBLE;
            case 9:
                return SEAMLESS_TTS;
            case 12:
                return INSTANT_SOUND_SEARCH_PREAMBLE;
            case 13:
                return HOTWORD_BARGE_IN_ERASED_PREAMBLE;
            case 14:
                return HOTWORD_BARGE_IN_PREAMBLE;
            case 15:
                return HOTWORD_BARGE_IN_TTS;
            case 16:
                return ENROLLMENT_GOOGLE_HOME;
            case 17:
                return ENROLLMENT_INDIGO;
            case 18:
                return HEY_ROBOT_PREAMBLE;
            case 19:
                return HOTGAZE_PREAMBLE;
            case 20:
                return ENROLLMENT_TISID;
            case 21:
                return HOTQUERY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97444b() {
        return C67241s.f182744a;
    }

    public final int getNumber() {
        return this.f182766u;
    }

    public final String toString() {
        return Integer.toString(this.f182766u);
    }
}
