package com.google.protos.p4934ay.p4935a.p4936a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ay.a.a.b */
/* compiled from: PG */
public enum C64272b implements C62957cd {
    FEATURE_UNSPECIFIED(0),
    FEATURE_BIASING_PHRASES(1),
    FEATURE_LANG_ID(2),
    FEATURE_CAPITALIZATION(3),
    FEATURE_UNSPOKEN_PUNCTUATION(4),
    FEATURE_SPOKEN_PUNCTUATION(5),
    FEATURE_SPOKEN_EMOJI(6),
    FEATURE_WORD_CONFIDENCE(7),
    FEATURE_UTTERANCE_CONFIDENCE(8),
    FEATURE_WORD_TIMING(9),
    FEATURE_OFFENSIVE_WORD_MASKING(10),
    FEATURE_DIARIZATION(11),
    FEATURE_SPEAKER_TURNS(12);
    

    /* renamed from: n */
    private final int f173789n;

    private C64272b(int i) {
        this.f173789n = i;
    }

    /* renamed from: a */
    public static C64272b m96374a(int i) {
        switch (i) {
            case 0:
                return FEATURE_UNSPECIFIED;
            case 1:
                return FEATURE_BIASING_PHRASES;
            case 2:
                return FEATURE_LANG_ID;
            case 3:
                return FEATURE_CAPITALIZATION;
            case 4:
                return FEATURE_UNSPOKEN_PUNCTUATION;
            case 5:
                return FEATURE_SPOKEN_PUNCTUATION;
            case 6:
                return FEATURE_SPOKEN_EMOJI;
            case 7:
                return FEATURE_WORD_CONFIDENCE;
            case 8:
                return FEATURE_UTTERANCE_CONFIDENCE;
            case 9:
                return FEATURE_WORD_TIMING;
            case 10:
                return FEATURE_OFFENSIVE_WORD_MASKING;
            case 11:
                return FEATURE_DIARIZATION;
            case 12:
                return FEATURE_SPEAKER_TURNS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96375b() {
        return C64271a.f173774a;
    }

    public final int getNumber() {
        return this.f173789n;
    }

    public final String toString() {
        return Integer.toString(this.f173789n);
    }
}
