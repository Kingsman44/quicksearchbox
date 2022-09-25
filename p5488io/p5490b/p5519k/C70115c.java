package p5488io.p5490b.p5519k;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5497e.p5513j.C70089j;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.k.c */
/* compiled from: PG */
public final class C70115c extends C70119g {

    /* renamed from: a */
    static final C70114b[] f186873a = new C70114b[0];

    /* renamed from: b */
    static final C70114b[] f186874b = new C70114b[0];

    /* renamed from: c */
    public final AtomicReference f186875c;

    /* renamed from: d */
    final AtomicReference f186876d;

    /* renamed from: e */
    final ReadWriteLock f186877e;

    /* renamed from: f */
    final Lock f186878f;

    /* renamed from: g */
    final Lock f186879g;

    /* renamed from: h */
    final AtomicReference f186880h;

    /* renamed from: i */
    long f186881i;

    public C70115c() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f186877e = reentrantReadWriteLock;
        this.f186878f = reentrantReadWriteLock.readLock();
        this.f186879g = reentrantReadWriteLock.writeLock();
        this.f186876d = new AtomicReference(f186873a);
        this.f186875c = new AtomicReference();
        this.f186880h = new AtomicReference();
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (C70113a.m102026a(this.f186880h, (Object) null, C70085f.f186815a)) {
            C70089j jVar = C70089j.f186819a;
            for (C70114b b : mo61648w(jVar)) {
                b.mo61645b(jVar, this.f186881i);
            }
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        C69841j.m101337b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C70113a.m102026a(this.f186880h, (Object) null, th)) {
            C70101a.m102023e(th);
            return;
        }
        Object a = C70089j.m101988a(th);
        for (C70114b b : mo61648w(a)) {
            b.mo61645b(a, this.f186881i);
        }
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (this.f186880h.get() != null) {
            bVar.dispose();
        }
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        C69841j.m101337b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f186880h.get() == null) {
            C70089j jVar = C70089j.f186819a;
            mo61647v(obj);
            for (C70114b b : (C70114b[]) this.f186876d.get()) {
                b.mo61645b(obj, this.f186881i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r0.mo61474a(r6) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (r0.f186871g != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007c, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r6 = r0.f186869e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r6 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        r0.f186868d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0085, code lost:
        r0.f186869e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0088, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
        r6 = r6.f186812a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
        if (r6 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
        if (r1 >= 4) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0091, code lost:
        r3 = r6[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0093, code lost:
        if (r3 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009a, code lost:
        if (r0.mo61474a(r3) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009f, code lost:
        r6 = r6[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61493q(p5488io.p5490b.C70123o r6) {
        /*
            r5 = this;
            io.b.k.b r0 = new io.b.k.b
            r0.<init>(r6, r5)
            r6.mo26850d(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r5.f186876d
            java.lang.Object r1 = r1.get()
            io.b.k.b[] r1 = (p5488io.p5490b.p5519k.C70114b[]) r1
            io.b.k.b[] r2 = f186874b
            if (r1 != r2) goto L_0x0028
            java.util.concurrent.atomic.AtomicReference r0 = r5.f186880h
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = p5488io.p5490b.p5497e.p5513j.C70085f.f186815a
            if (r0 != r1) goto L_0x0024
            r6.mo25986a()
            return
        L_0x0024:
            r6.mo25987b(r0)
            return
        L_0x0028:
            int r2 = r1.length
            int r3 = r2 + 1
            io.b.k.b[] r3 = new p5488io.p5490b.p5519k.C70114b[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r3[r2] = r0
            java.util.concurrent.atomic.AtomicReference r2 = r5.f186876d
            boolean r1 = p5488io.p5490b.p5519k.C70113a.m102026a(r2, r1, r3)
            if (r1 == 0) goto L_0x0008
            boolean r6 = r0.f186871g
            if (r6 != 0) goto L_0x00ab
            boolean r6 = r0.f186871g
            if (r6 == 0) goto L_0x0044
            goto L_0x00a7
        L_0x0044:
            monitor-enter(r0)
            boolean r6 = r0.f186871g     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x004b
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x004b:
            boolean r6 = r0.f186867c     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x0051
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0051:
            io.b.k.c r6 = r0.f186866b     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.locks.Lock r1 = r6.f186878f     // Catch:{ all -> 0x00a8 }
            r1.lock()     // Catch:{ all -> 0x00a8 }
            long r2 = r6.f186881i     // Catch:{ all -> 0x00a8 }
            r0.f186872h = r2     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.atomic.AtomicReference r6 = r6.f186875c     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x00a8 }
            r1.unlock()     // Catch:{ all -> 0x00a8 }
            r1 = 1
            if (r6 == 0) goto L_0x006a
            r2 = 1
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            r0.f186868d = r2     // Catch:{ all -> 0x00a8 }
            r0.f186867c = r1     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x00a7
            boolean r6 = r0.mo61474a(r6)
            if (r6 != 0) goto L_0x00a7
        L_0x0078:
            boolean r6 = r0.f186871g
            if (r6 != 0) goto L_0x00a7
            monitor-enter(r0)
            io.b.e.j.a r6 = r0.f186869e     // Catch:{ all -> 0x00a4 }
            if (r6 != 0) goto L_0x0085
            r0.f186868d = r4     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            return
        L_0x0085:
            r1 = 0
            r0.f186869e = r1     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.Object[] r6 = r6.f186812a
        L_0x008b:
            if (r6 == 0) goto L_0x0078
            r1 = 0
        L_0x008e:
            r2 = 4
            if (r1 >= r2) goto L_0x009f
            r3 = r6[r1]
            if (r3 != 0) goto L_0x0096
            goto L_0x009f
        L_0x0096:
            boolean r2 = r0.mo61474a(r3)
            if (r2 != 0) goto L_0x0078
            int r1 = r1 + 1
            goto L_0x008e
        L_0x009f:
            r6 = r6[r2]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            goto L_0x008b
        L_0x00a4:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            throw r6
        L_0x00a7:
            return
        L_0x00a8:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r6
        L_0x00ab:
            r5.mo61646u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5519k.C70115c.mo61493q(io.b.o):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo61646u(C70114b bVar) {
        C70114b[] bVarArr;
        C70114b[] bVarArr2;
        do {
            bVarArr = (C70114b[]) this.f186876d.get();
            int length = bVarArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (bVarArr[i] == bVar) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bVarArr2 = f186873a;
                    } else {
                        C70114b[] bVarArr3 = new C70114b[(length - 1)];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                        System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C70113a.m102026a(this.f186876d, bVarArr, bVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo61647v(Object obj) {
        this.f186879g.lock();
        this.f186881i++;
        this.f186875c.lazySet(obj);
        this.f186879g.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final C70114b[] mo61648w(Object obj) {
        AtomicReference atomicReference = this.f186876d;
        C70114b[] bVarArr = f186874b;
        C70114b[] bVarArr2 = (C70114b[]) atomicReference.getAndSet(bVarArr);
        if (bVarArr2 != bVarArr) {
            mo61647v(obj);
        }
        return bVarArr2;
    }

    public C70115c(Object obj) {
        this();
        AtomicReference atomicReference = this.f186875c;
        C69841j.m101337b(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
    }
}
