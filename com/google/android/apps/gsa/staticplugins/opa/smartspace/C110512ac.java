package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.accounts.Account;
import androidx.work.C4634o;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83788g;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83805u;
import com.google.android.apps.gsa.opa.smartspace.p6453b.C83743a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8449b.p8450a.C110518a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8449b.p8450a.C110520c;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f.C110679m;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g.C110692g;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q.C110898b;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124094bt;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124099by;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.p3926e.C52013hl;
import com.google.assistant.p3897e.p3921j.p3926e.C52015hn;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53165du;
import com.google.assistant.p3994s.p3995a.C53175ed;
import com.google.assistant.p3994s.p3995a.C53179eh;
import com.google.assistant.p3994s.p3995a.C53183el;
import com.google.assistant.p3994s.p3995a.C53187ep;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.assistant.p3994s.p3995a.C53228gc;
import com.google.assistant.p3994s.p3995a.C53229gd;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53418nd;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57014f;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import com.google.protos.p4953bc.p4954a.C64400d;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64423n;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64429t;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.DesugarArrays;
import p3186j$.util.DesugarTimeZone;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.ac */
/* compiled from: PG */
public final class C110512ac {

    /* renamed from: a */
    public static final C59071e f308097a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.ac");

    /* renamed from: l */
    private static final long f308098l = Duration.ofMinutes(10).toMillis();

    /* renamed from: b */
    public final C85492i f308099b;

    /* renamed from: c */
    public final C58833ax f308100c;

    /* renamed from: d */
    public final C83794j f308101d;

    /* renamed from: e */
    public final C83743a f308102e;

    /* renamed from: f */
    public final C68214a f308103f;

    /* renamed from: g */
    public final C58974d f308104g;

    /* renamed from: h */
    public final C92122r f308105h;

    /* renamed from: i */
    public final C130895ag f308106i;

    /* renamed from: j */
    public final C84474e f308107j;

    /* renamed from: k */
    public final C124099by f308108k;

    /* renamed from: m */
    private final C22871g f308109m;

    /* renamed from: n */
    private final C22871g f308110n;

    /* renamed from: o */
    private final C85299b f308111o;

    /* renamed from: p */
    private final C21370a f308112p;

    /* renamed from: q */
    private final C118561t f308113q;

    /* renamed from: r */
    private final C83788g f308114r;

    /* renamed from: s */
    private final u f308115s;

    /* renamed from: t */
    private final C110679m f308116t;

    /* renamed from: u */
    private final C110692g f308117u;

    /* renamed from: v */
    private final C86034c f308118v;

    /* renamed from: w */
    private final C84469a f308119w;

    /* renamed from: x */
    private final C85664bo f308120x;

    /* renamed from: y */
    private final C86054o f308121y;

    /* renamed from: z */
    private final C110518a f308122z;

    public C110512ac(C85492i iVar, C22871g gVar, C85299b bVar, C21370a aVar, C118561t tVar, C83794j jVar, C83788g gVar2, C83743a aVar2, C68214a aVar3, C83564a aVar4, C92122r rVar, C22871g gVar3, u uVar, C110518a aVar5, C130895ag agVar, C110679m mVar, C58833ax axVar, C84474e eVar, C110692g gVar4, C86034c cVar, C124099by byVar, C84469a aVar6, C85664bo boVar, C86054o oVar) {
        this.f308111o = bVar;
        this.f308099b = iVar;
        this.f308109m = gVar;
        this.f308112p = aVar;
        this.f308113q = tVar;
        this.f308101d = jVar;
        this.f308114r = gVar2;
        this.f308102e = aVar2;
        this.f308103f = aVar3;
        this.f308105h = rVar;
        this.f308110n = gVar3;
        this.f308115s = uVar;
        this.f308122z = aVar5;
        C83564a aVar7 = aVar4;
        this.f308104g = aVar4.mo76900a("AA.ProactiveServiceManager");
        this.f308106i = agVar;
        this.f308116t = mVar;
        this.f308100c = axVar;
        this.f308107j = eVar;
        this.f308117u = gVar4;
        this.f308118v = cVar;
        this.f308108k = byVar;
        this.f308119w = aVar6;
        this.f308120x = boVar;
        this.f308121y = oVar;
    }

