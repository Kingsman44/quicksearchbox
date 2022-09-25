package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.dy */
/* compiled from: PG */
public final class C116668dy implements C87143ik {

    /* renamed from: a */
    private final C116667dx f323534a;

    /* renamed from: b */
    private final C86842bk f323535b;

    /* renamed from: c */
    private final C86842bk f323536c;

    /* renamed from: d */
    private final C86842bk f323537d;

    public C116668dy(C116667dx dxVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f323534a = dxVar;
        this.f323535b = new C86842bk(aVar);
        this.f323536c = new C86842bk(aVar2);
        this.f323537d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323534a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        SearchError searchError;
        this.f323535b.mo80534b(icVar);
        this.f323536c.mo80534b(icVar);
        this.f323537d.mo80534b(icVar);
        C86842bk bkVar = this.f323535b;
        boolean z2 = bkVar.f234552a;
        if (z2 || this.f323536c.f234552a || this.f323537d.f234552a) {
            C116667dx dxVar = this.f323534a;
            C86842bk bkVar2 = this.f323536c;
            C86842bk bkVar3 = this.f323537d;
            boolean z3 = true;
            if (!z2 || dxVar.f323527c == (searchError = ((C116611bv) bkVar.mo80533a()).f323415e)) {
                z = false;
            } else {
                C58976aa aaVar = C58975e.f156826a;
                SearchError searchError2 = dxVar.f323527c;
                dxVar.f323527c = searchError;
                dxVar.mo102823e();
                dxVar.f323525a.mo78534k(dxVar.f323526b);
                z = true;
            }
            if (bkVar2.f234552a) {
                long j = ((C116569ag) bkVar2.mo80533a()).f323268b;
                if (j != dxVar.f323529e) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    long j2 = dxVar.f323529e;
                    dxVar.f323529e = j;
                    dxVar.f323525a.mo78534k(dxVar.f323526b);
                } else {
                    z3 = false;
                }
                z |= z3;
            }
            if (bkVar3.f234552a) {
                C116634cr crVar = (C116634cr) bkVar3.mo80533a();
                Query query = crVar.f323483b;
                crVar.f323483b = null;
                dxVar.f323528d = null;
                if (dxVar.f323527c != null) {
                    Query query2 = dxVar.f323528d;
                }
            }
            if (z) {
                this.f323534a.mo80591ar();
            }
        }
    }
}
