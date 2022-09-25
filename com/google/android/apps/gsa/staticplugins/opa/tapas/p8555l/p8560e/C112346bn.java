package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bn */
/* compiled from: PG */
public final /* synthetic */ class C112346bn implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112360ca f311742a;

    public /* synthetic */ C112346bn(C112360ca caVar) {
        this.f311742a = caVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return new C112332b(Math.log(Math.max(9.999999747378752E-6d, (double) ((Float) ((C58495hd) this.f311742a.f311772i.getOrDefault(entry.getKey(), C58729pv.f156485a)).getOrDefault(((Optional) entry.getValue()).get(), Float.valueOf(1.0E-5f))).floatValue())), 1);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
