package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.v */
/* compiled from: PG */
public final /* synthetic */ class C79535v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79535v f218251a = new C79535v();

    private /* synthetic */ C79535v() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Call.Details) obj).getContactDisplayName();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
