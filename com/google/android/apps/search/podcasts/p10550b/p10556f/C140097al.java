package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97905bd;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97907bf;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97909bh;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97910bi;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97919i;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139988a;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C140002o;
import com.google.android.apps.search.podcasts.p10550b.p10554d.C140055e;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4082j.p4083a.C54363bp;
import com.google.p4017at.p4082j.p4083a.C54364bq;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54454s;
import com.google.p4017at.p4082j.p4083a.C54455t;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.f.al */
/* compiled from: PG */
public final class C140097al {

    /* renamed from: a */
    public static final C59071e f380721a = C59071e.m91332i("com.google.android.apps.search.podcasts.b.f.al");

    /* renamed from: b */
    public final Executor f380722b;

    /* renamed from: c */
    public final C140095aj f380723c;

    /* renamed from: d */
    public final C46423aj f380724d;

    /* renamed from: e */
    public final C140385d f380725e;

    /* renamed from: f */
    public final C46778cv f380726f;

    /* renamed from: g */
    public final C140085a f380727g;

    /* renamed from: h */
    public final C21370a f380728h;

    /* renamed from: i */
    public final Duration f380729i;

    /* renamed from: j */
    public Duration f380730j;

    /* renamed from: k */
    private final C140002o f380731k;

    public C140097al(Executor executor, C140962c cVar, C140385d dVar, C140055e eVar, C46778cv cvVar, C140002o oVar, C140085a aVar, C21370a aVar2, long j) {
        this.f380726f = cvVar;
        this.f380731k = oVar;
        this.f380727g = aVar;
        this.f380725e = dVar;
        this.f380722b = new C60904dr(executor);
        C140095aj ajVar = new C140095aj(eVar, cVar);
        this.f380723c = ajVar;
        Objects.requireNonNull(ajVar);
        this.f380724d = new C46423aj(new C140115r(ajVar), C60826bg.f164896a);
        this.f380729i = Duration.ofSeconds(j);
        this.f380728h = aVar2;
    }

    /* renamed from: a */
    public static C97908bg m227766a(C140088ac acVar) {
        C97905bd bdVar = (C97905bd) C97908bg.f273364e.createBuilder();
        bdVar.copyOnWrite();
        C97908bg bgVar = (C97908bg) bdVar.instance;
        bgVar.f273367b = 0;
        bgVar.f273366a |= 1;
        bdVar.mo90842a(acVar.mo115447e());
        return (C97908bg) bdVar.build();
    }

