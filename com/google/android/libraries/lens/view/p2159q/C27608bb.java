package com.google.android.libraries.lens.view.p2159q;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24438a;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24439aa;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24441ac;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24442ad;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24448c;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24449d;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24451f;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24463r;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.lens.view.p2159q.p2160a.C27555b;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.aaz;
import com.google.common.p4552o.aba;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4563i.C59901bj;
import com.google.common.p4552o.p4563i.C59902bk;
import com.google.common.p4552o.p4563i.C59903bl;
import com.google.common.p4552o.p4563i.C59905bn;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63070h;
import com.google.protobuf.p4750c.C62953e;
import dagger.C68214a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.lens.view.q.bb */
/* compiled from: PG */
public final class C27608bb implements C24451f {

    /* renamed from: a */
    public static final C58974d f75425a = C58974d.m91135i("MddModelDownloadManager");

    /* renamed from: b */
    public final C68214a f75426b;

    /* renamed from: c */
    public final C28746bx f75427c;

    /* renamed from: d */
    public final C28746bx f75428d;

    /* renamed from: e */
    public final C28746bx f75429e;

    /* renamed from: f */
    public final C28746bx f75430f;

    /* renamed from: g */
    public final C28746bx f75431g;

    /* renamed from: h */
    public final C28746bx f75432h;

    /* renamed from: i */
    public final C60888db f75433i;

    /* renamed from: j */
    public final C27652z f75434j;

    /* renamed from: k */
    public final List f75435k = new ArrayList();

    /* renamed from: l */
    public final C42876ab f75436l;

    /* renamed from: m */
    public final C42876ab f75437m;

    /* renamed from: n */
    public final C26034j f75438n;

    /* renamed from: o */
    public final Map f75439o = new ConcurrentHashMap();

    /* renamed from: p */
    private final C42813k f75440p;

    /* renamed from: q */
    private final C21370a f75441q;

    /* renamed from: r */
    private final C38768q f75442r;

    public C27608bb(C27652z zVar, C68214a aVar, C28746bx bxVar, C28746bx bxVar2, C28746bx bxVar3, C28746bx bxVar4, C28746bx bxVar5, C28746bx bxVar6, C42813k kVar, C60888db dbVar, C42876ab abVar, C42876ab abVar2, C21370a aVar2, C38768q qVar, C26034j jVar) {
        this.f75434j = zVar;
        this.f75426b = aVar;
        this.f75428d = bxVar;
        this.f75429e = bxVar2;
        this.f75427c = bxVar3;
        this.f75430f = bxVar4;
        this.f75431g = bxVar5;
        this.f75432h = bxVar6;
        this.f75440p = kVar;
        this.f75433i = dbVar;
        this.f75436l = abVar;
        this.f75437m = abVar2;
        this.f75441q = aVar2;
        this.f75442r = qVar;
        this.f75438n = jVar;
    }

    /* renamed from: c */
    public static C24448c m51389c(C24465t tVar) {
        String str = tVar.f66969d;
        C24438a aVar = new C24438a();
        aVar.mo29892b(0);
        String str2 = tVar.f66967b;
        if (str2 != null) {
            aVar.f66912b = str2;
            aVar.f66911a = str.isEmpty() ? null : Locale.forLanguageTag(str);
            return aVar;
        }
        throw new NullPointerException("Null modelName");
    }

    /* renamed from: d */
    public static C24449d m51390d(C24465t tVar, int i) {
        C24448c c = m51389c(tVar);
        c.mo29893c(4);
        c.mo29892b(i);
        return c.mo29891a();
    }

    /* renamed from: e */
    public static C24449d m51391e(C24465t tVar, int i) {
        C24448c c = m51389c(tVar);
        c.mo29893c(i);
        return c.mo29891a();
    }

    /* renamed from: i */
    public static void m51392i(C24450e eVar, C24449d dVar) {
        if (eVar != null) {
            eVar.mo29904b(dVar);
        }
    }

    /* renamed from: m */
    private final C60870cx m51393m(List list) {
        C27596aq aqVar = new C27596aq(this, list);
        return C60856cj.m92904m(C47810es.m84978r(aqVar), this.f75433i);
    }

    /* renamed from: n */
    private final C60870cx m51394n(String str, C27617bk bkVar) {
        return this.f75437m.mo46039a(new C27595ap(str, bkVar), this.f75433i);
    }

