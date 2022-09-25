package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ct */
/* compiled from: PG */
public final /* synthetic */ class C79797ct implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79797ct f218779a = new C79797ct();

    private /* synthetic */ C79797ct() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = C79802cy.f218791a;
        C82885ea eaVar = ((C82889ee) obj).f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 1) {
            return (C80484i) eaVar.f225980b;
        }
        return C80484i.f220937h;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
