package com.google.android.apps.gsa.nga.engine.p5978b.p5987f.p5988a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.b.f.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C75221ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ ak f209671a;

    /* renamed from: b */
    public final /* synthetic */ ac f209672b;

    public /* synthetic */ C75221ad(ak akVar, ac acVar) {
        this.f209671a = akVar;
        this.f209672b = acVar;
    }

    public final void run() {
        ak akVar = this.f209671a;
        ac acVar = this.f209672b;
        C75227ar arVar = akVar.a;
        c cVar = new c(new k(acVar, 1));
        arVar.f209692c.clear();
        Optional optional = (Optional) ((C83361k) arVar.f209691b).f227199b.get();
        if (optional.isPresent()) {
            ((C75225ao) optional.get()).mo71581a(cVar);
        }
    }
}
