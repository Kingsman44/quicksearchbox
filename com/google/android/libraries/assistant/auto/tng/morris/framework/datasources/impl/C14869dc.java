package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.pm.ResolveInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.dc */
/* compiled from: PG */
public final /* synthetic */ class C14869dc implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C14869dc f44752a = new C14869dc();

    private /* synthetic */ C14869dc() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((ResolveInfo) obj).activityInfo.applicationInfo.packageName;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
