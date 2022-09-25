package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.C33575a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2605b.C33587b;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33603aj;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5573a.C71363aq;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.a.a.i */
/* compiled from: PG */
public final class C33584i implements C33575a {

    /* renamed from: a */
    public static final C59071e f89788a = C59071e.m91331h();

    /* renamed from: b */
    public final C34053bp f89789b;

    /* renamed from: c */
    public final AtomicBoolean f89790c = new AtomicBoolean(false);

    /* renamed from: d */
    public C71363aq f89791d;

    /* renamed from: e */
    public final C71816z f89792e = new C71816z();

    /* renamed from: f */
    private final C33603aj f89793f;

    /* renamed from: g */
    private final C71422aw f89794g;

    /* renamed from: h */
    private final C71389v f89795h = C71392y.m104158a(0, (C71387t) null, 7);

    /* renamed from: i */
    private final C33587b f89796i;

    public C33584i(C34053bp bpVar, C33603aj ajVar, C33587b bVar, C71422aw awVar, C71422aw awVar2) {
        C69664n.m101061g(bpVar, "invocationToken");
        C69664n.m101061g(ajVar, "internalServiceStub");
        C69664n.m101061g(awVar, "blockingScope");
        C69664n.m101061g(awVar2, "lightweightScope");
        this.f89789b = bpVar;
        this.f89793f = ajVar;
        this.f89796i = bVar;
        this.f89794g = awVar2;
        bVar.mo38996a(bpVar);
    }

