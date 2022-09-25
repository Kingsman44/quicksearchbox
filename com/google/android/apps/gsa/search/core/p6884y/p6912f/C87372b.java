package com.google.android.apps.gsa.search.core.p6884y.p6912f;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6884y.C87370f;
import com.google.android.apps.gsa.search.core.p6884y.C87377g;
import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.apps.gsa.search.core.p6884y.C87386i;
import com.google.android.apps.gsa.search.core.p6884y.C87389j;
import com.google.android.apps.gsa.search.core.p6884y.C87390k;
import com.google.android.apps.gsa.search.core.p6884y.p6885a.C87285b;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88003lo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88009lu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.android.libraries.gsa.monet.service.C23051b;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60757n;

/* renamed from: com.google.android.apps.gsa.search.core.y.f.b */
/* compiled from: PG */
public final /* synthetic */ class C87372b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C87374d f235932a;

    /* renamed from: b */
    public final /* synthetic */ ClientEventData f235933b;

    /* renamed from: c */
    public final /* synthetic */ C88012lx f235934c;

    /* renamed from: d */
    public final /* synthetic */ C87285b f235935d;

    public /* synthetic */ C87372b(C87374d dVar, ClientEventData clientEventData, C88012lx lxVar, C87285b bVar) {
        this.f235932a = dVar;
        this.f235933b = clientEventData;
        this.f235934c = lxVar;
        this.f235935d = bVar;
    }

    public final void run() {
        C87374d dVar = this.f235932a;
        ClientEventData clientEventData = this.f235933b;
        C88012lx lxVar = this.f235934c;
        C87285b bVar = this.f235935d;
        int i = lxVar.f238013b;
        if (i == 9) {
            C23058i i2 = bVar.mo80933i();
            i2.f63407a.mo28328a();
            C23051b bVar2 = i2.f63409c;
            if (bVar2 == null || !bVar2.mo28488iF()) {
                C87682aj ajVar = dVar.f235941d.f234157a;
                ajVar.getClass();
                ((C86771n) ajVar).mo80379b(new C87684al(C88244um.BACK_PRESS).mo81964a());
            }
        } else if (i == 10) {
            C88003lo loVar = (C88003lo) lxVar.f238014c;
            C87390k b = bVar.mo80929b();
            int i3 = loVar.f237988b;
            C91078e eVar = (C91078e) b.f235974b.get(i3);
            C87386i iVar = (C87386i) b.f235975c.get(i3);
            b.f235974b.remove(i3);
            b.f235975c.remove(i3);
            if (eVar != null) {
                eVar.mo18206a((String[]) loVar.f237989c.toArray(new String[0]), C60757n.m92752m(loVar.f237990d));
            } else if (iVar == null) {
                C59104x d = C87390k.f235973a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MPermissionsRequester");
                ((C59052c) ((C59052c) d).mo56372aa(8236)).mo56386p("No callback available for processed permission request.");
            } else if (loVar.f237989c.size() != loVar.f237990d.size()) {
                C59104x d2 = C87390k.f235973a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "MPermissionsRequester");
                ((C59052c) ((C59052c) d2).mo56372aa(8237)).mo56386p("Mismatch in the permissions and result length.");
            } else {
                C58480gp e = C58485gu.m89837e();
                for (int i4 = 0; i4 < loVar.f237989c.size(); i4++) {
                    String str = (String) loVar.f237989c.get(i4);
                    loVar.f237990d.mo58914d(i4);
                    e.mo55395g(new C87389j());
                }
                e.mo55394f();
                iVar.mo81045a();
            }
        } else if (i == 11) {
            C88009lu luVar = (C88009lu) lxVar.f238014c;
            C87379h a = bVar.mo80928a();
            a.f235954b.mo28328a();
            int i5 = luVar.f238002b;
            C87370f fVar = new C87370f(luVar.f238003c, (Intent) clientEventData.mo81912b(Intent.class));
            C87377g gVar = (C87377g) a.f235956d.get(i5);
            if (gVar != null) {
                gVar.f235950a.mo17703hg(fVar.f235929a, fVar.f235930b, a.f235953a);
            } else {
                a.f235955c.put(i5, fVar);
            }
        } else {
            bVar.mo80930c().mo80927a(clientEventData);
        }
    }
}
