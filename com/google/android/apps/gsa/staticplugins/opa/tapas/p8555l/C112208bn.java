package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48590af;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bn */
/* compiled from: PG */
public final /* synthetic */ class C112208bn implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112208bn f311501a = new C112208bn();

    private /* synthetic */ C112208bn() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48590af afVar = (C48590af) obj;
        boolean z = false;
        if (Collection.EL.stream(afVar.f125593c).noneMatch(C112204bj.f311497a) && Collection.EL.stream(afVar.f125591a).noneMatch(C112205bk.f311498a)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
