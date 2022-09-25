package com.google.android.apps.gsa.staticplugins.p8793w.p8813e;

import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59687cb;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.e.a */
/* compiled from: PG */
public final class C117853a implements C85700a {

    /* renamed from: a */
    private static final C59071e f327065a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.e.a");

    /* renamed from: b */
    private static final C58528ij f327066b = C58528ij.m90015O(C89849ae.AAV_START_MIC_OPEN_FOR_FOLLOW_ON, C89849ae.AAV_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT, C89849ae.AAP_START_MIC_OPEN_FOR_FOLLOW_ON, C89849ae.AAP_START_IMMERSIVE_UI_FOLLOW_ON, C89849ae.AAP_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT, C89849ae.AAE_START_MIC_OPEN_FOR_FOLLOW_ON, C89849ae.AAE_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT);

    /* renamed from: c */
    private static final C58528ij f327067c = C58528ij.m90013M(C89849ae.TTS_PLAY_STARTED, C89849ae.ASSISTANT_AUTO_START_ACTIVITY_INTENT, C89849ae.OPA_ANDROID_RENDERING_START, C89849ae.ASSISTANT_AUTO_ACTION_V2_EXECUTION_START);

    /* renamed from: d */
    private final C89859i f327068d;

    /* renamed from: e */
    private final AtomicInteger f327069e;

    /* renamed from: f */
    private final C58833ax f327070f;

    /* renamed from: g */
    private final C21370a f327071g;

    /* renamed from: h */
    private final ArrayDeque f327072h = new ArrayDeque();

    /* renamed from: i */
    private long f327073i;

    /* renamed from: j */
    private boolean f327074j = false;

    public C117853a(C89859i iVar, C58833ax axVar, C21370a aVar) {
        this.f327068d = iVar;
        this.f327070f = axVar;
        this.f327071g = aVar;
        this.f327069e = new AtomicInteger(0);
    }

