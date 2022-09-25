package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6195m.p6196a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81272bc;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.m.a.b */
/* compiled from: PG */
public final /* synthetic */ class C78723b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78726e f216722a;

    public /* synthetic */ C78723b(C78726e eVar) {
        this.f216722a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78726e eVar = this.f216722a;
        C81272bc bcVar = (C81272bc) obj;
        C83357g gVar = eVar.f216728d;
        boolean z = true;
        if (bcVar.f222476b != 0) {
            int i = bcVar.f222477c;
            int i2 = bcVar.f222478d;
            C58485gu t = eVar.f216726b.mo73220t();
            if (t.size() < 3) {
                t = C58485gu.m89848p(10, 30, 90);
            }
            int i3 = bcVar.f222476b - 1;
            int intValue = ((Integer) C58557jl.m90131l(t)).intValue();
            if (i3 < t.size()) {
                intValue = ((Integer) t.get(i3)).intValue();
            }
            if (i2 - i < intValue) {
                z = false;
            }
            int i4 = bcVar.f222476b;
        }
        gVar.mo76660b(Boolean.valueOf(z));
    }
}
