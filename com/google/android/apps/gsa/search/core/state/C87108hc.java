package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6864a.C86799n;
import com.google.android.apps.gsa.shared.util.BitFlags;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.hc */
/* compiled from: PG */
public final class C87108hc implements C87143ik {

    /* renamed from: a */
    private final C87107hb f235353a;

    /* renamed from: b */
    private final C86842bk f235354b;

    /* renamed from: c */
    private final C86842bk f235355c;

    /* renamed from: d */
    private final C86842bk f235356d;

    /* renamed from: e */
    private final C86842bk f235357e;

    /* renamed from: f */
    private final C86842bk f235358f;

    /* renamed from: g */
    private final C86842bk f235359g;

    public C87108hc(C87107hb hbVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f235353a = hbVar;
        this.f235354b = new C86842bk(aVar);
        this.f235355c = new C86842bk(aVar2);
        this.f235356d = new C86842bk(aVar3);
        this.f235357e = new C86842bk(aVar4);
        this.f235358f = new C86842bk(aVar5);
        this.f235359g = new C86842bk(aVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235353a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        boolean z2;
        this.f235354b.mo80534b(icVar);
        this.f235355c.mo80534b(icVar);
        this.f235356d.mo80534b(icVar);
        this.f235357e.mo80534b(icVar);
        this.f235358f.mo80534b(icVar);
        this.f235359g.mo80534b(icVar);
        C86842bk bkVar = this.f235354b;
        if (bkVar.f234552a || this.f235355c.f234552a || this.f235356d.f234552a || this.f235357e.f234552a || this.f235358f.f234552a || this.f235359g.f234552a) {
            C87107hb hbVar = this.f235353a;
            C86842bk bkVar2 = this.f235355c;
            C86842bk bkVar3 = this.f235356d;
            C86842bk bkVar4 = this.f235357e;
            C86842bk bkVar5 = this.f235358f;
            C86842bk bkVar6 = this.f235359g;
            boolean a = hbVar.mo80739a();
            if (bkVar.f234552a) {
                hbVar.f235351c.mo85055h(4, ((C86808ae) bkVar.mo80533a()).f234461a);
            }
            if (bkVar2.f234552a || bkVar4.f234552a || bkVar5.f234552a || bkVar6.f234552a) {
                C86812ai aiVar = (C86812ai) bkVar2.mo80533a();
                C86799n nVar = (C86799n) bkVar4.mo80533a();
                C87052fn fnVar = (C87052fn) bkVar5.mo80533a();
                TtsState ttsState = (TtsState) bkVar6.mo80533a();
                BitFlags bitFlags = hbVar.f235351c;
                if (hbVar.f235350b && nVar.mo80490C() && !aiVar.f234471a.mo81874D() && fnVar.mo80688F()) {
                    z2 = ttsState.mo80423y();
                } else {
                    z2 = false;
                }
                z = bitFlags.mo85055h(1, z2);
            } else {
                z = false;
            }
            long j = ((C86815al) bkVar3.mo80533a()).f234493a;
            boolean a2 = hbVar.mo80739a();
            long j2 = hbVar.f235352d;
            if (j2 != j) {
                if (a2) {
                    hbVar.f235349a.mo78813h(j, true);
                }
                if (a) {
                    hbVar.f235349a.mo78813h(j2, false);
                }
                hbVar.f235352d = j;
            } else if (a != a2) {
                hbVar.f235349a.mo78813h(j2, a2);
            }
            if (z) {
                this.f235353a.mo80591ar();
            }
        }
    }
}
