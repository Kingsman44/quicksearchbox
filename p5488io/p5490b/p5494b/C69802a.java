package p5488io.p5490b.p5494b;

import java.util.ArrayList;
import p5488io.p5490b.p5495c.C69812e;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69826b;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5497e.p5513j.C70090k;

/* renamed from: io.b.b.a */
/* compiled from: PG */
public final class C69802a implements C69803b, C69826b {

    /* renamed from: a */
    C70090k f186191a;

    /* renamed from: b */
    public volatile boolean f186192b;

    /* renamed from: d */
    static final void m101275d(C70090k kVar) {
        if (kVar != null) {
            ArrayList arrayList = null;
            for (Object obj : kVar.f186824d) {
                if (obj instanceof C69803b) {
                    try {
                        ((C69803b) obj).dispose();
                    } catch (Throwable th) {
                        C69813f.m101292a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C70085f.m101984a((Throwable) arrayList.get(0));
            }
            throw new C69812e(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo61461a() {
        if (!this.f186192b) {
            synchronized (this) {
                if (!this.f186192b) {
                    C70090k kVar = this.f186191a;
                    this.f186191a = null;
                    m101275d(kVar);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61462b(p5488io.p5490b.p5494b.C69803b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "disposable is null"
            p5488io.p5490b.p5497e.p5499b.C69841j.m101337b(r10, r0)
            boolean r0 = r9.f186192b
            if (r0 != 0) goto L_0x008d
            monitor-enter(r9)
            boolean r0 = r9.f186192b     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0088
            io.b.e.j.k r0 = r9.f186191a     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0019
            io.b.e.j.k r0 = new io.b.e.j.k     // Catch:{ all -> 0x008a }
            r0.<init>()     // Catch:{ all -> 0x008a }
            r9.f186191a = r0     // Catch:{ all -> 0x008a }
        L_0x0019:
            java.lang.Object[] r1 = r0.f186824d     // Catch:{ all -> 0x008a }
            int r2 = r0.f186821a     // Catch:{ all -> 0x008a }
            int r3 = r10.hashCode()     // Catch:{ all -> 0x008a }
            int r3 = p5488io.p5490b.p5497e.p5513j.C70090k.m101992a(r3)     // Catch:{ all -> 0x008a }
            r3 = r3 & r2
            r4 = r1[r3]     // Catch:{ all -> 0x008a }
            r5 = 1
            if (r4 == 0) goto L_0x0040
            boolean r4 = r4.equals(r10)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0032
            goto L_0x0086
        L_0x0032:
            int r3 = r3 + r5
            r3 = r3 & r2
            r4 = r1[r3]     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x0039
            goto L_0x0040
        L_0x0039:
            boolean r4 = r4.equals(r10)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0032
            goto L_0x0086
        L_0x0040:
            r1[r3] = r10     // Catch:{ all -> 0x008a }
            int r10 = r0.f186822b     // Catch:{ all -> 0x008a }
            int r10 = r10 + r5
            r0.f186822b = r10     // Catch:{ all -> 0x008a }
            int r1 = r0.f186823c     // Catch:{ all -> 0x008a }
            if (r10 < r1) goto L_0x0086
            java.lang.Object[] r1 = r0.f186824d     // Catch:{ all -> 0x008a }
            int r2 = r1.length     // Catch:{ all -> 0x008a }
            int r3 = r2 + r2
            int r4 = r3 + -1
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x008a }
        L_0x0054:
            int r7 = r10 + -1
            if (r10 != 0) goto L_0x0065
            r0.f186821a = r4     // Catch:{ all -> 0x008a }
            float r10 = (float) r3     // Catch:{ all -> 0x008a }
            r1 = 1061158912(0x3f400000, float:0.75)
            float r10 = r10 * r1
            int r10 = (int) r10     // Catch:{ all -> 0x008a }
            r0.f186823c = r10     // Catch:{ all -> 0x008a }
            r0.f186824d = r6     // Catch:{ all -> 0x008a }
            goto L_0x0086
        L_0x0065:
            int r2 = r2 + -1
            r10 = r1[r2]     // Catch:{ all -> 0x008a }
            if (r10 != 0) goto L_0x006c
            goto L_0x0065
        L_0x006c:
            int r10 = r10.hashCode()     // Catch:{ all -> 0x008a }
            int r10 = p5488io.p5490b.p5497e.p5513j.C70090k.m101992a(r10)     // Catch:{ all -> 0x008a }
            r10 = r10 & r4
            r8 = r6[r10]     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            int r10 = r10 + r5
            r10 = r10 & r4
            r8 = r6[r10]     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x007a
        L_0x0080:
            r8 = r1[r2]     // Catch:{ all -> 0x008a }
            r6[r10] = r8     // Catch:{ all -> 0x008a }
            r10 = r7
            goto L_0x0054
        L_0x0086:
            monitor-exit(r9)     // Catch:{ all -> 0x008a }
            return r5
        L_0x0088:
            monitor-exit(r9)     // Catch:{ all -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x008a }
            throw r10
        L_0x008d:
            r10.dispose()
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5494b.C69802a.mo61462b(io.b.b.b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61463c(p5488io.p5490b.p5494b.C69803b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            p5488io.p5490b.p5497e.p5499b.C69841j.m101337b(r8, r0)
            boolean r0 = r7.f186192b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.f186192b     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            return r1
        L_0x0012:
            io.b.e.j.k r0 = r7.f186191a     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            java.lang.Object[] r2 = r0.f186824d     // Catch:{ all -> 0x0046 }
            int r3 = r0.f186821a     // Catch:{ all -> 0x0046 }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x0046 }
            int r4 = p5488io.p5490b.p5497e.p5513j.C70090k.m101992a(r4)     // Catch:{ all -> 0x0046 }
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0046 }
            if (r5 != 0) goto L_0x0028
            goto L_0x0044
        L_0x0028:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0046 }
            r6 = 1
            if (r5 == 0) goto L_0x0033
            r0.mo61631b(r4, r2, r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0042
        L_0x0033:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0044
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0033
            r0.mo61631b(r4, r2, r3)     // Catch:{ all -> 0x0046 }
        L_0x0042:
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            return r6
        L_0x0044:
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            return r1
        L_0x0046:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0049:
            throw r8
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5494b.C69802a.mo61463c(io.b.b.b):boolean");
    }

    public final void dispose() {
        if (!this.f186192b) {
            synchronized (this) {
                if (!this.f186192b) {
                    this.f186192b = true;
                    C70090k kVar = this.f186191a;
                    this.f186191a = null;
                    m101275d(kVar);
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo61464f(C69803b bVar) {
        if (mo61463c(bVar)) {
            bVar.dispose();
        }
    }
}
