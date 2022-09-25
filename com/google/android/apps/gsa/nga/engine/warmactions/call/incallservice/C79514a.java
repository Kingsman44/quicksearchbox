package com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice;

import android.telecom.Call;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.a */
/* compiled from: PG */
public final /* synthetic */ class C79514a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79514a f218220a = new C79514a();

    private /* synthetic */ C79514a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Call) obj).getDetails();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
