package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C112008p;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.d */
/* compiled from: PG */
public final /* synthetic */ class C111796d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111800h f310715a;

    /* renamed from: b */
    public final /* synthetic */ C19167ba f310716b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f310717c;

    /* renamed from: d */
    public final /* synthetic */ C112008p f310718d;

    public /* synthetic */ C111796d(C111800h hVar, C112008p pVar, C19167ba baVar, C58485gu guVar) {
        this.f310715a = hVar;
        this.f310718d = pVar;
        this.f310716b = baVar;
        this.f310717c = guVar;
    }

    public final void run() {
        C111800h hVar = this.f310715a;
        C112008p pVar = this.f310718d;
        C19167ba baVar = this.f310716b;
        C58485gu guVar = this.f310717c;
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        ArrayList arrayList = new ArrayList(guVar.size());
        C59104x b = C111800h.f310721a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TapasBench");
        ((C59052c) ((C59052c) b).mo56372aa(27422)).mo56386p("Starting benchmarks ...");
        int size = guVar.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            String str = (String) guVar.get(i2);
            int i3 = i + 1;
            C59104x b2 = C111800h.f310721a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) b2).mo56372aa(27432)).mo56359L("Running benchmark %d/%d for '%s'", Integer.valueOf(i3), Integer.valueOf(guVar.size()), str);
            C113405ep a = hVar.f310724d.mo99904b(str, baVar, C51331dt.FULLY_TRUSTED, hVar.f310725e).mo100001a();
            try {
                long a2 = C58872ci.m90947d(C58274c.f155808a).mo56158a(TimeUnit.MICROSECONDS);
                C59104x b3 = C111800h.f310721a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "TapasBench");
                ((C59052c) ((C59052c) b3).mo56372aa(27433)).mo56394x("Fetched %d suggestions, took %dus", ((C113408es) C90877ak.m148472f(pVar.f311170a.mo99257a(a))).mo100053o().size(), a2);
                arrayList.add(Long.valueOf(a2));
                hVar.f310726f.mo99248a();
            } catch (ExecutionException e) {
                C59104x c = C111800h.f310721a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TapasBench");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27434)).mo56386p("Suggestion Fetching failed.");
            } catch (InterruptedException unused) {
                C59104x b4 = C111800h.f310721a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "TapasBench");
                ((C59052c) ((C59052c) b4).mo56372aa(27435)).mo56386p("Benchmark interrupted, stopping run.");
                return;
            }
            i2++;
            i = i3;
        }
        C59104x b5 = C111800h.f310721a.mo56224b();
        b5.mo56378ag(C58975e.f156826a, "TapasBench");
        ((C59052c) ((C59052c) b5).mo56372aa(27423)).mo56386p("Benchmarks finished.");
        StringBuilder sb = new StringBuilder();
        int size2 = arrayList.size();
        long j = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            Long l = (Long) arrayList.get(i4);
            sb.append(l);
            sb.append(",");
            j += l.longValue();
        }
        if (!arrayList.isEmpty()) {
            C59104x b6 = C111800h.f310721a.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) b6).mo56372aa(27425)).mo56389s("Results:\n%s", sb);
            Collections.sort(arrayList);
            C59104x b7 = C111800h.f310721a.mo56224b();
            b7.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) b7).mo56372aa(27426)).mo56387q("Samples: %d", arrayList.size());
            C59104x b8 = C111800h.f310721a.mo56224b();
            b8.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) b8).mo56372aa(27427)).mo56388r("Average: %dus", j / ((long) arrayList.size()));
            C59104x b9 = C111800h.f310721a.mo56224b();
            b9.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) b9).mo56372aa(27428)).mo56389s("Mean: %dus", arrayList.get(arrayList.size() / 2));
            C59104x b10 = C111800h.f310721a.mo56224b();
            b10.mo56378ag(C58975e.f156826a, "TapasBench");
            double size3 = (double) arrayList.size();
            Double.isNaN(size3);
            ((C59052c) ((C59052c) b10).mo56372aa(27429)).mo56389s("p90: %dus", arrayList.get((int) (size3 * 0.9d)));
            C59104x b11 = C111800h.f310721a.mo56224b();
            b11.mo56378ag(C58975e.f156826a, "TapasBench");
            double size4 = (double) arrayList.size();
            Double.isNaN(size4);
            ((C59052c) ((C59052c) b11).mo56372aa(27430)).mo56389s("p99: %dus", arrayList.get((int) (size4 * 0.99d)));
            C59104x b12 = C111800h.f310721a.mo56224b();
            b12.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) b12).mo56372aa(27431)).mo56388r("Full eval took %ds", d.mo56158a(TimeUnit.SECONDS));
            return;
        }
        C59104x b13 = C111800h.f310721a.mo56224b();
        b13.mo56378ag(C58975e.f156826a, "TapasBench");
        ((C59052c) ((C59052c) b13).mo56372aa(27424)).mo56386p("All fetches failed.");
    }
}
