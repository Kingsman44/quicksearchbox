package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128155c;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128158f;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128161i;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128162j;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c.C128164l;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128174f;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128185q;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128189u;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128191w;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9685f.C128216a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58390dg;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70153aq;
import p5488io.grpc.p5533i.C70862aj;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71036ci;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71037cj;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71038ck;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71040cm;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71043cp;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71044cq;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.v */
/* compiled from: PG */
public final class C128148v extends C128185q {

    /* renamed from: a */
    public static final C59071e f352539a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.v");

    /* renamed from: b */
    public final Map f352540b;

    /* renamed from: c */
    public final C128164l f352541c;

    /* renamed from: d */
    public final C37215b f352542d;

    /* renamed from: e */
    public final KeyguardManager f352543e;

    /* renamed from: f */
    private final Duration f352544f;

    /* renamed from: g */
    private final Duration f352545g;

    /* renamed from: h */
    private final Duration f352546h;

    /* renamed from: i */
    private final C60950i f352547i;

    /* renamed from: j */
    private final C60888db f352548j;

    public C128148v(long j, long j2, long j3, Context context, Map map, C128164l lVar, C37215b bVar, C60950i iVar, C60888db dbVar) {
        this.f352544f = Duration.ofMillis(j);
        this.f352545g = Duration.ofMillis(j2);
        this.f352546h = Duration.ofMillis(j3);
        this.f352540b = map;
        this.f352541c = lVar;
        this.f352542d = bVar;
        this.f352547i = iVar;
        this.f352548j = dbVar;
        this.f352543e = (KeyguardManager) Objects.requireNonNull((KeyguardManager) context.getSystemService(KeyguardManager.class));
    }

