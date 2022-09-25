package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.pm.ResolveInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.l */
/* compiled from: PG */
public final /* synthetic */ class C147919l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147919l f398997a = new C147919l();

    private /* synthetic */ C147919l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((ResolveInfo) obj).activityInfo;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
