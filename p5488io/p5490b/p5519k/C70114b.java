package p5488io.p5490b.p5519k;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69823e;
import p5488io.p5490b.p5497e.p5513j.C70080a;
import p5488io.p5490b.p5497e.p5513j.C70089j;

/* renamed from: io.b.k.b */
/* compiled from: PG */
public final class C70114b implements C69803b, C69823e {

    /* renamed from: a */
    final C70123o f186865a;

    /* renamed from: b */
    final C70115c f186866b;

    /* renamed from: c */
    boolean f186867c;

    /* renamed from: d */
    boolean f186868d;

    /* renamed from: e */
    C70080a f186869e;

    /* renamed from: f */
    boolean f186870f;

    /* renamed from: g */
    volatile boolean f186871g;

    /* renamed from: h */
    long f186872h;

    public C70114b(C70123o oVar, C70115c cVar) {
        this.f186865a = oVar;
        this.f186866b = cVar;
    }

    /* renamed from: a */
    public final boolean mo61474a(Object obj) {
        return this.f186871g || C70089j.m101990c(obj, this.f186865a);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
        r3.f186870f = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61645b(java.lang.Object r4, long r5) {
        /*
            r3 = this;
            boolean r0 = r3.f186871g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r3.f186870f
            if (r0 != 0) goto L_0x0036
            monitor-enter(r3)
            boolean r0 = r3.f186871g     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0010:
            long r0 = r3.f186872h     // Catch:{ all -> 0x0033 }
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0018
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0018:
            boolean r5 = r3.f186868d     // Catch:{ all -> 0x0033 }
            if (r5 == 0) goto L_0x002c
            io.b.e.j.a r5 = r3.f186869e     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x0027
            io.b.e.j.a r5 = new io.b.e.j.a     // Catch:{ all -> 0x0033 }
            r5.<init>()     // Catch:{ all -> 0x0033 }
            r3.f186869e = r5     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r5.mo61623a(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x002c:
            r5 = 1
            r3.f186867c = r5     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            r3.f186870f = r5
            goto L_0x0036
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        L_0x0036:
            r3.mo61474a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5519k.C70114b.mo61645b(java.lang.Object, long):void");
    }

    public final void dispose() {
        if (!this.f186871g) {
            this.f186871g = true;
            this.f186866b.mo61646u(this);
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
