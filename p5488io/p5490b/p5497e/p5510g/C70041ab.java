package p5488io.p5490b.p5497e.p5510g;

import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.b.e.g.ab */
/* compiled from: PG */
public final class C70041ab {

    /* renamed from: a */
    public static final boolean f186702a;

    /* renamed from: b */
    public static final int f186703b;

    /* renamed from: c */
    static final AtomicReference f186704c = new AtomicReference();

    /* renamed from: d */
    static final Map f186705d = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r1 != false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042 A[LOOP:0: B:13:0x0042->B:22:0x0074, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            f186704c = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            f186705d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L_0x0028
            java.lang.String r1 = r0.getProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 == 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0 = 1
            goto L_0x003c
        L_0x0028:
            r1 = 1
        L_0x0029:
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L_0x0026
            java.lang.String r0 = r0.getProperty(r2)     // Catch:{ NumberFormatException -> 0x003a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x003a }
            goto L_0x003c
        L_0x003a:
            goto L_0x0026
        L_0x003c:
            f186702a = r1
            f186703b = r0
            if (r1 == 0) goto L_0x0078
        L_0x0042:
            java.util.concurrent.atomic.AtomicReference r0 = f186704c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L_0x004d
            goto L_0x0078
        L_0x004d:
            io.b.e.g.v r1 = new io.b.e.g.v
            java.lang.String r2 = "RxSchedulerPurge"
            r1.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r4 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r1)
        L_0x0058:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r4)
            if (r1 == 0) goto L_0x006e
            io.b.e.g.aa r5 = new io.b.e.g.aa
            r5.<init>()
            int r0 = f186703b
            long r8 = (long) r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r6 = r8
            r4.scheduleAtFixedRate(r5, r6, r8, r10)
            return
        L_0x006e:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0058
            r4.shutdownNow()
            goto L_0x0042
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5510g.C70041ab.<clinit>():void");
    }

    /* renamed from: a */
    public static ScheduledExecutorService m101891a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f186702a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f186705d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
