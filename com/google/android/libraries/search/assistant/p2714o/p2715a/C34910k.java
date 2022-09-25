package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.app.usage.UsageStats;
import com.google.android.libraries.search.assistant.p2714o.C34916b;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.o.a.k */
/* compiled from: PG */
public final /* synthetic */ class C34910k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C34910k f92563a = new C34910k();

    private /* synthetic */ C34910k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        UsageStats usageStats = (UsageStats) obj;
        C58974d dVar = C34913n.f92566a;
        return new C34916b(usageStats.getPackageName(), Instant.ofEpochMilli(usageStats.getLastTimeUsed()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