    /* renamed from: f */
    private final C60870cx m184108f(C53422nh nhVar) {
        C58485gu guVar;
        C53165du duVar;
        C53420nf nfVar;
        C53420nf nfVar2;
        C53165du duVar2;
        C53420nf nfVar3;
        C53422nh nhVar2 = nhVar;
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        long b = this.f308112p.mo26870b();
        int i = 5;
        if ((nhVar2.f140184a & 16) != 0) {
            C53370lj ljVar = nhVar2.f140188e;
            if (ljVar == null) {
                ljVar = C53370lj.f140047c;
            }
            C58480gp e = C58485gu.m89837e();
            for (C53366lf lfVar : ljVar.f140050b) {
                if (lfVar.f140037b == 4) {
                    nfVar = (C53420nf) lfVar.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                C53250gy gyVar = nfVar.f140176j;
                if (gyVar == null) {
                    gyVar = C53250gy.f139586c;
                }
                if (gyVar.f139588a == 10) {
                    if (lfVar.f140037b == 4) {
                        nfVar2 = (C53420nf) lfVar.f140038c;
                    } else {
                        nfVar2 = C53420nf.f140165o;
                    }
                    C53250gy gyVar2 = nfVar2.f140176j;
                    if (gyVar2 == null) {
                        gyVar2 = C53250gy.f139586c;
                    }
                    if (gyVar2.f139588a == 10) {
                        duVar2 = (C53165du) gyVar2.f139589b;
                    } else {
                        duVar2 = C53165du.f139338g;
                    }
                    C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
                    C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
                    aiVar.copyOnWrite();
                    C83738aj ajVar = (C83738aj) aiVar.instance;
                    duVar2.getClass();
                    ajVar.f228229b = duVar2;
                    ajVar.f228228a = 5;
                    C83738aj ajVar2 = (C83738aj) aiVar.build();
                    abVar.copyOnWrite();
                    C83739ak akVar = (C83739ak) abVar.instance;
                    ajVar2.getClass();
                    akVar.f228233b = ajVar2;
                    akVar.f228232a |= 1;
                    if (lfVar.f140037b == 4) {
                        nfVar3 = (C53420nf) lfVar.f140038c;
                    } else {
                        nfVar3 = C53420nf.f140165o;
                    }
                    String str = nfVar3.f140175i;
                    abVar.copyOnWrite();
                    C83739ak akVar2 = (C83739ak) abVar.instance;
                    str.getClass();
                    akVar2.f228232a |= 1024;
                    akVar2.f228242k = str;
                    e.mo55395g((C83739ak) abVar.build());
                }
            }
            guVar = e.mo55394f();
        } else {
            guVar = C58485gu.m89845m();
        }
        int i2 = ((C58724pq) guVar).f156474d;
        int i3 = 0;
        long j = Long.MAX_VALUE;
        while (i3 < i2) {
            C83739ak akVar3 = (C83739ak) guVar.get(i3);
            C83738aj ajVar3 = akVar3.f228233b;
            if (ajVar3 == null) {
                ajVar3 = C83738aj.f228226c;
            }
            if (ajVar3.f228228a == i) {
                duVar = (C53165du) ajVar3.f228229b;
            } else {
                duVar = C53165du.f139338g;
            }
            long j2 = duVar.f139343d - b;
            if (j2 > 0 && j2 < C131179d.f358769e) {
                long j3 = duVar.f139342c;
                if (j3 <= b) {
                    arrayList.add(this.f308111o.mo78853f(akVar3));
                } else {
                    j = Math.min(j, j3);
                }
            }
            i3++;
            i = 5;
        }
        if (j != Long.MAX_VALUE) {
            long b2 = this.f308112p.mo26870b();
            C110518a aVar = this.f308122z;
            Duration ofMillis = Duration.ofMillis(j - b2);
            C46578l lVar = aVar.f308127a;
            C46582p j4 = C46586t.m83063j(C110520c.class);
            C46573g gVar = new C46573g(ofMillis.toMillis(), TimeUnit.MILLISECONDS);
            C46570d dVar = (C46570d) j4;
            dVar.f121754c = gVar;
            dVar.f121757f = C58833ax.m90834k(new C46574h("BIRTHDAY_REFRESH_WORKER", C4634o.REPLACE));
            C46459k.m82829b(lVar.mo50546b(j4.mo50561a()), "Failed to enqueue birthday refresh worker", new Object[0]);
        }
        return arrayList.isEmpty() ? C118826c.f331423b : C118826c.m197212b(arrayList);
    }

    /* renamed from: g */
    private final void m184109g(C58485gu guVar, String str) {
        C53190es esVar;
        C59104x b = f308097a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
        ((C59052c) ((C59052c) b).mo56372aa(26492)).mo56395y("%d flights received from %s.", guVar.size(), str);
        if (str.equals("zerostate")) {
            this.f308106i.mo109871G("FLIGHT_STATUS_EXTRACTED_FROM_ZEROSTATE");
        }
        if (str.equals("sno")) {
            this.f308106i.mo109871G("FLIGHT_STATUS_EXTRACTED_FROM_SNO");
        }
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C83738aj ajVar = ((C83739ak) guVar.get(i)).f228233b;
            if (ajVar == null) {
                ajVar = C83738aj.f228226c;
            }
            if (ajVar.f228228a == 4) {
                esVar = (C53190es) ajVar.f228229b;
            } else {
                esVar = C53190es.f139393s;
            }
            C59104x b2 = f308097a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(26493);
            C53179eh ehVar = esVar.f139405j;
            if (ehVar == null) {
                ehVar = C53179eh.f139366e;
            }
            String str2 = ehVar.f139370c;
            Integer valueOf = Integer.valueOf(esVar.f139406k);
            C53183el elVar = esVar.f139403h;
            if (elVar == null) {
                elVar = C53183el.f139373c;
            }
            cVar.mo56359L("%s %s departure_scheduled: %s", str2, valueOf, elVar.f139376b);
        }
    }

