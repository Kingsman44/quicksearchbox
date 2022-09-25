package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8911a.C118952a;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.cd */
/* compiled from: PG */
final class C118014cd implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Query f327518a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f327519b;

    /* renamed from: c */
    final /* synthetic */ C118024cn f327520c;

    public C118014cd(C118024cn cnVar, Query query, C60870cx cxVar) {
        this.f327520c = cnVar;
        this.f327518a = query;
        this.f327519b = cxVar;
    }

    /* renamed from: c */
    public final void mo103494c(boolean z) {
        boolean z2 = this.f327520c.f327544c.f327233a;
        boolean z3 = false;
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            if (z2) {
                C59104x b = C118024cn.f327529a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SearchGraphController");
                ((C59052c) ((C59052c) b).mo56372aa(18883)).mo56386p("Query completed, has follow on.");
                C118024cn cnVar = this.f327520c;
                cnVar.f327544c.f327233a = false;
                cnVar.mo103496b(this.f327518a.mo84292ad());
            } else {
                C59104x b2 = C118024cn.f327529a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "SearchGraphController");
                ((C59052c) ((C59052c) b2).mo56372aa(18882)).mo56386p("Query completed, no follow on");
            }
        }
        synchronized (this.f327520c) {
            if (!z2) {
                try {
                    if (this.f327520c.f327560s.mo56113h() && this.f327519b == this.f327520c.f327560s.mo56107c()) {
                        z3 = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        if (z3) {
            this.f327520c.f327543b.mo103500b();
        }
        this.f327520c.mo103498d(this.f327518a);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String str;
        C60870cx cxVar;
        C59104x d = C118024cn.f327529a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SearchGraphController");
        Throwable th2 = th;
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th2)).mo56372aa(18884)).mo56386p("Query failed");
        C90528t tVar = null;
        this.f327520c.f327554m.mo80167b(this.f327518a, 464, C60537to.GENERIC_ERROR, (C90456c) null);
        Throwable cause = th.getCause() != null ? th.getCause() : th2;
        if (cause instanceof C90528t) {
            tVar = (C90528t) cause;
        } else if (cause instanceof TimeoutException) {
            tVar = new C90523o(65545);
        }
        C90528t tVar2 = tVar;
        if (tVar2 == null) {
            mo103494c(false);
            return;
        }
        if (this.f327520c.f327558q.mo56113h()) {
            ClientConfig a = this.f327520c.f327552k.mo80283a();
            C118024cn cnVar = this.f327520c;
            C118024cn cnVar2 = this.f327520c;
            str = C118952a.m197463a(a, tVar2, cnVar.f327556o, cnVar.f327557p, (C89994f) cnVar.f327547f.mo27525b(), cnVar2.f327548g, this.f327518a, cnVar2.f327545d, (String) null, ((C9309a) cnVar2.f327558q.mo56107c()).f32299a.mo79344b().toLanguageTag(), this.f327520c.f327553l);
        } else {
            ClientConfig a2 = this.f327520c.f327552k.mo80283a();
            C118024cn cnVar3 = this.f327520c;
            C118024cn cnVar4 = this.f327520c;
            str = C118952a.m197464b(a2, tVar2, cnVar3.f327556o, cnVar3.f327557p, (C89994f) cnVar3.f327547f.mo27525b(), cnVar4.f327548g, this.f327518a, cnVar4.f327545d, cnVar4.f327553l);
        }
        if (str == null) {
            cxVar = this.f327520c.f327555n.mo103485a(this.f327518a);
        } else {
            cxVar = this.f327520c.f327555n.mo103486b(this.f327518a, str);
        }
        C60922j.m93045h(C60838bs.m92859i(cxVar), new C118013cc(this), C60826bg.f164896a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f327520c.f327554m.mo80167b(this.f327518a, 463, C60537to.TASKGRAPH_SUCCESS, (C90456c) null);
        mo103494c(true);
    }
}
