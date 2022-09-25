package p5488io.grpc.p5525e;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* renamed from: io.grpc.e.n */
/* compiled from: PG */
public final class C70683n {

    /* renamed from: a */
    public static final Logger f188417a = Logger.getLogger(C70683n.class.getName());

    /* renamed from: b */
    public final String f188418b = "keepalive time nanos";

    /* renamed from: c */
    public final AtomicLong f188419c;

    public C70683n() {
        AtomicLong atomicLong = new AtomicLong();
        this.f188419c = atomicLong;
        atomicLong.set(Long.MAX_VALUE);
    }
}
