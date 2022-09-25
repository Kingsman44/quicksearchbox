package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10010d;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131691a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131692b;
import com.google.android.libraries.assistant.contexttrigger.C17784j;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48906h;
import com.google.assistant.p3803ag.p3807b.p3808a.C48907i;
import com.google.assistant.p3803ag.p3807b.p3808a.C48908j;
import com.google.assistant.p3803ag.p3807b.p3808a.C48909k;
import com.google.assistant.p3803ag.p3807b.p3808a.C48910l;
import com.google.assistant.p3803ag.p3807b.p3808a.C48912n;
import com.google.assistant.p3803ag.p3807b.p3808a.C48913o;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48916r;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48935ai;
import com.google.assistant.p3803ag.p3809c.C48936aj;
import com.google.assistant.p3803ag.p3809c.C48938al;
import com.google.assistant.p3803ag.p3809c.C48939am;
import com.google.assistant.p3803ag.p3809c.C48948av;
import com.google.assistant.p3803ag.p3809c.C48950ax;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C49061f;
import com.google.assistant.p3803ag.p3809c.C49152v;
import com.google.assistant.p3803ag.p3809c.C49154x;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.d.c */
/* compiled from: PG */
public final class C131716c implements C131692b {

    /* renamed from: b */
    private static final C48919u f359835b;

    /* renamed from: c */
    private static final C48913o f359836c;

    /* renamed from: d */
    private static final C48952az f359837d;

    /* renamed from: e */
    private static final C48917s f359838e;

    /* renamed from: a */
    public final C58974d f359839a;

    /* renamed from: f */
    private final C17784j f359840f;

    /* renamed from: g */
    private final ScheduledExecutorService f359841g;

    /* renamed from: h */
    private final boolean f359842h;

    static {
        C48918t tVar = (C48918t) C48919u.f126586g.createBuilder();
        C69664n.m101060f(tVar, "newBuilder()");
        C69664n.m101061g(tVar, "builder");
        C48900b bVar = C48900b.AMBIENT_ASSISTANT;
        C69664n.m101061g(bVar, "value");
        tVar.copyOnWrite();
        C48919u uVar = (C48919u) tVar.instance;
        uVar.f126589b = bVar.f126548g;
        uVar.f126588a |= 1;
        tVar.copyOnWrite();
        C48919u uVar2 = (C48919u) tVar.instance;
        uVar2.f126588a |= 4;
        uVar2.f126591d = "AmbientHeadsetTriggerId";
        C39226b bVar2 = C39226b.TAG_ASSISTANT_AMBIENT;
        C69664n.m101061g(bVar2, "value");
        tVar.copyOnWrite();
        C48919u uVar3 = (C48919u) tVar.instance;
        uVar3.f126592e = bVar2.getNumber();
        uVar3.f126588a |= 8;
        C62942bv build = tVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C48919u uVar4 = (C48919u) build;
        f359835b = uVar4;
        C48909k kVar = (C48909k) C48913o.f126569d.createBuilder();
        C69664n.m101060f(kVar, "newBuilder()");
        C69664n.m101061g(kVar, "builder");
        C48907i iVar = (C48907i) C48908j.f126561c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C69664n.m101061g(iVar, "builder");
        C48906h hVar = C48906h.TRIGGER_FOR_CURRENT;
        C69664n.m101061g(hVar, "value");
        iVar.copyOnWrite();
        C48908j jVar = (C48908j) iVar.instance;
        jVar.f126564b = hVar.f126560d;
        jVar.f126563a |= 1;
        C62942bv build2 = iVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        C48908j jVar2 = (C48908j) build2;
        C69664n.m101061g(jVar2, "value");
        kVar.copyOnWrite();
        C48913o oVar = (C48913o) kVar.instance;
        jVar2.getClass();
        oVar.f126572b = jVar2;
        oVar.f126571a |= 1;
        C48910l lVar = (C48910l) C48912n.f126565c.createBuilder();
        C69664n.m101060f(lVar, "newBuilder()");
        C69664n.m101061g(lVar, "builder");
        lVar.copyOnWrite();
        C48912n nVar = (C48912n) lVar.instance;
        nVar.f126567a = 3;
        nVar.f126568b = true;
        C62942bv build3 = lVar.build();
        C69664n.m101060f(build3, "_builder.build()");
        C48912n nVar2 = (C48912n) build3;
        C69664n.m101061g(nVar2, "value");
        kVar.copyOnWrite();
        C48913o oVar2 = (C48913o) kVar.instance;
        nVar2.getClass();
        oVar2.f126573c = nVar2;
        oVar2.f126571a |= 2;
        C62942bv build4 = kVar.build();
        C69664n.m101060f(build4, "_builder.build()");
        C48913o oVar3 = (C48913o) build4;
        f359836c = oVar3;
        C48948av avVar = (C48948av) C48952az.f126657c.createBuilder();
        C69664n.m101060f(avVar, "newBuilder()");
        C49154x a = C69664n.m101061g(avVar, "builder");
        C48950ax axVar = (C48950ax) C48951ay.f126654b.createBuilder();
        C69664n.m101060f(axVar, "newBuilder()");
        C69664n.m101061g(axVar, "builder");
        C49152v.m85371b(axVar);
        C48936aj ajVar = (C48936aj) C48939am.f126628c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C49061f a2 = C69664n.m101061g(ajVar, "builder");
        C48938al alVar = C48938al.PLUGGED;
        C69664n.m101061g(alVar, "value");
        C48936aj ajVar2 = a2.f126906a;
        ajVar2.copyOnWrite();
        C48939am amVar = (C48939am) ajVar2.instance;
        amVar.f126631b = Integer.valueOf(alVar.f126627d);
        amVar.f126630a = 1;
        C49152v.m85370a(C131714a.m214164a(a2.mo53215a()), axVar);
        C49152v.m85371b(axVar);
        C48936aj ajVar3 = (C48936aj) C48939am.f126628c.createBuilder();
        C69664n.m101060f(ajVar3, "newBuilder()");
        C49061f a3 = C69664n.m101061g(ajVar3, "builder");
        C48935ai aiVar = C48935ai.BLUETOOTH_A2DP_ON;
        C69664n.m101061g(aiVar, "value");
        C48936aj ajVar4 = a3.f126906a;
        ajVar4.copyOnWrite();
        C48939am amVar2 = (C48939am) ajVar4.instance;
        amVar2.f126631b = Integer.valueOf(aiVar.f126621d);
        amVar2.f126630a = 2;
        C49152v.m85370a(C131714a.m214164a(a3.mo53215a()), axVar);
        C62942bv build5 = axVar.build();
        C69664n.m101060f(build5, "_builder.build()");
        C48951ay ayVar = (C48951ay) build5;
        C69664n.m101061g(ayVar, "value");
        C48948av avVar2 = a.f127110a;
        avVar2.copyOnWrite();
        C48952az azVar = (C48952az) avVar2.instance;
        ayVar.getClass();
        azVar.f126660b = ayVar;
        azVar.f126659a = 3;
        C48952az a4 = a.mo53220a();
        f359837d = a4;
        C48916r rVar = (C48916r) C48917s.f126578f.createBuilder();
        C69664n.m101060f(rVar, "newBuilder()");
        C69664n.m101061g(rVar, "builder");
        C69664n.m101061g(uVar4, "value");
        rVar.copyOnWrite();
        C48917s sVar = (C48917s) rVar.instance;
        uVar4.getClass();
        sVar.f126581b = uVar4;
        sVar.f126580a |= 1;
        C69664n.m101061g(oVar3, "value");
        rVar.copyOnWrite();
        C48917s sVar2 = (C48917s) rVar.instance;
        oVar3.getClass();
        sVar2.f126584e = oVar3;
        sVar2.f126580a |= 8;
        C69664n.m101061g(a4, "value");
        rVar.copyOnWrite();
        C48917s sVar3 = (C48917s) rVar.instance;
        a4.getClass();
        sVar3.f126582c = a4;
        sVar3.f126580a |= 2;
        C62942bv build6 = rVar.build();
        C69664n.m101060f(build6, "_builder.build()");
        f359838e = (C48917s) build6;
    }

