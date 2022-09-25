package androidx.media3.p134c;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.p163j.C3496f;
import androidx.media3.extractor.p163j.C3508g;
import java.util.ArrayDeque;

/* renamed from: androidx.media3.c.j */
/* compiled from: PG */
public abstract class C2532j implements C2526d {

    /* renamed from: a */
    public final Object f6963a = new Object();

    /* renamed from: b */
    public final C2529g[] f6964b;

    /* renamed from: c */
    public final C2530h[] f6965c;

    /* renamed from: d */
    public int f6966d;

    /* renamed from: e */
    public int f6967e;

    /* renamed from: f */
    private final Thread f6968f;

    /* renamed from: g */
    private final ArrayDeque f6969g = new ArrayDeque();

    /* renamed from: h */
    private final ArrayDeque f6970h = new ArrayDeque();

    /* renamed from: i */
    private C2529g f6971i;

    /* renamed from: j */
    private C2527e f6972j;

    /* renamed from: k */
    private boolean f6973k;

    /* renamed from: l */
    private boolean f6974l;

    /* renamed from: m */
    private int f6975m;

    protected C2532j(C2529g[] gVarArr, C2530h[] hVarArr) {
        this.f6964b = gVarArr;
        this.f6966d = 2;
        for (int i = 0; i < this.f6966d; i++) {
            this.f6964b[i] = (C3496f) mo5966h();
        }
        this.f6965c = hVarArr;
        this.f6967e = 2;
        for (int i2 = 0; i2 < this.f6967e; i2++) {
            this.f6965c[i2] = (C3508g) mo5967i();
        }
        C2531i iVar = new C2531i(this);
        this.f6968f = iVar;
        iVar.start();
    }

    /* renamed from: l */
    private final void m6663l() {
        C2527e eVar = this.f6972j;
        if (eVar != null) {
            throw eVar;
        }
    }

    /* renamed from: m */
    private final void m6664m(C2529g gVar) {
        gVar.mo5953fg();
        C2529g[] gVarArr = this.f6964b;
        int i = this.f6966d;
        this.f6966d = i + 1;
        gVarArr[i] = (C3496f) gVar;
    }

