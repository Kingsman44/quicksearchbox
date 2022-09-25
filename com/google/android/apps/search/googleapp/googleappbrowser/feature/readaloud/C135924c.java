package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud;

import com.google.android.libraries.p11016ak.C147622ac;
import com.google.android.libraries.p11016ak.C147623ad;
import com.google.android.libraries.p11016ak.C147626ag;
import com.google.android.libraries.p11016ak.C147627ah;
import com.google.android.libraries.p11016ak.C147628ai;
import com.google.android.libraries.p11016ak.C147725g;
import com.google.android.libraries.p11016ak.C147726h;
import com.google.android.libraries.p11016ak.C147727i;
import com.google.android.libraries.p11016ak.C147729k;
import com.google.android.libraries.p11016ak.C147739u;
import com.google.android.libraries.p11016ak.C147741w;
import com.google.android.libraries.p11016ak.p11017a.C147618g;
import com.google.android.libraries.p11016ak.p11017a.C147619h;
import com.google.android.libraries.p11016ak.p11018b.C147634c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.p4750c.C62948a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5285d.p5290b.p5291a.p5292a.C68139ab;
import p5285d.p5290b.p5291a.p5292a.C68154aq;
import p5285d.p5290b.p5291a.p5292a.C68156as;
import p5285d.p5290b.p5291a.p5292a.C68181bq;
import p5285d.p5290b.p5291a.p5292a.C68194g;
import p5285d.p5290b.p5291a.p5292a.C68195h;
import p5285d.p5290b.p5291a.p5292a.C68209v;
import p5285d.p5290b.p5291a.p5292a.C68210w;
import p5285d.p5290b.p5291a.p5292a.C68211x;
import p5285d.p5290b.p5291a.p5292a.C68213z;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5535j.p5536a.p5561h.C71180d;
import p5535j.p5536a.p5561h.C71181e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c */
/* compiled from: PG */
public final class C135924c {

    /* renamed from: a */
    public static final C59071e f370187a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c");

    /* renamed from: b */
    public final Map f370188b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C147741w f370189c;

    /* renamed from: d */
    private final C37215b f370190d;

    /* renamed from: e */
    private long f370191e;

    /* renamed from: f */
    private final boolean f370192f;

    /* renamed from: g */
    private final String f370193g;

    /* renamed from: h */
    private final String f370194h;

    public C135924c(C147741w wVar, boolean z, C37215b bVar, String str, String str2) {
        this.f370189c = wVar;
        this.f370190d = bVar;
        this.f370192f = z;
        this.f370193g = str;
        this.f370194h = str2;
    }

