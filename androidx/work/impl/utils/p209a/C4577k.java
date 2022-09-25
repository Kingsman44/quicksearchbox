package androidx.work.impl.utils.p209a;

import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.work.impl.utils.a.k */
/* compiled from: PG */
public class C4577k implements C60870cx {

    /* renamed from: a */
    static final boolean f14440a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b */
    static final C4567a f14441b;

    /* renamed from: c */
    public static final Object f14442c = new Object();

    /* renamed from: g */
    private static final Logger f14443g;

    /* renamed from: d */
    public volatile Object f14444d;

    /* renamed from: e */
    volatile C4571e f14445e;

    /* renamed from: f */
    volatile C4576j f14446f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.work.impl.utils.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.work.impl.utils.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.work.impl.utils.a.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            f14440a = r0
            java.lang.Class<androidx.work.impl.utils.a.k> r0 = androidx.work.impl.utils.p209a.C4577k.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f14443g = r1
            androidx.work.impl.utils.a.g r1 = new androidx.work.impl.utils.a.g     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.a.j> r2 = androidx.work.impl.utils.p209a.C4576j.class
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r3, r4)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.a.j> r2 = androidx.work.impl.utils.p209a.C4576j.class
            java.lang.Class<androidx.work.impl.utils.a.j> r4 = androidx.work.impl.utils.p209a.C4576j.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.a.j> r2 = androidx.work.impl.utils.p209a.C4576j.class
            java.lang.String r5 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.a.e> r2 = androidx.work.impl.utils.p209a.C4571e.class
            java.lang.String r6 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.a.i r1 = new androidx.work.impl.utils.a.i
            r1.<init>()
        L_0x0054:
            f14441b = r1
            if (r0 == 0) goto L_0x0061
            java.util.logging.Logger r1 = f14443g
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0061:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f14442c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p209a.C4577k.<clinit>():void");
    }

    protected C4577k() {
    }

    /* renamed from: a */
    static Object m12972a(C60870cx cxVar) {
        if (cxVar instanceof C4577k) {
            Object obj = ((C4577k) cxVar).f14444d;
            if (!(obj instanceof C4568b)) {
                return obj;
            }
            C4568b bVar = (C4568b) obj;
            if (!bVar.f14422c) {
                return obj;
            }
            Throwable th = bVar.f14423d;
            return th != null ? new C4568b(false, th) : C4568b.f14421b;
        }
        boolean isCancelled = cxVar.isCancelled();
        if ((!f14440a) && isCancelled) {
            return C4568b.f14421b;
        }
        try {
            Object e = m12975e(cxVar);
            return e == null ? f14442c : e;
        } catch (ExecutionException e2) {
            return new C4570d(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new C4568b(false, e3);
            }
            new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ").append(cxVar);
            return new C4570d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(cxVar.toString()), e3));
        } catch (Throwable th2) {
            return new C4570d(th2);
        }
    }

    /* renamed from: c */
    static void m12973c(C4577k kVar) {
        C4571e eVar;
        C4571e eVar2;
        C4571e eVar3 = null;
        while (true) {
            C4576j jVar = kVar.f14446f;
            if (f14441b.mo9526e(kVar, jVar, C4576j.f14437a)) {
                while (jVar != null) {
                    Thread thread = jVar.f14438b;
                    if (thread != null) {
                        jVar.f14438b = null;
                        LockSupport.unpark(thread);
                    }
                    jVar = jVar.f14439c;
                }
                do {
                    eVar = kVar.f14445e;
                } while (!f14441b.mo9524c(kVar, eVar, C4571e.f14426a));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f14429d;
                    eVar3.f14429d = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f14429d;
                    Runnable runnable = eVar2.f14427b;
                    if (runnable instanceof C4574h) {
                        C4574h hVar = (C4574h) runnable;
                        kVar = hVar.f14435a;
                        if (kVar.f14444d == hVar) {
                            if (f14441b.mo9525d(kVar, hVar, m12972a(hVar.f14436b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m12978h(runnable, eVar2.f14428c);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    /* renamed from: d */
    static void m12974d(Object obj) {
        obj.getClass();
    }

    /* renamed from: e */
    private static Object m12975e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: f */
    private final String m12976f(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: g */
    private final void m12977g(StringBuilder sb) {
        try {
            Object e = m12975e(this);
            sb.append("SUCCESS, result=[");
            sb.append(m12976f(e));
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: h */
    private static void m12978h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f14443g;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: i */
    private final void m12979i(C4576j jVar) {
        jVar.f14438b = null;
        while (true) {
            C4576j jVar2 = this.f14446f;
            if (jVar2 != C4576j.f14437a) {
                C4576j jVar3 = null;
                while (jVar2 != null) {
                    C4576j jVar4 = jVar2.f14439c;
                    if (jVar2.f14438b != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f14439c = jVar4;
                        if (jVar3.f14438b == null) {
                        }
                    } else if (!f14441b.mo9526e(this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: j */
    private static final Object m12980j(Object obj) {
        if (obj instanceof C4568b) {
            Throwable th = ((C4568b) obj).f14423d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C4570d) {
            throw new ExecutionException(((C4570d) obj).f14425b);
        } else if (obj == f14442c) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.util.concurrent.cx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.work.impl.utils.a.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f14444d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.p209a.C4574h
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f14440a
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.a.b r3 = new androidx.work.impl.utils.a.b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.a.b r3 = androidx.work.impl.utils.p209a.C4568b.f14420a
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.a.b r3 = androidx.work.impl.utils.p209a.C4568b.f14421b
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.a.a r6 = f14441b
            boolean r6 = r6.mo9525d(r4, r0, r3)
            if (r6 == 0) goto L_0x0055
            m12973c(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.p209a.C4574h
            if (r4 == 0) goto L_0x0053
            androidx.work.impl.utils.a.h r0 = (androidx.work.impl.utils.p209a.C4574h) r0
            com.google.common.util.concurrent.cx r0 = r0.f14436b
            boolean r4 = r0 instanceof androidx.work.impl.utils.p209a.C4577k
            if (r4 == 0) goto L_0x0050
            r4 = r0
            androidx.work.impl.utils.a.k r4 = (androidx.work.impl.utils.p209a.C4577k) r4
            java.lang.Object r0 = r4.f14444d
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof androidx.work.impl.utils.p209a.C4574h
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0053
            r5 = 1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
        L_0x0053:
            r1 = 1
            goto L_0x005c
        L_0x0055:
            java.lang.Object r0 = r4.f14444d
            boolean r6 = r0 instanceof androidx.work.impl.utils.p209a.C4574h
            if (r6 != 0) goto L_0x0028
            r1 = r5
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p209a.C4577k.cancel(boolean):boolean");
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14444d;
            if ((obj2 != null) && (!(obj2 instanceof C4574h))) {
                return m12980j(obj2);
            }
            C4576j jVar = this.f14446f;
            if (jVar != C4576j.f14437a) {
                C4576j jVar2 = new C4576j();
                do {
                    C4567a aVar = f14441b;
                    aVar.mo9522a(jVar2, jVar);
                    if (aVar.mo9526e(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14444d;
                            } else {
                                m12979i(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C4574h))));
                        return m12980j(obj);
                    }
                    jVar = this.f14446f;
                } while (jVar != C4576j.f14437a);
            }
            return m12980j(this.f14444d);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f14444d instanceof C4568b;
    }

    public final boolean isDone() {
        Object obj = this.f14444d;
        return (!(obj instanceof C4574h)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f14444d instanceof C4568b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m12977g(sb);
        } else {
            try {
                Object obj = this.f14444d;
                if (obj instanceof C4574h) {
                    str = "setFuture=[" + m12976f(((C4574h) obj).f14436b) + "]";
                } else if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                Class<?> cls = e.getClass();
                sb2.append(cls);
                str = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m12977g(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C4571e eVar = this.f14445e;
        if (eVar != C4571e.f14426a) {
            C4571e eVar2 = new C4571e(runnable, executor);
            do {
                eVar2.f14429d = eVar;
                if (!f14441b.mo9524c(this, eVar, eVar2)) {
                    eVar = this.f14445e;
                } else {
                    return;
                }
            } while (eVar != C4571e.f14426a);
        }
        m12978h(runnable, executor);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f14444d;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C4574h))) {
                return m12980j(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C4576j jVar = this.f14446f;
                if (jVar != C4576j.f14437a) {
                    C4576j jVar2 = new C4576j();
                    do {
                        C4567a aVar = f14441b;
                        aVar.mo9522a(jVar2, jVar);
                        if (aVar.mo9526e(this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14444d;
                                    if ((obj2 != null) && (!(obj2 instanceof C4574h))) {
                                        return m12980j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m12979i(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m12979i(jVar2);
                        } else {
                            jVar = this.f14446f;
                        }
                    } while (jVar != C4576j.f14437a);
                }
                return m12980j(this.f14444d);
            }
            while (nanos > 0) {
                Object obj3 = this.f14444d;
                if ((obj3 != null) && (!(obj3 instanceof C4574h))) {
                    return m12980j(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String kVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + kVar);
        }
        throw new InterruptedException();
    }
}
