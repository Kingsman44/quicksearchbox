package com.google.android.libraries.performance.primes.metrics.p2404b;

import com.google.android.libraries.p11012aj.C147596b;
import com.google.android.libraries.p11012aj.p11015c.C147601a;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.t */
/* compiled from: PG */
public final /* synthetic */ class C31317t implements C147601a {

    /* renamed from: a */
    public final /* synthetic */ C69464a f84337a;

    public /* synthetic */ C31317t(C69464a aVar) {
        this.f84337a = aVar;
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        C69464a aVar = this.f84337a;
        Boolean bool = false;
        if (bool.booleanValue() && C147596b.m240670a()) {
            String b = C147596b.m240671b();
            if (b == null || !b.endsWith(":primes_lifeboat")) {
                for (C31313p ln : (Set) aVar.mo17428b()) {
                    ln.mo29159ln();
                }
            }
        }
    }
}
