package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ati */
/* compiled from: PG */
public class ati extends atx implements atr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final boolean f21535a;

    /* renamed from: b */
    private static final Logger f21536b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final asv f21537c;

    /* renamed from: d */
    private static final Object f21538d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile Object f21539e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile asz f21540f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile ath f21541g;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        asv asv;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f21535a = z;
        Class<ati> cls = ati.class;
        f21536b = Logger.getLogger(cls.getName());
        try {
            asv = new atg((byte[]) null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            asv = new atc((byte[]) null);
        }
        f21537c = asv;
        if (th != null) {
            Logger logger = f21536b;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected ati() {
    }

    public ati(byte[] bArr) {
        this();
    }

    /* renamed from: p */
    private final void m19578p(ath ath) {
        ath.f21533b = null;
        while (true) {
            ath ath2 = this.f21541g;
            if (ath2 != ath.f21532a) {
                ath ath3 = null;
                while (ath2 != null) {
                    ath ath4 = ath2.f21534c;
                    if (ath2.f21533b != null) {
                        ath3 = ath2;
                    } else if (ath3 != null) {
                        ath3.f21534c = ath4;
                        if (ath3.f21533b == null) {
                        }
                    } else if (!f21537c.mo15381c(this, ath2, ath4)) {
                    }
                    ath2 = ath4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: q */
    private static void m19579q(ati ati) {
        ath ath;
        asz asz;
        asz asz2;
        asz asz3;
        do {
            ath = ati.f21541g;
        } while (!f21537c.mo15381c(ati, ath, ath.f21532a));
        while (true) {
            asz = null;
            if (ath == null) {
                break;
            }
            Thread thread = ath.f21533b;
            if (thread != null) {
                ath.f21533b = null;
                LockSupport.unpark(thread);
            }
            ath = ath.f21534c;
        }
        ati.mo15392c();
        do {
            asz2 = ati.f21540f;
        } while (!f21537c.mo15382d(ati, asz2, asz.f21512a));
        while (true) {
            asz3 = asz;
            asz = asz2;
            if (asz == null) {
                break;
            }
            asz2 = asz.f21515d;
            asz.f21515d = asz3;
        }
        while (asz3 != null) {
            asz asz4 = asz3.f21515d;
            m19582t(asz3.f21513b, asz3.f21514c);
            asz3 = asz4;
        }
    }

    /* renamed from: r */
    private final void m19580r(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f21539e;
        if (obj instanceof atb) {
            sb.append(", setFuture=[");
            atr atr = ((atb) obj).f21525a;
            m19583u(sb);
            sb.append("]");
        } else {
            try {
                str = aqd.m19273a(mo15395e());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                String.valueOf(valueOf).length();
                str = "Exception thrown from implementation: ".concat(String.valueOf(valueOf));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m19581s(sb);
        }
    }

    /* renamed from: s */
    private final void m19581s(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
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
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    /* renamed from: t */
    private static void m19582t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f21536b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    /* renamed from: u */
    private static final void m19583u(StringBuilder sb) {
        try {
            sb.append((Object) null);
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* renamed from: v */
    private static final Object m19584v(Object obj) {
        if (obj instanceof asw) {
            Throwable th = ((asw) obj).f21510d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof asy) {
            throw new ExecutionException(((asy) obj).f21511a);
        } else if (obj == f21538d) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo15390a() {
        Object obj = this.f21539e;
        return (obj instanceof asw) && ((asw) obj).f21509c;
    }

    /* renamed from: b */
    public void mo15391b(Runnable runnable, Executor executor) {
        asz asz;
        aqd.m19283k(executor, "Executor was null.");
        if (isDone() || (asz = this.f21540f) == asz.f21512a) {
            m19582t(runnable, executor);
        }
        asz asz2 = new asz(runnable, executor);
        do {
            asz2.f21515d = asz;
            if (!f21537c.mo15382d(this, asz, asz2)) {
                asz = this.f21540f;
            } else {
                return;
            }
        } while (asz != asz.f21512a);
        m19582t(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15392c() {
    }

    public boolean cancel(boolean z) {
        asw asw;
        Object obj = this.f21539e;
        if (!(obj == null) && !(obj instanceof atb)) {
            return false;
        }
        if (f21535a) {
            asw = new asw(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            asw = asw.f21507a;
        } else {
            asw = asw.f21508b;
        }
        while (!f21537c.mo15383e(this, obj, asw)) {
            obj = this.f21539e;
            if (!(obj instanceof atb)) {
            }
        }
        m19579q(this);
        if (!(obj instanceof atb)) {
            return true;
        }
        atr atr = ((atb) obj).f21525a;
        throw null;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Throwable mo15394d() {
        if (!(this instanceof atd)) {
            return null;
        }
        Object obj = this.f21539e;
        if (obj instanceof asy) {
            return ((asy) obj).f21511a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo15395e() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f21539e;
            if ((obj2 != null) && (!(obj2 instanceof atb))) {
                return m19584v(obj2);
            }
            ath ath = this.f21541g;
            if (ath != ath.f21532a) {
                ath ath2 = new ath();
                do {
                    ath2.mo15389a(ath);
                    if (f21537c.mo15381c(this, ath, ath2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f21539e;
                            } else {
                                m19578p(ath2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof atb))));
                        return m19584v(obj);
                    }
                    ath = this.f21541g;
                } while (ath != ath.f21532a);
            }
            return m19584v(this.f21539e);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f21539e instanceof asw;
    }

    public boolean isDone() {
        Object obj = this.f21539e;
        return (!(obj instanceof atb)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo15400n(Object obj) {
        if (obj == null) {
            obj = f21538d;
        }
        if (f21537c.mo15383e(this, (Object) null, obj)) {
            m19579q(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo15401o(Throwable th) {
        if (f21537c.mo15383e(this, (Object) null, new asy(th))) {
            m19579q(this);
        }
    }

    public final String toString() {
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
            m19581s(sb);
        } else {
            m19580r(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public Object get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f21539e;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof atb))) {
                return m19584v(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                ath ath = this.f21541g;
                if (ath != ath.f21532a) {
                    ath ath2 = new ath();
                    do {
                        ath2.mo15389a(ath);
                        if (f21537c.mo15381c(this, ath, ath2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f21539e;
                                    if ((obj2 != null) && (!(obj2 instanceof atb))) {
                                        return m19584v(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m19578p(ath2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m19578p(ath2);
                        } else {
                            ath = this.f21541g;
                        }
                    } while (ath != ath.f21532a);
                }
                return m19584v(this.f21539e);
            }
            while (nanos > 0) {
                Object obj3 = this.f21539e;
                if ((obj3 != null) && (!(obj3 instanceof atb))) {
                    return m19584v(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String ati = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = sb2.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = sb4.concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + ati.length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(ati);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
