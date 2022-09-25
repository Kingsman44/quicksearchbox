package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.ab.c;
import com.google.android.apps.gsa.nga.engine.ab.l;
import com.google.android.apps.gsa.nga.engine.grammar.C76123a;
import com.google.android.apps.gsa.nga.engine.grammar.C76132j;
import com.google.android.apps.gsa.nga.engine.grammar.C76134l;
import com.google.android.apps.gsa.nga.engine.grammar.C76141s;
import com.google.android.apps.gsa.nga.engine.grammar.C76142t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74945h;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.understanding.C79162t;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80075u;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6286h.C80448a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6286h.C80449b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6286h.C80451d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6311ah.C80631b;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.nlp.p4735b.p4736a.C62807a;
import com.google.nlp.p4735b.p4736a.C62818b;
import com.google.nlp.p4735b.p4736a.C62836c;
import com.google.nlp.p4735b.p4736a.C62837d;
import com.google.nlp.p4735b.p4736a.p4737a.C62813f;
import com.google.nlp.p4735b.p4736a.p4737a.C62815h;
import com.google.nlp.p4735b.p4736a.p4737a.C62817j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3186j$.time.ZoneId;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.j */
/* compiled from: PG */
public final class C79057j implements C79162t {

    /* renamed from: a */
    private final C58974d f217395a = C58974d.m91134h("GinaIntentGenerator");

    /* renamed from: b */
    private final c f217396b;

    /* renamed from: c */
    private final C79052e f217397c;

    /* renamed from: d */
    private final C79851ai f217398d;

    /* renamed from: e */
    private final C22871g f217399e;

    /* renamed from: f */
    private final C76092h f217400f;

    /* renamed from: g */
    private final C91142g f217401g;

    /* renamed from: h */
    private final C76142t f217402h;

    public C79057j(c cVar, C76142t tVar, C79052e eVar, C79851ai aiVar, C22871g gVar, C76092h hVar, C91142g gVar2) {
        this.f217396b = cVar;
        this.f217402h = tVar;
        this.f217397c = eVar;
        this.f217398d = aiVar;
        this.f217399e = gVar;
        this.f217400f = hVar;
        this.f217401g = gVar2;
    }

