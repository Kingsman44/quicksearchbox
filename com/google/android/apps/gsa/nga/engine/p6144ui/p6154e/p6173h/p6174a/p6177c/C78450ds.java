package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78518aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78530am;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78558m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78563r;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.C78508k;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78808j;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78817s;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80751dz;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.ds */
/* compiled from: PG */
final class C78450ds extends C78394bq {

    /* renamed from: d */
    private static final Duration f216003d = Duration.ofSeconds(5);

    /* renamed from: a */
    public final C78449dr f216004a;

    /* renamed from: b */
    public final C78508k f216005b;

    /* renamed from: c */
    public final C78387bj f216006c;

    /* renamed from: e */
    private final C83358h f216007e;

    /* renamed from: f */
    private final C83358h f216008f;

    /* renamed from: g */
    private final C78817s f216009g;

    public C78450ds(C78449dr drVar, C78508k kVar, C78387bj bjVar, C83358h hVar, C78817s sVar, C22871g gVar) {
        super(gVar);
        this.f216004a = drVar;
        this.f216005b = kVar;
        this.f216006c = bjVar;
        this.f216008f = hVar;
        this.f216009g = sVar;
        int b = drVar.mo73377b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            C78530am d = C78540aw.m126175d();
            ((C78518aa) d).f216257a = C78563r.m126230a(drVar.mo73376a());
            this.f216007e = new C83361k(d.mo73434a(), C78263m.class);
        } else if (i == 1) {
            C78530am d2 = C78540aw.m126175d();
            C80751dz c = drVar.mo73378c();
            c.getClass();
            ((C78518aa) d2).f216257a = new C78558m(c);
            this.f216007e = new C83361k(d2.mo73434a(), C78263m.class);
        } else {
            throw new AssertionError("Can not happen");
        }
    }

    /* renamed from: a */
    public final C83358h mo73322a() {
        return this.f216007e;
    }

    /* renamed from: b */
    public final void mo73323b() {
        this.f216009g.mo73617n(C78808j.ESCAPE_HATCH);
        mo73362o("[NGA] PostExecutionStage.TIMEOUT", f216003d, new C78446do(this));
        this.f215839q.mo76663c(this.f216008f, new C78447dp(this));
    }

    /* renamed from: c */
    public final void mo73324c() {
        this.f216009g.mo73618o();
    }
}
