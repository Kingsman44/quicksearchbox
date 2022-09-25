package p3186j$.util.stream;

/* renamed from: j$.util.stream.p */
final class C41284p extends C41155H1 {

    /* renamed from: b */
    public final /* synthetic */ int f107991b = 0;

    /* renamed from: c */
    boolean f107992c;

    /* renamed from: d */
    Object f107993d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41284p(C41326z1 z1Var, C41171L1 l1) {
        super(l1);
        this.f107993d = z1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[Catch:{ all -> 0x0056, all -> 0x005b }, LOOP:0: B:18:0x0049->B:21:0x0053, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f107991b
            j$.util.stream.L1 r1 = r3.f107737a
            switch(r0) {
                case 0: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0023
        L_0x0008:
            if (r4 != 0) goto L_0x0013
            boolean r4 = r3.f107992c
            if (r4 != 0) goto L_0x0022
            r4 = 1
            r3.f107992c = r4
            r4 = 0
            goto L_0x001d
        L_0x0013:
            java.lang.Object r0 = r3.f107993d
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x001d:
            r3.f107993d = r4
            r1.accept(r4)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r0 = r3.f107993d
            j$.util.stream.z1 r0 = (p3186j$.util.stream.C41326z1) r0
            j$.util.function.Function r0 = r0.f108051t
            java.lang.Object r4 = r0.apply(r4)
            j$.util.stream.Stream r4 = (p3186j$.util.stream.Stream) r4
            if (r4 == 0) goto L_0x0060
            boolean r0 = r3.f107992c     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x003f
            j$.util.stream.BaseStream r0 = r4.sequential()     // Catch:{ all -> 0x0056 }
            j$.util.stream.Stream r0 = (p3186j$.util.stream.Stream) r0     // Catch:{ all -> 0x0056 }
            r0.forEach(r1)     // Catch:{ all -> 0x0056 }
            goto L_0x0060
        L_0x003f:
            j$.util.stream.BaseStream r0 = r4.sequential()     // Catch:{ all -> 0x0056 }
            j$.util.stream.Stream r0 = (p3186j$.util.stream.Stream) r0     // Catch:{ all -> 0x0056 }
            j$.util.Spliterator r0 = r0.spliterator()     // Catch:{ all -> 0x0056 }
        L_0x0049:
            boolean r2 = r1.mo43664e()     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0060
            boolean r2 = r0.tryAdvance(r1)     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0049
            goto L_0x0060
        L_0x0056:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r4 = move-exception
            p3186j$.desugar.sun.nio.p3187fs.C40947a.m71103g(r0, r4)
        L_0x005f:
            throw r0
        L_0x0060:
            if (r4 == 0) goto L_0x0065
            r4.close()
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.stream.C41284p.accept(java.lang.Object):void");
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        int i = this.f107991b;
        C41171L1 l1 = this.f107737a;
        switch (i) {
            case 0:
                this.f107992c = false;
                this.f107993d = null;
                l1.mo43663c(-1);
                return;
            default:
                l1.mo43663c(-1);
                return;
        }
    }

    /* renamed from: e */
    public final boolean mo43664e() {
        switch (this.f107991b) {
            case 1:
                this.f107992c = true;
                return this.f107737a.mo43664e();
            default:
                return super.mo43664e();
        }
    }

    public final void end() {
        switch (this.f107991b) {
            case 0:
                this.f107992c = false;
                this.f107993d = null;
                this.f107737a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    public C41284p(C41171L1 l1) {
        super(l1);
    }
}