    /* renamed from: h */
    public static C54364bq m227767h(List list) {
        C54363bp bpVar = (C54363bp) C54364bq.f142808b.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C97920j jVar = (C97920j) it.next();
            C54454s sVar = (C54454s) C54455t.f142988c.createBuilder();
            String str = jVar.f273431d;
            sVar.copyOnWrite();
            str.getClass();
            ((C54455t) sVar.instance).f142991b = str;
            C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
            String str2 = jVar.f273430c;
            csVar.copyOnWrite();
            str2.getClass();
            ((C54394ct) csVar.instance).f142868a = str2;
            String str3 = jVar.f273429b;
            csVar.copyOnWrite();
            str3.getClass();
            ((C54394ct) csVar.instance).f142869b = str3;
            sVar.copyOnWrite();
            C54394ct ctVar = (C54394ct) csVar.build();
            ctVar.getClass();
            ((C54455t) sVar.instance).f142990a = ctVar;
            C54455t tVar = (C54455t) sVar.build();
            bpVar.copyOnWrite();
            C54364bq bqVar = (C54364bq) bpVar.instance;
            tVar.getClass();
            C62971cq cqVar = bqVar.f142810a;
            if (!cqVar.mo58948c()) {
                bqVar.f142810a = C62942bv.mutableCopy(cqVar);
            }
            bqVar.f142810a.add(tVar);
        }
        return (C54364bq) bpVar.build();
    }

    /* renamed from: i */
    public static List m227768i(C54364bq bqVar) {
        ArrayList arrayList = new ArrayList();
        for (C54455t tVar : bqVar.f142810a) {
            C97919i iVar = (C97919i) C97920j.f273426e.createBuilder();
            String str = tVar.f142991b;
            iVar.copyOnWrite();
            C97920j jVar = (C97920j) iVar.instance;
            str.getClass();
            jVar.f273428a |= 4;
            jVar.f273431d = str;
            C54394ct ctVar = tVar.f142990a;
            if (ctVar == null) {
                ctVar = C54394ct.f142866c;
            }
            String str2 = ctVar.f142869b;
            iVar.copyOnWrite();
            C97920j jVar2 = (C97920j) iVar.instance;
            str2.getClass();
            jVar2.f273428a |= 1;
            jVar2.f273429b = str2;
            C54394ct ctVar2 = tVar.f142990a;
            if (ctVar2 == null) {
                ctVar2 = C54394ct.f142866c;
            }
            String str3 = ctVar2.f142868a;
            iVar.copyOnWrite();
            C97920j jVar3 = (C97920j) iVar.instance;
            str3.getClass();
            jVar3.f273428a |= 2;
            jVar3.f273430c = str3;
            arrayList.add((C97920j) iVar.build());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C60870cx mo115459b(List list) {
        return C47633f.m84733g(this.f380731k.mo115381a(list, C139988a.SAME_DAY)).mo51516i(new C140113p(this), this.f380722b).mo51513e(Throwable.class, C140114q.f380752a, this.f380722b);
    }

    /* renamed from: c */
    public final C60870cx mo115460c() {
        return C47633f.m84733g(this.f380724d.mo50395b()).mo51516i(new C140120w(this), this.f380722b);
    }

    /* renamed from: d */
    public final C60870cx mo115461d(List list) {
        return mo115464g(new C140123z(this, list));
    }

    /* renamed from: e */
    public final C60870cx mo115462e(C97908bg bgVar) {
        return C47633f.m84733g(this.f380724d.mo50395b()).mo51516i(new C140116s(this, bgVar), this.f380722b);
    }

    /* renamed from: f */
    public final C60870cx mo115463f() {
        C60870cx cxVar;
        C97908bg a = this.f380727g.mo115438a();
        if (a == null) {
            C58976aa aaVar = C58975e.f156826a;
            C97909bh bhVar = (C97909bh) C97910bi.f273370e.createBuilder();
            bhVar.copyOnWrite();
            C97910bi biVar = (C97910bi) bhVar.instance;
            biVar.f273372a |= 2;
            biVar.f273375d = true;
            cxVar = C60856cj.m92900i((C97910bi) bhVar.build());
        } else {
            int a2 = C97907bf.m162188a(a.f273367b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 0) {
                cxVar = C47633f.m84733g(this.f380724d.mo50395b()).mo51516i(new C140121x(this, a), this.f380722b).mo51515h(C140122y.f380764a, this.f380722b);
            } else if (i != 1) {
                cxVar = C47633f.m84733g(this.f380724d.mo50395b()).mo51516i(new C140101d(this, a), this.f380722b).mo51515h(C140102e.f380736a, this.f380722b);
            } else {
                cxVar = C47633f.m84733g(this.f380724d.mo50395b()).mo51516i(new C140104g(this, a), this.f380722b).mo51515h(C140105h.f380740a, this.f380722b);
            }
        }
        return C47633f.m84733g(cxVar).mo51516i(new C140111n(this), this.f380722b).mo51516i(new C140117t(this), this.f380722b).mo51514f(Throwable.class, new C140118u(this, a), this.f380722b);
    }

    /* renamed from: g */
    public final C60870cx mo115464g(Function function) {
        C60870cx b = this.f380724d.mo50395b();
        Objects.requireNonNull(function);
        C140109l lVar = new C140109l(function);
        return C60922j.m93045h(b, C47810es.m84966f(lVar), this.f380722b);
    }

    /* renamed from: j */
    public final void mo115465j(C97908bg bgVar) {
        C46459k.m82829b(mo115462e(bgVar), "Failed to start syncing", new Object[0]);
    }
}
