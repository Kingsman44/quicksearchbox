package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e.p8239a;

import com.google.assistant.p3860as.C49748ak;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.a.j */
/* compiled from: PG */
public final /* synthetic */ class C106663j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106663j f297326a = new C106663j();

    private /* synthetic */ C106663j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = true;
        if (1 != (((C49748ak) obj).f128466a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
