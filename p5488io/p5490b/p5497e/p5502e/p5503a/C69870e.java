package p5488io.p5490b.p5497e.p5502e.p5503a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.p5649d.C72640c;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.C69818d;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69814g;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5500c.C69845d;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.a.e */
/* compiled from: PG */
final class C69870e extends AtomicInteger implements C70094g, C69803b {
    private static final long serialVersionUID = 9032184911934499404L;

    /* renamed from: a */
    final C69801b f186253a;

    /* renamed from: b */
    final int f186254b = 2;

    /* renamed from: c */
    final int f186255c = 2;

    /* renamed from: d */
    final C69869d f186256d = new C69869d(this);

    /* renamed from: e */
    final AtomicBoolean f186257e = new AtomicBoolean();

    /* renamed from: f */
    int f186258f;

    /* renamed from: g */
    int f186259g;

    /* renamed from: h */
    C69847f f186260h;

    /* renamed from: i */
    C72640c f186261i;

    /* renamed from: j */
    volatile boolean f186262j;

    /* renamed from: k */
    volatile boolean f186263k;

    public C69870e(C69801b bVar) {
        this.f186253a = bVar;
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101977h(this.f186261i, cVar)) {
            this.f186261i = cVar;
            long j = (long) this.f186254b;
            if (cVar instanceof C69845d) {
                C69845d dVar = (C69845d) cVar;
                int lM = dVar.mo61478lM(3);
                if (lM == 1) {
                    this.f186258f = 1;
                    this.f186260h = dVar;
                    this.f186262j = true;
                    this.f186253a.mo61460lO(this);
                    mo61495b();
                    return;
                } else if (lM == 2) {
                    this.f186258f = 2;
                    this.f186260h = dVar;
                    this.f186253a.mo61460lO(this);
                    cVar.mo61489e(j);
                    return;
                }
            }
            this.f186260h = new C70037c(this.f186254b);
            this.f186253a.mo61460lO(this);
            cVar.mo61489e(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r1 != null) goto L_0x0039;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61495b() {
        /*
            r4 = this;
            int r0 = r4.getAndIncrement()
            if (r0 != 0) goto L_0x0065
        L_0x0006:
            io.b.e.e.a.d r0 = r4.f186256d
            java.lang.Object r0 = r0.get()
            io.b.b.b r0 = (p5488io.p5490b.p5494b.C69803b) r0
            boolean r0 = p5488io.p5490b.p5497e.p5498a.C69828d.m101306b(r0)
            if (r0 == 0) goto L_0x0015
            return
        L_0x0015:
            boolean r0 = r4.f186263k
            if (r0 != 0) goto L_0x005f
            boolean r0 = r4.f186262j
            io.b.e.c.f r1 = r4.f186260h     // Catch:{ all -> 0x0057 }
            java.lang.Object r1 = r1.mo61479lN()     // Catch:{ all -> 0x0057 }
            io.b.d r1 = (p5488io.p5490b.C69818d) r1     // Catch:{ all -> 0x0057 }
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0037
            if (r1 != 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f186257e
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 == 0) goto L_0x0036
            io.b.b r0 = r4.f186253a
            r0.mo26090a()
        L_0x0036:
            return
        L_0x0037:
            if (r1 == 0) goto L_0x005f
        L_0x0039:
            r4.f186263k = r3
            io.b.e.e.a.d r0 = r4.f186256d
            r1.mo42459a(r0)
            int r0 = r4.f186258f
            if (r0 == r3) goto L_0x005f
            int r0 = r4.f186259g
            int r0 = r0 + r3
            int r1 = r4.f186255c
            if (r0 != r1) goto L_0x0054
            r4.f186259g = r2
            org.d.c r1 = r4.f186261i
            long r2 = (long) r0
            r1.mo61489e(r2)
            goto L_0x005f
        L_0x0054:
            r4.f186259g = r0
            goto L_0x005f
        L_0x0057:
            r0 = move-exception
            p5488io.p5490b.p5495c.C69813f.m101292a(r0)
            r4.mo61496c(r0)
            return
        L_0x005f:
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto L_0x0006
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5502e.p5503a.C69870e.mo61495b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61496c(Throwable th) {
        if (this.f186257e.compareAndSet(false, true)) {
            this.f186261i.mo61490lP();
            this.f186253a.mo26091b(th);
            return;
        }
        C70101a.m102023e(th);
    }

    public final void dispose() {
        this.f186261i.mo61490lP();
        C69828d.m101309f(this.f186256d);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        if (this.f186257e.compareAndSet(false, true)) {
            C69828d.m101309f(this.f186256d);
            this.f186253a.mo26091b(th);
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo61498g(Object obj) {
        C69818d dVar = (C69818d) obj;
        if (this.f186258f != 0 || this.f186260h.mo61477j(dVar)) {
            mo61495b();
        } else {
            mo61497f(new C69814g());
        }
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        this.f186262j = true;
        mo61495b();
    }
}
