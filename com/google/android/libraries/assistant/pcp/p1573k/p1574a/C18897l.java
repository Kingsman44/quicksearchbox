package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.pm.PackageItemInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.l */
/* compiled from: PG */
public final /* synthetic */ class C18897l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18897l f53181a = new C18897l();

    private /* synthetic */ C18897l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        PackageItemInfo packageItemInfo = (PackageItemInfo) obj;
        return new ComponentName(packageItemInfo.packageName, packageItemInfo.name);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
