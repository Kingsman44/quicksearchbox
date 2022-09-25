package com.google.apps.tiktok.experiments.phenotype;

import android.util.Log;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.phenotype.client.stable.C31715bg;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.android.concurrent.C58301z;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.di */
/* compiled from: PG */
public final class C46996di implements C31715bg {

    /* renamed from: a */
    public final C69464a f122525a;

    /* renamed from: b */
    private final C46459k f122526b;

    /* renamed from: c */
    private final C21370a f122527c;

    /* renamed from: d */
    private final C60888db f122528d;

    /* renamed from: e */
    private final Object f122529e = new Object();

    /* renamed from: f */
    private final C69464a f122530f;

    /* renamed from: g */
    private C60870cx f122531g;

    public C46996di(C46459k kVar, C21370a aVar, C60888db dbVar, C58833ax axVar, C69464a aVar2) {
        C69664n.m101061g(kVar, "androidFutures");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(dbVar, "bgExecutor");
        C69664n.m101061g(aVar2, "importantThreshold");
        this.f122526b = kVar;
        this.f122527c = aVar;
        this.f122528d = dbVar;
        this.f122525a = aVar2;
        this.f122530f = new C46994dg(axVar);
    }

    /* renamed from: a */
    public final void mo37332a() {
        Object b = this.f122530f.mo17428b();
        C69664n.m101060f(b, "pollDuration.get()");
        long longValue = ((Number) b).longValue();
        if (longValue <= TimeUnit.DAYS.toSeconds(30)) {
            Log.w("TimedProcessReaper", "Scheduling killing of process to refresh configuration");
            synchronized (this.f122529e) {
                if (this.f122531g == null) {
                    C46459k kVar = this.f122526b;
                    C60870cx a = C58301z.m89281a(new C46995dh(this), longValue, longValue, TimeUnit.SECONDS, this.f122527c, this.f122528d);
                    kVar.mo50457e(a, 1, TimeUnit.DAYS);
                    this.f122531g = a;
                }
            }
        }
    }
}
