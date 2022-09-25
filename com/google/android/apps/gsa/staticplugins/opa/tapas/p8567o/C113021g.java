package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113291bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113344co;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.g */
/* compiled from: PG */
public final /* synthetic */ class C113021g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113023i f313205a;

    /* renamed from: b */
    public final /* synthetic */ C113408es f313206b;

    public /* synthetic */ C113021g(C113023i iVar, C113408es esVar) {
        this.f313205a = iVar;
        this.f313206b = esVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113023i iVar = this.f313205a;
        C113291bp bpVar = (C113291bp) obj;
        return new C113344co(bpVar.f313753a, this.f313206b, (List) Collection.EL.stream(bpVar.f313754b).filter(new C112989a(iVar)).collect(Collectors.toCollection(C112998b.f313163a)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
