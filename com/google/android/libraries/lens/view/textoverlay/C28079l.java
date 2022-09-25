package com.google.android.libraries.lens.view.textoverlay;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.common.text.C24135k;
import com.google.android.libraries.lens.common.text.C24137m;
import com.google.android.libraries.lens.common.text.C24139o;
import com.google.android.libraries.lens.common.text.C24141q;
import com.google.android.libraries.lens.common.text.p2004a.C24125d;
import com.google.android.libraries.lens.common.text.selection.p2007b.C24149a;
import com.google.android.libraries.lens.common.text.selection.p2007b.C24150b;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.p2014e.p2015a.C24197p;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.translation.C26120dc;
import com.google.android.libraries.lens.view.gleam.C26602k;
import com.google.android.libraries.lens.view.main.C27308ay;
import com.google.android.libraries.lens.view.main.C27309az;
import com.google.android.libraries.lens.view.main.C27311ba;
import com.google.android.libraries.lens.view.main.C27312bb;
import com.google.android.libraries.lens.view.main.C27313bc;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2069am.C25334j;
import com.google.android.libraries.lens.view.p2069am.C25335k;
import com.google.android.libraries.lens.view.p2069am.C25336l;
import com.google.android.libraries.lens.view.p2069am.C25337m;
import com.google.android.libraries.lens.view.p2069am.C25338n;
import com.google.android.libraries.lens.view.p2078at.C25498ad;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.p2085ax.C25614p;
import com.google.android.libraries.lens.view.p2091bb.C25687a;
import com.google.android.libraries.lens.view.p2091bb.C25688b;
import com.google.android.libraries.lens.view.p2091bb.C25689c;
import com.google.android.libraries.lens.view.p2091bb.C25691e;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.android.libraries.lens.view.session.C27775bk;
import com.google.android.libraries.lens.view.session.C27776bl;
import com.google.android.libraries.lens.view.session.C27789i;
import com.google.android.libraries.lens.view.session.C27793m;
import com.google.android.libraries.lens.view.utils.C28103ae;
import com.google.android.libraries.lens.view.utils.C28104af;
import com.google.android.libraries.lens.view.utils.C28105ag;
import com.google.android.libraries.lens.view.utils.C28106ah;
import com.google.android.libraries.lens.view.utils.C28107ai;
import com.google.android.libraries.lens.view.utils.C28109ak;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.lens.p4699e.C62213az;
import com.google.lens.p4699e.C62215ba;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4699e.C62223d;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62475cy;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56225af;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56231al;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56232am;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56234ao;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56238as;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56326x;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.l */
/* compiled from: PG */
public final class C28079l implements C28065a, C28072e {

    /* renamed from: a */
    public static final C58974d f76413a = C58974d.m91135i("TextOverlayController");

    /* renamed from: b */
    public final C25614p f76414b;

    /* renamed from: c */
    final C25499ae f76415c;

    /* renamed from: d */
    public final C25758g f76416d;

    /* renamed from: e */
    public final C25758g f76417e = new C25758g(C58836b.f156633a);

    /* renamed from: f */
    public final C25758g f76418f = new C25758g(C58836b.f156633a);

    /* renamed from: g */
    public final C25758g f76419g = new C25758g(C58836b.f156633a);

    /* renamed from: h */
    public final C25758g f76420h = new C25758g(C58836b.f156633a);

    /* renamed from: i */
    public final C25758g f76421i = new C25758g(false);

    /* renamed from: j */
    public final C25758g f76422j = new C25758g(C58836b.f156633a);

    /* renamed from: k */
    public final C25758g f76423k = new C25758g(C58485gu.m89845m());

    /* renamed from: l */
    public C58833ax f76424l;

    /* renamed from: m */
    public C58833ax f76425m;

    /* renamed from: n */
    public boolean f76426n;

    /* renamed from: o */
    public boolean f76427o;

    /* renamed from: p */
    public C27313bc f76428p;

    /* renamed from: q */
    private final C25941f f76429q;

