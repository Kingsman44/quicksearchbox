package p5488io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.aq */
/* compiled from: PG */
public final class C70153aq implements Comparable {

    /* renamed from: a */
    public static final C70151ao f186997a = new C70151ao();

    /* renamed from: d */
    private static final long f186998d;

    /* renamed from: e */
    private static final long f186999e;

    /* renamed from: f */
    private static final long f187000f = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: b */
    public final C70152ap f187001b;

    /* renamed from: c */
    public final long f187002c;

    /* renamed from: g */
    private volatile boolean f187003g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        f186998d = nanos;
        f186999e = -nanos;
    }

    private C70153aq(C70152ap apVar, long j, long j2) {
        this.f187001b = apVar;
        long min = Math.min(f186998d, Math.max(f186999e, j2));
        this.f187002c = j + min;
        this.f187003g = min <= 0;
    }

    /* renamed from: c */
    public static C70153aq m102154c(long j, TimeUnit timeUnit, C70152ap apVar) {
        m102155f(timeUnit, "units");
        return new C70153aq(apVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    /* renamed from: f */
    public static void m102155f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    /* renamed from: a */
    public final int compareTo(C70153aq aqVar) {
        mo61722d(aqVar);
        long j = this.f187002c - aqVar.f187002c;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    /* renamed from: b */
    public final long mo61720b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.f187003g && this.f187002c - nanoTime <= 0) {
            this.f187003g = true;
        }
        return timeUnit.convert(this.f187002c - nanoTime, TimeUnit.NANOSECONDS);
    }

    /* renamed from: d */
    public final void mo61722d(C70153aq aqVar) {
        if (this.f187001b != aqVar.f187001b) {
            throw new AssertionError("Tickers (" + this.f187001b + " and " + aqVar.f187001b + ") don't match. Custom Ticker should only be used in tests!");
        }
    }

    /* renamed from: e */
    public final boolean mo61723e() {
        if (!this.f187003g) {
            if (this.f187002c - System.nanoTime() > 0) {
                return false;
            }
            this.f187003g = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C70153aq)) {
            return false;
        }
        C70153aq aqVar = (C70153aq) obj;
        return this.f187001b == aqVar.f187001b && this.f187002c == aqVar.f187002c;
    }

    public final int hashCode() {
        return Arrays.asList(new Object[]{this.f187001b, Long.valueOf(this.f187002c)}).hashCode();
    }

    public final String toString() {
        long b = mo61720b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b);
        long j = f187000f;
        long j2 = abs / j;
        long abs2 = Math.abs(b) % j;
        StringBuilder sb = new StringBuilder();
        if (b < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        }
        sb.append("s from now");
        if (this.f187001b != f186997a) {
            sb.append(" (ticker=" + this.f187001b + ")");
        }
        return sb.toString();
    }
}
