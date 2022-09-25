package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.d */
/* compiled from: PG */
final class C69974d extends AtomicReference implements C70123o {
    private static final long serialVersionUID = -4823716997131257941L;

    /* renamed from: a */
    final C69975e f186505a;

    /* renamed from: b */
    final int f186506b;

    public C69974d(C69975e eVar, int i) {
        this.f186505a = eVar;
        this.f186506b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 == r2.length) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r1 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        r0.mo61547a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        r0.mo61549c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25986a() {
        /*
            r5 = this;
            io.b.e.e.d.e r0 = r5.f186505a
            int r1 = r5.f186506b
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.f186510d     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x000b:
            r1 = r2[r1]     // Catch:{ all -> 0x0029 }
            r3 = 1
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            if (r1 != 0) goto L_0x001d
            int r4 = r0.f186516j     // Catch:{ all -> 0x0029 }
            int r4 = r4 + r3
            r0.f186516j = r4     // Catch:{ all -> 0x0029 }
            int r2 = r2.length     // Catch:{ all -> 0x0029 }
            if (r4 != r2) goto L_0x001f
        L_0x001d:
            r0.f186513g = r3     // Catch:{ all -> 0x0029 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0025
            r0.mo61547a()
        L_0x0025:
            r0.mo61549c()
            return
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5502e.p5506d.C69974d.mo25986a():void");
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        C69975e eVar = this.f186505a;
        if (C70085f.m101987d(eVar.f186514h, th)) {
            eVar.mo61547a();
            eVar.mo61549c();
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        C69828d.m101307c(this, bVar);
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        this.f186505a.mo61550d(this.f186506b, obj);
    }
}
