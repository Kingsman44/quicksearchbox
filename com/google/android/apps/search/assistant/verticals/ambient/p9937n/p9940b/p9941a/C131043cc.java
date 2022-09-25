package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C130985a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131073c;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131074d;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131075e;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131076f;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131088k;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131089l;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131090m;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131091a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.p3887a.C50665a;
import com.google.assistant.p3886c.p3887a.C50666b;
import com.google.assistant.p3886c.p3887a.C50668d;
import com.google.assistant.p3886c.p3887a.C50671g;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.assistant.p3886c.p3887a.C50680p;
import com.google.assistant.p3886c.p3887a.C50682r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.cc */
/* compiled from: PG */
public final class C131043cc implements C131075e {

    /* renamed from: a */
    public static final Duration f358455a = Duration.ofMinutes(5);

    /* renamed from: b */
    public final C58974d f358456b;

    /* renamed from: c */
    public final C130992af f358457c;

    /* renamed from: d */
    private final ExecutorService f358458d;

    /* renamed from: e */
    private final C130985a f358459e;

    /* renamed from: f */
    private final C131091a f358460f;

    /* renamed from: g */
    private final C131076f f358461g;

    public C131043cc(C130992af afVar, ExecutorService executorService, C130985a aVar, C130603a aVar2, C131091a aVar3, C131076f fVar) {
        this.f358457c = afVar;
        this.f358458d = executorService;
        this.f358459e = aVar;
        this.f358460f = aVar3;
        this.f358456b = aVar2.mo109740b(this);
        this.f358461g = fVar;
    }

