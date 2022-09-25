package com.google.android.apps.gsa.staticplugins.searchboxroot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84453t;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.p6519al.p6564av.C84750a;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86796k;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87848fv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88332xt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88335xw;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88638k;
import com.google.android.apps.gsa.searchbox.p6944c.C88540a;
import com.google.android.apps.gsa.searchbox.p6944c.C88598d;
import com.google.android.apps.gsa.searchbox.p6944c.C88613q;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88615s;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.C88618v;
import com.google.android.apps.gsa.searchbox.p6944c.C88619w;
import com.google.android.apps.gsa.searchbox.p6944c.C88620x;
import com.google.android.apps.gsa.searchbox.p6944c.C88621y;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88595k;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7075ac.C90182a;
import com.google.android.apps.gsa.shared.p6990an.C89212c;
import com.google.android.apps.gsa.shared.p6990an.C89231v;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89233x;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89202g;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p6995aq.C89262e;
import com.google.android.apps.gsa.shared.p6995aq.C89267j;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7869b.C100230y;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i.C116920e;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8738f.C116944a;
import com.google.android.apps.gsa.staticplugins.searchboxroot.p8722b.C116841a;
import com.google.android.apps.gsa.staticplugins.searchboxroot.p8723c.C116844a;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19178f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19182j;
import com.google.android.libraries.assistant.p1594s.p1597b.C19185m;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58827ar;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60317oa;
import com.google.common.p4552o.C60318ob;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60644xn;
import com.google.common.p4552o.C60645xo;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61832y;
import com.google.p395al.p417d.p418a.C8541au;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4184bj.C56032h;
import com.google.p4184bj.C56034j;
import com.google.p4184bj.C56036l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.protos.p4948ba.p4949a.C64369b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.x */
/* compiled from: PG */
public final class C117042x extends C86734a implements C85171a {

    /* renamed from: a */
    public static final C59071e f324933a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.x");

    /* renamed from: b */
    public static final ClassLoader f324934b = ProtoParcelable.class.getClassLoader();

    /* renamed from: A */
    private final C117025g f324935A;

    /* renamed from: B */
    private final C86610af f324936B;

    /* renamed from: C */
    private final C88615s f324937C;

    /* renamed from: D */
    private final C117040v f324938D;

    /* renamed from: E */
    private final C68214a f324939E;

    /* renamed from: F */
    private final C68214a f324940F;

    /* renamed from: G */
    private final C68214a f324941G;

    /* renamed from: H */
    private final C84750a f324942H;

    /* renamed from: I */
    private final C84624a f324943I;

    /* renamed from: J */
    private final C89859i f324944J;

    /* renamed from: K */
    private final C88638k f324945K;

    /* renamed from: L */
    private final C86796k f324946L;

    /* renamed from: M */
    private final C86034c f324947M;

    /* renamed from: N */
    private C60870cx f324948N;

    /* renamed from: O */
    private int f324949O = 0;

    /* renamed from: P */
    private boolean f324950P;

    /* renamed from: Q */
    private final C19178f f324951Q;

    /* renamed from: R */
    private final C116944a f324952R;

    /* renamed from: S */
    private final C117041w f324953S;

    /* renamed from: c */
    public final Context f324954c;

    /* renamed from: f */
    public final C68214a f324955f;

    /* renamed from: g */
    public final C86124t f324956g;

    /* renamed from: h */
    public final C22871g f324957h;

    /* renamed from: i */
    public final C68214a f324958i;

    /* renamed from: j */
    public final C21370a f324959j;

    /* renamed from: k */
    C86775r f324960k;

    /* renamed from: l */
    public final C89202g f324961l;

    /* renamed from: m */
    public final C116841a f324962m;

    /* renamed from: n */
    public final C116851f f324963n;

    /* renamed from: o */
    public final C68214a f324964o;

    /* renamed from: p */
    public final C116844a f324965p;

    /* renamed from: q */
    boolean f324966q = false;

    /* renamed from: r */
    final AtomicBoolean f324967r = new AtomicBoolean();

    /* renamed from: s */
    final AtomicBoolean f324968s = new AtomicBoolean();

    /* renamed from: t */
    public volatile boolean f324969t = true;

    /* renamed from: u */
    final C116920e f324970u;

    /* renamed from: v */
    public final C84486a f324971v;

    /* renamed from: w */
    private final C88621y f324972w;

    /* renamed from: x */
    private final C68214a f324973x;

    /* renamed from: y */
    private final C22871g f324974y;

    /* renamed from: z */
    private final C22871g f324975z;

