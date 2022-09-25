package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C106486b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106486b f296979a = new C106486b();

    private /* synthetic */ C106486b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106529c a = C106529c.m177304a(((C106532f) obj).f297081b);
        if (a == null) {
            a = C106529c.UNSPECIFIED;
        }
        return Boolean.valueOf(!a.equals(C106529c.UNSPECIFIED));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
