package com.google.android.apps.gsa.search.core.p6816p;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.apps.gsa.search.core.p.bt */
/* compiled from: PG */
public final class C86237bt implements C90964a {

    /* renamed from: a */
    public static final C59071e f233065a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.bt");

    /* renamed from: b */
    public final C86124t f233066b;

    /* renamed from: c */
    public final C22871g f233067c;

    /* renamed from: d */
    public final Queue f233068d;

    /* renamed from: e */
    public final Queue f233069e;

    /* renamed from: f */
    public final Object f233070f = new Object();

    /* renamed from: g */
    public final LongSparseArray f233071g;

    public C86237bt(C86124t tVar, C22871g gVar) {
        this.f233066b = tVar;
        this.f233067c = gVar;
        this.f233068d = new ConcurrentLinkedQueue();
        this.f233069e = new ConcurrentLinkedQueue();
        this.f233071g = new LongSparseArray((int) tVar.mo79743a(C90120fr.f250839f));
    }

    /* renamed from: a */
    public final void mo79904a(C86232bo boVar) {
        long l = boVar.mo79888l();
        C58838bb.m90868c(l != 0);
        int a = (int) this.f233066b.mo79743a(C90120fr.f250821am);
        if (a > 0) {
            synchronized (this.f233070f) {
                if (this.f233071g.get(l) == null) {
                    while (this.f233071g.size() >= a) {
                        LongSparseArray longSparseArray = this.f233071g;
                        longSparseArray.remove(longSparseArray.keyAt(0));
                    }
                }
                this.f233071g.append(l, boVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo79905b() {
        this.f233069e.size();
        for (C86236bs bsVar : this.f233069e) {
            if (!bsVar.f233063a.mo79881Q()) {
                bsVar.mo79903a();
            }
        }
        this.f233069e.clear();
        this.f233068d.clear();
        synchronized (this.f233070f) {
            this.f233071g.clear();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchResultCache");
        fVar.mo85279c("max cache entries").mo85276a(C90752i.m148230d(Integer.valueOf((int) this.f233066b.mo79743a(C90120fr.f250821am))));
        C91006f e = fVar.mo85281e((Object) null);
        int size = this.f233068d.size();
        e.mo85291r("Prefetch SRP downloads, " + size + " items (these should also be in cache)");
        for (C86236bs l : this.f233068d) {
            e.mo85285l(l);
        }
        int size2 = this.f233069e.size();
        e.mo85291r("Cache, " + size2 + " items");
        for (C86236bs l2 : this.f233069e) {
            e.mo85285l(l2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (C86236bs bsVar : this.f233069e) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(",");
            }
            if (C90918bo.m148517d(bsVar.f233063a.mo79865A())) {
                sb.append(((Query) C90918bo.m148515b(bsVar.f233063a.mo79865A())).f252768g);
            } else {
                sb.append("non-srp");
            }
            i = i2;
        }
        sb.append("}");
        return sb.toString();
    }
}
