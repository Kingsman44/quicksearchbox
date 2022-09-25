package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.state.C87111hf;
import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.service.bm */
/* compiled from: PG */
public final class C86646bm implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C86647bn f234080a;

    /* renamed from: b */
    private final int f234081b;

    public C86646bm(C86647bn bnVar, int i) {
        this.f234080a = bnVar;
        this.f234081b = i;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        if (((C86948bo) this.f234080a.f234086e.mo27525b()).mo80604x()) {
            this.f234080a.mo80261a();
            return;
        }
        C86647bn bnVar = this.f234080a;
        if (bnVar.f234088g == this.f234081b) {
            for (C87111hf b : (Set) bnVar.f234090i.mo27525b()) {
                b.mo70823b();
            }
            C86647bn bnVar2 = this.f234080a;
            bnVar2.f234089h = false;
            bnVar2.f234084c.mo85324e();
            this.f234080a.f234085d.mo81927a(false);
            this.f234080a.f234084c.mo85322c();
        }
    }
}