    /* renamed from: r */
    private C58833ax f76430r;

    /* renamed from: s */
    private final boolean f76431s;

    /* renamed from: t */
    private final C28071d f76432t;

    public C28079l(C28071d dVar, C25614p pVar, C25941f fVar, C26120dc dcVar, C25499ae aeVar, boolean z) {
        C58836b bVar = C58836b.f156633a;
        this.f76424l = bVar;
        this.f76425m = bVar;
        this.f76430r = bVar;
        this.f76432t = dVar;
        this.f76414b = pVar;
        this.f76415c = aeVar;
        this.f76429q = fVar;
        this.f76431s = z;
        C24149a aVar = (C24149a) C24150b.f65938d.createBuilder();
        aVar.copyOnWrite();
        ((C24150b) aVar.instance).f65940a = z;
        aVar.copyOnWrite();
        ((C24150b) aVar.instance).f65941b = true;
        aVar.copyOnWrite();
        ((C24150b) aVar.instance).f65942c = true;
        this.f76416d = new C25758g((C24150b) aVar.build());
        pVar.f69676h = new AtomicReference(new C28078k(this));
        dcVar.mo31312e(new C28075h(this));
    }

    /* renamed from: l */
    private final void m52341l() {
        this.f76414b.mo30725b();
        C25758g gVar = this.f76423k;
        C58485gu m = C58485gu.m89845m();
        m.getClass();
        gVar.mo5708l(m);
    }

