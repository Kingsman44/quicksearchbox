package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6398p.p6399a;

import android.graphics.Path;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81820m;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81821n;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81822o;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.p.a.b */
/* compiled from: PG */
public final /* synthetic */ class C81957b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81958c f224079a;

    public /* synthetic */ C81957b(C81958c cVar) {
        this.f224079a = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81958c cVar = this.f224079a;
        C58528ij ijVar = (C58528ij) obj;
        if (ijVar.isEmpty()) {
            C83349aj.m132647b(cVar.f224084e, cVar.f224085f, C81820m.m130058c(), "touchConfig");
        } else if (ijVar.contains(C81821n.WHOLE_SCREEN)) {
            C83349aj.m132647b(cVar.f224084e, cVar.f224085f, C81820m.m130060e(), "touchConfig");
        } else {
            Path path = new Path();
            C58800sl lA = ijVar.iterator();
            while (lA.hasNext()) {
                C81821n nVar = (C81821n) lA.next();
                C81822o oVar = (C81822o) cVar.f224083d.get(nVar);
                if (oVar == null) {
                    ((C59052c) ((C59052c) C81958c.f224080a.mo56226d()).mo56372aa(6429)).mo56389s("Could not find provider for: %s", nVar);
                } else {
                    path.addRect(oVar.mo75196a(), Path.Direction.CW);
                }
            }
            C83349aj.m132647b(cVar.f224084e, cVar.f224085f, C81820m.m130059d(path), "touchConfig");
        }
    }
}
