package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.InCallService;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.e */
/* compiled from: PG */
public final /* synthetic */ class C79509e implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ((InCallService) obj).setAudioRoute(8);
        return true;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
