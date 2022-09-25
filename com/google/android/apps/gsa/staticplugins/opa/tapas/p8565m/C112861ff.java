package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ff */
/* compiled from: PG */
public final /* synthetic */ class C112861ff implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112869fn f312818a;

    /* renamed from: b */
    public final /* synthetic */ String f312819b;

    public /* synthetic */ C112861ff(C112869fn fnVar, String str) {
        this.f312818a = fnVar;
        this.f312819b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112869fn fnVar = this.f312818a;
        String str = this.f312819b;
        C113341cl clVar = (C113341cl) obj;
        C113286bk a = clVar.mo99979a();
        if (a.mo99930b() != 4) {
            return C60856cj.m92900i(Optional.m71637of(clVar));
        }
        return C60922j.m93044g(fnVar.f312831d.mo99925b(a.mo99929a()), new C112867fl(str, clVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
