package com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.k.b.g */
/* compiled from: PG */
public enum C80482g implements C62957cd {
    UNKNOWN(0),
    ASR(1),
    JINN(2),
    JINN_RERANK(9),
    ANDROID_RECOGNIZER(3),
    USER_INPUT(4),
    PROACTIVE(5),
    OPA_SUGGESTION(6),
    S3(7),
    NON_VOICE(10),
    EDUCATIONAL_SUGGESTION(8),
    KEYBOARD_INPUT(11),
    LOCKED_SCREEN(12),
    CLIENT_INPUT(13),
    CLIENT_OP_RESULT(14),
    SODA_PREDICTION(15),
    WATCH_SUGGESTION(16),
    TITAN_VOICE_PLATE(17),
    UNRECOGNIZED(-1);
    

    /* renamed from: t */
    private final int f220931t;

    private C80482g(int i) {
        this.f220931t = i;
    }

    /* renamed from: a */
    public static C80482g m128176a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ASR;
            case 2:
                return JINN;
            case 3:
                return ANDROID_RECOGNIZER;
            case 4:
                return USER_INPUT;
            case 5:
                return PROACTIVE;
            case 6:
                return OPA_SUGGESTION;
            case 7:
                return S3;
            case 8:
                return EDUCATIONAL_SUGGESTION;
            case 9:
                return JINN_RERANK;
            case 10:
                return NON_VOICE;
            case 11:
                return KEYBOARD_INPUT;
            case 12:
                return LOCKED_SCREEN;
            case 13:
                return CLIENT_INPUT;
            case 14:
                return CLIENT_OP_RESULT;
            case 15:
                return SODA_PREDICTION;
            case 16:
                return WATCH_SUGGESTION;
            case 17:
                return TITAN_VOICE_PLATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128177b() {
        return C80481f.f220910a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220931t;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
