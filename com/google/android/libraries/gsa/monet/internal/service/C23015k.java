package com.google.android.libraries.gsa.monet.internal.service;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.internal.shared.C23033b;
import com.google.android.libraries.gsa.monet.internal.shared.C23040e;
import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.internal.shared.C23047l;
import com.google.android.libraries.gsa.monet.internal.shared.C23048m;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.FeatureSubtreeSnapshot;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23081al;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23111g;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23096b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.k */
/* compiled from: PG */
public final class C23015k implements C23052c {

    /* renamed from: a */
    public final C23128x f63306a;

    /* renamed from: b */
    public final C23021q f63307b;

    /* renamed from: c */
    public final C23040e f63308c;

    /* renamed from: d */
    public final C23022r f63309d;

    /* renamed from: e */
    public C23014j f63310e = C23014j.UNINITIALIZED;

    /* renamed from: f */
    public final C23047l f63311f;

    /* renamed from: g */
    public final C23042g f63312g;

    /* renamed from: h */
    public final List f63313h = new ArrayList();

    /* renamed from: i */
    public final Set f63314i = new HashSet();

    /* renamed from: j */
    public final C23048m f63315j;

    /* renamed from: k */
    public C23056g f63316k;

    /* renamed from: l */
    public boolean f63317l;

    /* renamed from: m */
    private final C23084ao f63318m;

    /* renamed from: n */
    private final C23004aa f63319n;

    /* renamed from: o */
    private final C23096b f63320o;

    /* renamed from: p */
    private final C23047l f63321p;

    /* renamed from: q */
    private final Map f63322q = new HashMap();

    /* renamed from: r */
    private final C23081al f63323r;

    public C23015k(C23084ao aoVar, C23128x xVar, C23021q qVar, C23004aa aaVar, C23040e eVar, C23022r rVar, C23047l lVar, C23047l lVar2, C23042g gVar, C23081al alVar, C23096b bVar) {
        this.f63318m = aoVar;
        this.f63306a = xVar;
        this.f63307b = qVar;
        this.f63319n = aaVar;
        this.f63308c = eVar;
        this.f63309d = rVar;
        this.f63321p = lVar;
        this.f63311f = lVar2;
        this.f63312g = gVar;
        this.f63320o = bVar;
        eVar.mo28463b(gVar);
        this.f63323r = alVar;
        this.f63315j = new C23048m(alVar);
    }

    /* renamed from: F */
    private final C23129y m43100F(C23129y yVar) {
        if (yVar.mo28577c()) {
            return yVar;
        }
        return this.f63312g.f63391d.mo28576b(yVar.f63477b);
    }

    /* renamed from: G */
    private final void m43101G() {
        C23067b.m43234g(this.f63310e != C23014j.DESTROYED, "API cannot be used after controller has been destroyed for feature with id: %s", this.f63312g.f63388a);
    }

