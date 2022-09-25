package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.graphics.Rect;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91434p;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91435q;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91436r;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91439u;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91777aa;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91778ab;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91793aq;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91794ar;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91801h;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.C105336e;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105311a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105312b;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105313c;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105367a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105380k;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105388a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105432b;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23188h;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23278b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23279c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62921ba;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.v */
/* compiled from: PG */
public abstract class C105305v extends C23056g implements C105388a {

    /* renamed from: g */
    public static final C59071e f293791g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.a.v");

    /* renamed from: a */
    private final C7642eo f293792a;

    /* renamed from: b */
    private C105303t f293793b;

    /* renamed from: c */
    private C86051l f293794c;

    /* renamed from: d */
    private C105311a f293795d;

    /* renamed from: e */
    private final C68214a f293796e;

    /* renamed from: f */
    private final C90479a f293797f;

    /* renamed from: h */
    public final C105432b f293798h;

    /* renamed from: i */
    protected final C23278b f293799i;

    /* renamed from: j */
    public final C105380k f293800j;

    /* renamed from: k */
    public final C22871g f293801k;

    /* renamed from: l */
    final C86124t f293802l;

    /* renamed from: m */
    private final C105304u f293803m;

    /* renamed from: n */
    private final C105367a f293804n;

    protected C105305v(C23052c cVar, C105432b bVar, C22871g gVar, C68214a aVar, C90479a aVar2, C23279c cVar2, C105367a aVar3, C105380k kVar, C86124t tVar, C7642eo eoVar) {
        super(cVar);
        this.f293799i = cVar2.mo28756a(cVar);
        this.f293798h = bVar;
        this.f293801k = gVar;
        this.f293796e = aVar;
        this.f293797f = aVar2;
        this.f293804n = aVar3;
        this.f293800j = kVar;
        this.f293802l = tVar;
        this.f293792a = eoVar;
        C105291h hVar = new C105291h(bVar);
        C105294k kVar2 = new C105294k(bVar);
        if (tVar.mo79746e(C90010bp.f246995g)) {
            cVar.mo28433w(C91435q.class, new C105297n(bVar));
        }
        this.f293803m = new C105304u(this);
        cVar.mo28433w(C91434p.class, hVar);
        cVar.mo28433w(C91439u.class, kVar2);
        cVar.mo28433w(C105312b.class, new C105259d(bVar));
        cVar.mo28433w(C105336e.class, new C105286e(bVar));
        cVar.mo28433w(C91436r.class, new C105289f(kVar, cVar));
    }

    /* renamed from: jt */
    private final void m174908jt() {
        this.f63405W.mo28433w(C105313c.class, new C105301r(this));
    }

    /* renamed from: p */
    private final void m174909p() {
        if (((C23186f) this.f293798h.mo94539d()).mo28631l()) {
            ((C23186f) this.f293798h.mo94539d()).mo28626g(C105176a.f293241a);
        }
    }

    /* renamed from: a */
    public final void mo94582a() {
        mo94712n();
        ((C23251a) this.f293798h.mo94547l()).mo28730f(true, false);
        C105311a aVar = this.f293795d;
        if (aVar != null) {
            aVar.mo94575i(this.f293792a);
        }
        if (((C23186f) this.f293798h.mo94541f()).mo28631l()) {
            ((C23186f) this.f293798h.mo94541f()).mo28626g(C105205b.f293422a);
        }
    }

    /* renamed from: b */
    public void mo94583b(boolean z) {
    }