    /* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.x$a */
    /* compiled from: PG */
    public interface C117043a {
        /* renamed from: ho */
        C58833ax mo103113ho();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117042x(Context context, C21370a aVar, C116841a aVar2, C68214a aVar3, C86124t tVar, C84486a aVar4, C68214a aVar5, C88621y yVar, C86610af afVar, C90931ca caVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C22871g gVar4, C68214a aVar6, C117025g gVar5, C116840b bVar, C68214a aVar7, C68214a aVar8, C116920e eVar, C68214a aVar9, C68214a aVar10, C84750a aVar11, C89859i iVar, C68214a aVar12, C116851f fVar, C84624a aVar13, C88638k kVar, C116844a aVar14, C19178f fVar2, C116944a aVar15, C86034c cVar, C86796k kVar2) {
        super(C118575h.WORKER_SEARCHBOX, "searchboxroot");
        C116841a aVar16 = aVar2;
        C86124t tVar2 = tVar;
        C88621y yVar2 = yVar;
        C117025g gVar6 = gVar5;
        C68214a aVar17 = aVar12;
        C117041w wVar = new C117041w();
        this.f324953S = wVar;
        aVar16.f324290c = aVar16.f324288a.mo26871c();
        this.f324954c = context;
        this.f324962m = aVar16;
        this.f324974y = gVar2;
        this.f324975z = gVar3;
        this.f324957h = gVar4;
        this.f324955f = aVar3;
        this.f324958i = aVar6;
        this.f324936B = afVar;
        this.f324956g = tVar2;
        this.f324971v = aVar4;
        this.f324973x = aVar5;
        this.f324935A = gVar6;
        this.f324964o = aVar7;
        this.f324939E = aVar8;
        this.f324970u = eVar;
        this.f324940F = aVar9;
        this.f324959j = aVar;
        this.f324941G = aVar10;
        this.f324942H = aVar11;
        this.f324943I = aVar13;
        this.f324944J = iVar;
        this.f324963n = fVar;
        this.f324945K = kVar;
        this.f324965p = aVar14;
        this.f324951Q = fVar2;
        this.f324952R = aVar15;
        this.f324947M = cVar;
        this.f324946L = kVar2;
        C88613q qVar = new C88613q();
        qVar.f239499a.mo55395g(gVar6);
        qVar.f239523y = aVar17;
        bVar.setElections(qVar);
        this.f324972w = yVar2;
        qVar.mo82277f(aVar2);
        qVar.f239499a.mo55395g(yVar2);
        this.f324938D = new C117040v(this, aVar17);
        this.f324937C = new C88615s(tVar2);
        this.f324961l = new C89202g(new C88614r(qVar), wVar, caVar, gVar, gVar2, gVar3);
        long j = aVar16.f324290c;
        if (j != 0) {
            int a = C116841a.m194145a(j, aVar16.f324288a.mo26871c());
            C58976aa aaVar = C58975e.f156826a;
            aVar16.f324293f = a;
        }
    }

