package p5488io.p5490b.p5497e.p5498a;

import java.util.LinkedList;
import java.util.List;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.a.f */
/* compiled from: PG */
public final class C69830f implements C69803b, C69826b {

    /* renamed from: a */
    List f186203a;

    /* renamed from: b */
    volatile boolean f186204b;

    /* renamed from: b */
    public final boolean mo61462b(C69803b bVar) {
        C69841j.m101337b(bVar, "d is null");
        if (!this.f186204b) {
            synchronized (this) {
                if (!this.f186204b) {
                    List list = this.f186203a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f186203a = list;
                    }
                    list.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo61463c(p5488io.p5490b.p5494b.C69803b r3) {
        /*
            r2 = this;
            boolean r0 = r2.f186204b
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.f186204b     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return r1
        L_0x000d:
            java.util.List r0 = r2.f186203a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x001d }
            if (r3 != 0) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            r3 = 1
            return r3
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return r1
        L_0x001d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5498a.C69830f.mo61463c(io.b.b.b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r1.hasNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((p5488io.p5490b.p5494b.C69803b) r1.next()).dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        p5488io.p5490b.p5495c.C69813f.m101292a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        throw p5488io.p5490b.p5497e.p5513j.C70085f.m101984a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        throw new p5488io.p5490b.p5495c.C69812e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r4 = this;
            boolean r0 = r4.f186204b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.f186204b     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r4.f186204b = r0     // Catch:{ all -> 0x0056 }
            java.util.List r1 = r4.f186203a     // Catch:{ all -> 0x0056 }
            r2 = 0
            r4.f186203a = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r1.next()
            io.b.b.b r3 = (p5488io.p5490b.p5494b.C69803b) r3
            r3.dispose()     // Catch:{ all -> 0x002c }
            goto L_0x001c
        L_0x002c:
            r3 = move-exception
            p5488io.p5490b.p5495c.C69813f.m101292a(r3)
            if (r2 != 0) goto L_0x0037
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0037:
            r2.add(r3)
            goto L_0x001c
        L_0x003b:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = p5488io.p5490b.p5497e.p5513j.C70085f.m101984a(r0)
            throw r0
        L_0x004f:
            io.b.c.e r0 = new io.b.c.e
            r0.<init>(r2)
            throw r0
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0059:
            throw r0
        L_0x005a:
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5498a.C69830f.dispose():void");
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
