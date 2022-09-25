package androidx.media3.exoplayer.p151k;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3088bz;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.k.g */
/* compiled from: PG */
public final class C3241g {

    /* renamed from: a */
    private int f9740a;

    /* renamed from: b */
    private int f9741b;

    /* renamed from: c */
    private int f9742c = 0;

    /* renamed from: d */
    private C3232a[] f9743d = new C3232a[100];

    /* renamed from: a */
    public final synchronized int mo7234a() {
        return this.f9741b * 65536;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized androidx.media3.exoplayer.p151k.C3232a mo7235b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f9741b     // Catch:{ all -> 0x0037 }
            int r0 = r0 + 1
            r4.f9741b = r0     // Catch:{ all -> 0x0037 }
            int r0 = r4.f9742c     // Catch:{ all -> 0x0037 }
            if (r0 <= 0) goto L_0x001a
            androidx.media3.exoplayer.k.a[] r1 = r4.f9743d     // Catch:{ all -> 0x0037 }
            int r0 = r0 + -1
            r4.f9742c = r0     // Catch:{ all -> 0x0037 }
            r2 = r1[r0]     // Catch:{ all -> 0x0037 }
            r2.getClass()
            r3 = 0
            r1[r0] = r3     // Catch:{ all -> 0x0037 }
            goto L_0x002a
        L_0x001a:
            androidx.media3.exoplayer.k.a r2 = new androidx.media3.exoplayer.k.a     // Catch:{ all -> 0x0037 }
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
            r2.<init>(r0)     // Catch:{ all -> 0x0037 }
            int r0 = r4.f9741b     // Catch:{ all -> 0x0037 }
            androidx.media3.exoplayer.k.a[] r1 = r4.f9743d     // Catch:{ all -> 0x0037 }
            int r3 = r1.length     // Catch:{ all -> 0x0037 }
            if (r0 > r3) goto L_0x002c
        L_0x002a:
            monitor-exit(r4)
            return r2
        L_0x002c:
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ all -> 0x0037 }
            androidx.media3.exoplayer.k.a[] r0 = (androidx.media3.exoplayer.p151k.C3232a[]) r0     // Catch:{ all -> 0x0037 }
            r4.f9743d = r0     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)
            return r2
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p151k.C3241g.mo7235b():androidx.media3.exoplayer.k.a");
    }

    /* renamed from: c */
    public final synchronized void mo7236c(C3232a aVar) {
        C3232a[] aVarArr = this.f9743d;
        int i = this.f9742c;
        this.f9742c = i + 1;
        aVarArr[i] = aVar;
        this.f9741b--;
        notifyAll();
    }

    /* renamed from: d */
    public final synchronized void mo7237d() {
        mo7238e(0);
    }

    /* renamed from: e */
    public final synchronized void mo7238e(int i) {
        int i2 = this.f9740a;
        this.f9740a = i;
        if (i < i2) {
            mo7239f();
        }
    }

    /* renamed from: f */
    public final synchronized void mo7239f() {
        int max = Math.max(0, C2612ak.m6979d(this.f9740a, 65536) - this.f9741b);
        int i = this.f9742c;
        if (max < i) {
            Arrays.fill(this.f9743d, max, i, (Object) null);
            this.f9742c = max;
        }
    }

    /* renamed from: g */
    public final synchronized void mo7240g(C3088bz bzVar) {
        while (bzVar != null) {
            C3232a[] aVarArr = this.f9743d;
            int i = this.f9742c;
            this.f9742c = i + 1;
            C3232a aVar = bzVar.f9017c;
            aVar.getClass();
            aVarArr[i] = aVar;
            this.f9741b--;
            bzVar = bzVar.f9018d;
            if (bzVar == null || bzVar.f9017c == null) {
                bzVar = null;
            }
        }
        notifyAll();
    }
}
