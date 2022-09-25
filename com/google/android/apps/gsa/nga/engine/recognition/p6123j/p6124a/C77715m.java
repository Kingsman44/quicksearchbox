package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.recognition.C77562ao;
import com.google.speech.p5208h.C66686t;
import com.google.speech.recognizer.p5233a.C67463k;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.m */
/* compiled from: PG */
public final /* synthetic */ class C77715m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77715m f214078a = new C77715m();

    private /* synthetic */ C77715m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C66686t tVar = C66686t.DEFAULT_INTERVAL_GUEST;
        C67463k kVar = C67463k.START_OF_SPEECH;
        int ordinal = ((C66686t) obj).ordinal();
        if (ordinal == 0) {
            return C77562ao.GH_INTERVAL_GUEST;
        }
        if (ordinal == 1) {
            return C77562ao.GH_INTERVAL_UNLIKELY_USER;
        }
        if (ordinal == 2) {
            return C77562ao.GH_INTERVAL_USER;
        }
        if (ordinal != 3) {
            return C77562ao.UNKNOWN;
        }
        return C77562ao.GH_INTERVAL_TRUSTED_USER;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