    /* renamed from: c */
    public static double m213550c(C50668d dVar, long j) {
        if (j <= 0) {
            return C59203do.f157270a;
        }
        double d = (double) j;
        double d2 = (double) (dVar.f131803b + dVar.f131804c);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d2);
        return d2 / (d + d);
    }

    /* renamed from: d */
    public static C50666b m213551d(List list) {
        C58485gu guVar = (C58485gu) Collection.EL.stream(((HashMap) Collection.EL.stream(list).flatMap(C131020bg.f358420a).collect(Collectors.groupingBy(C131021bh.f358421a, C131038by.f358448a, C58370cn.f155946a))).values()).map(C131022bi.f358422a).collect(C58370cn.f155946a);
        if (list.isEmpty()) {
            return C50666b.f131787l;
        }
        C50665a aVar = (C50665a) ((C50666b) list.get(0)).toBuilder();
        aVar.copyOnWrite();
        ((C50666b) aVar.instance).f131799k = C50666b.emptyProtobufList();
        aVar.mo53418a(guVar);
        return (C50666b) aVar.build();
    }

    /* renamed from: e */
    public static C50668d m213552e(C58485gu guVar, Optional optional, Optional optional2) {
        return (C50668d) Collection.EL.stream(guVar).map(C131029bp.f358438a).flatMap(C131015bb.f358414a).filter(new C131030bq(optional, optional2)).map(C131019bf.f358419a).reduce(C131009aw.f358408a).orElseGet(C131031br.f358441a);
    }

    /* renamed from: f */
    public static C50672h m213553f(C131088k kVar) {
        C50682r a = kVar.mo110058a();
        C50671g gVar = (C50671g) C50672h.f131816d.createBuilder();
        C106531e a2 = C106531e.m177306a(a.f131856b);
        if (a2 == null) {
            a2 = C106531e.UNKNOWN;
        }
        gVar.copyOnWrite();
        C50672h hVar = (C50672h) gVar.instance;
        hVar.f131819b = a2.f297077e;
        hVar.f131818a |= 1;
        if ((a.f131855a & 8) != 0) {
            String str = a.f131859e;
            gVar.copyOnWrite();
            C50672h hVar2 = (C50672h) gVar.instance;
            str.getClass();
            hVar2.f131818a |= 2;
            hVar2.f131820c = str;
        }
        return (C50672h) gVar.build();
    }

    /* renamed from: g */
    public static C58485gu m213554g(C58485gu guVar) {
        return (C58485gu) Collection.EL.stream(((HashMap) Collection.EL.stream(guVar).filter(C131002ap.f358400a).map(C131003aq.f358401a).collect(Collectors.groupingBy(C131005as.f358403a, C131038by.f358448a, C58370cn.f155946a))).values()).map(C131006at.f358404a).collect(C58370cn.f155946a);
    }

    /* renamed from: h */
    private static C50680p m213555h(C58485gu guVar, Optional optional, Optional optional2) {
        return (C50680p) Collection.EL.stream(guVar).map(C131014ba.f358413a).flatMap(C131015bb.f358414a).filter(new C131017bd(optional, optional2)).map(C130999am.f358397a).reduce(C131018be.f358418a).orElseGet(C131001ao.f358399a);
    }

    /* renamed from: a */
    public final C60870cx mo110027a(Instant instant, C58485gu guVar) {
        if (instant.equals(Instant.EPOCH)) {
            C131051f fVar = (C131051f) this.f358459e;
            if (fVar.f358481e.mo110020a().isEmpty()) {
                instant = Instant.EPOCH;
            } else {
                UsageEvents queryEvents = ((UsageStatsManager) fVar.f358481e.mo110020a().get()).queryEvents(Instant.EPOCH.toEpochMilli(), fVar.f358479c.mo57444a().toEpochMilli());
                long j = Long.MAX_VALUE;
                while (queryEvents.hasNextEvent()) {
                    UsageEvents.Event event = new UsageEvents.Event();
                    queryEvents.getNextEvent(event);
                    if (event.getTimeStamp() < j) {
                        j = event.getTimeStamp();
                    }
                }
                if (j == Long.MAX_VALUE) {
                    instant = Instant.EPOCH;
                } else {
                    instant = Instant.ofEpochMilli(j);
                }
            }
        }
        C131051f fVar2 = (C131051f) this.f358459e;
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(new C130986a(fVar2, instant, guVar)), fVar2.f358480d);
        C47633f h = C47633f.m84733g(this.f358460f.mo95547a()).mo51515h(C131026bm.f358432a, this.f358458d);
        return C47638k.m84753d(m, h).mo51520a(new C131028bo(this, m, h, instant), this.f358458d);
    }

    /* renamed from: b */
    public final C60870cx mo110028b(C58485gu guVar, C50672h hVar, C131074d dVar) {
        C50680p pVar;
        C131073c cVar = (C131073c) dVar;
        if (cVar.f358527a.booleanValue()) {
            boolean z = cVar.f358528b.booleanValue() && Collection.EL.stream(guVar).noneMatch(C131023bj.f358423a);
            C50680p h = m213555h(guVar, Optional.empty(), Optional.empty());
            if ((hVar.f131818a & 1) != 0) {
                C106531e a = C106531e.m177306a(hVar.f131819b);
                if (a == null) {
                    a = C106531e.UNKNOWN;
                }
                pVar = m213555h(guVar, Optional.m71637of(a), Optional.empty());
            } else {
                pVar = C50680p.f131848d;
            }
            return C47633f.m84733g(this.f358461g.mo95544a()).mo51515h(new C131025bl(this, (C58485gu) Collection.EL.stream(guVar).filter(C131024bk.f358424a).collect(C58370cn.f155946a), z, hVar, h, pVar, dVar), this.f358458d);
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream((List) Collection.EL.stream(guVar).filter(C130993ag.f358384a).filter(C131004ar.f358402a).max(Comparator.CC.comparing(C131016bc.f358415a)).map(C131027bn.f358433a).orElse(C58485gu.m89845m())).map(C131036bw.f358446a).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) this.f358456b.mo56224b()).mo56372aa(39025)).mo56387q("Returning suggestions V0. count: %d.", guVar2.size());
        C131089l c = C131090m.m213618c();
        c.mo110065c(guVar2);
        return C60856cj.m92900i(c.mo110063a());
    }
}
