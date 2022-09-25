package p5488io.grpc.p5525e;

/* renamed from: io.grpc.e.bj */
/* compiled from: PG */
final class C70394bj extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ C70406bv f187602a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70394bj(C70407bw bwVar, C70406bv bvVar) {
        super(bwVar.f187628a);
        this.f187602a = bvVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r1.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        ((java.lang.Runnable) r1.next()).run();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62079a() {
        /*
            r4 = this;
            io.grpc.e.bv r0 = r4.f187602a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0007:
            monitor-enter(r0)
            java.util.List r2 = r0.f187625c     // Catch:{ all -> 0x0036 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0018
            r1 = 0
            r0.f187625c = r1     // Catch:{ all -> 0x0036 }
            r1 = 1
            r0.f187624b = r1     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0018:
            java.util.List r2 = r0.f187625c     // Catch:{ all -> 0x0036 }
            r0.f187625c = r1     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r2.iterator()
        L_0x0021:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r1.next()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            goto L_0x0021
        L_0x0031:
            r2.clear()
            r1 = r2
            goto L_0x0007
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x003a
        L_0x0039:
            throw r1
        L_0x003a:
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70394bj.mo62079a():void");
    }
}
