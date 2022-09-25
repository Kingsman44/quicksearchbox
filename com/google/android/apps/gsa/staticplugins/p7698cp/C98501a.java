package com.google.android.apps.gsa.staticplugins.p7698cp;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6636cb.C85069a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88296wk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88297wl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88298wm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88377zk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88378zl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88379zm;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.cp.a */
/* compiled from: PG */
public final class C98501a extends C86734a implements C85069a {

    /* renamed from: a */
    private final C86610af f275062a;

    public C98501a(C86610af afVar) {
        super(C118575h.WORKER_PROGRESS, "progress");
        this.f275062a = afVar;
    }

    /* renamed from: a */
    public final void mo78687a(boolean z) {
        C87684al alVar = new C87684al(C88244um.SHOW_PROGRESS);
        C62940bt btVar = C88296wk.f238805a;
        C88297wl wlVar = (C88297wl) C88298wm.f238806c.createBuilder();
        wlVar.copyOnWrite();
        C88298wm wmVar = (C88298wm) wlVar.instance;
        wmVar.f238808a |= 1;
        wmVar.f238809b = z;
        alVar.mo81965b(btVar, (C88298wm) wlVar.build());
        this.f275062a.mo80228i(alVar.mo81964a());
    }

    /* renamed from: b */
    public final void mo78688b(double d) {
        this.f275062a.mo80228i(new C87684al(C88244um.ATTACH_MATERIAL_PROGRESS_BAR).mo81964a());
        C87684al alVar = new C87684al(C88244um.UPDATE_PROGRESS_AMOUNT);
        C62940bt btVar = C88377zk.f238985a;
        C88378zl zlVar = (C88378zl) C88379zm.f238986c.createBuilder();
        zlVar.copyOnWrite();
        C88379zm zmVar = (C88379zm) zlVar.instance;
        zmVar.f238988a |= 1;
        zmVar.f238989b = d;
        alVar.mo81965b(btVar, (C88379zm) zlVar.build());
        this.f275062a.mo80228i(alVar.mo81964a());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ProgressWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
