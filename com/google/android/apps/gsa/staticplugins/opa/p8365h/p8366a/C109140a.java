package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.C106602a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.a */
/* compiled from: PG */
public final /* synthetic */ class C109140a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109149e f303927a;

    /* renamed from: b */
    public final /* synthetic */ Intent f303928b;

    public /* synthetic */ C109140a(C109149e eVar, Intent intent) {
        this.f303927a = eVar;
        this.f303928b = intent;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C109149e eVar = this.f303927a;
        C106602a aVar = (C106602a) obj;
        C60870cx a = aVar.mo95591a(this.f303928b);
        C60856cj.m92911t(a, new C109148d(eVar, aVar), eVar.f303955d);
        return a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
