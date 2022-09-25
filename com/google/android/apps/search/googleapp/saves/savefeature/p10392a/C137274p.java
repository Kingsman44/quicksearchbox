package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.saves.p10387a.C137188d;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10393a.C137238e;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137254l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57571ao;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57572ap;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57600bq;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57601br;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57604bu;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57605bv;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57646g;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57647h;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57651l;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57653n;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import java.util.concurrent.Executor;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.p */
/* compiled from: PG */
public final class C137274p {

    /* renamed from: a */
    public static final C59071e f373449a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.savefeature.a.p");

    /* renamed from: b */
    public static final C57572ap f373450b;

    /* renamed from: c */
    public final long f373451c;

    /* renamed from: d */
    public final C57604bu f373452d;

    /* renamed from: e */
    public final C137238e f373453e;

    /* renamed from: f */
    public final C137230y f373454f;

    /* renamed from: g */
    public final C137188d f373455g;

    /* renamed from: h */
    public final C46778cv f373456h;

    /* renamed from: i */
    public final C21370a f373457i;

    /* renamed from: j */
    public final Executor f373458j;

    /* renamed from: k */
    private final String f373459k;

    static {
        C57571ao aoVar = (C57571ao) C57572ap.f153806b.createBuilder();
        aoVar.mo54519a(3);
        aoVar.mo54519a(4);
        f373450b = (C57572ap) aoVar.build();
    }

    public C137274p(long j, String str, C57604bu buVar, C137238e eVar, C137230y yVar, C137188d dVar, C46778cv cvVar, C21370a aVar, Executor executor) {
        this.f373451c = j;
        this.f373459k = str;
        this.f373452d = buVar;
        this.f373453e = eVar;
        this.f373454f = yVar;
        this.f373455g = dVar;
        this.f373456h = cvVar;
        this.f373457i = aVar;
        this.f373458j = executor;
    }

    /* renamed from: c */
    public static C57601br m223026c(C57648i iVar) {
        C57600bq bqVar = (C57600bq) C57601br.f153881b.createBuilder();
        bqVar.copyOnWrite();
        iVar.getClass();
        ((C57601br) bqVar.instance).f153883a = iVar;
        return (C57601br) bqVar.build();
    }

    /* renamed from: d */
    private final C57648i m223027d(C137254l lVar) {
        C57648i iVar = lVar.f373413e;
        return iVar != null ? iVar : mo113603b();
    }

    /* renamed from: a */
    public final C60870cx mo113602a(C137254l lVar) {
        C60870cx cxVar;
        C57578av avVar;
        C57648i d = m223027d(lVar);
        C57569am amVar = lVar.f373411c;
        if (amVar == null) {
            amVar = C57569am.f153797f;
        }
        C57663x xVar = amVar.f153801c;
        if (xVar == null) {
            xVar = C57663x.f153984d;
        }
        C57665z a = C57665z.m88512a(xVar.f153988c);
        if (a == null) {
            a = C57665z.UNRECOGNIZED;
        }
        int i = lVar.f373409a;
        int i2 = i != 0 ? i != 5 ? i != 2 ? i != 3 ? 0 : 3 : 2 : 1 : 4;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                cxVar = C60922j.m93044g(this.f373455g.mo113590a(), C47810es.m84963c(new C137242c(a, lVar)), this.f373458j);
            } else if (i3 == 1) {
                if (i == 2) {
                    avVar = (C57578av) lVar.f373410b;
                } else {
                    avVar = C57578av.f153822h;
                }
                cxVar = C60856cj.m92900i(avVar);
            } else if (i3 != 2) {
                cxVar = C60856cj.m92899h(new IllegalArgumentException("Attempted to save an item, but no list was provided."));
            } else {
                String str = i == 3 ? (String) lVar.f373410b : BuildConfig.FLAVOR;
                C57648i d2 = m223027d(lVar);
                C57651l lVar2 = (C57651l) C57653n.f153960d.createBuilder();
                C57601br c = m223026c(d2);
                lVar2.copyOnWrite();
                c.getClass();
                ((C57653n) lVar2.instance).f153962a = c;
                lVar2.copyOnWrite();
                str.getClass();
                ((C57653n) lVar2.instance).f153963b = str;
                C57653n nVar = (C57653n) lVar2.build();
                C57604bu buVar = this.f373452d;
                C70888j jVar = buVar.f189039a;
                C70338di diVar = C57605bv.f153885b;
                if (diVar == null) {
                    synchronized (C57605bv.class) {
                        diVar = C57605bv.f153885b;
                        if (diVar == null) {
                            C70335df d3 = C70338di.m102603d();
                            d3.f187487c = C70337dh.UNARY;
                            d3.f187488d = C70338di.m102602c("google.search.platform.save.v2.SaveService", "CreateList");
                            d3.f187489e = true;
                            d3.f187485a = C70850d.m103697c(C57653n.f153960d);
                            d3.f187486b = C70850d.m103697c(C57578av.f153822h);
                            C70338di a2 = d3.mo62040a();
                            C57605bv.f153885b = a2;
                            diVar = a2;
                        }
                    }
                }
                cxVar = C60922j.m93045h(C70876o.m103760a(jVar.mo39510a(diVar, buVar.f189040b), nVar), C47810es.m84966f(new C137269k(this)), this.f373458j);
            }
            return C60922j.m93045h(cxVar, C47810es.m84966f(new C137265g(this, lVar, d)), this.f373458j);
        }
        throw null;
    }

    /* renamed from: b */
    public final C57648i mo113603b() {
        C57646g gVar = (C57646g) C57648i.f153953c.createBuilder();
        gVar.copyOnWrite();
        ((C57648i) gVar.instance).f153955a = C57647h.m88510a(77);
        String str = this.f373459k;
        gVar.copyOnWrite();
        str.getClass();
        ((C57648i) gVar.instance).f153956b = str;
        return (C57648i) gVar.build();
    }
}
