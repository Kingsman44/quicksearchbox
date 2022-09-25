package p5488io.grpc.p5525e;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;
import p5488io.grpc.C70277cf;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;

/* renamed from: io.grpc.e.ic */
/* compiled from: PG */
public final class C70576ic extends C70277cf {

    /* renamed from: a */
    public final C70851i f188147a;

    /* renamed from: b */
    public final C70334de f188148b;

    /* renamed from: c */
    public final C70338di f188149c;

    public C70576ic(C70338di diVar, C70334de deVar, C70851i iVar) {
        C58838bb.m90866a(diVar, "method");
        this.f188149c = diVar;
        C58838bb.m90866a(deVar, "headers");
        this.f188148b = deVar;
        C58838bb.m90866a(iVar, "callOptions");
        this.f188147a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C70576ic icVar = (C70576ic) obj;
            return C58832aw.m90831a(this.f188147a, icVar.f188147a) && C58832aw.m90831a(this.f188148b, icVar.f188148b) && C58832aw.m90831a(this.f188149c, icVar.f188149c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f188147a, this.f188148b, this.f188149c});
    }

    public final String toString() {
        return "[method=" + this.f188149c + " headers=" + this.f188148b + " callOptions=" + this.f188147a + "]";
    }
}
