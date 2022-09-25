package com.google.android.apps.gsa.staticplugins.bisto.p7457a;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.a.k */
/* compiled from: PG */
public final class C94647k {

    /* renamed from: a */
    public int f264717a = -1;

    /* renamed from: b */
    public boolean f264718b = true;

    /* renamed from: c */
    private final C94637a f264719c;

    /* renamed from: d */
    private final List f264720d;

    public C94647k(List list, C94637a aVar) {
        this.f264720d = list;
        this.f264719c = aVar;
    }

    /* renamed from: a */
    public final void mo88602a() {
        int i = this.f264717a + 1;
        this.f264717a = i;
        if (i >= this.f264720d.size()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f264719c.mo88580a(this.f264718b);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (!((C94640d) this.f264720d.get(this.f264717a)).mo88578l(this, new C94645i(this))) {
            this.f264718b = false;
            mo88602a();
        }
    }
}
