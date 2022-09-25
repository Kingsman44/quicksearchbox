package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.c */
/* compiled from: PG */
public final /* synthetic */ class C90369c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C90374h f252398a;

    public /* synthetic */ C90369c(C90374h hVar) {
        this.f252398a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C90374h hVar = this.f252398a;
        String i = ((BundledMessageNotification) obj).mo84119i();
        return Long.valueOf(hVar.f252407c.containsKey(i) ? ((Long) hVar.f252407c.get(i)).longValue() : 0);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
