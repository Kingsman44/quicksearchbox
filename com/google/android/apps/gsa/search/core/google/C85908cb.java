package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.google.cb */
/* compiled from: PG */
public final class C85908cb {

    /* renamed from: a */
    private final C21370a f232253a;

    /* renamed from: b */
    private final C85891bn f232254b;

    /* renamed from: c */
    private final C86124t f232255c;

    public C85908cb(C21370a aVar, C85891bn bnVar, C86124t tVar) {
        this.f232253a = aVar;
        this.f232254b = bnVar;
        this.f232255c = tVar;
    }

    /* renamed from: c */
    static void m138047c(C85981c cVar, long j) {
        cVar.mo79638d("qsubts", Long.toString(j));
    }

    /* renamed from: a */
    public final String mo79534a() {
        String d = this.f232254b.mo79525d();
        if (d != null) {
            return d;
        }
        return "ms-".concat(String.valueOf(this.f232254b.mo79522a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo79535b(C85981c cVar, Query query, String str, boolean z) {
        long j;
        e a;
        C58976aa aaVar = C58975e.f156826a;
        cVar.mo79638d("noj", "1");
        cVar.mo79639e(query.mo84359br());
        cVar.mo79638d("client", str);
        String b = this.f232254b.mo79523b();
        if (b != null && ((a = e.a(query.mo84263a("android.opa.extra.TRIGGERED_BY"))) == e.aL || a == e.aM || a == e.aO || a == e.aP || a == e.aR || a == e.aQ || a == e.aS)) {
            cVar.mo79638d("channel", b);
        }
        if (!this.f232255c.mo79746e(C89996bb.f246777g) || !query.mo84316bA()) {
            j = query.mo84317bB() ? query.f252745C : this.f232253a.mo26870b();
        } else {
            j = C21383f.m40448a(this.f232253a, query.f252747E);
        }
        long j2 = query.f252748F;
        if (j2 > 0) {
            j += j2;
            cVar.mo79638d("qsd", Long.toString(j2));
        }
        m138047c(cVar, j);
        if (z) {
            cVar.mo79638d("wf", "pp1");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo79536d(C85981c cVar, Query query) {
        String str;
        if (query.mo84403cj()) {
            str = this.f232254b.mo79524c();
            C58976aa aaVar = C58975e.f156826a;
            if (str == null) {
                str = mo79534a();
            }
        } else {
            str = mo79534a();
        }
        mo79535b(cVar, query, str, true);
    }
}
