package com.google.common.util.concurrent;

import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.p4579a.C60792a;
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
import p3186j$.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.d */
/* compiled from: PG */
public abstract class C60873d extends C60792a implements C60870cx {

    /* renamed from: a */
    private static final Logger f164962a;

    /* renamed from: b */
    private static final Object f164963b = new Object();

    /* renamed from: j */
    static final boolean f164964j;

    /* renamed from: k */
    public static final C60874a f164965k;
    public volatile C60878d listeners;
    public volatile Object value;
    public volatile C60886k waiters;

    /* renamed from: com.google.common.util.concurrent.d$a */
    /* compiled from: PG */
    abstract class C60874a {
        /* renamed from: a */
        public abstract C60878d mo57360a(C60873d dVar, C60878d dVar2);

        /* renamed from: b */
        public abstract C60886k mo57361b(C60873d dVar, C60886k kVar);

        /* renamed from: c */
        public abstract void mo57362c(C60886k kVar, C60886k kVar2);

        /* renamed from: d */
        public abstract void mo57363d(C60886k kVar, Thread thread);

        /* renamed from: e */
        public abstract boolean mo57364e(C60873d dVar, C60878d dVar2, C60878d dVar3);

        /* renamed from: f */
        public abstract boolean mo57365f(C60873d dVar, Object obj, Object obj2);

        /* renamed from: g */
        public abstract boolean mo57366g(C60873d dVar, C60886k kVar, C60886k kVar2);
    }

    /* renamed from: com.google.common.util.concurrent.d$b */
    /* compiled from: PG */
    public final class C60875b {

        /* renamed from: a */
        static final C60875b f164966a;

        /* renamed from: b */
        static final C60875b f164967b;

        /* renamed from: c */
        final boolean f164968c;

        /* renamed from: d */
        final Throwable f164969d;

        static {
            if (C60873d.f164964j) {
                f164967b = null;
                f164966a = null;
                return;
            }
            f164967b = new C60875b(false, (Throwable) null);
            f164966a = new C60875b(true, (Throwable) null);
        }