    /* renamed from: a */
    public final C58485gu mo33520a(int i, int i2) {
        if (i > i2) {
            return C58485gu.m89845m();
        }
        C58480gp f = C58485gu.m89838f((i2 - i) + 1);
        int i3 = 0;
        for (C56235ap apVar : ((C56242aw) ((C58833ax) this.f76418f.mo3842a()).mo56107c()).f149801a) {
            Iterator it = apVar.f149783b.iterator();
            while (true) {
                if (it.hasNext()) {
                    Iterator it2 = ((C56233an) it.next()).f149778b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C56241av avVar = (C56241av) it2.next();
                            if (i3 > i2) {
                                return f.mo55394f();
                            }
                            if (i3 >= i) {
                                f.mo55395g(C28109ak.m52387a(i3, avVar));
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return f.mo55394f();
    }

    /* renamed from: b */
    public final C58833ax mo33533b() {
        C56242aw awVar;
        C58833ax axVar = (C58833ax) this.f76420h.mo3842a();
        if (!((C58833ax) this.f76418f.mo3842a()).mo56113h() || !axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        int i = ((C25336l) axVar.mo56107c()).f68959a;
        int i2 = ((C25336l) axVar.mo56107c()).f68960b;
        C56231al alVar = (C56231al) C56242aw.f149799b.createBuilder();
        C28076i iVar = new C28076i(alVar);
        C28077j jVar = C28077j.f76411a;
        Iterator it = ((C56242aw) ((C58833ax) this.f76418f.mo3842a()).mo56107c()).f149801a.iterator();
        int i3 = 0;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                awVar = (C56242aw) alVar.build();
                break;
            }
            C56234ao aoVar = (C56234ao) C56235ap.f149780e.createBuilder();
            for (C56233an anVar : ((C56235ap) it.next()).f149783b) {
                C56232am amVar = (C56232am) C56233an.f149775d.createBuilder();
                for (C56241av avVar : anVar.f149778b) {
                    if (i3 >= i) {
                        if (i3 > i2) {
                            jVar.accept(aoVar, amVar);
                            iVar.accept(aoVar);
                            awVar = (C56242aw) alVar.build();
                            break loop0;
                        }
                        amVar.mo54340b(avVar);
                    }
                    i3++;
                }
                jVar.accept(aoVar, amVar);
            }
            iVar.accept(aoVar);
        }
        return C58833ax.m90834k(awVar);
    }

    /* renamed from: c */
    public final void mo33534c() {
        this.f76418f.mo5708l(C58836b.f156633a);
        mo33541h(C58836b.f156633a);
        this.f76422j.mo5708l(C58836b.f156633a);
        m52341l();
        C58836b bVar = C58836b.f156633a;
        this.f76424l = bVar;
        this.f76426n = false;
        this.f76427o = false;
        this.f76430r = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33537d() {
        mo33541h(C58836b.f156633a);
        m52341l();
    }

    /* renamed from: e */
    public final void mo33538e(C25336l lVar) {
        C58833ax axVar;
        C25336l lVar2 = lVar;
        C27313bc bcVar = this.f76428p;
        if (bcVar != null) {
            mo33540g(lVar);
            C58485gu<C24197p> a = mo33520a(lVar2.f68959a, lVar2.f68960b);
            C56242aw awVar = (C56242aw) ((C58833ax) this.f76418f.mo3842a()).mo56107c();
            C25333i iVar = (C25333i) ((C58833ax) this.f76419g.mo3842a()).mo56107c();
            if (this.f76426n && this.f76424l.mo56113h()) {
                Iterator it = ((List) ((C27793m) this.f76424l.mo56107c()).mo33241f().mo56109e(C58485gu.m89845m())).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        axVar = C58836b.f156633a;
                        break;
                    }
                    C62223d dVar = (C62223d) it.next();
                    if (dVar.f168007a == 10) {
                        axVar = C58833ax.m90834k(Locale.forLanguageTag(((C62219be) dVar.f168008b).f167990c));
                        break;
                    }
                }
            } else {
                axVar = C58836b.f156633a;
            }
            C56225af afVar = (C56225af) C56226ag.f149762e.createBuilder();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C24195n nVar = ((C24197p) a.get(i)).f66137b;
                if (nVar == null) {
                    nVar = C24195n.f66127f;
                }
                afVar.mo54335a(C28185a.m52691i(nVar));
            }
            C56231al alVar = (C56231al) C56242aw.f149799b.createBuilder();
            for (C56235ap apVar : awVar.f149801a) {
                C56234ao aoVar = (C56234ao) C56235ap.f149780e.createBuilder();
                for (C56233an anVar : apVar.f149783b) {
                    C56232am amVar = (C56232am) C56233an.f149775d.createBuilder();
                    for (C56241av avVar : anVar.f149778b) {
                        Iterator it2 = Collections.unmodifiableList(((C56226ag) afVar.instance).f149765b).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C56224ae aeVar = (C56224ae) it2.next();
                            C56224ae aeVar2 = avVar.f149797e;
                            if (aeVar2 == null) {
                                aeVar2 = C56224ae.f149753h;
                            }
                            if (C28185a.m52694l(aeVar, aeVar2, iVar)) {
                                amVar.mo54340b(avVar);
                                break;
                            }
                        }
                    }
                    if (((C56233an) amVar.instance).f149778b.size() > 0) {
                        aoVar.mo54342a(amVar);
                    }
                }
                if (((C56235ap) aoVar.instance).f149783b.size() > 0) {
                    alVar.mo54337a(aoVar);
                }
            }
            String a2 = C24141q.m44839a((C56242aw) alVar.build(), axVar);
            afVar.copyOnWrite();
            C56226ag agVar = (C56226ag) afVar.instance;
            a2.getClass();
            agVar.f149764a |= 1;
            agVar.f149766c = a2;
            afVar.copyOnWrite();
            C56226ag agVar2 = (C56226ag) afVar.instance;
            a2.getClass();
            agVar2.f149764a |= 2;
            agVar2.f149767d = a2;
            bcVar.f74727b.f74785ae.mo30528a(C25498ad.TEXT);
            C27775bk g = C27776bl.m51710g();
            ((C27789i) g).f75817a = C58485gu.m89842j(a);
            g.mo33285d(bcVar.f74726a.mo31474e());
            g.mo33284c(bcVar.f74727b.mo32874e());
            g.mo33283b((C56226ag) afVar.build());
            bcVar.f74727b.mo32889u(g.mo33282a(), C58836b.f156633a);
            C58480gp gpVar = new C58480gp(4);
            for (C24197p pVar : a) {
                C24195n nVar2 = pVar.f66137b;
                if (nVar2 == null) {
                    nVar2 = C24195n.f66127f;
                }
                gpVar.mo55395g(C24093a.m44751g(new PointF((nVar2.f66129a + nVar2.f66131c) / 2.0f, (nVar2.f66130b + nVar2.f66132d) / 2.0f), new SizeF(nVar2.f66131c - nVar2.f66129a, nVar2.f66132d - nVar2.f66130b), nVar2.f66133e, 1, 0.0f));
            }
            C58431eu f = C58431eu.m89654f(gpVar.mo55394f());
            C25691e eVar = bcVar.f74727b.f74786af;
            C25687a b = C25688b.m47362b();
            RectF rectF = new RectF(((Float) Collections.min(C58485gu.m89841i(f.mo55247g(C27308ay.f74720a).mo55248h()))).floatValue(), ((Float) Collections.min(C58485gu.m89841i(f.mo55247g(C27309az.f74721a).mo55248h()))).floatValue(), ((Float) Collections.max(C58485gu.m89841i(f.mo55247g(C27311ba.f74724a).mo55248h()))).floatValue(), ((Float) Collections.max(C58485gu.m89841i(f.mo55247g(C27312bb.f74725a).mo55248h()))).floatValue());
            C25689c cVar = (C25689c) b;
            cVar.f69829a = rectF;
            cVar.f69830b = 1;
            b.mo30791d(false);
            eVar.mo30810l(b.mo30790c());
            bcVar.f74727b.f74818w.mo31314g(false);
        }
    }

