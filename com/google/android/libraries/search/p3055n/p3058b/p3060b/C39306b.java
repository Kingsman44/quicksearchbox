package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.search.p3055n.C39359bh;
import com.google.android.libraries.search.p3055n.C39361bj;
import com.google.android.libraries.search.p3055n.p3087j.p3089b.C39801a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5218j.C67171p;

/* renamed from: com.google.android.libraries.search.n.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C39306b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39280aa f103542a;

    /* renamed from: b */
    public final /* synthetic */ C39361bj f103543b;

    public /* synthetic */ C39306b(C39280aa aaVar, C39361bj bjVar) {
        this.f103542a = aaVar;
        this.f103543b = bjVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39359bh bhVar;
        C39280aa aaVar = this.f103542a;
        C39361bj bjVar = this.f103543b;
        boolean z = true;
        C58838bb.m90884s(aaVar.f103491v == 2, "Audio can only be pushed during an active ASR session.");
        int i = bjVar.f103657a;
        if (i == 1) {
            C67171p pVar = (C67171p) bjVar.f103658b;
            int d = pVar.f182578b.mo59031d();
            if (d <= 0) {
                z = false;
            }
            C58838bb.m90884s(z, "Cannot push 0 bytes to soda");
            C39326bt btVar = aaVar.f103480k;
            if (btVar.f103583b) {
                C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C39325bs(btVar, pVar)), btVar.f103584c), "SodaAsrController: Failed to dump query audio", new Object[0]);
            }
            if (aaVar.f103488s.isPresent()) {
                ((C39801a) aaVar.f103488s.get()).mo42017a(pVar.f182578b);
            } else {
                aaVar.mo41762j(pVar.f182578b, aaVar.f103489t.getAndAdd((long) (d / aaVar.f103490u.get())), pVar.f182580d);
            }
        } else if (i == 2) {
            C39359bh bhVar2 = C39359bh.DEFAULT_UNKNOWN;
            if (bjVar.f103657a == 2) {
                bhVar = C39359bh.m68763a(((Integer) bjVar.f103658b).intValue());
                if (bhVar == null) {
                    bhVar = C39359bh.DEFAULT_UNKNOWN;
                }
            } else {
                bhVar = C39359bh.DEFAULT_UNKNOWN;
            }
            if (bhVar.ordinal() == 1) {
                aaVar.mo41766n(3);
                aaVar.mo41763k();
                aaVar.f103480k.mo41777b();
            }
        }
        return C60866ct.f164955a;
    }
}
