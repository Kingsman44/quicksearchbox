package com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice;

import android.telecom.Call;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.b */
/* compiled from: PG */
public final /* synthetic */ class C79515b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79515b f218221a = new C79515b();

    private /* synthetic */ C79515b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Call.Details) obj).getAccountHandle();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
