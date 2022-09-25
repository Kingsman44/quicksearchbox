package com.google.android.apps.gsa.search.core.service.p6856h.p6857a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.p6773am.C85628c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86746c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86747d;
import com.google.android.apps.gsa.search.core.service.p6856h.p6858b.C86745a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.core.service.h.a.i */
/* compiled from: PG */
public final class C86743i implements C86747d {

    /* renamed from: a */
    private static final C59071e f234315a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.h.a.i");

    /* renamed from: b */
    private final Object f234316b = new Object();

    /* renamed from: c */
    private final C86741g f234317c;

    /* renamed from: d */
    private C58485gu f234318d = C58485gu.m89845m();

    /* renamed from: e */
    private final Map f234319e = new HashMap();

    /* renamed from: f */
    private final SortedMap f234320f = new ConcurrentSkipListMap(C86742h.f234314a);

    /* renamed from: g */
    private boolean f234321g = false;

    public C86743i(C86741g gVar, C86736b bVar) {
        this.f234317c = gVar;
        mo80358e(bVar);
    }

    /* renamed from: h */
    private final void m139742h(C86744b bVar) {
        C58485gu guVar;
        synchronized (this.f234316b) {
            guVar = this.f234318d;
        }
        if (guVar != null) {
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                ((C86746c) guVar.get(i2)).mo80219a(bVar);
            }
        }
    }

    /* renamed from: a */
    public final C58833ax mo80355a(String str) {
        if (this.f234321g) {
            ((C59052c) ((C59052c) f234315a.mo56225c()).mo56372aa(8538)).mo56386p("getWorker() is called after WorkerRegistry disposal.");
            return C58836b.f156633a;
        }
        C86745a aVar = (C86745a) this.f234320f.get(str);
        if (aVar != null) {
            return C58833ax.m90834k(aVar);
        }
        return C58833ax.m90833j((C86744b) this.f234319e.get(str));
    }

    /* renamed from: b */
    public final Collection mo80356b() {
        return Collections.unmodifiableCollection(this.f234320f.values());
    }

    /* renamed from: c */
    public final void mo80357c() {
        this.f234321g = true;
        synchronized (this.f234316b) {
            this.f234318d = null;
        }
        this.f234320f.clear();
        for (C86744b hY : this.f234319e.values()) {
            hY.mo79108hY();
        }
    }

    /* renamed from: e */
    public final void mo80358e(C86744b bVar) {
        if (this.f234321g) {
            ((C59052c) ((C59052c) f234315a.mo56225c()).mo56372aa(8539)).mo56386p("registerWorker() is called after WorkerRegistry disposal.");
            return;
        }
        String ia = bVar.mo80349ia();
        if (!this.f234319e.containsKey(ia)) {
            this.f234319e.put(ia, bVar);
            if (bVar instanceof C86745a) {
                C86745a aVar = (C86745a) bVar;
                C85628c cVar = new C85628c(aVar, this.f234317c.f234313b.mo77944g(C118569b.WORKER_LATENCY_MICROS, aVar.f234292d));
                this.f234320f.put(ia, cVar);
                m139742h(cVar);
                return;
            }
            m139742h(bVar);
        }
    }

    /* renamed from: g */
    public final void mo80360g(String str) {
        if (!str.equals("module")) {
            this.f234320f.remove(str);
            this.f234319e.remove(str);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkerRegistry");
        for (C86744b n : this.f234319e.values()) {
            fVar.mo85287n(n);
        }
    }

    /* renamed from: f */
    public final void mo80359f(C86746c cVar) {
        synchronized (this.f234316b) {
            C58485gu guVar = this.f234318d;
            if (guVar == null) {
                ((C59052c) ((C59052c) f234315a.mo56225c()).mo56372aa(8540)).mo56386p("registerWorkerLoadedListener() is called after WorkerRegistry disposal.");
                return;
            }
            C58480gp f = C58485gu.m89838f(((C58724pq) guVar).f156474d + 1);
            f.mo55396h(guVar);
            f.mo55395g(cVar);
            this.f234318d = f.mo55394f();
        }
    }
}
