package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.o */
/* compiled from: PG */
public final /* synthetic */ class C79528o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79528o f218243a = new C79528o();

    private /* synthetic */ C79528o() {
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
