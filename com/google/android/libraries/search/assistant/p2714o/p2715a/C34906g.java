package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.app.usage.UsageStats;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.o.a.g */
/* compiled from: PG */
public final /* synthetic */ class C34906g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C34913n f92559a;

    public /* synthetic */ C34906g(C34913n nVar) {
        this.f92559a = nVar;
    }

    public final Object call() {
        C34913n nVar = this.f92559a;
        Instant ofEpochMilli = Instant.ofEpochMilli(nVar.f92570e.mo26870b());
        List<UsageStats> queryUsageStats = nVar.f92568c.queryUsageStats(0, ofEpochMilli.minus(C34913n.f92567b).toEpochMilli(), ofEpochMilli.toEpochMilli());
        if (queryUsageStats == null) {
            return Optional.empty();
        }
        return Collection.EL.stream(queryUsageStats).filter(C34908i.f92561a).max(Comparator.CC.comparingLong(C34909j.f92562a)).map(C34910k.f92563a);
    }
}
