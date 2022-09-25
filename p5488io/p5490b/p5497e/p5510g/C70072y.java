package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: io.b.e.g.y */
/* compiled from: PG */
public final class C70072y extends AtomicReferenceArray implements Runnable, Callable, C69803b {

    /* renamed from: a */
    static final Object f186787a = new Object();

    /* renamed from: b */
    static final Object f186788b = new Object();

    /* renamed from: c */
    static final Object f186789c = new Object();

    /* renamed from: d */
    static final Object f186790d = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: e */
    final Runnable f186791e;

    public C70072y(Runnable runnable, C69826b bVar) {
        super(3);
        this.f186791e = runnable;
        lazySet(0, bVar);
    }

    /* renamed from: a */
    public final void mo61618a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f186790d) {
                if (obj == f186788b) {
                    future.cancel(false);
                    return;
                } else if (obj == f186789c) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public final Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r7 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r7.get(r0)
            java.lang.Object r2 = f186790d
            r3 = 0
            if (r1 != r2) goto L_0x000b
            goto L_0x0031
        L_0x000b:
            java.lang.Object r2 = f186788b
            if (r1 == r2) goto L_0x0031
            java.lang.Object r4 = f186789c
            if (r1 == r4) goto L_0x0031
            r5 = 2
            java.lang.Object r5 = r7.get(r5)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r5 == r6) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r5 == 0) goto L_0x0024
            r2 = r4
        L_0x0024:
            boolean r0 = r7.compareAndSet(r0, r1, r2)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r5)
        L_0x0031:
            java.lang.Object r0 = r7.get(r3)
            java.lang.Object r1 = f186790d
            if (r0 == r1) goto L_0x004b
            java.lang.Object r1 = f186787a
            if (r0 == r1) goto L_0x004b
            if (r0 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            boolean r1 = r7.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0031
            io.b.e.a.b r0 = (p5488io.p5490b.p5497e.p5498a.C69826b) r0
            r0.mo61463c(r7)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5510g.C70072y.dispose():void");
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f186791e.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f186787a || !compareAndSet(0, obj3, f186790d) || obj3 == null)) {
                ((C69826b) obj3).mo61463c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f186788b || obj2 == f186789c || compareAndSet(1, obj2, f186790d)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f186790d));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f186787a || !compareAndSet(0, obj4, f186790d) || obj4 == null)) {
            ((C69826b) obj4).mo61463c(this);
        }
        do {
            obj = get(1);
            if (obj == f186788b || obj == f186789c || compareAndSet(1, obj, f186790d)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f186790d));
    }
}
