package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import android.content.ComponentName;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C107963g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C107970n f300401a;

    public /* synthetic */ C107963g(C107970n nVar) {
        this.f300401a = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        return this.f300401a.f300424c.mo76930e(C58837ba.m90858g(componentName.getPackageName()), C58837ba.m90858g(componentName.getClassName()), C53306j.MAIN_APP);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
