package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58528ij;
import java.util.Arrays;
import java.util.Set;

/* renamed from: io.grpc.e.dw */
/* compiled from: PG */
final class C70461dw {

    /* renamed from: a */
    final int f187802a;

    /* renamed from: b */
    final long f187803b;

    /* renamed from: c */
    final Set f187804c;

    public C70461dw(int i, long j, Set set) {
        this.f187802a = i;
        this.f187803b = j;
        this.f187804c = C58528ij.m90006F(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C70461dw dwVar = (C70461dw) obj;
            return this.f187802a == dwVar.f187802a && this.f187803b == dwVar.f187803b && C58832aw.m90831a(this.f187804c, dwVar.f187804c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f187802a), Long.valueOf(this.f187803b), this.f187804c});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("maxAttempts", String.valueOf(this.f187802a));
        b.mo56103c("hedgingDelayNanos", String.valueOf(this.f187803b));
        b.mo56102b("nonFatalStatusCodes", this.f187804c);
        return b.toString();
    }
}
