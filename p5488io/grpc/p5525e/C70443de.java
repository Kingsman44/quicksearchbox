package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e.de */
/* compiled from: PG */
public final class C70443de {

    /* renamed from: a */
    private final Random f187750a = new Random();

    /* renamed from: b */
    private final long f187751b;

    /* renamed from: c */
    private final long f187752c;

    /* renamed from: d */
    private long f187753d;

    public C70443de() {
        long nanos = TimeUnit.SECONDS.toNanos(1);
        this.f187751b = nanos;
        this.f187752c = TimeUnit.MINUTES.toNanos(2);
        this.f187753d = nanos;
    }

    /* renamed from: a */
    public final long mo62161a() {
        long j = this.f187753d;
        double d = (double) j;
        Double.isNaN(d);
        this.f187753d = Math.min((long) (1.6d * d), this.f187752c);
        Double.isNaN(d);
        double d2 = -0.2d * d;
        Double.isNaN(d);
        double d3 = d * 0.2d;
        C58838bb.m90868c(d3 >= d2);
        return j + ((long) ((this.f187750a.nextDouble() * (d3 - d2)) + d2));
    }
}