    /* renamed from: a */
    public final C60870cx mo38991a() {
        if (this.f89790c.get()) {
            C59052c cVar = (C59052c) f89788a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Session");
            C61301b a = C34711b.m63445a(this.f89789b);
            cVar.mo56379ah(new C59094n(51235));
            cVar.mo56389s("This audio focus session is already closed. Unexpected onAudioFocusLost() is called. InvocationToken: %s.", a);
        }
        return C71663i.m104688a(this.f89792e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38994b(p5462h.p5466c.C69577g r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33581f
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.invocation.d.a.a.a.f r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33581f) r0
            int r1 = r0.f89779e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89779e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.a.a.a.f r0 = new com.google.android.libraries.search.assistant.invocation.d.a.a.a.f
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f89777c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89779e
            r3 = 3
            java.lang.String r4 = "INV.AudioFocus.Session"
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r7) goto L_0x003b
            if (r2 != r6) goto L_0x0033
            java.lang.Object r1 = r0.f89776b
            java.lang.Object r0 = r0.f89775a
            p5462h.C69714l.m101134b(r12)
            goto L_0x0117
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003b:
            java.lang.Object r2 = r0.f89775a
            p5462h.C69714l.m101134b(r12)
            goto L_0x00f7
        L_0x0042:
            p5462h.C69714l.m101134b(r12)
            com.google.common.f.e r12 = f89788a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r2, r4)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r11.f89789b
            com.google.frameworks.client.a.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r2)
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 51236(0xc824, float:7.1797E-41)
            r8.<init>(r9)
            r12.mo56379ah(r8)
            java.lang.String r8 = "Acquiring audio focus. InvocationToken: %s."
            r12.mo56389s(r8, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.aj r12 = r11.f89793f
            kotlinx.coroutines.a.v r2 = r11.f89795h
            kotlinx.coroutines.b.n r2 = kotlinx.coroutines.p5574b.C71592s.m104510d(r2)
            io.grpc.de r8 = new io.grpc.de
            r8.<init>()
            io.grpc.j r9 = r12.f189039a
            io.grpc.di r10 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33598ae.m62197a()
            io.grpc.i r12 = r12.f189040b
            kotlinx.coroutines.b.n r12 = p5488io.grpc.p5526f.C70748n.m103448a(r9, r10, r2, r12, r8)
            com.google.android.libraries.search.assistant.invocation.d.a.a.a.g r2 = new com.google.android.libraries.search.assistant.invocation.d.a.a.a.g
            r2.<init>(r5)
            kotlinx.coroutines.b.n r12 = kotlinx.coroutines.p5574b.C71486aq.m104308b(r12, r2)
            kotlinx.coroutines.aw r2 = r11.f89794g
            kotlinx.coroutines.a.aq r12 = kotlinx.coroutines.p5574b.C71592s.m104509c(r12, r2)
            r11.f89791d = r12
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.p r12 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33622p.f89851c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.n r12 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33620n) r12
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            java.lang.String r8 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r8)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.d r9 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33610d.f89827b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.c r9 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33609c) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r8)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r11.f89789b
            java.lang.String r8 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r8)
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.d r10 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33610d) r10
            r2.getClass()
            r10.f89829a = r2
            com.google.protobuf.bv r2 = r9.build()
            java.lang.String r9 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r9)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.d r2 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33610d) r2
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r8)
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.p r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33622p) r8
            r2.getClass()
            r8.f89854b = r2
            r8.f89853a = r7
            com.google.protobuf.bv r12 = r12.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r9)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.p r12 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33622p) r12
            kotlinx.coroutines.a.v r2 = r11.f89795h
            r0.f89775a = r11
            r0.f89779e = r7
            java.lang.Object r12 = r2.mo62729v(r12, r0)
            if (r12 == r1) goto L_0x0196
            r2 = r11
        L_0x00f7:
            kotlinx.coroutines.z r12 = new kotlinx.coroutines.z
            r12.<init>()
            r8 = r2
            com.google.android.libraries.search.assistant.invocation.d.a.a.a.i r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33584i) r8
            kotlinx.coroutines.aw r9 = r8.f89794g
            com.google.android.libraries.search.assistant.invocation.d.a.a.a.h r10 = new com.google.android.libraries.search.assistant.invocation.d.a.a.a.h
            r10.<init>(r8, r12, r5)
            kotlinx.coroutines.C71803m.m105043d(r9, r5, r5, r10, r3)
            r0.f89775a = r2
            r0.f89776b = r2
            r0.f89779e = r6
            java.lang.Object r12 = r12.mo62825a(r0)
            if (r12 == r1) goto L_0x0196
            r0 = r2
            r1 = r0
        L_0x0117:
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.h r12 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33614h) r12
            int r2 = r12.f89835a
            if (r2 != r6) goto L_0x018a
            java.lang.Object r12 = r12.f89836b
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.k r12 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33617k) r12
            java.lang.String r0 = "response.exception"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r0)
            int r0 = r12.f89846a
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.j r0 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33616j.m62214a(r0)
            if (r0 != 0) goto L_0x0130
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.j r0 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33616j.UNRECOGNIZED
        L_0x0130:
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x0157
            if (r0 == r6) goto L_0x014a
            if (r0 == r3) goto L_0x0142
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r12 = r12.f89847b
            r0.<init>(r12)
            goto L_0x015e
        L_0x0142:
            com.google.android.libraries.search.assistant.invocation.d.a.a.d r0 = new com.google.android.libraries.search.assistant.invocation.d.a.a.d
            java.lang.String r12 = r12.f89847b
            r0.<init>(r12)
            goto L_0x015e
        L_0x014a:
            com.google.android.libraries.search.assistant.invocation.b.g r0 = new com.google.android.libraries.search.assistant.invocation.b.g
            java.lang.String r12 = r12.f89847b
            java.lang.String r2 = "msg"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            r0.<init>(r12)
            goto L_0x015e
        L_0x0157:
            com.google.android.libraries.search.assistant.invocation.b.a r0 = new com.google.android.libraries.search.assistant.invocation.b.a
            java.lang.String r12 = r12.f89847b
            r0.<init>(r12)
        L_0x015e:
            com.google.common.f.e r12 = f89788a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r2, r4)
            com.google.common.f.x r12 = r12.mo56382g(r0)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.android.libraries.search.assistant.invocation.d.a.a.a.i r1 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33584i) r1
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r1.f89789b
            com.google.frameworks.client.a.a.b r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 51239(0xc827, float:7.1801E-41)
            r2.<init>(r3)
            r12.mo56379ah(r2)
            java.lang.String r2 = "A failure happened on the internal audio focus service when acquiring the audio focus session. InvocationToken: %s."
            r12.mo56389s(r2, r1)
            throw r0
        L_0x018a:
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.search.assistant.invocation.d.a.a.a.i r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33584i) r0
            com.google.android.libraries.search.assistant.invocation.o.a.bp r12 = r0.f89789b
            com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r12)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x0196:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33584i.mo38994b(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo38995c() {
        if (!this.f89790c.getAndSet(true)) {
            C59052c cVar = (C59052c) f89788a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Session");
            C61301b a = C34711b.m63445a(this.f89789b);
            cVar.mo56379ah(new C59094n(51238));
            cVar.mo56389s("Closes the session. InvocationToken: %s.", a);
            C71363aq aqVar = this.f89791d;
            if (aqVar == null) {
                C69664n.m101065k("streamingResponses");
                aqVar = null;
            }
            aqVar.mo62723u((CancellationException) null);
            this.f89795h.mo62727D((Throwable) null);
            this.f89795h.mo62723u((CancellationException) null);
        }
    }

    public final void close() {
        mo38995c();
    }
}
