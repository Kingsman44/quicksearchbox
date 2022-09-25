package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.v */
/* compiled from: PG */
public final /* synthetic */ class C100883v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C100862aj f281874a;

    public /* synthetic */ C100883v(C100862aj ajVar) {
        this.f281874a = ajVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C100862aj ajVar = this.f281874a;
        C60870cx b = ajVar.f281840h.mo28202b("GetAccountParams", new C100876o(ajVar, (String) obj));
        C22871g gVar = ajVar.f281840h;
        C100721ad adVar = ajVar.f281834b;
        Objects.requireNonNull(adVar);
        return gVar.mo28209i(b, "Effective FL enabled", new C100877p(adVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
