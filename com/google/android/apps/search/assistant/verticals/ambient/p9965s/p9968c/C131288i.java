package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9968c;

import android.content.Context;
import android.content.Intent;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.h.c.a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131651a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131652b;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131653c;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131654d;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131655e;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131656f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50814dk;
import com.google.assistant.p3886c.C50815dl;
import com.google.assistant.p3886c.C50816dm;
import com.google.assistant.p3886c.C50817dn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50843o;
import com.google.assistant.p3886c.C50844p;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3994s.p3995a.C53179eh;
import com.google.assistant.p3994s.p3995a.C53183el;
import com.google.assistant.p3994s.p3995a.C53185en;
import com.google.assistant.p3994s.p3995a.C53187ep;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import java.util.Calendar;
import java.util.TimeZone;
import p3186j$.time.Duration;
import p3186j$.util.DesugarTimeZone;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.c.i */
/* compiled from: PG */
public final /* synthetic */ class C131288i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131292m f358951a;

    public /* synthetic */ C131288i(C131292m mVar) {
        this.f358951a = mVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131292m mVar;
        C60870cx cxVar;
        int i;
        String str;
        int i2;
        C60870cx cxVar2;
        Intent a;
        String str2;
        C131292m mVar2 = this.f358951a;
        C123744bk bkVar = (C123744bk) obj;
        ((C58970a) ((C58970a) mVar2.f358957a.mo56224b()).mo56372aa(39187)).mo56386p("#Generate flight smartspace card");
        if (bkVar.f341808c == 10) {
            C131655e eVar = mVar2.f358958b;
            C53190es esVar = (C53190es) bkVar.f341809d;
            Optional empty = Optional.empty();
            C58970a aVar = (C58970a) ((C58970a) eVar.f359722e.mo56224b()).mo56372aa(39145);
            C53179eh ehVar = esVar.f139405j;
            if (ehVar == null) {
                ehVar = C53179eh.f139366e;
            }
            aVar.mo56352E("#buildSmartspaceCardProtoForFlightUpdate(): %s %s", ehVar.f139370c, esVar.f139406k);
            Optional b = C131656f.m214100b(C131655e.m214096e(esVar));
            if (b.isEmpty()) {
                ((C58970a) ((C58970a) eVar.f359722e.mo56224b()).mo56372aa(39147)).mo56386p("Not building the card because Smartspace can not parse the departure time.");
                cxVar = C60856cj.m92900i(Optional.empty());
                mVar = mVar2;
            } else {
                long longValue = ((Long) b.get()).longValue();
                long b2 = eVar.f359719b.mo26870b();
                if (b2 > C131179d.f358768d + longValue || b2 < longValue - C131179d.f358766b) {
                    mVar = mVar2;
                    ((C58970a) ((C58970a) eVar.f359722e.mo56224b()).mo56372aa(39146)).mo56386p("Not building the card because flight status is inactive.");
                    cxVar = C60856cj.m92900i(Optional.empty());
                } else {
                    if (empty.isPresent()) {
                        i = ((Integer) empty.get()).intValue();
                    } else {
                        C53187ep epVar = esVar.f139401f;
                        if (epVar == null) {
                            epVar = C53187ep.f139383h;
                        }
                        String str3 = epVar.f139386b;
                        C53187ep epVar2 = esVar.f139402g;
                        if (epVar2 == null) {
                            epVar2 = C53187ep.f139383h;
                        }
                        String str4 = epVar2.f139386b;
                        C53179eh ehVar2 = esVar.f139405j;
                        if (ehVar2 == null) {
                            ehVar2 = C53179eh.f139366e;
                        }
                        i = (str3 + str4 + ehVar2.f139370c + esVar.f139406k).hashCode();
                    }
                    long j = C131179d.f358768d + longValue;
                    long j2 = longValue - C131179d.f358766b;
                    long j3 = longValue - C131179d.f358767c;
                    C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
                    cnVar.copyOnWrite();
                    C50818do doVar = (C50818do) cnVar.instance;
                    doVar.f132304a |= 4;
                    doVar.f132307d = i;
                    cnVar.copyOnWrite();
                    C50818do doVar2 = (C50818do) cnVar.instance;
                    doVar2.f132304a |= 1;
                    doVar2.f132305b = false;
                    C50792cp cpVar = C50792cp.PRIMARY;
                    cnVar.copyOnWrite();
                    C50818do doVar3 = (C50818do) cnVar.instance;
                    doVar3.f132306c = cpVar.f132174e;
                    doVar3.f132304a |= 2;
                    C50728m mVar3 = (C50728m) C50729n.f132007g.createBuilder();
                    mVar3.copyOnWrite();
                    C50729n nVar = (C50729n) mVar3.instance;
                    nVar.f132009a |= 1;
                    nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
                    cnVar.copyOnWrite();
                    C50818do doVar4 = (C50818do) cnVar.instance;
                    C50729n nVar2 = (C50729n) mVar3.build();
                    nVar2.getClass();
                    doVar4.f132314k = nVar2;
                    doVar4.f132304a |= 512;
                    C50794cr crVar = C50794cr.FLIGHT;
                    cnVar.copyOnWrite();
                    C50818do doVar5 = (C50818do) cnVar.instance;
                    doVar5.f132315l = crVar.f132222T;
                    doVar5.f132304a |= 1024;
                    C50731p pVar = C50731p.START_ACTIVITY;
                    if (C131655e.m214097f(esVar)) {
                        str = ((C53185en) esVar.f139407l.get(0)).f139381c;
                        mVar = mVar2;
                        i2 = 1;
                    } else {
                        if (eVar.f359726i.booleanValue()) {
                            Context context = eVar.f359718a;
                            String str5 = esVar.f139410o;
                            if (str5.isEmpty()) {
                                str5 = context.getResources().getString(R.string.assistant_my_flights_query);
                            }
                            C50794cr crVar2 = C50794cr.FLIGHT;
                            a = new Intent();
                            mVar = mVar2;
                            a.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_ASSISTANT_QUERY", str5);
                            a.b(a, (String) null, crVar2, pVar);
                        } else {
                            mVar = mVar2;
                            C53187ep epVar3 = esVar.f139401f;
                            if (epVar3 == null) {
                                epVar3 = C53187ep.f139383h;
                            }
                            C53187ep epVar4 = esVar.f139402g;
                            if (epVar4 == null) {
                                epVar4 = C53187ep.f139383h;
                            }
                            String str6 = esVar.f139409n;
                            if (str6.isEmpty()) {
                                Object[] objArr = new Object[5];
                                C53179eh ehVar3 = esVar.f139405j;
                                if (ehVar3 == null) {
                                    ehVar3 = C53179eh.f139366e;
                                }
                                objArr[0] = ehVar3.f139370c;
                                objArr[1] = Integer.valueOf(esVar.f139406k);
                                objArr[2] = epVar3.f139386b;
                                objArr[3] = epVar4.f139386b;
                                C53183el elVar = esVar.f139403h;
                                if (elVar == null) {
                                    elVar = C53183el.f139373c;
                                }
                                String str7 = elVar.f139376b;
                                if (str7.length() < 10) {
                                    str2 = BuildConfig.FLAVOR;
                                } else {
                                    str2 = str7.substring(0, 10);
                                }
                                objArr[4] = str2;
                                str6 = String.format("%s %s %s %s %s", objArr);
                            }
                            a = a.a((Intent) null, str6, C50794cr.FLIGHT, pVar);
                        }
                        i2 = 1;
                        str = a.toUri(1);
                    }
                    C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
                    qVar.copyOnWrite();
                    C50733r rVar = (C50733r) qVar.instance;
                    rVar.f132024b = pVar.f132020d;
                    rVar.f132023a |= i2;
                    qVar.copyOnWrite();
                    C50733r rVar2 = (C50733r) qVar.instance;
                    str.getClass();
                    rVar2.f132023a |= 2;
                    rVar2.f132025c = str;
                    C50733r rVar3 = (C50733r) qVar.build();
                    cnVar.copyOnWrite();
                    C50818do doVar6 = (C50818do) cnVar.instance;
                    rVar3.getClass();
                    doVar6.f132316m = rVar3;
                    doVar6.f132304a |= 2048;
                    long b3 = eVar.f359719b.mo26870b();
                    cnVar.copyOnWrite();
                    C50818do doVar7 = (C50818do) cnVar.instance;
                    doVar7.f132304a |= 4096;
                    doVar7.f132317n = b3;
                    cnVar.copyOnWrite();
                    C50818do doVar8 = (C50818do) cnVar.instance;
                    doVar8.f132304a |= 8192;
                    doVar8.f132318o = longValue;
                    long j4 = C131179d.f358768d;
                    cnVar.copyOnWrite();
                    C50818do doVar9 = (C50818do) cnVar.instance;
                    doVar9.f132304a |= 16384;
                    doVar9.f132319p = j4;
                    C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
                    csVar.copyOnWrite();
                    C50796ct ctVar = (C50796ct) csVar.instance;
                    ctVar.f132225a |= 1;
                    ctVar.f132226b = j;
                    cnVar.copyOnWrite();
                    C50818do doVar10 = (C50818do) cnVar.instance;
                    C50796ct ctVar2 = (C50796ct) csVar.build();
                    ctVar2.getClass();
                    doVar10.f132320q = ctVar2;
                    doVar10.f132304a |= 32768;
                    C50814dk dkVar = (C50814dk) C50817dn.f132287e.createBuilder();
                    C50815dl dlVar = (C50815dl) C50816dm.f132281e.createBuilder();
                    dlVar.copyOnWrite();
                    C50816dm dmVar = (C50816dm) dlVar.instance;
                    dmVar.f132283a |= 1;
                    dmVar.f132284b = j2;
                    dlVar.copyOnWrite();
                    C50816dm dmVar2 = (C50816dm) dlVar.instance;
                    dmVar2.f132283a |= 2;
                    dmVar2.f132285c = j;
                    dlVar.mo53468a(j3);
                    C50816dm dmVar3 = (C50816dm) dlVar.build();
                    dkVar.copyOnWrite();
                    C50817dn dnVar = (C50817dn) dkVar.instance;
                    dmVar3.getClass();
                    dnVar.f132292d = dmVar3;
                    dnVar.f132289a |= 8;
                    C50817dn dnVar2 = (C50817dn) dkVar.build();
                    cnVar.copyOnWrite();
                    C50818do doVar11 = (C50818do) cnVar.instance;
                    dnVar2.getClass();
                    doVar11.f132295A = dnVar2;
                    doVar11.f132304a |= 67108864;
                    cnVar.copyOnWrite();
                    C50818do doVar12 = (C50818do) cnVar.instance;
                    doVar12.f132304a |= 65536;
                    doVar12.f132321r = true;
                    boolean f = C131655e.m214097f(esVar);
                    long b4 = eVar.f359719b.mo26870b();
                    C53187ep epVar5 = esVar.f139401f;
                    if (epVar5 == null) {
                        epVar5 = C53187ep.f139383h;
                    }
                    Calendar instance = Calendar.getInstance();
                    TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
                    timeZone.setRawOffset(epVar5.f139390f * 60000);
                    C58072d dVar = epVar5.f139389e;
                    if (dVar == null) {
                        dVar = C58072d.f155218d;
                    }
                    instance.set(1, dVar.f155220a);
                    C58072d dVar2 = epVar5.f139389e;
                    if (dVar2 == null) {
                        dVar2 = C58072d.f155218d;
                    }
                    instance.set(2, dVar2.f155221b - 1);
                    C58072d dVar3 = epVar5.f139389e;
                    if (dVar3 == null) {
                        dVar3 = C58072d.f155218d;
                    }
                    instance.set(5, dVar3.f155222c);
                    C58081m mVar4 = epVar5.f139388d;
                    if (mVar4 == null) {
                        mVar4 = C58081m.f155254e;
                    }
                    instance.set(11, mVar4.f155256a);
                    C58081m mVar5 = epVar5.f139388d;
                    if (mVar5 == null) {
                        mVar5 = C58081m.f155254e;
                    }
                    instance.set(12, mVar5.f155257b);
                    C58081m mVar6 = epVar5.f139388d;
                    if (mVar6 == null) {
                        mVar6 = C58081m.f155254e;
                    }
                    instance.set(13, mVar6.f155258c);
                    instance.set(14, 0);
                    instance.setTimeZone(timeZone);
                    boolean z = !C131655e.m214097f(esVar) && !esVar.f139407l.isEmpty() && (((C53185en) esVar.f139407l.get(0)).f139379a & 16) != 0 && eVar.f359724g.booleanValue() && instance.getTimeInMillis() - b4 > Duration.ofMinutes(eVar.f359725h.longValue()).toMillis();
                    boolean z2 = f || z;
                    if (f) {
                        C50843o b5 = C131655e.m214093b(esVar);
                        C53187ep epVar6 = esVar.f139401f;
                        if (epVar6 == null) {
                            epVar6 = C53187ep.f139383h;
                        }
                        String str8 = epVar6.f139387c;
                        b5.copyOnWrite();
                        C50844p pVar2 = (C50844p) b5.instance;
                        C50844p pVar3 = C50844p.f132387m;
                        str8.getClass();
                        pVar2.f132389a |= 1;
                        pVar2.f132390b = str8;
                        if (esVar.f139407l.isEmpty()) {
                            cxVar2 = C60856cj.m92900i((C50844p) b5.build());
                        } else {
                            C53185en enVar = (C53185en) esVar.f139407l.get(0);
                            if ((enVar.f139379a & 1) != 0) {
                                String str9 = enVar.f139380b;
                                b5.copyOnWrite();
                                C50844p pVar4 = (C50844p) b5.instance;
                                str9.getClass();
                                pVar4.f132389a |= 2;
                                pVar4.f132391c = str9;
                            }
                            cxVar2 = C60922j.m93044g(C5528f.m14300b(C5528f.m14299a(eVar.f359723f.mo51286a().mo11864b().mo12448j("https://fonts.gstatic.com/s/i/googlematerialicons/qr_code/v11/gm_grey-48dp/2x/gm_qr_code_gm_grey_48dp.png"))), C47810es.m84963c(new C131653c(b5)), eVar.f359720c);
                        }
                    } else if (z) {
                        C50843o b6 = C131655e.m214093b(esVar);
                        String string = eVar.f359718a.getResources().getString(R.string.assistant_tap_to_check_in);
                        b6.copyOnWrite();
                        C50844p pVar5 = (C50844p) b6.instance;
                        C50844p pVar6 = C50844p.f132387m;
                        string.getClass();
                        pVar5.f132389a |= 16;
                        pVar5.f132394f = string;
                        C6007z b7 = eVar.f359723f.mo51286a().mo11864b();
                        C53179eh ehVar4 = esVar.f139405j;
                        if (ehVar4 == null) {
                            ehVar4 = C53179eh.f139366e;
                        }
                        cxVar2 = C60922j.m93044g(C5528f.m14300b(C5528f.m14299a(b7.mo12448j(ehVar4.f139371d))), C47810es.m84963c(new C131652b(b6)), eVar.f359720c);
                    } else {
                        cxVar2 = C60856cj.m92900i((C50844p) C131655e.m214093b(esVar).build());
                    }
                    C60870cx cxVar3 = cxVar2;
                    C60870cx m = C60856cj.m92904m(C47810es.m84978r(new C131651a(eVar)), eVar.f359729l);
                    cxVar = C47638k.m84751b(cxVar3, m).mo51520a(new C131654d(eVar, cxVar3, cnVar, esVar, z2, m), eVar.f359721d);
                }
            }
            C131292m mVar7 = mVar;
            return C47633f.m84733g(cxVar).mo51516i(new C131286g(mVar7), mVar7.f358960d);
        }
        ((C58970a) ((C58970a) mVar2.f358957a.mo56226d()).mo56372aa(39188)).mo56389s("flight status data is empty: %s", bkVar);
        return C60856cj.m92900i(Optional.empty());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