        public C60875b(boolean z, Throwable th) {
            this.f164968c = z;
            this.f164969d = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$c */
    /* compiled from: PG */
    final class C60876c {

        /* renamed from: a */
        static final C60876c f164970a = new C60876c(new Throwable() {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f164971b;

        public C60876c(Throwable th) {
            th.getClass();
            this.f164971b = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$d */
    /* compiled from: PG */
    final class C60878d {

        /* renamed from: a */
        static final C60878d f164972a = new C60878d();

        /* renamed from: b */
        final Runnable f164973b;

        /* renamed from: c */
        final Executor f164974c;
        C60878d next;

        public C60878d() {
            this.f164973b = null;
            this.f164974c = null;
        }

        public C60878d(Runnable runnable, Executor executor) {
            this.f164973b = runnable;
            this.f164974c = executor;
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$e */
    /* compiled from: PG */
    final class C60879e extends C60874a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater f164975a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater f164976b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater f164977c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater f164978d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater f164979e;

        public C60879e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f164975a = atomicReferenceFieldUpdater;
            this.f164976b = atomicReferenceFieldUpdater2;
            this.f164977c = atomicReferenceFieldUpdater3;
            this.f164978d = atomicReferenceFieldUpdater4;
            this.f164979e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public final C60878d mo57360a(C60873d dVar, C60878d dVar2) {
            return (C60878d) this.f164978d.getAndSet(dVar, dVar2);
        }

        /* renamed from: b */
        public final C60886k mo57361b(C60873d dVar, C60886k kVar) {
            return (C60886k) this.f164977c.getAndSet(dVar, kVar);
        }

        /* renamed from: c */
        public final void mo57362c(C60886k kVar, C60886k kVar2) {
            this.f164976b.lazySet(kVar, kVar2);
        }

        /* renamed from: d */
        public final void mo57363d(C60886k kVar, Thread thread) {
            this.f164975a.lazySet(kVar, thread);
        }

        /* renamed from: e */
        public final boolean mo57364e(C60873d dVar, C60878d dVar2, C60878d dVar3) {
            return C60913e.m93025a(this.f164978d, dVar, dVar2, dVar3);
        }

        /* renamed from: f */
        public final boolean mo57365f(C60873d dVar, Object obj, Object obj2) {
            return C60913e.m93025a(this.f164979e, dVar, obj, obj2);
        }

        /* renamed from: g */
        public final boolean mo57366g(C60873d dVar, C60886k kVar, C60886k kVar2) {
            return C60913e.m93025a(this.f164977c, dVar, kVar, kVar2);
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$f */
    /* compiled from: PG */
    final class C60880f implements Runnable {

        /* renamed from: a */
        final C60873d f164980a;

        /* renamed from: b */
        final C60870cx f164981b;

        public C60880f(C60873d dVar, C60870cx cxVar) {
            this.f164980a = dVar;
            this.f164981b = cxVar;
        }

        public final void run() {
            C60873d dVar = this.f164980a;
            C60874a aVar = C60873d.f164965k;
            if (dVar.value == this) {
                if (C60873d.f164965k.mo57365f(this.f164980a, this, C60873d.m92939j(this.f164981b))) {
                    C60873d.m92940l(this.f164980a);
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$g */
    /* compiled from: PG */
    final class C60881g extends C60874a {
        /* renamed from: a */
        public final C60878d mo57360a(C60873d dVar, C60878d dVar2) {
            C60878d dVar3;
            synchronized (dVar) {
                dVar3 = dVar.listeners;
                if (dVar3 != dVar2) {
                    dVar.listeners = dVar2;
                }
            }
            return dVar3;
        }

        /* renamed from: b */
        public final C60886k mo57361b(C60873d dVar, C60886k kVar) {
            C60886k kVar2;
            synchronized (dVar) {
                kVar2 = dVar.waiters;
                if (kVar2 != kVar) {
                    dVar.waiters = kVar;
                }
            }
            return kVar2;
        }

        /* renamed from: c */
        public final void mo57362c(C60886k kVar, C60886k kVar2) {
            kVar.next = kVar2;
        }

        /* renamed from: d */
        public final void mo57363d(C60886k kVar, Thread thread) {
            kVar.thread = thread;
        }

        /* renamed from: e */
        public final boolean mo57364e(C60873d dVar, C60878d dVar2, C60878d dVar3) {
            synchronized (dVar) {
                if (dVar.listeners != dVar2) {
                    return false;
                }
                dVar.listeners = dVar3;
                return true;
            }
        }

        /* renamed from: f */
        public final boolean mo57365f(C60873d dVar, Object obj, Object obj2) {
            synchronized (dVar) {
                if (dVar.value != obj) {
                    return false;
                }
                dVar.value = obj2;
                return true;
            }
        }

        /* renamed from: g */
        public final boolean mo57366g(C60873d dVar, C60886k kVar, C60886k kVar2) {
            synchronized (dVar) {
                if (dVar.waiters != kVar) {
                    return false;
                }
                dVar.waiters = kVar2;
                return true;
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$h */
    /* compiled from: PG */
    interface C60882h extends C60870cx {
    }

    /* renamed from: com.google.common.util.concurrent.d$i */
    /* compiled from: PG */
    abstract class C60883i extends C60873d implements C60882h {
    }

    /* renamed from: com.google.common.util.concurrent.d$j */
    /* compiled from: PG */
    final class C60884j extends C60874a {

        /* renamed from: a */
        static final Unsafe f164982a;

        /* renamed from: b */
        static final long f164983b;

        /* renamed from: c */
        static final long f164984c;

        /* renamed from: d */
        static final long f164985d;

        /* renamed from: e */
        static final long f164986e;

        /* renamed from: f */
        static final long f164987f;

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.C60873d.C60884j.C608851());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.common.util.concurrent.d$j$1 r0 = new com.google.common.util.concurrent.d$j$1     // Catch:{ PrivilegedActionException -> 0x005e }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005e }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005e }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005e }
            L_0x0010:
                java.lang.Class<com.google.common.util.concurrent.d> r1 = com.google.common.util.concurrent.C60873d.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                f164984c = r2     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                f164983b = r2     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                f164985d = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.Class<com.google.common.util.concurrent.d$k> r1 = com.google.common.util.concurrent.C60873d.C60886k.class
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                f164986e = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.Class<com.google.common.util.concurrent.d$k> r1 = com.google.common.util.concurrent.C60873d.C60886k.class
                java.lang.String r2 = "next"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                f164987f = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                f164982a = r0     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                throw r0
            L_0x0057:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005e:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60873d.C60884j.<clinit>():void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: a */
        public final com.google.common.util.concurrent.C60873d.C60878d mo57360a(com.google.common.util.concurrent.C60873d r3, com.google.common.util.concurrent.C60873d.C60878d r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.d$d r0 = r3.listeners
                if (r4 != r0) goto L_0x0005
                return r0
            L_0x0005:
                boolean r1 = r2.mo57364e(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60873d.C60884j.mo57360a(com.google.common.util.concurrent.d, com.google.common.util.concurrent.d$d):com.google.common.util.concurrent.d$d");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: b */
        public final com.google.common.util.concurrent.C60873d.C60886k mo57361b(com.google.common.util.concurrent.C60873d r3, com.google.common.util.concurrent.C60873d.C60886k r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.d$k r0 = r3.waiters
                if (r4 != r0) goto L_0x0005
                return r0
            L_0x0005:
                boolean r1 = r2.mo57366g(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60873d.C60884j.mo57361b(com.google.common.util.concurrent.d, com.google.common.util.concurrent.d$k):com.google.common.util.concurrent.d$k");
        }

        /* renamed from: c */
        public final void mo57362c(C60886k kVar, C60886k kVar2) {
            f164982a.putObject(kVar, f164987f, kVar2);
        }

        /* renamed from: d */
        public final void mo57363d(C60886k kVar, Thread thread) {
            f164982a.putObject(kVar, f164986e, thread);
        }

        /* renamed from: e */
        public final boolean mo57364e(C60873d dVar, C60878d dVar2, C60878d dVar3) {
            return C60918f.m93036a(f164982a, dVar, f164983b, dVar2, dVar3);
        }

        /* renamed from: f */
        public final boolean mo57365f(C60873d dVar, Object obj, Object obj2) {
            return C60918f.m93036a(f164982a, dVar, f164985d, obj, obj2);
        }

        /* renamed from: g */
        public final boolean mo57366g(C60873d dVar, C60886k kVar, C60886k kVar2) {
            return C60918f.m93036a(f164982a, dVar, f164984c, kVar, kVar2);
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$k */
    /* compiled from: PG */
    final class C60886k {

        /* renamed from: a */
        static final C60886k f164988a = new C60886k((byte[]) null);
        volatile C60886k next;
        volatile Thread thread;

        public C60886k() {
            C60873d.f164965k.mo57363d(this, Thread.currentThread());
        }

        public C60886k(byte[] bArr) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        C60874a aVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f164964j = z;
        Class<C60873d> cls = C60873d.class;
        f164962a = Logger.getLogger(cls.getName());
        try {
            aVar = new C60884j();
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                aVar = new C60879e(AtomicReferenceFieldUpdater.newUpdater(C60886k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C60886k.class, C60886k.class, "next"), AtomicReferenceFieldUpdater.newUpdater(cls, C60886k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls, C60878d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "value"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                aVar = new C60881g();
            }
        }
        f164965k = aVar;
        if (th != null) {
            Logger logger = f164962a;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected C60873d() {
    }

    /* renamed from: e */
    private static Object m92934e(Future future) {
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
    private final void m92935f(StringBuilder sb) {
        try {
            Object e = m92934e(this);
            sb.append("SUCCESS, result=[");
            if (e == null) {
                sb.append("null");
            } else if (e == this) {
                sb.append("this future");
            } else {
                sb.append(e.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(e)));
            }
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

    /* renamed from: g */
    private final void m92936g(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof C60880f) {
            sb.append(", setFuture=[");
            m92937h(sb, ((C60880f) obj).f164981b);
            sb.append("]");
        } else {
            try {
                str = C58837ba.m90856e(mo45912hT());
            } catch (RuntimeException | StackOverflowError e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                Class<?> cls = e.getClass();
                sb2.append(cls);
                str = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m92935f(sb);
        }
    }

    /* renamed from: h */
    private final void m92937h(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: i */
    private static void m92938i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f164962a;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: j */
    public static Object m92939j(C60870cx cxVar) {
        Throwable k;
        if (cxVar instanceof C60882h) {
            Object obj = ((C60873d) cxVar).value;
            if (obj instanceof C60875b) {
                C60875b bVar = (C60875b) obj;
                if (bVar.f164968c) {
                    Throwable th = bVar.f164969d;
                    obj = th != null ? new C60875b(false, th) : C60875b.f164967b;
                }
            }
            return Objects.requireNonNull(obj);
        } else if ((cxVar instanceof C60792a) && (k = ((C60792a) cxVar).mo57252k()) != null) {
            return new C60876c(k);
        } else {
            boolean isCancelled = cxVar.isCancelled();
            if ((!f164964j) && isCancelled) {
                return Objects.requireNonNull(C60875b.f164967b);
            }
            try {
                Object e = m92934e(cxVar);
                if (!isCancelled) {
                    return e == null ? f164963b : e;
                }
                return new C60875b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + cxVar));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new C60876c(e2.getCause());
                }
                new StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ").append(cxVar);
                return new C60875b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(cxVar)), e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new C60875b(false, e3);
                }
                new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ").append(cxVar);
                return new C60876c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(cxVar)), e3));
            } catch (Error | RuntimeException e4) {
                return new C60876c(e4);
            }
        }
    }

    /* renamed from: l */
    public static void m92940l(C60873d dVar) {
        C60878d dVar2 = null;
        while (true) {
            for (C60886k b = f164965k.mo57361b(dVar, C60886k.f164988a); b != null; b = b.next) {
                Thread thread = b.thread;
                if (thread != null) {
                    b.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            dVar.mo46268a();
            C60878d dVar3 = dVar2;
            C60878d a = f164965k.mo57360a(dVar, C60878d.f164972a);
            C60878d dVar4 = dVar3;
            while (a != null) {
                C60878d dVar5 = a.next;
                a.next = dVar4;
                dVar4 = a;
                a = dVar5;
            }
            while (true) {
                if (dVar4 != null) {
                    dVar2 = dVar4.next;
                    Runnable runnable = (Runnable) Objects.requireNonNull(dVar4.f164973b);
                    if (runnable instanceof C60880f) {
                        C60880f fVar = (C60880f) runnable;
                        dVar = fVar.f164980a;
                        if (dVar.value == fVar) {
                            if (f164965k.mo57365f(dVar, fVar, m92939j(fVar.f164981b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m92938i(runnable, (Executor) Objects.requireNonNull(dVar4.f164974c));
                    }
                    dVar4 = dVar2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private final void m92941r(C60886k kVar) {
        kVar.thread = null;
        while (true) {
            C60886k kVar2 = this.waiters;
            if (kVar2 != C60886k.f164988a) {
                C60886k kVar3 = null;
                while (kVar2 != null) {
                    C60886k kVar4 = kVar2.next;
                    if (kVar2.thread != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.next = kVar4;
                        if (kVar3.thread == null) {
                        }
                    } else if (!f164965k.mo57366g(this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: s */
    private static final Object m92942s(Object obj) {
        if (obj instanceof C60875b) {
            Throwable th = ((C60875b) obj).f164969d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C60876c) {
            throw new ExecutionException(((C60876c) obj).f164971b);
        } else if (obj == f164963b) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46268a() {
    }

    /* renamed from: b */
    public void mo4106b(Runnable runnable, Executor executor) {
        C60878d dVar;
        C58838bb.m90866a(runnable, "Runnable was null.");
        C58838bb.m90866a(executor, "Executor was null.");
        if (isDone() || (dVar = this.listeners) == C60878d.f164972a) {
            m92938i(runnable, executor);
        }
        C60878d dVar2 = new C60878d(runnable, executor);
        do {
            dVar2.next = dVar;
            if (!f164965k.mo57364e(this, dVar, dVar2)) {
                dVar = this.listeners;
            } else {
                return;
            }
        } while (dVar != C60878d.f164972a);
        m92938i(runnable, executor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.util.concurrent.cx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.common.util.concurrent.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
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
            boolean r4 = r0 instanceof com.google.common.util.concurrent.C60873d.C60880f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0065
            boolean r3 = f164964j
            if (r3 == 0) goto L_0x001f
            com.google.common.util.concurrent.d$b r3 = new com.google.common.util.concurrent.d$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x002a
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.common.util.concurrent.d$b r3 = com.google.common.util.concurrent.C60873d.C60875b.f164966a
            goto L_0x0026
        L_0x0024:
            com.google.common.util.concurrent.d$b r3 = com.google.common.util.concurrent.C60873d.C60875b.f164967b
        L_0x0026:
            java.lang.Object r3 = p3186j$.util.Objects.requireNonNull(r3)
        L_0x002a:
            r5 = 0
            r4 = r7
        L_0x002c:
            com.google.common.util.concurrent.d$a r6 = f164965k
            boolean r6 = r6.mo57365f(r4, r0, r3)
            if (r6 == 0) goto L_0x005e
            if (r8 == 0) goto L_0x0039
            r4.mo57294gL()
        L_0x0039:
            m92940l(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.C60873d.C60880f
            if (r4 == 0) goto L_0x005c
            com.google.common.util.concurrent.d$f r0 = (com.google.common.util.concurrent.C60873d.C60880f) r0
            com.google.common.util.concurrent.cx r0 = r0.f164981b
            boolean r4 = r0 instanceof com.google.common.util.concurrent.C60873d.C60882h
            if (r4 == 0) goto L_0x0059
            r4 = r0
            com.google.common.util.concurrent.d r4 = (com.google.common.util.concurrent.C60873d) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.C60873d.C60880f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005c
            r5 = 1
            goto L_0x002c
        L_0x0059:
            r0.cancel(r8)
        L_0x005c:
            r1 = 1
            goto L_0x0065
        L_0x005e:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.common.util.concurrent.C60873d.C60880f
            if (r6 != 0) goto L_0x002c
            r1 = r5
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60873d.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: gL */
    public void mo57294gL() {
    }

    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof C60880f))) {
                return m92942s(obj2);
            }
            C60886k kVar = this.waiters;
            if (kVar != C60886k.f164988a) {
                C60886k kVar2 = new C60886k();
                do {
                    C60874a aVar = f164965k;
                    aVar.mo57362c(kVar2, kVar);
                    if (aVar.mo57366g(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m92941r(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C60880f))));
                        return m92942s(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != C60886k.f164988a);
            }
            return m92942s(Objects.requireNonNull(this.value));
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public String mo45912hT() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean isCancelled() {
        return this.value instanceof C60875b;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof C60880f)) & (obj != null);
    }

    /* renamed from: k */
    public final Throwable mo57252k() {
        if (!(this instanceof C60882h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof C60876c) {
            return ((C60876c) obj).f164971b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo57355m(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo57359q());
        }
    }

    /* renamed from: n */
    public final boolean mo57356n(Object obj) {
        if (obj == null) {
            obj = f164963b;
        }
        if (!f164965k.mo57365f(this, (Object) null, obj)) {
            return false;
        }
        m92940l(this);
        return true;
    }

    /* renamed from: o */
    public final boolean mo57357o(Throwable th) {
        th.getClass();
        if (!f164965k.mo57365f(this, (Object) null, new C60876c(th))) {
            return false;
        }
        m92940l(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo57359q() {
        Object obj = this.value;
        return (obj instanceof C60875b) && ((C60875b) obj).f164968c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m92935f(sb);
        } else {
            m92936g(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: p */
    public final boolean mo57358p(C60870cx cxVar) {
        C60876c cVar;
        cxVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (cxVar.isDone()) {
                if (!f164965k.mo57365f(this, (Object) null, m92939j(cxVar))) {
                    return false;
                }
                m92940l(this);
                return true;
            }
            C60880f fVar = new C60880f(this, cxVar);
            if (f164965k.mo57365f(this, (Object) null, fVar)) {
                try {
                    cxVar.mo4106b(fVar, C60826bg.f164896a);
                } catch (Error | RuntimeException e) {
                    try {
                        cVar = new C60876c(e);
                    } catch (Error | RuntimeException unused) {
                        cVar = C60876c.f164970a;
                    }
                    f164965k.mo57365f(this, fVar, cVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof C60875b) {
            cxVar.cancel(((C60875b) obj).f164968c);
        }
        return false;
    }

    public Object get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C60880f))) {
                return m92942s(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C60886k kVar = this.waiters;
                if (kVar != C60886k.f164988a) {
                    C60886k kVar2 = new C60886k();
                    do {
                        C60874a aVar = f164965k;
                        aVar.mo57362c(kVar2, kVar);
                        if (aVar.mo57366g(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof C60880f))) {
                                        return m92942s(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m92941r(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m92941r(kVar2);
                        } else {
                            kVar = this.waiters;
                        }
                    } while (kVar != C60886k.f164988a);
                }
                return m92942s(Objects.requireNonNull(this.value));
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) && (!(obj3 instanceof C60880f))) {
                    return m92942s(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String dVar = toString();
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
            throw new TimeoutException(str + " for " + dVar);
        }
        throw new InterruptedException();
    }
}