    /* renamed from: o */
    private static void m51395o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C24465t) it.next()).f66967b.isEmpty()) {
                throw new IllegalArgumentException("model name is empty");
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo29905a(List list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C24465t tVar = ((C24463r) it.next()).f66963b;
                if (tVar == null) {
                    tVar = C24465t.f66964f;
                }
                arrayList.add(tVar);
            }
            m51395o(arrayList);
            C60870cx m = m51393m(arrayList);
            C27591al alVar = new C27591al(arrayList);
            C60870cx g = C60922j.m93044g(m, C47810es.m84963c(alVar), C60826bg.f164896a);
            C27593an anVar = new C27593an(this);
            C60870cx h = C60922j.m93045h(g, C47810es.m84966f(anVar), C60826bg.f164896a);
            return C47638k.m84751b(h, m).mo51520a(new C27594ao(m, h), C60826bg.f164896a);
        }
        ((C58970a) ((C58970a) f75425a.mo56226d()).mo56372aa(49328)).mo56386p("getModels called with empty requests");
        return C60856cj.m92900i(C58485gu.m89845m());
    }

    /* renamed from: b */
    public final void mo29906b(List list) {
        mo33131g(list, (C24450e) null);
    }

    /* renamed from: f */
    public final C24440ab mo33130f(C29690f fVar, C24465t tVar) {
        C27555b bVar;
        C24439aa aaVar = (C24439aa) C24440ab.f66917g.createBuilder();
        aaVar.copyOnWrite();
        C24440ab abVar = (C24440ab) aaVar.instance;
        tVar.getClass();
        abVar.f66920b = tVar;
        abVar.f66919a |= 1;
        try {
            C63070h hVar = fVar.f80421l;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            bVar = (C27555b) C62942bv.parseFrom((C62942bv) C27555b.f75341b, hVar.f170218b, C62921ba.m95368a());
        } catch (C62974ct unused) {
            bVar = C27555b.f75341b;
        }
        C62971cq<String> cqVar = bVar.f75343a;
        if (cqVar.isEmpty()) {
            aaVar.copyOnWrite();
            C24440ab abVar2 = (C24440ab) aaVar.instance;
            abVar2.f66924f = 1;
            abVar2.f66919a |= 8;
            if (fVar.f80416g.size() <= 0) {
                C24446ah ahVar = C24446ah.STATUS_MODEL_CONFIG_INCORRECT;
                aaVar.copyOnWrite();
                C24440ab abVar3 = (C24440ab) aaVar.instance;
                abVar3.f66922d = ahVar.f66939g;
                abVar3.f66919a |= 2;
                return (C24440ab) aaVar.build();
            }
            C24446ah ahVar2 = C24446ah.STATUS_DOWNLOADED;
            for (C28595b bVar2 : fVar.f80416g) {
                String str = bVar2.f77799c;
                try {
                    C42813k kVar = this.f75440p;
                    Uri parse = Uri.parse(str);
                    C42788l lVar = new C42788l();
                    lVar.f112052a = true;
                    String absolutePath = ((File) kVar.mo45889c(parse, lVar)).getAbsolutePath();
                    C24441ac acVar = (C24441ac) C24442ad.f66925d.createBuilder();
                    String str2 = bVar2.f77798b;
                    acVar.copyOnWrite();
                    C24442ad adVar = (C24442ad) acVar.instance;
                    str2.getClass();
                    adVar.f66927a |= 1;
                    adVar.f66928b = str2;
                    acVar.copyOnWrite();
                    C24442ad adVar2 = (C24442ad) acVar.instance;
                    absolutePath.getClass();
                    adVar2.f66927a |= 2;
                    adVar2.f66929c = absolutePath;
                    aaVar.mo29894a((C24442ad) acVar.build());
                } catch (IOException unused2) {
                    ahVar2 = C24446ah.STATUS_MODEL_IO_ERROR;
                }
            }
            aaVar.copyOnWrite();
            C24440ab abVar4 = (C24440ab) aaVar.instance;
            abVar4.f66922d = ahVar2.f66939g;
            abVar4.f66919a |= 2;
            return (C24440ab) aaVar.build();
        }
        long j = fVar.f80417h;
        if (j <= 0) {
            ((C58970a) ((C58970a) f75425a.mo56226d()).mo56372aa(49325)).mo56386p("The build id of the GDD downloaded ClientFileGroup is non-positive.");
        }
        aaVar.copyOnWrite();
        C24440ab abVar5 = (C24440ab) aaVar.instance;
        abVar5.f66919a |= 4;
        abVar5.f66923e = j;
        aaVar.copyOnWrite();
        C24440ab abVar6 = (C24440ab) aaVar.instance;
        abVar6.f66924f = 2;
        abVar6.f66919a |= 8;
        if (fVar.f80416g.size() <= 0) {
            C24446ah ahVar3 = C24446ah.STATUS_MODEL_CONFIG_INCORRECT;
            aaVar.copyOnWrite();
            C24440ab abVar7 = (C24440ab) aaVar.instance;
            abVar7.f66922d = ahVar3.f66939g;
            abVar7.f66919a |= 2;
            return (C24440ab) aaVar.build();
        }
        C24446ah ahVar4 = C24446ah.STATUS_DOWNLOADED;
        String str3 = ((C28595b) fVar.f80416g.get(0)).f77799c;
        try {
            C42813k kVar2 = this.f75440p;
            Uri parse2 = Uri.parse(str3);
            C42788l lVar2 = new C42788l();
            lVar2.f112052a = true;
            File parentFile = ((File) kVar2.mo45889c(parse2, lVar2)).getParentFile();
            if (parentFile == null || parentFile.getParentFile() == null) {
                throw new IOException("getGrandparentDirectoryOf no grandparent");
            }
            String absolutePath2 = parentFile.getParentFile().getAbsolutePath();
            for (String str4 : cqVar) {
                C24441ac acVar2 = (C24441ac) C24442ad.f66925d.createBuilder();
                acVar2.copyOnWrite();
                C24442ad adVar3 = (C24442ad) acVar2.instance;
                str4.getClass();
                adVar3.f66927a |= 1;
                adVar3.f66928b = str4;
                String format = String.format("%s/%s", new Object[]{absolutePath2, str4});
                acVar2.copyOnWrite();
                C24442ad adVar4 = (C24442ad) acVar2.instance;
                format.getClass();
                adVar4.f66927a |= 2;
                adVar4.f66929c = format;
                aaVar.mo29894a((C24442ad) acVar2.build());
            }
            aaVar.copyOnWrite();
            C24440ab abVar8 = (C24440ab) aaVar.instance;
            abVar8.f66922d = ahVar4.f66939g;
            abVar8.f66919a |= 2;
            return (C24440ab) aaVar.build();
        } catch (IOException unused3) {
            ahVar4 = C24446ah.STATUS_MODEL_IO_ERROR;
        }
    }

    /* renamed from: g */
    public final C60870cx mo33131g(List list, C24450e eVar) {
        C60870cx cxVar;
        if (list.isEmpty()) {
            ((C58970a) ((C58970a) f75425a.mo56226d()).mo56372aa(49327)).mo56386p("download requests where empty");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        List<C24465t> list2 = (List) Collection.EL.stream(list).map(C27584ae.f75386a).collect(Collectors.toCollection(C27585af.f75387a));
        m51395o(list2);
        C60870cx m = m51393m(list2);
        C60870cx g = C60922j.m93044g(m, C47810es.m84963c(new C27586ag(list)), C60826bg.f164896a);
        C58480gp e = C58485gu.m89837e();
        for (C24465t tVar : list2) {
            if (this.f75438n.mo31240b().values().contains(tVar.f66967b)) {
                e.mo55395g(this.f75436l.mo46039a(new C27589aj((String) this.f75438n.mo31240b().mo55367b().getOrDefault(tVar.f66967b, BuildConfig.FLAVOR)), this.f75433i));
            } else {
                String str = tVar.f66967b;
                String str2 = tVar.f66970e;
                C63042fg i = C62953e.m95484i(this.f75441q.mo26870b());
                if (str2.isEmpty()) {
                    C27616bj bjVar = (C27616bj) C27617bk.f75453e.createBuilder();
                    bjVar.copyOnWrite();
                    C27617bk bkVar = (C27617bk) bjVar.instance;
                    i.getClass();
                    bkVar.f75456b = i;
                    bkVar.f75455a = 1 | bkVar.f75455a;
                    cxVar = m51394n(str, (C27617bk) bjVar.build());
                } else {
                    String a = C27628bv.m51418a(str2, str);
                    C27616bj bjVar2 = (C27616bj) C27617bk.f75453e.createBuilder();
                    bjVar2.copyOnWrite();
                    C27617bk bkVar2 = (C27617bk) bjVar2.instance;
                    i.getClass();
                    bkVar2.f75456b = i;
                    bkVar2.f75455a = 1 | bkVar2.f75455a;
                    bjVar2.copyOnWrite();
                    C27617bk bkVar3 = (C27617bk) bjVar2.instance;
                    str2.getClass();
                    bkVar3.f75455a = 2 | bkVar3.f75455a;
                    bkVar3.f75457c = str2;
                    bjVar2.copyOnWrite();
                    C27617bk bkVar4 = (C27617bk) bjVar2.instance;
                    str.getClass();
                    bkVar4.f75455a |= 4;
                    bkVar4.f75458d = str;
                    cxVar = m51394n(a, (C27617bk) bjVar2.build());
                }
                e.mo55395g(cxVar);
            }
        }
        return C47638k.m84751b(m, g, C60856cj.m92896e(e.mo55394f())).mo51521b(new C27587ah(this, m, g, eVar), this.f75433i);
    }

    /* renamed from: h */
    public final void mo33132h(C24471z zVar, C24450e eVar, boolean z, int i) {
        Map map = this.f75439o;
        C24465t tVar = zVar.f66983b;
        if (tVar == null) {
            tVar = C24465t.f66964f;
        }
        map.remove(tVar.f66967b);
        if (z) {
            C24465t tVar2 = zVar.f66983b;
            if (tVar2 == null) {
                tVar2 = C24465t.f66964f;
            }
            m51392i(eVar, m51390d(tVar2, i));
        }
    }

    /* renamed from: j */
    public final C60870cx mo33133j(C24465t tVar, int i) {
        String str = tVar.f66967b;
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(str);
        f.mo34450d(true);
        C60870cx f2 = ((C29409fd) this.f75426b.mo27525b()).mo34717f(f.mo34447a());
        C27592am amVar = new C27592am(this, i, tVar);
        return C60922j.m93045h(f2, C47810es.m84966f(amVar), this.f75433i);
    }

    /* renamed from: k */
    public final C60870cx mo33134k(C29690f fVar, C24465t tVar, int i) {
        C24440ab f = mo33130f(fVar, tVar);
        C24446ah a = C24446ah.m45519a(f.f66922d);
        if (a == null) {
            a = C24446ah.STATUS_UNKNOWN;
        }
        mo33135l(i, a, tVar.f66967b);
        return C60856cj.m92900i(f);
    }

    /* renamed from: l */
    public final void mo33135l(int i, C24446ah ahVar, String str) {
        aar aar = (aar) aas.f158145p.createBuilder();
        aaz aaz = (aaz) aba.f158175d.createBuilder();
        C59903bl blVar = (C59903bl) C59905bn.f161909e.createBuilder();
        blVar.copyOnWrite();
        C59905bn bnVar = (C59905bn) blVar.instance;
        bnVar.f161912b = i - 1;
        bnVar.f161911a |= 1;
        blVar.copyOnWrite();
        C59905bn bnVar2 = (C59905bn) blVar.instance;
        bnVar2.f161913c = ahVar.f66939g;
        bnVar2.f161911a |= 2;
        blVar.copyOnWrite();
        C59905bn bnVar3 = (C59905bn) blVar.instance;
        str.getClass();
        bnVar3.f161911a |= 4;
        bnVar3.f161914d = str;
        C59905bn bnVar4 = (C59905bn) blVar.build();
        aaz.copyOnWrite();
        aba aba = (aba) aaz.instance;
        bnVar4.getClass();
        aba.f158179c = bnVar4;
        aba.f158177a |= 4;
        aba aba2 = (aba) aaz.build();
        aar.copyOnWrite();
        aas aas = (aas) aar.instance;
        aba2.getClass();
        aas.f158160n = aba2;
        aas.f158147a |= C89885b.NOW_VALUE;
        aas aas2 = (aas) aar.build();
        C59901bj bjVar = (C59901bj) C59902bk.f161903c.createBuilder();
        bjVar.copyOnWrite();
        C59902bk bkVar = (C59902bk) bjVar.instance;
        aas2.getClass();
        bkVar.f161907b = aas2;
        bkVar.f161906a |= 1;
        this.f75442r.mo41590b(C59743a.LENS_MDD_GET, C59902bk.f161904d, (C59902bk) bjVar.build());
    }
}
