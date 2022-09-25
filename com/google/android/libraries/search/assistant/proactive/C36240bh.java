package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119662e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c.C119767q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119845cm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119846cn;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119847co;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124184c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124211d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.android.libraries.search.assistant.proactive.p2771c.C36245d;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.search.assistant.proactive.bh */
/* compiled from: PG */
public final class C36240bh implements C36228ax {

    /* renamed from: a */
    public static final C59071e f94651a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.bh");

    /* renamed from: b */
    public final C124184c f94652b;

    /* renamed from: c */
    public final C37215b f94653c;

    /* renamed from: d */
    public final C119662e f94654d;

    /* renamed from: e */
    public final C36245d f94655e;

    /* renamed from: f */
    public final Executor f94656f;

    /* renamed from: g */
    public final Set f94657g = C58758qx.m90653k();

    /* renamed from: h */
    public final Set f94658h;

    /* renamed from: i */
    public final C32904f f94659i;

    /* renamed from: j */
    public final AtomicInteger f94660j = new AtomicInteger(0);

    /* renamed from: k */
    public C119748c f94661k;

    /* renamed from: l */
    public C124211d f94662l;

    /* renamed from: m */
    public C32881e f94663m;

    /* renamed from: n */
    public final C119767q f94664n;

    /* renamed from: o */
    private final Executor f94665o;

    /* renamed from: p */
    private final C47632e f94666p = new C47632e();

    public C36240bh(C38780c cVar, C119767q qVar, C124184c cVar2, Set set, C36245d dVar, C119662e eVar, C32904f fVar, Executor executor) {
        this.f94664n = qVar;
        this.f94652b = cVar2;
        this.f94653c = cVar.mo41619a(C38828b.PROACTIVE_ASSISTANT);
        this.f94658h = set;
        this.f94654d = eVar;
        this.f94659i = fVar;
        this.f94655e = dVar;
        this.f94665o = executor;
        this.f94656f = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo40043a(C51805du duVar) {
        C59104x b = f94651a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52266)).mo56386p("#StartWholeHomeConversation");
        this.f94653c.mo19974a(C37197a.f98670f);
        C119845cm cmVar = (C119845cm) C119851cs.f333803i.createBuilder();
        C119846cn cnVar = (C119846cn) C119847co.f333794b.createBuilder();
        cnVar.copyOnWrite();
        duVar.getClass();
        ((C119847co) cnVar.instance).f333796a = duVar;
        cmVar.copyOnWrite();
        C119851cs csVar = (C119851cs) cmVar.instance;
        C119847co coVar = (C119847co) cnVar.build();
        coVar.getClass();
        csVar.f333807c = coVar;
        csVar.f333806b = 3;
        C60870cx b2 = this.f94666p.mo51512b(new C36233ba(this, (C119851cs) cmVar.build()), this.f94665o);
        b2.mo4106b(new C36234bb(this, b2), this.f94656f);
    }

    /* renamed from: b */
    public final void mo40067b() {
        this.f94666p.mo51511a(C47810es.m84978r(new C36230az(this)), this.f94665o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo40068c(C60870cx cxVar) {
        try {
            C60856cj.m92909r(cxVar);
            C59104x b = f94651a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
            ((C59052c) ((C59052c) b).mo56372aa(52264)).mo56386p("Conversation interaction is started");
        } catch (ExecutionException e) {
            C59104x c = f94651a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52265)).mo56386p("Failed to start conversation interaction, disconnect everything.");
            this.f94653c.mo19974a(C37197a.f98675k.mo40805c(C62722b.INTERNAL));
            mo40067b();
        } catch (CancellationException unused) {
        }
    }
}
