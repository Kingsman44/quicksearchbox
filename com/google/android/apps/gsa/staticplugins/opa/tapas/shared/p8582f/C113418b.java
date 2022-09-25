package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8582f;

import android.media.session.MediaController;
import android.support.p031v4.media.session.MediaSessionCompat;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.f.b */
/* compiled from: PG */
public final /* synthetic */ class C113418b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113419c f314080a;

    public /* synthetic */ C113418b(C113419c cVar) {
        this.f314080a = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f314080a.mo100227a(MediaSessionCompat.Token.fromToken(((MediaController) obj).getSessionToken()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
