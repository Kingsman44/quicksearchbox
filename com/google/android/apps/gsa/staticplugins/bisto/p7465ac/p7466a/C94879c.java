package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.util.Pair;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95297c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60066jo;
import com.google.common.p4552o.C60069jr;
import com.google.common.p4580v.C60948g;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.c */
/* compiled from: PG */
final class C94879c implements C94869ar {

    /* renamed from: a */
    final /* synthetic */ C94887k f265357a;

    public C94879c(C94887k kVar) {
        this.f265357a = kVar;
    }

    /* renamed from: a */
    public final void mo88711a() {
        C94887k kVar = this.f265357a;
        kVar.f265375H.mo88725h();
        kVar.f265375H.mo88723f();
        try {
            kVar.mo88745b();
            kVar.mo88759w(kVar.f265396m);
            kVar.mo88759w(kVar.f265395l);
            kVar.mo88759w(kVar.f265398o);
            kVar.mo88759w(kVar.f265397n);
            if (kVar.mo88761y()) {
                kVar.mo88758v(kVar.f265397n);
                C59104x b = C94887k.f265367a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) b).mo56372aa(17311)).mo56389s("[%s] Requesting a reset link", C94876ay.m156554c(kVar.f265385b));
                kVar.f265405v.mo88841b();
                return;
            }
            kVar.mo88749h(new C94877az(3));
            kVar.f265390g.mo83384Z(kVar.f265385b.f265818a.getAddress(), C124715m.GATT_CONNECTED);
            kVar.mo88757r();
            if (!kVar.f265372E.get()) {
                kVar.mo88747f();
            }
        } catch (C94893q e) {
            C59104x c = C94887k.f265367a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17287)).mo56389s("[%s] Failed to set up GACS connection.", C94876ay.m156554c(kVar.f265385b));
            int i = e.f265431a;
            if (i == 0) {
                i = 14;
            }
            C95297c cVar = kVar.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 11;
            jrVar.f162381a |= 2;
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 512;
            jrVar2.f162390j = i;
            cVar.mo89225a(joVar);
            kVar.mo88754m(Integer.valueOf(e.f265431a));
            kVar.mo88755o();
        }
    }

    /* renamed from: b */
    public final void mo88712b() {
        this.f265357a.mo88755o();
        C94887k kVar = this.f265357a;
        kVar.f265390g.mo83384Z(kVar.f265385b.f265818a.getAddress(), C124715m.NOT_CONNECTED);
    }

    /* renamed from: c */
    public final void mo88713c(C94893q qVar) {
        C59104x c = C94887k.f265367a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(qVar)).mo56372aa(17253)).mo56389s("[%s] Gatt operation failed.", C94876ay.m156554c(this.f265357a.f265385b));
        C95297c cVar = this.f265357a.f265408y;
        C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
        joVar.copyOnWrite();
        C60069jr jrVar = (C60069jr) joVar.instance;
        jrVar.f162383c = 11;
        jrVar.f162381a |= 2;
        joVar.copyOnWrite();
        C60069jr jrVar2 = (C60069jr) joVar.instance;
        jrVar2.f162381a |= 512;
        jrVar2.f162390j = 4;
        cVar.mo89225a(joVar);
        this.f265357a.mo88754m(Integer.valueOf(qVar.f265431a));
        this.f265357a.mo88755o();
    }

    /* renamed from: d */
    public final void mo88714d() {
        synchronized (this.f265357a.f265409z) {
            C94868aq aqVar = this.f265357a.f265403t;
            if (aqVar == null) {
                C59104x d = C94887k.f265367a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) d).mo56372aa(17257)).mo56386p("GATT helper was null, ignoring service changed");
                return;
            }
            aqVar.mo88709o(false);
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156554c(this.f265357a.f265385b);
            try {
                this.f265357a.mo88745b();
            } catch (C94893q e) {
                C59104x d2 = C94887k.f265367a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(17256)).mo56389s("[%s] There was an exception while trying to update held characteristics", C94876ay.m156554c(this.f265357a.f265385b));
            }
            this.f265357a.f265403t.mo88709o(true);
            this.f265357a.f265370C = false;
            C59104x b = C94887k.f265367a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) b).mo56372aa(17255)).mo56386p("execute next operation after service changed");
            this.f265357a.mo88753l();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0549, code lost:
        if (r7 != 2) goto L_0x054b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88715e(java.util.UUID r19, byte[] r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.k r4 = r1.f265357a
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f265371D
            boolean r4 = r4.get()
            java.lang.String r5 = "BistoBleConnection"
            if (r4 != 0) goto L_0x002d
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.f265367a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r5)
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.k r3 = r1.f265357a
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r3 = r3.f265385b
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r3)
            r4 = 17259(0x436b, float:2.4185E-41)
            java.lang.String r5 = "[%s] Skip onNotification during shutdown"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r5, r3)
            return
        L_0x002d:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.os.SystemClock.elapsedRealtime()
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.k r4 = r1.f265357a
            android.os.SystemClock.elapsedRealtime()
            java.util.UUID r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94872au.f265316c
            boolean r6 = r6.equals(r2)
            r7 = 8
            r8 = 0
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L_0x00ec
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r2 = r4.f265385b
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r2)
            boolean r2 = r4.mo88761y()     // Catch:{ d -> 0x00a2 }
            if (r2 == 0) goto L_0x0077
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.av r2 = r4.f265375H     // Catch:{ d -> 0x00a2 }
            java.util.concurrent.atomic.AtomicInteger r6 = r2.f265325d     // Catch:{ d -> 0x00a2 }
            r6.addAndGet(r10)     // Catch:{ d -> 0x00a2 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f265338q     // Catch:{ d -> 0x00a2 }
            r2.set(r10)     // Catch:{ d -> 0x00a2 }
            com.google.android.libraries.assistant.accessory.a.c r2 = r4.f265399p     // Catch:{ d -> 0x00a2 }
            java.lang.String r6 = "Control"
            byte[] r2 = r4.mo88743B(r2, r3, r6)     // Catch:{ d -> 0x00a2 }
            if (r2 == 0) goto L_0x007c
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r3 = r4.f265385b     // Catch:{ d -> 0x00a2 }
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r3)     // Catch:{ d -> 0x00a2 }
            android.util.Base64.encodeToString(r2, r8)     // Catch:{ d -> 0x00a2 }
            byte[] r2 = r4.mo88744C(r2, r8)     // Catch:{ d -> 0x00a2 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r3 = r4.f265387d     // Catch:{ d -> 0x00a2 }
            r3.mo88847a(r2)     // Catch:{ d -> 0x00a2 }
            goto L_0x007c
        L_0x0077:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265387d     // Catch:{ d -> 0x00a2 }
            r2.mo88847a(r3)     // Catch:{ d -> 0x00a2 }
        L_0x007c:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265387d     // Catch:{ d -> 0x00a2 }
            byte[] r2 = r2.mo88849c()     // Catch:{ d -> 0x00a2 }
        L_0x0082:
            if (r2 == 0) goto L_0x082f
            java.lang.String r3 = "Incoming control:"
            r4.mo88752k(r3, r2)     // Catch:{ d -> 0x00a2 }
            com.google.android.apps.gsa.shared.bisto.k r3 = r4.f265391h     // Catch:{ d -> 0x00a2 }
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.m156572E(r10, r10, r2, r3)     // Catch:{ d -> 0x00a2 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.f.b r3 = r4.f265394k     // Catch:{ d -> 0x00a2 }
            if (r3 == 0) goto L_0x009b
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.e r3 = r3.mo88871a()     // Catch:{ d -> 0x00a2 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.d r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d.CONTROL_INPUT     // Catch:{ d -> 0x00a2 }
            r3.mo88800b(r6, r2)     // Catch:{ d -> 0x00a2 }
        L_0x009b:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265387d     // Catch:{ d -> 0x00a2 }
            byte[] r2 = r2.mo88849c()     // Catch:{ d -> 0x00a2 }
            goto L_0x0082
        L_0x00a2:
            r0 = move-exception
            r2 = r0
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.f265367a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r5)
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r5 = r4.f265385b
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r5)
            r6 = 17297(0x4391, float:2.4238E-41)
            java.lang.String r10 = "[%s] Unable to process control data"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r6)).mo56389s(r10, r5)
            com.google.android.apps.gsa.staticplugins.bisto.f.c r2 = r4.f265408y
            com.google.common.o.jr r3 = com.google.common.p4552o.C60069jr.f162379n
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.jo r3 = (com.google.common.p4552o.C60066jo) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.jr r5 = (com.google.common.p4552o.C60069jr) r5
            r5.f162383c = r7
            int r6 = r5.f162381a
            r6 = r6 | r9
            r5.f162381a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.jr r5 = (com.google.common.p4552o.C60069jr) r5
            int r6 = r5.f162381a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.f162381a = r6
            r6 = 12
            r5.f162390j = r6
            r2.mo89225a(r3)
            r4.mo88750i(r8)
            return
        L_0x00ec:
            java.util.UUID r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94872au.f265317d
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x01cb
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r2 = r4.f265385b
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r2)
            boolean r2 = r4.mo88761y()     // Catch:{ d -> 0x0181 }
            if (r2 == 0) goto L_0x0127
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.av r2 = r4.f265375H     // Catch:{ d -> 0x0181 }
            java.util.concurrent.atomic.AtomicInteger r6 = r2.f265327f     // Catch:{ d -> 0x0181 }
            r6.addAndGet(r10)     // Catch:{ d -> 0x0181 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f265338q     // Catch:{ d -> 0x0181 }
            r2.set(r10)     // Catch:{ d -> 0x0181 }
            com.google.android.libraries.assistant.accessory.a.c r2 = r4.f265400q     // Catch:{ d -> 0x0181 }
            java.lang.String r6 = "Audio"
            byte[] r2 = r4.mo88743B(r2, r3, r6)     // Catch:{ d -> 0x0181 }
            if (r2 == 0) goto L_0x012c
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r3 = r4.f265385b     // Catch:{ d -> 0x0181 }
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r3)     // Catch:{ d -> 0x0181 }
            android.util.Base64.encodeToString(r2, r8)     // Catch:{ d -> 0x0181 }
            byte[] r2 = r4.mo88744C(r2, r10)     // Catch:{ d -> 0x0181 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r3 = r4.f265388e     // Catch:{ d -> 0x0181 }
            r3.mo88847a(r2)     // Catch:{ d -> 0x0181 }
            goto L_0x012c
        L_0x0127:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265388e     // Catch:{ d -> 0x0181 }
            r2.mo88847a(r3)     // Catch:{ d -> 0x0181 }
        L_0x012c:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.f265367a     // Catch:{ d -> 0x0181 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ d -> 0x0181 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ d -> 0x0181 }
            r2.mo56378ag(r3, r5)     // Catch:{ d -> 0x0181 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ d -> 0x0181 }
            r3 = 17293(0x438d, float:2.4233E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ d -> 0x0181 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ d -> 0x0181 }
            java.lang.String r3 = "onNotification - audio ingested"
            r2.mo56386p(r3)     // Catch:{ d -> 0x0181 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265388e     // Catch:{ d -> 0x0181 }
            byte[] r2 = r2.mo88849c()     // Catch:{ d -> 0x0181 }
        L_0x014c:
            if (r2 == 0) goto L_0x082f
            com.google.android.apps.gsa.shared.bisto.k r3 = r4.f265391h     // Catch:{ d -> 0x0181 }
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.m156572E(r10, r9, r2, r3)     // Catch:{ d -> 0x0181 }
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.f265367a     // Catch:{ d -> 0x0181 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ d -> 0x0181 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ d -> 0x0181 }
            r3.mo56378ag(r6, r5)     // Catch:{ d -> 0x0181 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ d -> 0x0181 }
            r6 = 17294(0x438e, float:2.4234E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r6)     // Catch:{ d -> 0x0181 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ d -> 0x0181 }
            java.lang.String r6 = "onNotification - sending to handle audio"
            r3.mo56386p(r6)     // Catch:{ d -> 0x0181 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.f.b r3 = r4.f265394k     // Catch:{ d -> 0x0181 }
            if (r3 == 0) goto L_0x017a
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.e r3 = r3.mo88871a()     // Catch:{ d -> 0x0181 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.d r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d.AUDIO_INPUT     // Catch:{ d -> 0x0181 }
            r3.mo88800b(r6, r2)     // Catch:{ d -> 0x0181 }
        L_0x017a:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265388e     // Catch:{ d -> 0x0181 }
            byte[] r2 = r2.mo88849c()     // Catch:{ d -> 0x0181 }
            goto L_0x014c
        L_0x0181:
            r0 = move-exception
            r2 = r0
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.f265367a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r5)
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r5 = r4.f265385b
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r5)
            r6 = 17295(0x438f, float:2.4235E-41)
            java.lang.String r10 = "[%s] Unable to process audio data"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r6)).mo56389s(r10, r5)
            com.google.android.apps.gsa.staticplugins.bisto.f.c r2 = r4.f265408y
            com.google.common.o.jr r3 = com.google.common.p4552o.C60069jr.f162379n
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.jo r3 = (com.google.common.p4552o.C60066jo) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.jr r5 = (com.google.common.p4552o.C60069jr) r5
            r5.f162383c = r7
            int r6 = r5.f162381a
            r6 = r6 | r9
            r5.f162381a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.jr r5 = (com.google.common.p4552o.C60069jr) r5
            int r6 = r5.f162381a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.f162381a = r6
            r6 = 13
            r5.f162390j = r6
            r2.mo89225a(r3)
            r4.mo88750i(r8)
            return
        L_0x01cb:
            java.util.UUID r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94872au.f265318e
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x077d
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r2 = r4.f265385b
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r2)
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r2 = r4.f265385b
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r2)
            android.util.Base64.encodeToString(r3, r8)
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.av r2 = r4.f265375H
            java.util.concurrent.atomic.AtomicInteger r5 = r2.f265323b
            r5.addAndGet(r10)
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f265338q
            r2.set(r10)
            com.google.android.libraries.assistant.accessory.a.c r2 = r4.f265402s
            java.lang.String r5 = "Crypto"
            byte[] r2 = r4.mo88743B(r2, r3, r5)
            if (r2 == 0) goto L_0x082f
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.c r3 = r4.f265405v
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = "BistoCryptoDataHandler"
            r5.mo56378ag(r6, r12)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            r6 = 17636(0x44e4, float:2.4713E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.String r6 = "[%s] handleNotification"
            java.lang.String r13 = r3.f265552e
            r5.mo56389s(r6, r13)
            java.lang.String r5 = r3.f265552e
            android.util.Base64.encodeToString(r2, r8)
            r6 = 3
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.f169869a     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.s r13 = com.google.assistant.p3739a.p3740a.C48122s.f124539c     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r8 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (byte[]) r2, (com.google.protobuf.C62921ba) r8)     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.s r8 = (com.google.assistant.p3739a.p3740a.C48122s) r8     // Catch:{ IOException -> 0x0725 }
            int r13 = r8.f124541a     // Catch:{ IOException -> 0x0725 }
            r15 = 7
            if (r13 != r10) goto L_0x0508
            java.lang.Object r13 = r8.f124542b     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.bh r13 = (com.google.assistant.p3739a.p3740a.C48074bh) r13     // Catch:{ IOException -> 0x0725 }
            int r5 = r13.f124423e     // Catch:{ IOException -> 0x0725 }
            int r16 = com.google.assistant.p3739a.p3740a.C48077bk.m85179b(r5)     // Catch:{ IOException -> 0x0725 }
            if (r16 != 0) goto L_0x0239
            r16 = 1
        L_0x0239:
            int r14 = r16 + -2
            if (r14 == r10) goto L_0x0290
            if (r14 == r9) goto L_0x024d
            java.lang.String r13 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            int r5 = com.google.assistant.p3739a.p3740a.C48077bk.m85179b(r5)     // Catch:{ IOException -> 0x0725 }
            if (r5 != 0) goto L_0x0248
            r5 = 1
        L_0x0248:
            com.google.assistant.p3739a.p3740a.C48077bk.m85178a(r5)     // Catch:{ IOException -> 0x0725 }
            goto L_0x0508
        L_0x024d:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r13, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r13 = 17627(0x44db, float:2.47E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r13)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r13 = "[%s] Resetting link state"
            java.lang.String r14 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r5.mo56389s(r13, r14)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            r5.mo88739e()     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.f.c r5 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r13 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r13 = (com.google.common.p4552o.C60066jo) r13     // Catch:{ IOException -> 0x0725 }
            r13.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r14 = (com.google.common.p4552o.C60069jr) r14     // Catch:{ IOException -> 0x0725 }
            r14.f162383c = r9     // Catch:{ IOException -> 0x0725 }
            int r7 = r14.f162381a     // Catch:{ IOException -> 0x0725 }
            r7 = r7 | r9
            r14.f162381a = r7     // Catch:{ IOException -> 0x0725 }
            r5.mo89225a(r13)     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r5 = r3.f265557j     // Catch:{ IOException -> 0x0725 }
            r5.getAndSet(r10)     // Catch:{ IOException -> 0x0725 }
            goto L_0x0508
        L_0x0290:
            java.util.concurrent.atomic.AtomicInteger r5 = r3.f265557j     // Catch:{ IOException -> 0x0725 }
            int r5 = r5.get()     // Catch:{ IOException -> 0x0725 }
            if (r5 <= r10) goto L_0x02e0
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r7, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r7 = 17635(0x44e3, float:2.4712E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r7 = "[%s] Received unexpected link config request"
            java.lang.String r13 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r5.mo56389s(r7, r13)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.f.c r5 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r7 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r7 = (com.google.common.p4552o.C60066jo) r7     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r13 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r13 = (com.google.common.p4552o.C60069jr) r13     // Catch:{ IOException -> 0x0725 }
            r13.f162383c = r6     // Catch:{ IOException -> 0x0725 }
            int r14 = r13.f162381a     // Catch:{ IOException -> 0x0725 }
            r14 = r14 | r9
            r13.f162381a = r14     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r13 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r13 = (com.google.common.p4552o.C60069jr) r13     // Catch:{ IOException -> 0x0725 }
            int r14 = r13.f162381a     // Catch:{ IOException -> 0x0725 }
            r14 = r14 | 512(0x200, float:7.175E-43)
            r13.f162381a = r14     // Catch:{ IOException -> 0x0725 }
            r13.f162390j = r15     // Catch:{ IOException -> 0x0725 }
            r5.mo89225a(r7)     // Catch:{ IOException -> 0x0725 }
            goto L_0x0508
        L_0x02e0:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r7, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r7 = 17628(0x44dc, float:2.4702E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r7 = "[%s] Received link config request"
            java.lang.String r14 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r5.mo56389s(r7, r14)     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r5 = r3.f265557j     // Catch:{ IOException -> 0x0725 }
            r5.getAndSet(r9)     // Catch:{ IOException -> 0x0725 }
            com.google.android.libraries.assistant.accessory.gmutls.e r5 = r3.f265549b     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.f36212c     // Catch:{ IOException -> 0x0725 }
            boolean r7 = r7.contains(r3)     // Catch:{ IOException -> 0x0725 }
            if (r7 != 0) goto L_0x0310
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f36212c     // Catch:{ IOException -> 0x0725 }
            r5.add(r3)     // Catch:{ IOException -> 0x0725 }
        L_0x0310:
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            int r7 = r13.f124419a     // Catch:{ IOException -> 0x0725 }
            int r7 = r7 + -3
            r5.mo88740f(r7)     // Catch:{ IOException -> 0x0725 }
            int r5 = r3.f265559l     // Catch:{ IOException -> 0x0725 }
            int r7 = r13.f124422d     // Catch:{ IOException -> 0x0725 }
            r3.f265559l = r7     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r7.mo56378ag(r14, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            r14 = 17629(0x44dd, float:2.4703E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r14)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            java.lang.String r14 = "[%s] Old pmtu %d, new pmtu %d"
            java.lang.String r15 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0725 }
            int r11 = r3.f265559l     // Catch:{ IOException -> 0x0725 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0725 }
            r7.mo56359L(r14, r15, r10, r11)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r7 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            int r10 = r3.f265559l     // Catch:{ IOException -> 0x0725 }
            r7.mo88742h(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.f.c r7 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r10 = (com.google.common.p4552o.C60066jo) r10     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r11 = (com.google.common.p4552o.C60069jr) r11     // Catch:{ IOException -> 0x0725 }
            r11.f162383c = r6     // Catch:{ IOException -> 0x0725 }
            int r14 = r11.f162381a     // Catch:{ IOException -> 0x0725 }
            r14 = r14 | r9
            r11.f162381a = r14     // Catch:{ IOException -> 0x0725 }
            int r11 = r13.f124419a     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r14 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r14 = (com.google.common.p4552o.C60069jr) r14     // Catch:{ IOException -> 0x0725 }
            int r15 = r14.f162381a     // Catch:{ IOException -> 0x0725 }
            r17 = 4
            r15 = r15 | 4
            r14.f162381a = r15     // Catch:{ IOException -> 0x0725 }
            r14.f162384d = r11     // Catch:{ IOException -> 0x0725 }
            int r11 = r3.f265559l     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r14 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r14 = (com.google.common.p4552o.C60069jr) r14     // Catch:{ IOException -> 0x0725 }
            int r15 = r14.f162381a     // Catch:{ IOException -> 0x0725 }
            r16 = 8
            r15 = r15 | 8
            r14.f162381a = r15     // Catch:{ IOException -> 0x0725 }
            r14.f162385e = r11     // Catch:{ IOException -> 0x0725 }
            r7.mo89225a(r10)     // Catch:{ IOException -> 0x0725 }
            int r7 = r13.f124424f     // Catch:{ IOException -> 0x0725 }
            r10 = 30
            int r7 = java.lang.Math.min(r7, r10)     // Catch:{ IOException -> 0x0725 }
            r3.f265555h = r7     // Catch:{ IOException -> 0x0725 }
            com.google.android.libraries.assistant.accessory.gmutls.e r7 = r3.f265549b     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f36213d     // Catch:{ IOException -> 0x0725 }
            int r7 = r7.get()     // Catch:{ IOException -> 0x0725 }
            r10 = 1
            if (r7 != r10) goto L_0x0482
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r7, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r7 = 17632(0x44e0, float:2.4708E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r7 = "[%s] GmuTls was not initialized, initializing..."
            java.lang.String r10 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r5.mo56389s(r7, r10)     // Catch:{ IOException -> 0x0725 }
            byte[] r5 = r3.f265558k     // Catch:{ IOException -> 0x0725 }
            if (r5 != 0) goto L_0x0411
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r7, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r7 = 17634(0x44e2, float:2.471E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r7 = "[%s] Empty encryption key"
            java.lang.String r10 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r5.mo56389s(r7, r10)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.f.c r5 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r7 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r7 = (com.google.common.p4552o.C60066jo) r7     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            r11 = 7
            r10.f162383c = r11     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | r9
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            r11 = 5
            r10.f162390j = r11     // Catch:{ IOException -> 0x0725 }
            r5.mo89225a(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            r5.mo88737c()     // Catch:{ IOException -> 0x0725 }
            goto L_0x0508
        L_0x0411:
            com.google.android.libraries.assistant.accessory.gmutls.e r7 = r3.f265549b     // Catch:{ IOException -> 0x0725 }
            int r10 = r3.f265559l     // Catch:{ IOException -> 0x0725 }
            boolean r5 = r7.mo19483h(r5, r10)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r7.mo56378ag(r10, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            r10 = 17633(0x44e1, float:2.4709E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            java.lang.String r10 = "[%s] Is init success? %b"
            java.lang.String r11 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r7.mo56355H(r10, r11, r5)     // Catch:{ IOException -> 0x0725 }
            if (r5 == 0) goto L_0x044e
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            com.google.android.libraries.assistant.accessory.gmutls.e r7 = r3.f265549b     // Catch:{ IOException -> 0x0725 }
            int r7 = r7.mo19476b()     // Catch:{ IOException -> 0x0725 }
            int r10 = r3.f265555h     // Catch:{ IOException -> 0x0725 }
            int r11 = r3.f265560m     // Catch:{ IOException -> 0x0725 }
            java.lang.String r14 = r3.f265561n     // Catch:{ IOException -> 0x0725 }
            byte[] r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.m156727g(r13, r7, r10, r11, r14)     // Catch:{ IOException -> 0x0725 }
            r5.mo88735a(r7)     // Catch:{ IOException -> 0x0725 }
            goto L_0x0508
        L_0x044e:
            com.google.android.apps.gsa.staticplugins.bisto.f.c r5 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r7 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r7 = (com.google.common.p4552o.C60066jo) r7     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            r11 = 7
            r10.f162383c = r11     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | r9
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            r11 = 8
            r10.f162390j = r11     // Catch:{ IOException -> 0x0725 }
            r5.mo89225a(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            r5.mo88737c()     // Catch:{ IOException -> 0x0725 }
            goto L_0x0508
        L_0x0482:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r7.mo56378ag(r10, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            r10 = 17630(0x44de, float:2.4705E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            java.lang.String r10 = "[%s] GmuTls was already initialized"
            java.lang.String r11 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r7.mo56389s(r10, r11)     // Catch:{ IOException -> 0x0725 }
            if (r5 == 0) goto L_0x04f3
            int r7 = r3.f265559l     // Catch:{ IOException -> 0x0725 }
            if (r5 == r7) goto L_0x04f3
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r7, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r7 = 17631(0x44df, float:2.4706E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r7 = "[%s] PMTU requested is different for the same session, failing handshake"
            java.lang.String r10 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r5.mo56389s(r7, r10)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.f.c r5 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r7 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r7 = (com.google.common.p4552o.C60066jo) r7     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            r11 = 7
            r10.f162383c = r11     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | r9
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            r11 = 9
            r10.f162390j = r11     // Catch:{ IOException -> 0x0725 }
            r5.mo89225a(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            r5.mo88737c()     // Catch:{ IOException -> 0x0725 }
            goto L_0x0508
        L_0x04f3:
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            com.google.android.libraries.assistant.accessory.gmutls.e r7 = r3.f265549b     // Catch:{ IOException -> 0x0725 }
            int r7 = r7.mo19476b()     // Catch:{ IOException -> 0x0725 }
            int r10 = r3.f265555h     // Catch:{ IOException -> 0x0725 }
            int r11 = r3.f265560m     // Catch:{ IOException -> 0x0725 }
            java.lang.String r14 = r3.f265561n     // Catch:{ IOException -> 0x0725 }
            byte[] r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.m156727g(r13, r7, r10, r11, r14)     // Catch:{ IOException -> 0x0725 }
            r5.mo88735a(r7)     // Catch:{ IOException -> 0x0725 }
        L_0x0508:
            int r5 = r8.f124541a     // Catch:{ IOException -> 0x0725 }
            r7 = 4
            if (r5 != r7) goto L_0x0699
            java.lang.Object r5 = r8.f124542b     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.p r5 = (com.google.assistant.p3739a.p3740a.C48119p) r5     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r7.mo56378ag(r10, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            r10 = 17622(0x44d6, float:2.4694E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x0725 }
            java.lang.String r10 = "[%s] Received client handshake"
            java.lang.String r11 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r7.mo56389s(r10, r11)     // Catch:{ IOException -> 0x0725 }
            int r7 = r5.f124537a     // Catch:{ IOException -> 0x0725 }
            int r7 = com.google.assistant.p3739a.p3740a.C48120q.m85187b(r7)     // Catch:{ IOException -> 0x0725 }
            if (r7 != 0) goto L_0x0536
            goto L_0x0540
        L_0x0536:
            r10 = 5
            if (r7 != r10) goto L_0x0540
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.a r7 = r3.f265551d     // Catch:{ IOException -> 0x0725 }
            java.lang.String r10 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r7.mo88843a(r10)     // Catch:{ IOException -> 0x0725 }
        L_0x0540:
            int r7 = r5.f124537a     // Catch:{ IOException -> 0x0725 }
            int r7 = com.google.assistant.p3739a.p3740a.C48120q.m85187b(r7)     // Catch:{ IOException -> 0x0725 }
            if (r7 != 0) goto L_0x0549
            goto L_0x054b
        L_0x0549:
            if (r7 == r9) goto L_0x059a
        L_0x054b:
            com.google.protobuf.z r7 = r5.f124538b     // Catch:{ IOException -> 0x0725 }
            boolean r7 = r7.mo59173M()     // Catch:{ IOException -> 0x0725 }
            if (r7 == 0) goto L_0x059a
            com.google.android.apps.gsa.staticplugins.bisto.f.c r7 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r10 = (com.google.common.p4552o.C60066jo) r10     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r11 = (com.google.common.p4552o.C60069jr) r11     // Catch:{ IOException -> 0x0725 }
            r13 = 7
            r11.f162383c = r13     // Catch:{ IOException -> 0x0725 }
            int r13 = r11.f162381a     // Catch:{ IOException -> 0x0725 }
            r13 = r13 | r9
            r11.f162381a = r13     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r11 = r3.f265554g     // Catch:{ IOException -> 0x0725 }
            int r11 = r11.get()     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r13 = (com.google.common.p4552o.C60069jr) r13     // Catch:{ IOException -> 0x0725 }
            int r14 = r13.f162381a     // Catch:{ IOException -> 0x0725 }
            r14 = r14 | 32
            r13.f162381a = r14     // Catch:{ IOException -> 0x0725 }
            r13.f162386f = r11     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r11 = (com.google.common.p4552o.C60069jr) r11     // Catch:{ IOException -> 0x0725 }
            int r13 = r11.f162381a     // Catch:{ IOException -> 0x0725 }
            r13 = r13 | 512(0x200, float:7.175E-43)
            r11.f162381a = r13     // Catch:{ IOException -> 0x0725 }
            r13 = 10
            r11.f162390j = r13     // Catch:{ IOException -> 0x0725 }
            r7.mo89225a(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r7 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            r7.mo88737c()     // Catch:{ IOException -> 0x0725 }
        L_0x059a:
            com.google.android.libraries.assistant.accessory.gmutls.e r7 = r3.f265549b     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f36213d     // Catch:{ IOException -> 0x0725 }
            int r7 = r7.get()     // Catch:{ IOException -> 0x0725 }
            if (r7 >= r6) goto L_0x05d5
            com.google.android.apps.gsa.staticplugins.bisto.f.c r7 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r10 = (com.google.common.p4552o.C60066jo) r10     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r11 = (com.google.common.p4552o.C60069jr) r11     // Catch:{ IOException -> 0x0725 }
            r13 = 5
            r11.f162383c = r13     // Catch:{ IOException -> 0x0725 }
            int r13 = r11.f162381a     // Catch:{ IOException -> 0x0725 }
            r13 = r13 | r9
            r11.f162381a = r13     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r11 = r3.f265554g     // Catch:{ IOException -> 0x0725 }
            int r11 = r11.get()     // Catch:{ IOException -> 0x0725 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r13 = (com.google.common.p4552o.C60069jr) r13     // Catch:{ IOException -> 0x0725 }
            int r14 = r13.f162381a     // Catch:{ IOException -> 0x0725 }
            r14 = r14 | 32
            r13.f162381a = r14     // Catch:{ IOException -> 0x0725 }
            r13.f162386f = r11     // Catch:{ IOException -> 0x0725 }
            r7.mo89225a(r10)     // Catch:{ IOException -> 0x0725 }
        L_0x05d5:
            com.google.android.libraries.assistant.accessory.gmutls.a r7 = new com.google.android.libraries.assistant.accessory.gmutls.a     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.z r5 = r5.f124538b     // Catch:{ IOException -> 0x0725 }
            byte[] r5 = r5.mo59174N()     // Catch:{ IOException -> 0x0725 }
            r7.<init>((byte[]) r5)     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r5 = r3.f265554g     // Catch:{ IOException -> 0x0725 }
            int r10 = r7.size()     // Catch:{ IOException -> 0x0725 }
            r5.addAndGet(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.android.libraries.assistant.accessory.gmutls.a r5 = new com.google.android.libraries.assistant.accessory.gmutls.a     // Catch:{ IOException -> 0x0725 }
            int r10 = r3.f265559l     // Catch:{ IOException -> 0x0725 }
            r5.<init>((int) r10)     // Catch:{ IOException -> 0x0725 }
            com.google.android.libraries.assistant.accessory.gmutls.e r10 = r3.f265549b     // Catch:{ IOException -> 0x0725 }
            javax.net.ssl.SSLEngineResult r7 = r10.mo19479d(r7, r5)     // Catch:{ IOException -> 0x0725 }
            javax.net.ssl.SSLEngineResult$Status r10 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ IOException -> 0x0725 }
            javax.net.ssl.SSLEngineResult$Status r11 = r7.getStatus()     // Catch:{ IOException -> 0x0725 }
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x0725 }
            if (r10 == 0) goto L_0x061a
            java.util.concurrent.atomic.AtomicInteger r7 = r3.f265554g     // Catch:{ IOException -> 0x0725 }
            int r10 = r5.size()     // Catch:{ IOException -> 0x0725 }
            r7.addAndGet(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r7 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            byte[] r5 = r5.mo19468d()     // Catch:{ IOException -> 0x0725 }
            byte[] r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.m156729i(r5)     // Catch:{ IOException -> 0x0725 }
            r7.mo88735a(r5)     // Catch:{ IOException -> 0x0725 }
            goto L_0x0699
        L_0x061a:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r10, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r10 = 17623(0x44d7, float:2.4695E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r10)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r10 = "[%s] Encountered handshake error %s"
            java.lang.String r11 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            javax.net.ssl.SSLEngineResult$Status r13 = r7.getStatus()     // Catch:{ IOException -> 0x0725 }
            r5.mo56354G(r10, r11, r13)     // Catch:{ IOException -> 0x0725 }
            javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ IOException -> 0x0725 }
            javax.net.ssl.SSLEngineResult$Status r10 = r7.getStatus()     // Catch:{ IOException -> 0x0725 }
            boolean r5 = r5.equals(r10)     // Catch:{ IOException -> 0x0725 }
            if (r5 != 0) goto L_0x0652
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ IOException -> 0x0725 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r7 = r7.getHandshakeStatus()     // Catch:{ IOException -> 0x0725 }
            boolean r5 = r5.equals(r7)     // Catch:{ IOException -> 0x0725 }
            if (r5 == 0) goto L_0x0699
        L_0x0652:
            com.google.android.apps.gsa.staticplugins.bisto.f.c r5 = r3.f265553f     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r7 = com.google.common.p4552o.C60069jr.f162379n     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jo r7 = (com.google.common.p4552o.C60066jo) r7     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            r11 = 7
            r10.f162383c = r11     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | r9
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.atomic.AtomicInteger r10 = r3.f265554g     // Catch:{ IOException -> 0x0725 }
            int r10 = r10.get()     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r11 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r11 = (com.google.common.p4552o.C60069jr) r11     // Catch:{ IOException -> 0x0725 }
            int r13 = r11.f162381a     // Catch:{ IOException -> 0x0725 }
            r13 = r13 | 32
            r11.f162381a = r13     // Catch:{ IOException -> 0x0725 }
            r11.f162386f = r10     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.common.o.jr r10 = (com.google.common.p4552o.C60069jr) r10     // Catch:{ IOException -> 0x0725 }
            int r11 = r10.f162381a     // Catch:{ IOException -> 0x0725 }
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.f162381a = r11     // Catch:{ IOException -> 0x0725 }
            r11 = 11
            r10.f162390j = r11     // Catch:{ IOException -> 0x0725 }
            r5.mo89225a(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            r5.mo88737c()     // Catch:{ IOException -> 0x0725 }
        L_0x0699:
            int r5 = r8.f124541a     // Catch:{ IOException -> 0x0725 }
            r7 = 6
            if (r5 != r7) goto L_0x0776
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0725 }
            r5.mo56378ag(r7, r12)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            r7 = 17638(0x44e6, float:2.4716E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ IOException -> 0x0725 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0725 }
            java.lang.String r7 = "[%s] Received keep-alive ping"
            java.lang.String r8 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r5.mo56389s(r7, r8)     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.a r5 = r3.f265550c     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.u r7 = com.google.assistant.p3739a.p3740a.C48124u.f124543f     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.t r7 = (com.google.assistant.p3739a.p3740a.C48123t) r7     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.w r8 = com.google.assistant.p3739a.p3740a.C48126w.f124550b     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.v r8 = (com.google.assistant.p3739a.p3740a.C48125v) r8     // Catch:{ IOException -> 0x0725 }
            r8.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.w r10 = (com.google.assistant.p3739a.p3740a.C48126w) r10     // Catch:{ IOException -> 0x0725 }
            r10.f124552a = r9     // Catch:{ IOException -> 0x0725 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.u r10 = (com.google.assistant.p3739a.p3740a.C48124u) r10     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.w r8 = (com.google.assistant.p3739a.p3740a.C48126w) r8     // Catch:{ IOException -> 0x0725 }
            r8.getClass()     // Catch:{ IOException -> 0x0725 }
            r10.f124547c = r8     // Catch:{ IOException -> 0x0725 }
            r8 = 6
            r10.f124546b = r8     // Catch:{ IOException -> 0x0725 }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ IOException -> 0x0725 }
            com.google.assistant.a.a.u r7 = (com.google.assistant.p3739a.p3740a.C48124u) r7     // Catch:{ IOException -> 0x0725 }
            byte[] r7 = r7.toByteArray()     // Catch:{ IOException -> 0x0725 }
            r5.mo88735a(r7)     // Catch:{ IOException -> 0x0725 }
            android.os.Handler r5 = r3.f265556i     // Catch:{ IOException -> 0x0725 }
            if (r5 == 0) goto L_0x0702
            java.lang.String r7 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            r7 = 0
            r5.removeCallbacksAndMessages(r7)     // Catch:{ IOException -> 0x0725 }
            goto L_0x070d
        L_0x0702:
            android.os.Handler r5 = new android.os.Handler     // Catch:{ IOException -> 0x0725 }
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch:{ IOException -> 0x0725 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0725 }
            r3.f265556i = r5     // Catch:{ IOException -> 0x0725 }
        L_0x070d:
            android.os.Handler r5 = r3.f265556i     // Catch:{ IOException -> 0x0725 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.c.b r7 = new com.google.android.apps.gsa.staticplugins.bisto.ac.c.b     // Catch:{ IOException -> 0x0725 }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0725 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ IOException -> 0x0725 }
            int r10 = r3.f265555h     // Catch:{ IOException -> 0x0725 }
            r11 = 1
            int r10 = r10 + r11
            long r10 = (long) r10     // Catch:{ IOException -> 0x0725 }
            long r10 = r8.toMillis(r10)     // Catch:{ IOException -> 0x0725 }
            r5.postDelayed(r7, r10)     // Catch:{ IOException -> 0x0725 }
            java.lang.String r3 = r3.f265552e     // Catch:{ IOException -> 0x0725 }
            goto L_0x0776
        L_0x0725:
            r0 = move-exception
            r5 = r0
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c.f265548a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r12)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r5 = r7.mo56382g(r5)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            r7 = 17639(0x44e7, float:2.4718E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.String r7 = "[%s] Unable to parse crypto accessory message"
            java.lang.String r8 = r3.f265552e
            r5.mo56389s(r7, r8)
            com.google.android.apps.gsa.staticplugins.bisto.f.c r3 = r3.f265553f
            com.google.common.o.jr r5 = com.google.common.p4552o.C60069jr.f162379n
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.jo r5 = (com.google.common.p4552o.C60066jo) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.common.o.jr r7 = (com.google.common.p4552o.C60069jr) r7
            r8 = 8
            r7.f162383c = r8
            int r8 = r7.f162381a
            r8 = r8 | r9
            r7.f162381a = r8
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.common.o.jr r7 = (com.google.common.p4552o.C60069jr) r7
            int r8 = r7.f162381a
            r8 = r8 | 512(0x200, float:7.175E-43)
            r7.f162381a = r8
            r8 = 6
            r7.f162390j = r8
            r3.mo89225a(r5)
        L_0x0776:
            com.google.android.apps.gsa.shared.bisto.k r3 = r4.f265391h
            r4 = 1
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.m156572E(r4, r6, r2, r3)
            return
        L_0x077d:
            java.util.UUID r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94872au.f265320g
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x082f
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r2 = r4.f265385b
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r2)
            boolean r2 = r4.mo88761y()     // Catch:{ d -> 0x07e4 }
            if (r2 == 0) goto L_0x07b9
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.av r2 = r4.f265375H     // Catch:{ d -> 0x07e4 }
            java.util.concurrent.atomic.AtomicInteger r6 = r2.f265329h     // Catch:{ d -> 0x07e4 }
            r7 = 1
            r6.addAndGet(r7)     // Catch:{ d -> 0x07e4 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f265338q     // Catch:{ d -> 0x07e4 }
            r2.set(r7)     // Catch:{ d -> 0x07e4 }
            com.google.android.libraries.assistant.accessory.a.c r2 = r4.f265401r     // Catch:{ d -> 0x07e4 }
            java.lang.String r6 = "Proxy"
            byte[] r2 = r4.mo88743B(r2, r3, r6)     // Catch:{ d -> 0x07e4 }
            if (r2 == 0) goto L_0x07be
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r3 = r4.f265385b     // Catch:{ d -> 0x07e4 }
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r3)     // Catch:{ d -> 0x07e4 }
            android.util.Base64.encodeToString(r2, r8)     // Catch:{ d -> 0x07e4 }
            byte[] r2 = r4.mo88744C(r2, r8)     // Catch:{ d -> 0x07e4 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r3 = r4.f265389f     // Catch:{ d -> 0x07e4 }
            r3.mo88847a(r2)     // Catch:{ d -> 0x07e4 }
            goto L_0x07be
        L_0x07b9:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265389f     // Catch:{ d -> 0x07e4 }
            r2.mo88847a(r3)     // Catch:{ d -> 0x07e4 }
        L_0x07be:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265389f     // Catch:{ d -> 0x07e4 }
            byte[] r2 = r2.mo88849c()     // Catch:{ d -> 0x07e4 }
        L_0x07c4:
            if (r2 == 0) goto L_0x082f
            com.google.android.apps.gsa.staticplugins.bisto.ac.f.b r3 = r4.f265394k     // Catch:{ d -> 0x07e4 }
            if (r3 == 0) goto L_0x07db
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.e r3 = r3.mo88871a()     // Catch:{ d -> 0x07e4 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.d r6 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d.PROXY_INPUT     // Catch:{ d -> 0x07e4 }
            r3.mo88800b(r6, r2)     // Catch:{ d -> 0x07e4 }
            com.google.android.apps.gsa.shared.bisto.k r3 = r4.f265391h     // Catch:{ d -> 0x07e4 }
            r6 = 4
            r7 = 1
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.m156572E(r7, r6, r2, r3)     // Catch:{ d -> 0x07e4 }
            goto L_0x07dd
        L_0x07db:
            r6 = 4
            r7 = 1
        L_0x07dd:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.g r2 = r4.f265389f     // Catch:{ d -> 0x07e4 }
            byte[] r2 = r2.mo88849c()     // Catch:{ d -> 0x07e4 }
            goto L_0x07c4
        L_0x07e4:
            r0 = move-exception
            r2 = r0
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.f265367a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r5)
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r5 = r4.f265385b
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156554c(r5)
            r6 = 17290(0x438a, float:2.4228E-41)
            java.lang.String r7 = "[%s] Unable to process proxy data"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r6)).mo56389s(r7, r5)
            com.google.android.apps.gsa.staticplugins.bisto.f.c r2 = r4.f265408y
            com.google.common.o.jr r3 = com.google.common.p4552o.C60069jr.f162379n
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.jo r3 = (com.google.common.p4552o.C60066jo) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.jr r5 = (com.google.common.p4552o.C60069jr) r5
            r6 = 8
            r5.f162383c = r6
            int r6 = r5.f162381a
            r6 = r6 | r9
            r5.f162381a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.jr r5 = (com.google.common.p4552o.C60069jr) r5
            int r6 = r5.f162381a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.f162381a = r6
            r6 = 22
            r5.f162390j = r6
            r2.mo89225a(r3)
            r4.mo88750i(r8)
        L_0x082f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94879c.mo88715e(java.util.UUID, byte[]):void");
    }

    /* renamed from: f */
    public final void mo88716f() {
        synchronized (this.f265357a.f265409z) {
            this.f265357a.f265370C = false;
        }
        this.f265357a.mo88753l();
    }

    /* renamed from: g */
    public final void mo88717g(int i) {
        if (this.f265357a.f265376I.size() > 20) {
            Pair pair = (Pair) this.f265357a.f265376I.removeFirst();
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156554c(this.f265357a.f265385b);
            Object obj = pair.first;
            Object obj2 = pair.second;
        }
        C60948g gVar = C60948g.f165068a;
        this.f265357a.f265376I.add(new Pair(Long.valueOf(Instant.now().getEpochSecond()), Integer.valueOf(i)));
        C58976aa aaVar2 = C58975e.f156826a;
    }
}
