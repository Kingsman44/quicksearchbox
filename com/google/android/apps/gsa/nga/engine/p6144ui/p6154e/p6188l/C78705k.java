package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.k */
/* compiled from: PG */
public final /* synthetic */ class C78705k implements k {

    /* renamed from: a */
    public final /* synthetic */ C78710p f216634a;

    public /* synthetic */ C78705k(C78710p pVar) {
        this.f216634a = pVar;
    }

    /* renamed from: gE */
    public final void mo73583gE(C58528ij ijVar) {
        C78710p pVar = this.f216634a;
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            Runnable runnable = (Runnable) pVar.f216646a.get((Integer) lA.next());
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
