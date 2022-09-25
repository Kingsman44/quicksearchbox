package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37415bt;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37510dq;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37699ib;
import com.google.android.libraries.search.p2904c.p2982x.C38228ak;
import com.google.android.libraries.search.p2904c.p2982x.C38229al;
import com.google.android.libraries.search.p2904c.p2982x.C38231an;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.android.libraries.search.p2904c.p2982x.C38239av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.as */
/* compiled from: PG */
public final class C38181as {

    /* renamed from: a */
    public static final C59071e f101186a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f101187b;

    /* renamed from: c */
    public final Executor f101188c;

    /* renamed from: d */
    public final Executor f101189d;

    /* renamed from: e */
    public final AtomicBoolean f101190e = new AtomicBoolean(false);

    /* renamed from: f */
    private final C60870cx f101191f;

    /* renamed from: g */
    private final C60870cx f101192g;

    /* renamed from: h */
    private final C60870cx f101193h;

    /* renamed from: i */
    private final C70862aj f101194i;

    /* renamed from: j */
    private final AtomicBoolean f101195j = new AtomicBoolean(false);

    public C38181as(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C70862aj ajVar, C71422aw awVar, Executor executor, Executor executor2) {
        this.f101191f = cxVar;
        this.f101192g = cxVar2;
        this.f101193h = cxVar3;
        this.f101194i = ajVar;
        this.f101187b = awVar;
        this.f101188c = executor;
        this.f101189d = executor2;
    }

