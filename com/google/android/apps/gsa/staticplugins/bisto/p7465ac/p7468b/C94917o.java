package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94935c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95297c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95857h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p2388p.C31091a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.assistant.p3739a.p3740a.C48104ck;
import com.google.assistant.p3739a.p3740a.C48111h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60232lf;
import com.google.common.p4552o.C60234lh;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.o */
/* compiled from: PG */
public final class C94917o implements C95007y {

    /* renamed from: d */
    private static final C59071e f265505d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.b.o");

    /* renamed from: a */
    C94916n f265506a = C94916n.DONE;

    /* renamed from: b */
    final List f265507b = new ArrayList();

    /* renamed from: c */
    C60870cx f265508c;

    /* renamed from: e */
    private final C60888db f265509e;

    /* renamed from: f */
    private final C95297c f265510f;

    /* renamed from: g */
    private final C21370a f265511g;

    /* renamed from: h */
    private final C68214a f265512h;

    /* renamed from: i */
    private final C94934b f265513i;

    /* renamed from: j */
    private final C31091a f265514j = new C31091a();

    /* renamed from: k */
    private String f265515k;

    /* renamed from: l */
    private boolean f265516l;

    /* renamed from: m */
    private boolean f265517m;

    /* renamed from: n */
    private int f265518n;

    /* renamed from: o */
    private boolean f265519o;

    /* renamed from: p */
    private boolean f265520p;

    /* renamed from: q */
    private long f265521q;

    public C94917o(C60888db dbVar, C95297c cVar, C21370a aVar, C68214a aVar2, C94934b bVar) {
        this.f265509e = dbVar;
        this.f265510f = cVar;
        this.f265511g = aVar;
        this.f265512h = aVar2;
        this.f265513i = bVar;
    }

