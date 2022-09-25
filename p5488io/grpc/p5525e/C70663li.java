package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;
import p5488io.grpc.C70283cl;

/* renamed from: io.grpc.e.li */
/* compiled from: PG */
public final class C70663li {

    /* renamed from: a */
    final C70283cl f188387a;

    /* renamed from: b */
    final Object f188388b;

    public C70663li(C70283cl clVar, Object obj) {
        this.f188387a = clVar;
        this.f188388b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C70663li liVar = (C70663li) obj;
            return C58832aw.m90831a(this.f188387a, liVar.f188387a) && C58832aw.m90831a(this.f188388b, liVar.f188388b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f188387a, this.f188388b});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("provider", this.f188387a);
        b.mo56102b("config", this.f188388b);
        return b.toString();
    }
}
