package com.google.apps.tiktok.experiments.phenotype;

import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dg */
/* compiled from: PG */
final class C46994dg implements C69464a {

    /* renamed from: a */
    final /* synthetic */ C58833ax f122523a;

    public C46994dg(C58833ax axVar) {
        this.f122523a = axVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        Object b = ((C69464a) ((C58847bk) this.f122523a).f156646a).mo17428b();
        C69664n.m101060f(b, "durationOptional.get().get()");
        long longValue = ((Number) b).longValue();
        long seconds = TimeUnit.MINUTES.toSeconds(5);
        if (longValue < seconds) {
            longValue = seconds;
        }
        return Long.valueOf(longValue);
    }
}
