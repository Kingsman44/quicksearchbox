package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.grpc.cb */
/* compiled from: PG */
public final class C70273cb {

    /* renamed from: a */
    public final List f187343a;

    /* renamed from: b */
    public final C70256c f187344b;

    /* renamed from: c */
    private final Object[][] f187345c;

    public C70273cb(List list, C70256c cVar, Object[][] objArr) {
        C58838bb.m90866a(list, "addresses are not set");
        this.f187343a = list;
        C58838bb.m90866a(cVar, "attrs");
        this.f187344b = cVar;
        this.f187345c = objArr;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("addrs", this.f187343a);
        b.mo56102b("attrs", this.f187344b);
        b.mo56102b("customOptions", Arrays.deepToString(this.f187345c));
        return b.toString();
    }
}
