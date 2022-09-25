package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.PhoneAccountHandle;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.q */
/* compiled from: PG */
public final /* synthetic */ class C79530q implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79530q f218245a = new C79530q();

    private /* synthetic */ C79530q() {
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
