package com.google.p4486ci.p4487a;

import java.util.concurrent.Callable;

/* renamed from: com.google.ci.a.k */
/* compiled from: PG */
public final /* synthetic */ class C58106k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58108m f155323a;

    public /* synthetic */ C58106k(C58108m mVar) {
        this.f155323a = mVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object call() {
        /*
            r8 = this;
            com.google.ci.a.m r0 = r8.f155323a
            monitor-enter(r0)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            r0.mo54666b()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.util.Random r1 = new java.util.Random     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r1.<init>()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r2.<init>()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r3 = 0
        L_0x0012:
            r4 = 70
            if (r3 >= r4) goto L_0x0025
            char[] r4 = com.google.p4486ci.p4487a.C58108m.f155325a     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            int r5 = r4.length     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            int r5 = r1.nextInt(r5)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            char r4 = r4[r5]     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r2.append(r4)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0025:
            java.lang.String r1 = r2.toString()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.e r2 = new com.google.ci.a.e     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r2.<init>()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.e r3 = new com.google.ci.a.e     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r3.<init>()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.e r4 = r0.f155328d     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.util.Set r4 = r4.mo54652c()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
        L_0x003d:
            boolean r5 = r4.hasNext()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            if (r5 == 0) goto L_0x0069
            java.lang.Object r5 = r4.next()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r6 = com.google.common.base.C58890d.m90988c(r5)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r7 = "content-"
            boolean r6 = r6.startsWith(r7)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            if (r6 == 0) goto L_0x005f
            com.google.ci.a.e r6 = r0.f155328d     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r6 = r6.mo54650a(r5)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r2.mo54654e(r5, r6)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            goto L_0x003d
        L_0x005f:
            com.google.ci.a.e r6 = r0.f155328d     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r6 = r6.mo54650a(r5)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r3.mo54654e(r5, r6)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            goto L_0x003d
        L_0x0069:
            com.google.ci.a.j r4 = new com.google.ci.a.j     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r5 = r0.f155329e     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.b r6 = r0.f155330f     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r4.<init>(r1, r5, r2, r6)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r2 = "X-Goog-Upload-Protocol"
            java.lang.String r5 = "multipart"
            r3.mo54654e(r2, r5)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "multipart/related; boundary="
            java.lang.String r1 = r5.concat(r1)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r3.mo54654e(r2, r1)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r1 = r0.f155326b     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r2 = r0.f155327c     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.s r1 = com.google.p4486ci.p4487a.C58104i.m88864a(r1, r2, r3, r4)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.w r2 = r0.f155331g     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            if (r2 == 0) goto L_0x00a2
            monitor-enter(r0)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.l r2 = new com.google.ci.a.l     // Catch:{ all -> 0x009f }
            com.google.ci.a.w r3 = r0.f155331g     // Catch:{ all -> 0x009f }
            r2.<init>(r3)     // Catch:{ all -> 0x009f }
            int r3 = r0.f155332h     // Catch:{ all -> 0x009f }
            r1.mo54663f(r2, r3)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            goto L_0x00a2
        L_0x009f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r1     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
        L_0x00a2:
            monitor-enter(r0)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.common.util.concurrent.cx r1 = r1.mo54658a()     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x00cd, ExecutionException -> 0x00cb }
            com.google.ci.a.v r1 = (com.google.p4486ci.p4487a.C58117v) r1     // Catch:{ InterruptedException -> 0x00cd, ExecutionException -> 0x00cb }
            boolean r2 = r1.mo54671b()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            if (r2 == 0) goto L_0x00c3
            com.google.ci.a.u r2 = r1.f155365a     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.t r2 = r2.f155364a     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.t r3 = com.google.p4486ci.p4487a.C58115t.CANCELED     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            if (r2 != r3) goto L_0x00c0
            r0.mo54666b()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            goto L_0x00c3
        L_0x00c0:
            com.google.ci.a.u r1 = r1.f155365a     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            throw r1     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
        L_0x00c3:
            com.google.ci.a.f r1 = r1.f155366b     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            com.google.ci.a.v r2 = new com.google.ci.a.v     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r2.<init>((com.google.p4486ci.p4487a.C58101f) r1)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            goto L_0x00fe
        L_0x00cb:
            r1 = move-exception
            goto L_0x00ce
        L_0x00cd:
            r1 = move-exception
        L_0x00ce:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r3 = "Unexpected error occurred: "
            java.lang.String r1 = r1.getMessage()     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            java.lang.String r1 = r3.concat(r1)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            r2.<init>(r1)     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
            throw r2     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
        L_0x00e2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            throw r1     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1     // Catch:{ u -> 0x00f8, all -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            com.google.ci.a.u r2 = new com.google.ci.a.u
            com.google.ci.a.t r3 = com.google.p4486ci.p4487a.C58115t.UNKNOWN
            r4 = 0
            r2.<init>(r3, r4, r1)
            com.google.ci.a.v r1 = new com.google.ci.a.v
            r1.<init>((com.google.p4486ci.p4487a.C58116u) r2)
            r2 = r1
            goto L_0x00fe
        L_0x00f8:
            r1 = move-exception
            com.google.ci.a.v r2 = new com.google.ci.a.v
            r2.<init>((com.google.p4486ci.p4487a.C58116u) r1)
        L_0x00fe:
            monitor-enter(r0)
            com.google.ci.a.w r1 = r0.f155331g     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0114
            boolean r3 = r2.mo54670a()     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x010f
            com.google.ci.a.f r3 = r2.f155366b     // Catch:{ all -> 0x0116 }
            r1.mo23081b(r3)     // Catch:{ all -> 0x0116 }
            goto L_0x0114
        L_0x010f:
            com.google.ci.a.u r3 = r2.f155365a     // Catch:{ all -> 0x0116 }
            r1.mo23080a(r0, r3)     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            return r2
        L_0x0116:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            goto L_0x011a
        L_0x0119:
            throw r1
        L_0x011a:
            goto L_0x0119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4486ci.p4487a.C58106k.call():java.lang.Object");
    }
}
