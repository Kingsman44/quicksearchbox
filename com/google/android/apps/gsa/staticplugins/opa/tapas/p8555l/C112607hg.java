package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hg */
/* compiled from: PG */
public final /* synthetic */ class C112607hg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112621hu f312209a;

    public /* synthetic */ C112607hg(C112621hu huVar) {
        this.f312209a = huVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112621hu huVar = this.f312209a;
        Stream map = Collection.EL.stream((ArrayList) obj).map(C112610hj.f312212a).filter(C112611hk.f312213a).map(C112612hl.f312214a);
        C112037ao aoVar = huVar.f312224a;
        Objects.requireNonNull(aoVar);
        return map.map(new C112604hd(aoVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
