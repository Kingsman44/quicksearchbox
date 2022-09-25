package p5488io.grpc.p5526f;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70704ei;

@C69567e(mo61343b = "io.grpc.kotlin.ServerCalls$serverCallListener$rpcJob$1", mo61344c = "ServerCalls.kt", mo61345d = "invokeSuspend", mo61346e = {234, 301, 312})
/* renamed from: io.grpc.f.ac */
/* compiled from: PG */
final class C70726ac extends C69572j implements C69630p {

    /* renamed from: a */
    Object f188472a;

    /* renamed from: b */
    Object f188473b;

    /* renamed from: c */
    Object f188474c;

    /* renamed from: d */
    int f188475d;

    /* renamed from: e */
    final /* synthetic */ C69626l f188476e;

    /* renamed from: f */
    final /* synthetic */ C71587n f188477f;

    /* renamed from: g */
    final /* synthetic */ C70756v f188478g;

    /* renamed from: h */
    final /* synthetic */ C70704ei f188479h;

    /* renamed from: i */
    private /* synthetic */ Object f188480i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70726ac(C69626l lVar, C71587n nVar, C70756v vVar, C70704ei eiVar, C69577g gVar) {
        super(2, gVar);
        this.f188476e = lVar;
        this.f188477f = nVar;
        this.f188478g = vVar;
        this.f188479h = eiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70726ac) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f5 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f188475d
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x003d
            if (r1 == r4) goto L_0x002f
            if (r1 == r3) goto L_0x001f
            java.lang.Object r0 = r10.f188474c
            java.lang.Object r1 = r10.f188473b
            java.lang.Object r2 = r10.f188472a
            io.grpc.de r2 = (p5488io.grpc.C70334de) r2
            java.lang.Object r3 = r10.f188480i
            io.grpc.Status r3 = (p5488io.grpc.Status) r3
            p5462h.C69714l.m101134b(r11)
            goto L_0x00e5
        L_0x001f:
            java.lang.Object r1 = r10.f188474c
            java.lang.Object r2 = r10.f188473b
            java.lang.Object r3 = r10.f188472a
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r4 = r10.f188480i
            kotlinx.coroutines.j.b r4 = (kotlinx.coroutines.p5584j.C71788b) r4
            p5462h.C69714l.m101134b(r11)
            goto L_0x0096
        L_0x002f:
            java.lang.Object r1 = r10.f188472a
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            java.lang.Object r6 = r10.f188480i
            kotlinx.coroutines.j.b r6 = (kotlinx.coroutines.p5584j.C71788b) r6
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x003b }
            goto L_0x006d
        L_0x003b:
            r11 = move-exception
            goto L_0x0071
        L_0x003d:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f188480i
            kotlinx.coroutines.aw r11 = (kotlinx.coroutines.C71422aw) r11
            kotlinx.coroutines.j.m r6 = new kotlinx.coroutines.j.m
            r6.<init>()
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r2)
            h.f.a.l r11 = r10.f188476e
            kotlinx.coroutines.b.n r7 = r10.f188477f
            io.grpc.f.v r8 = r10.f188478g
            io.grpc.ei r9 = r10.f188479h
            java.lang.Object r11 = r11.mo5761a(r7)     // Catch:{ all -> 0x003b }
            kotlinx.coroutines.b.n r11 = (kotlinx.coroutines.p5574b.C71587n) r11     // Catch:{ all -> 0x003b }
            io.grpc.f.ab r7 = new io.grpc.f.ab     // Catch:{ all -> 0x003b }
            r7.<init>(r1, r6, r8, r9)     // Catch:{ all -> 0x003b }
            r10.f188480i = r6     // Catch:{ all -> 0x003b }
            r10.f188472a = r1     // Catch:{ all -> 0x003b }
            r10.f188475d = r4     // Catch:{ all -> 0x003b }
            java.lang.Object r11 = r11.mo38165mp(r7, r10)     // Catch:{ all -> 0x003b }
            if (r11 == r0) goto L_0x0070
        L_0x006d:
            h.q r11 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x003b }
            goto L_0x0075
        L_0x0070:
            return r0
        L_0x0071:
            java.lang.Object r11 = p5462h.C69714l.m101133a(r11)
        L_0x0075:
            java.lang.Throwable r11 = p5462h.C69702k.m101124a(r11)
            if (r11 != 0) goto L_0x00ac
            boolean r1 = r1.compareAndSet(r2, r4)
            if (r1 == 0) goto L_0x00ac
            io.grpc.ei r1 = r10.f188479h
            r10.f188480i = r6
            r10.f188472a = r5
            r10.f188473b = r6
            r10.f188474c = r1
            r10.f188475d = r3
            java.lang.Object r2 = r6.mo63025b(r5, r10)
            if (r2 == r0) goto L_0x00ab
            r3 = r11
            r2 = r6
            r4 = r2
        L_0x0096:
            io.grpc.de r11 = new io.grpc.de     // Catch:{ all -> 0x00a6 }
            r11.<init>()     // Catch:{ all -> 0x00a6 }
            io.grpc.ei r1 = (p5488io.grpc.C70704ei) r1     // Catch:{ all -> 0x00a6 }
            r1.mo58113b(r11)     // Catch:{ all -> 0x00a6 }
            r2.mo63026c(r5)
            r11 = r3
            r1 = r4
            goto L_0x00ad
        L_0x00a6:
            r11 = move-exception
            r2.mo63026c(r5)
            throw r11
        L_0x00ab:
            return r0
        L_0x00ac:
            r1 = r6
        L_0x00ad:
            if (r11 != 0) goto L_0x00b3
            io.grpc.Status r2 = p5488io.grpc.Status.f186902OK
        L_0x00b1:
            r3 = r2
            goto L_0x00c3
        L_0x00b3:
            boolean r2 = r11 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L_0x00be
            io.grpc.Status r2 = p5488io.grpc.Status.f186904b
            io.grpc.Status r2 = r2.mo61678e(r11)
            goto L_0x00b1
        L_0x00be:
            io.grpc.Status r2 = p5488io.grpc.Status.m102100d(r11)
            goto L_0x00b1
        L_0x00c3:
            if (r11 == 0) goto L_0x00cb
            io.grpc.de r11 = p5488io.grpc.Status.m102098a(r11)
            if (r11 != 0) goto L_0x00d0
        L_0x00cb:
            io.grpc.de r11 = new io.grpc.de
            r11.<init>()
        L_0x00d0:
            r2 = r11
            io.grpc.ei r11 = r10.f188479h
            r10.f188480i = r3
            r10.f188472a = r2
            r10.f188473b = r1
            r10.f188474c = r11
            r4 = 3
            r10.f188475d = r4
            java.lang.Object r4 = r1.mo63025b(r5, r10)
            if (r4 == r0) goto L_0x00f5
            r0 = r11
        L_0x00e5:
            io.grpc.ei r0 = (p5488io.grpc.C70704ei) r0     // Catch:{ all -> 0x00f0 }
            r0.mo39476a(r3, r2)     // Catch:{ all -> 0x00f0 }
            r1.mo63026c(r5)
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        L_0x00f0:
            r11 = move-exception
            r1.mo63026c(r5)
            throw r11
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5526f.C70726ac.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C70726ac acVar = new C70726ac(this.f188476e, this.f188477f, this.f188478g, this.f188479h, gVar);
        acVar.f188480i = obj;
        return acVar;
    }
}
