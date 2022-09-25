package com.google.android.apps.gsa.search.core.state;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.state.p6872d.C86912af;
import com.google.android.apps.gsa.search.core.state.p6872d.C86921ao;
import com.google.android.apps.gsa.search.core.state.p6872d.C86938be;
import com.google.android.apps.gsa.search.core.state.p6872d.C86962n;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cw */
/* compiled from: PG */
public final class C86901cw implements C87143ik {

    /* renamed from: a */
    private final C86921ao f234672a;

    /* renamed from: b */
    private final C86842bk f234673b;

    /* renamed from: c */
    private final C86842bk f234674c;

    /* renamed from: d */
    private final C86842bk f234675d;

    public C86901cw(C86921ao aoVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f234672a = aoVar;
        this.f234673b = new C86842bk(aVar);
        this.f234674c = new C86842bk(aVar2);
        this.f234675d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234672a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f234673b.mo80534b(icVar);
        this.f234674c.mo80534b(icVar);
        this.f234675d.mo80534b(icVar);
        C86842bk bkVar = this.f234673b;
        boolean z = bkVar.f234552a;
        if (z || this.f234674c.f234552a || this.f234675d.f234552a) {
            C86921ao aoVar = this.f234672a;
            C86842bk bkVar2 = this.f234674c;
            C86842bk bkVar3 = this.f234675d;
            boolean z2 = false;
            if (bkVar2.f234552a) {
                C86938be beVar = (C86938be) bkVar2.mo80533a();
                C86962n nVar = (C86962n) bkVar.mo80533a();
                boolean j = aoVar.mo80571j(beVar.mo80490C() ? beVar.mo80489B() : BuildConfig.FLAVOR);
                if (aoVar.mo80573m(nVar, beVar) || j) {
                    z2 = true;
                }
            } else if (z) {
                z2 = aoVar.mo80573m((C86962n) bkVar.mo80533a(), (C86938be) bkVar2.mo80533a());
            }
            if (bkVar3.f234552a && ((C86912af) bkVar3.mo80533a()).f234708a != aoVar.f234739b) {
                aoVar.f234739b = ((C86912af) bkVar3.mo80533a()).f234708a;
            }
            if (aoVar.mo80572k(aoVar.mo80568e()) || z2) {
                this.f234672a.mo80591ar();
            }
        }
    }
}
