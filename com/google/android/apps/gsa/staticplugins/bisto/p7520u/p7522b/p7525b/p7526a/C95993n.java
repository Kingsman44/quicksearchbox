package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95381ce;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.n */
/* compiled from: PG */
public final class C95993n extends C95980a {

    /* renamed from: c */
    public static final C59071e f268747c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.n");

    /* renamed from: d */
    static final long f268748d = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: e */
    public final C95355bf f268749e;

    /* renamed from: f */
    public final C68214a f268750f;

    /* renamed from: g */
    public final C68214a f268751g;

    /* renamed from: h */
    public final C95307m f268752h;

    /* renamed from: i */
    public final C68214a f268753i;

    /* renamed from: j */
    private final C22871g f268754j;

    /* renamed from: k */
    private final C22871g f268755k;

    /* renamed from: l */
    private final C95357bh f268756l;

    /* renamed from: m */
    private final C96023bs f268757m;

    public C95993n(C96023bs bsVar, C95447t tVar, C68214a aVar, C68214a aVar2, C22871g gVar, C22871g gVar2, C95307m mVar, C95357bh bhVar, C68214a aVar3, C95850a aVar4) {
        super(bsVar, "WiredInitState", tVar, aVar4);
        this.f268749e = tVar;
        this.f268750f = aVar2;
        this.f268751g = aVar;
        this.f268757m = bsVar;
        this.f268754j = gVar;
        this.f268755k = gVar2;
        this.f268752h = mVar;
        this.f268756l = bhVar;
        this.f268753i = aVar3;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268757m.mo89831a();
        SettableFuture settableFuture = new SettableFuture();
        this.f268749e.mo89273n(new C95992m(this, settableFuture));
        C90875ai.m148465b(C95988i.f268741a, this.f268749e.mo89257D(4, 1, C95381ce.m157721b(this.f268756l.f266785b).toByteArray()), this.f268754j, "onFailCapabilityCheckFuture").mo85223a(new C95989j(settableFuture));
        C90875ai.m148465b(new C95990k(this), C90877ak.m148471e(settableFuture, f268748d, TimeUnit.MILLISECONDS, this.f268755k), this.f268754j, "getDeviceCapabilitiesWithTimeout").mo85223a(new C95991l(this));
    }
}
