package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6081b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.am.m.b.h;
import com.google.android.apps.gsa.nga.engine.am.m.b.t;
import com.google.android.apps.gsa.nga.engine.au.al;
import com.google.android.apps.gsa.nga.engine.au.bz;
import com.google.android.apps.gsa.nga.engine.au.e;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6044n.p6051d.C76393s;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g.C77324ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C17989ay;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C18029ck;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C18038ct;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C18044i;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C18050o;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.C18109a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.p3926e.C51920e;
import com.google.assistant.p3897e.p3921j.p3926e.C52001h;
import com.google.assistant.p3897e.p3921j.p3926e.C52028i;
import com.google.assistant.p3897e.p3921j.p3926e.C52051j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.C65192ez;
import com.google.protos.p4985f.p5030q.C65196fc;
import java.util.Locale;
import p001a.p014d.p015a.p016a.C0072q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.b.n */
/* compiled from: PG */
public final class C76817n implements C76591c {

    /* renamed from: a */
    public final t f212211a;

    /* renamed from: b */
    public final C22871g f212212b;

    /* renamed from: c */
    private final C58974d f212213c = C58974d.m91136j();

    /* renamed from: d */
    private final Context f212214d;

    /* renamed from: e */
    private final C91142g f212215e;

    /* renamed from: f */
    private final e f212216f;

    /* renamed from: g */
    private final bz f212217g;

    /* renamed from: h */
    private final al f212218h;

    /* renamed from: i */
    private final C76393s f212219i;

    public C76817n(Context context, C91142g gVar, t tVar, C22871g gVar2, e eVar, bz bzVar, al alVar, C76393s sVar) {
        this.f212214d = context;
        this.f212215e = gVar;
        this.f212211a = tVar;
        this.f212212b = gVar2;
        this.f212216f = eVar;
        this.f212217g = bzVar;
        this.f212218h = alVar;
        this.f212219i = sVar;
    }

    /* renamed from: e */
    private final void m123438e(C74965n nVar) {
        if (!this.f212215e.mo85405j(C90126fx.f251130cx)) {
            this.f212211a.h(nVar.mo71336k());
        }
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SEARCH_ON_WEBSITE));
        h.mo72277g("FindOnSite", C90126fx.f251260fU);
        ((C76541a) h).f211766c = 29014;
        h.mo72244c(C58485gu.m89846n("FindOnSite"));
        h.mo72277g("FindOnSite", C90126fx.f251129cw);
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        if (!this.f212215e.mo85405j(C90126fx.f251131cy) && this.f212214d.getResources().getConfiguration().orientation == 2) {
            return C81442m.f222851a;
        }
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "query");
        if (g.isEmpty()) {
            return C81442m.f222851a;
        }
        Locale q = nVar.mo71342q();
        if (!Locale.US.getLanguage().equals(q.getLanguage())) {
            ((C58970a) ((C58970a) this.f212213c.mo56224b()).mo56372aa(3754)).mo56389s("SearchOnWebsiteFulfiller: disabled as locale %s is not supported", q);
            return C81442m.f222851a;
        }
        Optional g2 = bgVar.mo72265g(C76564ah.f211801a, "website");
        if (g2.isEmpty()) {
            return C81442m.f222851a;
        }
        Optional c = this.f212218h.a().c((String) g2.get(), Optional.m71637of(this.f212216f.a()));
        if (c.isEmpty() || ((C0072q) c.get()).f200b != null) {
            return C81442m.f222851a;
        }
        if (((Boolean) bgVar.mo72265g(C76575as.f211814a, "isSiteInForeground").orElse(false)).booleanValue()) {
            String str = (String) g.get();
            m123438e(nVar);
            return this.f212212b.mo28210j(mo72334c(str, bgVar), "[NGA] SearchOnWebsiteFulfiller: Retrying fetching actions", new C76816m(this, nVar, str, bgVar));
        }
        String str2 = (String) g2.get();
        String str3 = (String) g.get();
        if (!this.f212215e.mo85405j(C90126fx.f251132cz)) {
            return C81442m.f222851a;
        }
        if (!C89988b.m146551d(this.f212215e.mo85403h(C90126fx.f250963P)).contains(str2)) {
            return C81442m.f222851a;
        }
        m123438e(nVar);
        C51809dy u = com.google.android.apps.gsa.nga.engine.am.t.u(new Intent("android.intent.action.VIEW", Uri.parse(str2)).addFlags(32768), 1, nVar.mo71336k(), false, false);
        C52001h hVar = (C52001h) C52028i.f136556d.createBuilder();
        hVar.copyOnWrite();
        C52028i iVar = (C52028i) hVar.instance;
        str2.getClass();
        iVar.f136558a |= 1;
        iVar.f136559b = str2;
        hVar.copyOnWrite();
        C52028i iVar2 = (C52028i) hVar.instance;
        str3.getClass();
        iVar2.f136558a |= 2;
        iVar2.f136560c = str3;
        C52028i iVar3 = (C52028i) hVar.build();
        C51920e eVar = (C51920e) C52051j.f136613d.createBuilder();
        eVar.copyOnWrite();
        C52051j jVar = (C52051j) eVar.instance;
        iVar3.getClass();
        jVar.f136616b = iVar3;
        jVar.f136615a = 1;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a = 1 | kaVar.f137059a;
        kaVar.f137060b = "assistant.api.client_op.ui.ExecuteActionOnWebsiteArgs";
        C63088z byteString = ((C52051j) eVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a = 2 | kaVar2.f137059a;
        kaVar2.f137061c = byteString;
        C52081en a = this.f212219i.mo72185a(C58485gu.m89847o(u, com.google.android.apps.gsa.nga.engine.am.t.a("ui.EXECUTE_ACTION_ON_WEBSITE", "execute_action_args", (C52230ka) jzVar.build())), C58729pv.f156485a);
        C65192ez ezVar = (C65192ez) C65196fc.f176453l.createBuilder();
        ezVar.copyOnWrite();
        a.getClass();
        ((C65196fc) ezVar.instance).f176461g = a;
        C65196fc fcVar = (C65196fc) ezVar.build();
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        fcVar.getClass();
        ((C80401n) lVar.instance).f220666i = fcVar;
        mo72335d(bgVar, str2, lVar);
        return C60856cj.m92900i((C80401n) lVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo72334c(String str, C76590bg bgVar) {
        C18109a aVar = C18038ct.f51490a;
        C18050o oVar = new C18050o();
        oVar.mo23551d(str);
        C18100a b = C18100a.m35256b(aVar, oVar.mo23506a());
        C18044i iVar = new C18044i();
        iVar.mo23524d(str);
        C18029ck a = C17989ay.f51445a.mo23546a(iVar.mo23506a(), b);
        C22871g gVar = this.f212212b;
        t tVar = this.f212211a;
        return gVar.mo28209i(tVar.e.mo28209i(tVar.g(a), "[NGA] DynamicActionSender: checking if the requested action is supported", new h(a)), "[NGA] SearchOnWebsiteFulfiller: adding VE ids", new C76815l(this, bgVar));
    }

    /* renamed from: d */
    public final void mo72335d(C76590bg bgVar, String str, C80399l lVar) {
        lVar.copyOnWrite();
        C80401n nVar = C80401n.f220656k;
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
        lVar.mo74315g(C77324ap.m124097b(bgVar, str, this.f212217g.a(), this.f212216f.a()));
    }
}