    /* renamed from: c */
    public final void mo94584c(int i, int i2, boolean z) {
        if (!((Boolean) ((C23251a) this.f293798h.mo94547l()).f63720e).booleanValue()) {
            if (i == 0) {
                if (i2 == 0) {
                    m174909p();
                    i = 0;
                    i2 = 0;
                } else {
                    i = 0;
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            ((C23251a) this.f293798h.mo94550o()).mo28730f(valueOf, false);
            ((C23251a) this.f293798h.mo94549n()).mo28730f(valueOf2, false);
        }
    }

    /* renamed from: d */
    public final void mo94585d(ProtoParcelable protoParcelable, int i, long j) {
        this.f293800j.mo94776b(protoParcelable, i, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C8142xb mo94566e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo94567f(C91801h hVar);

    /* renamed from: g */
    public final void mo94586g(long j, C58485gu guVar) {
        this.f293800j.mo94775a(j, guVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo94568h(boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo94569i(C23028x xVar);

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        m174908jt();
        this.f293800j.f293995g = this.f293803m;
        ((C23251a) this.f293798h.mo94547l()).mo28730f(false, false);
        mo94569i(xVar);
        mo94570j(xVar);
    }

    /* renamed from: iD */
    public void mo28439iD(ProtoParcelable protoParcelable) {
        m174908jt();
        C91801h hVar = (C91801h) C23245b.m43557b(protoParcelable, C91801h.f256011n.getParserForType(), C62921ba.m95368a(), true);
        hVar.getClass();
        mo94660m(hVar);
    }

    /* renamed from: iE */
    public void mo28498iE() {
        C23278b bVar = this.f293799i;
        C105232c cVar = new C105232c(this);
        C23188h hVar = bVar.f63752b.f63757a;
        hVar.f63589e = cVar;
        for (C23056g l : hVar.f63586b.keySet()) {
            cVar.f293504a.mo94711l(l);
        }
        C105303t tVar = new C105303t(this);
        this.f293793b = tVar;
        this.f293804n.mo94763a(tVar);
        C105300q qVar = new C105300q(this);
        this.f293794c = qVar;
        ((C86054o) this.f293796e.mo27525b()).mo79675i(qVar);
        this.f293800j.f293995g = this.f293803m;
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        ((C86054o) this.f293796e.mo27525b()).mo79681o(this.f293794c);
        this.f293804n.mo94765c(this.f293793b);
        this.f293800j.f293995g = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo94570j(C23028x xVar);

    /* renamed from: je */
    public final void mo94587je(Rect rect, long j) {
        this.f293800j.mo94777c(rect, j);
    }

    /* renamed from: jf */
    public final void mo94588jf(long j) {
        this.f293800j.mo94778d(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo94661k(C105311a aVar) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo94711l(C23056g gVar) {
        if (gVar instanceof C105311a) {
            C105311a aVar = (C105311a) gVar;
            this.f293795d = aVar;
            mo94661k(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo94660m(C91801h hVar) {
        ((C23251a) this.f293798h.mo94545j()).mo28730f(Boolean.valueOf(hVar.f256016d), false);
        ((C23251a) this.f293798h.mo94546k()).mo28730f(Boolean.valueOf(hVar.f256017e), false);
        this.f293798h.mo94557v().mo28730f(Boolean.valueOf(hVar.f256023k), false);
        this.f293798h.mo94558w().mo28730f(Boolean.valueOf(hVar.f256025m), false);
        this.f293798h.mo94555t().mo28730f(Boolean.valueOf((hVar.f256013a & 32) != 0), false);
        ((C23251a) this.f293798h.mo94544i()).mo28730f(Boolean.valueOf((hVar.f256013a & 1024) != 0), false);
        ((C23251a) this.f293798h.mo94554s()).mo28730f(Boolean.valueOf(this.f293802l.mo79746e(C90010bp.f246990bf)), false);
        this.f293798h.mo94561z().mo28730f(Integer.valueOf((int) (C90719ac.f253778a.f253779b.nextLong() % 214748364)), false);
        if (this.f293797f.mo84228c()) {
            ((C23251a) this.f293798h.mo94553r()).mo28730f(Boolean.valueOf(this.f293802l.mo79746e(C90010bp.f246906B)), false);
        }
        ((C23251a) this.f293798h.mo94552q()).mo28730f(C58833ax.m90834k(mo94566e()), false);
        ((C23251a) this.f293798h.mo94547l()).mo28730f(true, false);
        ((C23251a) this.f293798h.mo94551p()).mo28730f(true, false);
        ((C23251a) this.f293798h.mo94543h()).mo28730f(true, false);
        mo94568h(((Boolean) ((C23251a) this.f293798h.mo94545j()).f63720e).booleanValue(), ((Boolean) ((C23251a) this.f293798h.mo94546k()).f63720e).booleanValue(), ((Boolean) this.f293798h.mo94557v().f63720e).booleanValue());
        mo94567f(hVar);
        C91793aq aqVar = (C91793aq) C91794ar.f255978d.createBuilder();
        C8142xb e = mo94566e();
        aqVar.copyOnWrite();
        C91794ar arVar = (C91794ar) aqVar.instance;
        arVar.f255981b = e.f28649u;
        arVar.f255980a |= 1;
        boolean z = hVar.f256016d;
        aqVar.copyOnWrite();
        C91794ar arVar2 = (C91794ar) aqVar.instance;
        arVar2.f255980a |= 2;
        arVar2.f255982c = z;
        ((C23186f) this.f293798h.mo94541f()).mo28624e("TYPE_TOOLTIP", C23245b.m43556a((C91794ar) aqVar.build()));
        C91777aa aaVar = (C91777aa) C91778ab.f255931d.createBuilder();
        C8142xb e2 = mo94566e();
        aaVar.copyOnWrite();
        C91778ab abVar = (C91778ab) aaVar.instance;
        abVar.f255934b = e2.f28649u;
        abVar.f255933a |= 1;
        boolean z2 = hVar.f256016d;
        aaVar.copyOnWrite();
        C91778ab abVar2 = (C91778ab) aaVar.instance;
        abVar2.f255933a |= 2;
        abVar2.f255935c = z2;
        ((C23186f) this.f293798h.mo94539d()).mo28624e("TYPE_REACTION", C23245b.m43556a((C91778ab) aaVar.build()));
        if (this.f293802l.mo79746e(C90010bp.f246995g)) {
            ((C23186f) this.f293798h.mo94540e()).mo28624e("TYPE_SCRIM", ProtoParcelable.f63423a);
        }
    }

    /* renamed from: n */
    public final void mo94712n() {
        C58976aa aaVar = C58975e.f156826a;
        ((C23251a) this.f293798h.mo94550o()).mo28730f(0, false);
        ((C23251a) this.f293798h.mo94549n()).mo28730f(0, false);
        m174909p();
    }
}