    /* renamed from: G */
    private static List m194533G(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(str).concat(String.valueOf(String.valueOf(Html.fromHtml(((C54228aq) it.next()).f142331b, 0)))));
        }
        return arrayList;
    }

    /* renamed from: H */
    private final void m194534H(C89234y yVar) {
        if (yVar instanceof C89232w) {
            this.f324944J.mo83702b(C89849ae.SUGGEST_RESULT_CLICK);
            mo103111E(((C89232w) yVar).f241966a);
        } else if (yVar instanceof C89233x) {
            this.f324944J.mo83702b(C89849ae.SUGGEST_RESULT_CLICK);
            this.f324974y.mo28211k(((C89233x) yVar).f241967a, "LaunchIntentCallback", new C117038t(this));
        }
    }

    /* renamed from: A */
    public final void mo78759A(C60456qs qsVar, long j) {
        this.f324938D.mo103109b(j, qsVar, (C56036l) null);
    }

    /* renamed from: B */
    public final void mo78760B() {
        C84425ag c;
        if (!this.f324967r.getAndSet(true) && (c = ((C84418a) this.f324973x.mo27525b()).mo77986c()) != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (!c.f229723f.get()) {
                c.f229723f.set(true);
                c.mo77997c();
            }
        }
    }

    /* renamed from: C */
    public final void mo78761C(Query query, int i, Query query2, Query query3, C100230y yVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84378cK() && query.mo84367c() != query.mo84315b()) {
            StringBuilder sb = new StringBuilder(query.f252768g);
            sb.replace(query.mo84367c(), query.mo84315b(), BuildConfig.FLAVOR);
            int c = query.mo84367c();
            query = query.mo84269aF(sb, c, c);
        }
        C88616t tVar = new C88616t(query, i, query.mo84346be(), query3, this.f324959j);
        if (this.f324956g.mo79746e(C90085ej.f250117U) && TextUtils.equals(query.f252768g, query2.f252768g)) {
            tVar.f239561f.putBoolean("cs::on_focus", true);
        }
        if (this.f324956g.mo79746e(C90085ej.f250104H) && TextUtils.equals(query.f252768g, query2.f252768g)) {
            tVar.f239561f.putBoolean("cs::on_focus_c", true);
        }
        if (i == 7) {
            String bk = query2.mo84352bk();
            if (!TextUtils.isEmpty(bk)) {
                tVar.f239562g.mo55429h("pq", bk);
            }
        }
        if (TextUtils.isEmpty(query.mo84352bk()) && "web".equals(query.mo84346be()) && !this.f324956g.mo79746e(C90085ej.f250240r)) {
            tVar.f239561f.putBoolean("cs::force_fetching", true);
        }
        this.f324972w.mo82289a(tVar, new C117045z(this, yVar));
    }

    /* renamed from: D */
    public final void mo103110D(C60455qr qrVar) {
        String str;
        if (!this.f324966q) {
            C58976aa aaVar = C58975e.f156826a;
            ((C89911f) this.f324939E.mo27525b()).mo83755a((Throwable) null, 20491378, 29).mo83721a();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (this.f324949O == 7) {
            str = this.f324956g.mo79758x(C90014bt.f247084aV);
        } else {
            str = this.f324956g.mo79758x(C90120fr.f250845l);
        }
        C88621y yVar = this.f324972w;
        C61820m c = yVar.f239582m.mo79191c();
        C60317oa oaVar = (C60317oa) C60318ob.f163212j.createBuilder();
        C61832y yVar2 = c.f167039i;
        if (yVar2 == null) {
            yVar2 = C61832y.f167087d;
        }
        int a = C88598d.m143211a(yVar2);
        oaVar.copyOnWrite();
        C60318ob obVar = (C60318ob) oaVar.instance;
        obVar.f163221h = a - 1;
        obVar.f163214a |= 64;
        C61832y yVar3 = c.f167036f;
        if (yVar3 == null) {
            yVar3 = C61832y.f167087d;
        }
        int a2 = C88598d.m143211a(yVar3);
        oaVar.copyOnWrite();
        C60318ob obVar2 = (C60318ob) oaVar.instance;
        obVar2.f163218e = a2 - 1;
        obVar2.f163214a |= 8;
        C61832y yVar4 = c.f167033c;
        if (yVar4 == null) {
            yVar4 = C61832y.f167087d;
        }
        int a3 = C88598d.m143211a(yVar4);
        oaVar.copyOnWrite();
        C60318ob obVar3 = (C60318ob) oaVar.instance;
        obVar3.f163215b = a3 - 1;
        obVar3.f163214a |= 1;
        int i = c.f167034d;
        oaVar.copyOnWrite();
        C60318ob obVar4 = (C60318ob) oaVar.instance;
        obVar4.f163214a |= 2;
        obVar4.f163216c = i;
        C61832y yVar5 = c.f167035e;
        if (yVar5 == null) {
            yVar5 = C61832y.f167087d;
        }
        int a4 = C88598d.m143211a(yVar5);
        oaVar.copyOnWrite();
        C60318ob obVar5 = (C60318ob) oaVar.instance;
        obVar5.f163217d = a4 - 1;
        obVar5.f163214a |= 4;
        C61832y yVar6 = c.f167037g;
        if (yVar6 == null) {
            yVar6 = C61832y.f167087d;
        }
        int a5 = C88598d.m143211a(yVar6);
        oaVar.copyOnWrite();
        C60318ob obVar6 = (C60318ob) oaVar.instance;
        obVar6.f163219f = a5 - 1;
        obVar6.f163214a |= 16;
        C61832y yVar7 = c.f167038h;
        if (yVar7 == null) {
            yVar7 = C61832y.f167087d;
        }
        int a6 = C88598d.m143211a(yVar7);
        oaVar.copyOnWrite();
        C60318ob obVar7 = (C60318ob) oaVar.instance;
        obVar7.f163220g = a6 - 1;
        obVar7.f163214a |= 32;
        C61832y yVar8 = c.f167040j;
        if (yVar8 == null) {
            yVar8 = C61832y.f167087d;
        }
        int a7 = C88598d.m143211a(yVar8);
        oaVar.copyOnWrite();
        C60318ob obVar8 = (C60318ob) oaVar.instance;
        obVar8.f163222i = a7 - 1;
        obVar8.f163214a |= 128;
        C60318ob obVar9 = (C60318ob) oaVar.build();
        qrVar.copyOnWrite();
        C60456qs qsVar = (C60456qs) qrVar.instance;
        C60456qs qsVar2 = C60456qs.f163602g;
        obVar9.getClass();
        qsVar.f163608e = obVar9;
        qsVar.f163604a |= 16;
        apd apd = ((C60456qs) qrVar.instance).f163607d;
        if (apd == null) {
            apd = apd.f159555aA;
        }
        amt amt = (amt) apd.toBuilder();
        yVar.f239581l.mo82187g(amt, str);
        qrVar.copyOnWrite();
        C60456qs qsVar3 = (C60456qs) qrVar.instance;
        apd apd2 = (apd) amt.build();
        apd2.getClass();
        qsVar3.f163607d = apd2;
        qsVar3.f163604a |= 4;
    }

    /* renamed from: E */
    public final void mo103111E(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        intent.putExtra("android.intent.extra.REFERRER", C90721ae.f253801j);
        if (intent.hasCategory("android.intent.category.BROWSABLE")) {
            intent.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", 2);
        }
        this.f324968s.set(true);
        ((C91097g) this.f324940F.mo27525b()).mo65089a(intent);
    }

    /* renamed from: F */
    public final void mo103112F(C88616t tVar) {
        this.f324972w.mo82289a(tVar, new C117026h(this));
    }

    /* renamed from: a */
    public final C60870cx mo78762a(Suggestion suggestion) {
        if (!suggestion.f108925z.contains(517)) {
            return C60866ct.f164955a;
        }
        C58976aa aaVar = C58975e.f156826a;
        return this.f324957h.mo28210j(this.f324947M.mo79697b(), "getCurrentAccountId", new C117029k(this));
    }

    /* renamed from: c */
    public final C60870cx mo78763c(Query query) {
        C60456qs qsVar;
        C56036l lVar;
        if (this.f324956g.mo79746e(C90085ej.f250106J)) {
            if (this.f324956g.mo79746e(C90085ej.f250120X)) {
                C116851f fVar = this.f324963n;
                ((C85919cm) fVar.f324315a.mo27525b()).mo79547f(fVar.f324316b);
            } else {
                C117040v vVar = this.f324938D;
                C117039u uVar = vVar.f324928b;
                if (!(uVar == null || (lVar = uVar.f324926c) == null)) {
                    ((C85919cm) vVar.f324929c.f324955f.mo27525b()).mo79547f(lVar);
                }
            }
        }
        byte[] bArr = query.f252782u;
        if (bArr != null) {
            try {
                C60455qr qrVar = (C60455qr) ((C60456qs) C62942bv.parseFrom((C62942bv) C60456qs.f163602g, bArr, C62921ba.m95368a())).toBuilder();
                mo103110D(qrVar);
                qsVar = (C60456qs) qrVar.build();
            } catch (C62974ct e) {
                C59104x c = f324933a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "sb.r.SbWorkerImpl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32440)).mo56386p("Error while parsing UiStats.");
                qsVar = null;
            }
            if (qsVar != null) {
                return C60856cj.m92900i(query.mo84299ak(qsVar).mo84289aZ((byte[]) null));
            }
        }
        return C60856cj.m92900i(query);
    }

    /* renamed from: e */
    public final C60870cx mo78764e(Query query, C8575bc bcVar) {
        C116920e eVar = this.f324970u;
        synchronized (eVar) {
            eVar.f324618a = query;
            eVar.f324619b = bcVar;
        }
        if (!this.f324969t && this.f324956g.mo79746e(C90085ej.f250118V) && "web".equals(query.mo84346be())) {
            C88616t tVar = new C88616t(query, 1, "web", (Query) null, this.f324959j);
            tVar.f239561f.putBoolean("cs::on_focus_prefetch", true);
            tVar.f239561f.putBoolean("cs::on_focus", true);
            long a = this.f324956g.mo79743a(C90085ej.f250203be);
            if (a > 0) {
                this.f324957h.mo28213m("OnFocusSRPPrefetch", a, new C117037s(this, tVar));
            } else {
                mo103112F(tVar);
            }
        }
        return C118826c.f331423b;
    }

    /* renamed from: f */
    public final C60870cx mo78765f(Query query, Suggestion suggestion, C88332xt xtVar) {
        C89234y yVar;
        String str = xtVar.f238884b;
        C60456qs qsVar = xtVar.f238885c;
        if (qsVar == null) {
            qsVar = C60456qs.f163602g;
        }
        C60455qr qrVar = (C60455qr) qsVar.toBuilder();
        mo103110D(qrVar);
        C58976aa aaVar = C58975e.f156826a;
        C88621y yVar2 = this.f324972w;
        C60456qs qsVar2 = (C60456qs) qrVar.build();
        C88595k kVar = (C88595k) yVar2.f239579j.get(Integer.valueOf(suggestion.f108909j));
        if (kVar == null) {
            C59104x d = C88621y.f239570a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.r.SbRoot");
            ((C59052c) ((C59052c) d).mo56372aa(9934)).mo56387q("No suggestion action button click handler registered for source %d", suggestion.f108909j);
            int i = C90755l.f253831a;
            yVar = new C89231v();
        } else {
            yVar = kVar.mo82258b(query, suggestion, str, qsVar2);
        }
        m194534H(yVar);
        return C60856cj.m92900i(yVar);
    }

    /* renamed from: g */
    public final C60870cx mo78766g(Query query, Bundle bundle, C88335xw xwVar) {
        C89234y yVar;
        C58833ax axVar;
        String str = xwVar.f238892b;
        C58837ba.m90856e(xwVar.f238894d);
        C60456qs qsVar = xwVar.f238893c;
        if (qsVar == null) {
            qsVar = C60456qs.f163602g;
        }
        C60455qr qrVar = (C60455qr) qsVar.toBuilder();
        mo103110D(qrVar);
        if (this.f324956g.mo79746e(C90085ej.f250106J)) {
            if (this.f324956g.mo79746e(C90085ej.f250120X)) {
                if ((xwVar.f238891a & 64) != 0) {
                    C56034j jVar = xwVar.f238898h;
                    if (jVar == null) {
                        jVar = C56034j.f149219g;
                    }
                    axVar = C58833ax.m90834k(jVar);
                } else {
                    axVar = C58836b.f156633a;
                }
                C116851f fVar = this.f324963n;
                if (axVar.mo56113h()) {
                    C56032h hVar = (C56032h) fVar.f324316b.toBuilder();
                    C56034j jVar2 = (C56034j) axVar.mo56107c();
                    hVar.copyOnWrite();
                    C56036l lVar = (C56036l) hVar.instance;
                    jVar2.getClass();
                    lVar.f149232c = jVar2;
                    lVar.f149230a |= 1;
                    ((C85919cm) fVar.f324315a.mo27525b()).mo79547f((C56036l) hVar.build());
                } else {
                    ((C85919cm) fVar.f324315a.mo27525b()).mo79547f(fVar.f324316b);
                }
            } else {
                C85919cm cmVar = (C85919cm) this.f324955f.mo27525b();
                C56036l lVar2 = xwVar.f238897g;
                if (lVar2 == null) {
                    lVar2 = C56036l.f149228f;
                }
                cmVar.mo79547f(lVar2);
            }
        }
        C60456qs qsVar2 = (C60456qs) qrVar.build();
        if (!this.f324966q) {
            C58976aa aaVar = C58975e.f156826a;
            ((C89911f) this.f324939E.mo27525b()).mo83755a((Throwable) null, 20491378, 29).mo83721a();
            yVar = new C89231v();
        } else {
            Bundle bundle2 = bundle.getBundle("extra_suggestion");
            bundle2.setClassLoader(Suggestion.class.getClassLoader());
            Suggestion suggestion = (Suggestion) bundle2.getParcelable("a");
            C58976aa aaVar2 = C58975e.f156826a;
            this.f324942H.mo78460a(suggestion);
            C88596l lVar3 = (C88596l) this.f324972w.f239578i.get(Integer.valueOf(suggestion.f108910k));
            if (lVar3 == null) {
                C59104x d = C88621y.f239570a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "sb.r.SbRoot");
                ((C59052c) ((C59052c) d).mo56372aa(9935)).mo56387q("No suggestion click handler registered for type %d", suggestion.f108910k);
                int i = C90755l.f253831a;
                yVar = new C89231v();
            } else {
                yVar = lVar3.mo82255b(suggestion, str, qsVar2 != null ? (C60455qr) qsVar2.toBuilder() : null, query, bundle);
            }
        }
        m194534H(yVar);
        return C60856cj.m92900i(yVar);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchboxWorkerImpl");
        fVar.mo85285l((C90964a) this.f324973x.mo27525b());
    }

    /* renamed from: h */
    public final C60870cx mo78767h(Suggestion suggestion) {
        if (!this.f324966q) {
            C58976aa aaVar = C58975e.f156826a;
            ((C89911f) this.f324939E.mo27525b()).mo83755a((Throwable) null, 20491378, 29).mo83721a();
            return C60856cj.m92900i(false);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C88621y yVar = this.f324972w;
        C60870cx a = yVar.f239573d.mo28201a("RemoveSuggestion", new C88618v(yVar, suggestion));
        new C90873ag(a, this.f324975z, "RemoveSuggestion", new C117027i(this, suggestion)).mo85223a(new C117028j(suggestion));
        return a;
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C58976aa aaVar = C58975e.f156826a;
        this.f324961l.mo83155a();
        this.f324966q = false;
        this.f324949O = 0;
    }

    /* renamed from: i */
    public final C60870cx mo78768i(long j, boolean z, Bundle bundle) {
        mo78784z(bundle);
        C86775r rVar = this.f324936B.f233977l;
        C58976aa aaVar = C58975e.f156826a;
        if (rVar == null) {
            return C60856cj.m92900i(false);
        }
        if (j != rVar.f234381c) {
            return C60856cj.m92900i(false);
        }
        if (this.f324960k != null) {
            return C60856cj.m92900i(false);
        }
        if (!this.f324966q) {
            C116841a aVar = this.f324962m;
            aVar.f324291d = aVar.f324288a.mo26871c();
            this.f324961l.mo83158d(this.f324937C);
            this.f324966q = true;
            C116841a aVar2 = this.f324962m;
            long j2 = aVar2.f324291d;
            if (j2 != 0) {
                aVar2.f324294g = C116841a.m194145a(j2, aVar2.f324288a.mo26871c());
            }
        }
        C116841a aVar3 = this.f324962m;
        aVar3.f324292e = aVar3.f324288a.mo26871c();
        if (z) {
            this.f324961l.mo83157c();
            ((C85919cm) this.f324955f.mo27525b()).mo79546e();
        }
        this.f324960k = rVar;
        this.f324969t = false;
        C60870cx a = this.f324974y.mo28201a("SbWorkerImpl.LifecycleMngr.start", new C117032n(this));
        this.f324948N = a;
        new C90873ag(a, this.f324957h, "lifecycleManager start callback", new C117033o(this)).mo85223a(new C117034p(this));
        C60870cx cxVar = this.f324948N;
        cxVar.getClass();
        return cxVar;
    }

    /* renamed from: j */
    public final C60870cx mo78769j() {
        C58976aa aaVar = C58975e.f156826a;
        this.f324961l.mo83157c();
        ((C85919cm) this.f324955f.mo27525b()).mo79546e();
        this.f324968s.set(false);
        return C118826c.f331423b;
    }

    /* renamed from: k */
    public final C60870cx mo78770k(long j) {
        C84425ag c;
        C58976aa aaVar = C58975e.f156826a;
        C86775r rVar = this.f324960k;
        if (rVar == null || rVar.f234381c != j) {
            return C60856cj.m92900i(false);
        }
        C60870cx cxVar = this.f324948N;
        if (cxVar != null && !cxVar.isDone()) {
            this.f324948N.cancel(true);
        }
        this.f324969t = true;
        C86775r rVar2 = this.f324960k;
        if (rVar2 != null && !rVar2.f234393o && !this.f324968s.getAndSet(false)) {
            this.f324938D.mo103108a();
        }
        this.f324960k = null;
        this.f324961l.mo83160f();
        this.f324948N = null;
        if (this.f324967r.getAndSet(false) && (c = ((C84418a) this.f324973x.mo27525b()).mo77986c()) != null && c.f229723f.get()) {
            c.f229723f.set(false);
            c.f229721d.mo28212l("maybeDisconnect", new C84453t(c));
        }
        if (this.f324950P) {
            this.f324950P = false;
            if (this.f324956g.mo79746e(C90085ej.f250109M)) {
                C19178f fVar = this.f324951Q;
                C19182j jVar = (C19182j) C19185m.f53723f.createBuilder();
                jVar.copyOnWrite();
                C19185m mVar = (C19185m) jVar.instance;
                mVar.f53726b = 2;
                mVar.f53725a |= 1;
                C19167ba a = this.f324952R.mo103065a();
                jVar.copyOnWrite();
                C19185m mVar2 = (C19185m) jVar.instance;
                a.getClass();
                mVar2.f53727c = a;
                mVar2.f53725a |= 2;
                fVar.mo24309b((C19185m) jVar.build());
            }
        }
        return C60856cj.m92900i(true);
    }

    /* renamed from: l */
    public final void mo78771l(int i) {
        this.f324949O = i;
    }

    /* renamed from: m */
    public final void mo78772m() {
        if (!this.f324966q) {
            C58976aa aaVar = C58975e.f156826a;
            ((C89911f) this.f324939E.mo27525b()).mo83755a((Throwable) null, 20491378, 29).mo83721a();
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C88621y yVar = this.f324972w;
        C90875ai.m148465b(C117030l.f324914a, yVar.f239574e.mo28201a("clearZeroPrefixCache", new C88619w(yVar)), this.f324975z, "clearZeroPrefixCache").mo85223a(C117031m.f324915a);
    }

    /* renamed from: n */
    public final void mo78773n() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f324969t) {
            mo78784z(new Bundle());
            this.f324961l.mo83158d(this.f324937C);
            this.f324961l.mo83157c();
            this.f324961l.mo83159e();
        }
        C88616t tVar = new C88616t(Query.f252741b, 1, "web", (Query) null, this.f324959j);
        tVar.f239561f.putBoolean("bs:bootstrapping", true);
        this.f324972w.mo82289a(tVar, new C117035q(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78774p(com.google.android.libraries.searchbox.shared.response.Response r10, com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq r11, com.google.android.apps.gsa.shared.search.Query r12) {
        /*
            r9 = this;
            int r0 = r11.f238874f
            r1 = 7
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            if (r0 != r2) goto L_0x0061
            r0 = 2
        L_0x000c:
            com.google.android.apps.gsa.staticplugins.searchboxroot.v r4 = r9.f324938D
            long r5 = r11.f238870b
            com.google.common.o.qs r7 = r11.f238871c
            if (r7 != 0) goto L_0x0016
            com.google.common.o.qs r7 = com.google.common.p4552o.C60456qs.f163602g
        L_0x0016:
            com.google.bj.l r8 = r11.f238877i
            if (r8 != 0) goto L_0x001c
            com.google.bj.l r8 = com.google.p4184bj.C56036l.f149228f
        L_0x001c:
            r4.mo103109b(r5, r7, r8)
            com.google.android.apps.gsa.staticplugins.searchboxroot.f r4 = r9.f324963n
            com.google.bj.l r5 = r11.f238877i
            if (r5 != 0) goto L_0x0027
            com.google.bj.l r5 = com.google.p4184bj.C56036l.f149228f
        L_0x0027:
            r4.f324316b = r5
            boolean r4 = r11.f238872d
            if (r4 == 0) goto L_0x0046
            if (r0 == r3) goto L_0x0031
            if (r0 != r1) goto L_0x0046
        L_0x0031:
            com.google.android.apps.gsa.search.core.i.t r1 = r9.f324956g
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89995ba.f246770r
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x0046
            dagger.a r1 = r9.f324941G
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.q r1 = (com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a.C117008q) r1
            r1.mo103090b()
        L_0x0046:
            com.google.android.apps.gsa.searchbox.c.y r1 = r9.f324972w
            java.util.Collection r1 = r1.f239577h
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
            r4 = 0
            com.google.common.b.sm r1 = r1.listIterator(r4)
        L_0x0051:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0061
            java.lang.Object r4 = r1.next()
            com.google.android.apps.gsa.searchbox.c.l r4 = (com.google.android.apps.gsa.searchbox.p6944c.C88608l) r4
            r4.mo82267a(r10)
            goto L_0x0051
        L_0x0061:
            if (r0 != r3) goto L_0x00cf
            boolean r10 = r11.f238872d
            if (r10 == 0) goto L_0x00cf
            com.google.android.apps.gsa.search.core.al.ac.a r10 = r9.f324943I
            r10.mo78386f()
            com.google.android.apps.gsa.search.core.i.t r10 = r9.f324956g
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250110N
            boolean r10 = r10.mo79746e(r11)
            if (r10 == 0) goto L_0x00cf
            boolean r10 = r12.mo84407cn()
            if (r10 == 0) goto L_0x00cf
            boolean r10 = r9.f324950P
            if (r10 != 0) goto L_0x00cf
            r9.f324950P = r3
            com.google.android.libraries.assistant.s.b.f r10 = r9.f324951Q
            com.google.android.libraries.assistant.s.b.m r11 = com.google.android.libraries.assistant.p1594s.p1597b.C19185m.f53723f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.assistant.s.b.j r11 = (com.google.android.libraries.assistant.p1594s.p1597b.C19182j) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.android.libraries.assistant.s.b.m r12 = (com.google.android.libraries.assistant.p1594s.p1597b.C19185m) r12
            r12.f53726b = r3
            int r0 = r12.f53725a
            r0 = r0 | r3
            r12.f53725a = r0
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.f.a r12 = r9.f324952R
            com.google.android.libraries.assistant.s.b.ba r12 = r12.mo103065a()
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.s.b.m r0 = (com.google.android.libraries.assistant.p1594s.p1597b.C19185m) r0
            r12.getClass()
            r0.f53727c = r12
            int r12 = r0.f53725a
            r12 = r12 | r2
            r0.f53725a = r12
            com.google.android.libraries.f.a r12 = r9.f324959j
            long r0 = r12.mo26871c()
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.android.libraries.assistant.s.b.m r12 = (com.google.android.libraries.assistant.p1594s.p1597b.C19185m) r12
            int r2 = r12.f53725a
            r2 = r2 | 4
            r12.f53725a = r2
            r12.f53728d = r0
            com.google.protobuf.bv r11 = r11.build()
            com.google.android.libraries.assistant.s.b.m r11 = (com.google.android.libraries.assistant.p1594s.p1597b.C19185m) r11
            r10.mo24309b(r11)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.C117042x.mo78774p(com.google.android.libraries.searchbox.shared.response.Response, com.google.android.apps.gsa.search.shared.service.b.xq, com.google.android.apps.gsa.shared.search.Query):void");
    }

    /* renamed from: q */
    public final void mo78775q() {
        if (this.f324956g.mo79746e(C90085ej.f250185bI)) {
            C47633f.m84733g(this.f324947M.mo79697b()).mo51516i(new C117036r(this), C60826bg.f164896a);
        }
    }

    /* renamed from: r */
    public final void mo78776r(Query query, boolean z) {
        C117040v vVar = this.f324938D;
        if (!C58832aw.m90831a(vVar.f324927a, query)) {
            Query query2 = vVar.f324927a;
            if (query2 == null || ((!query2.mo84392cY() && !query2.mo84385cR()) || !query.mo84420dA())) {
                vVar.f324928b = null;
            } else {
                vVar.mo103108a();
            }
            vVar.f324927a = query;
        } else if ((query.mo84385cR() || query.mo84392cY()) && !z) {
            vVar.mo103108a();
        }
    }

    /* renamed from: s */
    public final void mo78777s(List list) {
        C8541au auVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C54228aq aqVar = (C54228aq) it.next();
            C62963cj cjVar = new C62963cj(aqVar.f142333d, C54228aq.f142327e);
            if (cjVar.contains(C64369b.SUBTYPE_USE_AS_HINT_TEXT) || cjVar.contains(C64369b.SUBTYPE_USE_AS_HINT_TEXT_QSB)) {
                arrayList.add(aqVar);
            }
            if (cjVar.contains(C64369b.SUBTYPE_USE_AS_HINT_TEXT) || cjVar.contains(C64369b.SUBTYPE_USE_AS_HINT_TEXT_HOME_SCREEN)) {
                arrayList2.add(aqVar);
            }
        }
        String x = this.f324956g.mo79758x(C90085ej.f250197bU);
        C89262e eVar = (C89262e) C89267j.f242039f.createBuilder();
        eVar.copyOnWrite();
        C89267j jVar = (C89267j) eVar.instance;
        jVar.f242044d = 1;
        jVar.f242041a |= 4;
        int i = true != TextUtils.isEmpty(x) ? 21 : 11;
        eVar.copyOnWrite();
        C89267j jVar2 = (C89267j) eVar.instance;
        jVar2.f242042b = i - 1;
        jVar2.f242041a |= 1;
        eVar.copyOnWrite();
        C89267j jVar3 = (C89267j) eVar.instance;
        x.getClass();
        jVar3.f242041a |= 2;
        jVar3.f242043c = x;
        if (arrayList.isEmpty()) {
            this.f324945K.mo82296a((C89267j) eVar.build());
        } else {
            C54228aq aqVar2 = (C54228aq) arrayList.get(0);
            long b = this.f324959j.mo26870b();
            C54216ae aeVar = aqVar2.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            C62971cq cqVar = aeVar.f142310u;
            Iterator it2 = cqVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    auVar = null;
                    break;
                }
                auVar = (C8541au) it2.next();
                if (C89212c.m145118b(auVar, b)) {
                    break;
                }
            }
            if (!cqVar.isEmpty()) {
                if (auVar == null) {
                    C58976aa aaVar = C58975e.f156826a;
                    String str = aqVar2.f142331b;
                    this.f324945K.mo82296a((C89267j) eVar.build());
                } else {
                    long j = auVar.f29634b;
                    eVar.copyOnWrite();
                    C89267j jVar4 = (C89267j) eVar.instance;
                    jVar4.f242041a |= 8;
                    jVar4.f242045e = (int) (j - b);
                }
            }
            C89267j jVar5 = (C89267j) eVar.build();
            String x2 = this.f324956g.mo79758x(C90085ej.f250174ay);
            List G = m194533G(BuildConfig.FLAVOR, arrayList);
            List G2 = m194533G(x2, arrayList);
            C58976aa aaVar2 = C58975e.f156826a;
            C88638k kVar = this.f324945K;
            if (!G2.equals(Arrays.asList(kVar.f239626b.getString("search_widget_current_hint_list", BuildConfig.FLAVOR).split(";")))) {
                Intent f = C89257aa.m145194f(G2, G);
                f.putExtra("hint-text-update-context", jVar5.toByteArray());
                kVar.f239625a.sendBroadcast(f);
            }
        }
        List G3 = m194533G(this.f324956g.mo79758x(C90085ej.f250174ay), arrayList2);
        C58976aa aaVar3 = C58975e.f156826a;
        C86341u uVar = new C86341u((C86346z) ((C86127w) this.f324958i.mo27525b()).f232790a.mo79722a());
        uVar.mo80073h("search_widget_current_hint_list_homescreen", new C58827ar(";").mo56097d(G3));
        uVar.mo80086l(false);
        if (this.f324956g.mo79746e(C89972ak.f246528C)) {
            this.f324946L.mo80464a((String) C58557jl.m90130k(G3, BuildConfig.FLAVOR));
        }
    }

    /* renamed from: t */
    public final void mo78778t(C87848fv fvVar, C90182a aVar) {
        if (this.f324960k != null) {
            C88621y yVar = this.f324972w;
            C88540a aVar2 = (C88540a) yVar.f239580k.get(Integer.valueOf(fvVar.f237685c));
            if (aVar2 == null) {
                C59104x d = C88621y.f239570a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "sb.r.SbRoot");
                ((C59052c) ((C59052c) d).mo56372aa(9937)).mo56387q("No generic suggest event handler registered for event id %d", fvVar.f237685c);
                int i = C90755l.f253831a;
                return;
            }
            yVar.f239572c.mo28211k(aVar2.mo82174b(fvVar), "Handle GenericSuggest Response", new C88620x(aVar));
        }
    }

    /* renamed from: u */
    public final void mo78779u(C88168rr rrVar, Bundle bundle) {
        C117025g gVar = this.f324935A;
        synchronized (gVar.f324904a) {
            gVar.f324907d = rrVar;
            gVar.f324908e = bundle;
        }
    }

    /* renamed from: v */
    public final void mo78780v(Query query, Suggestion suggestion) {
        C60644xn xnVar = (C60644xn) C60645xo.f164528d.createBuilder();
        int i = suggestion.f108910k;
        xnVar.copyOnWrite();
        C60645xo xoVar = (C60645xo) xnVar.instance;
        xoVar.f164530a |= 1;
        xoVar.f164531b = i;
        if (!suggestion.f108925z.isEmpty()) {
            C58485gu guVar = suggestion.f108925z;
            xnVar.copyOnWrite();
            C60645xo xoVar2 = (C60645xo) xnVar.instance;
            C62961ch chVar = xoVar2.f164532c;
            if (!chVar.mo58948c()) {
                xoVar2.f164532c = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) guVar, (List) xoVar2.f164532c);
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 882;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60645xo xoVar3 = (C60645xo) xnVar.build();
        xoVar3.getClass();
        ufVar3.f164185bm = xoVar3;
        ufVar3.f164252g |= C89885b.S3REQUEST_VALUE;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: w */
    public final void mo78781w() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f324960k != null) {
            this.f324961l.mo83160f();
            this.f324961l.mo83156b(this.f324937C);
            this.f324961l.mo83159e();
        }
    }

    /* renamed from: x */
    public final void mo78782x(int i) {
        synchronized (this.f324935A.f324904a) {
        }
    }

    /* renamed from: y */
    public final void mo78783y(ClientConfig clientConfig, String str) {
        C117025g gVar = this.f324935A;
        synchronized (gVar.f324904a) {
            gVar.f324905b = clientConfig;
            gVar.f324906c = str;
        }
    }

    /* renamed from: z */
    public final void mo78784z(Bundle bundle) {
        ClassLoader classLoader;
        if (!(bundle == null || (classLoader = f324934b) == null)) {
            bundle.setClassLoader(classLoader);
        }
        C117041w wVar = this.f324953S;
        synchronized (wVar.f324931a) {
            wVar.f324932b = bundle;
        }
    }
}
