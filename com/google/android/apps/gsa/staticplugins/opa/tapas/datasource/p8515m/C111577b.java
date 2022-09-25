package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.ApplicationInfo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.b */
/* compiled from: PG */
public final /* synthetic */ class C111577b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111583h f310307a;

    public /* synthetic */ C111577b(C111583h hVar) {
        this.f310307a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C113341cl.m187504e(C113259al.m187317b(this.f310307a.f310316d.getApplicationIcon((ApplicationInfo) obj)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
