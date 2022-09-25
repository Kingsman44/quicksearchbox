package p5488io.grpc.p5526f;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70704ei;

@C69567e(mo61343b = "io.grpc.kotlin.ServerCalls$serverCallListener$requests$1", mo61344c = "ServerCalls.kt", mo61345d = "invokeSuspend", mo61346e = {215, 216})
/* renamed from: io.grpc.f.z */
/* compiled from: PG */
final class C70760z extends C69572j implements C69630p {

    /* renamed from: a */
    Object f188565a;

    /* renamed from: b */
    int f188566b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f188567c;

    /* renamed from: d */
    final /* synthetic */ C70704ei f188568d;

    /* renamed from: e */
    final /* synthetic */ C71389v f188569e;

    /* renamed from: f */
    private /* synthetic */ Object f188570f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70760z(AtomicBoolean atomicBoolean, C70704ei eiVar, C71389v vVar, C69577g gVar) {
        super(2, gVar);
        this.f188567c = atomicBoolean;
        this.f188568d = eiVar;
        this.f188569e = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70760z) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.a.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[Catch:{ Exception -> 0x006e }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f188566b
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r2) goto L_0x0015
            java.lang.Object r1 = r7.f188565a
            java.lang.Object r3 = r7.f188570f
            kotlinx.coroutines.b.o r3 = (kotlinx.coroutines.p5574b.C71588o) r3
            p5462h.C69714l.m101134b(r8)     // Catch:{ Exception -> 0x0021 }
            r8 = r3
            r3 = r7
            goto L_0x0068
        L_0x0015:
            java.lang.Object r1 = r7.f188565a
            java.lang.Object r3 = r7.f188570f
            kotlinx.coroutines.b.o r3 = (kotlinx.coroutines.p5574b.C71588o) r3
            p5462h.C69714l.m101134b(r8)     // Catch:{ Exception -> 0x0021 }
            r4 = r3
            r3 = r7
            goto L_0x004e
        L_0x0021:
            r8 = move-exception
            goto L_0x0075
        L_0x0023:
            p5462h.C69714l.m101134b(r8)
            java.lang.Object r8 = r7.f188570f
            kotlinx.coroutines.b.o r8 = (kotlinx.coroutines.p5574b.C71588o) r8
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f188567c
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0087
            io.grpc.ei r1 = r7.f188568d
            r1.mo62062g(r2)
            kotlinx.coroutines.a.v r1 = r7.f188569e     // Catch:{ Exception -> 0x0021 }
            kotlinx.coroutines.a.x r1 = r1.mo62721g()     // Catch:{ Exception -> 0x0021 }
            r3 = r7
        L_0x003f:
            r3.f188570f = r8     // Catch:{ Exception -> 0x006e }
            r3.f188565a = r1     // Catch:{ Exception -> 0x006e }
            r3.f188566b = r2     // Catch:{ Exception -> 0x006e }
            java.lang.Object r4 = r1.mo62689a(r3)     // Catch:{ Exception -> 0x006e }
            if (r4 == r0) goto L_0x0074
            r6 = r4
            r4 = r8
            r8 = r6
        L_0x004e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x006e }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x006e }
            if (r8 == 0) goto L_0x0071
            java.lang.Object r8 = r1.mo62690b()     // Catch:{ Exception -> 0x006e }
            r3.f188570f = r4     // Catch:{ Exception -> 0x006e }
            r3.f188565a = r1     // Catch:{ Exception -> 0x006e }
            r5 = 2
            r3.f188566b = r5     // Catch:{ Exception -> 0x006e }
            java.lang.Object r8 = r4.mo20883a(r8, r3)     // Catch:{ Exception -> 0x006e }
            if (r8 == r0) goto L_0x0070
            r8 = r4
        L_0x0068:
            io.grpc.ei r4 = r3.f188568d     // Catch:{ Exception -> 0x006e }
            r4.mo62062g(r2)     // Catch:{ Exception -> 0x006e }
            goto L_0x003f
        L_0x006e:
            r8 = move-exception
            goto L_0x0076
        L_0x0070:
            return r0
        L_0x0071:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0074:
            return r0
        L_0x0075:
            r3 = r7
        L_0x0076:
            kotlinx.coroutines.a.v r0 = r3.f188569e
            java.lang.String r1 = "Exception thrown while collecting requests"
            java.util.concurrent.CancellationException r1 = kotlinx.coroutines.C71629cb.m104602a(r1, r8)
            r0.mo62723u(r1)
            io.grpc.ei r0 = r3.f188568d
            r0.mo62062g(r2)
            throw r8
        L_0x0087:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "requests flow can only be collected once"
            r8.<init>(r0)
            goto L_0x0090
        L_0x008f:
            throw r8
        L_0x0090:
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5526f.C70760z.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C70760z zVar = new C70760z(this.f188567c, this.f188568d, this.f188569e, gVar);
        zVar.f188570f = obj;
        return zVar;
    }
}
