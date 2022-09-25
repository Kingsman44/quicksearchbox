package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.shared.p7066m.C90035cn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.go */
/* compiled from: PG */
public final /* synthetic */ class C112586go implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112587gp f312183a;

    /* renamed from: b */
    public final /* synthetic */ boolean f312184b;

    public /* synthetic */ C112586go(C112587gp gpVar, boolean z) {
        this.f312183a = gpVar;
        this.f312184b = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112587gp gpVar = this.f312183a;
        boolean z = this.f312184b;
        C113415ez ezVar = (C113415ez) obj;
        boolean z2 = ezVar.mo100201a() > gpVar.f312185a.mo79747m(C90035cn.f248388m);
        if (!gpVar.f312185a.mo79746e(C90035cn.f248384i) && z) {
            C113414ey h = ezVar.mo100208h();
            h.mo100164i("⚪".concat(String.valueOf(ezVar.mo100199L())));
            ezVar = h.mo100156a();
        }
        if (!gpVar.f312185a.mo79746e(C90035cn.f248384i) && z2) {
            C113414ey h2 = ezVar.mo100208h();
            h2.mo100164i("⭐".concat(String.valueOf(ezVar.mo100199L())));
            ezVar = h2.mo100156a();
        }
        if (!gpVar.f312185a.mo79746e(C90035cn.f248384i) || z || z2) {
            return Optional.m71637of(ezVar);
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
