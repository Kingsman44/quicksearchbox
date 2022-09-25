package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: io.grpc.dn */
/* compiled from: PG */
public final class C70343dn {

    /* renamed from: a */
    public final List f187512a;

    /* renamed from: b */
    public final C70256c f187513b;

    /* renamed from: c */
    public final C70340dk f187514c;

    public C70343dn(List list, C70256c cVar, C70340dk dkVar) {
        this.f187512a = Collections.unmodifiableList(new ArrayList(list));
        C58838bb.m90866a(cVar, "attributes");
        this.f187513b = cVar;
        this.f187514c = dkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70343dn)) {
            return false;
        }
        C70343dn dnVar = (C70343dn) obj;
        if (!C58832aw.m90831a(this.f187512a, dnVar.f187512a) || !C58832aw.m90831a(this.f187513b, dnVar.f187513b) || !C58832aw.m90831a(this.f187514c, dnVar.f187514c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187512a, this.f187513b, this.f187514c});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("addresses", this.f187512a);
        b.mo56102b("attributes", this.f187513b);
        b.mo56102b("serviceConfig", this.f187514c);
        return b.toString();
    }
}
