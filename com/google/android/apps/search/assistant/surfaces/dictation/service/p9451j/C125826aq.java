package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.gsa.binaries.satin.app.aop;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119271ag;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119272ah;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119273ai;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119277am;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119279ao;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119292n;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119303y;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125291u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125388ap;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125389aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125390ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126346w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.aq */
/* compiled from: PG */
public final class C125826aq extends C119292n {

    /* renamed from: a */
    public static final C59071e f346751a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.j.aq");

    /* renamed from: b */
    public final C125860bx f346752b;

    /* renamed from: c */
    private final C125813ad f346753c;

    /* renamed from: d */
    private final C125390ar f346754d;

    /* renamed from: e */
    private final Executor f346755e;

    /* renamed from: f */
    private final boolean f346756f;

    /* renamed from: g */
    private final boolean f346757g;

    /* renamed from: h */
    private final C125876q f346758h;

    /* renamed from: i */
    private final C125811ab f346759i;

    /* renamed from: j */
    private final aop f346760j;

    public C125826aq(C125876q qVar, aop aop, C125860bx bxVar, C125813ad adVar, C125390ar arVar, Executor executor, C126346w wVar, boolean z, C125811ab abVar) {
        this.f346758h = qVar;
        this.f346760j = aop;
        this.f346752b = bxVar;
        this.f346753c = adVar;
        this.f346754d = arVar;
        this.f346755e = executor;
        this.f346756f = wVar.mo107565a();
        this.f346757g = z;
        this.f346759i = abVar;
    }

    /* renamed from: b */
    public final C70862aj mo104270b(C70862aj ajVar) {
        if (!this.f346756f) {
            ((C59052c) ((C59052c) f346751a.mo56225c()).mo56372aa(36693)).mo56386p("Dictation disabled, cannot be controlled [SD]");
            ajVar.mo20122b(new C70761fa(Status.f186915m.withDescription("Dictation disabled, cannot be controlled"), (C70334de) null, true));
            return new C125825ap();
        }
        aop aop = this.f346760j;
        return new C125884y(ajVar, (C125860bx) aop.f199114a.b.f198027a.f199373dm.mo17428b(), (Executor) aop.f199114a.a.n.mo17428b());
    }

    /* renamed from: c */
    public final C70862aj mo104271c(C70862aj ajVar) {
        if (!this.f346756f) {
            ((C59052c) ((C59052c) f346751a.mo56224b()).mo56372aa(36694)).mo56386p("Dictation is disabled, and this won't change before process restart [SD]");
            ajVar.mo20123c(C119282d.f332631e);
            ajVar.mo20121a();
            return new C125825ap();
        }
        C125876q qVar = this.f346758h;
        return new C125291u(new C125869j(C71803m.m105043d(qVar.f346934a, (C69585o) null, (C71424ay) null, new C125874o(qVar, ajVar, (C69577g) null), 3)));
    }

    /* renamed from: d */
    public final void mo104272d(C119303y yVar, C70862aj ajVar) {
        C125390ar arVar = this.f346754d;
        boolean z = yVar.f332682a;
        C60870cx d = arVar.f345830b.mo46042d();
        if (z) {
            C126308aq aqVar = new C126308aq(new C125388ap(arVar), C125389aq.f345827a);
            C60856cj.m92911t(d, C47810es.m84974n(aqVar), arVar.f345831c);
        }
        C126308aq aqVar2 = new C126308aq(new C125814ae(ajVar), new C125816ag(ajVar));
        C60856cj.m92911t(d, C47810es.m84974n(aqVar2), this.f346755e);
    }

    /* renamed from: e */
    public final void mo104273e(C119271ag agVar, C70862aj ajVar) {
        if (!this.f346756f) {
            ((C59052c) ((C59052c) f346751a.mo56225c()).mo56372aa(36702)).mo56386p("Dictation is disabled, cannot start dictation [SD]");
            C119272ah ahVar = (C119272ah) C119273ai.f332618b.createBuilder();
            ahVar.copyOnWrite();
            ((C119273ai) ahVar.instance).f332620a = false;
            ajVar.mo20123c((C119273ai) ahVar.build());
            ajVar.mo20121a();
        } else if (this.f346757g) {
            C119272ah ahVar2 = (C119272ah) C119273ai.f332618b.createBuilder();
            ahVar2.copyOnWrite();
            ((C119273ai) ahVar2.instance).f332620a = true;
            ajVar.mo20123c((C119273ai) ahVar2.build());
            ajVar.mo20121a();
            C60870cx b = C126309ar.m206523b(new C125819aj(this, agVar));
            C126308aq aqVar = new C126308aq(C125820ak.f346746a, C125821al.f346747a);
            C60856cj.m92911t(b, C47810es.m84974n(aqVar), this.f346755e);
        } else {
            C60870cx b2 = C126309ar.m206523b(new C125817ah(this, agVar));
            C125818ai aiVar = C125818ai.f346743a;
            C126309ar.m206528g(C60922j.m93044g(b2, C47810es.m84963c(aiVar), C60826bg.f164896a), ajVar, this.f346755e, "Unexpected failure from StartDictationHandler [SD]", new Object[0]);
        }
    }

    /* renamed from: f */
    public final void mo104274f(C119277am amVar, C70862aj ajVar) {
        C60870cx cxVar;
        if (!this.f346756f) {
            ((C59052c) ((C59052c) f346751a.mo56226d()).mo56372aa(36704)).mo56386p("Dictation is disabled, stopping doesn't make sense [SD]");
            ajVar.mo20123c(C119279ao.f332627a);
            ajVar.mo20121a();
            return;
        }
        C125813ad adVar = this.f346753c;
        C119297s a = C119297s.m197993a(amVar.f332626a);
        if (a == null) {
            a = C119297s.UNRECOGNIZED;
        }
        C69664n.m101061g(a, "Requester");
        C125783g a2 = adVar.f346737a.mo107117a();
        if (a2 == null) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = a2.f346662c.mo106950b(a);
        }
        C126308aq aqVar = new C126308aq(new C125822am(ajVar), new C125823an(ajVar));
        C60856cj.m92911t(cxVar, C47810es.m84974n(aqVar), this.f346755e);
    }

    /* renamed from: g */
    public final void mo104275g(C70862aj ajVar) {
        if (!this.f346756f) {
            ((C59052c) ((C59052c) f346751a.mo56224b()).mo56372aa(36695)).mo56386p("Dictation is disabled, cannot start dictation [SD]");
            ajVar.mo20123c(C119282d.f332631e);
            ajVar.mo20121a();
            return;
        }
        C125876q qVar = this.f346758h;
        C126309ar.m206528g(C71663i.m104692e(qVar.f346934a, (C71424ay) null, new C125875p(qVar, (C69577g) null), 3), ajVar, this.f346755e, "Failure during CanStartDictation invocation [SD]", new Object[0]);
    }

    /* renamed from: h */
    public final void mo104276h(C70862aj ajVar) {
        C125811ab abVar = this.f346759i;
        C60870cx e = C71663i.m104692e(abVar.f346733a, (C71424ay) null, new C125810aa(abVar, (C69577g) null), 3);
        C125824ao aoVar = C125824ao.f346750a;
        C126309ar.m206528g(C60922j.m93044g(e, C47810es.m84963c(aoVar), this.f346755e), ajVar, this.f346755e, "Failed to fetch language tags for data download. [SD]", new Object[0]);
    }
}
