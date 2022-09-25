package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121214b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import java.util.Map;
import p3186j$.util.function.Function;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.b.m */
/* compiled from: PG */
public final /* synthetic */ class C121234m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C121237p f336763a;

    public /* synthetic */ C121234m(C121237p pVar) {
        this.f336763a = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return new C121236o(this.f336763a, (C48714bv) entry.getKey(), (C121214b) ((C69464a) entry.getValue()).mo17428b());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
