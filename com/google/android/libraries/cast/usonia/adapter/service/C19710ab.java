package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146039s;
import com.google.android.gms.usonia.directory.C146207a;
import com.google.android.libraries.cast.usonia.adapter.p1674a.C19706e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p427am.p438d.p439a.C8706ag;
import com.google.p427am.p438d.p439a.C8717ar;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.ab */
/* compiled from: PG */
public final class C19710ab extends C8706ag {

    /* renamed from: a */
    public static final C59071e f54740a;

    /* renamed from: b */
    public static final C146039s f54741b;

    /* renamed from: c */
    public final C146006ab f54742c;

    /* renamed from: d */
    public final C146207a f54743d;

    static {
        C59071e h = C59071e.m91331h();
        f54740a = h;
        f54741b = new C19706e(h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19710ab(C146006ab abVar, C146207a aVar) {
        super(C69586p.f185991a);
        C69664n.m101061g(abVar, "authTask");
        C69664n.m101061g(aVar, "directoryClient");
        this.f54742c = abVar;
        this.f54743d = aVar;
    }

    /* renamed from: g */
    public final C71587n mo17221g(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        return C71590q.m104504a(new C19728p(this, nVar, (C69577g) null));
    }

    /* renamed from: h */
    public final C71587n mo17223h(C8717ar arVar) {
        C69664n.m101061g(arVar, "request");
        return new C71552db(new C19730r(this, (C69577g) null));
    }

    /* renamed from: i */
    public final C71587n mo17224i(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        return C71590q.m104504a(new C19709aa(this, nVar, (C69577g) null));
    }

    /* renamed from: j */
    public final Object mo17225j() {
        C59052c cVar = (C59052c) f54740a.mo56226d();
        cVar.mo56379ah(new C59094n(47925));
        cVar.mo56386p("isAuthTierMatched() not implemented");
        throw new StatusException(Status.f186916n, (C70334de) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17217c(com.google.p427am.p438d.p439a.C8721av r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.cast.usonia.adapter.service.C19731s
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.cast.usonia.adapter.service.s r0 = (com.google.android.libraries.cast.usonia.adapter.service.C19731s) r0
            int r1 = r0.f54790d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54790d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.cast.usonia.adapter.service.s r0 = new com.google.android.libraries.cast.usonia.adapter.service.s
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f54788b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f54790d
            java.lang.String r3 = "newBuilder()"
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r7 = r0.f54787a
            p5462h.C69714l.m101134b(r8)     // Catch:{ Exception -> 0x002b }
            goto L_0x006c
        L_0x002b:
            r8 = move-exception
            goto L_0x008b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p5462h.C69714l.m101134b(r8)
            com.google.android.gms.tasks.ab r8 = r6.f54742c
            boolean r8 = r8.mo122490i()
            if (r8 != 0) goto L_0x0045
            com.google.android.gms.tasks.ab r8 = r6.f54742c
            com.google.android.gms.tasks.C146021aq.m237852f(r8)
        L_0x0045:
            com.google.android.gms.usonia.directory.a r8 = r6.f54743d     // Catch:{ Exception -> 0x002b }
            com.google.am.d.a.by r2 = r7.f30056b     // Catch:{ Exception -> 0x002b }
            if (r2 != 0) goto L_0x004d
            com.google.am.d.a.by r2 = com.google.p427am.p438d.p439a.C8751by.f30102d     // Catch:{ Exception -> 0x002b }
        L_0x004d:
            java.lang.String r5 = "request.peer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.usonia.PeerAddress r2 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b.m37518a(r2)     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.cq r5 = r7.f30055a     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.tasks.ab r8 = r8.mo122749e(r2, r5)     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "directoryClient\n        …, request.permissionList)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)     // Catch:{ Exception -> 0x002b }
            r0.f54787a = r7     // Catch:{ Exception -> 0x002b }
            r0.f54790d = r4     // Catch:{ Exception -> 0x002b }
            java.lang.Object r7 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19707f.m37524a(r8, r0)     // Catch:{ Exception -> 0x002b }
            if (r7 != r1) goto L_0x006c
            return r1
        L_0x006c:
            com.google.am.d.a.ax r7 = com.google.p427am.p438d.p439a.C8723ax.f30057b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.am.d.a.aw r7 = (com.google.p427am.p438d.p439a.C8722aw) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            com.google.am.d.a.az r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.am.d.a.aw r8 = r7.f30060a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.am.d.a.ax r8 = (com.google.p427am.p438d.p439a.C8723ax) r8
            r8.f30059a = r4
            com.google.am.d.a.ax r7 = r7.mo17226a()
            return r7
        L_0x008b:
            com.google.common.f.e r0 = f54740a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r8 = r0.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.am.d.a.av r7 = (com.google.p427am.p438d.p439a.C8721av) r7
            com.google.protobuf.cq r0 = r7.f30055a
            com.google.am.d.a.by r7 = r7.f30056b
            if (r7 != 0) goto L_0x00a3
            com.google.am.d.a.by r7 = com.google.p427am.p438d.p439a.C8751by.f30102d
        L_0x00a3:
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 47926(0xbb36, float:6.7159E-41)
            r1.<init>(r2)
            r8.mo56379ah(r1)
            java.lang.String r1 = "Permissions %s not granted to: %s"
            r8.mo56354G(r1, r0, r7)
            com.google.am.d.a.ax r7 = com.google.p427am.p438d.p439a.C8723ax.f30057b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.am.d.a.aw r7 = (com.google.p427am.p438d.p439a.C8722aw) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            com.google.am.d.a.az r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.am.d.a.aw r8 = r7.f30060a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.am.d.a.ax r8 = (com.google.p427am.p438d.p439a.C8723ax) r8
            r0 = 0
            r8.f30059a = r0
            com.google.am.d.a.ax r7 = r7.mo17226a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.cast.usonia.adapter.service.C19710ab.mo17217c(com.google.am.d.a.av, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17218d(com.google.p427am.p438d.p439a.C8728bb r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.cast.usonia.adapter.service.C19732t
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.cast.usonia.adapter.service.t r0 = (com.google.android.libraries.cast.usonia.adapter.service.C19732t) r0
            int r1 = r0.f54794d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54794d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.cast.usonia.adapter.service.t r0 = new com.google.android.libraries.cast.usonia.adapter.service.t
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f54792b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f54794d
            java.lang.String r3 = "newBuilder()"
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r7 = r0.f54791a
            p5462h.C69714l.m101134b(r8)     // Catch:{ Exception -> 0x002b }
            goto L_0x006c
        L_0x002b:
            r8 = move-exception
            goto L_0x008b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p5462h.C69714l.m101134b(r8)
            com.google.android.gms.tasks.ab r8 = r6.f54742c
            boolean r8 = r8.mo122490i()
            if (r8 != 0) goto L_0x0045
            com.google.android.gms.tasks.ab r8 = r6.f54742c
            com.google.android.gms.tasks.C146021aq.m237852f(r8)
        L_0x0045:
            com.google.android.gms.usonia.directory.a r8 = r6.f54743d     // Catch:{ Exception -> 0x002b }
            com.google.am.d.a.by r2 = r7.f30067b     // Catch:{ Exception -> 0x002b }
            if (r2 != 0) goto L_0x004d
            com.google.am.d.a.by r2 = com.google.p427am.p438d.p439a.C8751by.f30102d     // Catch:{ Exception -> 0x002b }
        L_0x004d:
            java.lang.String r5 = "request.peer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.usonia.PeerAddress r2 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b.m37518a(r2)     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.cq r5 = r7.f30066a     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.tasks.ab r8 = r8.mo122748d(r2, r5)     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "directoryClient\n        …, request.permissionList)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)     // Catch:{ Exception -> 0x002b }
            r0.f54791a = r7     // Catch:{ Exception -> 0x002b }
            r0.f54794d = r4     // Catch:{ Exception -> 0x002b }
            java.lang.Object r7 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19707f.m37524a(r8, r0)     // Catch:{ Exception -> 0x002b }
            if (r7 != r1) goto L_0x006c
            return r1
        L_0x006c:
            com.google.am.d.a.bd r7 = com.google.p427am.p438d.p439a.C8730bd.f30068b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.am.d.a.bc r7 = (com.google.p427am.p438d.p439a.C8729bc) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            com.google.am.d.a.bf r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.am.d.a.bc r8 = r7.f30071a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.am.d.a.bd r8 = (com.google.p427am.p438d.p439a.C8730bd) r8
            r8.f30070a = r4
            com.google.am.d.a.bd r7 = r7.mo17227a()
            return r7
        L_0x008b:
            com.google.common.f.e r0 = f54740a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r8 = r0.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.am.d.a.bb r7 = (com.google.p427am.p438d.p439a.C8728bb) r7
            com.google.protobuf.cq r0 = r7.f30066a
            com.google.am.d.a.by r7 = r7.f30067b
            if (r7 != 0) goto L_0x00a3
            com.google.am.d.a.by r7 = com.google.p427am.p438d.p439a.C8751by.f30102d
        L_0x00a3:
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 47927(0xbb37, float:6.716E-41)
            r1.<init>(r2)
            r8.mo56379ah(r1)
            java.lang.String r1 = "Permissions %s not granted to: %s"
            r8.mo56354G(r1, r0, r7)
            com.google.am.d.a.bd r7 = com.google.p427am.p438d.p439a.C8730bd.f30068b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.am.d.a.bc r7 = (com.google.p427am.p438d.p439a.C8729bc) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            com.google.am.d.a.bf r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.am.d.a.bc r8 = r7.f30071a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.am.d.a.bd r8 = (com.google.p427am.p438d.p439a.C8730bd) r8
            r0 = 0
            r8.f30070a = r0
            com.google.am.d.a.bd r7 = r7.mo17227a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.cast.usonia.adapter.service.C19710ab.mo17218d(com.google.am.d.a.bb, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.am.d.a.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.am.d.a.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.am.d.a.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.am.d.a.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.am.d.a.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.am.d.a.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.am.d.a.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.am.d.a.bh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17219e(com.google.p427am.p438d.p439a.C8734bh r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.cast.usonia.adapter.service.C19733u
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.cast.usonia.adapter.service.u r0 = (com.google.android.libraries.cast.usonia.adapter.service.C19733u) r0
            int r1 = r0.f54800f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54800f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.cast.usonia.adapter.service.u r0 = new com.google.android.libraries.cast.usonia.adapter.service.u
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f54798d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f54800f
            r3 = 1
            r4 = 0
            java.lang.String r5 = "newBuilder()"
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r9 = r0.f54797c
            java.lang.Object r1 = r0.f54796b
            java.lang.Object r0 = r0.f54795a
            p5462h.C69714l.m101134b(r10)     // Catch:{ NumberFormatException -> 0x0030 }
            goto L_0x0092
        L_0x0030:
            r9 = r0
            goto L_0x00b5
        L_0x0034:
            r9 = r0
            goto L_0x00f7
        L_0x0038:
            r9 = r0
            goto L_0x0139
        L_0x003c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0044:
            p5462h.C69714l.m101134b(r10)
            com.google.android.gms.tasks.ab r10 = r8.f54742c
            boolean r10 = r10.mo122490i()
            if (r10 != 0) goto L_0x0054
            com.google.android.gms.tasks.ab r10 = r8.f54742c
            com.google.android.gms.tasks.C146021aq.m237852f(r10)
        L_0x0054:
            com.google.android.gms.usonia.directory.a r10 = r8.f54743d     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r2 = r9.f30074a     // Catch:{ IllegalArgumentException -> 0x0138, UnknownHostException -> 0x00f6 }
            com.google.am.d.a.by r6 = r9.f30075b     // Catch:{ IllegalArgumentException -> 0x0138, UnknownHostException -> 0x00f6 }
            if (r6 != 0) goto L_0x005e
            com.google.am.d.a.by r6 = com.google.p427am.p438d.p439a.C8751by.f30102d     // Catch:{ IllegalArgumentException -> 0x0138, UnknownHostException -> 0x00f6 }
        L_0x005e:
            java.lang.String r7 = "request.peer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ NumberFormatException -> 0x00b4 }
            com.google.android.gms.usonia.PeerAddress r6 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b.m37518a(r6)     // Catch:{ NumberFormatException -> 0x00b4 }
            com.google.android.gms.tasks.ab r10 = r10.mo122746b(r2, r6)     // Catch:{ NumberFormatException -> 0x00b4 }
            com.google.am.d.a.bj r2 = com.google.p427am.p438d.p439a.C8736bj.f30076b     // Catch:{ NumberFormatException -> 0x00b4 }
            com.google.am.d.a.bj r2 = com.google.p427am.p438d.p439a.C8736bj.f30076b     // Catch:{ IllegalArgumentException -> 0x0138, UnknownHostException -> 0x00f6 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ IllegalArgumentException -> 0x0138, UnknownHostException -> 0x00f6 }
            com.google.am.d.a.bi r2 = (com.google.p427am.p438d.p439a.C8735bi) r2     // Catch:{ IllegalArgumentException -> 0x0138, UnknownHostException -> 0x00f6 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)     // Catch:{ NumberFormatException -> 0x00b4 }
            com.google.am.d.a.bl r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r6 = "task"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r6)     // Catch:{ NumberFormatException -> 0x00b4 }
            r0.f54795a = r9     // Catch:{ NumberFormatException -> 0x00b4 }
            r0.f54796b = r2     // Catch:{ NumberFormatException -> 0x00b4 }
            r0.f54797c = r2     // Catch:{ NumberFormatException -> 0x00b4 }
            r0.f54800f = r3     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.Object r10 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19707f.m37524a(r10, r0)     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r10 == r1) goto L_0x00b3
            r0 = r9
            r9 = r2
            r1 = r9
        L_0x0092:
            java.lang.String r2 = "task.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)     // Catch:{ NumberFormatException -> 0x0030 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ NumberFormatException -> 0x0030 }
            boolean r10 = r10.booleanValue()     // Catch:{ NumberFormatException -> 0x0030 }
            com.google.am.d.a.bl r9 = (com.google.p427am.p438d.p439a.C8738bl) r9     // Catch:{ IllegalArgumentException -> 0x0038, UnknownHostException -> 0x0034 }
            com.google.am.d.a.bi r9 = r9.f30079a     // Catch:{ IllegalArgumentException -> 0x0038, UnknownHostException -> 0x0034 }
            r9.copyOnWrite()     // Catch:{ IllegalArgumentException -> 0x0038, UnknownHostException -> 0x0034 }
            com.google.protobuf.bv r9 = r9.instance     // Catch:{ IllegalArgumentException -> 0x0038, UnknownHostException -> 0x0034 }
            com.google.am.d.a.bj r9 = (com.google.p427am.p438d.p439a.C8736bj) r9     // Catch:{ IllegalArgumentException -> 0x0038, UnknownHostException -> 0x0034 }
            com.google.am.d.a.bj r2 = com.google.p427am.p438d.p439a.C8736bj.f30076b     // Catch:{ IllegalArgumentException -> 0x0038, UnknownHostException -> 0x0034 }
            r9.f30078a = r10     // Catch:{ IllegalArgumentException -> 0x0038, UnknownHostException -> 0x0034 }
            com.google.am.d.a.bl r1 = (com.google.p427am.p438d.p439a.C8738bl) r1     // Catch:{ NumberFormatException -> 0x0030 }
            com.google.am.d.a.bj r9 = r1.mo17228a()     // Catch:{ NumberFormatException -> 0x0030 }
            return r9
        L_0x00b3:
            return r1
        L_0x00b4:
        L_0x00b5:
            com.google.common.f.e r10 = f54740a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.am.d.a.bh r9 = (com.google.p427am.p438d.p439a.C8734bh) r9
            com.google.am.d.a.by r9 = r9.f30075b
            if (r9 != 0) goto L_0x00c5
            com.google.am.d.a.by r9 = com.google.p427am.p438d.p439a.C8751by.f30102d
        L_0x00c5:
            java.lang.String r9 = r9.f30105b
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 47930(0xbb3a, float:6.7164E-41)
            r0.<init>(r1)
            r10.mo56379ah(r0)
            java.lang.String r0 = "Illegal port format: %s"
            r10.mo56389s(r0, r9)
            com.google.am.d.a.bj r9 = com.google.p427am.p438d.p439a.C8736bj.f30076b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.am.d.a.bi r9 = (com.google.p427am.p438d.p439a.C8735bi) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
            com.google.am.d.a.bl r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.am.d.a.bi r10 = r9.f30079a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.am.d.a.bj r10 = (com.google.p427am.p438d.p439a.C8736bj) r10
            r10.f30078a = r4
            com.google.am.d.a.bj r9 = r9.mo17228a()
            return r9
        L_0x00f6:
        L_0x00f7:
            com.google.common.f.e r10 = f54740a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.am.d.a.bh r9 = (com.google.p427am.p438d.p439a.C8734bh) r9
            com.google.am.d.a.by r9 = r9.f30075b
            if (r9 != 0) goto L_0x0107
            com.google.am.d.a.by r9 = com.google.p427am.p438d.p439a.C8751by.f30102d
        L_0x0107:
            java.lang.String r9 = r9.f30105b
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 47929(0xbb39, float:6.7163E-41)
            r0.<init>(r1)
            r10.mo56379ah(r0)
            java.lang.String r0 = "Illegal IP address format: %s"
            r10.mo56389s(r0, r9)
            com.google.am.d.a.bj r9 = com.google.p427am.p438d.p439a.C8736bj.f30076b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.am.d.a.bi r9 = (com.google.p427am.p438d.p439a.C8735bi) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
            com.google.am.d.a.bl r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.am.d.a.bi r10 = r9.f30079a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.am.d.a.bj r10 = (com.google.p427am.p438d.p439a.C8736bj) r10
            r10.f30078a = r4
            com.google.am.d.a.bj r9 = r9.mo17228a()
            return r9
        L_0x0138:
        L_0x0139:
            com.google.common.f.e r10 = f54740a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.am.d.a.bh r9 = (com.google.p427am.p438d.p439a.C8734bh) r9
            com.google.am.d.a.by r9 = r9.f30075b
            if (r9 != 0) goto L_0x0149
            com.google.am.d.a.by r9 = com.google.p427am.p438d.p439a.C8751by.f30102d
        L_0x0149:
            int r9 = r9.f30104a
            com.google.am.d.a.bx r9 = com.google.p427am.p438d.p439a.C8750bx.m23400a(r9)
            if (r9 != 0) goto L_0x0153
            com.google.am.d.a.bx r9 = com.google.p427am.p438d.p439a.C8750bx.UNRECOGNIZED
        L_0x0153:
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 47928(0xbb38, float:6.7161E-41)
            r0.<init>(r1)
            r10.mo56379ah(r0)
            java.lang.String r0 = "Illegal peer address type: %s"
            r10.mo56389s(r0, r9)
            com.google.am.d.a.bj r9 = com.google.p427am.p438d.p439a.C8736bj.f30076b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.am.d.a.bi r9 = (com.google.p427am.p438d.p439a.C8735bi) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
            com.google.am.d.a.bl r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.am.d.a.bi r10 = r9.f30079a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.am.d.a.bj r10 = (com.google.p427am.p438d.p439a.C8736bj) r10
            r10.f30078a = r4
            com.google.am.d.a.bj r9 = r9.mo17228a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.cast.usonia.adapter.service.C19710ab.mo17219e(com.google.am.d.a.bh, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17220f(com.google.p427am.p438d.p439a.C8754ca r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.cast.usonia.adapter.service.C19734v
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.cast.usonia.adapter.service.v r0 = (com.google.android.libraries.cast.usonia.adapter.service.C19734v) r0
            int r1 = r0.f54806f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54806f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.cast.usonia.adapter.service.v r0 = new com.google.android.libraries.cast.usonia.adapter.service.v
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f54804d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f54806f
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r8 = r0.f54803c
            java.lang.Object r1 = r0.f54802b
            java.lang.Object r0 = r0.f54801a
            p5462h.C69714l.m101134b(r9)     // Catch:{ Exception -> 0x002d }
            goto L_0x008c
        L_0x002d:
            r8 = move-exception
            goto L_0x00c2
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            p5462h.C69714l.m101134b(r9)
            com.google.android.gms.tasks.ab r9 = r7.f54742c
            boolean r9 = r9.mo122490i()
            if (r9 != 0) goto L_0x0048
            com.google.android.gms.tasks.ab r9 = r7.f54742c
            com.google.android.gms.tasks.C146021aq.m237852f(r9)
        L_0x0048:
            com.google.am.d.a.cc r9 = com.google.p427am.p438d.p439a.C8756cc.f30111b     // Catch:{ Exception -> 0x00bf }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ Exception -> 0x00bf }
            com.google.am.d.a.cb r9 = (com.google.p427am.p438d.p439a.C8755cb) r9     // Catch:{ Exception -> 0x00bf }
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)     // Catch:{ Exception -> 0x00bf }
            com.google.am.d.a.cd r2 = new com.google.am.d.a.cd     // Catch:{ Exception -> 0x00bf }
            r2.<init>(r9)     // Catch:{ Exception -> 0x00bf }
            com.google.android.gms.usonia.directory.a r9 = r7.f54743d     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = r8.f30109a     // Catch:{ Exception -> 0x00bf }
            com.google.am.d.a.by r5 = r8.f30110b     // Catch:{ Exception -> 0x00bf }
            if (r5 != 0) goto L_0x0069
            com.google.am.d.a.by r5 = com.google.p427am.p438d.p439a.C8751by.f30102d     // Catch:{ Exception -> 0x00bf }
        L_0x0069:
            java.lang.String r6 = "request.peer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ Exception -> 0x00bf }
            com.google.android.gms.usonia.PeerAddress r5 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b.m37518a(r5)     // Catch:{ Exception -> 0x00bf }
            com.google.android.gms.tasks.ab r9 = r9.mo122752h(r4, r5)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = "directoryClient\n        …peer.toPeerAddressJava())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r4)     // Catch:{ Exception -> 0x00bf }
            r0.f54801a = r8     // Catch:{ Exception -> 0x00bf }
            r0.f54802b = r2     // Catch:{ Exception -> 0x00bf }
            r0.f54803c = r2     // Catch:{ Exception -> 0x00bf }
            r0.f54806f = r3     // Catch:{ Exception -> 0x00bf }
            java.lang.Object r9 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19707f.m37524a(r9, r0)     // Catch:{ Exception -> 0x00bf }
            if (r9 == r1) goto L_0x00be
            r0 = r8
            r8 = r2
            r1 = r8
        L_0x008c:
            java.lang.String r2 = "directoryClient\n        …a())\n            .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x002d }
            com.google.android.gms.usonia.PeerAddress r9 = (com.google.android.gms.usonia.PeerAddress) r9     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.by r9 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b.m37520c(r9)     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.cd r8 = (com.google.p427am.p438d.p439a.C8757cd) r8     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.cb r8 = r8.f30114a     // Catch:{ Exception -> 0x002d }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x002d }
            com.google.protobuf.bv r8 = r8.instance     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.cc r8 = (com.google.p427am.p438d.p439a.C8756cc) r8     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.cc r2 = com.google.p427am.p438d.p439a.C8756cc.f30111b     // Catch:{ Exception -> 0x002d }
            r9.getClass()     // Catch:{ Exception -> 0x002d }
            r8.f30113a = r9     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.cd r1 = (com.google.p427am.p438d.p439a.C8757cd) r1     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.cb r8 = r1.f30114a     // Catch:{ Exception -> 0x002d }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ Exception -> 0x002d }
            java.lang.String r9 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ Exception -> 0x002d }
            com.google.am.d.a.cc r8 = (com.google.p427am.p438d.p439a.C8756cc) r8     // Catch:{ Exception -> 0x002d }
            return r8
        L_0x00be:
            return r1
        L_0x00bf:
            r9 = move-exception
            r0 = r8
            r8 = r9
        L_0x00c2:
            com.google.common.f.e r9 = f54740a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.x r9 = r9.mo56382g(r8)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 47931(0xbb3b, float:6.7166E-41)
            r1.<init>(r2)
            r9.mo56379ah(r1)
            java.lang.String r1 = "Failed to resolve peer address for request %s"
            r9.mo56389s(r1, r0)
            io.grpc.StatusException r9 = new io.grpc.StatusException
            io.grpc.Status r0 = p5488io.grpc.Status.f186906d
            io.grpc.Status r8 = r0.mo61678e(r8)
            r0 = 0
            r9.<init>(r8, r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.cast.usonia.adapter.service.C19710ab.mo17220f(com.google.am.d.a.ca, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.am.d.a.al} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17216b(com.google.p427am.p438d.p439a.C8708ai r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.cast.usonia.adapter.service.C19729q
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.cast.usonia.adapter.service.q r0 = (com.google.android.libraries.cast.usonia.adapter.service.C19729q) r0
            int r1 = r0.f54783e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54783e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.cast.usonia.adapter.service.q r0 = new com.google.android.libraries.cast.usonia.adapter.service.q
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f54781c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f54783e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f54780b
            java.lang.Object r0 = r0.f54779a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0075
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p5462h.C69714l.m101134b(r8)
            com.google.android.gms.tasks.ab r8 = r6.f54742c
            boolean r8 = r8.mo122490i()
            if (r8 != 0) goto L_0x0043
            com.google.android.gms.tasks.ab r8 = r6.f54742c
            com.google.android.gms.tasks.C146021aq.m237852f(r8)
        L_0x0043:
            com.google.am.d.a.ak r8 = com.google.p427am.p438d.p439a.C8710ak.f30040b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.am.d.a.aj r8 = (com.google.p427am.p438d.p439a.C8709aj) r8
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r2)
            com.google.am.d.a.al r2 = new com.google.am.d.a.al
            r2.<init>(r8)
            com.google.android.gms.usonia.directory.a r8 = r6.f54743d
            java.lang.String r7 = r7.f30039a
            com.google.android.gms.tasks.ab r7 = r8.mo122747c(r7)
            java.lang.String r8 = "directoryClient.fetchAll…sses(request.serviceName)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r0.f54779a = r2
            r0.f54780b = r2
            r0.f54783e = r3
            java.lang.Object r8 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19707f.m37524a(r7, r0)
            if (r8 == r1) goto L_0x00e3
            r7 = r2
            r0 = r7
        L_0x0075:
            java.lang.String r1 = "directoryClient.fetchAll…uest.serviceName).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0080:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r1 = r8.next()
            com.google.android.gms.usonia.PeerAddress r1 = (com.google.android.gms.usonia.PeerAddress) r1
            com.google.protobuf.a.b r2 = new com.google.protobuf.a.b
            r3 = r7
            com.google.am.d.a.al r3 = (com.google.p427am.p438d.p439a.C8711al) r3
            com.google.am.d.a.aj r4 = r3.f30043a
            com.google.protobuf.bv r4 = r4.instance
            com.google.am.d.a.ak r4 = (com.google.p427am.p438d.p439a.C8710ak) r4
            com.google.protobuf.cq r4 = r4.f30042a
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            java.lang.String r5 = "_builder.getPeersList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r2.<init>(r4)
            java.lang.String r2 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.am.d.a.by r1 = com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b.m37520c(r1)
            java.lang.String r2 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.am.d.a.aj r2 = r3.f30043a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.am.d.a.ak r2 = (com.google.p427am.p438d.p439a.C8710ak) r2
            r1.getClass()
            com.google.protobuf.cq r3 = r2.f30042a
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x00cd
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r2.f30042a = r3
        L_0x00cd:
            com.google.protobuf.cq r2 = r2.f30042a
            r2.add(r1)
            goto L_0x0080
        L_0x00d3:
            com.google.am.d.a.al r0 = (com.google.p427am.p438d.p439a.C8711al) r0
            com.google.am.d.a.aj r7 = r0.f30043a
            com.google.protobuf.bv r7 = r7.build()
            java.lang.String r8 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            com.google.am.d.a.ak r7 = (com.google.p427am.p438d.p439a.C8710ak) r7
            return r7
        L_0x00e3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.cast.usonia.adapter.service.C19710ab.mo17216b(com.google.am.d.a.ai, h.c.g):java.lang.Object");
    }
}
