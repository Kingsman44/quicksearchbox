package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6166a.C78240d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78246e;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.aa */
/* compiled from: PG */
public final class C78667aa implements C78240d {

    /* renamed from: a */
    public static final C59071e f216568a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.l.e.aa");

    /* renamed from: b */
    public final C76092h f216569b;

    /* renamed from: c */
    public final C80987g f216570c;

    /* renamed from: d */
    public final C78246e f216571d;

    /* renamed from: e */
    public final C81252aq f216572e;

    /* renamed from: f */
    public final C78688o f216573f;

    /* renamed from: g */
    public final C83357g f216574g = new C83361k(C78699z.m126418d(), C78263m.class);

    /* renamed from: h */
    private final C22871g f216575h;

    /* renamed from: i */
    private final C22871g f216576i;

    public C78667aa(C22871g gVar, C22871g gVar2, C76092h hVar, C80987g gVar3, C78246e eVar, C81252aq aqVar, C78688o oVar) {
        this.f216575h = gVar;
        this.f216576i = gVar2;
        this.f216569b = hVar;
        this.f216570c = gVar3;
        this.f216571d = eVar;
        this.f216572e = aqVar;
        this.f216573f = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo73163a(String str) {
        return this.f216576i.mo28210j(this.f216576i.mo28202b("[NGA] waitFor.ContentTask", new C78690q(this, str)), "[NGA] fetchTactileChips", new C78691r(this));
    }

    /* renamed from: b */
    public final String mo73164b() {
        String valueOf = String.valueOf(C90719ac.f253778a.f253779b.nextLong());
        mo73165c();
        C60870cx a = this.f216576i.mo28201a("[NGA] fetchContent", new C78692s(this));
        this.f216574g.mo76660b(new C78675b(valueOf, a, Optional.empty()));
        new C90873ag(a, this.f216575h, "fetchContentCallback", new C78693t(this, valueOf)).mo85223a(C78694u.f216625a);
        return valueOf;
    }

    /* renamed from: c */
    public final void mo73165c() {
        ((C78699z) ((C83361k) this.f216574g).f227199b.get()).mo73576a().cancel(false);
        this.f216574g.mo76660b(C78699z.m126418d());
    }
}
