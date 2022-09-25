package kotlinx.coroutines.p5579e;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: kotlinx.coroutines.e.ba */
/* compiled from: PG */
final class C71720ba extends C71727i {

    /* renamed from: a */
    public static final C71720ba f191192a = new C71720ba();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f191193b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap f191194c = new WeakHashMap();

    private C71720ba() {
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final p5462h.p5473f.p5474a.C69626l mo62975a(java.lang.Class r7) {
        /*
            r6 = this;
            java.lang.String r0 = "key"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f191193b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap r2 = f191194c     // Catch:{ all -> 0x0073 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0073 }
            h.f.a.l r2 = (p5462h.p5473f.p5474a.C69626l) r2     // Catch:{ all -> 0x0073 }
            r1.unlock()
            if (r2 != 0) goto L_0x0072
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x002b
            int r2 = r0.getReadHoldCount()
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r4 >= r2) goto L_0x0035
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0035:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap r4 = f191194c     // Catch:{ all -> 0x0065 }
            java.lang.Object r5 = r4.get(r7)     // Catch:{ all -> 0x0065 }
            h.f.a.l r5 = (p5462h.p5473f.p5474a.C69626l) r5     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0052
        L_0x0046:
            if (r3 >= r2) goto L_0x004e
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0046
        L_0x004e:
            r0.unlock()
            return r5
        L_0x0052:
            h.f.a.l r5 = kotlinx.coroutines.p5579e.C71736r.m104897b(r7)     // Catch:{ all -> 0x0065 }
            r4.put(r7, r5)     // Catch:{ all -> 0x0065 }
        L_0x0059:
            if (r3 >= r2) goto L_0x0061
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0061:
            r0.unlock()
            return r5
        L_0x0065:
            r7 = move-exception
        L_0x0066:
            if (r3 >= r2) goto L_0x006e
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0066
        L_0x006e:
            r0.unlock()
            throw r7
        L_0x0072:
            return r2
        L_0x0073:
            r7 = move-exception
            r1.unlock()
            goto L_0x0079
        L_0x0078:
            throw r7
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5579e.C71720ba.mo62975a(java.lang.Class):h.f.a.l");
    }
}
