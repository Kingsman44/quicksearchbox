package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119806ba;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119808bc;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119832c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119860da;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119864de;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119886e;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119938a;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32519l;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32525r;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34829c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5079a.p5080a.p5081a.C65479b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5079a.p5080a.p5081a.C65480c;
import java.util.concurrent.Executor;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.c.o */
/* compiled from: PG */
final class C119765o implements C119748c {

    /* renamed from: a */
    public static final C59071e f333609a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.a.c.o");

    /* renamed from: b */
    public final C119789ak f333610b;

    /* renamed from: c */
    public final C119670b f333611c;

    /* renamed from: d */
    public final Executor f333612d;

    /* renamed from: e */
    public final C17597g f333613e;

    /* renamed from: f */
    public final C119770t f333614f;

    /* renamed from: g */
    public final C119751ab f333615g;

    /* renamed from: h */
    public final C32519l f333616h = new C32519l(C119864de.f333825a, new C119754d(this), C60826bg.f164896a);

    /* renamed from: i */
    public final C32525r f333617i = new C32525r(C119864de.f333826b, new C119763m(this), C60826bg.f164896a);

    public C119765o(C119789ak akVar, C119670b bVar, Executor executor, C119832c cVar, Executor executor2) {
        this.f333610b = akVar;
        this.f333611c = bVar;
        C60904dr drVar = new C60904dr(executor);
        this.f333612d = drVar;
        C59104x b = f333609a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        ((C59052c) ((C59052c) b).mo56372aa(34575)).mo56386p("#connect");
        C17602l lVar = new C17602l(executor2, C70876o.m103761b(cVar.f189039a.mo39510a(C119886e.m198759a(), cVar.f189040b), C47686k.m84827a(new C119764n(this)), true));
        this.f333613e = lVar;
        this.f333614f = new C119770t(lVar, bVar, drVar);
        this.f333615g = new C119751ab(akVar, bVar, drVar);
    }

    /* renamed from: a */
    public final C60870cx mo104498a(C119851cs csVar) {
        C32519l lVar = this.f333616h;
        C119806ba baVar = (C119806ba) C119808bc.f333713c.createBuilder();
        baVar.copyOnWrite();
        C119808bc bcVar = (C119808bc) baVar.instance;
        csVar.getClass();
        bcVar.f333717b = csVar;
        bcVar.f333716a = 1;
        C60870cx a = lVar.mo38119a((C119808bc) baVar.build());
        C119757g gVar = C119757g.f333597a;
        return C60922j.m93044g(a, C47810es.m84963c(gVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo104499b(C119863dd ddVar) {
        C32519l lVar = this.f333616h;
        C119806ba baVar = (C119806ba) C119808bc.f333713c.createBuilder();
        baVar.copyOnWrite();
        C119808bc bcVar = (C119808bc) baVar.instance;
        ddVar.getClass();
        bcVar.f333717b = ddVar;
        bcVar.f333716a = 2;
        C60870cx a = lVar.mo38119a((C119808bc) baVar.build());
        C119755e eVar = C119755e.f333595a;
        return C60922j.m93044g(a, C47810es.m84963c(eVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo104500c(C119860da daVar) {
        C32519l lVar = this.f333616h;
        C119806ba baVar = (C119806ba) C119808bc.f333713c.createBuilder();
        baVar.copyOnWrite();
        C119808bc bcVar = (C119808bc) baVar.instance;
        daVar.getClass();
        bcVar.f333717b = daVar;
        bcVar.f333716a = 3;
        C60870cx a = lVar.mo38119a((C119808bc) baVar.build());
        C119756f fVar = C119756f.f333596a;
        return C60922j.m93044g(a, C47810es.m84963c(fVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo104501d() {
        C59104x b = f333609a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        ((C59052c) ((C59052c) b).mo56372aa(34576)).mo56386p("#disconnect");
        this.f333613e.mo20121a();
    }

    /* renamed from: e */
    public final void mo104510e(Throwable th) {
        Throwable th2;
        C59104x b = f333609a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(34577)).mo56386p("#onDisconnected");
        if (th != null) {
            th2 = th;
        } else {
            th2 = new StatusException(Status.f186916n.withDescription("Client requested disconnection"), C34829c.m63593b(C65480c.f177999a, C65479b.CLIENT_DISCONNECTED));
        }
        this.f333616h.mo38120b(th2);
        C119770t tVar = this.f333614f;
        C59104x b2 = C119770t.f333628a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ConvEngine.Execution");
        ((C59052c) ((C59052c) b2).mo56372aa(34588)).mo56386p("#onDisconnected");
        synchronized (tVar.f333631d) {
            if (!tVar.f333633f) {
                tVar.f333633f = true;
                C58485gu j = C58485gu.m89842j(tVar.f333632e.values());
                tVar.f333632e.clear();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C119769s sVar = (C119769s) j.get(i);
                    C59104x b3 = C119770t.f333628a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "ConvEngine.Execution");
                    C59052c cVar = (C59052c) b3;
                    cVar.mo56378ag(C119938a.f334012b, Long.valueOf(sVar.f333623a));
                    ((C59052c) cVar.mo56372aa(34589)).mo56389s("Aborting session %s due to disconnection", sVar.f333625c);
                    sVar.mo104512a();
                }
            }
        }
        this.f333617i.mo38127a();
        this.f333612d.execute(C47810es.m84977q(new C119753c(this, th)));
    }
}
