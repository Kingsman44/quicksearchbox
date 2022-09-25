package p3186j$.util.concurrent;

import com.google.common.p4535g.C59203do;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: j$.util.concurrent.ThreadLocalRandom */
public class ThreadLocalRandom extends Random {

    /* renamed from: d */
    private static final ThreadLocal f107586d = new ThreadLocal();

    /* renamed from: e */
    private static final AtomicInteger f107587e = new AtomicInteger();

    /* renamed from: f */
    private static final ThreadLocal f107588f = new C41084u();

    /* renamed from: g */
    private static final AtomicLong f107589g = new AtomicLong(m71695e(System.currentTimeMillis()) ^ m71695e(System.nanoTime()));

    /* renamed from: a */
    long f107590a;

    /* renamed from: b */
    int f107591b;

    /* renamed from: c */
    boolean f107592c = true;

    static {
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
        if (((Boolean) AccessController.doPrivileged(new C41085v())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = ((long) seed[0]) & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (((long) seed[i]) & 255);
            }
            f107589g.set(j);
        }
    }

    ThreadLocalRandom() {
    }

    /* renamed from: a */
    static final int m71691a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f107588f.get()).f107591b = i4;
        return i4;
    }

    /* renamed from: b */
    static final int m71692b() {
        return ((ThreadLocalRandom) f107588f.get()).f107591b;
    }

    /* renamed from: c */
    static final void m71693c() {
        int addAndGet = f107587e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long e = m71695e(f107589g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f107588f.get();
        threadLocalRandom.f107590a = e;
        threadLocalRandom.f107591b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f107588f.get();
        if (threadLocalRandom.f107591b == 0) {
            m71693c();
        }
        return threadLocalRandom;
    }

    /* renamed from: d */
    private static int m71694d(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        return (int) (((j2 ^ (j2 >>> 33)) * -4265267296055464877L) >>> 32);
    }

    /* renamed from: e */
    private static long m71695e(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final long mo43534f() {
        long j = this.f107590a - 7046029254386353131L;
        this.f107590a = j;
        return j;
    }

    /* access modifiers changed from: protected */
    public final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    public final boolean nextBoolean() {
        return m71694d(mo43534f()) < 0;
    }

    public final double nextDouble() {
        double e = (double) (m71695e(mo43534f()) >>> 11);
        Double.isNaN(e);
        return e * 1.1102230246251565E-16d;
    }

    public final float nextFloat() {
        return ((float) (m71694d(mo43534f()) >>> 8)) * 5.9604645E-8f;
    }

    public final double nextGaussian() {
        ThreadLocal threadLocal = f107586d;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set((Object) null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d2 < 1.0d && d2 != C59203do.f157270a) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * -2.0d) / d2);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    public final int nextInt() {
        return m71694d(mo43534f());
    }

    public final int nextInt(int i) {
        if (i > 0) {
            int d = m71694d(mo43534f());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return d & i2;
            }
            while (true) {
                int i3 = d >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                d = m71694d(mo43534f());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public long nextLong() {
        return m71695e(mo43534f());
    }

    public final void setSeed(long j) {
        if (this.f107592c) {
            throw new UnsupportedOperationException();
        }
    }
}
