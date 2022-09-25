package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.aq */
/* compiled from: PG */
public final /* synthetic */ class C112737aq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112737aq f312510a = new C112737aq();

    private /* synthetic */ C112737aq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113321r rVar = (C113321r) obj;
        if (rVar.f313839f.equals("vnd.android.cursor.item/phone_v2")) {
            return new C112723ac(3, rVar);
        }
        return new C112723ac(1, rVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
