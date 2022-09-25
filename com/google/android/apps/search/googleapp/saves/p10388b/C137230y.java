package com.google.android.apps.search.googleapp.saves.p10388b;

import com.google.android.apps.search.googleapp.saves.p10388b.p10389a.C137198e;
import com.google.android.apps.search.googleapp.saves.p10388b.p10389a.C137200g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57600bq;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57601br;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57604bu;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57605bv;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57608by;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57612cb;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57613cc;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57614cd;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57616cf;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57646g;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57647h;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C63033ey;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.function.BiConsumer;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.y */
/* compiled from: PG */
public final class C137230y {

    /* renamed from: a */
    public static final C59071e f373360a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.b.y");

    /* renamed from: b */
    public final C46407v f373361b;

    /* renamed from: c */
    public final C137200g f373362c;

    /* renamed from: d */
    public final Set f373363d;

    /* renamed from: e */
    public final Executor f373364e;

    /* renamed from: f */
    public final C46778cv f373365f;

    /* renamed from: g */
    public final C21370a f373366g;

    /* renamed from: h */
    private final boolean f373367h;

    /* renamed from: i */
    private final long f373368i;

    /* renamed from: j */
    private final String f373369j;

    /* renamed from: k */
    private final C57604bu f373370k;

    public C137230y(boolean z, long j, String str, C46407v vVar, C137200g gVar, C57604bu buVar, Set set, Executor executor, C46778cv cvVar, C21370a aVar) {
        this.f373367h = z;
        this.f373368i = j;
        this.f373369j = str;
        this.f373361b = vVar;
        this.f373362c = gVar;
        this.f373370k = buVar;
        this.f373363d = set;
        this.f373364e = executor;
        this.f373365f = cvVar;
        this.f373366g = aVar;
    }

    /* renamed from: g */
    public static void m223008g(C57643df dfVar, BiConsumer biConsumer) {
        String str = dfVar.f153947a;
        m223010i(str, str, biConsumer);
        m223010i(dfVar.f153949c, str, biConsumer);
        m223010i(dfVar.f153950d, str, biConsumer);
    }

    /* renamed from: h */
    private final C60870cx m223009h(List list, boolean z) {
        return C47638k.m84750a(list).mo51520a(new C137224s(this, list, z), C60826bg.f164896a);
    }

    /* renamed from: i */
    private static void m223010i(String str, String str2, BiConsumer biConsumer) {
        if (!C58837ba.m90859h(str) && !C58837ba.m90859h(str2)) {
            biConsumer.accept(str, str2);
        }
    }

    /* renamed from: a */
    public final C60870cx mo113593a(C57643df dfVar) {
        ArrayList arrayList = new ArrayList();
        m223008g(dfVar, new C137217l(this, arrayList));
        return m223009h(arrayList, true);
    }

    /* renamed from: b */
    public final C60870cx mo113594b(String str) {
        C60870cx e = mo113597e();
        C137214i iVar = new C137214i(this);
        C46459k.m82829b(C60922j.m93045h(e, C47810es.m84966f(iVar), this.f373364e), "Error syncing the Saved Pages Cache with the Save Service", new Object[0]);
        C60870cx e2 = this.f373361b.mo50345e(C63033ey.m95859a(str));
        C137220o oVar = C137220o.f373344a;
        return C60922j.m93044g(e2, C47810es.m84963c(oVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo113595c(String str) {
        C60870cx b = mo113594b(str);
        C137226u uVar = C137226u.f373354a;
        return C60922j.m93044g(b, C47810es.m84963c(uVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo113596d(String str, C57643df dfVar) {
        ArrayList arrayList = new ArrayList();
        m223010i(str, str, new C137215j(this, arrayList));
        m223008g(dfVar, new C137216k(this, arrayList));
        return m223009h(arrayList, false);
    }

    /* renamed from: e */
    public final C60870cx mo113597e() {
        if (!this.f373367h) {
            return C60856cj.m92900i(false);
        }
        C137200g gVar = this.f373362c;
        C60870cx d = gVar.f373313b.mo46042d();
        C137198e eVar = new C137198e(gVar);
        return C60922j.m93044g(d, C47810es.m84963c(eVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo113598f() {
        C57608by byVar = (C57608by) C57614cd.f153898e.createBuilder();
        C57600bq bqVar = (C57600bq) C57601br.f153881b.createBuilder();
        C57646g gVar = (C57646g) C57648i.f153953c.createBuilder();
        gVar.copyOnWrite();
        ((C57648i) gVar.instance).f153955a = C57647h.m88510a(77);
        String str = this.f373369j;
        gVar.copyOnWrite();
        str.getClass();
        ((C57648i) gVar.instance).f153956b = str;
        bqVar.copyOnWrite();
        C57648i iVar = (C57648i) gVar.build();
        iVar.getClass();
        ((C57601br) bqVar.instance).f153883a = iVar;
        C57601br brVar = (C57601br) bqVar.build();
        byVar.copyOnWrite();
        brVar.getClass();
        ((C57614cd) byVar.instance).f153902c = brVar;
        C57612cb cbVar = (C57612cb) C57613cc.f153895b.createBuilder();
        cbVar.mo54520a(C57665z.WEB_PAGE);
        byVar.copyOnWrite();
        C57614cd cdVar = (C57614cd) byVar.instance;
        C57613cc ccVar = (C57613cc) cbVar.build();
        ccVar.getClass();
        cdVar.f153901b = ccVar;
        cdVar.f153900a = 2;
        long j = this.f373368i;
        byVar.copyOnWrite();
        ((C57614cd) byVar.instance).f153903d = (int) j;
        C57614cd cdVar2 = (C57614cd) byVar.build();
        C57604bu buVar = this.f373370k;
        C70888j jVar = buVar.f189039a;
        C70338di diVar = C57605bv.f153889f;
        if (diVar == null) {
            synchronized (C57605bv.class) {
                diVar = C57605bv.f153889f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.search.platform.save.v2.SaveService", "SearchItems");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C57614cd.f153898e);
                    d.f187486b = C70850d.m103697c(C57616cf.f153905b);
                    diVar = d.mo62040a();
                    C57605bv.f153889f = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, buVar.f189040b), cdVar2);
        C137213h hVar = new C137213h(this);
        return C60922j.m93045h(a, C47810es.m84966f(hVar), this.f373364e);
    }
}
