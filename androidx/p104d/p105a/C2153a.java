package androidx.p104d.p105a;

import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.d.a.a */
/* compiled from: PG */
public abstract class C2153a implements C60870cx {

    /* renamed from: a */
    static final boolean f6117a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b */
    static final C2154a f6118b;

    /* renamed from: c */
    private static final Logger f6119c;

    /* renamed from: d */
    private static final Object f6120d = new Object();
    volatile C2158d listeners;
    public volatile Object value;
    volatile C2162h waiters;

    /* renamed from: androidx.d.a.a$a */
    /* compiled from: PG */
    abstract class C2154a {
        /* renamed from: a */
        public abstract void mo5429a(C2162h hVar, C2162h hVar2);

        /* renamed from: b */
        public abstract void mo5430b(C2162h hVar, Thread thread);

        /* renamed from: c */
        public abstract boolean mo5431c(C2153a aVar, C2158d dVar, C2158d dVar2);

        /* renamed from: d */
        public abstract boolean mo5432d(C2153a aVar, Object obj, Object obj2);

        /* renamed from: e */
        public abstract boolean mo5433e(C2153a aVar, C2162h hVar, C2162h hVar2);
    }

    /* renamed from: androidx.d.a.a$b */
    /* compiled from: PG */
    public final class C2155b {

        /* renamed from: a */
        static final C2155b f6121a;

        /* renamed from: b */
        static final C2155b f6122b;

        /* renamed from: c */
        final boolean f6123c;

        /* renamed from: d */
        final Throwable f6124d;

        static {
            if (C2153a.f6117a) {
                f6122b = null;
                f6121a = null;
                return;
            }
            f6122b = new C2155b(false, (Throwable) null);
            f6121a = new C2155b(true, (Throwable) null);
        }

        public C2155b(boolean z, Throwable th) {
            this.f6123c = z;
            this.f6124d = th;
        }
    }

    /* renamed from: androidx.d.a.a$c */
    /* compiled from: PG */
    final class C2156c {

        /* renamed from: a */
        static final C2156c f6125a = new C2156c(new Throwable() {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f6126b;

        public C2156c(Throwable th) {
            C2153a.m5993h(th);
            this.f6126b = th;
        }
    }

    /* renamed from: androidx.d.a.a$d */
    /* compiled from: PG */
    final class C2158d {

        /* renamed from: a */
        static final C2158d f6127a = new C2158d((Runnable) null, (Executor) null);

        /* renamed from: b */
        final Runnable f6128b;

        /* renamed from: c */
        final Executor f6129c;
        C2158d next;

        public C2158d(Runnable runnable, Executor executor) {
            this.f6128b = runnable;
            this.f6129c = executor;
        }
    }

    /* renamed from: androidx.d.a.a$e */
    /* compiled from: PG */
    final class C2159e extends C2154a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater f6130a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater f6131b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater f6132c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater f6133d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater f6134e;

        public C2159e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f6130a = atomicReferenceFieldUpdater;
            this.f6131b = atomicReferenceFieldUpdater2;
            this.f6132c = atomicReferenceFieldUpdater3;
            this.f6133d = atomicReferenceFieldUpdater4;
            this.f6134e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public final void mo5429a(C2162h hVar, C2162h hVar2) {
            this.f6131b.lazySet(hVar, hVar2);
        }

        /* renamed from: b */
        public final void mo5430b(C2162h hVar, Thread thread) {
            this.f6130a.lazySet(hVar, thread);
        }

        /* renamed from: c */
        public final boolean mo5431c(C2153a aVar, C2158d dVar, C2158d dVar2) {
            return C2163b.m6018a(this.f6133d, aVar, dVar, dVar2);
        }

        /* renamed from: d */
        public final boolean mo5432d(C2153a aVar, Object obj, Object obj2) {
            return C2163b.m6018a(this.f6134e, aVar, obj, obj2);
        }

        /* renamed from: e */
        public final boolean mo5433e(C2153a aVar, C2162h hVar, C2162h hVar2) {
            return C2163b.m6018a(this.f6132c, aVar, hVar, hVar2);
        }
    }

    /* renamed from: androidx.d.a.a$f */
    /* compiled from: PG */
    final class C2160f implements Runnable {

        /* renamed from: a */
        final C2153a f6135a;

        /* renamed from: b */
        final C60870cx f6136b;

        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.d.a.a$g */
    /* compiled from: PG */
    final class C2161g extends C2154a {
        /* renamed from: a */
        public final void mo5429a(C2162h hVar, C2162h hVar2) {
            hVar.next = hVar2;
        }

        /* renamed from: b */
        public final void mo5430b(C2162h hVar, Thread thread) {
            hVar.thread = thread;
        }

