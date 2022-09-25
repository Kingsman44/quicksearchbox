package com.google.android.apps.gsa.nga.engine.p5978b.p5986d;

import com.google.android.apps.gsa.nga.shared.android.p6325a.C80944e;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.nga.engine.b.d.a */
/* compiled from: PG */
public final /* synthetic */ class C75215a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ f f209664a;

    public /* synthetic */ C75215a(f fVar) {
        this.f209664a = fVar;
    }

    public final void run() {
        f fVar = this.f209664a;
        synchronized (fVar) {
            fVar.f = false;
            C80944e eVar = fVar.d;
            C58485gu guVar = C80944e.f221931a;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                eVar.mo74728a((C89094c) guVar.get(i2));
            }
        }
    }
}
