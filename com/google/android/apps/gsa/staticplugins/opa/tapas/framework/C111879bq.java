package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import java.util.Map;
import p3186j$.util.function.Function;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bq */
/* compiled from: PG */
public final /* synthetic */ class C111879bq implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f310880a;

    public /* synthetic */ C111879bq(Map map) {
        this.f310880a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C69464a) this.f310880a.get((C48672ag) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
