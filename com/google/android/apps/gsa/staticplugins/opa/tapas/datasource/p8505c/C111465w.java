package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import android.content.pm.ShortcutInfo;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.w */
/* compiled from: PG */
public final /* synthetic */ class C111465w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111442as f310098a;

    /* renamed from: b */
    public final /* synthetic */ Map f310099b;

    public /* synthetic */ C111465w(C111442as asVar, Map map) {
        this.f310098a = asVar;
        this.f310099b = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
        return this.f310098a.mo99149l(shortcutInfo, Double.valueOf(1.0d), shortcutInfo.getPackage(), this.f310099b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
