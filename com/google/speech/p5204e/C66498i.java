package com.google.speech.p5204e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.e.i */
/* compiled from: PG */
public enum C66498i implements C62957cd {
    NORMAL(0),
    SEARCH(1),
    KITT(2),
    UNICORN(3),
    UNICORN_16K(4),
    SEARCH_16K(5),
    HOME(7),
    LONG_FORM(12),
    CAPTION(13),
    EXPERIMENTAL(28),
    EXPERIMENTAL_SHORT(29),
    VOICEMAIL(6),
    PHONE_CONVERSATION(14),
    TELEPHONY(15),
    IVR(18),
    OFFLINE_VOICE_ACTIONS(8),
    OFFLINE_KITT(9),
    OFFLINE_UNICORN(10),
    OFFLINE_DICTATION(11),
    ONDEVICE_LARGE_CONTINUOUS(20),
    ONDEVICE_LARGE_SHORT(21),
    ONDEVICE_MEDIUM_CONTINUOUS(22),
    ONDEVICE_MEDIUM_SHORT(23),
    ONDEVICE_SMALL_CONTINUOUS(24),
    ONDEVICE_SMALL_SHORT(25),
    GBOARD_DICTATION(26),
    ONDEVICE_LARGE_VOICE_MATCH(30),
    ONDEVICE_MEDIUM_VOICE_MATCH(31),
    ONDEVICE_SPEAKER_DIARIZATION(32),
    ONDEVICE_SPEAKER_TURN_DETECTION(37),
    VOICE_MATCH(17),
    LANGUAGE_IDENTIFICATION(27),
    LANGUAGE_IDENTIFICATION_MULTILANG(33),
    LANGUAGE_IDENTIFICATION_EXPERIMENTAL(34),
    SPEAKER_DIARIZATION(36),
    SPEAKER_TURN_DETECTION(38),
    MEDICAL_DICTATION(16),
    MEDICAL_CONVERSATION(19),
    BATCH(35),
    UNKNOWN(999),
    SEARCH_16K_EP(998),
    ONDEVICE_LARGE_SEARCH(997),
    ONDEVICE_MEDIUM_SEARCH(996),
    ONDEVICE_SMALL_SEARCH(995),
    KITT_EXP(994),
    HOME_EXP(993),
    YOUTUBE_EXP(989),
    EXPERIMENTAL_RESCORING(992),
    GRECO4_EXPERIMENTAL(991),
    GRECO4_EXPERIMENTAL_SHORT(990);
    

    /* renamed from: Y */
    public static final C62958ce f180831Y = null;

    /* renamed from: Z */
    public final int f180859Z;

    static {
        f180831Y = new C66496g();
    }

    private C66498i(int i) {
        this.f180859Z = i;
    }

    /* renamed from: a */
    public static C66498i m97222a(int i) {
        switch (i) {
            case 0:
                return NORMAL;
            case 1:
                return SEARCH;
            case 2:
                return KITT;
            case 3:
                return UNICORN;
            case 4:
                return UNICORN_16K;
            case 5:
                return SEARCH_16K;
            case 6:
                return VOICEMAIL;
            case 7:
                return HOME;
            case 8:
                return OFFLINE_VOICE_ACTIONS;
            case 9:
                return OFFLINE_KITT;
            case 10:
                return OFFLINE_UNICORN;
            case 11:
                return OFFLINE_DICTATION;
            case 12:
                return LONG_FORM;
            case 13:
                return CAPTION;
            case 14:
                return PHONE_CONVERSATION;
            case 15:
                return TELEPHONY;
            case 16:
                return MEDICAL_DICTATION;
            case 17:
                return VOICE_MATCH;
            case 18:
                return IVR;
            case 19:
                return MEDICAL_CONVERSATION;
            case 20:
                return ONDEVICE_LARGE_CONTINUOUS;
            case 21:
                return ONDEVICE_LARGE_SHORT;
            case 22:
                return ONDEVICE_MEDIUM_CONTINUOUS;
            case 23:
                return ONDEVICE_MEDIUM_SHORT;
            case 24:
                return ONDEVICE_SMALL_CONTINUOUS;
            case 25:
                return ONDEVICE_SMALL_SHORT;
            case 26:
                return GBOARD_DICTATION;
            case 27:
                return LANGUAGE_IDENTIFICATION;
            case 28:
                return EXPERIMENTAL;
            case 29:
                return EXPERIMENTAL_SHORT;
            case 30:
                return ONDEVICE_LARGE_VOICE_MATCH;
            case 31:
                return ONDEVICE_MEDIUM_VOICE_MATCH;
            case 32:
                return ONDEVICE_SPEAKER_DIARIZATION;
            case 33:
                return LANGUAGE_IDENTIFICATION_MULTILANG;
            case 34:
                return LANGUAGE_IDENTIFICATION_EXPERIMENTAL;
            case 35:
                return BATCH;
            case 36:
                return SPEAKER_DIARIZATION;
            case 37:
                return ONDEVICE_SPEAKER_TURN_DETECTION;
            case 38:
                return SPEAKER_TURN_DETECTION;
            default:
                switch (i) {
                    case 989:
                        return YOUTUBE_EXP;
                    case 990:
                        return GRECO4_EXPERIMENTAL_SHORT;
                    case 991:
                        return GRECO4_EXPERIMENTAL;
                    case 992:
                        return EXPERIMENTAL_RESCORING;
                    case 993:
                        return HOME_EXP;
                    case 994:
                        return KITT_EXP;
                    case 995:
                        return ONDEVICE_SMALL_SEARCH;
                    case 996:
                        return ONDEVICE_MEDIUM_SEARCH;
                    case 997:
                        return ONDEVICE_LARGE_SEARCH;
                    case 998:
                        return SEARCH_16K_EP;
                    case 999:
                        return UNKNOWN;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m97223b() {
        return C66497h.f180806a;
    }

    public final int getNumber() {
        return this.f180859Z;
    }

    public final String toString() {
        return Integer.toString(this.f180859Z);
    }
}
