package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74945h;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.ao */
/* compiled from: PG */
public final class C78988ao implements C79162t {

    /* renamed from: a */
    public final C58974d f217258a = C58974d.m91136j();

    /* renamed from: b */
    public final C79162t f217259b;

    /* renamed from: c */
    public final C83334w f217260c;

    /* renamed from: d */
    private final C91142g f217261d;

    /* renamed from: e */
    private final C22871g f217262e;

    public C78988ao(C91142g gVar, C22871g gVar2, C83334w wVar, C79162t tVar) {
        this.f217261d = gVar;
        this.f217262e = gVar2;
        this.f217260c = wVar;
        this.f217259b = tVar;
    }

    /* renamed from: a */
    public final C80515d mo73713a() {
        return this.f217259b.mo73713a();
    }

    /* renamed from: b */
    public final C60870cx mo73714b(String str, List list, C74965n nVar, C74945h hVar) {
        long d = this.f217261d.mo85399d(C90126fx.f251731oO);
        C60870cx e = C90877ak.m148471e(this.f217259b.mo73714b(str, list, nVar, hVar), d, TimeUnit.MILLISECONDS, this.f217262e);
        this.f217262e.mo28211k(e, "[NGA] TimeConstrainedIntentGenerator.timeout", new C78987an(this, d, nVar));
        return this.f217262e.mo28206f(e, "[NGA] TimeConstrainedIntentGenerator.catch", TimeoutException.class, C78986am.f217254a);
    }

    /* renamed from: c */
    public final boolean mo73715c() {
        return this.f217259b.mo73715c();
    }
}
