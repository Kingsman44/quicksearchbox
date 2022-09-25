package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.p */
/* compiled from: PG */
public final /* synthetic */ class C79529p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79529p f218244a = new C79529p();

    private /* synthetic */ C79529p() {
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
