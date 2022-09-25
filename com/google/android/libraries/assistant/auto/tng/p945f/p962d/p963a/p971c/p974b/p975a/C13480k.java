package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p974b.p975a;

import android.content.Context;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p972a.C13463a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p974b.C13469a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13483b;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13484c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13485d;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13518d;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17023t;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5543b.p5544a.C70946j;
import p5535j.p5536a.p5543b.p5544a.C70948l;
import p5535j.p5536a.p5543b.p5544a.C70953q;
import p5535j.p5536a.p5543b.p5544a.C70954r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.b.a.k */
/* compiled from: PG */
public final class C13480k implements C13469a {

    /* renamed from: a */
    public static final C59071e f41338a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.a.c.b.a.k");

    /* renamed from: b */
    public final C86124t f41339b;

    /* renamed from: c */
    public final C13463a f41340c;

    /* renamed from: d */
    public final C29409fd f41341d;

    /* renamed from: e */
    public final Context f41342e;

    /* renamed from: f */
    public final C60887da f41343f;

    /* renamed from: g */
    public final Executor f41344g;

    /* renamed from: h */
    public final C47770dh f41345h;

    /* renamed from: i */
    public final C17039af f41346i;

    /* renamed from: j */
    public final C17023t f41347j;

    /* renamed from: k */
    public final Map f41348k = C58662ni.m90351j(2);

    /* renamed from: l */
    public C58833ax f41349l;

    /* renamed from: m */
    public C58833ax f41350m;

    /* renamed from: n */
    public int f41351n;

    /* renamed from: o */
    private final C16850a f41352o;

    /* renamed from: p */
    private final C42813k f41353p;

    /* renamed from: q */
    private final C15481g f41354q;

    /* renamed from: r */
    private final C69464a f41355r;

    /* renamed from: s */
    private final C69464a f41356s;

    /* renamed from: t */
    private final C69464a f41357t;

    /* renamed from: u */
    private final C69464a f41358u;

    /* renamed from: v */
    private final C69464a f41359v;

    /* renamed from: w */
    private final C69464a f41360w;

    /* renamed from: x */
    private int f41361x;

    /* renamed from: y */
    private long f41362y;

    /* renamed from: z */
    private String f41363z;

    public C13480k(C13463a aVar, C29409fd fdVar, C16850a aVar2, C60887da daVar, Context context, C42813k kVar, C86124t tVar, C47770dh dhVar, C17039af afVar, C17023t tVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C15481g gVar) {
        C58836b bVar = C58836b.f156633a;
        this.f41349l = bVar;
        this.f41350m = bVar;
        this.f41351n = 1;
        this.f41361x = 0;
        this.f41362y = 0;
        this.f41363z = BuildConfig.FLAVOR;
        this.f41340c = aVar;
        this.f41341d = fdVar;
        this.f41352o = aVar2;
        this.f41343f = daVar;
        this.f41342e = context;
        this.f41344g = new C60904dr(daVar);
        this.f41339b = tVar;
        this.f41353p = kVar;
        this.f41345h = dhVar;
        this.f41346i = afVar;
        this.f41347j = tVar2;
        this.f41355r = aVar3;
        this.f41356s = aVar4;
        this.f41357t = aVar5;
        this.f41358u = aVar6;
        this.f41359v = aVar7;
        this.f41360w = aVar8;
        this.f41354q = gVar;
    }

    /* renamed from: e */
    private static int m29732e(C62722b bVar, C13484c cVar) {
        if (!bVar.equals(C62722b.OK) || cVar == null) {
            return 4;
        }
        int c = cVar.mo21120c();
        int i = c - 1;
        if (c == 0) {
            throw null;
        } else if (i == 0) {
            return 3;
        } else {
            if (i != 1) {
                return i != 2 ? 1 : 5;
            }
            return 2;
        }
    }