    /* renamed from: a */
    public final C60870cx mo98748a(C60870cx cxVar, C53121cd cdVar, C57017i iVar) {
        SettableFuture settableFuture = new SettableFuture();
        if (!((C86124t) this.f308103f.mo27525b()).mo79746e(C90014bt.f247811oG) || cdVar != C53121cd.WEATHER) {
            new C90873ag(cxVar, this.f308109m, "handle zerostate partial request", new C110930w(this, cdVar, settableFuture, iVar)).mo85223a(new C110931x(this, cdVar, iVar, settableFuture));
            return settableFuture;
        }
        C59104x b = f308097a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
        ((C59052c) ((C59052c) b).mo56372aa(26469)).mo56386p("processZerostateResponse handle WEATHER response by pcp");
        settableFuture.mo57356n(C118826c.f331422a);
        return settableFuture;
    }

    /* renamed from: b */
    public final C60870cx mo98749b(C53422nh nhVar, C53121cd cdVar, C57017i iVar) {
        C58833ax axVar;
        C53245gt gtVar;
        C53420nf nfVar;
        C53420nf nfVar2;
        C53245gt gtVar2;
        C53420nf nfVar3;
        C58485gu guVar;
        long j;
        C53190es esVar;
        int i;
        C58485gu guVar2;
        Optional optional;
        C53420nf nfVar4;
        C53420nf nfVar5;
        C53190es esVar2;
        C53420nf nfVar6;
        C53422nh nhVar2 = nhVar;
        C57017i iVar2 = iVar;
        C53121cd cdVar2 = C53121cd.UNKNOWN;
        int ordinal = cdVar.ordinal();
        int i2 = 4;
        if (ordinal == 3) {
            C58976aa aaVar = C58975e.f156826a;
            C53370lj ljVar = nhVar2.f140188e;
            if (ljVar == null) {
                ljVar = C53370lj.f140047c;
            }
            Iterator it = ljVar.f140050b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    axVar = C58836b.f156633a;
                    break;
                }
                C53366lf lfVar = (C53366lf) it.next();
                if (lfVar.f140037b == 4) {
                    nfVar = (C53420nf) lfVar.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                C53250gy gyVar = nfVar.f140176j;
                if (gyVar == null) {
                    gyVar = C53250gy.f139586c;
                }
                if (gyVar.f139588a == 4) {
                    if (lfVar.f140037b == 4) {
                        nfVar2 = (C53420nf) lfVar.f140038c;
                    } else {
                        nfVar2 = C53420nf.f140165o;
                    }
                    C53250gy gyVar2 = nfVar2.f140176j;
                    if (gyVar2 == null) {
                        gyVar2 = C53250gy.f139586c;
                    }
                    if (gyVar2.f139588a == 4) {
                        gtVar2 = (C53245gt) gyVar2.f139589b;
                    } else {
                        gtVar2 = C53245gt.f139564n;
                    }
                    C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
                    C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
                    aiVar.copyOnWrite();
                    C83738aj ajVar = (C83738aj) aiVar.instance;
                    gtVar2.getClass();
                    ajVar.f228229b = gtVar2;
                    ajVar.f228228a = 3;
                    C83738aj ajVar2 = (C83738aj) aiVar.build();
                    abVar.copyOnWrite();
                    C83739ak akVar = (C83739ak) abVar.instance;
                    ajVar2.getClass();
                    akVar.f228233b = ajVar2;
                    akVar.f228232a |= 1;
                    if (lfVar.f140037b == 4) {
                        nfVar3 = (C53420nf) lfVar.f140038c;
                    } else {
                        nfVar3 = C53420nf.f140165o;
                    }
                    String str = nfVar3.f140175i;
                    abVar.copyOnWrite();
                    C83739ak akVar2 = (C83739ak) abVar.instance;
                    str.getClass();
                    akVar2.f228232a |= 1024;
                    akVar2.f228242k = str;
                    axVar = C58833ax.m90834k((C83739ak) abVar.build());
                }
            }
            if (!axVar.mo56113h()) {
                nhVar.getClass();
                if ((nhVar2.f140184a & 16) != 0) {
                    C53370lj ljVar2 = nhVar2.f140188e;
                    if (ljVar2 == null) {
                        ljVar2 = C53370lj.f140047c;
                    }
                    C52013hl hlVar = null;
                    for (C53366lf lfVar2 : ljVar2.f140050b) {
                        if (lfVar2.f140037b == 2 && (hlVar = ((C53418nd) lfVar2.f140038c).f140162b) == null) {
                            hlVar = C52013hl.f136508e;
                        }
                    }
                    if (hlVar != null) {
                        C52015hn hnVar = hlVar.f136512c;
                        if (hnVar == null) {
                            hnVar = C52015hn.f136515e;
                        }
                        C51012dc dcVar = hnVar.f136520d;
                        if (dcVar == null) {
                            dcVar = C51012dc.f132813k;
                        }
                        if (!dcVar.f132817c.isEmpty()) {
                            C52015hn hnVar2 = hlVar.f136512c;
                            if (hnVar2 == null) {
                                hnVar2 = C52015hn.f136515e;
                            }
                            if (!hnVar2.f136519c.isEmpty()) {
                                C52015hn hnVar3 = hlVar.f136512c;
                                if (hnVar3 == null) {
                                    hnVar3 = C52015hn.f136515e;
                                }
                                if (!hnVar3.f136518b.isEmpty()) {
                                    try {
                                        C52015hn hnVar4 = hlVar.f136512c;
                                        if (hnVar4 == null) {
                                            hnVar4 = C52015hn.f136515e;
                                        }
                                        int parseInt = Integer.parseInt(hnVar4.f136519c);
                                        C52015hn hnVar5 = hlVar.f136512c;
                                        String str2 = (hnVar5 == null ? C52015hn.f136515e : hnVar5).f136518b;
                                        boolean z = hlVar.f136513d;
                                        if (hnVar5 == null) {
                                            hnVar5 = C52015hn.f136515e;
                                        }
                                        C51012dc dcVar2 = hnVar5.f136520d;
                                        if (dcVar2 == null) {
                                            dcVar2 = C51012dc.f132813k;
                                        }
                                        String str3 = dcVar2.f132817c;
                                        C53229gd gdVar = (C53229gd) C53230ge.f139503j.createBuilder();
                                        String valueOf = String.valueOf(parseInt);
                                        gdVar.copyOnWrite();
                                        C53230ge geVar = (C53230ge) gdVar.instance;
                                        valueOf.getClass();
                                        geVar.f139505a |= 2;
                                        geVar.f139507c = valueOf;
                                        gdVar.copyOnWrite();
                                        C53230ge geVar2 = (C53230ge) gdVar.instance;
                                        str2.getClass();
                                        geVar2.f139505a |= 1;
                                        geVar2.f139506b = str2;
                                        gdVar.copyOnWrite();
                                        C53230ge geVar3 = (C53230ge) gdVar.instance;
                                        str3.getClass();
                                        geVar3.f139505a |= 64;
                                        geVar3.f139512h = str3;
                                        C53228gc gcVar = (C53228gc) C53245gt.f139564n.createBuilder();
                                        gcVar.copyOnWrite();
                                        C53245gt gtVar3 = (C53245gt) gcVar.instance;
                                        gtVar3.f139567a |= 32;
                                        gtVar3.f139574h = z;
                                        gcVar.mo53966b((C53230ge) gdVar.build());
                                        C53245gt gtVar4 = (C53245gt) gcVar.build();
                                        C83730ab abVar2 = (C83730ab) C83739ak.f228230q.createBuilder();
                                        C83737ai aiVar2 = (C83737ai) C83738aj.f228226c.createBuilder();
                                        aiVar2.copyOnWrite();
                                        C83738aj ajVar3 = (C83738aj) aiVar2.instance;
                                        gtVar4.getClass();
                                        ajVar3.f228229b = gtVar4;
                                        ajVar3.f228228a = 3;
                                        abVar2.copyOnWrite();
                                        C83739ak akVar3 = (C83739ak) abVar2.instance;
                                        C83738aj ajVar4 = (C83738aj) aiVar2.build();
                                        ajVar4.getClass();
                                        akVar3.f228233b = ajVar4;
                                        akVar3.f228232a |= 1;
                                        axVar = C58833ax.m90834k((C83739ak) abVar2.build());
                                    } catch (NumberFormatException unused) {
                                        C59104x d = C110898b.f308937a.mo56226d();
                                        d.mo56378ag(C58975e.f156826a, "WeatherDataAdapter");
                                        ((C59052c) ((C59052c) d).mo56372aa(26827)).mo56386p("Invalid temperature found in zerostate response");
                                        axVar = C58836b.f156633a;
                                    }
                                }
                            }
                        }
                    }
                    C59104x d2 = C110898b.f308937a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "WeatherDataAdapter");
                    ((C59052c) ((C59052c) d2).mo56372aa(26826)).mo56386p("Incomplete data for smartspace request");
                    axVar = C58836b.f156633a;
                } else {
                    axVar = C58836b.f156633a;
                }
            }
            if (!axVar.mo56113h()) {
                ((C58970a) ((C58970a) this.f308104g.mo56226d()).mo56372aa(26484)).mo56386p("Weather data could not be extracted from Zerostate response");
                C59104x d3 = f308097a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                ((C59052c) ((C59052c) d3).mo56372aa(26485)).mo56386p("Weather data could not be extracted from Zerostate response");
                return C118826c.f331423b;
            }
            C83738aj ajVar5 = ((C83739ak) axVar.mo56107c()).f228233b;
            if (ajVar5 == null) {
                ajVar5 = C83738aj.f228226c;
            }
            if (ajVar5.f228228a == 3) {
                gtVar = (C53245gt) ajVar5.f228229b;
            } else {
                gtVar = C53245gt.f139564n;
            }
            C53230ge geVar4 = (C53230ge) gtVar.f139569c.get(0);
            ((C58970a) ((C58970a) this.f308104g.mo56224b()).mo56372aa(26494)).mo56360M("weather data received from zerostate. Description: %s, temp: %s, useCelsius? %b, update time %d", geVar4.f139506b, geVar4.f139507c, Boolean.valueOf(gtVar.f139574h), Long.valueOf(this.f308112p.mo26870b()));
            if (!this.f308101d.f228394e.mo79746e(C90014bt.f247758nG)) {
                return this.f308111o.mo78853f(axVar.mo56107c());
            }
            C58833ax a = this.f308114r.mo77136a(C50794cr.WEATHER);
            if (a.mo56113h()) {
                return ((C83805u) a.mo56107c()).mo77190a((C83739ak) axVar.mo56107c());
            }
            C59104x d4 = f308097a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            ((C59052c) ((C59052c) d4).mo56372aa(26483)).mo56387q("controller for card type %d could not be found ", C50794cr.WEATHER.f132222T);
            return C118826c.f331423b;
        } else if (ordinal == 4) {
            C59104x b = f308097a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            ((C59052c) ((C59052c) b).mo56372aa(26472)).mo56386p("SmartspaceSyncManager#sendSmartspaceContentForFlightStatus");
            if (this.f308119w.mo78045s()) {
                C57014f fVar = iVar2.f152219n;
                if (fVar == null) {
                    fVar = C57014f.f152189c;
                }
                if ((fVar.f152191a & 1) != 0) {
                    C58485gu guVar3 = (C58485gu) DesugarArrays.stream((T[]) this.f308121y.mo79684r()).filter(new C110928u(iVar2)).collect(C58370cn.f155946a);
                    if (!guVar3.isEmpty()) {
                        String str4 = ((Account) guVar3.get(0)).name;
                        C124099by byVar = this.f308108k;
                        C60856cj.m92911t(C60922j.m93045h(byVar.f342759d.mo50248e(), C47810es.m84966f(new C124094bt(byVar, str4, nhVar2, iVar2)), C60826bg.f164896a), C47810es.m84974n(new C110510aa()), C60826bg.f164896a);
                        return C118826c.f331423b;
                    }
                }
                C60856cj.m92911t(C60922j.m93045h(this.f308118v.mo79697b(), C47810es.m84966f(new C110929v(this, nhVar2, iVar2)), C60826bg.f164896a), C47810es.m84974n(new C110511ab()), C60826bg.f164896a);
                return C118826c.f331423b;
            }
            C58480gp e = C58485gu.m89837e();
            if ((nhVar2.f140184a & 16) != 0) {
                C53370lj ljVar3 = nhVar2.f140188e;
                if (ljVar3 == null) {
                    ljVar3 = C53370lj.f140047c;
                }
                C58480gp e2 = C58485gu.m89837e();
                for (C53366lf lfVar3 : ljVar3.f140050b) {
                    if (lfVar3.f140037b == 4) {
                        nfVar4 = (C53420nf) lfVar3.f140038c;
                    } else {
                        nfVar4 = C53420nf.f140165o;
                    }
                    C53250gy gyVar3 = nfVar4.f140176j;
                    if (gyVar3 == null) {
                        gyVar3 = C53250gy.f139586c;
                    }
                    if (gyVar3.f139588a == 2) {
                        if (lfVar3.f140037b == 4) {
                            nfVar5 = (C53420nf) lfVar3.f140038c;
                        } else {
                            nfVar5 = C53420nf.f140165o;
                        }
                        C53250gy gyVar4 = nfVar5.f140176j;
                        if (gyVar4 == null) {
                            gyVar4 = C53250gy.f139586c;
                        }
                        if (gyVar4.f139588a == 2) {
                            esVar2 = (C53190es) gyVar4.f139589b;
                        } else {
                            esVar2 = C53190es.f139393s;
                        }
                        C83730ab abVar3 = (C83730ab) C83739ak.f228230q.createBuilder();
                        C83737ai aiVar3 = (C83737ai) C83738aj.f228226c.createBuilder();
                        aiVar3.copyOnWrite();
                        C83738aj ajVar6 = (C83738aj) aiVar3.instance;
                        esVar2.getClass();
                        ajVar6.f228229b = esVar2;
                        ajVar6.f228228a = 4;
                        C83738aj ajVar7 = (C83738aj) aiVar3.build();
                        abVar3.copyOnWrite();
                        C83739ak akVar4 = (C83739ak) abVar3.instance;
                        ajVar7.getClass();
                        akVar4.f228233b = ajVar7;
                        akVar4.f228232a |= 1;
                        if (lfVar3.f140037b == 4) {
                            nfVar6 = (C53420nf) lfVar3.f140038c;
                        } else {
                            nfVar6 = C53420nf.f140165o;
                        }
                        String str5 = nfVar6.f140175i;
                        abVar3.copyOnWrite();
                        C83739ak akVar5 = (C83739ak) abVar3.instance;
                        str5.getClass();
                        akVar5.f228232a |= 1024;
                        akVar5.f228242k = str5;
                        e2.mo55395g((C83739ak) abVar3.build());
                    }
                }
                guVar = e2.mo55394f();
            } else {
                guVar = e.mo55394f();
            }
            if (!guVar.isEmpty()) {
                m184109g(guVar, "zerostate");
            } else if (((C86124t) this.f308103f.mo27525b()).mo79746e(C89985ax.f246659M)) {
                C59071e eVar = f308097a;
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                ((C59052c) ((C59052c) b2).mo56372aa(26474)).mo56386p("fallback to use Sno flight status");
                C58485gu a2 = C83743a.m133332a(iVar);
                if (!a2.isEmpty()) {
                    m184109g(a2, "sno");
                    guVar = a2;
                } else {
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                    ((C59052c) ((C59052c) b3).mo56372aa(26475)).mo56386p("No valid flight status found.");
                    this.f308106i.mo109871G("NO_VALID_FLIGHT_STATUS_FOUND");
                    return C118826c.f331423b;
                }
            } else {
                C59104x b4 = f308097a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                ((C59052c) ((C59052c) b4).mo56372aa(26473)).mo56386p("No valid flight status found.");
                this.f308106i.mo109871G("NO_VALID_FLIGHT_STATUS_FOUND");
                return C118826c.f331423b;
            }
            C83743a aVar = this.f308102e;
            aVar.f228269f.edit().putLong("proactive_smartspace_last_sync_timestamp", aVar.f228268e.mo26870b()).apply();
            C58833ax a3 = this.f308114r.mo77136a(C50794cr.FLIGHT);
            ArrayList arrayList = new ArrayList();
            long b5 = this.f308112p.mo26870b();
            int size = guVar.size();
            int i3 = 0;
            long j2 = Long.MAX_VALUE;
            while (i3 < size) {
                C83739ak akVar6 = (C83739ak) guVar.get(i3);
                C83738aj ajVar8 = akVar6.f228233b;
                if (ajVar8 == null) {
                    ajVar8 = C83738aj.f228226c;
                }
                if (ajVar8.f228228a == i2) {
                    esVar = (C53190es) ajVar8.f228229b;
                } else {
                    esVar = C53190es.f139393s;
                }
                if (((C86124t) this.f308103f.mo27525b()).mo79746e(C89985ax.f246734q)) {
                    optional = C83743a.m133333b(C110692g.m184395g(esVar));
                    guVar2 = guVar;
                    i = size;
                } else {
                    C53187ep epVar = esVar.f139401f;
                    if (epVar == null) {
                        epVar = C53187ep.f139383h;
                    }
                    Calendar instance = Calendar.getInstance();
                    TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
                    guVar2 = guVar;
                    timeZone.setRawOffset(epVar.f139390f * 60000);
                    C58072d dVar = epVar.f139389e;
                    if (dVar == null) {
                        dVar = C58072d.f155218d;
                    }
                    i = size;
                    instance.set(1, dVar.f155220a);
                    C58072d dVar2 = epVar.f139389e;
                    if (dVar2 == null) {
                        dVar2 = C58072d.f155218d;
                    }
                    instance.set(2, dVar2.f155221b - 1);
                    C58072d dVar3 = epVar.f139389e;
                    if (dVar3 == null) {
                        dVar3 = C58072d.f155218d;
                    }
                    instance.set(5, dVar3.f155222c);
                    C58081m mVar = epVar.f139388d;
                    if (mVar == null) {
                        mVar = C58081m.f155254e;
                    }
                    instance.set(11, mVar.f155256a);
                    C58081m mVar2 = epVar.f139388d;
                    if (mVar2 == null) {
                        mVar2 = C58081m.f155254e;
                    }
                    instance.set(12, mVar2.f155257b);
                    C58081m mVar3 = epVar.f139388d;
                    if (mVar3 == null) {
                        mVar3 = C58081m.f155254e;
                    }
                    instance.set(13, mVar3.f155258c);
                    instance.set(14, 0);
                    instance.setTimeZone(timeZone);
                    optional = Optional.m71637of(Long.valueOf(instance.getTimeInMillis()));
                }
                if (optional.isPresent()) {
                    long longValue = ((Long) optional.get()).longValue();
                    if (b5 <= longValue + C131179d.f358768d && longValue < j2) {
                        j2 = longValue;
                    }
                }
                C110692g gVar = this.f308117u;
                if (iVar2.equals(C57017i.f152204o)) {
                    ((C58970a) ((C58970a) gVar.f308444g.mo56224b()).mo56372aa(26676)).mo56386p("Skip the latency logging because the flight update is not triggered by push message.");
                } else {
                    String str6 = esVar.f139412q;
                    String str7 = esVar.f139411p;
                    if (iVar2.f152207b == 19) {
                        C64423n nVar = ((C64429t) iVar2.f152208c).f174762b;
                        if (nVar == null) {
                            nVar = C64423n.f174740m;
                        }
                        int i4 = nVar.f174742a;
                        if (!((i4 & C89885b.HTTP_VALUE) == 0 || (i4 & 524288) == 0)) {
                            str6 = nVar.f174752k;
                            int b6 = C64400d.m96400b(nVar.f174753l);
                            if (b6 == 0) {
                                b6 = 1;
                            }
                            str7 = C64400d.m96399a(b6);
                        }
                    }
                    if (str6.isEmpty()) {
                        ((C58970a) ((C58970a) gVar.f308444g.mo56226d()).mo56372aa(26675)).mo56386p("flight_status_update_creation_time is empty.");
                    } else if (str7.isEmpty()) {
                        ((C58970a) ((C58970a) gVar.f308444g.mo56226d()).mo56372aa(26674)).mo56386p("flight_status_data_source is empty.");
                    } else {
                        Optional b7 = C83743a.m133333b(str6);
                        if (!b7.isPresent()) {
                            ((C58970a) ((C58970a) gVar.f308444g.mo56226d()).mo56372aa(26673)).mo56389s("Unable to convert updateCreationTime to millis: %s.", str6);
                        } else {
                            long b8 = gVar.f308441d.mo26870b() - ((Long) b7.get()).longValue();
                            if (b8 < 0) {
                                ((C58970a) ((C58970a) gVar.f308444g.mo56226d()).mo56372aa(26672)).mo56388r("latency is negative: %d", b8);
                            } else {
                                gVar.f308440c.mo109893aB(b8, str7);
                            }
                        }
                    }
                }
                if (!this.f308101d.f228394e.mo79746e(C90014bt.f247757nF) || !a3.mo56113h()) {
                    arrayList.add(this.f308111o.mo78853f(akVar6));
                } else {
                    arrayList.add(((C83805u) a3.mo56107c()).mo77190a(akVar6));
                }
                i3++;
                guVar = guVar2;
                size = i;
                i2 = 4;
            }
            if (j2 != Long.MAX_VALUE && b5 <= C131179d.f358768d + j2) {
                if (b5 < j2 - C131179d.f358766b) {
                    C59104x b9 = f308097a.mo56224b();
                    b9.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                    ((C59052c) ((C59052c) b9).mo56372aa(26478)).mo56386p("departureTime is more than 4h away.");
                    j = j2 - C131179d.f358766b;
                } else {
                    j = this.f308101d.mo77180s() ? C83743a.f228263a + b5 : 0;
                }
                C59104x b10 = f308097a.mo56224b();
                b10.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                ((C59052c) ((C59052c) b10).mo56372aa(26477)).mo56388r("Update flightRefreshTime: %d", j);
                if (j > 0) {
                    this.f308113q.mo103752c(C118522by.OPA_SMARTSPACE_FLIGHTS_REFRESH);
                    long b11 = this.f308112p.mo26870b();
                    C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                    afVar.copyOnWrite();
                    C118472ag agVar = (C118472ag) afVar.instance;
                    agVar.f328821a |= 1;
                    agVar.f328822b = j - b11;
                    long j3 = f308098l;
                    afVar.copyOnWrite();
                    C118472ag agVar2 = (C118472ag) afVar.instance;
                    agVar2.f328821a |= 2;
                    agVar2.f328823c = j3;
                    afVar.copyOnWrite();
                    C118472ag agVar3 = (C118472ag) afVar.instance;
                    agVar3.f328824d = 1;
                    agVar3.f328821a |= 4;
                    this.f308113q.mo103754e(C118522by.OPA_SMARTSPACE_FLIGHTS_REFRESH, (C118472ag) afVar.build());
                }
            }
            if (j2 != Long.MAX_VALUE) {
                long max = Math.max(0, (j2 + C131179d.f358768d) - b5);
                this.f308113q.mo103752c(C118522by.OPA_SMARTSPACE_FLIGHTS_CHIP_REMOVAL);
                C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
                afVar2.copyOnWrite();
                C118472ag agVar4 = (C118472ag) afVar2.instance;
                agVar4.f328821a |= 1;
                agVar4.f328822b = max;
                long j4 = f308098l;
                afVar2.copyOnWrite();
                C118472ag agVar5 = (C118472ag) afVar2.instance;
                agVar5.f328821a |= 2;
                agVar5.f328823c = j4;
                afVar2.copyOnWrite();
                C118472ag agVar6 = (C118472ag) afVar2.instance;
                agVar6.f328824d = 1;
                agVar6.f328821a |= 4;
                this.f308113q.mo103754e(C118522by.OPA_SMARTSPACE_FLIGHTS_CHIP_REMOVAL, (C118472ag) afVar2.build());
            }
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C59104x b12 = f308097a.mo56224b();
                b12.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                ((C59052c) ((C59052c) b12).mo56372aa(26476)).mo56389s("future: %s", (C60870cx) arrayList.get(i5));
            }
            return arrayList.isEmpty() ? C118826c.f331423b : C118826c.m197212b(arrayList);
        } else if (ordinal == 6) {
            return m184108f(nhVar);
        } else {
            if (ordinal != 12) {
                return C118826c.f331423b;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            C58485gu b13 = this.f308116t.mo98847b(nhVar2);
            C59071e eVar2 = f308097a;
            C59104x b14 = eVar2.mo56224b();
            b14.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            ((C59052c) ((C59052c) b14).mo56372aa(26480)).mo56387q("# of valid EventOccurrence: %d", b13.size());
            if (b13.isEmpty()) {
                C59104x b15 = eVar2.mo56224b();
                b15.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                ((C59052c) ((C59052c) b15).mo56372aa(26481)).mo56386p("Unable to fetch any valid EventOccurrence with the WHEN_IS partial sync. Abort!");
                return C118826c.f331423b;
            }
            this.f308106i.mo109939l(true);
            int size3 = b13.size();
            for (int i6 = 0; i6 < size3; i6++) {
                C53175ed edVar = (C53175ed) b13.get(i6);
                if ((edVar.f139359a & 1) != 0 && !"/m/debug".equals(edVar.f139360b)) {
                    this.f308106i.mo109940m(edVar.f139360b);
                }
            }
            this.f308116t.mo98848c(b13);
            return C118826c.f331423b;
        }
    }

    /* renamed from: c */
    public final C60870cx mo98750c(C53121cd cdVar) {
        return mo98751d(cdVar, false, C57017i.f152204o);
    }

    /* renamed from: d */
    public final C60870cx mo98751d(C53121cd cdVar, boolean z, C57017i iVar) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        this.f308106i.mo109911ai(z, C83794j.m133428E(this.f308120x));
        if (C83794j.f228391d.contains(C83794j.m133430e(cdVar)) || !this.f308101d.mo77174l()) {
            cxVar = C60856cj.m92900i(Optional.m71637of(true));
        } else {
            cxVar = this.f308115s.c();
        }
        return this.f308110n.mo28210j(cxVar, "PrBitValidity", new C110932y(this, cdVar, z, iVar));
    }

    /* renamed from: e */
    public final void mo98752e(C53121cd cdVar) {
        C53121cd cdVar2 = C53121cd.UNKNOWN;
        int ordinal = cdVar.ordinal();
        if (ordinal == 4) {
            this.f308106i.mo109871G("NO_VALID_FLIGHT_STATUS_FOUND");
        } else if (ordinal == 12) {
            this.f308106i.mo109939l(false);
        }
    }
}
