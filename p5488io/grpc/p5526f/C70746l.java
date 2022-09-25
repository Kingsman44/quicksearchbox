package p5488io.grpc.p5526f;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;

@C69567e(mo61343b = "io.grpc.kotlin.ClientCalls$rpcImpl$1$1", mo61344c = "ClientCalls.kt", mo61345d = "invokeSuspend", mo61346e = {282, 283, 287})
/* renamed from: io.grpc.f.l */
/* compiled from: PG */
final class C70746l extends C69572j implements C69630p {

    /* renamed from: a */
    Object f188522a;

    /* renamed from: b */
    Object f188523b;

    /* renamed from: c */
    int f188524c;

    /* renamed from: d */
    final /* synthetic */ C70888j f188525d;

    /* renamed from: e */
    final /* synthetic */ C70338di f188526e;

    /* renamed from: f */
    final /* synthetic */ C70851i f188527f;

    /* renamed from: g */
    final /* synthetic */ C70334de f188528g;

    /* renamed from: h */
    final /* synthetic */ C71588o f188529h;

    /* renamed from: i */
    final /* synthetic */ C70741g f188530i;

    /* renamed from: j */
    private /* synthetic */ Object f188531j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70746l(C70888j jVar, C70338di diVar, C70851i iVar, C70334de deVar, C71588o oVar, C70741g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f188525d = jVar;
        this.f188526e = diVar;
        this.f188527f = iVar;
        this.f188528g = deVar;
        this.f188529h = oVar;
        this.f188530i = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70746l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: kotlinx.coroutines.cp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f188524c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0034
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001c
            java.lang.Object r1 = r11.f188523b
            java.lang.Object r5 = r11.f188522a
            java.lang.Object r6 = r11.f188531j
            io.grpc.m r6 = (p5488io.grpc.C70898m) r6
            p5462h.C69714l.m101134b(r12)     // Catch:{ Exception -> 0x00dc }
            r12 = r1
            r1 = r11
            goto L_0x00c1
        L_0x001c:
            java.lang.Object r0 = r11.f188531j
            java.lang.Exception r0 = (java.lang.Exception) r0
            p5462h.C69714l.m101134b(r12)
            goto L_0x00f6
        L_0x0025:
            java.lang.Object r1 = r11.f188523b
            java.lang.Object r5 = r11.f188522a
            java.lang.Object r6 = r11.f188531j
            io.grpc.m r6 = (p5488io.grpc.C70898m) r6
            p5462h.C69714l.m101134b(r12)     // Catch:{ Exception -> 0x00dc }
            r7 = r6
            r6 = r5
            r5 = r11
            goto L_0x00a1
        L_0x0034:
            p5462h.C69714l.m101134b(r12)
            java.lang.Object r12 = r11.f188531j
            kotlinx.coroutines.aw r12 = (kotlinx.coroutines.C71422aw) r12
            io.grpc.j r1 = r11.f188525d
            io.grpc.di r5 = r11.f188526e
            io.grpc.i r6 = r11.f188527f
            io.grpc.m r6 = r1.mo39510a(r5, r6)
            java.lang.String r1 = "channel.newCall<RequestT…seT>(method, callOptions)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            r1 = 6
            kotlinx.coroutines.a.v r1 = kotlinx.coroutines.p5573a.C71392y.m104158a(r3, r4, r1)
            io.grpc.f.v r5 = new io.grpc.f.v
            io.grpc.f.j r7 = new io.grpc.f.j
            r7.<init>(r6)
            r5.<init>(r7)
            io.grpc.f.h r7 = new io.grpc.f.h
            r7.<init>(r1, r5)
            io.grpc.de r8 = r11.f188528g
            io.grpc.de r9 = new io.grpc.de
            r9.<init>()
            r9.mo62032g(r8)
            r6.mo27478a(r7, r9)
            kotlinx.coroutines.av r7 = new kotlinx.coroutines.av
            io.grpc.di r8 = r11.f188526e
            java.lang.String r8 = r8.f187497b
            java.lang.String r9 = "SendMessage worker for "
            java.lang.String r8 = r9.concat(r8)
            r7.<init>(r8)
            io.grpc.f.k r8 = new io.grpc.f.k
            io.grpc.f.g r9 = r11.f188530i
            r8.<init>(r9, r6, r5, r4)
            kotlinx.coroutines.cp r5 = kotlinx.coroutines.C71803m.m105043d(r12, r7, r4, r8, r2)
            r6.mo27482g(r3)     // Catch:{ Exception -> 0x00dc }
            kotlinx.coroutines.a.x r12 = r1.mo62721g()     // Catch:{ Exception -> 0x00dc }
            r1 = r11
        L_0x008d:
            r1.f188531j = r6     // Catch:{ Exception -> 0x00c5 }
            r1.f188522a = r5     // Catch:{ Exception -> 0x00c5 }
            r1.f188523b = r12     // Catch:{ Exception -> 0x00c5 }
            r1.f188524c = r3     // Catch:{ Exception -> 0x00c5 }
            java.lang.Object r7 = r12.mo62689a(r1)     // Catch:{ Exception -> 0x00c5 }
            if (r7 == r0) goto L_0x00db
            r10 = r1
            r1 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r10
        L_0x00a1:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Exception -> 0x00d6 }
            boolean r12 = r12.booleanValue()     // Catch:{ Exception -> 0x00d6 }
            if (r12 == 0) goto L_0x00c8
            java.lang.Object r12 = r1.mo62690b()     // Catch:{ Exception -> 0x00d6 }
            kotlinx.coroutines.b.o r8 = r5.f188529h     // Catch:{ Exception -> 0x00d6 }
            r5.f188531j = r7     // Catch:{ Exception -> 0x00d6 }
            r5.f188522a = r6     // Catch:{ Exception -> 0x00d6 }
            r5.f188523b = r1     // Catch:{ Exception -> 0x00d6 }
            r5.f188524c = r2     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r12 = r8.mo20883a(r12, r5)     // Catch:{ Exception -> 0x00d6 }
            if (r12 == r0) goto L_0x00c7
            r12 = r1
            r1 = r5
            r5 = r6
            r6 = r7
        L_0x00c1:
            r6.mo27482g(r3)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x008d
        L_0x00c5:
            r12 = move-exception
            goto L_0x00de
        L_0x00c7:
            return r0
        L_0x00c8:
            boolean r12 = r6.mo62875x()
            if (r12 != 0) goto L_0x00d3
            java.lang.String r12 = "Collection of responses completed before collection of requests"
            kotlinx.coroutines.C71647ct.m104640d(r6, r12, r4)
        L_0x00d3:
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x00d6:
            r12 = move-exception
            r1 = r5
            r5 = r6
            r6 = r7
            goto L_0x00de
        L_0x00db:
            return r0
        L_0x00dc:
            r12 = move-exception
            r1 = r11
        L_0x00de:
            kotlinx.coroutines.dg r2 = kotlinx.coroutines.C71671dg.f191128a
            io.grpc.f.i r3 = new io.grpc.f.i
            r3.<init>(r5, r12, r6, r4)
            r1.f188531j = r12
            r1.f188522a = r4
            r1.f188523b = r4
            r4 = 3
            r1.f188524c = r4
            java.lang.Object r1 = kotlinx.coroutines.C71803m.m105040a(r2, r3, r1)
            if (r1 != r0) goto L_0x00f5
            return r0
        L_0x00f5:
            r0 = r12
        L_0x00f6:
            goto L_0x00f8
        L_0x00f7:
            throw r0
        L_0x00f8:
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5526f.C70746l.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C70746l lVar = new C70746l(this.f188525d, this.f188526e, this.f188527f, this.f188528g, this.f188529h, this.f188530i, gVar);
        lVar.f188531j = obj;
        return lVar;
    }
}
