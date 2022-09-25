package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.x */
/* compiled from: PG */
public final /* synthetic */ class C79537x implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79537x f218253a = new C79537x();

    private /* synthetic */ C79537x() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Call.Details) obj).getHandle();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
