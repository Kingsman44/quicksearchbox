package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ic */
/* compiled from: PG */
public final class C109268ic implements C90991b {

    /* renamed from: a */
    public final C86124t f304385a;

    /* renamed from: b */
    public final C109270ie f304386b;

    /* renamed from: c */
    public final C9388a f304387c;

    /* renamed from: d */
    public final C68214a f304388d;

    /* renamed from: e */
    public boolean f304389e;

    /* renamed from: f */
    List f304390f;

    /* renamed from: g */
    public C108788dv f304391g;

    public C109268ic(C108230ba baVar, C86124t tVar, C9388a aVar, C68214a aVar2) {
        this.f304385a = tVar;
        this.f304386b = new C109270ie(baVar);
        this.f304387c = aVar;
        this.f304388d = aVar2;
    }

    /* renamed from: a */
    public final void mo97734a() {
        C58976aa aaVar = C58975e.f156826a;
        List list = this.f304390f;
        if (list != null) {
            this.f304386b.f304397a.mo95373O(list);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CtxCardsSgstChipCtrl");
    }
}
