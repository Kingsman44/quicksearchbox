package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4550f.C59430c;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.g */
/* compiled from: PG */
public final /* synthetic */ class C112972g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C112982q f313052a;

    /* renamed from: b */
    public final /* synthetic */ C112979n f313053b;

    public /* synthetic */ C112972g(C112982q qVar, C112979n nVar) {
        this.f313052a = qVar;
        this.f313053b = nVar;
    }

    public final void run() {
        char c;
        C112982q qVar = this.f313052a;
        C112979n nVar = this.f313053b;
        Instant minusSeconds = qVar.mo99801b().minusSeconds(30);
        Iterator it = qVar.f313105e.values().iterator();
        while (it.hasNext()) {
            C112979n nVar2 = (C112979n) it.next();
            if (nVar2.f313091g.isBefore(minusSeconds)) {
                it.remove();
                C58976aa aaVar = C58975e.f156826a;
                long j = nVar2.f313085a;
            }
        }
        C111248k kVar = (C111248k) qVar.f313103c.mo27525b();
        if (qVar.f313102b.mo79746e(C90063do.f249318bK) && qVar.f313102b.mo79746e(C90063do.f249319bL) && kVar.mo99077b()) {
            StringBuilder sb = new StringBuilder();
            synchronized (nVar.f313089e) {
                c = 0;
                sb.append(String.format(Locale.US, "\nFetch-Latency summary for prefix '%s':\n", new Object[]{nVar.f313086b}));
                if (nVar.f313089e.f313055b != null) {
                    Locale locale = Locale.US;
                    C112973h hVar = nVar.f313089e;
                    sb.append(String.format(locale, "Total time: %.2f ms\n", new Object[]{Double.valueOf(C112982q.m186971a(Duration.between(hVar.f313054a, hVar.f313055b)))}));
                }
                sb.append("\nPhase Transitions:\n");
                for (C112981p pVar : nVar.f313089e.f313057d) {
                    if (pVar.f313096a != pVar.f313097b) {
                        sb.append(String.format(Locale.US, "\t%c-%c: %.2f ms\n", new Object[]{Character.valueOf(pVar.f313096a.f313079p), Character.valueOf(pVar.f313097b.f313079p), Double.valueOf(C112982q.m186971a(pVar.f313098c))}));
                    }
                }
                sb.append("\nPhase Durations:\n");
                for (C112978m mVar : nVar.f313089e.f313056c) {
                    sb.append(String.format(Locale.US, "\t%c: %.2f ms\n", new Object[]{Character.valueOf(mVar.f313083a.f313079p), Double.valueOf(C112982q.m186971a(mVar.f313084b))}));
                }
                if (!nVar.f313089e.f313058e.isEmpty()) {
                    sb.append("\nServer Cells:\n");
                    for (Map.Entry entry : nVar.f313089e.f313058e.entrySet()) {
                        sb.append(String.format(Locale.US, "\t%c was processed in cell '%s'\n", new Object[]{Character.valueOf(((C112976k) entry.getKey()).f313079p), entry.getValue()}));
                    }
                }
            }
            sb.append("\nPhase Descriptions:\n");
            for (C112976k kVar2 : C112976k.values()) {
                if (kVar2 != C112976k.UNKNOWN) {
                    sb.append(String.format(Locale.US, "\t%c ... %s\n", new Object[]{Character.valueOf(kVar2.f313079p), kVar2.f313080q}));
                }
            }
            ((C111248k) qVar.f313103c.mo27525b()).mo99076a(C111255r.FETCH_LATENCY, sb.toString());
            qVar.f313104d.mo99800a(nVar.f313089e);
            StringBuilder sb2 = new StringBuilder("\nAggregated Fetch-Latency summary (all times in [ms]):\n");
            synchronized (qVar.f313104d) {
                sb2.append("\nPhase Transitions: p50 / p90 / p95 / p99\n");
                for (C112980o oVar : qVar.f313104d.f313060b) {
                    if (oVar.f313093a != oVar.f313094b) {
                        C59430c cVar = oVar.f313095c;
                        Locale locale2 = Locale.US;
                        Object[] objArr = new Object[7];
                        objArr[c] = Character.valueOf(oVar.f313093a.f313079p);
                        objArr[1] = Character.valueOf(oVar.f313094b.f313079p);
                        objArr[2] = Integer.valueOf((int) cVar.mo56936a());
                        objArr[3] = Double.valueOf(cVar.mo56937b(50.0d));
                        objArr[4] = Double.valueOf(cVar.mo56937b(90.0d));
                        objArr[5] = Double.valueOf(cVar.mo56937b(95.0d));
                        objArr[6] = Double.valueOf(cVar.mo56937b(99.0d));
                        sb2.append(String.format(locale2, "\t%c-%c (N=%d): %.1f / %.1f / %.1f / %.1f\n", objArr));
                        c = 0;
                    }
                }
                sb2.append("\nPhase Durations: p50 / p90 / p95 / p99\n");
                for (C112977l lVar : qVar.f313104d.f313059a) {
                    C59430c cVar2 = lVar.f313082b;
                    sb2.append(String.format(Locale.US, "\t%c (N=%d): %.1f / %.1f / %.1f / %.1f\n", new Object[]{Character.valueOf(lVar.f313081a.f313079p), Integer.valueOf((int) cVar2.mo56936a()), Double.valueOf(cVar2.mo56937b(50.0d)), Double.valueOf(cVar2.mo56937b(90.0d)), Double.valueOf(cVar2.mo56937b(95.0d)), Double.valueOf(cVar2.mo56937b(99.0d))}));
                }
            }
            sb2.append("\nPhase Descriptions:\n");
            for (C112976k kVar3 : C112976k.values()) {
                if (kVar3 != C112976k.UNKNOWN) {
                    sb2.append(String.format(Locale.US, "\t%c ... %s\n", new Object[]{Character.valueOf(kVar3.f313079p), kVar3.f313080q}));
                }
            }
            ((C111248k) qVar.f313103c.mo27525b()).mo99076a(C111255r.FETCH_LATENCY_SUMMARY, sb2.toString());
        }
    }
}
