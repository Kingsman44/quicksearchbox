package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: io.grpc.cg */
/* compiled from: PG */
public final class C70278cg {

    /* renamed from: a */
    public final List f187351a;

    /* renamed from: b */
    public final C70256c f187352b;

    /* renamed from: c */
    public final Object f187353c;

    public C70278cg(List list, C70256c cVar, Object obj) {
        C58838bb.m90866a(list, "addresses");
        this.f187351a = Collections.unmodifiableList(new ArrayList(list));
        C58838bb.m90866a(cVar, "attributes");
        this.f187352b = cVar;
        this.f187353c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70278cg)) {
            return false;
        }
        C70278cg cgVar = (C70278cg) obj;
        if (!C58832aw.m90831a(this.f187351a, cgVar.f187351a) || !C58832aw.m90831a(this.f187352b, cgVar.f187352b) || !C58832aw.m90831a(this.f187353c, cgVar.f187353c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187351a, this.f187352b, this.f187353c});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("addresses", this.f187351a);
        b.mo56102b("attributes", this.f187352b);
        b.mo56102b("loadBalancingPolicyConfig", this.f187353c);
        return b.toString();
    }
}
