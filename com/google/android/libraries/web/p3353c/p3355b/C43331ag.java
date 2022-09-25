package com.google.android.libraries.web.p3353c.p3355b;

import android.net.Uri;
import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3350b.C43243b;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43370o;
import com.google.android.libraries.web.p3353c.C43372q;
import com.google.android.libraries.web.p3353c.C43374s;
import com.google.android.libraries.web.p3353c.C43375t;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3354a.C43317a;
import com.google.android.libraries.web.p3353c.p3354a.C43318b;
import com.google.android.libraries.web.p3353c.p3354a.C43320d;
import com.google.android.libraries.web.p3353c.p3354a.C43321e;
import com.google.android.libraries.web.p3353c.p3354a.C43322f;
import com.google.android.libraries.web.p3404e.C43770f;
import com.google.android.libraries.web.p3404e.p3405a.C43765b;
import com.google.android.libraries.web.p3418j.C43840e;
import com.google.android.libraries.web.p3418j.C43851p;
import com.google.android.libraries.web.p3418j.p3419a.C43836y;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.shared.C44076a;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.c.b.ag */
/* compiled from: PG */
public final class C43331ag implements C43945v {

    /* renamed from: e */
    private static final C59071e f113184e = C59071e.m91332i("com.google.android.libraries.web.c.b.ag");

    /* renamed from: a */
    public final C43904a f113185a;

    /* renamed from: b */
    public final C43339h f113186b;

    /* renamed from: c */
    public final C43332ah f113187c;

    /* renamed from: d */
    public final C43269t f113188d;

    /* renamed from: f */
    private final C43840e f113189f;

    /* renamed from: g */
    private final AtomicReference f113190g = new AtomicReference();

    /* renamed from: h */
    private final Set f113191h = new HashSet();

    /* renamed from: i */
    private final C43243b f113192i;

    /* renamed from: j */
    private final boolean f113193j;

    /* renamed from: k */
    private final C43234b f113194k;

    /* renamed from: l */
    private boolean f113195l = false;

    public C43331ag(C43904a aVar, C43836y yVar, WebModelProvider webModelProvider, WebModelProvider webModelProvider2, C43269t tVar, C43234b bVar) {
        this.f113185a = aVar;
        this.f113189f = C43851p.m77391a(yVar.mo46847a(C44082a.f114755a, aVar));
        this.f113192i = (C43243b) webModelProvider2.mo47072a(C43243b.class);
        this.f113186b = (C43339h) webModelProvider2.mo47072a(C43339h.class);
        this.f113187c = (C43332ah) webModelProvider.mo47072a(C43332ah.class);
        this.f113193j = tVar.mo46384b().f112975n;
        this.f113188d = tVar;
        this.f113194k = bVar;
        aVar.mo46410c().mo46895a(new C43330af(this));
    }

    /* renamed from: v */
    private final void m76445v(C43376u uVar) {
        C43324a c;
        if (this.f113185a.mo46410c().mo46898d() && (c = this.f113186b.mo46464c()) != null) {
            c.mo46426e(uVar);
        }
    }

