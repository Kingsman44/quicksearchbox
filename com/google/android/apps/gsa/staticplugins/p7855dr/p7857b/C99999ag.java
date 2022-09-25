package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6890a.C87297a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6893d.C87300a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87339v;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87340w;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6895f.C87344a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6896g.p6897a.C87345a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6898h.C87346a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6899i.C87347a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87360a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87361b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6910b.C87366a;
import com.google.android.apps.gsa.search.core.p6884y.p6917i.C87388b;
import com.google.android.apps.gsa.search.core.service.p6848e.C86679b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88371ze;
import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.C90181b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7089h.C90243a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90247b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100032e;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.ag */
/* compiled from: PG */
public final class C99999ag extends C23056g implements C87361b, C87360a {

    /* renamed from: a */
    public final C100032e f279667a;

    /* renamed from: b */
    public final C87345a f279668b;

    /* renamed from: c */
    public C88371ze f279669c;

    /* renamed from: d */
    private final C87348a f279670d;

    /* renamed from: e */
    private final C87388b f279671e;

    /* renamed from: f */
    private final C86124t f279672f;

    /* renamed from: g */
    private final C58833ax f279673g;

    /* renamed from: h */
    private final C87339v f279674h;

    public C99999ag(C23052c cVar, C100032e eVar, C87345a aVar, C87348a aVar2, C87388b bVar, C86124t tVar, C58833ax axVar) {
        super(cVar);
        this.f279667a = eVar;
        this.f279668b = aVar;
        this.f279670d = aVar2;
        this.f279671e = bVar;
        this.f279672f = tVar;
        this.f279673g = axVar;
        C87339v a = C87340w.m141302a(((C100005d) eVar).f279692a, C90229e.SRP);
        this.f279674h = a;
        C23015k kVar = (C23015k) cVar;
        kVar.f63315j.mo28433w(C87348a.class, aVar2);
        kVar.f63315j.mo28430t(C86679b.class);
        kVar.f63315j.mo28430t(C87344a.class);
        kVar.f63315j.mo28430t(C87346a.class);
        kVar.f63315j.mo28430t(C87297a.class);
        kVar.f63315j.mo28433w(C87334q.class, a);
        kVar.f63315j.mo28430t(C87300a.class);
        kVar.f63315j.mo28429s(C87347a.class);
        kVar.f63315j.mo28429s(C87366a.class);
    }

    /* renamed from: a */
    public final void mo81029a() {
        this.f279674h.mo80982iy();
    }

    /* renamed from: b */
    public final void mo81030b() {
        this.f63405W.mo28435z("Cancel screenshot");
        C87348a aVar = this.f279670d;
        Query query = Query.f252741b;
        C90208n nVar = C90208n.UNKNOWN_TAB;
        C90498f i = query.mo84480i();
        i.mo84562U(12);
        if (i.f252979Q != nVar) {
            i.f252965C = true;
            i.f252979Q = nVar;
        }
        aVar.mo81004c(i.mo84568a());
        this.f279674h.mo80983iz();
    }

    /* renamed from: e */
    public final void mo91696e() {
        ((C100005d) this.f279667a).f279696e.mo28730f(Boolean.valueOf(this.f279670d.mo81003b().mo84416cw()), false);
    }

    /* renamed from: f */
    public final void mo91697f() {
        C88371ze zeVar;
        C90247b bVar = (C90247b) ((C100005d) this.f279667a).f279697f.mo28620a();
        if (bVar != null && (zeVar = this.f279669c) != null) {
            bVar.mo83962b(zeVar.f238974b, zeVar.f238975c);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo91698h() {
        C58833ax axVar = this.f279673g;
        if (axVar.mo56113h()) {
            ((C87366a) axVar.mo56107c()).mo81035b(false);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        if (this.f279672f.mo79746e(C90110fh.f250690bt)) {
            ((C100005d) this.f279667a).f279702k.mo28730f(true, false);
        }
        mo91696e();
        this.f279670d.mo81007f(this.f63405W, new C99998af(this));
        ((C100005d) this.f279667a).f279695d.mo28730f(Boolean.valueOf(this.f279668b.mo80991a()), false);
        this.f279668b.mo80992b(this.f63405W, new C100026y(this));
        ((C100005d) this.f279667a).f279700i.mo28730f(C58836b.f156633a, false);
        ((C100005d) this.f279667a).f279698g.mo28730f(C58836b.f156633a, false);
        ((C100005d) this.f279667a).f279694c.mo28730f(C58836b.f156633a, false);
        this.f279671e.mo81046a(this.f63405W, C88244um.TAKE_RECENTLY_SCREENSHOT, new C100027z(this));
        this.f279671e.mo81046a(this.f63405W, C88244um.SHOW_NOTIFICATIONS_DISABLED_DIALOG, new C99993aa(this));
        this.f279671e.mo81046a(this.f63405W, C88244um.SHOW_DATA_SAVER_ENABLED_DIALOG, new C99994ab(this));
        if (!((C100005d) this.f279667a).f279701j.mo28631l()) {
            ((C100005d) this.f279667a).f279701j.mo28623d(C90181b.f251952a, C23245b.m43556a(C90181b.f251954c));
        }
        C23056g a = ((C100005d) this.f279667a).f279701j.mo28620a();
        a.getClass();
        C100023v vVar = (C100023v) a;
        if (!((C100005d) this.f279667a).f279693b.mo28631l()) {
            ((C100005d) this.f279667a).f279693b.mo28623d(C90243a.f252093a, ProtoParcelable.f63423a);
        }
        C99995ac acVar = new C99995ac(this);
        if (((C100005d) this.f279667a).f279697f.mo28631l()) {
            ((C100005d) this.f279667a).f279697f.mo28626g(acVar);
        }
        this.f279671e.mo81046a(this.f63405W, C88244um.UPDATE_LOGO_HEADER_VISIBILITY, new C99996ad(this));
        vVar.f279740o = new C99997ae(this, acVar);
        ((C100005d) this.f279667a).f279699h.mo28730f(C58833ax.m90834k(150), false);
    }
}
