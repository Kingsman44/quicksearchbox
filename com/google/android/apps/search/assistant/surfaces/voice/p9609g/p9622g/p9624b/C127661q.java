package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127469a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127473e;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127637b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34075ck;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34076cl;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34662b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.Map;
import kotlinx.coroutines.C71816z;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.q */
/* compiled from: PG */
public final class C127661q implements C70862aj {

    /* renamed from: a */
    public final C127613a f351469a;

    /* renamed from: b */
    final /* synthetic */ C127643ae f351470b;

    /* renamed from: c */
    public final C71816z f351471c = new C71816z();

    public C127661q(C127643ae aeVar, C127613a aVar) {
        C69664n.m101061g(aVar, "connectReason");
        this.f351470b = aeVar;
        this.f351469a = aVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f351470b.mo108161b(C127637b.SUBSCRIPTION_COMPLETE, C69496am.f185918a);
        this.f351471c.mo62909P(C69788q.f186170a);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        if (th != null && (th instanceof C70761fa)) {
            Status status = ((C70761fa) th).f188571a;
            C69664n.m101060f(status, "e.status");
            if (status.getCode() == Status.Code.CANCELLED && status.f186920q == null) {
                C59052c cVar = (C59052c) C127643ae.f351379a.mo56224b();
                cVar.mo56379ah(new C59094n(37538));
                cVar.mo56386p("Subscription was cancelled.");
                this.f351471c.mo62909P(C69788q.f186170a);
            }
        }
        C59052c cVar2 = (C59052c) ((C59052c) C127643ae.f351379a.mo56225c()).mo56382g(th);
        cVar2.mo56379ah(new C59094n(37537));
        cVar2.mo56386p("Subscription failed.");
        this.f351470b.mo108162e(C127637b.SUBSCRIPTION_FAILED, C69496am.f185918a);
        C127643ae aeVar = this.f351470b;
        C60870cx b = aeVar.f351397r.mo51512b(new C127640ab(aeVar, new C127659o(this, (C69577g) null)), aeVar.f351385f);
        C69664n.m101060f(b, "private fun <T> withBack…, backgroundExecutor)\n  }");
        aeVar.f351394o = b;
        this.f351471c.mo62909P(C69788q.f186170a);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C34039bb bbVar;
        C34039bb bbVar2;
        C34039bb bbVar3;
        C34039bb bbVar4;
        C127471c cVar;
        C127470b bVar;
        int i;
        int i2;
        C34076cl clVar = (C34076cl) obj;
        C69664n.m101061g(clVar, "triggerMessage");
        int ordinal = C34075ck.m62715a(clVar.f90799a).ordinal();
        if (ordinal == 0) {
            C59052c cVar2 = (C59052c) C127643ae.f351379a.mo56224b();
            if (clVar.f90799a == 1) {
                bbVar = (C34039bb) clVar.f90800b;
            } else {
                bbVar = C34039bb.f90716f;
            }
            C34053bp bpVar = bbVar.f90720c;
            if (bpVar == null) {
                bpVar = C34053bp.f90753a;
            }
            C69664n.m101060f(bpVar, "triggerMessage.invocation.token");
            C61301b a = C34711b.m63445a(bpVar);
            cVar2.mo56379ah(new C59094n(37539));
            cVar2.mo56389s("Received invocationtoken :%s", a);
            C127643ae aeVar = this.f351470b;
            if (clVar.f90799a == 1) {
                bbVar2 = (C34039bb) clVar.f90800b;
            } else {
                bbVar2 = C34039bb.f90716f;
            }
            C69664n.m101060f(bbVar2, "triggerMessage.invocation");
            C127643ae aeVar2 = this.f351470b;
            if (clVar.f90799a == 1) {
                bbVar3 = (C34039bb) clVar.f90800b;
            } else {
                bbVar3 = C34039bb.f90716f;
            }
            C34038ba baVar = bbVar3.f90721d;
            if (baVar == null) {
                baVar = C34038ba.f90707h;
            }
            C69664n.m101060f(baVar, "invocation.payload");
            if (clVar.f90799a == 1) {
                bbVar4 = (C34039bb) clVar.f90800b;
            } else {
                bbVar4 = C34039bb.f90716f;
            }
            C34043bf a2 = C34043bf.m62692a(bbVar4.f90719b);
            if (a2 == null) {
                a2 = C34043bf.UNRECOGNIZED;
            }
            C69664n.m101060f(a2, "invocation.entrypoint");
            e eVar = e.a;
            switch (a2.ordinal()) {
                case 0:
                    throw new IllegalArgumentException("ENTRYPOINT_UNKNOWN received, will not be processed");
                case 1:
                    C127469a aVar = (C127469a) C127471c.f350977d.createBuilder();
                    C69664n.m101060f(aVar, "newBuilder()");
                    C127473e a3 = C69664n.m101061g(aVar, "builder");
                    a3.mo108083b(C127470b.SELF_INVOCATION);
                    cVar = a3.mo108082a();
                    break;
                case 2:
                case 3:
                case 7:
                    C127469a aVar2 = (C127469a) C127471c.f350977d.createBuilder();
                    C69664n.m101060f(aVar2, "newBuilder()");
                    C127473e a4 = C69664n.m101061g(aVar2, "builder");
                    a4.mo108083b(C127470b.HOTWORD);
                    cVar = a4.mo108082a();
                    break;
                case 4:
                    C127469a aVar3 = (C127469a) C127471c.f350977d.createBuilder();
                    C69664n.m101060f(aVar3, "newBuilder()");
                    C127473e a5 = C69664n.m101061g(aVar3, "builder");
                    Map map = C127645ag.f351404a;
                    C69664n.m101061g(clVar, "<this>");
                    int ordinal2 = C127644af.m208665b(C127644af.m208664a(clVar)).ordinal();
                    if (ordinal2 == 75) {
                        bVar = C127470b.CORNER_SWIPE;
                    } else if (ordinal2 == 76) {
                        bVar = C127470b.EDGE_SQUEEZE;
                    } else if (ordinal2 == 98) {
                        bVar = C127470b.HOTWORD;
                    } else if (ordinal2 == 128) {
                        bVar = C127470b.QUICK_SEARCH_BAR;
                    } else if (ordinal2 == 124) {
                        bVar = C127470b.HOME_BUTTON_LONG_PRESS;
                    } else if (ordinal2 != 125) {
                        bVar = C127470b.UNKNOWN_VIS_FROM_SYSTEM;
                    } else {
                        bVar = C127470b.POWER_BUTTON_LONG_PRESS;
                    }
                    a5.mo108083b(bVar);
                    if (bVar == C127470b.UNKNOWN_VIS_FROM_SYSTEM) {
                        if (aeVar2.mo108165h()) {
                            i = C127643ae.m208655i(C127644af.m208665b(C127644af.m208664a(clVar))).ca;
                        } else {
                            i = C127644af.m208665b(C127644af.m208664a(clVar)).ca;
                        }
                        C127469a aVar4 = a5.f350982a;
                        aVar4.copyOnWrite();
                        C127471c cVar3 = (C127471c) aVar4.instance;
                        cVar3.f350979a = 1 | cVar3.f350979a;
                        cVar3.f350981c = i;
                    }
                    cVar = a5.mo108082a();
                    break;
                case 5:
                    C127469a aVar5 = (C127469a) C127471c.f350977d.createBuilder();
                    C69664n.m101060f(aVar5, "newBuilder()");
                    C127473e a6 = C69664n.m101061g(aVar5, "builder");
                    a6.mo108083b(C127470b.LEGACY_PROGRAMMATIC_INVOCATION);
                    if (aeVar2.mo108165h()) {
                        C34662b bVar2 = baVar.f90714f;
                        if (bVar2 == null) {
                            bVar2 = C34662b.f92037d;
                        }
                        e a7 = e.a(bVar2.f92040b);
                        if (a7 == null) {
                            a7 = e.a;
                        }
                        C69664n.m101060f(a7, "OpaTriggerType.forNumber…?: OpaTriggerType.UNKNOWN");
                        i2 = C127643ae.m208655i(a7).ca;
                    } else {
                        C34662b bVar3 = baVar.f90714f;
                        if (bVar3 == null) {
                            bVar3 = C34662b.f92037d;
                        }
                        i2 = bVar3.f92040b;
                    }
                    C127469a aVar6 = a6.f350982a;
                    aVar6.copyOnWrite();
                    C127471c cVar4 = (C127471c) aVar6.instance;
                    cVar4.f350979a = 1 | cVar4.f350979a;
                    cVar4.f350981c = i2;
                    cVar = a6.mo108082a();
                    break;
                case 8:
                    throw new IllegalArgumentException("UNRECOGNIZED entrypoint received");
                default:
                    new StringBuilder("Not supported entrypoint received : ").append(a2);
                    throw new IllegalArgumentException("Not supported entrypoint received : ".concat(String.valueOf(a2)));
            }
            C69664n.m101060f(aeVar.f351397r.mo51512b(new C127642ad(aeVar, new C127666v(aeVar, bbVar2, cVar, (C69577g) null)), aeVar.f351383d), "private fun <T> withLigh… lightweightExecutor)\n  }");
        } else if (ordinal == 1) {
            C59052c cVar5 = (C59052c) C127643ae.f351379a.mo56224b();
            cVar5.mo56379ah(new C59094n(37540));
            cVar5.mo56389s("On platform configuration update(%s).", clVar);
            this.f351471c.mo62909P(C69788q.f186170a);
        } else {
            throw new UnsupportedOperationException("Unsupported Triggering API service message type: ".concat(String.valueOf(C34075ck.m62715a(clVar.f90799a).name())));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108169d(com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127660p
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.p r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127660p) r0
            int r1 = r0.f351468e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351468e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.p r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.g.b.p
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f351466c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351468e
            java.lang.String r3 = "currDelay"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r5) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r10 = r0.f351464a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0099
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            java.lang.Object r10 = r0.f351465b
            java.lang.Object r2 = r0.f351464a
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            r10 = r2
            goto L_0x0084
        L_0x0040:
            p5462h.C69714l.m101134b(r11)
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r11 = r9.f351470b
            j$.time.Duration r11 = r11.f351393n
            j$.time.Duration r2 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.f351380b
            int r11 = r11.compareTo((p3186j$.time.Duration) r2)
            if (r11 > 0) goto L_0x00bb
            com.google.common.f.e r11 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.f351379a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r2 = r9.f351470b
            j$.time.Duration r2 = r2.f351393n
            long r6 = r2.toMillis()
            com.google.common.f.n r2 = new com.google.common.f.n
            r8 = 37535(0x929f, float:5.2598E-41)
            r2.<init>(r8)
            r11.mo56379ah(r2)
            java.lang.String r2 = "Reconnecting after %d ms"
            r11.mo56388r(r2, r6)
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r11 = r9.f351470b
            j$.time.Duration r11 = r11.f351393n
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)
            r0.f351464a = r9
            r0.f351465b = r10
            r0.f351468e = r5
            java.lang.Object r11 = com.google.common.p4580v.p4582b.C60942a.m93084b(r11, r0)
            if (r11 == r1) goto L_0x00ba
            r11 = r10
            r10 = r9
        L_0x0084:
            r2 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.q r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127661q) r2
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r2 = r2.f351470b
            r0.f351464a = r10
            r5 = 0
            r0.f351465b = r5
            r0.f351468e = r4
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a) r11
            java.lang.Object r11 = r2.mo108163f(r11, r0)
            if (r11 != r1) goto L_0x0099
            return r1
        L_0x0099:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.q r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127661q) r10
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r10 = r10.f351470b
            j$.time.Duration r11 = r10.f351393n
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)
            java.lang.String r0 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            r0 = 2
            j$.time.Duration r11 = r11.multipliedBy(r0)
            java.lang.String r0 = "multipliedBy(n)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            r10.f351393n = r11
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x00ba:
            return r1
        L_0x00bb:
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.f351379a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.n r11 = new com.google.common.f.n
            r0 = 37536(0x92a0, float:5.2599E-41)
            r11.<init>(r0)
            r10.mo56379ah(r11)
            java.lang.String r11 = "Skipping retry, Max retry limit reached."
            r10.mo56386p(r11)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127661q.mo108169d(com.google.android.apps.search.assistant.surfaces.voice.g.g.a, h.c.g):java.lang.Object");
    }
}