    /* renamed from: w */
    private static void m76446w(C43375t tVar, C43369n nVar) {
        C43369n a = C43369n.m76519a(((C43376u) tVar.instance).f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        if (a == nVar) {
            C59052c cVar = (C59052c) f113184e.mo56224b();
            cVar.mo56380ai(C58979ad.LARGE);
            ((C59052c) cVar.mo56372aa(54121)).mo56387q("Updating load state to old value: %s", nVar.f113312h);
        }
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        uVar.f113330c = nVar.f113312h;
        uVar.f113328a |= 2;
    }

    /* renamed from: a */
    public final C43376u mo46439a() {
        if (this.f113194k.f112985d) {
            return (C43376u) C43345n.m76492a(this.f113185a).mo62784e();
        }
        return (C43376u) this.f113189f.mo46841d();
    }

    /* renamed from: b */
    public final void mo46440b(C43318b bVar) {
        this.f113191h.add(bVar);
    }

    /* renamed from: c */
    public final void mo46441c(String str) {
        C43376u a = mo46439a();
        C43367l lVar = a.f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        C43366k a2 = C43366k.m76517a(lVar.f113299e);
        if (a2 == null) {
            a2 = C43366k.UNSPECIFIED;
        }
        C58838bb.m90883r(a2.equals(C43366k.GO_BACK) || a2.equals(C43366k.GO_FORWARD));
        C43375t tVar = (C43375t) a.toBuilder();
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        uVar.f113335h = null;
        uVar.f113328a &= -65;
        tVar.copyOnWrite();
        C43376u uVar2 = (C43376u) tVar.instance;
        str.getClass();
        uVar2.f113328a |= 1;
        uVar2.f113329b = str;
        C43376u uVar3 = (C43376u) tVar.build();
        mo46452n(uVar3);
        C43324a c = this.f113186b.mo46464c();
        if (c != null) {
            c.mo46427f(uVar3);
        }
    }

    /* renamed from: d */
    public final void mo46442d(String str) {
        C43375t tVar = (C43375t) mo46439a().toBuilder();
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        uVar.f113335h = null;
        uVar.f113328a &= -65;
        mo46452n((C43376u) tVar.build());
        C43324a c = this.f113186b.mo46464c();
        if (c != null) {
            c.mo46424c(str);
        }
    }

    /* renamed from: e */
    public final void mo46443e(C43363h hVar) {
        C43372q qVar;
        if (hVar == null && (qVar = (C43372q) this.f113190g.get()) != null && (hVar = qVar.f113317b) == null) {
            hVar = C43363h.f113275f;
        }
        C43375t tVar = (C43375t) mo46439a().toBuilder();
        m76446w(tVar, hVar == null ? C43369n.SUCCESS : C43369n.FAILED);
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        uVar.f113328a |= 16;
        uVar.f113333f = 100;
        if (hVar != null) {
            tVar.copyOnWrite();
            C43376u uVar2 = (C43376u) tVar.instance;
            uVar2.f113331d = hVar;
            uVar2.f113328a |= 4;
        }
        C43376u uVar3 = (C43376u) tVar.build();
        mo46452n(uVar3);
        Collection.EL.stream(this.f113191h).forEach(new C43327ac(uVar3));
        if (this.f113185a.mo46410c().mo46898d()) {
            for (C43356y yVar : this.f113186b.mo46467f()) {
                for (C43317a a : yVar.f113252a.values()) {
                    a.mo46415a(uVar3);
                }
            }
            C43324a c = this.f113186b.mo46464c();
            if (c != null) {
                c.mo46428g(uVar3);
            }
        }
    }

    /* renamed from: f */
    public final void mo46444f() {
        C43376u a = mo46439a();
        C43369n a2 = C43369n.m76519a(a.f113330c);
        if (a2 == null) {
            a2 = C43369n.UNSPECIFIED;
        }
        if (!C43370o.f113313a.contains(a2)) {
            C43369n a3 = C43369n.m76519a(a.f113330c);
            if (a3 == null) {
                a3 = C43369n.UNSPECIFIED;
            }
            if (!a3.equals(C43369n.UNSPECIFIED)) {
                C43369n a4 = C43369n.m76519a(a.f113330c);
                if (a4 == null) {
                    a4 = C43369n.UNSPECIFIED;
                }
                if (!C43370o.m76522b(a4)) {
                    mo46454p();
                }
                if (this.f113195l) {
                    mo46445g();
                }
                mo46443e((C43363h) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo46445g() {
        C43324a c;
        if (this.f113195l) {
            this.f113195l = false;
            C43376u a = mo46439a();
            if (this.f113185a.mo46410c().mo46898d() && (c = this.f113186b.mo46464c()) != null) {
                c.mo46425d(a);
            }
        }
    }

    /* renamed from: h */
    public final void mo46446h() {
        C43324a c;
        if (this.f113185a.mo46410c().mo46898d() && (c = this.f113186b.mo46464c()) != null) {
            c.mo46437p();
        }
    }

    /* renamed from: i */
    public final void mo46447i(C43367l lVar) {
        C43324a c;
        if ((mo46439a().f113328a & 64) != 0) {
            C43375t tVar = (C43375t) mo46439a().toBuilder();
            tVar.copyOnWrite();
            C43376u uVar = (C43376u) tVar.instance;
            lVar.getClass();
            uVar.f113335h = lVar;
            uVar.f113328a |= 64;
            mo46452n((C43376u) tVar.build());
            if (this.f113185a.mo46410c().mo46898d() && (c = this.f113186b.mo46464c()) != null) {
                c.mo46433l(lVar);
            }
        }
    }

    /* renamed from: j */
    public final void mo46448j(C43367l lVar, boolean z, Consumer consumer) {
        String str = lVar.f113296b;
        int i = lVar.f113299e;
        C43366k kVar = C43366k.UNSPECIFIED;
        this.f113187c.f113196a = true;
        C43375t tVar = (C43375t) mo46439a().toBuilder();
        String d = C44076a.m77821d(lVar.f113297c);
        C43364i iVar = (C43364i) lVar.toBuilder();
        iVar.copyOnWrite();
        C43367l lVar2 = (C43367l) iVar.instance;
        d.getClass();
        lVar2.f113295a |= 2;
        lVar2.f113297c = d;
        iVar.copyOnWrite();
        C43367l lVar3 = (C43367l) iVar.instance;
        d.getClass();
        lVar3.f113295a = 1 | lVar3.f113295a;
        lVar3.f113296b = d;
        iVar.copyOnWrite();
        C43367l lVar4 = (C43367l) iVar.instance;
        lVar4.f113295a |= 32;
        lVar4.f113301g = false;
        C43367l lVar5 = (C43367l) iVar.build();
        C43367l lVar6 = ((C43376u) tVar.instance).f113335h;
        if (lVar6 == null) {
            lVar6 = C43367l.f113293h;
        }
        C43364i iVar2 = (C43364i) lVar6.toBuilder();
        iVar2.mergeFrom(lVar5);
        C43367l lVar7 = (C43367l) iVar2.build();
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        lVar7.getClass();
        uVar.f113335h = lVar7;
        uVar.f113328a |= 64;
        C43374s sVar = C43374s.RENDER_ALIVE;
        tVar.copyOnWrite();
        C43376u uVar2 = (C43376u) tVar.instance;
        uVar2.f113337j = sVar.f113325e;
        uVar2.f113328a |= 256;
        if (this.f113193j) {
            consumer.accept(Uri.parse(d));
        }
        C43376u uVar3 = (C43376u) tVar.build();
        mo46452n(uVar3);
        if (!z) {
            mo46455q(lVar7);
        }
        if (this.f113185a.mo46410c().mo46898d()) {
            for (C43356y yVar : this.f113186b.mo46467f()) {
                for (C43320d a : yVar.f113253b.values()) {
                    a.mo46419a();
                }
            }
            C43324a c = this.f113186b.mo46464c();
            if (c != null) {
                c.mo46429h(uVar3);
            }
        }
    }

    /* renamed from: k */
    public final void mo46449k(C43367l lVar) {
        mo46450l(lVar, 1);
    }

    /* renamed from: l */
    public final void mo46450l(C43367l lVar, Object obj) {
        mo46448j(lVar, false, new C43325aa(this, lVar, obj));
    }

    /* renamed from: m */
    public final void mo46451m(C43374s sVar) {
        C43375t tVar = (C43375t) mo46439a().toBuilder();
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        uVar.f113337j = sVar.f113325e;
        uVar.f113328a |= 256;
        mo46452n((C43376u) tVar.build());
    }

    /* renamed from: n */
    public final void mo46452n(C43376u uVar) {
        if (this.f113194k.f112985d) {
            C43345n.m76492a(this.f113185a).mo62807f(uVar);
        } else {
            this.f113189f.mo46840c(uVar);
        }
        this.f113192i.f113006a.ifPresent(new C43326ab(this, uVar));
    }

    /* renamed from: o */
    public final void mo46453o(String str, String str2) {
        C43372q qVar = (C43372q) this.f113190g.get();
        if (qVar != null && !qVar.f113316a.equals(str)) {
            this.f113190g.set((Object) null);
        }
        C43376u a = mo46439a();
        if ((a.f113328a & 64) == 0) {
            C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
            iVar.copyOnWrite();
            C43367l lVar = (C43367l) iVar.instance;
            str.getClass();
            lVar.f113295a |= 2;
            lVar.f113297c = str;
            C43366k kVar = C43366k.UNSPECIFIED;
            iVar.copyOnWrite();
            C43367l lVar2 = (C43367l) iVar.instance;
            lVar2.f113299e = kVar.f113292i;
            lVar2.f113295a |= 8;
            mo46449k((C43367l) iVar.build());
            a = mo46439a();
        }
        C43375t tVar = (C43375t) a.toBuilder();
        m76446w(tVar, C43369n.WAITING_FOR_RESPONSE);
        tVar.copyOnWrite();
        C43376u uVar = (C43376u) tVar.instance;
        str.getClass();
        uVar.f113328a |= 1;
        uVar.f113329b = str;
        C43367l lVar3 = a.f113335h;
        if (lVar3 == null) {
            lVar3 = C43367l.f113293h;
        }
        C43366k a2 = C43366k.m76517a(lVar3.f113299e);
        if (a2 == null) {
            a2 = C43366k.UNSPECIFIED;
        }
        tVar.copyOnWrite();
        C43376u uVar2 = (C43376u) tVar.instance;
        uVar2.f113332e = a2.f113292i;
        uVar2.f113328a |= 8;
        C43367l lVar4 = a.f113335h;
        if (lVar4 == null) {
            lVar4 = C43367l.f113293h;
        }
        C43323b bVar = lVar4.f113300f;
        if (bVar == null) {
            bVar = C43323b.f113174a;
        }
        tVar.copyOnWrite();
        C43376u uVar3 = (C43376u) tVar.instance;
        bVar.getClass();
        uVar3.f113336i = bVar;
        uVar3.f113328a |= 128;
        tVar.copyOnWrite();
        C43376u uVar4 = (C43376u) tVar.instance;
        uVar4.f113331d = null;
        uVar4.f113328a &= -5;
        tVar.copyOnWrite();
        C43376u uVar5 = (C43376u) tVar.instance;
        uVar5.f113335h = null;
        uVar5.f113328a &= -65;
        if (str2 == null) {
            tVar.copyOnWrite();
            C43376u uVar6 = (C43376u) tVar.instance;
            uVar6.f113328a &= -33;
            uVar6.f113334g = C43376u.f113326k.f113334g;
        } else {
            tVar.copyOnWrite();
            C43376u uVar7 = (C43376u) tVar.instance;
            uVar7.f113328a |= 32;
            uVar7.f113334g = str2;
        }
        if (a.f113333f == 100) {
            tVar.copyOnWrite();
            C43376u uVar8 = (C43376u) tVar.instance;
            uVar8.f113328a |= 16;
            uVar8.f113333f = 0;
        }
        C43376u uVar9 = (C43376u) tVar.build();
        mo46452n(uVar9);
        this.f113195l = true;
        Collection.EL.stream(this.f113191h).forEach(new C43329ae());
        if (this.f113185a.mo46410c().mo46898d()) {
            for (C43356y yVar : this.f113186b.mo46467f()) {
                for (C43321e b : yVar.f113254c.values()) {
                    b.mo46420b(uVar9);
                }
            }
            C43324a c = this.f113186b.mo46464c();
            if (c != null) {
                c.mo46430i(uVar9);
            }
        }
    }

    /* renamed from: p */
    public final void mo46454p() {
        C43376u a = mo46439a();
        C43369n a2 = C43369n.m76519a(a.f113330c);
        if (a2 == null) {
            a2 = C43369n.UNSPECIFIED;
        }
        if (!C43370o.f113313a.contains(a2)) {
            C43375t tVar = (C43375t) a.toBuilder();
            m76446w(tVar, C43369n.RENDERING_AND_RECEIVING_BYTES);
            C43376u uVar = (C43376u) tVar.build();
            mo46452n(uVar);
            C43369n a3 = C43369n.m76519a(a.f113330c);
            if (a3 == null) {
                a3 = C43369n.UNSPECIFIED;
            }
            if (!C43370o.m76521a(a3)) {
                m76445v(uVar);
            }
            if (this.f113185a.mo46410c().mo46898d()) {
                for (C43356y yVar : this.f113186b.mo46467f()) {
                    for (C43322f a4 : yVar.f113255d.values()) {
                        a4.mo46421a();
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo46455q(C43367l lVar) {
        C43324a c;
        Collection.EL.stream(this.f113191h).forEach(new C43328ad());
        if (this.f113185a.mo46410c().mo46898d() && (c = this.f113186b.mo46464c()) != null) {
            c.mo46434m(lVar);
        }
    }

    /* renamed from: r */
    public final void mo46456r(boolean z, boolean z2) {
        C43765b.m77278a(this.f113185a).mo62807f(new C43770f(z, z2));
    }

    /* renamed from: s */
    public final void mo46457s(int i) {
        boolean z = false;
        int min = Math.min(Math.max(0, i), 100);
        C43376u a = mo46439a();
        if (a.f113333f != min) {
            C43375t tVar = (C43375t) a.toBuilder();
            tVar.copyOnWrite();
            C43376u uVar = (C43376u) tVar.instance;
            uVar.f113328a |= 16;
            uVar.f113333f = min;
            if (min != 100 && min >= 11) {
                C43369n a2 = C43369n.m76519a(a.f113330c);
                if (a2 == null) {
                    a2 = C43369n.UNSPECIFIED;
                }
                if (!C43370o.m76521a(a2)) {
                    m76446w(tVar, C43369n.RECEIVING_BYTES);
                    z = true;
                }
            }
            C43376u uVar2 = (C43376u) tVar.build();
            mo46452n(uVar2);
            if (z) {
                m76445v(uVar2);
            }
        }
    }

    /* renamed from: t */
    public final void mo46458t(String str) {
        boolean z;
        C43376u a = mo46439a();
        if (!a.f113334g.equals(str)) {
            C43375t tVar = (C43375t) a.toBuilder();
            C43369n a2 = C43369n.m76519a(a.f113330c);
            if (a2 == null) {
                a2 = C43369n.UNSPECIFIED;
            }
            if (!C43370o.m76521a(a2)) {
                m76446w(tVar, C43369n.RECEIVING_BYTES);
                z = true;
            } else {
                z = false;
            }
            tVar.copyOnWrite();
            C43376u uVar = (C43376u) tVar.instance;
            str.getClass();
            uVar.f113328a |= 32;
            uVar.f113334g = str;
            C43376u uVar2 = (C43376u) tVar.build();
            mo46452n(uVar2);
            if (z) {
                m76445v(uVar2);
            }
        }
    }

    /* renamed from: u */
    public final void mo46459u(String str) {
        C43376u a = mo46439a();
        if (a.f113329b.equals(str)) {
            return;
        }
        if ((a.f113328a & 64) == 0 || !str.isEmpty()) {
            C43375t tVar = (C43375t) a.toBuilder();
            tVar.copyOnWrite();
            C43376u uVar = (C43376u) tVar.instance;
            str.getClass();
            uVar.f113328a |= 1;
            uVar.f113329b = str;
            mo46452n((C43376u) tVar.build());
        }
    }
}