    /* renamed from: o */
    private final void m195809o(C89849ae aeVar, long j, C59687cb cbVar, C58833ax axVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        if (cbVar != null) {
            fVar.f246203c = cbVar;
        }
        if (j > 0) {
            fVar.f246204d = j;
        }
        if (axVar == null) {
            fVar.mo83701c("carAssistantFlowId", Long.toString(this.f327073i));
        } else if (axVar.mo56113h()) {
            fVar.mo83701c("carAssistantFlowId", (String) axVar.mo56107c());
        }
        this.f327068d.mo74236a(fVar.mo83699a());
        if (this.f327069e.compareAndSet(2, 0)) {
            this.f327074j = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m195810p(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque r0 = r2.f327072h     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0030
            com.google.common.base.ax r0 = r2.f327070f     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            com.google.common.base.ax r0 = r2.f327070f     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0032 }
            com.google.android.libraries.assistant.auto.ondevice.e.m r0 = (com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m) r0     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = r2.f327072h     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0032 }
            com.google.android.apps.gsa.shared.search.Query r1 = (com.google.android.apps.gsa.shared.search.Query) r1     // Catch:{ all -> 0x0032 }
            r1.getClass()
            if (r3 == 0) goto L_0x0029
            com.google.assistant.ab.ct r3 = com.google.assistant.p3745ab.C48292ct.SUCCESS     // Catch:{ all -> 0x0032 }
            goto L_0x002b
        L_0x0029:
            com.google.assistant.ab.ct r3 = com.google.assistant.p3745ab.C48292ct.ERROR_FAILED_INTERNAL     // Catch:{ all -> 0x0032 }
        L_0x002b:
            r0.mo20288i(r1, r3)     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)
            return
        L_0x0030:
            monitor-exit(r2)
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8793w.p8813e.C117853a.m195810p(boolean):void");
    }

    /* renamed from: a */
    public final void mo79319a(C59687cb cbVar) {
        String str;
        if (!this.f327069e.compareAndSet(1, 2)) {
            C59104x d = f327065a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(18655);
            if (this.f327074j) {
                str = C89849ae.ASSISTANT_AUTO_END_SUCCESS.name();
            } else {
                str = C89849ae.ASSISTANT_AUTO_END_GENERAL_FAILURE.name();
            }
            cVar.mo56389s("#onEndEvent called for an ended/not started AppFlow %s", str);
        } else if (this.f327074j) {
            C58976aa aaVar = C58975e.f156826a;
            m195810p(true);
            m195809o(C89849ae.ASSISTANT_AUTO_END_SUCCESS, 0, cbVar, (C58833ax) null);
        } else {
            C59104x d2 = f327065a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
            ((C59052c) ((C59052c) d2).mo56372aa(18656)).mo56386p("#onEndEvent called before logging action event");
            m195810p(false);
            m195809o(C89849ae.ASSISTANT_AUTO_END_GENERAL_FAILURE, 0, cbVar, (C58833ax) null);
        }
    }

    /* renamed from: b */
    public final void mo79320b(C89849ae aeVar, long j, C59687cb cbVar, C58833ax axVar) {
        this.f327069e.compareAndSet(1, 2);
        C58976aa aaVar = C58975e.f156826a;
        m195809o(aeVar, j, cbVar, axVar);
    }

    /* renamed from: c */
    public final void mo79321c(C59687cb cbVar) {
        String str;
        if (!this.f327069e.compareAndSet(1, 2)) {
            C59104x d = f327065a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(18660);
            if (this.f327074j) {
                str = C89849ae.ASSISTANT_AUTO_END_SUCCESS.name();
            } else {
                str = C89849ae.ASSISTANT_AUTO_END_USER_TAPPED_OUT_CANCEL.name();
            }
            cVar.mo56389s("#onEndEventOrUserCancel called for an ended/not started AppFlow %s", str);
        } else if (this.f327074j) {
            C58976aa aaVar = C58975e.f156826a;
            m195810p(true);
            m195809o(C89849ae.ASSISTANT_AUTO_END_SUCCESS, 0, cbVar, (C58833ax) null);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            m195810p(false);
            m195809o(C89849ae.ASSISTANT_AUTO_END_USER_TAPPED_OUT_CANCEL, 0, cbVar, (C58833ax) null);
        }
    }

    /* renamed from: d */
    public final void mo79322d(C89849ae aeVar) {
        mo79324f(aeVar, 0, (C59687cb) null, (C58833ax) null);
    }

    /* renamed from: e */
    public final void mo79323e(C89849ae aeVar, long j, C59687cb cbVar) {
        mo79324f(aeVar, j, cbVar, (C58833ax) null);
    }

    /* renamed from: f */
    public final void mo79324f(C89849ae aeVar, long j, C59687cb cbVar, C58833ax axVar) {
        if (this.f327069e.get() == 1 || axVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (f327067c.contains(aeVar)) {
                this.f327074j = true;
            }
            m195809o(aeVar, j, cbVar, axVar);
            return;
        }
        C59104x d = f327065a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
        ((C59052c) ((C59052c) d).mo56372aa(18664)).mo56389s("#onEvent called for an ended/not started AppFlow %s", aeVar.name());
    }

    /* renamed from: g */
    public final void mo79325g(C59687cb cbVar) {
        if (this.f327069e.compareAndSet(1, 2)) {
            C58976aa aaVar = C58975e.f156826a;
            m195810p(false);
            m195809o(C89849ae.ASSISTANT_AUTO_END_GENERAL_FAILURE, 0, cbVar, (C58833ax) null);
            return;
        }
        C59104x d = f327065a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
        ((C59052c) ((C59052c) d).mo56372aa(18665)).mo56389s("#onGeneralFailure called for an ended/not started AppFlow %s", C89849ae.ASSISTANT_AUTO_END_GENERAL_FAILURE.name());
    }

    /* renamed from: h */
    public final void mo79326h(C59687cb cbVar) {
        if (this.f327069e.compareAndSet(1, 2)) {
            C58976aa aaVar = C58975e.f156826a;
            m195810p(false);
            m195809o(C89849ae.ASSISTANT_AUTO_END_NO_SPEECH_DETECTED_CANCEL, 0, cbVar, (C58833ax) null);
            return;
        }
        C59104x d = f327065a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
        ((C59052c) ((C59052c) d).mo56372aa(18667)).mo56389s("#onNoSpeechDetected called for an ended/not started AppFlow %s", C89849ae.ASSISTANT_AUTO_END_NO_SPEECH_DETECTED_CANCEL.name());
    }

    /* renamed from: i */
    public final void mo79327i(C89849ae aeVar) {
        mo79330l(aeVar, 0, (C59687cb) null, (C58833ax) null);
    }

    /* renamed from: j */
    public final void mo79328j(C89849ae aeVar, long j) {
        mo79330l(aeVar, j, (C59687cb) null, (C58833ax) null);
    }

    /* renamed from: k */
    public final void mo79329k(C89849ae aeVar, long j, C59687cb cbVar) {
        mo79330l(aeVar, j, cbVar, (C58833ax) null);
    }

    /* renamed from: l */
    public final void mo79330l(C89849ae aeVar, long j, C59687cb cbVar, C58833ax axVar) {
        if (!f327066b.contains(aeVar)) {
            this.f327072h.clear();
            this.f327069e.set(0);
            this.f327074j = false;
        }
        if (this.f327069e.compareAndSet(0, 1) || axVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f327073i = this.f327071g.mo26873e();
            m195809o(aeVar, j, cbVar, axVar);
            return;
        }
        C59104x d = f327065a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
        ((C59052c) ((C59052c) d).mo56372aa(18670)).mo56389s("#onStartEvent called for ongoing AppFlow %s", aeVar.name());
    }

    /* renamed from: m */
    public final void mo79331m(C59687cb cbVar) {
        if (this.f327069e.compareAndSet(1, 2)) {
            C58976aa aaVar = C58975e.f156826a;
            m195810p(false);
            m195809o(C89849ae.ASSISTANT_AUTO_END_TIMEOUT_FAILURE, 0, cbVar, (C58833ax) null);
            return;
        }
        C59104x d = f327065a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarAssistantAppFlwLggr");
        ((C59052c) ((C59052c) d).mo56372aa(18671)).mo56389s("#onTimeoutFailure called for an ended/not started AppFlow %s", C89849ae.ASSISTANT_AUTO_END_TIMEOUT_FAILURE.name());
    }

    /* renamed from: n */
    public final void mo79332n(Query query) {
        if (this.f327072h.isEmpty() || ((Query) this.f327072h.getLast()).f252749G != query.f252749G) {
            C58976aa aaVar = C58975e.f156826a;
            long j = query.f252749G;
            this.f327072h.addLast(query);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        long j2 = query.f252749G;
    }
}