    public C131716c(C17784j jVar, ScheduledExecutorService scheduledExecutorService, C130603a aVar, boolean z) {
        C69664n.m101061g(scheduledExecutorService, "lightweightExecutor");
        C69664n.m101061g(aVar, "aaFileFluentLoggerFactory");
        this.f359840f = jVar;
        this.f359841g = scheduledExecutorService;
        this.f359842h = z;
        this.f359839a = aVar.mo109740b(this);
    }

    /* renamed from: b */
    public final C60870cx mo110268b(C131713d dVar) {
        if (!this.f359842h) {
            return C60866ct.f164955a;
        }
        C47633f j = C47633f.m84733g(this.f359840f.mo23443b(f359838e)).mo51517j(10, TimeUnit.SECONDS, this.f359841g);
        C131715b bVar = new C131715b(this);
        C60856cj.m92911t(j, C47810es.m84974n(bVar), this.f359841g);
        return j;
    }

    /* renamed from: c */
    public final C60870cx mo110269c() {
        C17784j jVar = this.f359840f;
        C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
        C69664n.m101060f(pVar, "newBuilder()");
        C69664n.m101061g(pVar, "builder");
        C48919u uVar = f359835b;
        C69664n.m101061g(uVar, "value");
        pVar.copyOnWrite();
        C48915q qVar = (C48915q) pVar.instance;
        uVar.getClass();
        qVar.f126577b = uVar;
        qVar.f126576a |= 1;
        C62942bv build = pVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C60870cx a = jVar.mo23442a((C48915q) build);
        C69664n.m101060f(a, "contextTriggerScheduler.…R_REQUEST_CONTEXT }\n    )");
        return a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo110270d(C53715bm bmVar, long j) {
        return C131691a.m214140a();
    }
}