    /* renamed from: a */
    public final C60870cx mo21111a() {
        C60870cx cxVar;
        C59071e eVar = f41338a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TcLibProvider");
        ((C59052c) ((C59052c) b).mo56372aa(44836)).mo56386p("#provide");
        if (this.f41349l.mo56113h()) {
            return C60856cj.m92900i((TextClassifierLib) this.f41349l.mo56107c());
        }
        this.f41354q.mo22352b(C37179a.f97495bN);
        C60870cx a = C13518d.m29802a(this.f41352o, this.f41343f);
        if (((Boolean) this.f41355r.mo17428b()).booleanValue()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TcLibProvider");
            ((C59052c) ((C59052c) b2).mo56372aa(44838)).mo56386p("Try to get model files from GDD");
            C13471b bVar = new C13471b(this);
            cxVar = C60922j.m93045h(a, C47810es.m84966f(bVar), this.f41344g);
        } else {
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "TcLibProvider");
            ((C59052c) ((C59052c) b3).mo56372aa(44837)).mo56386p("Try to get model files from MDD");
            C13476g gVar = new C13476g(this);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(gVar), this.f41344g);
            C13474e eVar2 = new C13474e(this);
            cxVar = C60922j.m93045h(n, C47810es.m84966f(eVar2), this.f41344g);
        }
        return C47638k.m84751b(cxVar, a).mo51521b(new C13475f(this, a), this.f41344g);
    }

    /* renamed from: b */
    public final C13484c mo21115b(C13483b bVar) {
        C13484c cVar = (C13484c) this.f41348k.get(bVar);
        if (cVar != null && !((Boolean) this.f41356s.mo17428b()).booleanValue()) {
            return cVar;
        }
        String str = (String) C58495hd.m89901o(C13483b.ACTIONS_SUGGESTIONS, (String) this.f41357t.mo17428b(), C13483b.LANG_ID, (String) this.f41358u.mo17428b()).getOrDefault(bVar, BuildConfig.FLAVOR);
        C59104x b = f41338a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TcLibProvider");
        ((C59052c) ((C59052c) b).mo56372aa(44834)).mo56389s("Use static model path: %s", str);
        return C13485d.m29743a(new File(str), bVar, 1);
    }

    /* renamed from: c */
    public final void mo21116c(C62722b bVar, C13484c cVar, C13484c cVar2) {
        int e = m29732e(bVar, cVar2);
        int e2 = m29732e(bVar, cVar);
        C70946j jVar = (C70946j) C70948l.f189170g.createBuilder();
        jVar.copyOnWrite();
        C70948l lVar = (C70948l) jVar.instance;
        lVar.f189174c = e - 1;
        lVar.f189172a |= 2;
        jVar.copyOnWrite();
        C70948l lVar2 = (C70948l) jVar.instance;
        lVar2.f189173b = e2 - 1;
        lVar2.f189172a |= 1;
        if (e == 2 || e2 == 2) {
            int i = this.f41361x;
            jVar.copyOnWrite();
            C70948l lVar3 = (C70948l) jVar.instance;
            lVar3.f189172a |= 4;
            lVar3.f189175d = i;
        } else if (e == 5 || e2 == 5) {
            long j = this.f41362y;
            jVar.copyOnWrite();
            C70948l lVar4 = (C70948l) jVar.instance;
            lVar4.f189172a |= 8;
            lVar4.f189176e = j;
            String str = this.f41363z;
            jVar.copyOnWrite();
            C70948l lVar5 = (C70948l) jVar.instance;
            str.getClass();
            lVar5.f189172a |= 16;
            lVar5.f189177f = str;
        }
        C15481g gVar = this.f41354q;
        C37252a i2 = C37179a.f97531bx.mo40815i(bVar);
        C62940bt btVar = C70954r.f189185d;
        C70953q qVar = (C70953q) C70954r.f189184c.createBuilder();
        C70948l lVar6 = (C70948l) jVar.build();
        qVar.copyOnWrite();
        C70954r rVar = (C70954r) qVar.instance;
        lVar6.getClass();
        rVar.f189188b = lVar6;
        rVar.f189187a = 1;
        ((C37253b) i2).mo40792p(btVar, (C70954r) qVar.build());
        gVar.mo22352b(i2);
    }

    /* renamed from: d */
    public final void mo21117d(C29690f fVar) {
        if (fVar == null || fVar.f80416g.size() == 0) {
            C59104x d = f41338a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TcLibProvider");
            ((C59052c) ((C59052c) d).mo56372aa(44846)).mo56386p("Model file group is empty");
            return;
        }
        this.f41361x = fVar.f80414e;
        this.f41362y = fVar.f80417h;
        this.f41363z = fVar.f80418i;
        for (C28595b bVar : fVar.f80416g) {
            C13483b bVar2 = (C13483b) C58495hd.m89901o((String) this.f41359v.mo17428b(), C13483b.ACTIONS_SUGGESTIONS, (String) this.f41360w.mo17428b(), C13483b.LANG_ID).getOrDefault(bVar.f77798b, C13483b.UNKNOWN_MODEL_TYPE);
            if (C13483b.UNKNOWN_MODEL_TYPE.equals(bVar2)) {
                C59104x d2 = f41338a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TcLibProvider");
                ((C59052c) ((C59052c) d2).mo56372aa(44848)).mo56389s("Unexpected file id: %s", bVar.f77798b);
            } else {
                try {
                    Map map = this.f41348k;
                    C42813k kVar = this.f41353p;
                    Uri parse = Uri.parse(bVar.f77799c);
                    C42788l lVar = new C42788l();
                    lVar.f112052a = true;
                    File file = (File) kVar.mo45889c(parse, lVar);
                    C59104x b = f41338a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "TcLibProvider");
                    ((C59052c) ((C59052c) b).mo56372aa(44833)).mo56389s("Use MDD model path: %s", file.getPath());
                    map.put(bVar2, C13485d.m29743a(file, bVar2, true != ((Boolean) this.f41355r.mo17428b()).booleanValue() ? 2 : 3));
                } catch (IOException | IllegalArgumentException e) {
                    C59104x c = f41338a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "TcLibProvider");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(44847)).mo56386p("Failed to open MDD client file.");
                }
            }
        }
    }
}
