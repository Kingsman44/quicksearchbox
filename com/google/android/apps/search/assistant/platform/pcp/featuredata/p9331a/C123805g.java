package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124114cm;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3804a.p3806b.C48822c;
import com.google.assistant.p3803ag.p3804a.p3806b.C48824e;
import com.google.assistant.p3803ag.p3804a.p3806b.C48827h;
import com.google.assistant.p3803ag.p3804a.p3806b.C48828i;
import com.google.assistant.p3803ag.p3804a.p3806b.C48831l;
import com.google.assistant.p3803ag.p3804a.p3806b.C48832m;
import com.google.assistant.p3803ag.p3804a.p3806b.C48833n;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3994s.p3995a.C53228gc;
import com.google.assistant.p3994s.p3995a.C53229gd;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53233gh;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53236gk;
import com.google.assistant.p3994s.p3995a.C53237gl;
import com.google.assistant.p3994s.p3995a.C53238gm;
import com.google.assistant.p3994s.p3995a.C53239gn;
import com.google.assistant.p3994s.p3995a.C53240go;
import com.google.assistant.p3994s.p3995a.C53241gp;
import com.google.assistant.p3994s.p3995a.C53242gq;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import java.util.ArrayList;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.a.g */
/* compiled from: PG */
public final /* synthetic */ class C123805g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123809k f342006a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f342007b;

    /* renamed from: c */
    public final /* synthetic */ C123789r f342008c;

    /* renamed from: d */
    public final /* synthetic */ aas f342009d;

    public /* synthetic */ C123805g(C123809k kVar, AccountId accountId, C123789r rVar, aas aas) {
        this.f342006a = kVar;
        this.f342007b = accountId;
        this.f342008c = rVar;
        this.f342009d = aas;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C60870cx cxVar;
        Optional optional2;
        Iterator it;
        C123809k kVar = this.f342006a;
        AccountId accountId = this.f342007b;
        C123789r rVar = this.f342008c;
        aas aas = this.f342009d;
        if (!((Boolean) obj).booleanValue()) {
            ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35249)).mo56386p("Skip the flight landing data.");
            return C60866ct.f164955a;
        } else if (kVar.f342025i) {
            C58480gp e = C58485gu.m89837e();
            C124114cm a = C124114cm.m203535a(kVar.f342017a, accountId);
            C53232gg ggVar = C53232gg.FLIGHT_LANDING;
            C48833n nVar = rVar.f341969e;
            if (nVar == null) {
                nVar = C48833n.f126350k;
            }
            C53228gc gcVar = (C53228gc) C53245gt.f139564n.createBuilder();
            gcVar.copyOnWrite();
            C53245gt gtVar = (C53245gt) gcVar.instance;
            gtVar.f139568b = ggVar.f139522g;
            gtVar.f139567a |= 1;
            boolean z = nVar.f126359f;
            gcVar.copyOnWrite();
            C53245gt gtVar2 = (C53245gt) gcVar.instance;
            gtVar2.f139567a |= 32;
            gtVar2.f139574h = z;
            String str = nVar.f126360g;
            gcVar.copyOnWrite();
            C53245gt gtVar3 = (C53245gt) gcVar.instance;
            str.getClass();
            gtVar3.f139567a |= 64;
            gtVar3.f139575i = str;
            String str2 = nVar.f126361h;
            gcVar.copyOnWrite();
            C53245gt gtVar4 = (C53245gt) gcVar.instance;
            str2.getClass();
            gtVar4.f139567a |= 128;
            gtVar4.f139576j = str2;
            C48832m mVar = nVar.f126354a;
            if (mVar == null) {
                mVar = C48832m.f126340i;
            }
            Optional c = C124114cm.m203536c(mVar);
            if (!c.isPresent()) {
                ((C58970a) ((C58970a) a.f342789e.mo56226d()).mo56372aa(35415)).mo56387q("Invalid PAPI current weather with data origin: %s", ggVar.f139522g);
                a.f342788d.mo109870F("SKIP_FLIGHT_LANDING_WEATHER_DUE_TO_INVALID_CURRENT_WEATHER");
                optional = Optional.empty();
            } else {
                C53244gs gsVar = (C53244gs) c.get();
                gcVar.copyOnWrite();
                C53245gt gtVar5 = (C53245gt) gcVar.instance;
                gsVar.getClass();
                gtVar5.f139571e = gsVar;
                gtVar5.f139567a |= 4;
                C63042fg fgVar = nVar.f126355b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                gcVar.copyOnWrite();
                C53245gt gtVar6 = (C53245gt) gcVar.instance;
                fgVar.getClass();
                gtVar6.f139572f = fgVar;
                gtVar6.f139567a |= 8;
                C48822c cVar = nVar.f126356c;
                if (cVar == null) {
                    cVar = C48822c.f126316e;
                }
                int i = cVar.f126318a;
                if ((i & 2) == 0 || (i & 1) == 0 || cVar.f126321d.isEmpty()) {
                    optional2 = Optional.empty();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = cVar.f126321d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Optional c2 = C124114cm.m203536c((C48832m) it2.next());
                            if (!c2.isPresent()) {
                                optional2 = Optional.empty();
                                break;
                            }
                            arrayList.add((C53244gs) c2.get());
                        } else {
                            C53233gh ghVar = (C53233gh) C53234gi.f139523e.createBuilder();
                            C58072d dVar = cVar.f126319b;
                            if (dVar == null) {
                                dVar = C58072d.f155218d;
                            }
                            ghVar.copyOnWrite();
                            C53234gi giVar = (C53234gi) ghVar.instance;
                            dVar.getClass();
                            giVar.f139526b = dVar;
                            giVar.f139525a |= 1;
                            int i2 = cVar.f126320c;
                            ghVar.copyOnWrite();
                            C53234gi giVar2 = (C53234gi) ghVar.instance;
                            giVar2.f139525a |= 2;
                            giVar2.f139527c = i2;
                            ghVar.mo53968a(arrayList);
                            optional2 = Optional.m71637of((C53234gi) ghVar.build());
                        }
                    }
                }
                if (!optional2.isPresent()) {
                    ((C58970a) ((C58970a) a.f342789e.mo56226d()).mo56372aa(35414)).mo56387q("Invalid PAPI hourly forecast with data origin: %s", ggVar.f139522g);
                    a.f342788d.mo109870F("SKIP_FLIGHT_LANDING_WEATHER_DUE_TO_INVALID_HOURLY_FORECAST");
                    optional = Optional.empty();
                } else {
                    C53234gi giVar3 = (C53234gi) optional2.get();
                    gcVar.copyOnWrite();
                    C53245gt gtVar7 = (C53245gt) gcVar.instance;
                    giVar3.getClass();
                    gtVar7.f139573g = giVar3;
                    gtVar7.f139567a |= 16;
                    C62971cq cqVar = nVar.f126357d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Iterator it3 = cqVar.iterator(); it3.hasNext(); it3 = it) {
                        C48832m mVar2 = (C48832m) it3.next();
                        C53229gd gdVar = (C53229gd) C53230ge.f139503j.createBuilder();
                        if ((mVar2.f126342a & 1) != 0) {
                            String str3 = mVar2.f126343b;
                            gdVar.copyOnWrite();
                            C53230ge geVar = (C53230ge) gdVar.instance;
                            str3.getClass();
                            it = it3;
                            geVar.f139505a |= 1;
                            geVar.f139506b = str3;
                        } else {
                            it = it3;
                        }
                        if ((mVar2.f126342a & 2) != 0) {
                            String str4 = mVar2.f126344c;
                            gdVar.copyOnWrite();
                            C53230ge geVar2 = (C53230ge) gdVar.instance;
                            str4.getClass();
                            geVar2.f139505a |= 2;
                            geVar2.f139507c = str4;
                            if ((mVar2.f126342a & 8) != 0) {
                                String str5 = mVar2.f126346e;
                                gdVar.copyOnWrite();
                                C53230ge geVar3 = (C53230ge) gdVar.instance;
                                str5.getClass();
                                geVar3.f139505a |= 8;
                                geVar3.f139509e = str5;
                                if ((mVar2.f126342a & 4) != 0) {
                                    String str6 = mVar2.f126345d;
                                    gdVar.copyOnWrite();
                                    C53230ge geVar4 = (C53230ge) gdVar.instance;
                                    str6.getClass();
                                    geVar4.f139505a |= 4;
                                    geVar4.f139508d = str6;
                                    if ((mVar2.f126342a & 16) != 0) {
                                        String str7 = mVar2.f126347f;
                                        gdVar.copyOnWrite();
                                        C53230ge geVar5 = (C53230ge) gdVar.instance;
                                        str7.getClass();
                                        geVar5.f139505a |= 32;
                                        geVar5.f139511g = str7;
                                    }
                                    if ((mVar2.f126342a & 64) != 0) {
                                        int a2 = C48831l.m85283a(mVar2.f126349h);
                                        if (a2 == 0) {
                                            a2 = 1;
                                        }
                                        C53236gk e2 = C124114cm.m203537e(a2);
                                        gdVar.copyOnWrite();
                                        C53230ge geVar6 = (C53230ge) gdVar.instance;
                                        geVar6.f139510f = e2.f139534d;
                                        geVar6.f139505a |= 16;
                                    }
                                    if ((mVar2.f126342a & 32) != 0) {
                                        String str8 = mVar2.f126348g;
                                        gdVar.copyOnWrite();
                                        C53230ge geVar7 = (C53230ge) gdVar.instance;
                                        str8.getClass();
                                        geVar7.f139505a |= 64;
                                        geVar7.f139512h = str8;
                                        arrayList2.add((C53230ge) gdVar.build());
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        ((C58970a) ((C58970a) a.f342789e.mo56226d()).mo56372aa(35413)).mo56387q("Invalid PAPI daily forecast with data origin: %s", ggVar.f139522g);
                        a.f342788d.mo109870F("SKIP_FLIGHT_LANDING_WEATHER_DUE_TO_INVALID_DAILY_FORECAST");
                        optional = Optional.empty();
                    } else {
                        C58072d dVar2 = nVar.f126358e;
                        if (dVar2 == null) {
                            dVar2 = C58072d.f155218d;
                        }
                        gcVar.copyOnWrite();
                        C53245gt gtVar8 = (C53245gt) gcVar.instance;
                        dVar2.getClass();
                        gtVar8.f139570d = dVar2;
                        gtVar8.f139567a |= 2;
                        gcVar.mo53965a(arrayList2);
                        C53237gl glVar = (C53237gl) C53238gm.f139535e.createBuilder();
                        C48824e eVar = nVar.f126363j;
                        if (eVar == null) {
                            eVar = C48824e.f126322d;
                        }
                        String str9 = eVar.f126324a;
                        glVar.copyOnWrite();
                        C53238gm gmVar = (C53238gm) glVar.instance;
                        str9.getClass();
                        gmVar.f139537a |= 1;
                        gmVar.f139538b = str9;
                        C48824e eVar2 = nVar.f126363j;
                        if (eVar2 == null) {
                            eVar2 = C48824e.f126322d;
                        }
                        String str10 = eVar2.f126325b;
                        glVar.copyOnWrite();
                        C53238gm gmVar2 = (C53238gm) glVar.instance;
                        str10.getClass();
                        gmVar2.f139537a |= 2;
                        gmVar2.f139539c = str10;
                        C48824e eVar3 = nVar.f126363j;
                        if (eVar3 == null) {
                            eVar3 = C48824e.f126322d;
                        }
                        String str11 = eVar3.f126326c;
                        glVar.copyOnWrite();
                        C53238gm gmVar3 = (C53238gm) glVar.instance;
                        str11.getClass();
                        gmVar3.f139537a |= 4;
                        gmVar3.f139540d = str11;
                        C53238gm gmVar4 = (C53238gm) glVar.build();
                        gcVar.copyOnWrite();
                        C53245gt gtVar9 = (C53245gt) gcVar.instance;
                        gmVar4.getClass();
                        gtVar9.f139578l = gmVar4;
                        gtVar9.f139567a |= 512;
                        C48828i iVar = nVar.f126362i;
                        if (iVar == null) {
                            iVar = C48828i.f126333d;
                        }
                        C53239gn gnVar = (C53239gn) C53242gq.f139546f.createBuilder();
                        String str12 = iVar.f126335a;
                        gnVar.copyOnWrite();
                        C53242gq gqVar = (C53242gq) gnVar.instance;
                        str12.getClass();
                        gqVar.f139548a |= 1;
                        gqVar.f139549b = str12;
                        String str13 = iVar.f126336b;
                        gnVar.copyOnWrite();
                        C53242gq gqVar2 = (C53242gq) gnVar.instance;
                        str13.getClass();
                        gqVar2.f139548a |= 2;
                        gqVar2.f139550c = str13;
                        C53240go goVar = (C53240go) C53241gp.f139541d.createBuilder();
                        C48827h hVar = iVar.f126337c;
                        if (hVar == null) {
                            hVar = C48827h.f126328c;
                        }
                        float f = hVar.f126330a;
                        goVar.copyOnWrite();
                        C53241gp gpVar = (C53241gp) goVar.instance;
                        gpVar.f139543a |= 1;
                        gpVar.f139544b = f;
                        C48827h hVar2 = iVar.f126337c;
                        if (hVar2 == null) {
                            hVar2 = C48827h.f126328c;
                        }
                        float f2 = hVar2.f126331b;
                        goVar.copyOnWrite();
                        C53241gp gpVar2 = (C53241gp) goVar.instance;
                        gpVar2.f139543a |= 2;
                        gpVar2.f139545c = f2;
                        C53241gp gpVar3 = (C53241gp) goVar.build();
                        gnVar.copyOnWrite();
                        C53242gq gqVar3 = (C53242gq) gnVar.instance;
                        gpVar3.getClass();
                        gqVar3.f139552e = gpVar3;
                        gqVar3.f139548a |= 8;
                        C53242gq gqVar4 = (C53242gq) gnVar.build();
                        gcVar.copyOnWrite();
                        C53245gt gtVar10 = (C53245gt) gcVar.instance;
                        gqVar4.getClass();
                        gtVar10.f139577k = gqVar4;
                        gtVar10.f139567a |= 256;
                        optional = Optional.m71637of((C53245gt) gcVar.build());
                    }
                }
            }
            if (!optional.isPresent()) {
                ((C58970a) ((C58970a) a.f342789e.mo56226d()).mo56372aa(35412)).mo56387q("Invalid PAPI weather with data origin: %s", ggVar.f139522g);
                cxVar = C60866ct.f164955a;
            } else {
                byte[] bytes = ggVar.name().getBytes();
                ((C58970a) ((C58970a) a.f342789e.mo56224b()).mo56372aa(35411)).mo56387q("Override cached PCP weather using PCP weather with data origin: %s", ggVar.f139522g);
                a.f342788d.mo109870F("OVERRIDE_CACHED_WEATHER_USING_FLIGHT_LANDING_WEATHER");
                cxVar = a.mo106291b((C53245gt) optional.get(), bytes, e);
            }
            C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(new C123800b(kVar, e)), kVar.f342018b);
            ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35248)).mo56386p("Saving the flight landing data.");
            C60870cx b = C60856cj.m92892a(C58485gu.m89847o(h, kVar.mo106133a(rVar, accountId, aas))).mo57335b(C47810es.m84965e(new C123801c(kVar)), kVar.f342018b);
            C60856cj.m92911t(b, C47810es.m84974n(new C123808j(kVar)), kVar.f342018b);
            return b;
        } else {
            ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35247)).mo56386p("Saving the flight landing data.");
            return C60922j.m93045h(kVar.mo106133a(rVar, accountId, aas), C47810es.m84966f(new C123802d(kVar)), kVar.f342018b);
        }
    }
}
