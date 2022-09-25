package com.google.android.apps.gsa.staticplugins.fedass.ipc.p7951a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.apps.gsa.p6482q.p6483a.C84233f;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100968c;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.a.s */
/* compiled from: PG */
public final class C100963s implements C84233f {

    /* renamed from: a */
    public static final C59071e f282019a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.ipc.a.s");

    /* renamed from: b */
    public final C22871g f282020b;

    /* renamed from: c */
    public final AtomicReference f282021c = new AtomicReference((Object) null);

    /* renamed from: d */
    public final AtomicBoolean f282022d = new AtomicBoolean(false);

    /* renamed from: e */
    public final List f282023e = new ArrayList();

    /* renamed from: f */
    private final Context f282024f;

    /* renamed from: g */
    private final AtomicBoolean f282025g = new AtomicBoolean(false);

    /* renamed from: h */
    private final ServiceConnection f282026h = new C100959o(this);

    public C100963s(Context context, C90821bm bmVar) {
        this.f282024f = context;
        this.f282020b = bmVar.mo85163a(C100961q.class);
    }

    /* renamed from: k */
    private final C60870cx m167178k(String str, boolean z) {
        C100965u uVar = new C100965u(TrainCommunicationOperation.REGISTER_TRAINING);
        m167180m(new C100953i(str, z, uVar), uVar);
        C100954j jVar = C100954j.f282008a;
        return C60922j.m93044g(uVar, C47810es.m84963c(jVar), C60826bg.f164896a);
    }

    /* renamed from: l */
    private final C60870cx m167179l(C60870cx cxVar) {
        return C47638k.m84751b(cxVar).mo51521b(new C100949e(this, cxVar), new C100950f(this));
    }

    /* renamed from: m */
    private final synchronized void m167180m(C100960p pVar, C100965u uVar) {
        this.f282020b.mo28212l("[FedAss] TrainCommunicationService.sendMessage", new C100955k(this, pVar, uVar));
    }

    /* renamed from: a */
    public final C60870cx mo77704a(String str) {
        C59104x b = f282019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(19588)).mo56386p("logTrainingCacheStats()");
        C100965u uVar = new C100965u(TrainCommunicationOperation.LOG_TRAINING_CACHE_STATS);
        m167180m(new C100946b(str, uVar), uVar);
        C100947c cVar = C100947c.f281998a;
        return m167179l(C60922j.m93044g(uVar, C47810es.m84963c(cVar), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo77705b(String str) {
        C59104x b = f282019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(19589)).mo56386p("performCacheMaintenance()");
        C100965u uVar = new C100965u(TrainCommunicationOperation.PERFORM_CACHE_MAINTENANCE);
        m167180m(new C100945a(str, uVar), uVar);
        C100948d dVar = C100948d.f281999a;
        return m167179l(C60922j.m93044g(uVar, C47810es.m84963c(dVar), C60826bg.f164896a));
    }

    /* renamed from: c */
    public final C60870cx mo77706c(String str) {
        C59104x b = f282019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(19590)).mo56386p("registerTraining()");
        return m167179l(m167178k(str, false));
    }

    /* renamed from: d */
    public final C60870cx mo77707d(String str) {
        C59104x b = f282019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(19591)).mo56386p("trainNow()");
        return m167179l(m167178k(str, true));
    }

    /* renamed from: e */
    public final C60870cx mo77708e() {
        C59104x b = f282019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(19592)).mo56386p("unRegisterTraining()");
        C100965u uVar = new C100965u(TrainCommunicationOperation.UNREGISTER_TRAINING);
        m167180m(new C100951g(uVar), uVar);
        C100952h hVar = C100952h.f282004a;
        return m167179l(C60922j.m93044g(uVar, C47810es.m84963c(hVar), C60826bg.f164896a));
    }

    /* renamed from: f */
    public final synchronized void mo92108f() {
        this.f282021c.set((Object) null);
        this.f282022d.set(false);
        this.f282025g.set(false);
    }

    /* renamed from: g */
    public final synchronized void mo92109g(C100968c cVar) {
        this.f282021c.set(cVar);
        this.f282022d.set(true);
        mo92110h();
    }

    /* renamed from: h */
    public final synchronized void mo92110h() {
        for (C100962r rVar : this.f282023e) {
            C100968c cVar = (C100968c) this.f282021c.get();
            if (cVar == null) {
                C59104x c = f282019a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
                ((C59052c) ((C59052c) c).mo56372aa(19594)).mo56386p("Service unavailable while processing message.");
                rVar.f282018b.mo92114d(false);
            } else {
                try {
                    rVar.f282017a.mo92104a(cVar);
                } catch (Exception e) {
                    C59104x c2 = f282019a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(19593)).mo56386p("Remote call failure.");
                    rVar.f282018b.mo92114d(false);
                }
            }
        }
        this.f282023e.clear();
    }

    /* renamed from: i */
    public final synchronized void mo92111i() {
        if (this.f282025g.compareAndSet(false, true)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f282024f, "com.google.android.apps.gsa.staticplugins.fedass.ipc.service.TrainCommunicationService"));
            intent.setPackage("com.google.android.googlequicksearchbox");
            if (!this.f282024f.bindService(intent, this.f282026h, 1)) {
                C59104x c = f282019a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
                ((C59052c) ((C59052c) c).mo56372aa(19595)).mo56386p("Unable to bind to TrainCommunicationService");
            }
        }
    }

    /* renamed from: j */
    public final synchronized void mo92112j() {
        this.f282024f.unbindService(this.f282026h);
        mo92108f();
    }
}
