package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.z */
/* compiled from: PG */
public final /* synthetic */ class C79539z implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79539z f218255a = new C79539z();

    private /* synthetic */ C79539z() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((Call.Details) obj).getCreationTimeMillis());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