    /* renamed from: a */
    public final C60870cx mo112624a(String str) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C147627ah ahVar;
        C58833ax axVar;
        if (this.f370188b.containsKey(str)) {
            cxVar = (C60870cx) this.f370188b.get(str);
        } else {
            C147741w wVar = this.f370189c;
            C147726h hVar = (C147726h) C147727i.f398636e.createBuilder();
            C147622ac acVar = (C147622ac) C147628ai.f398454d.createBuilder();
            C147626ag agVar = (C147626ag) C147627ah.f398451b.createBuilder();
            agVar.copyOnWrite();
            str.getClass();
            ((C147627ah) agVar.instance).f398453a = str;
            acVar.copyOnWrite();
            C147628ai aiVar = (C147628ai) acVar.instance;
            C147627ah ahVar2 = (C147627ah) agVar.build();
            ahVar2.getClass();
            aiVar.f398457b = ahVar2;
            aiVar.f398456a = 1;
            hVar.copyOnWrite();
            C147628ai aiVar2 = (C147628ai) acVar.build();
            aiVar2.getClass();
            ((C147727i) hVar.instance).f398638a = aiVar2;
            hVar.copyOnWrite();
            ((C147727i) hVar.instance).f398641d = true;
            C147727i iVar = (C147727i) hVar.build();
            C147628ai aiVar3 = iVar.f398638a;
            if (aiVar3 == null) {
                aiVar3 = C147628ai.f398454d;
            }
            int i = aiVar3.f398456a;
            int a = C147623ad.m240695a(i);
            int i2 = a - 1;
            if (a != 0) {
                if (i2 == 0) {
                    if (i == 1) {
                        ahVar = (C147627ah) aiVar3.f398457b;
                    } else {
                        ahVar = C147627ah.f398451b;
                    }
                    String str2 = ahVar.f398453a;
                    C147725g gVar = wVar.f398674e;
                    gVar.mo124426b();
                    if (!((C60870cx) gVar.f398633a.mo56107c()).isDone()) {
                        axVar = C58836b.f156633a;
                    } else {
                        try {
                            C58838bb.m90884s(gVar.f398633a.mo56113h(), "Future uninitialized.");
                            axVar = C58833ax.m90834k(((C68209v) ((C60870cx) gVar.f398633a.mo56107c()).get()).f184564b);
                        } catch (InterruptedException | ExecutionException unused) {
                            axVar = C58836b.f156633a;
                        }
                    }
                    if (!axVar.mo56113h() || !Collection.EL.stream((List) axVar.mo56107c()).anyMatch(new C147619h(str2))) {
                        C147634c cVar = wVar.f398672c;
                        C68210w wVar2 = (C68210w) C68211x.f184566e.createBuilder();
                        wVar2.copyOnWrite();
                        str2.getClass();
                        ((C68211x) wVar2.instance).f184568a = str2;
                        C68194g a2 = C147618g.m240687a(wVar.f398671b);
                        String str3 = iVar.f398640c;
                        a2.copyOnWrite();
                        C68195h hVar2 = C68195h.f184523l;
                        str3.getClass();
                        ((C68195h) a2.instance).f184528d = str3;
                        C68181bq bqVar = iVar.f398639b;
                        if (bqVar == null) {
                            bqVar = C68181bq.f184490b;
                        }
                        a2.copyOnWrite();
                        bqVar.getClass();
                        ((C68195h) a2.instance).f184530f = bqVar;
                        C68195h hVar3 = (C68195h) a2.build();
                        wVar2.copyOnWrite();
                        hVar3.getClass();
                        ((C68211x) wVar2.instance).f184570c = hVar3;
                        C68139ab b = C147618g.m240688b(wVar.f398671b);
                        wVar2.copyOnWrite();
                        b.getClass();
                        ((C68211x) wVar2.instance).f184569b = b;
                        boolean z = iVar.f398641d;
                        wVar2.copyOnWrite();
                        ((C68211x) wVar2.instance).f184571d = z;
                        C68211x xVar = (C68211x) wVar2.build();
                        C68154aq aqVar = cVar.f398472a;
                        C62910ar arVar = cVar.f398473b.f398462b;
                        if (arVar == null) {
                            arVar = C62910ar.f169858c;
                        }
                        C68154aq aqVar2 = (C68154aq) aqVar.mo62575n(C62948a.m95453d(arVar), TimeUnit.MILLISECONDS);
                        C70888j jVar = aqVar2.f189039a;
                        C70338di diVar = C68156as.f184439b;
                        if (diVar == null) {
                            synchronized (C68156as.class) {
                                diVar = C68156as.f184439b;
                                if (diVar == null) {
                                    C70335df d = C70338di.m102603d();
                                    d.f187487c = C70337dh.UNARY;
                                    d.f187488d = C70338di.m102602c("google.search.readaloud.v1.ReadAloudService", "CheckUrl");
                                    d.f187489e = true;
                                    d.f187485a = C70850d.m103697c(C68211x.f184566e);
                                    d.f187486b = C70850d.m103697c(C68213z.f184572c);
                                    C70338di a3 = d.mo62040a();
                                    C68156as.f184439b = a3;
                                    diVar = a3;
                                }
                            }
                        }
                        cxVar2 = C60922j.m93044g(C147634c.m240700a(C70876o.m103760a(jVar.mo39510a(diVar, aqVar2.f189040b), xVar), xVar), C47810es.m84963c(C147739u.f398668a), C60826bg.f164896a);
                    } else {
                        cxVar2 = C60856cj.m92900i(C147729k.f398642c);
                    }
                } else if (i2 == 1) {
                    cxVar2 = C60856cj.m92899h(new RuntimeException("Not yet implemented."));
                } else if (i2 == 2 || i2 == 3) {
                    cxVar2 = C60856cj.m92899h(new IllegalArgumentException("Input not set"));
                } else {
                    cxVar2 = C60856cj.m92899h(new RuntimeException("Unhandled input case."));
                }
                this.f370188b.put(str, cxVar2);
                if (this.f370192f) {
                    this.f370190d.mo19974a(C37182a.f97906cf.mo40816j("readabilityCheckNumber", String.valueOf(this.f370191e)));
                }
                C60856cj.m92911t(cxVar2, C47810es.m84974n(new C135917b(this, this.f370191e, str)), C60826bg.f164896a);
                this.f370191e++;
                cxVar = cxVar2;
            } else {
                throw null;
            }
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(C135907a.f370152a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo112625b(C62722b bVar, boolean z, long j) {
        if (this.f370192f) {
            C37215b bVar2 = this.f370190d;
            C37252a c = C37182a.f97907cg.mo40805c(bVar);
            C37253b bVar3 = (C37253b) c;
            bVar3.mo40795s("readabilityCheckNumber", String.valueOf(j));
            C62940bt btVar = C71181e.f189915g;
            C71180d dVar = (C71180d) C71181e.f189914f.createBuilder();
            dVar.copyOnWrite();
            C71181e eVar = (C71181e) dVar.instance;
            eVar.f189917a |= 1;
            eVar.f189918b = z;
            dVar.copyOnWrite();
            C71181e eVar2 = (C71181e) dVar.instance;
            eVar2.f189917a |= 2;
            eVar2.f189919c = true;
            String str = this.f370193g;
            dVar.copyOnWrite();
            C71181e eVar3 = (C71181e) dVar.instance;
            str.getClass();
            eVar3.f189917a |= 4;
            eVar3.f189920d = str;
            String str2 = this.f370194h;
            dVar.copyOnWrite();
            C71181e eVar4 = (C71181e) dVar.instance;
            str2.getClass();
            eVar4.f189917a |= 8;
            eVar4.f189921e = str2;
            bVar3.mo40792p(btVar, (C71181e) dVar.build());
            bVar2.mo19974a(c);
        }
    }
}
