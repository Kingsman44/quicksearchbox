package p5488io.grpc;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* renamed from: io.grpc.ae */
/* compiled from: PG */
public final class C70141ae extends C70148al implements Closeable {

    /* renamed from: a */
    public final C70153aq f186976a;

    /* renamed from: b */
    public ScheduledFuture f186977b;

    /* renamed from: h */
    private final C70148al f186978h = new C70148al((C70148al) this, this.f186994f);

    /* renamed from: i */
    private ArrayList f186979i;

    /* renamed from: j */
    private C70142af f186980j;

    /* renamed from: k */
    private Throwable f186981k;

    /* renamed from: l */
    private boolean f186982l;

    public C70141ae(C70148al alVar) {
        super(alVar, alVar.f186994f);
        this.f186976a = alVar.mo61697b();
    }

    /* renamed from: a */
    public final C70148al mo61696a() {
        return this.f186978h.mo61696a();
    }

    /* renamed from: b */
    public final C70153aq mo61697b() {
        return this.f186976a;
    }

    /* renamed from: c */
    public final Throwable mo61698c() {
        if (mo61705i()) {
            return this.f186981k;
        }
        return null;
    }

    public final void close() {
        mo61706j((Throwable) null);
    }

    /* renamed from: d */
    public final void mo61700d(C70142af afVar, Executor executor) {
        m102136q(afVar, "cancellationListener");
        m102136q(executor, "executor");
        mo61701e(new C70144ah(executor, afVar, this));
    }

    /* renamed from: e */
    public final void mo61701e(C70144ah ahVar) {
        synchronized (this) {
            if (mo61705i()) {
                ahVar.mo61709a();
            } else {
                ArrayList arrayList = this.f186979i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.f186979i = arrayList2;
                    arrayList2.add(ahVar);
                    C70141ae aeVar = this.f186993e;
                    if (aeVar != null) {
                        this.f186980j = new C70139ac(this);
                        aeVar.mo61701e(new C70144ah(C70143ag.f186983a, this.f186980j, this));
                    }
                } else {
                    arrayList.add(ahVar);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo61702f(C70148al alVar) {
        this.f186978h.mo61702f(alVar);
    }

    /* renamed from: g */
    public final void mo61703g(C70142af afVar) {
        mo61704h(afVar, this);
    }

    /* renamed from: h */
    public final void mo61704h(C70142af afVar, C70148al alVar) {
        synchronized (this) {
            ArrayList arrayList = this.f186979i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C70144ah ahVar = (C70144ah) this.f186979i.get(size);
                    if (ahVar.f186985a == afVar && ahVar.f186986b == alVar) {
                        this.f186979i.remove(size);
                        break;
                    }
                }
                if (this.f186979i.isEmpty()) {
                    C70141ae aeVar = this.f186993e;
                    if (aeVar != null) {
                        aeVar.mo61704h(this.f186980j, aeVar);
                    }
                    this.f186980j = null;
                    this.f186979i = null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (super.mo61705i() == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        mo61706j(super.mo61698c());
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61705i() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f186982l     // Catch:{ all -> 0x0019 }
            r1 = 1
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x0008:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            boolean r0 = super.mo61705i()
            if (r0 == 0) goto L_0x0017
            java.lang.Throwable r0 = super.mo61698c()
            r2.mo61706j(r0)
            return r1
        L_0x0017:
            r0 = 0
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.C70141ae.mo61705i():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        r2 = r7.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        if (r3 >= r2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r4 = (p5488io.grpc.C70144ah) r7.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r4.f186986b != r6) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        r4.mo61709a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        r2 = r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (r1 >= r2) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004a, code lost:
        r3 = (p5488io.grpc.C70144ah) r7.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r3.f186986b == r6) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        r3.mo61709a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        r7 = r6.f186993e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
        r7.mo61704h(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61706j(java.lang.Throwable r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f186982l     // Catch:{ all -> 0x0066 }
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r0 = 1
            r6.f186982l = r0     // Catch:{ all -> 0x0066 }
            java.util.concurrent.ScheduledFuture r3 = r6.f186977b     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0011
            r6.f186977b = r2     // Catch:{ all -> 0x0066 }
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            r6.f186981k = r7     // Catch:{ all -> 0x0066 }
            goto L_0x0017
        L_0x0015:
            r3 = r2
            r0 = 0
        L_0x0017:
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x001d
            r3.cancel(r1)
        L_0x001d:
            if (r0 == 0) goto L_0x0065
            monitor-enter(r6)
            java.util.ArrayList r7 = r6.f186979i     // Catch:{ all -> 0x0062 }
            if (r7 != 0) goto L_0x0026
            monitor-exit(r6)     // Catch:{ all -> 0x0062 }
            return
        L_0x0026:
            io.grpc.af r0 = r6.f186980j     // Catch:{ all -> 0x0062 }
            r6.f186980j = r2     // Catch:{ all -> 0x0062 }
            r6.f186979i = r2     // Catch:{ all -> 0x0062 }
            monitor-exit(r6)     // Catch:{ all -> 0x0062 }
            int r2 = r7.size()
            r3 = 0
        L_0x0032:
            if (r3 >= r2) goto L_0x0044
            java.lang.Object r4 = r7.get(r3)
            io.grpc.ah r4 = (p5488io.grpc.C70144ah) r4
            io.grpc.al r5 = r4.f186986b
            if (r5 != r6) goto L_0x0041
            r4.mo61709a()
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x0044:
            int r2 = r7.size()
        L_0x0048:
            if (r1 >= r2) goto L_0x005a
            java.lang.Object r3 = r7.get(r1)
            io.grpc.ah r3 = (p5488io.grpc.C70144ah) r3
            io.grpc.al r4 = r3.f186986b
            if (r4 == r6) goto L_0x0057
            r3.mo61709a()
        L_0x0057:
            int r1 = r1 + 1
            goto L_0x0048
        L_0x005a:
            io.grpc.ae r7 = r6.f186993e
            if (r7 == 0) goto L_0x0065
            r7.mo61704h(r0, r7)
            return
        L_0x0062:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0062 }
            throw r7
        L_0x0065:
            return
        L_0x0066:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r7
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.C70141ae.mo61706j(java.lang.Throwable):void");
    }

    public C70141ae(C70148al alVar, C70153aq aqVar) {
        super(alVar, alVar.f186994f);
        this.f186976a = aqVar;
    }
}
