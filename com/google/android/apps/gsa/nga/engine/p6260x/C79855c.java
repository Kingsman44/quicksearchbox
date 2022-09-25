package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80482g;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.c */
/* compiled from: PG */
class C79855c implements Function {
    /* renamed from: a */
    public final C80482g apply(C77551ad adVar) {
        C77551ad adVar2 = C77551ad.ASR;
        switch (adVar.ordinal()) {
            case 0:
                return C80482g.ASR;
            case 1:
                return C80482g.JINN;
            case 2:
                return C80482g.JINN_RERANK;
            case 3:
                return C80482g.ANDROID_RECOGNIZER;
            case 4:
                return C80482g.USER_INPUT;
            case 5:
                return C80482g.PROACTIVE;
            case 6:
                return C80482g.EDUCATIONAL_SUGGESTION;
            case 7:
                return C80482g.OPA_SUGGESTION;
            case 8:
                return C80482g.S3;
            case 9:
                return C80482g.NON_VOICE;
            case 10:
                return C80482g.KEYBOARD_INPUT;
            case 11:
                return C80482g.UNKNOWN;
            case 12:
                return C80482g.LOCKED_SCREEN;
            case 13:
                return C80482g.CLIENT_INPUT;
            case 14:
                return C80482g.CLIENT_OP_RESULT;
            case 15:
                return C80482g.SODA_PREDICTION;
            case 16:
                return C80482g.WATCH_SUGGESTION;
            case 17:
                return C80482g.TITAN_VOICE_PLATE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(adVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
