package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.q */
/* compiled from: PG */
public final /* synthetic */ class C112266q implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112267r f311578a;

    /* renamed from: b */
    public final /* synthetic */ Optional f311579b;

    /* renamed from: c */
    public final /* synthetic */ Optional f311580c;

    /* renamed from: d */
    public final /* synthetic */ Optional f311581d;

    public /* synthetic */ C112266q(C112267r rVar, Optional optional, Optional optional2, Optional optional3) {
        this.f311578a = rVar;
        this.f311579b = optional;
        this.f311580c = optional2;
        this.f311581d = optional3;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112267r rVar = this.f311578a;
        C113415ez ezVar = (C113415ez) obj;
        return C60922j.m93044g(ezVar.mo100055N(), new C112262m(rVar, ezVar, this.f311579b, this.f311580c, this.f311581d), rVar.f311589e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
