package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.app.usage.UsageStats;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C106471l implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C106471l f296959a = new C106471l();

    private /* synthetic */ C106471l() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        UsageStats usageStats = (UsageStats) obj;
        usageStats.add((UsageStats) obj2);
        return usageStats;
    }
}
