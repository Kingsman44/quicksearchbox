package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6893d.C87300a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87339v;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87340w;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6899i.C87347a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87360a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87361b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87363d;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6910b.C87366a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6911p.C87368a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6911p.C87369b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90249d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7102s.C90279a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7102s.C90280b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7102s.C90281c;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91805l;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105426c;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105400h;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105435e;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.av */
/* compiled from: PG */
public final class C105200av extends C23056g implements C105400h, C87361b, C87360a, C87363d {

    /* renamed from: a */
    public final C105419b f293409a;

    /* renamed from: b */
    private final C105435e f293410b;

    /* renamed from: c */
    private final C86124t f293411c;

    /* renamed from: d */
    private final C87339v f293412d;

    /* renamed from: e */
    private final C105199au f293413e;

    /* renamed from: f */
    private final boolean f293414f;

    public C105200av(C23052c cVar, C105435e eVar, C105419b bVar, C86124t tVar, boolean z) {
        super(cVar);
        this.f293410b = eVar;
        this.f293409a = bVar;
        this.f293411c = tVar;
        this.f293414f = z;
        C105199au auVar = new C105199au();
        this.f293413e = auVar;
        C23015k kVar = (C23015k) cVar;
        kVar.f63315j.mo28433w(C90249d.class, new C105198at(z, eVar));
        C87339v a = C87340w.m141302a(((C105309z) eVar).f293826a, C90229e.SEARCH_NOW_FEED);
        this.f293412d = a;
        kVar.f63315j.mo28433w(C87334q.class, a);
        kVar.f63315j.mo28433w(C87369b.class, auVar);
        kVar.f63315j.mo28430t(C87348a.class);
        kVar.f63315j.mo28430t(C87300a.class);
        kVar.f63315j.mo28429s(C87347a.class);
        kVar.f63315j.mo28429s(C87366a.class);
    }

    /* renamed from: e */
    private final void m174687e(C91805l lVar) {
        C7669fo foVar;
        C91788al alVar;
        ((C105309z) this.f293410b).f293829d.mo28730f(Boolean.valueOf(this.f293414f), false);
        C62971cq cqVar = lVar.f256035c;
        C23186f fVar = ((C105309z) this.f293410b).f293830e;
        if ((lVar.f256033a & 1) != 0) {
            C7669fo foVar2 = lVar.f256034b;
            if (foVar2 == null) {
                foVar2 = C7669fo.f26633e;
            }
            foVar = foVar2;
        } else {
            foVar = null;
        }
        String str = lVar.f256036d;
        int i = lVar.f256033a;
        String str2 = (i & 4) != 0 ? lVar.f256037e : null;
        boolean z = this.f293414f;
        if ((i & 8) != 0) {
            C91788al alVar2 = lVar.f256038f;
            if (alVar2 == null) {
                alVar2 = C91788al.f255957d;
            }
            alVar = alVar2;
        } else {
            alVar = null;
        }
        fVar.mo28624e("TYPE_INTERESTS_TAB_FEED_RECYCLER", C23245b.m43556a(C105426c.m175128a(cqVar, foVar, str, str2, z, alVar, (lVar.f256033a & 16) != 0 ? lVar.f256039g : null)));
    }

    /* renamed from: f */
    private final void m174688f(boolean z) {
        if (((Boolean) ((C105309z) this.f293410b).f293832g.f63720e).booleanValue() != z) {
            ((C105309z) this.f293410b).f293832g.mo28730f(Boolean.valueOf(z), false);
            this.f293409a.mo94783e(z);
        }
    }

    /* renamed from: a */
    public final void mo81029a() {
        m174688f(true);
        this.f293412d.mo80982iy();
        for (C87368a a : this.f293413e.f293408a) {
            a.mo81036a();
        }
    }

    /* renamed from: b */
    public final void mo81030b() {
        m174688f(false);
        this.f293412d.mo80983iz();
    }

    /* renamed from: c */
    public final void mo81032c() {
        this.f63405W.mo28435z("Scroll to top");
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        if (this.f293414f != ((Boolean) ((C105309z) this.f293410b).f293829d.f63720e).booleanValue()) {
            m174687e((C91805l) ((C105309z) this.f293410b).f293828c.f63720e);
        } else {
            ((C105309z) this.f293410b).f293830e.mo28634o(xVar);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91805l lVar = (C91805l) C23245b.m43557b(protoParcelable, C91805l.f256031h.getParserForType(), C62921ba.m95368a(), true);
        lVar.getClass();
        ((C105309z) this.f293410b).f293828c.mo28730f(lVar, false);
        m174687e(lVar);
        if (!((C105309z) this.f293410b).f293831f.mo28631l() && this.f293411c.mo79746e(C90010bp.f246997i)) {
            C90280b bVar = (C90280b) C90281c.f252152c.createBuilder();
            if (this.f293411c.mo79746e(C90010bp.f246997i)) {
                C90208n nVar = C90208n.UPDATES_TAB;
                bVar.copyOnWrite();
                C90281c cVar = (C90281c) bVar.instance;
                cVar.f252155b = nVar.f251999l;
                cVar.f252154a |= 1;
            }
            ((C105309z) this.f293410b).f293831f.mo28623d(C90279a.f252151a, C23245b.m43556a((C90281c) bVar.build()));
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C105419b bVar = this.f293409a;
        bVar.f294039f = 2;
        bVar.mo94780b();
        this.f293409a.mo94783e(((Boolean) ((C105309z) this.f293410b).f293832g.f63720e).booleanValue());
    }
}
