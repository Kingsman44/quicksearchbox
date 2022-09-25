package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.app.usage.UsageStats;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.k */
/* compiled from: PG */
public final /* synthetic */ class C113204k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113204k f313538a = new C113204k();

    private /* synthetic */ C113204k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        UsageStats usageStats = (UsageStats) ((Map.Entry) obj).getValue();
        usageStats.getPackageName();
        long firstTimeStamp = usageStats.getFirstTimeStamp();
        usageStats.getLastTimeStamp();
        return new C113142b(firstTimeStamp, usageStats.getLastTimeUsed(), usageStats.getTotalTimeInForeground());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
