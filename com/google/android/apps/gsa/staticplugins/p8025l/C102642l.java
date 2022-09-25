package com.google.android.apps.gsa.staticplugins.p8025l;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6739j.C85501a;
import com.google.android.apps.gsa.search.core.p6519al.p6739j.C85504b;
import com.google.android.apps.gsa.search.core.p6787f.C85769b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.l */
/* compiled from: PG */
public final class C102642l extends C86734a implements C85504b {

    /* renamed from: a */
    private final Object f286507a = new Object();

    /* renamed from: b */
    private final C90747d f286508b = C90748e.m148223a(false);

    /* renamed from: c */
    private final C68214a f286509c;

    /* renamed from: f */
    private C85769b f286510f;

    public C102642l(C68214a aVar) {
        super(C118575h.WORKER_ASSISTANT_TEXT_SEARCH, "assistanttextsearch");
        this.f286509c = aVar;
    }

    /* renamed from: a */
    public final void mo79025a(Query query, C85501a aVar) {
        this.f286508b.mo85091a();
        C58976aa aaVar = C58975e.f156826a;
        C102641k kVar = new C102641k(aVar);
        synchronized (this.f286507a) {
            if (this.f286510f != null) {
                mo79108hY();
            }
            C102639i a = ((C102640j) this.f286509c.mo27525b()).mo93352a(query, kVar);
            this.f286510f = a;
            a.mo79427a();
        }
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        synchronized (this.f286507a) {
            C85769b bVar = this.f286510f;
            if (bVar != null) {
                bVar.mo79428b();
            }
            this.f286510f = null;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
