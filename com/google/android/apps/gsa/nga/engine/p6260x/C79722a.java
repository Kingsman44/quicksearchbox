package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a */
/* compiled from: PG */
class C79722a implements Function {
    /* renamed from: a */
    public final C80478c apply(C77889u uVar) {
        C77889u uVar2 = C77889u.ASR;
        switch (uVar.ordinal()) {
            case 0:
                return C80478c.ASR;
            case 1:
                return C80478c.SODA;
            case 2:
                return C80478c.SYSTEM;
            case 3:
                return C80478c.TEXT_QUERY;
            case 4:
                return C80478c.PROACTIVE;
            case 5:
                return C80478c.OPA_SUGGESTION;
            case 6:
                return C80478c.KEYBOARD_INPUT;
            case 7:
                return C80478c.S3;
            case 8:
                return C80478c.KEYBOARD_DICTATION;
            case 9:
                return C80478c.WATCH_SUGGESTION;
            case 10:
                return C80478c.CONVERSATION_API;
            case 11:
                return C80478c.TITAN_VOICE_PLATE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