    /* renamed from: b */
    public final void mo108345b(C128174f fVar, C70862aj ajVar) {
        Duration duration;
        C128174f fVar2 = fVar;
        Optional ofNullable = Optional.ofNullable(C70148al.m102135m().mo61697b());
        int i = 4;
        Optional ofNullable2 = Optional.ofNullable((fVar2.f352600a & 4) != 0 ? Duration.between(Instant.ofEpochMilli(fVar2.f352603d), this.f352547i.mo57444a()) : null);
        if (ofNullable.isEmpty()) {
            duration = this.f352544f;
        } else {
            duration = (Duration) C58390dg.m89476a(Duration.ofMillis(((C70153aq) ofNullable.get()).mo61720b(TimeUnit.MILLISECONDS)).minus(this.f352546h), this.f352545g);
            C58976aa aaVar = C58975e.f156826a;
            duration.toMillis();
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C123733b bVar = fVar2.f352602c;
        if (bVar == null) {
            bVar = C123733b.f341776d;
        }
        bVar.f341781c.size();
        C123733b bVar2 = fVar2.f352602c;
        if (bVar2 == null) {
            bVar2 = C123733b.f341776d;
        }
        C123791t tVar = bVar2.f341780b;
        if (tVar == null) {
            tVar = C123791t.f341978d;
        }
        boolean z = tVar.f341982c;
        C123733b bVar3 = fVar2.f352602c;
        if (bVar3 == null) {
            bVar3 = C123733b.f341776d;
        }
        C123791t tVar2 = bVar3.f341780b;
        if (tVar2 == null) {
            tVar2 = C123791t.f341978d;
        }
        String str = tVar2.f341981b;
        ofNullable.map(C128147u.f352538a).orElse("none");
        ofNullable2.map(C128129c.f352510a).orElse("unknown");
        C71038ck ckVar = (C71038ck) C71040cm.f189458d.createBuilder();
        C123733b bVar4 = fVar2.f352602c;
        if (bVar4 == null) {
            bVar4 = C123733b.f341776d;
        }
        C123791t tVar3 = bVar4.f341780b;
        if (tVar3 == null) {
            tVar3 = C123791t.f341978d;
        }
        if (!this.f352543e.isKeyguardLocked()) {
            i = tVar3.f341982c ? 3 : !tVar3.f341981b.isEmpty() ? 2 : 1;
        }
        ckVar.copyOnWrite();
        C71040cm cmVar = (C71040cm) ckVar.instance;
        cmVar.f189461b = i - 1;
        cmVar.f189460a |= 1;
        Optional map = ofNullable2.map(C128130d.f352511a);
        Objects.requireNonNull(ckVar);
        map.ifPresent(new C128131e(ckVar));
        C37215b bVar5 = this.f352542d;
        C37258g gVar = C37176a.f96906bX;
        C62940bt btVar = C71044cq.f189470e;
        C71043cp cpVar = (C71043cp) C71044cq.f189469d.createBuilder();
        cpVar.copyOnWrite();
        C71044cq cqVar = (C71044cq) cpVar.instance;
        C71040cm cmVar2 = (C71040cm) ckVar.build();
        cmVar2.getClass();
        cqVar.f189473b = cmVar2;
        cqVar.f189472a |= 1;
        bVar5.mo19974a(gVar.mo40812e(btVar, (C71044cq) cpVar.build()));
        C128164l lVar = this.f352541c;
        C60870cx d = lVar.f352578g.mo46042d();
        C60870cx d2 = lVar.f352577f.mo46042d();
        C128158f fVar3 = lVar.f352579h;
        C60870cx h = C60922j.m93045h(C47638k.m84753d(d, d2).mo51520a(new C128161i(d, d2), C60826bg.f164896a), C47810es.m84966f(new C128155c(fVar3)), fVar3.f352563c);
        ArrayList arrayList = new ArrayList();
        for (C128189u uVar : C128189u.values()) {
            if (this.f352540b.containsKey(uVar)) {
                C37215b bVar6 = this.f352542d;
                C37252a j = C37176a.f97032dr.mo40816j("source", uVar.name());
                C62940bt btVar2 = C71044cq.f189470e;
                C71043cp cpVar2 = (C71043cp) C71044cq.f189469d.createBuilder();
                C71036ci ciVar = (C71036ci) C71037cj.f189453c.createBuilder();
                ciVar.copyOnWrite();
                C71037cj cjVar = (C71037cj) ciVar.instance;
                cjVar.f189456b = uVar.f352647f;
                cjVar.f189455a |= 1;
                cpVar2.copyOnWrite();
                C71044cq cqVar2 = (C71044cq) cpVar2.instance;
                C71037cj cjVar2 = (C71037cj) ciVar.build();
                cjVar2.getClass();
                cqVar2.f189474c = cjVar2;
                cqVar2.f189472a |= 2;
                ((C37253b) j).mo40792p(btVar2, (C71044cq) cpVar2.build());
                bVar6.mo19974a(j);
                C60870cx g = C60922j.m93044g(C60856cj.m92908q(C60856cj.m92905n(C47810es.m84965e(new C128132f(this, uVar, fVar2)), this.f352548j), duration.toMillis(), TimeUnit.MILLISECONDS, this.f352548j), C47810es.m84963c(new C128133g()), this.f352548j);
                C60856cj.m92911t(g, C47810es.m84974n(new C128216a(new C128134h(this, uVar), new C128135i(this, uVar, duration))), this.f352548j);
                arrayList.add(g);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(h);
        arrayList2.addAll(arrayList);
        C60856cj.m92911t(C47638k.m84750a(arrayList2).mo51520a(new C128136j(this, ajVar, fVar, h, arrayList), this.f352548j), C47810es.m84974n(new C128216a(C128137k.f352526a, new C128128b(this, ajVar))), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo108346c(C128191w wVar, C70862aj ajVar) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        C62971cq cqVar = wVar.f352651b;
        C128164l lVar = this.f352541c;
        C128182n nVar = wVar.f352652c;
        if (nVar == null) {
            nVar = C128182n.f352629e;
        }
        if (cqVar.isEmpty()) {
            cxVar = C60866ct.f164955a;
        } else if (C128182n.f352629e.equals(nVar)) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = lVar.f352577f.mo46039a(new C128162j(lVar, cqVar, nVar), lVar.f352581j);
        }
        C128216a aVar = new C128216a(new C128138l(ajVar), new C128139m(ajVar));
        C60856cj.m92911t(cxVar, C47810es.m84974n(aVar), C60826bg.f164896a);
    }
}
