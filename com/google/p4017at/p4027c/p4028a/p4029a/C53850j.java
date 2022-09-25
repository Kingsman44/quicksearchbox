package com.google.p4017at.p4027c.p4028a.p4029a;

import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5526f.C70736b;
import p5488io.grpc.p5533i.C70866e;

/* renamed from: com.google.at.c.a.a.j */
/* compiled from: PG */
public final class C53850j extends C70736b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53850j(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
        C69664n.m101061g(jVar, "channel");
        C69664n.m101061g(iVar, "callOptions");
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        C69664n.m101061g(jVar, "channel");
        return new C53850j(jVar, iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo54030b(com.google.p4017at.p4027c.p4028a.p4029a.C53855o r8, p5488io.grpc.C70334de r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.p4017at.p4027c.p4028a.p4029a.C53848h
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.at.c.a.a.h r0 = (com.google.p4017at.p4027c.p4028a.p4029a.C53848h) r0
            int r1 = r0.f141336c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f141336c = r1
            goto L_0x0018
        L_0x0013:
            com.google.at.c.a.a.h r0 = new com.google.at.c.a.a.h
            r0.<init>(r7, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.f141334a
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f141336c
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            p5462h.C69714l.m101134b(r10)
            goto L_0x007d
        L_0x0028:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0030:
            p5462h.C69714l.m101134b(r10)
            io.grpc.j r1 = r7.f189039a
            io.grpc.di r10 = com.google.p4017at.p4027c.p4028a.p4029a.C53847g.f141332b
            if (r10 != 0) goto L_0x006f
            java.lang.Class<com.google.at.c.a.a.g> r3 = com.google.p4017at.p4027c.p4028a.p4029a.C53847g.class
            monitor-enter(r3)
            io.grpc.di r10 = com.google.p4017at.p4027c.p4028a.p4029a.C53847g.f141332b     // Catch:{ all -> 0x006c }
            if (r10 != 0) goto L_0x006a
            io.grpc.df r10 = p5488io.grpc.C70338di.m102603d()     // Catch:{ all -> 0x006c }
            io.grpc.dh r4 = p5488io.grpc.C70337dh.UNARY     // Catch:{ all -> 0x006c }
            r10.f187487c = r4     // Catch:{ all -> 0x006c }
            java.lang.String r4 = "google.internal.discover.channels.v1.DiscoverChannels"
            java.lang.String r5 = "FollowChannel"
            java.lang.String r4 = p5488io.grpc.C70338di.m102602c(r4, r5)     // Catch:{ all -> 0x006c }
            r10.f187488d = r4     // Catch:{ all -> 0x006c }
            r10.f187489e = r2     // Catch:{ all -> 0x006c }
            com.google.at.c.a.a.o r4 = com.google.p4017at.p4027c.p4028a.p4029a.C53855o.f141341b     // Catch:{ all -> 0x006c }
            io.grpc.dg r4 = p5488io.grpc.p5531h.p5532a.C70850d.m103697c(r4)     // Catch:{ all -> 0x006c }
            r10.f187485a = r4     // Catch:{ all -> 0x006c }
            com.google.at.c.a.a.q r4 = com.google.p4017at.p4027c.p4028a.p4029a.C53857q.f141344a     // Catch:{ all -> 0x006c }
            io.grpc.dg r4 = p5488io.grpc.p5531h.p5532a.C70850d.m103697c(r4)     // Catch:{ all -> 0x006c }
            r10.f187486b = r4     // Catch:{ all -> 0x006c }
            io.grpc.di r10 = r10.mo62040a()     // Catch:{ all -> 0x006c }
            com.google.p4017at.p4027c.p4028a.p4029a.C53847g.f141332b = r10     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r3)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006c }
            throw r8
        L_0x006f:
            io.grpc.i r4 = r7.f189040b
            r6.f141336c = r2
            r2 = r10
            r3 = r8
            r5 = r9
            java.lang.Object r10 = p5488io.grpc.p5526f.C70748n.m103450c(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x007d
            return r0
        L_0x007d:
            java.lang.String r8 = "unaryRpc(\n      channel,…ions,\n      headers\n    )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4017at.p4027c.p4028a.p4029a.C53850j.mo54030b(com.google.at.c.a.a.o, io.grpc.de, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo54031c(com.google.p4017at.p4027c.p4028a.p4029a.C53835aa r8, p5488io.grpc.C70334de r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.p4017at.p4027c.p4028a.p4029a.C53849i
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.at.c.a.a.i r0 = (com.google.p4017at.p4027c.p4028a.p4029a.C53849i) r0
            int r1 = r0.f141339c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f141339c = r1
            goto L_0x0018
        L_0x0013:
            com.google.at.c.a.a.i r0 = new com.google.at.c.a.a.i
            r0.<init>(r7, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.f141337a
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f141339c
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            p5462h.C69714l.m101134b(r10)
            goto L_0x007d
        L_0x0028:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0030:
            p5462h.C69714l.m101134b(r10)
            io.grpc.j r1 = r7.f189039a
            io.grpc.di r10 = com.google.p4017at.p4027c.p4028a.p4029a.C53847g.f141333c
            if (r10 != 0) goto L_0x006f
            java.lang.Class<com.google.at.c.a.a.g> r3 = com.google.p4017at.p4027c.p4028a.p4029a.C53847g.class
            monitor-enter(r3)
            io.grpc.di r10 = com.google.p4017at.p4027c.p4028a.p4029a.C53847g.f141333c     // Catch:{ all -> 0x006c }
            if (r10 != 0) goto L_0x006a
            io.grpc.df r10 = p5488io.grpc.C70338di.m102603d()     // Catch:{ all -> 0x006c }
            io.grpc.dh r4 = p5488io.grpc.C70337dh.UNARY     // Catch:{ all -> 0x006c }
            r10.f187487c = r4     // Catch:{ all -> 0x006c }
            java.lang.String r4 = "google.internal.discover.channels.v1.DiscoverChannels"
            java.lang.String r5 = "UnfollowChannel"
            java.lang.String r4 = p5488io.grpc.C70338di.m102602c(r4, r5)     // Catch:{ all -> 0x006c }
            r10.f187488d = r4     // Catch:{ all -> 0x006c }
            r10.f187489e = r2     // Catch:{ all -> 0x006c }
            com.google.at.c.a.a.aa r4 = com.google.p4017at.p4027c.p4028a.p4029a.C53835aa.f141299b     // Catch:{ all -> 0x006c }
            io.grpc.dg r4 = p5488io.grpc.p5531h.p5532a.C70850d.m103697c(r4)     // Catch:{ all -> 0x006c }
            r10.f187485a = r4     // Catch:{ all -> 0x006c }
            com.google.at.c.a.a.ac r4 = com.google.p4017at.p4027c.p4028a.p4029a.C53837ac.f141302a     // Catch:{ all -> 0x006c }
            io.grpc.dg r4 = p5488io.grpc.p5531h.p5532a.C70850d.m103697c(r4)     // Catch:{ all -> 0x006c }
            r10.f187486b = r4     // Catch:{ all -> 0x006c }
            io.grpc.di r10 = r10.mo62040a()     // Catch:{ all -> 0x006c }
            com.google.p4017at.p4027c.p4028a.p4029a.C53847g.f141333c = r10     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r3)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006c }
            throw r8
        L_0x006f:
            io.grpc.i r4 = r7.f189040b
            r6.f141339c = r2
            r2 = r10
            r3 = r8
            r5 = r9
            java.lang.Object r10 = p5488io.grpc.p5526f.C70748n.m103450c(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x007d
            return r0
        L_0x007d:
            java.lang.String r8 = "unaryRpc(\n      channel,…ions,\n      headers\n    )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4017at.p4027c.p4028a.p4029a.C53850j.mo54031c(com.google.at.c.a.a.aa, io.grpc.de, h.c.g):java.lang.Object");
    }
}