    /* renamed from: A */
    private final synchronized boolean m156659A(C94916n... nVarArr) {
        for (C94916n nVar : nVarArr) {
            if (this.f265506a == nVar) {
                return true;
            }
        }
        C59104x d = f265505d.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) d).mo56372aa(17593)).mo56389s("Unexpected state: %s", this.f265506a);
        return false;
    }

    /* renamed from: B */
    private final synchronized void m156660B(int i) {
        long j = this.f265521q;
        if (j != 0) {
            C95297c cVar = this.f265510f;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60232lf lfVar = (C60232lf) C60234lh.f162963e.createBuilder();
            lfVar.copyOnWrite();
            C60234lh lhVar = (C60234lh) lfVar.instance;
            lhVar.f162966b = i - 1;
            lhVar.f162965a |= 1;
            String b = C39191a.m68623b(j);
            lfVar.copyOnWrite();
            C60234lh lhVar2 = (C60234lh) lfVar.instance;
            b.getClass();
            lhVar2.f162965a |= 2;
            lhVar2.f162967c = b;
            long b2 = this.f265511g.mo26870b();
            lfVar.copyOnWrite();
            C60234lh lhVar3 = (C60234lh) lfVar.instance;
            lhVar3.f162965a |= 4;
            lhVar3.f162968d = b2;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60234lh lhVar4 = (C60234lh) lfVar.build();
            lhVar4.getClass();
            nmVar.f163143D = lhVar4;
            nmVar.f163148b |= 4096;
            cVar.mo89226b(nkVar);
        }
    }

    /* renamed from: r */
    private final synchronized void m156661r() {
        C60870cx cxVar = this.f265508c;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f265508c = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        if (r10.f265517m == false) goto L_0x00aa;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m156662s() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.n r0 = r10.f265506a     // Catch:{ all -> 0x012f }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.n r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94916n.STREAMING_TTS     // Catch:{ all -> 0x012f }
            if (r0 == r1) goto L_0x0023
            com.google.common.f.e r0 = f265505d     // Catch:{ all -> 0x012f }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x012f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "GacsOutputController"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x012f }
            java.lang.String r1 = "State was not %s"
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.n r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94916n.STREAMING_TTS     // Catch:{ all -> 0x012f }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x012f }
            r3 = 17571(0x44a3, float:2.4622E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r2)     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            return
        L_0x0023:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012f }
            boolean r0 = r10.f265519o     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x00ed
            com.google.android.libraries.p.a r0 = r10.f265514j     // Catch:{ all -> 0x012f }
            int r1 = r0.f83743b     // Catch:{ all -> 0x012f }
            int r0 = r0.f83742a     // Catch:{ all -> 0x012f }
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0034
            goto L_0x00ed
        L_0x0034:
            int r0 = r10.f265518n     // Catch:{ all -> 0x012f }
            r2 = 60
            if (r0 >= r1) goto L_0x00a4
            if (r0 < r2) goto L_0x003d
            goto L_0x00a4
        L_0x003d:
            com.google.common.f.e r0 = f265505d     // Catch:{ all -> 0x012f }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x012f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "GacsOutputController"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x012f }
            java.lang.String r1 = "Sending TTS pause"
            r2 = 17570(0x44a2, float:2.4621E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x012f }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.n r0 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94916n.TTS_PAUSED     // Catch:{ all -> 0x012f }
            r10.mo88810a(r0)     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.cm r0 = com.google.assistant.p3739a.p3740a.C48106cm.f124507b     // Catch:{ all -> 0x012f }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.cl r0 = (com.google.assistant.p3739a.p3740a.C48105cl) r0     // Catch:{ all -> 0x012f }
            r0.copyOnWrite()     // Catch:{ all -> 0x012f }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.cm r1 = (com.google.assistant.p3739a.p3740a.C48106cm) r1     // Catch:{ all -> 0x012f }
            r2 = 1
            r1.f124509a = r2     // Catch:{ all -> 0x012f }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.cm r0 = (com.google.assistant.p3739a.p3740a.C48106cm) r0     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.az r1 = com.google.assistant.p3739a.p3740a.C48065az.f124397c     // Catch:{ all -> 0x012f }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.ay r1 = (com.google.assistant.p3739a.p3740a.C48064ay) r1     // Catch:{ all -> 0x012f }
            r1.copyOnWrite()     // Catch:{ all -> 0x012f }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.az r2 = (com.google.assistant.p3739a.p3740a.C48065az) r2     // Catch:{ all -> 0x012f }
            r0.getClass()     // Catch:{ all -> 0x012f }
            r2.f124400b = r0     // Catch:{ all -> 0x012f }
            r0 = 4
            r2.f124399a = r0     // Catch:{ all -> 0x012f }
            com.google.protobuf.bv r0 = r1.build()     // Catch:{ all -> 0x012f }
            com.google.assistant.a.a.az r0 = (com.google.assistant.p3739a.p3740a.C48065az) r0     // Catch:{ all -> 0x012f }
            r10.m156664u(r0)     // Catch:{ all -> 0x012f }
            r10.m156661r()     // Catch:{ all -> 0x012f }
            com.google.common.util.concurrent.db r0 = r10.f265509e     // Catch:{ all -> 0x012f }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.m r1 = new com.google.android.apps.gsa.staticplugins.bisto.ac.b.m     // Catch:{ all -> 0x012f }
            r1.<init>(r10)     // Catch:{ all -> 0x012f }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x012f }
            r3 = 10000(0x2710, double:4.9407E-320)
            com.google.common.util.concurrent.cz r0 = r0.mo29164d(r1, r3, r2)     // Catch:{ all -> 0x012f }
            r10.f265508c = r0     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            return
        L_0x00a4:
            if (r0 <= r1) goto L_0x00aa
            boolean r3 = r10.f265517m     // Catch:{ all -> 0x012f }
            if (r3 != 0) goto L_0x00b1
        L_0x00aa:
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x012f }
            int r0 = r0 / r2
            int r1 = r0 * 60
        L_0x00b1:
            if (r1 != 0) goto L_0x00b5
            monitor-exit(r10)
            return
        L_0x00b5:
            int r0 = r10.f265518n     // Catch:{ all -> 0x012f }
            int r0 = r0 - r1
            r10.f265518n = r0     // Catch:{ all -> 0x012f }
            com.google.common.f.e r0 = f265505d     // Catch:{ all -> 0x012f }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x012f }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012f }
            java.lang.String r4 = "GacsOutputController"
            r0.mo56378ag(r3, r4)     // Catch:{ all -> 0x012f }
            java.lang.String r3 = "Sending %d bytes"
            r4 = 17569(0x44a1, float:2.462E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56387q(r3, r1)     // Catch:{ all -> 0x012f }
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ all -> 0x012f }
            r0.<init>()     // Catch:{ all -> 0x012f }
        L_0x00d3:
            if (r1 <= 0) goto L_0x00e5
            com.google.android.libraries.p.a r3 = r10.f265514j     // Catch:{ all -> 0x012f }
            int r4 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x012f }
            byte[] r3 = r3.mo36824b(r4)     // Catch:{ all -> 0x012f }
            r0.add(r3)     // Catch:{ all -> 0x012f }
            int r1 = r1 + -60
            goto L_0x00d3
        L_0x00e5:
            r10.m156665v(r0)     // Catch:{ all -> 0x012f }
            r10.m156662s()     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            return
        L_0x00ed:
            boolean r0 = r10.f265517m     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00f3
            monitor-exit(r10)
            return
        L_0x00f3:
            com.google.common.f.e r0 = f265505d     // Catch:{ all -> 0x012f }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x012f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "GacsOutputController"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x012f }
            java.lang.String r1 = "Sending IDLE"
            r2 = 17568(0x44a0, float:2.4618E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x012f }
            boolean r0 = r10.f265520p     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x011d
            r1 = 3
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            com.google.assistant.a.a.ce r6 = com.google.assistant.p3739a.p3740a.C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED     // Catch:{ all -> 0x012f }
            r7 = 0
            r8 = 1
            r9 = 0
            com.google.assistant.a.a.az r0 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94935c.m156745d(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x012f }
            r10.m156664u(r0)     // Catch:{ all -> 0x012f }
            goto L_0x0127
        L_0x011d:
            com.google.assistant.a.a.ce r0 = com.google.assistant.p3739a.p3740a.C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED     // Catch:{ all -> 0x012f }
            r1 = 0
            com.google.assistant.a.a.az r0 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94935c.m156742a(r0, r1)     // Catch:{ all -> 0x012f }
            r10.m156664u(r0)     // Catch:{ all -> 0x012f }
        L_0x0127:
            r10.m156663t()     // Catch:{ all -> 0x012f }
            r10.m156666w()     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            return
        L_0x012f:
            r0 = move-exception
            monitor-exit(r10)
            goto L_0x0133
        L_0x0132:
            throw r0
        L_0x0133:
            goto L_0x0132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94917o.m156662s():void");
    }

    /* renamed from: t */
    private final synchronized void m156663t() {
        m156660B(5);
        mo88810a(C94916n.DONE);
        this.f265521q = 0;
    }

    /* renamed from: u */
    private final synchronized void m156664u(C48065az azVar) {
        this.f265513i.mo88663s(C94936d.CONTROL_OUTPUT, azVar.toByteArray());
    }

    /* renamed from: v */
    private final synchronized void m156665v(ArrayDeque arrayDeque) {
        this.f265513i.mo88662q(C94936d.TTS_OUTPUT, arrayDeque);
    }

    /* renamed from: w */
    private final synchronized void m156666w() {
        for (String x : this.f265507b) {
            m156667x(x);
        }
        this.f265507b.clear();
    }

    /* renamed from: x */
    private final synchronized void m156667x(String str) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17592)).mo56386p("Sending GACS_CLIENT_OP_RESULT");
        Bundle bundle = new Bundle();
        bundle.putString("extra_client_op_id", str);
        ((C95857h) this.f265512h.mo27525b()).mo89824a(amo.BISTO_WORK_REQUEST, C87739bu.GACS_CLIENT_OP_RESULT, bundle);
    }

    /* renamed from: z */
    private final synchronized void m156669z(long j, boolean z, int i) {
        m156668y(j, z);
        this.f265518n = i;
        this.f265519o = this.f265513i.mo88653A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo88810a(C94916n nVar) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17572)).mo56354G("From %s to %s", this.f265506a, nVar);
        this.f265506a = nVar;
    }

    /* renamed from: b */
    public final synchronized void mo88811b(String str) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17573)).mo56386p("onFinalRecognizedText");
        if (m156659A(C94916n.WAITING_FOR_RESPONSE)) {
            m156660B(3);
            if (this.f265516l && str != null && !str.equals(this.f265515k)) {
                m156664u(C94935c.m156743b(this.f265521q, str, false, 0));
            }
            m156664u(C94935c.m156744c(this.f265521q));
        }
    }

    /* renamed from: c */
    public final synchronized void mo88812c(C48098ce ceVar) {
        m156664u(C94935c.m156742a(ceVar, (String) null));
        m156663t();
    }

    /* renamed from: d */
    public final synchronized void mo88813d() {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17574)).mo56386p("onListeningComplete");
        if (m156659A(C94916n.WAITING_FOR_RESPONSE)) {
            m156660B(3);
            m156664u(C94935c.m156744c(this.f265521q));
        }
    }

    /* renamed from: e */
    public final synchronized void mo88814e() {
        if (m156659A(C94916n.DONE)) {
            C59104x b = f265505d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsOutputController");
            ((C59052c) ((C59052c) b).mo56372aa(17576)).mo56386p("Skip query cancel in DONE state");
            return;
        }
        C59104x b2 = f265505d.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b2).mo56372aa(17575)).mo56386p("onQueryCanceled");
        m156664u(C94935c.m156742a(C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED, (String) null));
        m156661r();
        m156663t();
    }

    /* renamed from: f */
    public final synchronized void mo88815f(C48098ce ceVar) {
        C59071e eVar = f265505d;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17577)).mo56386p("onQueryCompleted");
        if (m156659A(C94916n.WAITING_FOR_RESPONSE, C94916n.STREAMING_TTS, C94916n.TTS_PAUSED)) {
            if (ceVar != C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED) {
                m156664u(C94935c.m156742a(ceVar, (String) null));
                m156663t();
            } else if (this.f265506a == C94916n.WAITING_FOR_RESPONSE) {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GacsOutputController");
                ((C59052c) ((C59052c) d).mo56372aa(17578)).mo56386p("Query complete with no response");
                m156664u(C94935c.m156742a(C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED, (String) null));
                m156663t();
            } else {
                this.f265517m = true;
                m156662s();
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo88816g(C48111h hVar, String str) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17579)).mo56386p("onQueryResponse");
        if (m156659A(C94916n.WAITING_FOR_RESPONSE, C94916n.STREAMING_TTS, C94916n.TTS_PAUSED)) {
            m156660B(4);
            m156664u(C94935c.m156745d(6, Long.valueOf(this.f265521q), (String) null, false, 0, C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED, hVar, false, (String) null));
            if (str != null) {
                m156667x(str);
            }
            if (this.f265506a == C94916n.WAITING_FOR_RESPONSE) {
                mo88810a(C94916n.STREAMING_TTS);
            }
            m156662s();
        }
    }

    /* renamed from: h */
    public final synchronized void mo88817h(long j, boolean z, int i) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17580)).mo56386p("onQueryStarted");
        m156669z(j, z, i);
        m156664u(C94935c.m156743b(j, (String) null, false, 0));
    }

    /* renamed from: i */
    public final synchronized void mo88818i() {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17581)).mo56386p("onStartOfSpeech");
    }

    /* renamed from: j */
    public final synchronized void mo88819j(long j, int i) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17582)).mo56386p("onTextQueryStarted");
        m156669z(j, false, i);
        m156664u(C94935c.m156744c(j));
    }

    /* renamed from: k */
    public final synchronized void mo88820k() {
        C59104x c = f265505d.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) c).mo56372aa(17583)).mo56386p("timeoutWaitingForTtsControl");
        this.f265508c = null;
        mo88815f(C48098ce.QUERY_FAILED);
    }

    /* renamed from: l */
    public final synchronized void mo88821l(String str) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17584)).mo56386p("onTranscriptionResponse");
        if (m156659A(C94916n.WAITING_FOR_RESPONSE)) {
            m156664u(C94935c.m156745d(6, Long.valueOf(this.f265521q), str, false, 0, C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED, (C48111h) null, false, (String) null));
            mo88810a(C94916n.STREAMING_TTS);
        }
    }

    /* renamed from: m */
    public final synchronized void mo88822m(long j, boolean z) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17585)).mo56386p("onTranscriptionStarted");
        m156668y(j, z);
        m156664u(C94935c.m156743b(j, (String) null, false, 0));
    }

    /* renamed from: n */
    public final synchronized void mo88823n(byte[] bArr, String str) {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        int length = bArr.length;
        ((C59052c) ((C59052c) b).mo56372aa(17586)).mo56387q("onTts: %d bytes", length);
        if (m156659A(C94916n.WAITING_FOR_RESPONSE, C94916n.STREAMING_TTS, C94916n.TTS_PAUSED)) {
            this.f265514j.mo36825c(bArr, length);
            m156662s();
            if (str != null) {
                this.f265507b.add(str);
            }
        }
    }

    /* renamed from: o */
    public final synchronized void mo88824o(C48104ck ckVar) {
        C59071e eVar = f265505d;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17587)).mo56386p("onTtsControl");
        if (m156659A(C94916n.WAITING_FOR_RESPONSE, C94916n.STREAMING_TTS, C94916n.TTS_PAUSED)) {
            m156661r();
            if (ckVar.f124506b) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "GacsOutputController");
                ((C59052c) ((C59052c) b2).mo56372aa(17589)).mo56386p("Stopping TTS");
                this.f265513i.mo88658d(C94936d.TTS_OUTPUT);
                this.f265519o = false;
            } else {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "GacsOutputController");
                ((C59052c) ((C59052c) b3).mo56372aa(17588)).mo56387q("Request for %d bytes", ckVar.f124505a);
                this.f265518n += ckVar.f124505a;
            }
            if (this.f265506a == C94916n.TTS_PAUSED) {
                mo88810a(C94916n.STREAMING_TTS);
            }
            m156662s();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo88825p(java.lang.String r4, boolean r5, int r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.common.f.e r0 = f265505d     // Catch:{ all -> 0x0040 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0040 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "GacsOutputController"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "onUpdateRecognizedText"
            r2 = 17590(0x44b6, float:2.4649E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0040 }
            r0 = 1
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.n[] r0 = new com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94916n[r0]     // Catch:{ all -> 0x0040 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.b.n r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94916n.WAITING_FOR_RESPONSE     // Catch:{ all -> 0x0040 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0040 }
            boolean r0 = r3.m156659A(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0025
            monitor-exit(r3)
            return
        L_0x0025:
            boolean r0 = r3.f265516l     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r3.f265515k     // Catch:{ all -> 0x0040 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003e
            r3.f265515k = r4     // Catch:{ all -> 0x0040 }
            long r0 = r3.f265521q     // Catch:{ all -> 0x0040 }
            com.google.assistant.a.a.az r4 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94935c.m156743b(r0, r4, r5, r6)     // Catch:{ all -> 0x0040 }
            r3.m156664u(r4)     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return
        L_0x003e:
            monitor-exit(r3)
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94917o.mo88825p(java.lang.String, boolean, int):void");
    }

    /* renamed from: q */
    public final synchronized void mo88826q() {
        C59104x b = f265505d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsOutputController");
        ((C59052c) ((C59052c) b).mo56372aa(17591)).mo56386p("requestFollowOn");
        if (m156659A(C94916n.STREAMING_TTS, C94916n.TTS_PAUSED)) {
            this.f265517m = true;
            this.f265520p = true;
            m156662s();
        }
    }

    /* renamed from: y */
    private final synchronized void m156668y(long j, boolean z) {
        C31091a aVar = this.f265514j;
        int i = aVar.f83743b;
        int i2 = aVar.f83742a;
        int i3 = i2 + (i - i2);
        if (i3 <= i) {
            aVar.f83742a = i3;
            this.f265517m = false;
            this.f265520p = false;
            this.f265515k = null;
            this.f265516l = z;
            m156661r();
            this.f265519o = false;
            this.f265521q = j;
            m156660B(2);
            mo88810a(C94916n.WAITING_FOR_RESPONSE);
        } else {
            throw new IllegalStateException("Byte queue is too short");
        }
    }
}
