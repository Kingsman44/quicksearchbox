package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.engine.au.j;
import com.google.android.apps.gsa.nga.engine.au.k;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80049ac;
import com.google.android.apps.gsa.nga.shared.p6274a.C80051ae;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.android.apps.gsa.nga.shared.p6274a.C80056b;
import com.google.android.apps.gsa.nga.shared.p6274a.C80060f;
import com.google.android.apps.gsa.nga.shared.p6274a.C80062h;
import com.google.android.apps.gsa.nga.shared.p6274a.C80068n;
import com.google.android.apps.gsa.nga.shared.p6274a.C80072r;
import com.google.android.apps.gsa.nga.shared.p6274a.C80073s;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4535g.C59203do;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.knowledge.p4661a.p4662a.C61761w;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.p381aj.p382a.p383a.p384a.C8212aa;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4853b.C63359c;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4853b.C63366j;
import com.google.protos.p4850an.p4853b.C63367k;
import com.google.protos.p4850an.p4853b.C63379w;
import com.google.protos.p4850an.p4853b.C63380x;
import com.google.protos.p4850an.p4854c.C63407ah;
import com.google.protos.p4850an.p4854c.C63408ai;
import com.google.protos.p4850an.p4855d.p4862g.C63564a;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import com.google.protos.p4850an.p4865e.C63589c;
import com.google.protos.p4850an.p4865e.C63590d;
import com.google.protos.p4850an.p4865e.C63591e;
import com.google.protos.p4850an.p4865e.C63594h;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.a */
/* compiled from: PG */
public final /* synthetic */ class C122580a implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f339747a;

    /* renamed from: b */
    public final /* synthetic */ List f339748b;

    /* renamed from: c */
    public final /* synthetic */ Instant f339749c;

    /* renamed from: d */
    public final /* synthetic */ ZoneId f339750d;

    public /* synthetic */ C122580a(String str, List list, Instant instant, ZoneId zoneId) {
        this.f339747a = str;
        this.f339748b = list;
        this.f339749c = instant;
        this.f339750d = zoneId;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C80060f fVar;
        C80051ae aeVar;
        C58528ij ijVar;
        C58528ij ijVar2;
        C80053ag agVar;
        C80053ag agVar2;
        C80053ag agVar3;
        C80053ag agVar4;
        C80053ag agVar5;
        C80053ag agVar6;
        C80053ag agVar7;
        C80053ag agVar8;
        C80049ac acVar;
        C80056b bVar;
        C80073s sVar;
        C80062h hVar;
        String str = this.f339747a;
        List list = this.f339748b;
        Instant instant = this.f339749c;
        ZoneId zoneId = this.f339750d;
        C80047aa aaVar = (C80047aa) obj;
        C80080z zVar = C80080z.UNKNOWN;
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C63359c cVar = (C63359c) C63360d.f171230f.createBuilder();
            if (aaVar.f219657a == 9) {
                fVar = (C80060f) aaVar.f219658b;
            } else {
                fVar = C80060f.f219696h;
            }
            cVar.mo59207b(C122605p.m202014a(fVar, instant, zoneId));
            iVar.copyOnWrite();
            C61748j jVar = (C61748j) iVar.instance;
            C63360d dVar = (C63360d) cVar.build();
            dVar.getClass();
            jVar.f166803b = dVar;
            jVar.f166802a = 4;
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            C61748j jVar2 = (C61748j) iVar.build();
            jVar2.getClass();
            hVar2.f166797e = jVar2;
            hVar2.f166793a |= 4;
            optional = Optional.m71637of((C61746h) gVar.build());
        } else if (ordinal != 2) {
            int i = 3;
            if (ordinal == 3) {
                C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
                C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
                C61757s sVar2 = (C61757s) C61758t.f166824c.createBuilder();
                String str2 = aaVar.f219662f;
                sVar2.copyOnWrite();
                C61758t tVar = (C61758t) sVar2.instance;
                str2.getClass();
                tVar.f166826a = 1;
                tVar.f166827b = str2;
                iVar2.copyOnWrite();
                C61748j jVar3 = (C61748j) iVar2.instance;
                C61758t tVar2 = (C61758t) sVar2.build();
                tVar2.getClass();
                jVar3.f166803b = tVar2;
                jVar3.f166802a = 3;
                gVar2.copyOnWrite();
                C61746h hVar3 = (C61746h) gVar2.instance;
                C61748j jVar4 = (C61748j) iVar2.build();
                jVar4.getClass();
                hVar3.f166797e = jVar4;
                hVar3.f166793a |= 4;
                optional = Optional.m71637of((C61746h) gVar2.build());
            } else if (ordinal == 5) {
                C61745g gVar3 = (C61745g) C61746h.f166791g.createBuilder();
                C61747i iVar3 = (C61747i) C61748j.f166800d.createBuilder();
                C61757s sVar3 = (C61757s) C61758t.f166824c.createBuilder();
                String str3 = aaVar.f219662f;
                sVar3.copyOnWrite();
                C61758t tVar3 = (C61758t) sVar3.instance;
                str3.getClass();
                tVar3.f166826a = 1;
                tVar3.f166827b = str3;
                iVar3.copyOnWrite();
                C61748j jVar5 = (C61748j) iVar3.instance;
                C61758t tVar4 = (C61758t) sVar3.build();
                tVar4.getClass();
                jVar5.f166803b = tVar4;
                jVar5.f166802a = 3;
                gVar3.copyOnWrite();
                C61746h hVar4 = (C61746h) gVar3.instance;
                C61748j jVar6 = (C61748j) iVar3.build();
                jVar6.getClass();
                hVar4.f166797e = jVar6;
                hVar4.f166793a |= 4;
                optional = Optional.m71637of((C61746h) gVar3.build());
            } else if (ordinal == 6) {
                C61745g gVar4 = (C61745g) C61746h.f166791g.createBuilder();
                C61747i iVar4 = (C61747i) C61748j.f166800d.createBuilder();
                C61757s sVar4 = (C61757s) C61758t.f166824c.createBuilder();
                if (aaVar.f219657a == 13) {
                    aeVar = (C80051ae) aaVar.f219658b;
                } else {
                    aeVar = C80051ae.f219672b;
                }
                String str4 = aeVar.f219674a;
                sVar4.copyOnWrite();
                C61758t tVar5 = (C61758t) sVar4.instance;
                str4.getClass();
                tVar5.f166826a = 1;
                tVar5.f166827b = str4;
                iVar4.copyOnWrite();
                C61748j jVar7 = (C61748j) iVar4.instance;
                C61758t tVar6 = (C61758t) sVar4.build();
                tVar6.getClass();
                jVar7.f166803b = tVar6;
                jVar7.f166802a = 3;
                gVar4.copyOnWrite();
                C61746h hVar5 = (C61746h) gVar4.instance;
                C61748j jVar8 = (C61748j) iVar4.build();
                jVar8.getClass();
                hVar5.f166797e = jVar8;
                hVar5.f166793a |= 4;
                optional = Optional.m71637of((C61746h) gVar4.build());
            } else if (ordinal == 8) {
                if (aaVar.f219657a == 7) {
                    ijVar = (C58528ij) C122604o.m202013a(aaVar, list).filter(C122597h.f339768a).map(C122600k.f339771a).collect(C58370cn.f155947b);
                    ijVar2 = (C58528ij) C122604o.m202013a(aaVar, list).filter(C122597h.f339768a).map(C122600k.f339771a).filter(C122601l.f339772a).map(C122602m.f339773a).collect(C58370cn.f155947b);
                } else {
                    ijVar = C58733pz.f156496a;
                    ijVar2 = ijVar;
                }
                C63564a aVar = (C63564a) C63565b.f171933j.createBuilder();
                String str5 = aaVar.f219662f;
                aVar.copyOnWrite();
                C63565b bVar2 = (C63565b) aVar.instance;
                str5.getClass();
                bVar2.f171935a = 1 | bVar2.f171935a;
                bVar2.f171936b = str5;
                aVar.copyOnWrite();
                C63565b bVar3 = (C63565b) aVar.instance;
                C62971cq cqVar = bVar3.f171943i;
                if (!cqVar.mo58948c()) {
                    bVar3.f171943i = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) ijVar2, (List) bVar3.f171943i);
                aVar.mo59217b((Iterable) Collection.EL.stream(ijVar).map(C122603n.f339774a).collect(C58370cn.f155946a));
                C63565b bVar4 = (C63565b) aVar.build();
                C61745g gVar5 = (C61745g) C61746h.f166791g.createBuilder();
                C61747i iVar5 = (C61747i) C61748j.f166800d.createBuilder();
                iVar5.copyOnWrite();
                C61748j jVar9 = (C61748j) iVar5.instance;
                bVar4.getClass();
                jVar9.f166803b = bVar4;
                jVar9.f166802a = 9;
                gVar5.copyOnWrite();
                C61746h hVar6 = (C61746h) gVar5.instance;
                C61748j jVar10 = (C61748j) iVar5.build();
                jVar10.getClass();
                hVar6.f166797e = jVar10;
                hVar6.f166793a |= 4;
                optional = Optional.m71637of((C61746h) gVar5.build());
            } else if (ordinal == 9) {
                C61761w wVar = (C61761w) C61762x.f166835e.createBuilder();
                if (aaVar.f219657a == 10) {
                    agVar = (C80053ag) aaVar.f219658b;
                } else {
                    agVar = C80053ag.f219675f;
                }
                if (agVar.f219681e != null) {
                    C8212aa aaVar2 = (C8212aa) C8213ab.f28837d.createBuilder();
                    if (aaVar.f219657a == 10) {
                        agVar7 = (C80053ag) aaVar.f219658b;
                    } else {
                        agVar7 = C80053ag.f219675f;
                    }
                    C80068n nVar = agVar7.f219681e;
                    if (nVar == null) {
                        nVar = C80068n.f219712c;
                    }
                    int i2 = nVar.f219714a;
                    aaVar2.copyOnWrite();
                    C8213ab abVar = (C8213ab) aaVar2.instance;
                    abVar.f28839a |= 1;
                    abVar.f28840b = i2;
                    if (aaVar.f219657a == 10) {
                        agVar8 = (C80053ag) aaVar.f219658b;
                    } else {
                        agVar8 = C80053ag.f219675f;
                    }
                    C80068n nVar2 = agVar8.f219681e;
                    if (nVar2 == null) {
                        nVar2 = C80068n.f219712c;
                    }
                    int i3 = nVar2.f219715b;
                    aaVar2.copyOnWrite();
                    C8213ab abVar2 = (C8213ab) aaVar2.instance;
                    abVar2.f28839a = 2 | abVar2.f28839a;
                    abVar2.f28841c = i3;
                    wVar.copyOnWrite();
                    C61762x xVar = (C61762x) wVar.instance;
                    C8213ab abVar3 = (C8213ab) aaVar2.build();
                    abVar3.getClass();
                    xVar.f166839c = abVar3;
                    xVar.f166837a |= 16;
                }
                if (aaVar.f219657a == 10) {
                    agVar2 = (C80053ag) aaVar.f219658b;
                } else {
                    agVar2 = C80053ag.f219675f;
                }
                if (agVar2.f219679c.size() > 0) {
                    if (aaVar.f219657a == 10) {
                        agVar6 = (C80053ag) aaVar.f219658b;
                    } else {
                        agVar6 = C80053ag.f219675f;
                    }
                    Iterable iterable = (Iterable) Collection.EL.stream(agVar6.f219679c).map(C122598i.f339769a).collect(C58370cn.f155946a);
                    wVar.copyOnWrite();
                    C61762x xVar2 = (C61762x) wVar.instance;
                    C62971cq cqVar2 = xVar2.f166838b;
                    if (!cqVar2.mo58948c()) {
                        xVar2.f166838b = C62942bv.mutableCopy(cqVar2);
                    }
                    C62947c.addAll(iterable, (List) xVar2.f166838b);
                }
                if (aaVar.f219657a == 10) {
                    agVar3 = (C80053ag) aaVar.f219658b;
                } else {
                    agVar3 = C80053ag.f219675f;
                }
                if (agVar3.f219680d.size() > 0) {
                    j createBuilder = k.b.createBuilder();
                    if (aaVar.f219657a == 10) {
                        agVar5 = (C80053ag) aaVar.f219658b;
                    } else {
                        agVar5 = C80053ag.f219675f;
                    }
                    createBuilder.copyOnWrite();
                    k kVar = createBuilder.instance;
                    kVar.a();
                    C62947c.addAll((Iterable) Collection.EL.stream(agVar5.f219680d).map(C122599j.f339770a).collect(C58370cn.f155946a), (List) kVar.a);
                    wVar.mo58885m(k.c, createBuilder.build());
                }
                C61745g gVar6 = (C61745g) C61746h.f166791g.createBuilder();
                C61747i iVar6 = (C61747i) C61748j.f166800d.createBuilder();
                C61757s sVar5 = (C61757s) C61758t.f166824c.createBuilder();
                if (aaVar.f219657a == 10) {
                    agVar4 = (C80053ag) aaVar.f219658b;
                } else {
                    agVar4 = C80053ag.f219675f;
                }
                String str6 = agVar4.f219677a;
                sVar5.copyOnWrite();
                C61758t tVar7 = (C61758t) sVar5.instance;
                str6.getClass();
                tVar7.f166826a = 1;
                tVar7.f166827b = str6;
                iVar6.copyOnWrite();
                C61748j jVar11 = (C61748j) iVar6.instance;
                C61758t tVar8 = (C61758t) sVar5.build();
                tVar8.getClass();
                jVar11.f166803b = tVar8;
                jVar11.f166802a = 3;
                gVar6.copyOnWrite();
                C61746h hVar7 = (C61746h) gVar6.instance;
                C61748j jVar12 = (C61748j) iVar6.build();
                jVar12.getClass();
                hVar7.f166797e = jVar12;
                hVar7.f166793a |= 4;
                gVar6.copyOnWrite();
                C61746h hVar8 = (C61746h) gVar6.instance;
                C61762x xVar3 = (C61762x) wVar.build();
                xVar3.getClass();
                hVar8.f166798f = xVar3;
                hVar8.f166793a |= 8;
                optional = Optional.m71637of((C61746h) gVar6.build());
            } else if (ordinal == 19) {
                C122587ag agVar9 = new C122587ag(aaVar.f219662f, C58485gu.m89841i(C58733pz.f156496a));
                C61745g gVar7 = (C61745g) C61746h.f166791g.createBuilder();
                C61747i iVar7 = (C61747i) C61748j.f166800d.createBuilder();
                C63564a aVar2 = (C63564a) C63565b.f171933j.createBuilder();
                String str7 = agVar9.f339757a;
                aVar2.copyOnWrite();
                C63565b bVar5 = (C63565b) aVar2.instance;
                bVar5.f171935a = 1 | bVar5.f171935a;
                bVar5.f171936b = str7;
                aVar2.mo59217b((Iterable) Collection.EL.stream(agVar9.f339758b).map(C122588ah.f339759a).collect(C58370cn.f155946a));
                C63565b bVar6 = (C63565b) aVar2.build();
                iVar7.copyOnWrite();
                C61748j jVar13 = (C61748j) iVar7.instance;
                bVar6.getClass();
                jVar13.f166803b = bVar6;
                jVar13.f166802a = 9;
                gVar7.copyOnWrite();
                C61746h hVar9 = (C61746h) gVar7.instance;
                C61748j jVar14 = (C61748j) iVar7.build();
                jVar14.getClass();
                hVar9.f166797e = jVar14;
                hVar9.f166793a |= 4;
                optional = Optional.m71637of((C61746h) gVar7.build());
            } else if (ordinal != 20) {
                switch (ordinal) {
                    case 11:
                        if (aaVar.f219663g >= 1.0d) {
                            C61745g gVar8 = (C61745g) C61746h.f166791g.createBuilder();
                            C61747i iVar8 = (C61747i) C61748j.f166800d.createBuilder();
                            C63618g gVar9 = (C63618g) C63624h.f172070b.createBuilder();
                            C63772a aVar3 = (C63772a) C63775d.f172518h.createBuilder();
                            String str8 = aaVar.f219662f;
                            aVar3.copyOnWrite();
                            C63775d dVar2 = (C63775d) aVar3.instance;
                            str8.getClass();
                            dVar2.f172520a = 2 | dVar2.f172520a;
                            dVar2.f172522c = str8;
                            if (aaVar.f219657a == 12) {
                                bVar = (C80056b) aaVar.f219658b;
                            } else {
                                bVar = C80056b.f219686c;
                            }
                            String str9 = bVar.f219688a;
                            aVar3.copyOnWrite();
                            C63775d dVar3 = (C63775d) aVar3.instance;
                            str9.getClass();
                            dVar3.f172520a |= 4;
                            dVar3.f172523d = str9;
                            gVar9.mo59221b(aVar3);
                            iVar8.copyOnWrite();
                            C61748j jVar15 = (C61748j) iVar8.instance;
                            C63624h hVar10 = (C63624h) gVar9.build();
                            hVar10.getClass();
                            jVar15.f166803b = hVar10;
                            jVar15.f166802a = 15;
                            gVar8.copyOnWrite();
                            C61746h hVar11 = (C61746h) gVar8.instance;
                            C61748j jVar16 = (C61748j) iVar8.build();
                            jVar16.getClass();
                            hVar11.f166797e = jVar16;
                            hVar11.f166793a |= 4;
                            optional = Optional.m71637of((C61746h) gVar8.build());
                            break;
                        } else {
                            optional = Optional.empty();
                            break;
                        }
                    case 12:
                        if (aaVar.f219657a == 14) {
                            sVar = (C80073s) aaVar.f219658b;
                        } else {
                            sVar = C80073s.f219718c;
                        }
                        StringBuilder sb = new StringBuilder();
                        int i4 = sVar.f219720a;
                        int a2 = C80072r.m128076a(i4);
                        double d = C59203do.f157270a;
                        if (a2 != 3) {
                            if (C80072r.m128076a(i4) != 4) {
                                optional = Optional.empty();
                                break;
                            } else {
                                if (i4 == 3) {
                                    d = ((Double) sVar.f219721b).doubleValue();
                                }
                                sb.append(d / 100.0d);
                            }
                        } else {
                            if (i4 == 2) {
                                d = ((Double) sVar.f219721b).doubleValue();
                            }
                            sb.append((int) d);
                            i = 2;
                        }
                        C61745g gVar10 = (C61745g) C61746h.f166791g.createBuilder();
                        C61747i iVar9 = (C61747i) C61748j.f166800d.createBuilder();
                        C63589c cVar2 = (C63589c) C63590d.f172003c.createBuilder();
                        C63591e eVar = (C63591e) C63594h.f172008d.createBuilder();
                        eVar.copyOnWrite();
                        C63594h hVar12 = (C63594h) eVar.instance;
                        hVar12.f172011b = i - 1;
                        hVar12.f172010a |= 1;
                        String sb2 = sb.toString();
                        eVar.copyOnWrite();
                        C63594h hVar13 = (C63594h) eVar.instance;
                        hVar13.f172010a = 2 | hVar13.f172010a;
                        hVar13.f172012c = sb2;
                        cVar2.copyOnWrite();
                        C63590d dVar4 = (C63590d) cVar2.instance;
                        C63594h hVar14 = (C63594h) eVar.build();
                        hVar14.getClass();
                        dVar4.f172006b = hVar14;
                        dVar4.f172005a = 1;
                        iVar9.copyOnWrite();
                        C61748j jVar17 = (C61748j) iVar9.instance;
                        C63590d dVar5 = (C63590d) cVar2.build();
                        dVar5.getClass();
                        jVar17.f166803b = dVar5;
                        jVar17.f166802a = 6;
                        gVar10.copyOnWrite();
                        C61746h hVar15 = (C61746h) gVar10.instance;
                        C61748j jVar18 = (C61748j) iVar9.build();
                        jVar18.getClass();
                        hVar15.f166797e = jVar18;
                        hVar15.f166793a |= 4;
                        optional = Optional.m71637of((C61746h) gVar10.build());
                        break;
                    case 13:
                        C61745g gVar11 = (C61745g) C61746h.f166791g.createBuilder();
                        C61747i iVar10 = (C61747i) C61748j.f166800d.createBuilder();
                        C63366j jVar19 = (C63366j) C63367k.f171252c.createBuilder();
                        C63379w wVar2 = (C63379w) C63380x.f171276d.createBuilder();
                        wVar2.copyOnWrite();
                        C63380x xVar4 = (C63380x) wVar2.instance;
                        xVar4.f171280c = 3;
                        xVar4.f171278a = 2 | xVar4.f171278a;
                        if (aaVar.f219657a == 15) {
                            hVar = (C80062h) aaVar.f219658b;
                        } else {
                            hVar = C80062h.f219705b;
                        }
                        long j = hVar.f219707a;
                        wVar2.copyOnWrite();
                        C63380x xVar5 = (C63380x) wVar2.instance;
                        xVar5.f171278a |= 1;
                        xVar5.f171279b = (double) j;
                        jVar19.copyOnWrite();
                        C63367k kVar2 = (C63367k) jVar19.instance;
                        C63380x xVar6 = (C63380x) wVar2.build();
                        xVar6.getClass();
                        kVar2.f171255b = xVar6;
                        kVar2.f171254a |= 1;
                        iVar10.copyOnWrite();
                        C61748j jVar20 = (C61748j) iVar10.instance;
                        C63367k kVar3 = (C63367k) jVar19.build();
                        kVar3.getClass();
                        jVar20.f166803b = kVar3;
                        jVar20.f166802a = 8;
                        gVar11.copyOnWrite();
                        C61746h hVar16 = (C61746h) gVar11.instance;
                        C61748j jVar21 = (C61748j) iVar10.build();
                        jVar21.getClass();
                        hVar16.f166797e = jVar21;
                        hVar16.f166793a |= 4;
                        optional = Optional.m71637of((C61746h) gVar11.build());
                        break;
                    default:
                        optional = Optional.empty();
                        break;
                }
            } else {
                if (aaVar.f219657a == 21) {
                    acVar = (C80049ac) aaVar.f219658b;
                } else {
                    acVar = C80049ac.f219666e;
                }
                boolean z = acVar.f219671d;
                C61745g gVar12 = (C61745g) C61746h.f166791g.createBuilder();
                C61747i iVar11 = (C61747i) C61748j.f166800d.createBuilder();
                C61757s sVar6 = (C61757s) C61758t.f166824c.createBuilder();
                sVar6.copyOnWrite();
                C61758t tVar9 = (C61758t) sVar6.instance;
                tVar9.f166826a = 4;
                tVar9.f166827b = Boolean.valueOf(z);
                iVar11.copyOnWrite();
                C61748j jVar22 = (C61748j) iVar11.instance;
                C61758t tVar10 = (C61758t) sVar6.build();
                tVar10.getClass();
                jVar22.f166803b = tVar10;
                jVar22.f166802a = 3;
                gVar12.copyOnWrite();
                C61746h hVar17 = (C61746h) gVar12.instance;
                C61748j jVar23 = (C61748j) iVar11.build();
                jVar23.getClass();
                hVar17.f166797e = jVar23;
                hVar17.f166793a |= 4;
                optional = Optional.m71637of((C61746h) gVar12.build());
            }
        } else {
            C61745g gVar13 = (C61745g) C61746h.f166791g.createBuilder();
            C61747i iVar12 = (C61747i) C61748j.f166800d.createBuilder();
            C63407ah ahVar = (C63407ah) C63408ai.f171351e.createBuilder();
            String str10 = aaVar.f219662f;
            ahVar.copyOnWrite();
            C63408ai aiVar = (C63408ai) ahVar.instance;
            str10.getClass();
            aiVar.f171353a |= 16;
            aiVar.f171356d = str10;
            iVar12.copyOnWrite();
            C61748j jVar24 = (C61748j) iVar12.instance;
            C63408ai aiVar2 = (C63408ai) ahVar.build();
            aiVar2.getClass();
            jVar24.f166803b = aiVar2;
            jVar24.f166802a = 5;
            gVar13.copyOnWrite();
            C61746h hVar18 = (C61746h) gVar13.instance;
            C61748j jVar25 = (C61748j) iVar12.build();
            jVar25.getClass();
            hVar18.f166797e = jVar25;
            hVar18.f166793a |= 4;
            optional = Optional.m71637of((C61746h) gVar13.build());
        }
        return optional.map(new C122593d(aaVar, str));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