        /* renamed from: c */
        public final boolean mo5431c(C2153a aVar, C2158d dVar, C2158d dVar2) {
            synchronized (aVar) {
                if (aVar.listeners != dVar) {
                    return false;
                }
                aVar.listeners = dVar2;
                return true;
            }
        }

        /* renamed from: d */
        public final boolean mo5432d(C2153a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.value != obj) {
                    return false;
                }
                aVar.value = obj2;
                return true;
            }
        }

        /* renamed from: e */
        public final boolean mo5433e(C2153a aVar, C2162h hVar, C2162h hVar2) {
            synchronized (aVar) {
                if (aVar.waiters != hVar) {
                    return false;
                }
                aVar.waiters = hVar2;
                return true;
            }
        }
    }

    /* renamed from: androidx.d.a.a$h */
    /* compiled from: PG */
    final class C2162h {

        /* renamed from: a */
        static final C2162h f6137a = new C2162h((byte[]) null);
        volatile C2162h next;
        volatile Thread thread;

        public C2162h() {
            C2153a.f6118b.mo5430b(this, Thread.currentThread());
        }

        public C2162h(byte[] bArr) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.d.a.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.d.a.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.d.a.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.d.a.a$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            f6117a = r0
            java.lang.Class<androidx.d.a.a> r0 = androidx.p104d.p105a.C2153a.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f6119c = r1
            androidx.d.a.a$e r1 = new androidx.d.a.a$e     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.d.a.a$h> r2 = androidx.p104d.p105a.C2153a.C2162h.class
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r3, r4)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.d.a.a$h> r2 = androidx.p104d.p105a.C2153a.C2162h.class
            java.lang.Class<androidx.d.a.a$h> r4 = androidx.p104d.p105a.C2153a.C2162h.class
            java.lang.String r5 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.d.a.a$h> r2 = androidx.p104d.p105a.C2153a.C2162h.class
            java.lang.String r5 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.d.a.a$d> r2 = androidx.p104d.p105a.C2153a.C2158d.class
            java.lang.String r6 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.d.a.a$g r1 = new androidx.d.a.a$g
            r1.<init>()
        L_0x0054:
            f6118b = r1
            if (r0 == 0) goto L_0x0061
            java.util.logging.Logger r1 = f6119c
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0061:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f6120d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p104d.p105a.C2153a.<clinit>():void");
    }

    protected C2153a() {
    }

    /* renamed from: a */
    static Object m5990a(C60870cx cxVar) {
        if (cxVar instanceof C2153a) {
            Object obj = ((C2153a) cxVar).value;
            if (!(obj instanceof C2155b)) {
                return obj;
            }
            C2155b bVar = (C2155b) obj;
            if (!bVar.f6123c) {
                return obj;
            }
            Throwable th = bVar.f6124d;
            return th != null ? new C2155b(false, th) : C2155b.f6122b;
        }
        boolean isCancelled = cxVar.isCancelled();
        if ((!f6117a) && isCancelled) {
            return C2155b.f6122b;
        }
        try {
            Object c = m5991c(cxVar);
            return c == null ? f6120d : c;
        } catch (ExecutionException e) {
            return new C2156c(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C2155b(false, e2);
            }
            new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ").append(cxVar);
            return new C2156c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(cxVar)), e2));
        } catch (Throwable th2) {
            return new C2156c(th2);
        }
    }

    /* renamed from: c */
    static Object m5991c(Future future) {
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

    /* renamed from: e */
    static void m5992e(C2153a aVar) {
        C2158d dVar;
        C2158d dVar2;
        C2158d dVar3 = null;
        while (true) {
            C2162h hVar = aVar.waiters;
            if (f6118b.mo5433e(aVar, hVar, C2162h.f6137a)) {
                while (hVar != null) {
                    Thread thread = hVar.thread;
                    if (thread != null) {
                        hVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.next;
                }
                do {
                    dVar = aVar.listeners;
                } while (!f6118b.mo5431c(aVar, dVar, C2158d.f6127a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.next;
                    dVar3.next = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.next;
                    Runnable runnable = dVar2.f6128b;
                    if (runnable instanceof C2160f) {
                        C2160f fVar = (C2160f) runnable;
                        aVar = fVar.f6135a;
                        if (aVar.value == fVar) {
                            if (f6118b.mo5432d(aVar, fVar, m5990a(fVar.f6136b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m5996k(runnable, dVar2.f6129c);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    /* renamed from: h */
    static void m5993h(Object obj) {
        obj.getClass();
    }

    /* renamed from: i */
    private final String m5994i(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: j */
    private final void m5995j(StringBuilder sb) {
        try {
            Object c = m5991c(this);
            sb.append("SUCCESS, result=[");
            sb.append(m5994i(c));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: k */
    private static void m5996k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f6119c;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: l */
    private final void m5997l(C2162h hVar) {
        hVar.thread = null;
        while (true) {
            C2162h hVar2 = this.waiters;
            if (hVar2 != C2162h.f6137a) {
                C2162h hVar3 = null;
                while (hVar2 != null) {
                    C2162h hVar4 = hVar2.next;
                    if (hVar2.thread != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.next = hVar4;
                        if (hVar3.thread == null) {
                        }
                    } else if (!f6118b.mo5433e(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: m */
    private static final Object m5998m(Object obj) {
        if (obj instanceof C2155b) {
            Throwable th = ((C2155b) obj).f6124d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C2156c) {
            throw new ExecutionException(((C2156c) obj).f6126b);
        } else if (obj == f6120d) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.util.concurrent.cx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.d.a.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.p104d.p105a.C2153a.C2160f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f6117a
            if (r3 == 0) goto L_0x001f
            androidx.d.a.a$b r3 = new androidx.d.a.a$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.d.a.a$b r3 = androidx.p104d.p105a.C2153a.C2155b.f6121a
            goto L_0x0026
        L_0x0024:
            androidx.d.a.a$b r3 = androidx.p104d.p105a.C2153a.C2155b.f6122b
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.d.a.a$a r6 = f6118b
            boolean r6 = r6.mo5432d(r4, r0, r3)
            if (r6 == 0) goto L_0x0055
            m5992e(r4)
            boolean r4 = r0 instanceof androidx.p104d.p105a.C2153a.C2160f
            if (r4 == 0) goto L_0x0053
            androidx.d.a.a$f r0 = (androidx.p104d.p105a.C2153a.C2160f) r0
            com.google.common.util.concurrent.cx r0 = r0.f6136b
            boolean r4 = r0 instanceof androidx.p104d.p105a.C2153a
            if (r4 == 0) goto L_0x0050
            r4 = r0
            androidx.d.a.a r4 = (androidx.p104d.p105a.C2153a) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof androidx.p104d.p105a.C2153a.C2160f
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
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof androidx.p104d.p105a.C2153a.C2160f
            if (r6 != 0) goto L_0x0028
            r1 = r5
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p104d.p105a.C2153a.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo5421d() {
        Object obj = this.value;
        if (obj instanceof C2160f) {
            return "setFuture=[" + m5994i(((C2160f) obj).f6136b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo5422f(Object obj) {
        if (obj == null) {
            obj = f6120d;
        }
        if (!f6118b.mo5432d(this, (Object) null, obj)) {
            return false;
        }
        m5992e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo5423g(Throwable th) {
        th.getClass();
        if (!f6118b.mo5432d(this, (Object) null, new C2156c(th))) {
            return false;
        }
        m5992e(this);
        return true;
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof C2160f))) {
                return m5998m(obj2);
            }
            C2162h hVar = this.waiters;
            if (hVar != C2162h.f6137a) {
                C2162h hVar2 = new C2162h();
                do {
                    C2154a aVar = f6118b;
                    aVar.mo5429a(hVar2, hVar);
                    if (aVar.mo5433e(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m5997l(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C2160f))));
                        return m5998m(obj);
                    }
                    hVar = this.waiters;
                } while (hVar != C2162h.f6137a);
            }
            return m5998m(this.value);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.value instanceof C2155b;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof C2160f)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.value instanceof C2155b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5995j(sb);
        } else {
            try {
                str = mo5421d();
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
                m5995j(sb);
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
        C2158d dVar = this.listeners;
        if (dVar != C2158d.f6127a) {
            C2158d dVar2 = new C2158d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (!f6118b.mo5431c(this, dVar, dVar2)) {
                    dVar = this.listeners;
                } else {
                    return;
                }
            } while (dVar != C2158d.f6127a);
        }
        m5996k(runnable, executor);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C2160f))) {
                return m5998m(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C2162h hVar = this.waiters;
                if (hVar != C2162h.f6137a) {
                    C2162h hVar2 = new C2162h();
                    do {
                        C2154a aVar = f6118b;
                        aVar.mo5429a(hVar2, hVar);
                        if (aVar.mo5433e(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof C2160f))) {
                                        return m5998m(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m5997l(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m5997l(hVar2);
                        } else {
                            hVar = this.waiters;
                        }
                    } while (hVar != C2162h.f6137a);
                }
                return m5998m(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) && (!(obj3 instanceof C2160f))) {
                    return m5998m(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar2 = toString();
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
            throw new TimeoutException(str + " for " + aVar2);
        }
        throw new InterruptedException();
    }
}
