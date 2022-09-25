package p5488io.grpc.p5525e;

import com.google.common.base.C58832aw;
import java.util.Arrays;
import p5488io.grpc.C70239bj;
import p5488io.grpc.C70256c;

/* renamed from: io.grpc.e.as */
/* compiled from: PG */
public final class C70376as {

    /* renamed from: a */
    public String f187579a = "unknown-authority";

    /* renamed from: b */
    public C70256c f187580b = C70256c.f187254a;

    /* renamed from: c */
    public String f187581c;

    /* renamed from: d */
    public C70239bj f187582d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70376as)) {
            return false;
        }
        C70376as asVar = (C70376as) obj;
        if (!this.f187579a.equals(asVar.f187579a) || !this.f187580b.equals(asVar.f187580b) || !C58832aw.m90831a(this.f187581c, asVar.f187581c) || !C58832aw.m90831a(this.f187582d, asVar.f187582d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187579a, this.f187580b, this.f187581c, this.f187582d});
    }
}
