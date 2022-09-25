package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.ShortcutInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.y */
/* compiled from: PG */
public final /* synthetic */ class C111600y implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111600y f310335a = new C111600y();

    private /* synthetic */ C111600y() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((ShortcutInfo) obj).getRank());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
