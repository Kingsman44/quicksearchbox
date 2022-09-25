package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.s */
/* compiled from: PG */
public final /* synthetic */ class C77342s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77349z f213301a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f213302b;

    /* renamed from: c */
    public final /* synthetic */ boolean f213303c;

    public /* synthetic */ C77342s(C77349z zVar, C74965n nVar, boolean z) {
        this.f213301a = zVar;
        this.f213302b = nVar;
        this.f213303c = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77349z zVar = this.f213301a;
        C74965n nVar = this.f213302b;
        boolean z = this.f213303c;
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        ((Optional) obj).ifPresent(new C77339p(zVar, lVar, nVar, z));
        return (C80401n) lVar.build();
    }
}
