package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: io.grpc.eu */
/* compiled from: PG */
public final class C70716eu {

    /* renamed from: a */
    public final String f188456a;

    /* renamed from: b */
    public final Collection f188457b;

    public C70716eu(C70715et etVar) {
        String str = etVar.f188454a;
        this.f188456a = str;
        List<C70338di> list = etVar.f188455b;
        HashSet hashSet = new HashSet(list.size());
        for (C70338di diVar : list) {
            C58838bb.m90866a(diVar, "method");
            String str2 = diVar.f187498c;
            C58838bb.m90879n(str.equals(str2), "service names %s != %s", str2, str);
            C58838bb.m90873h(hashSet.add(diVar.f187497b), "duplicate name %s", diVar.f187497b);
        }
        this.f188457b = Collections.unmodifiableList(new ArrayList(etVar.f188455b));
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("name", this.f188456a);
        b.mo56102b("schemaDescriptor", (Object) null);
        b.mo56102b("methods", this.f188457b);
        b.f156627a = true;
        return b.toString();
    }
}