    /* renamed from: a */
    public final C80515d mo73713a() {
        return C80515d.GINA;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo73714b(String str, List list, C74965n nVar, C74945h hVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        String str2;
        C80075u uVar;
        Locale q = nVar.mo71342q();
        C62807a aVar = (C62807a) C62818b.f169638e.createBuilder();
        aVar.copyOnWrite();
        C62818b bVar = (C62818b) aVar.instance;
        str.getClass();
        bVar.f169640a |= 1;
        bVar.f169641b = str;
        String language = q.getLanguage();
        aVar.copyOnWrite();
        C62818b bVar2 = (C62818b) aVar.instance;
        language.getClass();
        bVar2.f169640a |= 2;
        bVar2.f169643d = language;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C80047aa aaVar = (C80047aa) it.next();
                C62836c cVar = (C62836c) C62837d.f169685e.createBuilder();
                C80080z zVar = C80080z.UNKNOWN;
                C80080z a = C80080z.m128077a(aaVar.f219659c);
                if (a == null) {
                    a = C80080z.UNRECOGNIZED;
                }
                if (a.ordinal() != 10) {
                    C80080z a2 = C80080z.m128077a(aaVar.f219659c);
                    if (a2 == null) {
                        a2 = C80080z.UNRECOGNIZED;
                    }
                    str2 = a2.name();
                } else {
                    if (aaVar.f219657a == 11) {
                        uVar = (C80075u) aaVar.f219658b;
                    } else {
                        uVar = C80075u.f219722b;
                    }
                    str2 = uVar.f219724a;
                }
                cVar.copyOnWrite();
                C62837d dVar = (C62837d) cVar.instance;
                str2.getClass();
                dVar.f169687a |= 1;
                dVar.f169688b = str2;
                int i = aaVar.f219660d;
                cVar.copyOnWrite();
                C62837d dVar2 = (C62837d) cVar.instance;
                dVar2.f169687a |= 2;
                dVar2.f169689c = i;
                int i2 = aaVar.f219661e;
                cVar.copyOnWrite();
                C62837d dVar3 = (C62837d) cVar.instance;
                dVar3.f169687a |= 4;
                dVar3.f169690d = i2;
                C62940bt btVar = C80451d.f220814b;
                C80448a aVar2 = (C80448a) C80449b.f220808c.createBuilder();
                aVar2.copyOnWrite();
                C80449b bVar3 = (C80449b) aVar2.instance;
                aaVar.getClass();
                bVar3.f220811b = aaVar;
                bVar3.f220810a = 2;
                cVar.mo58885m(btVar, (C80449b) aVar2.build());
                C62837d dVar4 = (C62837d) cVar.build();
                aVar.copyOnWrite();
                C62818b bVar4 = (C62818b) aVar.instance;
                dVar4.getClass();
                C62971cq cqVar = bVar4.f169642c;
                if (!cqVar.mo58948c()) {
                    bVar4.f169642c = C62942bv.mutableCopy(cqVar);
                }
                bVar4.f169642c.add(dVar4);
            }
        }
        C62818b bVar5 = (C62818b) aVar.build();
        try {
            C76123a a3 = this.f217396b.a();
            C76141s a4 = this.f217402h.mo72084a(nVar);
            C83320io k = nVar.mo71336k();
            C79850ah c = this.f217398d.mo74252c(27001, k);
            try {
                C62813f fVar = (C62813f) C62815h.f169624f.createBuilder();
                fVar.copyOnWrite();
                C62815h hVar2 = (C62815h) fVar.instance;
                hVar2.f169630e = 1;
                hVar2.f169626a |= 16;
                fVar.copyOnWrite();
                C62815h hVar3 = (C62815h) fVar.instance;
                bVar5.getClass();
                hVar3.f169627b = bVar5;
                hVar3.f169626a |= 2;
                C58495hd a5 = a4.mo72083a();
                fVar.copyOnWrite();
                C62815h hVar4 = (C62815h) fVar.instance;
                C62995dn dnVar = hVar4.f169628c;
                if (!dnVar.f170058b) {
                    hVar4.f169628c = dnVar.mo58980a();
                }
                hVar4.f169628c.putAll(a5);
                fVar.copyOnWrite();
                C62815h hVar5 = (C62815h) fVar.instance;
                hVar5.f169626a |= 8;
                hVar5.f169629d = false;
                C62817j b = a3.mo72069b((C62815h) fVar.build(), k);
                if (c != null) {
                    c.mo74255b();
                }
                if (!b.f169635b.isEmpty()) {
                    ((C58970a) ((C58970a) this.f217395a.mo56225c()).mo56372aa(5491)).mo56389s("Failed to gina grammar Matches: %s", b.f169635b);
                    cxVar = C60856cj.m92900i(C58485gu.m89845m());
                } else if (b.f169636c.isEmpty()) {
                    cxVar = C60856cj.m92900i(C58485gu.m89845m());
                } else {
                    C80512a aVar3 = (C80512a) C80513b.f221014e.createBuilder();
                    C80515d dVar5 = C80515d.GINA;
                    aVar3.copyOnWrite();
                    ((C80513b) aVar3.instance).f221019d = dVar5.getNumber();
                    C80513b bVar6 = (C80513b) aVar3.build();
                    C22871g gVar = this.f217399e;
                    C79052e eVar = this.f217397c;
                    C62971cq cqVar2 = b.f169636c;
                    boolean anyMatch = Collection.EL.stream(cqVar2).anyMatch(C79053f.f217391a);
                    try {
                        C76123a a6 = eVar.f217385b.a();
                        C76141s a7 = eVar.f217390g.mo72084a(nVar);
                        C76132j jVar = (C76132j) C76134l.f211079j.createBuilder();
                        jVar.copyOnWrite();
                        C76134l lVar = (C76134l) jVar.instance;
                        C62971cq cqVar3 = lVar.f211082b;
                        if (!cqVar3.mo58948c()) {
                            lVar.f211082b = C62942bv.mutableCopy(cqVar3);
                        }
                        C62947c.addAll((Iterable) cqVar2, (List) lVar.f211082b);
                        jVar.copyOnWrite();
                        bVar6.getClass();
                        ((C76134l) jVar.instance).f211081a = bVar6;
                        C58495hd a8 = a7.mo72083a();
                        jVar.copyOnWrite();
                        C76134l lVar2 = (C76134l) jVar.instance;
                        C62995dn dnVar2 = lVar2.f211084d;
                        if (!dnVar2.f170058b) {
                            lVar2.f211084d = dnVar2.mo58980a();
                        }
                        lVar2.f211084d.putAll(a8);
                        jVar.copyOnWrite();
                        ((C76134l) jVar.instance).f211085e = false;
                        C80631b bVar7 = eVar.f217388e;
                        String zoneId = ZoneId.systemDefault().toString();
                        jVar.copyOnWrite();
                        zoneId.getClass();
                        ((C76134l) jVar.instance).f211086f = zoneId;
                        long epochMilli = eVar.f217389f.mo57444a().toEpochMilli();
                        jVar.copyOnWrite();
                        ((C76134l) jVar.instance).f211087g = epochMilli;
                        jVar.copyOnWrite();
                        ((C76134l) jVar.instance).f211089i = false;
                        jVar.copyOnWrite();
                        ((C76134l) jVar.instance).f211088h = false;
                        if (!anyMatch || !eVar.f217387d.mo85405j(C90126fx.f251496js)) {
                            cxVar2 = C60856cj.m92900i(eVar.mo73796a(a6, (C76134l) jVar.build(), nVar.mo71336k()));
                        } else {
                            cxVar2 = eVar.f217386c.mo28209i(eVar.f217386c.mo28205e(nVar.mo71332g().mo71352c(), "[NGA] GinaGrammarIntentToInterpretationConverter.handle screen annotation failure", Exception.class, new C79050c(eVar)), "[NGA] GinaGrammarIntentToInterpretationConverter.GenerateInterpretations", new C79051d(eVar, jVar, a6, nVar));
                        }
                    } catch (l e) {
                        ((C58970a) ((C58970a) ((C58970a) eVar.f217384a.mo56225c()).mo56382g(e)).mo56372aa(5488)).mo56386p("Intent Generator grammar is uninitialized yet.");
                        cxVar2 = C60856cj.m92899h(e);
                    }
                    cxVar = gVar.mo28209i(cxVar2, "[NGA] GinaIntentGenerator GenerateInterpretations", C79054g.f217392a);
                }
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } catch (l e2) {
            ((C58970a) ((C58970a) ((C58970a) this.f217395a.mo56225c()).mo56382g(e2)).mo56372aa(5492)).mo56386p("Intent Generator grammar is uninitialized yet.");
            cxVar = C60856cj.m92899h(e2);
        }
        this.f217398d.mo74253d(17, nVar.mo71336k(), cxVar);
        return cxVar;
        throw th;
    }

    /* renamed from: c */
    public final boolean mo73715c() {
        C76090f b = this.f217400f.mo72021b();
        return b.mo72041f() && C81451b.m129570a(b.mo72039e(), this.f217401g.mo85403h(C90126fx.f251555ky));
    }
}
