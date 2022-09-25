package kotlinx.coroutines.p5581g;

import kotlinx.coroutines.C71345a;
import p5462h.C69465a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5497e.p5502e.p5505c.C69909c;

/* renamed from: kotlinx.coroutines.g.c */
/* compiled from: PG */
public final class C71758c extends C71345a {

    /* renamed from: b */
    private final C69909c f191243b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71758c(C69585o oVar, C69909c cVar) {
        super(oVar, false, true);
        C69664n.m101061g(oVar, "parentContext");
        this.f191243b = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo62681j(Throwable th, boolean z) {
        C69664n.m101061g(th, "cause");
        try {
            if (this.f191243b.mo61516a(th)) {
                return;
            }
        } catch (Throwable th2) {
            C69465a.m100953a(th, th2);
        }
        C71757b.m104946a(th, this.f190536a);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r1 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        r1.dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        kotlinx.coroutines.p5581g.C71757b.m104946a(r4, r3.f190536a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:1:0x0002, B:6:0x0018, B:20:0x0040] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62682k(java.lang.Object r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x002a
            io.b.e.e.c.c r4 = r3.f191243b     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x0054 }
            io.b.e.a.d r1 = p5488io.p5490b.p5497e.p5498a.C69828d.f186198a     // Catch:{ all -> 0x0054 }
            if (r0 == r1) goto L_0x0053
            io.b.e.a.d r0 = p5488io.p5490b.p5497e.p5498a.C69828d.f186198a     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r4.getAndSet(r0)     // Catch:{ all -> 0x0054 }
            io.b.b.b r0 = (p5488io.p5490b.p5494b.C69803b) r0     // Catch:{ all -> 0x0054 }
            io.b.e.a.d r1 = p5488io.p5490b.p5497e.p5498a.C69828d.f186198a     // Catch:{ all -> 0x0054 }
            if (r0 == r1) goto L_0x0053
            io.b.i r4 = r4.f186342a     // Catch:{ all -> 0x0023 }
            r4.mo26090a()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0053
            r0.dispose()     // Catch:{ all -> 0x0054 }
            return
        L_0x0023:
            r4 = move-exception
            if (r0 == 0) goto L_0x0029
            r0.dispose()     // Catch:{ all -> 0x0054 }
        L_0x0029:
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x002a:
            io.b.e.e.c.c r0 = r3.f191243b     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0054 }
            io.b.e.a.d r2 = p5488io.p5490b.p5497e.p5498a.C69828d.f186198a     // Catch:{ all -> 0x0054 }
            if (r1 == r2) goto L_0x0053
            io.b.e.a.d r1 = p5488io.p5490b.p5497e.p5498a.C69828d.f186198a     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r0.getAndSet(r1)     // Catch:{ all -> 0x0054 }
            io.b.b.b r1 = (p5488io.p5490b.p5494b.C69803b) r1     // Catch:{ all -> 0x0054 }
            io.b.e.a.d r2 = p5488io.p5490b.p5497e.p5498a.C69828d.f186198a     // Catch:{ all -> 0x0054 }
            if (r1 == r2) goto L_0x0053
            io.b.i r0 = r0.f186342a     // Catch:{ all -> 0x004b }
            r0.mo61488d(r4)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0053
            r1.dispose()     // Catch:{ all -> 0x0054 }
            return
        L_0x004b:
            r4 = move-exception
            if (r1 != 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r1.dispose()     // Catch:{ all -> 0x0054 }
        L_0x0052:
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x0053:
            return
        L_0x0054:
            r4 = move-exception
            h.c.o r0 = r3.f190536a
            kotlinx.coroutines.p5581g.C71757b.m104946a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5581g.C71758c.mo62682k(java.lang.Object):void");
    }
}
