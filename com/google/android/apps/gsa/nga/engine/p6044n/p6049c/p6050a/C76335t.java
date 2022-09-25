package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.app.Notification;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.t */
/* compiled from: PG */
public final /* synthetic */ class C76335t implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76337v f211416a;

    /* renamed from: b */
    public final /* synthetic */ String f211417b;

    public /* synthetic */ C76335t(C76337v vVar, String str) {
        this.f211416a = vVar;
        this.f211417b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f211416a.f211420b.f(this.f211417b, (Notification.Action) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