    /* renamed from: H */
    private final void m43102H(C23087a aVar) {
        aVar.mo28530a(this.f63312g.mo28465a());
        this.f63310e = C23014j.HIERARCHY_INITIALIZED;
        C23088b e = this.f63312g.mo28469e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            C23015k a = this.f63307b.mo28443a((String) e.get(i));
            if (a != null) {
                a.m43102H(aVar);
            }
        }
    }

    /* renamed from: I */
    private final void m43103I(String str, String str2, C23129y yVar, ProtoParcelable protoParcelable, C23029y yVar2, boolean z, C23081al alVar) {
        String str3 = str;
        boolean z2 = false;
        C23067b.m43229b((protoParcelable == null) != (yVar2 == null), "Exactly one of initializationData and restoreData must be null.");
        C23129y yVar3 = yVar;
        C23013i iVar = new C23013i(this, str3, yVar3.f63476a, new C23009e(this, str2, yVar3, protoParcelable, yVar2, z, alVar));
        this.f63322q.put(str3, iVar);
        if (iVar.f63298c == null) {
            z2 = true;
        }
        C23067b.m43234g(z2, "Scope is already being loaded for child %s", iVar.f63296a);
        iVar.f63298c = iVar.f63300e.f63311f.mo28339h(iVar.f63297b);
        iVar.f63298c.mo28525b(new C23012h(iVar));
    }

    /* renamed from: J */
    private final void m43104J(String str) {
        C23067b.m43230c(mo28333D(str), "No child with name %s exists", str);
        String h = this.f63312g.mo28472h(str);
        h.getClass();
        C23013i iVar = (C23013i) this.f63322q.remove(str);
        iVar.getClass();
        C23067b.m43234g(iVar.f63298c != null, "Scope loading had not been initiated yet for child %s", iVar.f63296a);
        C23047l lVar = iVar.f63300e.f63311f;
        C23078ai aiVar = iVar.f63298c;
        aiVar.getClass();
        lVar.mo28344p(aiVar);
        iVar.f63298c = null;
        iVar.f63299d = null;
        C23015k a = this.f63307b.mo28443a(h);
        if (a != null) {
            a.f63318m.mo28328a();
            C23067b.m43234g(a.f63310e == C23014j.CONTROLLER_INITIALIZED || a.f63310e == C23014j.HIERARCHY_INITIALIZED, "Cannot destroy a ControllerWrapper in state %s", a.f63310e);
            C23056g gVar = a.f63316k;
            gVar.getClass();
            C23128x xVar = a.f63306a;
            C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
            cVar.copyOnWrite();
            C23101d dVar = (C23101d) cVar.instance;
            dVar.f63452d = 7;
            dVar.f63449a = 1 | dVar.f63449a;
            String str2 = a.f63312g.f63388a;
            cVar.copyOnWrite();
            C23101d dVar2 = (C23101d) cVar.instance;
            str2.getClass();
            dVar2.f63449a |= 2;
            dVar2.f63453e = str2;
            String str3 = a.f63312g.f63391d.f63478c;
            cVar.copyOnWrite();
            C23101d dVar3 = (C23101d) cVar.instance;
            str3.getClass();
            dVar3.f63449a |= 4;
            dVar3.f63454f = str3;
            C23101d dVar4 = (C23101d) cVar.build();
            Objects.requireNonNull(gVar);
            xVar.mo28520c(new C23010f(gVar));
            C23088b bVar = new C23088b(a.f63313h);
            int size = bVar.size();
            for (int i = 0; i < size; i++) {
                ((C23054e) bVar.get(i)).mo28491g();
            }
            a.f63307b.f63338a.remove(a.f63312g.f63388a);
            C23088b f = a.f63312g.mo28470f();
            int size2 = f.size();
            for (int i2 = 0; i2 < size2; i2++) {
                a.m43104J((String) f.get(i2));
            }
            a.f63310e = C23014j.DESTROYED;
            a.f63321p.mo28484b();
            a.f63311f.mo28484b();
        }
    }

    /* renamed from: A */
    public final void mo28418A(Class cls) {
        this.f63315j.mo28418A(cls);
    }

    /* renamed from: B */
    public final void mo28332B(Bundle bundle) {
        this.f63318m.mo28328a();
        if (this.f63310e == C23014j.DESTROYED) {
            this.f63320o.mo28559a("ControllerApi", "API cannot be used after controller has been destroyed for feature with id: %s", this.f63312g.f63388a);
            return;
        }
        this.f63308c.mo28332B(bundle);
        if (mo28419C()) {
            C23004aa aaVar = this.f63319n;
            C23042g gVar = this.f63312g;
            aaVar.mo28407c(bundle, gVar.f63388a, gVar.f63391d.f63478c);
        }
    }

    /* renamed from: C */
    public final boolean mo28419C() {
        return this.f63310e == C23014j.HIERARCHY_INITIALIZED;
    }

    /* renamed from: D */
    public final boolean mo28333D(String str) {
        this.f63318m.mo28328a();
        this.f63318m.mo28328a();
        C23013i iVar = (C23013i) this.f63322q.get(str);
        char c = iVar == null ? 1 : iVar.f63299d == null ? (char) 3 : 2;
        return c == 2 || c == 3;
    }

    /* renamed from: E */
    public final boolean mo28420E() {
        return this.f63310e == C23014j.DESTROYED;
    }

    /* renamed from: a */
    public final C23056g mo28421a(String str) {
        m43101G();
        String g = this.f63312g.mo28471g(str);
        this.f63321p.mo28483a(this.f63312g.mo28468d(str).f63476a);
        C23013i iVar = (C23013i) this.f63322q.get(str);
        iVar.getClass();
        iVar.mo28417a();
        C23015k kVar = (C23015k) this.f63307b.f63338a.get(g);
        C23056g b = kVar != null ? kVar.mo28422b() : null;
        b.getClass();
        return b;
    }

    /* renamed from: b */
    public final C23056g mo28422b() {
        C23056g gVar = this.f63316k;
        C23067b.m43236i(gVar, "ControllerWrapper has not finished initializing the feature controller yet");
        return gVar;
    }

    /* renamed from: c */
    public final FeatureSubtreeSnapshot mo28423c(String str) {
        String g = this.f63312g.mo28471g(str);
        C23021q qVar = this.f63307b;
        C23015k kVar = (C23015k) qVar.f63338a.get(g);
        kVar.getClass();
        FeatureStateSnapshot a = kVar.f63312g.mo28465a();
        ArrayList arrayList = new ArrayList();
        qVar.mo28445c(a, arrayList);
        FeatureSubtreeSnapshotImpl featureSubtreeSnapshotImpl = new FeatureSubtreeSnapshotImpl(new HierarchyState(arrayList, qVar.f63339b));
        mo28365x(str);
        return featureSubtreeSnapshotImpl;
    }

    /* renamed from: d */
    public final C23115k mo28335d(C23129y yVar) {
        throw null;
    }

    /* renamed from: e */
    public final C23120p mo28336e() {
        return this.f63308c.mo28336e();
    }

    /* renamed from: f */
    public final C23129y mo28337f(String str) {
        this.f63318m.mo28328a();
        return this.f63312g.mo28468d(str);
    }

    /* renamed from: g */
    public final C23129y mo28338g() {
        return this.f63312g.f63391d;
    }

    /* renamed from: h */
    public final C23078ai mo28339h(String str) {
        m43101G();
        return this.f63321p.mo28339h(str);
    }

    /* renamed from: i */
    public final Object mo28424i(Class cls) {
        return this.f63323r.mo28424i(cls);
    }

    /* renamed from: j */
    public final Object mo28425j(Class cls) {
        return this.f63323r.mo28425j(cls);
    }

    /* renamed from: k */
    public final String mo28341k(String str) {
        throw null;
    }

    /* renamed from: l */
    public final String mo28342l() {
        return this.f63312g.f63388a;
    }

    /* renamed from: m */
    public final void mo28426m(C23113i iVar) {
        this.f63318m.mo28328a();
        this.f63314i.add(iVar);
    }

    /* renamed from: n */
    public final void mo28343n(C23118n nVar) {
        this.f63308c.mo28343n(nVar);
    }

    /* renamed from: o */
    public final void mo28427o(C23054e eVar) {
        this.f63318m.mo28328a();
        this.f63313h.add(eVar);
    }

    /* renamed from: p */
    public final void mo28344p(C23078ai aiVar) {
        this.f63321p.mo28344p(aiVar);
    }

    /* renamed from: q */
    public final void mo28364q(String str, C23129y yVar, ProtoParcelable protoParcelable) {
        C23088b<C23111g> a = C23088b.m43271a(new C23111g(str, yVar, protoParcelable));
        boolean z = this.f63317l;
        this.f63318m.mo28328a();
        m43101G();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C23111g gVar : a) {
            String a2 = C23033b.m43154a(this.f63312g.f63388a, gVar.f63468a);
            C23129y F = m43100F(gVar.f63469b);
            arrayList.add(a2);
            arrayList2.add(F);
            this.f63312g.mo28475k(gVar.f63468a, a2, F);
        }
        if (mo28419C()) {
            this.f63319n.mo28408d(this.f63312g.mo28467c());
        }
        Iterator it = arrayList.iterator();
        Iterator it2 = arrayList2.iterator();
        for (C23111g gVar2 : a) {
            m43103I(gVar2.f63468a, (String) it.next(), (C23129y) it2.next(), gVar2.f63470c, (C23029y) null, z, this.f63315j.mo28486a());
        }
    }

    /* renamed from: r */
    public final void mo28428r(String str, C23129y yVar, C23029y yVar2, boolean z) {
        this.f63318m.mo28328a();
        m43101G();
        C23067b.m43236i(str, "Can't create a child with null name");
        C23129y F = m43100F(yVar);
        String a = C23033b.m43154a(this.f63312g.f63388a, str);
        this.f63312g.mo28475k(str, a, F);
        if (mo28419C()) {
            this.f63319n.mo28408d(this.f63312g.mo28467c());
        }
        m43103I(str, a, F, (ProtoParcelable) null, yVar2, z, this.f63315j.mo28486a());
    }

    /* renamed from: s */
    public final void mo28429s(Class cls) {
        this.f63315j.mo28429s(cls);
    }

    /* renamed from: t */
    public final void mo28430t(Class cls) {
        this.f63315j.mo28430t(cls);
    }

    /* renamed from: u */
    public final void mo28431u(ProtoParcelable protoParcelable) {
        C23088b bVar = new C23088b(this.f63313h);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            ((C23054e) bVar.get(i)).mo28490c();
        }
        C23056g gVar = this.f63316k;
        gVar.getClass();
        C23128x xVar = this.f63306a;
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 5;
        dVar.f63449a |= 1;
        String str = this.f63312g.f63388a;
        cVar.copyOnWrite();
        C23101d dVar2 = (C23101d) cVar.instance;
        str.getClass();
        dVar2.f63449a |= 2;
        dVar2.f63453e = str;
        String str2 = this.f63312g.f63391d.f63478c;
        cVar.copyOnWrite();
        C23101d dVar3 = (C23101d) cVar.instance;
        str2.getClass();
        dVar3.f63449a |= 4;
        dVar3.f63454f = str2;
        C23101d dVar4 = (C23101d) cVar.build();
        xVar.mo28520c(new C23007c(gVar, protoParcelable));
    }

    /* renamed from: v */
    public final void mo28432v() {
        C23067b.m43232e(this.f63310e == C23014j.CONTROLLER_INITIALIZED);
        C23087a aVar = new C23087a();
        m43102H(aVar);
        this.f63319n.mo28405a(new C23088b(aVar.f63434a));
    }

    /* renamed from: w */
    public final void mo28433w(Class cls, Object obj) {
        this.f63315j.mo28433w(cls, obj);
    }

    /* renamed from: x */
    public final void mo28365x(String str) {
        this.f63318m.mo28328a();
        m43101G();
        m43104J(str);
        if (mo28419C()) {
            this.f63319n.mo28408d(this.f63312g.mo28467c());
        }
    }

    /* renamed from: y */
    public final void mo28434y(C23054e eVar) {
        this.f63318m.mo28328a();
        this.f63313h.remove(eVar);
    }

    /* renamed from: z */
    public final void mo28435z(String str) {
        this.f63318m.mo28328a();
        if (mo28419C()) {
            this.f63319n.mo28409e(this.f63312g.f63388a, str);
            return;
        }
        throw new IllegalStateException("TriggerDispatcherApi should not be used before the controller is initialized or after the controller is destroyed");
    }
}