    /* renamed from: n */
    private final boolean m6665n() {
        return !this.f6969g.isEmpty() && this.f6967e > 0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5955a() {
        C2529g gVar;
        synchronized (this.f6963a) {
            m6663l();
            C2601a.m6832d(this.f6971i == null);
            int i = this.f6966d;
            if (i == 0) {
                gVar = null;
            } else {
                C2529g[] gVarArr = this.f6964b;
                int i2 = i - 1;
                this.f6966d = i2;
                gVar = gVarArr[i2];
            }
            this.f6971i = gVar;
        }
        return gVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5956b() {
        synchronized (this.f6963a) {
            m6663l();
            if (this.f6970h.isEmpty()) {
                return null;
            }
            C2530h hVar = (C2530h) this.f6970h.removeFirst();
            return hVar;
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5958d(Object obj) {
        synchronized (this.f6963a) {
            m6663l();
            C2601a.m6830b(obj == this.f6971i);
            this.f6969g.addLast(obj);
            mo5968j();
            this.f6971i = null;
        }
    }

    /* renamed from: e */
    public final void mo5959e() {
        synchronized (this.f6963a) {
            this.f6974l = true;
            this.f6963a.notify();
        }
        try {
            this.f6968f.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C2527e mo5964f(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C2527e mo5965g(C2529g gVar, C2530h hVar, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C2529g mo5966h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C2530h mo5967i();

    /* renamed from: j */
    public final void mo5968j() {
        if (m6665n()) {
            this.f6963a.notify();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r1.mo5954fh(4) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r3.f6941a = 4 | r3.f6941a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r1.mo5954fh(android.support.p033v7.widget.LinearLayoutManager.INVALID_OFFSET) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r3.f6941a |= android.support.p033v7.widget.LinearLayoutManager.INVALID_OFFSET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r1.mo5954fh(134217728) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r3.f6941a = 134217728 | r3.f6941a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = mo5965g(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        r0 = mo5964f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        r0 = mo5964f(r0);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5969k() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6963a
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r7.f6974l     // Catch:{ all -> 0x00a2 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r7.m6665n()     // Catch:{ all -> 0x00a2 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r7.f6963a     // Catch:{ all -> 0x00a2 }
            r1.wait()     // Catch:{ all -> 0x00a2 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r7.f6974l     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x001a:
            java.util.ArrayDeque r1 = r7.f6969g     // Catch:{ all -> 0x00a2 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00a2 }
            androidx.media3.c.g r1 = (androidx.media3.p134c.C2529g) r1     // Catch:{ all -> 0x00a2 }
            androidx.media3.c.h[] r3 = r7.f6965c     // Catch:{ all -> 0x00a2 }
            int r4 = r7.f6967e     // Catch:{ all -> 0x00a2 }
            int r4 = r4 + -1
            r7.f6967e = r4     // Catch:{ all -> 0x00a2 }
            r3 = r3[r4]     // Catch:{ all -> 0x00a2 }
            boolean r4 = r7.f6973k     // Catch:{ all -> 0x00a2 }
            r7.f6973k = r2     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            r0 = 4
            boolean r5 = r1.mo5954fh(r0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == 0) goto L_0x0040
            int r4 = r3.f6941a
            r0 = r0 | r4
            r3.f6941a = r0
            goto L_0x0074
        L_0x0040:
            boolean r0 = r1.mo5954fh(r6)
            if (r0 == 0) goto L_0x004b
            int r0 = r3.f6941a
            r0 = r0 | r6
            r3.f6941a = r0
        L_0x004b:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r5 = r1.mo5954fh(r0)
            if (r5 == 0) goto L_0x0058
            int r5 = r3.f6941a
            r0 = r0 | r5
            r3.f6941a = r0
        L_0x0058:
            androidx.media3.c.e r0 = r7.mo5965g(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0063, OutOfMemoryError -> 0x005d }
            goto L_0x0068
        L_0x005d:
            r0 = move-exception
            androidx.media3.c.e r0 = r7.mo5964f(r0)
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            androidx.media3.c.e r0 = r7.mo5964f(r0)
        L_0x0068:
            if (r0 == 0) goto L_0x0074
            java.lang.Object r4 = r7.f6963a
            monitor-enter(r4)
            r7.f6972j = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r0
        L_0x0074:
            java.lang.Object r4 = r7.f6963a
            monitor-enter(r4)
            boolean r0 = r7.f6973k     // Catch:{ all -> 0x009f }
            r5 = 1
            if (r0 == 0) goto L_0x0080
            r3.mo5962c()     // Catch:{ all -> 0x009f }
            goto L_0x009a
        L_0x0080:
            boolean r0 = r3.mo5954fh(r6)     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x008f
            int r0 = r7.f6975m     // Catch:{ all -> 0x009f }
            int r0 = r0 + r5
            r7.f6975m = r0     // Catch:{ all -> 0x009f }
            r3.mo5962c()     // Catch:{ all -> 0x009f }
            goto L_0x009a
        L_0x008f:
            int r0 = r7.f6975m     // Catch:{ all -> 0x009f }
            r3.f6961c = r0     // Catch:{ all -> 0x009f }
            r7.f6975m = r2     // Catch:{ all -> 0x009f }
            java.util.ArrayDeque r0 = r7.f6970h     // Catch:{ all -> 0x009f }
            r0.addLast(r3)     // Catch:{ all -> 0x009f }
        L_0x009a:
            r7.m6664m(r1)     // Catch:{ all -> 0x009f }
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            return r5
        L_0x009f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            throw r0
        L_0x00a2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a5:
            throw r1
        L_0x00a6:
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p134c.C2532j.mo5969k():boolean");
    }

    /* renamed from: c */
    public final void mo5957c() {
        synchronized (this.f6963a) {
            this.f6973k = true;
            this.f6975m = 0;
            C2529g gVar = this.f6971i;
            if (gVar != null) {
                m6664m(gVar);
                this.f6971i = null;
            }
            while (!this.f6969g.isEmpty()) {
                m6664m((C2529g) this.f6969g.removeFirst());
            }
            while (!this.f6970h.isEmpty()) {
                ((C2530h) this.f6970h.removeFirst()).mo5962c();
            }
        }
    }
}
