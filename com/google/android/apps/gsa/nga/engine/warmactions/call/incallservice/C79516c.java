package com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice;

import android.telecom.PhoneAccountHandle;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.c */
/* compiled from: PG */
public final /* synthetic */ class C79516c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79516c f218222a = new C79516c();

    private /* synthetic */ C79516c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((PhoneAccountHandle) obj).getComponentName();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
