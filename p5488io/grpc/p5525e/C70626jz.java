package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58528ij;
import java.util.Arrays;
import java.util.Set;

/* renamed from: io.grpc.e.jz */
/* compiled from: PG */
final class C70626jz {

    /* renamed from: a */
    final int f188271a;

    /* renamed from: b */
    final long f188272b;

    /* renamed from: c */
    final long f188273c;

    /* renamed from: d */
    final double f188274d;

    /* renamed from: e */
    final Long f188275e;

    /* renamed from: f */
    final Set f188276f;

    public C70626jz(int i, long j, long j2, double d, Long l, Set set) {
        this.f188271a = i;
        this.f188272b = j;
        this.f188273c = j2;
        this.f188274d = d;
        this.f188275e = l;
        this.f188276f = C58528ij.m90006F(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70626jz)) {
            return false;
        }
        C70626jz jzVar = (C70626jz) obj;
        if (this.f188271a == jzVar.f188271a && this.f188272b == jzVar.f188272b && this.f188273c == jzVar.f188273c && Double.compare(this.f188274d, jzVar.f188274d) == 0 && C58832aw.m90831a(this.f188275e, jzVar.f188275e) && C58832aw.m90831a(this.f188276f, jzVar.f188276f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f188271a), Long.valueOf(this.f188272b), Long.valueOf(this.f188273c), Double.valueOf(this.f188274d), this.f188275e, this.f188276f});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("maxAttempts", String.valueOf(this.f188271a));
        b.mo56103c("initialBackoffNanos", String.valueOf(this.f188272b));
        b.mo56103c("maxBackoffNanos", String.valueOf(this.f188273c));
        b.mo56103c("backoffMultiplier", String.valueOf(this.f188274d));
        b.mo56102b("perAttemptRecvTimeoutNanos", this.f188275e);
        b.mo56102b("retryableStatusCodes", this.f188276f);
        return b.toString();
    }
}
