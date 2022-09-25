package androidx.camera.core.p069a.p070a.p072b;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.core.a.a.b.c */
/* compiled from: PG */
final class C1254c extends C1257f implements Runnable {

    /* renamed from: a */
    volatile C60870cx f3652a;

    /* renamed from: c */
    private C1252a f3653c;

    /* renamed from: d */
    private final BlockingQueue f3654d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    private final CountDownLatch f3655e = new CountDownLatch(1);

    /* renamed from: f */
    private C60870cx f3656f;

    public C1254c(C1252a aVar, C60870cx cxVar) {
        aVar.getClass();
        this.f3653c = aVar;
        cxVar.getClass();
        this.f3656f = cxVar;
    }

    /* renamed from: d */
    private static final void m3418d(Future future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!super.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f3654d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        m3418d(this.f3656f, z);
        m3418d(this.f3652a, z);
        return true;
    }

    public final Object get() {
        if (!isDone()) {
            C60870cx cxVar = this.f3656f;
            if (cxVar != null) {
                cxVar.get();
            }
            this.f3655e.await();
            C60870cx cxVar2 = this.f3652a;
            if (cxVar2 != null) {
                cxVar2.get();
            }
        }
        return super.get();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            com.google.common.util.concurrent.cx r2 = r4.f3656f     // Catch:{ CancellationException -> 0x0072, ExecutionException -> 0x0063 }
            java.lang.Object r2 = androidx.camera.core.p069a.p070a.p072b.C1263l.m3435g(r2)     // Catch:{ CancellationException -> 0x0072, ExecutionException -> 0x0063 }
            androidx.camera.core.a.a.b.a r3 = r4.f3653c     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            com.google.common.util.concurrent.cx r2 = r3.mo3782a(r2)     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r4.f3652a = r2     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            boolean r3 = r4.isCancelled()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            if (r3 == 0) goto L_0x0048
            java.util.concurrent.BlockingQueue r3 = r4.f3654d     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
        L_0x0018:
            java.lang.Object r3 = r3.take()     // Catch:{ InterruptedException -> 0x0046, all -> 0x003a }
            if (r0 == 0) goto L_0x0025
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r0.interrupt()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
        L_0x0025:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            boolean r0 = r3.booleanValue()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r2.cancel(r0)     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r4.f3652a = r1     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r0 = r4.f3655e
        L_0x0036:
            r0.countDown()
            return
        L_0x003a:
            r2 = move-exception
            if (r0 != 0) goto L_0x003e
            goto L_0x0045
        L_0x003e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r0.interrupt()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
        L_0x0045:
            throw r2     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
        L_0x0046:
            r0 = 1
            goto L_0x0018
        L_0x0048:
            androidx.camera.core.a.a.b.b r0 = new androidx.camera.core.a.a.b.b     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r0.<init>(r4, r2)     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            java.util.concurrent.Executor r3 = androidx.camera.core.p069a.p070a.p071a.C1238a.m3410a()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r2.mo4106b(r0, r3)     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r0 = r4.f3655e
            goto L_0x0036
        L_0x005b:
            r0 = move-exception
            goto L_0x009e
        L_0x005d:
            r0 = move-exception
            goto L_0x007c
        L_0x005f:
            r0 = move-exception
            goto L_0x0086
        L_0x0061:
            r0 = move-exception
            goto L_0x0090
        L_0x0063:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r4.mo4107c(r0)     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r0 = r4.f3655e
            goto L_0x0036
        L_0x0072:
            r4.cancel(r0)     // Catch:{ UndeclaredThrowableException -> 0x0061, Exception -> 0x005f, Error -> 0x005d }
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r0 = r4.f3655e
            goto L_0x0036
        L_0x007c:
            r4.mo4107c(r0)     // Catch:{ all -> 0x005b }
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r0 = r4.f3655e
            goto L_0x0036
        L_0x0086:
            r4.mo4107c(r0)     // Catch:{ all -> 0x005b }
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r0 = r4.f3655e
            goto L_0x0036
        L_0x0090:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x005b }
            r4.mo4107c(r0)     // Catch:{ all -> 0x005b }
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r0 = r4.f3655e
            goto L_0x0036
        L_0x009e:
            r4.f3653c = r1
            r4.f3656f = r1
            java.util.concurrent.CountDownLatch r1 = r4.f3655e
            r1.countDown()
            goto L_0x00a9
        L_0x00a8:
            throw r0
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.p070a.p072b.C1254c.run():void");
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (!isDone()) {
            if (timeUnit != TimeUnit.NANOSECONDS) {
                j = TimeUnit.NANOSECONDS.convert(j, timeUnit);
                timeUnit = TimeUnit.NANOSECONDS;
            }
            C60870cx cxVar = this.f3656f;
            if (cxVar != null) {
                long nanoTime = System.nanoTime();
                cxVar.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f3655e.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                C60870cx cxVar2 = this.f3652a;
                if (cxVar2 != null) {
                    cxVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