    /* renamed from: f */
    public final void mo33539f(C56226ag agVar) {
        if (this.f76427o) {
            this.f76430r = C58836b.f156633a;
        } else if (mo33543j()) {
            this.f76430r = C58836b.f156633a;
            C58833ax b = C28109ak.m52388b((C56242aw) ((C58833ax) this.f76418f.mo3842a()).mo56107c(), (C25333i) ((C58833ax) this.f76419g.mo3842a()).mo56107c(), agVar);
            if (b.mo56113h()) {
                C25335k kVar = C25335k.SERVER_FINAL;
                C25334j jVar = (C25334j) ((C25336l) b.mo56107c()).toBuilder();
                jVar.copyOnWrite();
                ((C25336l) jVar.instance).f68961c = kVar.getNumber();
                mo33540g((C25336l) jVar.build());
                if (!((Boolean) this.f76421i.mo3842a()).booleanValue()) {
                    this.f76415c.mo30528a(C25498ad.TEXT);
                    return;
                }
                return;
            }
            mo33537d();
        } else {
            this.f76430r = C58833ax.m90834k(agVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33540g(C25336l lVar) {
        C28071d dVar = this.f76432t;
        C58833ax axVar = (C58833ax) this.f76420h.mo3842a();
        if (axVar.mo56113h()) {
            C25336l lVar2 = (C25336l) axVar.mo56107c();
            C25335k a = C25335k.m46664a(lVar2.f68961c);
            if (a == null) {
                a = C25335k.UNRECOGNIZED;
            }
            C25335k a2 = C25335k.m46664a(lVar.f68961c);
            if (a2 == null) {
                a2 = C25335k.UNRECOGNIZED;
            }
            if ((C58832aw.m90831a(a, C25335k.SERVER_PREFETCHED) || C58832aw.m90831a(a, C25335k.CLIENT_FALLBACK)) && C58832aw.m90831a(a2, C25335k.SERVER_FINAL)) {
                int i = lVar2.f68959a;
                int i2 = lVar2.f68960b;
                int i3 = lVar.f68959a;
                int i4 = lVar.f68960b;
                if (i == i3 && i2 == i4) {
                    dVar.f76399a.mo30251a(C118575h.LENS_INSTANT_TEXT_SELECTION, C118569b.LENS_INSTANT_TEXT_SELECTION_MISMATCH, 0);
                    if (dVar.f76401c) {
                        dVar.f76400b.mo30237c(C59203do.f157270a, 0, 0);
                    }
                    if (dVar.f76403e) {
                        dVar.f76402d.mo30239a(C28069b.f76396a);
                    }
                } else {
                    int max = Math.max(i, i3);
                    int min = Math.min(i2, i4);
                    ArrayList arrayList = new ArrayList();
                    if (min >= max) {
                        arrayList.addAll(mo33520a(Math.min(i, i3), max - 1));
                        arrayList.addAll(mo33520a(min + 1, Math.max(i2, i4)));
                    } else {
                        arrayList.addAll(mo33520a(i, i2));
                        arrayList.addAll(mo33520a(i3, i4));
                    }
                    int size = arrayList.size();
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        i5 += ((C24197p) arrayList.get(i6)).f66138c.length();
                    }
                    int size2 = arrayList.size();
                    dVar.f76399a.mo30251a(C118575h.LENS_INSTANT_TEXT_SELECTION, C118569b.LENS_INSTANT_TEXT_SELECTION_MISMATCH, 1);
                    dVar.f76399a.mo30251a(C118575h.LENS_INSTANT_TEXT_SELECTION, C118569b.LENS_INSTANT_TEXT_SELECTION_MISMATCH_CHARACTERS, (long) i5);
                    dVar.f76399a.mo30251a(C118575h.LENS_INSTANT_TEXT_SELECTION, C118569b.LENS_INSTANT_TEXT_SELECTION_MISMATCH_WORDS, (long) size2);
                    if (dVar.f76401c) {
                        dVar.f76400b.mo30237c(1.0d, i5, size2);
                    }
                    if (dVar.f76403e) {
                        dVar.f76402d.mo30239a(new C28070c(i5, size2));
                    }
                }
            }
        }
        mo33541h(C58833ax.m90834k(lVar));
        m52341l();
    }

    /* renamed from: h */
    public final void mo33541h(C58833ax axVar) {
        this.f76420h.mo5708l(axVar);
        C25941f fVar = this.f76429q;
        boolean h = axVar.mo56113h();
        if (h != fVar.f70481f) {
            fVar.f70481f = h;
            fVar.mo31111d();
        }
    }

    /* renamed from: i */
    public final void mo33542i() {
        C58485gu guVar;
        C62219be beVar;
        int i;
        if (this.f76424l.mo56113h() && ((C58833ax) this.f76419g.mo3842a()).mo56113h()) {
            C27793m mVar = (C27793m) this.f76424l.mo56107c();
            int i2 = 0;
            if (!this.f76426n || !this.f76425m.mo56113h()) {
                C56220aa h = mVar.mo33243h();
                C56231al alVar = (C56231al) C56242aw.f149799b.createBuilder();
                for (C56327y yVar : h.f149750a) {
                    C56324v vVar = yVar.f150144g;
                    if (vVar == null) {
                        vVar = C56324v.f150122c;
                    }
                    C56323u a = C56323u.m87968a(vVar.f150125b);
                    if (a == null) {
                        a = C56323u.GLEAM;
                    }
                    if (a == C56323u.TEXT_GLEAM) {
                        for (C56320r rVar : yVar.f150143f) {
                            C56326x a2 = C56326x.m87970a(rVar.f150103j);
                            if (a2 == null) {
                                a2 = C56326x.UNKNOWN;
                            }
                            if (a2 == C56326x.NONE) {
                                C56310h hVar = rVar.f150100g;
                                if (hVar == null) {
                                    hVar = C56310h.f150072g;
                                }
                                C56235ap apVar = hVar.f150077d;
                                if (apVar == null) {
                                    apVar = C56235ap.f149780e;
                                }
                                alVar.mo54338b(apVar);
                            }
                        }
                    }
                }
                C56242aw awVar = (C56242aw) alVar.build();
                C56220aa h2 = mVar.mo33243h();
                HashSet hashSet = new HashSet();
                C58480gp e = C58485gu.m89837e();
                for (C56327y yVar2 : h2.f149750a) {
                    C56324v vVar2 = yVar2.f150144g;
                    if (vVar2 == null) {
                        vVar2 = C56324v.f150122c;
                    }
                    C56323u a3 = C56323u.m87968a(vVar2.f150125b);
                    if (a3 == null) {
                        a3 = C56323u.GLEAM;
                    }
                    if (a3 == C56323u.TEXT_GLEAM) {
                        for (C56320r rVar2 : yVar2.f150143f) {
                            C56326x a4 = C56326x.m87970a(rVar2.f150103j);
                            if (a4 == null) {
                                a4 = C56326x.UNKNOWN;
                            }
                            if (a4 != C56326x.NONE) {
                                C56310h hVar2 = rVar2.f150100g;
                                if (hVar2 == null) {
                                    hVar2 = C56310h.f150072g;
                                }
                                C56225af afVar = (C56225af) C56226ag.f149762e.createBuilder();
                                afVar.copyOnWrite();
                                C56226ag agVar = (C56226ag) afVar.instance;
                                agVar.mo54336a();
                                C62947c.addAll((Iterable) (C58485gu) Collection.EL.stream(hVar2.f150078e).filter(C28106ah.f76505a).map(C28107ai.f76506a).collect(C58370cn.f155946a), (List) agVar.f149765b);
                                C56226ag agVar2 = (C56226ag) afVar.build();
                                if (agVar2.f149765b.size() > 0 && hashSet.add(agVar2)) {
                                    e.mo55395g(agVar2);
                                }
                            }
                        }
                    }
                }
                C58485gu f = e.mo55394f();
                mo33544k(awVar, (C25333i) ((C58833ax) this.f76419g.mo3842a()).mo56107c());
                mo33543j();
                C56242aw awVar2 = (C56242aw) ((C58833ax) this.f76418f.mo3842a()).mo56107c();
                C25333i iVar = (C25333i) ((C58833ax) this.f76419g.mo3842a()).mo56107c();
                C25337m mVar2 = (C25337m) C25338n.f68962b.createBuilder();
                C58801sm G = f.listIterator(0);
                while (G.hasNext()) {
                    C58833ax b = C28109ak.m52388b(awVar2, iVar, (C56226ag) G.next());
                    if (b.mo56113h()) {
                        C25336l lVar = (C25336l) b.mo56107c();
                        mVar2.copyOnWrite();
                        C25338n nVar = (C25338n) mVar2.instance;
                        lVar.getClass();
                        C62971cq cqVar = nVar.f68964a;
                        if (!cqVar.mo58948c()) {
                            nVar.f68964a = C62942bv.mutableCopy(cqVar);
                        }
                        nVar.f68964a.add(lVar);
                    }
                }
                this.f76422j.mo5708l(C58833ax.m90834k((C25338n) mVar2.build()));
                return;
            }
            Size size = (Size) this.f76425m.mo56107c();
            C24125d dVar = new C24125d();
            C58495hd a5 = C26602k.m49118a((List) mVar.mo33241f().mo56109e(C58485gu.m89845m()));
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(mVar.mo33243h().f149750a).flatMap(C28103ae.f76502a).collect(Collectors.collectingAndThen(Collectors.toCollection(C28104af.f76503a), C28105ag.f76504a));
            C56231al alVar2 = (C56231al) C56242aw.f149799b.createBuilder();
            int size2 = guVar2.size();
            while (i2 < size2) {
                C56320r rVar3 = (C56320r) guVar2.get(i2);
                C56310h hVar3 = rVar3.f150100g;
                if (hVar3 == null) {
                    hVar3 = C56310h.f150072g;
                }
                C56235ap apVar2 = hVar3.f150077d;
                if (apVar2 == null) {
                    apVar2 = C56235ap.f149780e;
                }
                C62223d dVar2 = (C62223d) a5.get(C26602k.m49119b(rVar3));
                if (dVar2 != null && dVar2.f168007a == 10) {
                    C62215ba baVar = ((C62219be) dVar2.f168008b).f167989b;
                    if (baVar == null) {
                        baVar = C62215ba.f167974c;
                    }
                    int a6 = C62213az.m94757a(baVar.f167977b);
                    if (a6 != 0 && a6 == 2) {
                        if (dVar2.f168007a == 10) {
                            beVar = (C62219be) dVar2.f168008b;
                        } else {
                            beVar = C62219be.f167986j;
                        }
                        C58480gp e2 = C58485gu.m89837e();
                        for (C56233an anVar : apVar2.f149783b) {
                            C56224ae aeVar = anVar.f149779c;
                            if (aeVar == null) {
                                aeVar = C56224ae.f149753h;
                            }
                            e2.mo55395g(C24093a.m44747c(aeVar));
                        }
                        if ((beVar.f167988a & 32) == 0 ? (i = C62475cy.m94782b(apVar2.f149785d)) == 0 : (i = C62475cy.m94782b(beVar.f167995h)) == 0) {
                            i = 2;
                        }
                        C24137m a7 = dVar.mo29540a(i, e2.mo55394f(), beVar, size);
                        C56234ao aoVar = (C56234ao) C56235ap.f149780e.createBuilder();
                        int b2 = C62475cy.m94782b(a7.f65902c);
                        int i3 = 1;
                        if (b2 == 0) {
                            b2 = 1;
                        }
                        aoVar.copyOnWrite();
                        C56235ap apVar3 = (C56235ap) aoVar.instance;
                        apVar3.f149785d = C62475cy.m94781a(b2);
                        apVar3.f149782a |= 2;
                        C56224ae aeVar2 = apVar2.f149784c;
                        if (aeVar2 == null) {
                            aeVar2 = C56224ae.f149753h;
                        }
                        aoVar.copyOnWrite();
                        C56235ap apVar4 = (C56235ap) aoVar.instance;
                        aeVar2.getClass();
                        apVar4.f149784c = aeVar2;
                        apVar4.f149782a |= 1;
                        for (C24135k kVar : a7.f65900a) {
                            C56232am amVar = (C56232am) C56233an.f149775d.createBuilder();
                            C62441br brVar = kVar.f65895b;
                            if (brVar == null) {
                                brVar = C62441br.f168608h;
                            }
                            C56224ae d = C24093a.m44748d(C24095c.m44763h(brVar, size));
                            amVar.copyOnWrite();
                            C56233an anVar2 = (C56233an) amVar.instance;
                            d.getClass();
                            anVar2.f149779c = d;
                            anVar2.f149777a |= i3;
                            for (C24139o oVar : kVar.f65896c) {
                                C56238as asVar = (C56238as) C56241av.f149791g.createBuilder();
                                C62441br brVar2 = oVar.f65910b;
                                if (brVar2 == null) {
                                    brVar2 = C62441br.f168608h;
                                }
                                C56224ae d2 = C24093a.m44748d(C24095c.m44763h(brVar2, size));
                                asVar.copyOnWrite();
                                C56241av avVar = (C56241av) asVar.instance;
                                d2.getClass();
                                avVar.f149797e = d2;
                                avVar.f149793a |= 4;
                                String str = oVar.f65909a;
                                asVar.copyOnWrite();
                                C56241av avVar2 = (C56241av) asVar.instance;
                                str.getClass();
                                C58485gu guVar3 = guVar2;
                                avVar2.f149793a |= 1;
                                avVar2.f149795c = str;
                                if (!oVar.f65911c.isEmpty()) {
                                    String str2 = oVar.f65911c;
                                    asVar.copyOnWrite();
                                    C56241av avVar3 = (C56241av) asVar.instance;
                                    str2.getClass();
                                    avVar3.f149793a |= 2;
                                    avVar3.f149796d = str2;
                                }
                                amVar.mo54340b((C56241av) asVar.build());
                                guVar2 = guVar3;
                            }
                            C58485gu guVar4 = guVar2;
                            aoVar.mo54342a(amVar);
                            i3 = 1;
                        }
                        guVar = guVar2;
                        alVar2.mo54337a(aoVar);
                        i2++;
                        guVar2 = guVar;
                    }
                }
                guVar = guVar2;
                alVar2.mo54338b(apVar2);
                i2++;
                guVar2 = guVar;
            }
            mo33544k((C56242aw) alVar2.build(), (C25333i) ((C58833ax) this.f76419g.mo3842a()).mo56107c());
        }
    }

    /* renamed from: j */
    public final boolean mo33543j() {
        return ((C58833ax) this.f76418f.mo3842a()).mo56113h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo33544k(C56242aw awVar, C25333i iVar) {
        C56231al alVar = (C56231al) C56242aw.f149799b.createBuilder();
        for (C56235ap apVar : awVar.f149801a) {
            C56224ae aeVar = apVar.f149784c;
            if (aeVar == null) {
                aeVar = C56224ae.f149753h;
            }
            C56224ae k = C28185a.m52693k(aeVar, iVar);
            if (C28185a.m52695m(k, iVar)) {
                C56234ao aoVar = (C56234ao) apVar.toBuilder();
                aoVar.copyOnWrite();
                C56235ap apVar2 = (C56235ap) aoVar.instance;
                k.getClass();
                apVar2.f149784c = k;
                apVar2.f149782a |= 1;
                aoVar.copyOnWrite();
                ((C56235ap) aoVar.instance).f149783b = C56235ap.emptyProtobufList();
                for (C56233an anVar : apVar.f149783b) {
                    C56224ae aeVar2 = anVar.f149779c;
                    if (aeVar2 == null) {
                        aeVar2 = C56224ae.f149753h;
                    }
                    C56224ae k2 = C28185a.m52693k(aeVar2, iVar);
                    if (C28185a.m52695m(k2, iVar)) {
                        C56232am amVar = (C56232am) anVar.toBuilder();
                        amVar.copyOnWrite();
                        C56233an anVar2 = (C56233an) amVar.instance;
                        k2.getClass();
                        anVar2.f149779c = k2;
                        anVar2.f149777a |= 1;
                        amVar.copyOnWrite();
                        ((C56233an) amVar.instance).f149778b = C56233an.emptyProtobufList();
                        for (C56241av avVar : anVar.f149778b) {
                            C56224ae aeVar3 = avVar.f149797e;
                            if (aeVar3 == null) {
                                aeVar3 = C56224ae.f149753h;
                            }
                            C56224ae k3 = C28185a.m52693k(aeVar3, iVar);
                            if (C28185a.m52695m(k3, iVar)) {
                                C56238as asVar = (C56238as) avVar.toBuilder();
                                asVar.copyOnWrite();
                                C56241av avVar2 = (C56241av) asVar.instance;
                                k3.getClass();
                                avVar2.f149797e = k3;
                                avVar2.f149793a |= 4;
                                amVar.mo54339a(asVar);
                            }
                        }
                        aoVar.mo54342a(amVar);
                    }
                }
                alVar.mo54337a(aoVar);
            }
        }
        C56242aw awVar2 = (C56242aw) alVar.build();
        if (!Objects.equals(((C58833ax) this.f76418f.mo3842a()).mo56111f(), awVar2) || !Objects.equals(((C58833ax) this.f76419g.mo3842a()).mo56111f(), iVar)) {
            this.f76419g.mo5708l(C58833ax.m90834k(iVar));
            this.f76418f.mo5708l(C58833ax.m90834k(awVar2));
            if (this.f76430r.mo56113h()) {
                mo33539f((C56226ag) this.f76430r.mo56107c());
                this.f76430r = C58836b.f156633a;
            }
        }
    }
}