    /* renamed from: h */
    private final void m67412h(C37519dz dzVar) {
        C38236as asVar = (C38236as) C38237at.f101333c.createBuilder();
        C69664n.m101060f(asVar, "newBuilder()");
        C38239av a = C69664n.m101061g(asVar, "builder");
        C38228ak akVar = (C38228ak) C38229al.f101316f.createBuilder();
        C69664n.m101060f(akVar, "newBuilder()");
        C38231an a2 = C69664n.m101061g(akVar, "builder");
        C37415bt btVar = (C37415bt) C37416bu.f99347c.createBuilder();
        C69664n.m101060f(btVar, "newBuilder()");
        C37699ib a3 = C69664n.m101061g(btVar, "builder");
        C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
        C69664n.m101060f(eaVar, "newBuilder()");
        C37510dq a4 = C69664n.m101061g(eaVar, "builder");
        a4.mo40997b(dzVar);
        a3.mo41081b(a4.mo40996a());
        a2.mo41341b(a3.mo41080a());
        a.mo41345d(a2.mo41340a());
        mo41307d(a.mo41342a());
        mo41309f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41304a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.libraries.search.p2904c.p2982x.p2983a.C38168af
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.libraries.search.c.x.a.af r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38168af) r0
            int r1 = r0.f101144d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101144d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.x.a.af r0 = new com.google.android.libraries.search.c.x.a.af
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f101142b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101144d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f101141a
            p5462h.C69714l.m101134b(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x0045
        L_0x0029:
            r5 = move-exception
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r5)
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.cx r5 = r4.f101193h     // Catch:{ all -> 0x0049 }
            r0.f101141a = r4     // Catch:{ all -> 0x0049 }
            r0.f101144d = r3     // Catch:{ all -> 0x0049 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)     // Catch:{ all -> 0x0049 }
            if (r5 == r1) goto L_0x0048
            r0 = r4
        L_0x0045:
            com.google.android.libraries.search.c.ay r5 = (com.google.android.libraries.search.p2904c.C37360ay) r5     // Catch:{ all -> 0x0029 }
            goto L_0x004f
        L_0x0048:
            return r1
        L_0x0049:
            r5 = move-exception
            r0 = r4
        L_0x004b:
            java.lang.Object r5 = p5462h.C69714l.m101133a(r5)
        L_0x004f:
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r5)
            if (r1 != 0) goto L_0x0056
            return r5
        L_0x0056:
            com.google.common.f.e r5 = f101186a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ALT.GrpcARCRespSenderV2"
            r5.mo56378ag(r2, r3)
            com.google.common.f.x r5 = r5.mo56382g(r1)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 53033(0xcf29, float:7.4315E-41)
            r1.<init>(r2)
            r5.mo56379ah(r1)
            java.lang.String r1 = "#audio# Fail while getting session's audio params, shutting down"
            r5.mo56386p(r1)
            com.google.android.libraries.search.c.dz r5 = com.google.android.libraries.search.p2904c.C37519dz.FAILED_OPENING_ERROR_RETRIEVING_AUDIO_PARAMS
            com.google.android.libraries.search.c.x.a.as r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as) r0
            r0.m67412h(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as.mo41304a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41305b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.libraries.search.p2904c.p2982x.p2983a.C38169ag
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.libraries.search.c.x.a.ag r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38169ag) r0
            int r1 = r0.f101148d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101148d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.x.a.ag r0 = new com.google.android.libraries.search.c.x.a.ag
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f101146b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101148d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f101145a
            p5462h.C69714l.m101134b(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x0045
        L_0x0029:
            r5 = move-exception
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r5)
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.cx r5 = r4.f101191f     // Catch:{ all -> 0x0049 }
            r0.f101145a = r4     // Catch:{ all -> 0x0049 }
            r0.f101148d = r3     // Catch:{ all -> 0x0049 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)     // Catch:{ all -> 0x0049 }
            if (r5 == r1) goto L_0x0048
            r0 = r4
        L_0x0045:
            com.google.android.libraries.search.c.be r5 = (com.google.android.libraries.search.p2904c.C37400be) r5     // Catch:{ all -> 0x0029 }
            goto L_0x004f
        L_0x0048:
            return r1
        L_0x0049:
            r5 = move-exception
            r0 = r4
        L_0x004b:
            java.lang.Object r5 = p5462h.C69714l.m101133a(r5)
        L_0x004f:
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r5)
            if (r1 != 0) goto L_0x0056
            return r5
        L_0x0056:
            com.google.common.f.e r5 = f101186a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ALT.GrpcARCRespSenderV2"
            r5.mo56378ag(r2, r3)
            com.google.common.f.x r5 = r5.mo56382g(r1)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 53035(0xcf2b, float:7.4318E-41)
            r1.<init>(r2)
            r5.mo56379ah(r1)
            java.lang.String r1 = "#audio# Fail while getting session's start status, shutting down"
            r5.mo56386p(r1)
            com.google.android.libraries.search.c.dz r5 = com.google.android.libraries.search.p2904c.C37519dz.FAILED_OPENING_ERROR_RETRIEVING_STATUS
            com.google.android.libraries.search.c.x.a.as r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as) r0
            r0.m67412h(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as.mo41305b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41306c(com.google.common.util.concurrent.C60870cx r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.p2904c.p2982x.p2983a.C38173ak
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.c.x.a.ak r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38173ak) r0
            int r1 = r0.f101161d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101161d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.x.a.ak r0 = new com.google.android.libraries.search.c.x.a.ak
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f101159b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101161d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f101158a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0043
        L_0x0029:
            r6 = move-exception
            goto L_0x004a
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.f101158a = r4     // Catch:{ all -> 0x0047 }
            r0.f101161d = r3     // Catch:{ all -> 0x0047 }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)     // Catch:{ all -> 0x0047 }
            if (r6 == r1) goto L_0x0046
            r5 = r4
        L_0x0043:
            com.google.android.libraries.search.c.bb r6 = (com.google.android.libraries.search.p2904c.C37397bb) r6     // Catch:{ all -> 0x0029 }
            goto L_0x004e
        L_0x0046:
            return r1
        L_0x0047:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x004a:
            java.lang.Object r6 = p5462h.C69714l.m101133a(r6)
        L_0x004e:
            java.lang.Throwable r0 = p5462h.C69702k.m101124a(r6)
            java.lang.String r1 = "newBuilder()"
            if (r0 != 0) goto L_0x0076
            com.google.android.libraries.search.c.bb r6 = (com.google.android.libraries.search.p2904c.C37397bb) r6
            com.google.android.libraries.search.c.x.at r0 = com.google.android.libraries.search.p2904c.p2982x.C38237at.f101333c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.c.x.as r0 = (com.google.android.libraries.search.p2904c.p2982x.C38236as) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.libraries.search.c.x.av r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            r0.mo41344c(r6)
            com.google.android.libraries.search.c.x.at r6 = r0.mo41342a()
            com.google.android.libraries.search.c.x.a.as r5 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as) r5
            r5.mo41307d(r6)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x0076:
            com.google.common.f.e r6 = f101186a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ALT.GrpcARCRespSenderV2"
            r6.mo56378ag(r2, r3)
            com.google.common.f.x r6 = r6.mo56382g(r0)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r2 = 53037(0xcf2d, float:7.432E-41)
            r0.<init>(r2)
            r6.mo56379ah(r0)
            java.lang.String r0 = "#audio# Unexpected fail while getting session's first byte result, send empty"
            r6.mo56386p(r0)
            com.google.android.libraries.search.c.x.at r6 = com.google.android.libraries.search.p2904c.p2982x.C38237at.f101333c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.c.x.as r6 = (com.google.android.libraries.search.p2904c.p2982x.C38236as) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.libraries.search.c.x.av r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.libraries.search.c.bb r0 = com.google.android.libraries.search.p2904c.C37397bb.f99320c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.c.ba r0 = (com.google.android.libraries.search.p2904c.C37396ba) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.libraries.search.c.gz r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.libraries.search.c.bb r0 = r0.mo41045a()
            r6.mo41344c(r0)
            com.google.android.libraries.search.c.x.at r6 = r6.mo41342a()
            com.google.android.libraries.search.c.x.a.as r5 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as) r5
            r5.mo41307d(r6)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as.mo41306c(com.google.common.util.concurrent.cx, h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo41307d(C38237at atVar) {
        Object obj;
        if (this.f101195j.get()) {
            return C69714l.m101133a(new Throwable());
        }
        try {
            this.f101194i.mo20123c(atVar);
            obj = C69788q.f186170a;
        } catch (Throwable th) {
            obj = C69714l.m101133a(th);
        }
        Throwable a = C69702k.m101124a(obj);
        if (a == null) {
            return obj;
        }
        C59052c cVar = (C59052c) f101186a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSenderV2");
        C59052c cVar2 = (C59052c) cVar.mo56382g(a);
        cVar2.mo56379ah(new C59094n(53038));
        cVar2.mo56386p("#audio# Cannot send audio session data to the remote client, shutting down");
        mo41310g(a);
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41308e(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.p2904c.p2982x.p2983a.C38174al
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.c.x.a.al r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38174al) r0
            int r1 = r0.f101165d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101165d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.x.a.al r0 = new com.google.android.libraries.search.c.x.a.al
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f101163b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f101165d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f101162a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0045
        L_0x0029:
            r6 = move-exception
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.cx r6 = r5.f101192g     // Catch:{ all -> 0x0049 }
            r0.f101162a = r5     // Catch:{ all -> 0x0049 }
            r0.f101165d = r3     // Catch:{ all -> 0x0049 }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ all -> 0x0049 }
            if (r6 == r1) goto L_0x0048
            r0 = r5
        L_0x0045:
            com.google.android.libraries.search.c.bw r6 = (com.google.android.libraries.search.p2904c.C37418bw) r6     // Catch:{ all -> 0x0029 }
            goto L_0x004f
        L_0x0048:
            return r1
        L_0x0049:
            r6 = move-exception
            r0 = r5
        L_0x004b:
            java.lang.Object r6 = p5462h.C69714l.m101133a(r6)
        L_0x004f:
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r6)
            java.lang.String r2 = "newBuilder()"
            if (r1 != 0) goto L_0x0077
            com.google.android.libraries.search.c.bw r6 = (com.google.android.libraries.search.p2904c.C37418bw) r6
            com.google.android.libraries.search.c.x.at r1 = com.google.android.libraries.search.p2904c.p2982x.C38237at.f101333c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.c.x.as r1 = (com.google.android.libraries.search.p2904c.p2982x.C38236as) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.libraries.search.c.x.av r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            r1.mo41346e(r6)
            com.google.android.libraries.search.c.x.at r6 = r1.mo41342a()
            com.google.android.libraries.search.c.x.a.as r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as) r0
            r0.mo41307d(r6)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0077:
            com.google.common.f.e r6 = f101186a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "ALT.GrpcARCRespSenderV2"
            r6.mo56378ag(r3, r4)
            com.google.common.f.x r6 = r6.mo56382g(r1)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r1 = new com.google.common.f.n
            r3 = 53040(0xcf30, float:7.4325E-41)
            r1.<init>(r3)
            r6.mo56379ah(r1)
            java.lang.String r1 = "#audio# Unexpected fail while getting stop listening status, send failing"
            r6.mo56386p(r1)
            com.google.android.libraries.search.c.du r6 = com.google.android.libraries.search.p2904c.C37514du.f99629c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.c.dt r6 = (com.google.android.libraries.search.p2904c.C37513dt) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            com.google.android.libraries.search.c.do r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.libraries.search.c.ds r1 = com.google.android.libraries.search.p2904c.C37512ds.FAILED_CLOSING_GRPC_STOP_LISTENING_STATUS_NOT_RECEIVED
            r6.mo40994b(r1)
            com.google.android.libraries.search.c.du r6 = r6.mo40993a()
            com.google.android.libraries.search.c.x.at r1 = com.google.android.libraries.search.p2904c.p2982x.C38237at.f101333c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.c.x.as r1 = (com.google.android.libraries.search.p2904c.p2982x.C38236as) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.libraries.search.c.x.av r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.libraries.search.c.bw r3 = com.google.android.libraries.search.p2904c.C37418bw.f99351d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.search.c.bv r3 = (com.google.android.libraries.search.p2904c.C37417bv) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r2)
            com.google.android.libraries.search.c.id r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            r2.mo41083b(r6)
            com.google.android.libraries.search.c.bw r6 = r2.mo41082a()
            r1.mo41346e(r6)
            com.google.android.libraries.search.c.x.at r6 = r1.mo41342a()
            com.google.android.libraries.search.c.x.a.as r0 = (com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as) r0
            r0.mo41307d(r6)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as.mo41308e(h.c.g):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo41309f() {
        if (!this.f101195j.getAndSet(true)) {
            this.f101194i.mo20121a();
        }
    }

    /* renamed from: g */
    public final void mo41310g(Throwable th) {
        if (!this.f101195j.getAndSet(true)) {
            this.f101194i.mo20122b(th);
        }
    }
}
