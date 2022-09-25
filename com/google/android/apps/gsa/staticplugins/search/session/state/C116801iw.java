package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.iw */
/* compiled from: PG */
public final class C116801iw implements C87143ik {

    /* renamed from: a */
    private final C116800iv f324067a;

    /* renamed from: b */
    private final C86842bk f324068b;

    /* renamed from: c */
    private final C86842bk f324069c;

    /* renamed from: d */
    private final C86842bk f324070d;

    /* renamed from: e */
    private final C86842bk f324071e;

    /* renamed from: f */
    private final C86842bk f324072f;

    public C116801iw(C116800iv ivVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f324067a = ivVar;
        this.f324068b = new C86842bk(aVar);
        this.f324069c = new C86842bk(aVar2);
        this.f324070d = new C86842bk(aVar3);
        this.f324071e = new C86842bk(aVar4);
        this.f324072f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f324067a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        this.f324068b.mo80534b(icVar);
        this.f324069c.mo80534b(icVar);
        this.f324070d.mo80534b(icVar);
        this.f324071e.mo80534b(icVar);
        this.f324072f.mo80534b(icVar);
        C86842bk bkVar = this.f324068b;
        if (bkVar.f234552a || this.f324069c.f234552a || this.f324070d.f234552a || this.f324071e.f234552a || this.f324072f.f234552a) {
            C116800iv ivVar = this.f324067a;
            C86842bk bkVar2 = this.f324069c;
            C86842bk bkVar3 = this.f324070d;
            C86842bk bkVar4 = this.f324071e;
            boolean z2 = false;
            C86842bk[] bkVarArr = {bkVar, bkVar2, bkVar3, bkVar4, this.f324072f};
            int i = 0;
            while (true) {
                if (i >= 5) {
                    z = false;
                    break;
                } else if (bkVarArr[i].f234552a) {
                    z = ivVar.mo102947e((C116836z) bkVar.mo80533a(), (C116569ag) bkVar2.mo80533a(), (C116611bv) bkVar3.mo80533a(), (C116735gk) bkVar4.mo80533a());
                    break;
                } else {
                    i++;
                }
            }
            if (bkVar4.f234552a) {
                Query query = ((C116735gk) bkVar4.mo80533a()).f323784p;
                long j = ivVar.f324051e;
                long j2 = query.f252780s;
                if (j != j2) {
                    ivVar.f324051e = j2;
                    int e = (query.mo84381cN() || query.mo84397cd() || !ivVar.mo102948g()) ? 0 : query.mo84472e();
                    if (ivVar.f324052f != e) {
                        ivVar.f324052f = e;
                        C58976aa aaVar = C58975e.f156826a;
                        int i2 = ivVar.f324052f;
                        z2 = true;
                    }
                }
            }
            if (z || z2) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f324067a.mo80591ar();
            }
        }
    }
}
