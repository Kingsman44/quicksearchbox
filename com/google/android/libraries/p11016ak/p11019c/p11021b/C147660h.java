package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.Voice;
import p3186j$.util.function.Function;
import p5285d.p5290b.p5291a.p5292a.C68161ax;
import p5285d.p5290b.p5291a.p5292a.C68162ay;

/* renamed from: com.google.android.libraries.ak.c.b.h */
/* compiled from: PG */
public final /* synthetic */ class C147660h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147660h f398515a = new C147660h();

    private /* synthetic */ C147660h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C68161ax axVar = (C68161ax) C68162ay.f184449b.createBuilder();
        String language = ((Voice) obj).getLocale().getLanguage();
        axVar.copyOnWrite();
        language.getClass();
        ((C68162ay) axVar.instance).f184451a = language;
        return (C68162ay) axVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
