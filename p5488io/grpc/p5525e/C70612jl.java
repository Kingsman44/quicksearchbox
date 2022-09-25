package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: io.grpc.e.jl */
/* compiled from: PG */
final class C70612jl {

    /* renamed from: a */
    final boolean f188204a;

    /* renamed from: b */
    final List f188205b;

    /* renamed from: c */
    final Collection f188206c;

    /* renamed from: d */
    final Collection f188207d;

    /* renamed from: e */
    final int f188208e;

    /* renamed from: f */
    final C70623jw f188209f;

    /* renamed from: g */
    final boolean f188210g;

    /* renamed from: h */
    final boolean f188211h;

    public C70612jl(List list, Collection collection, Collection collection2, C70623jw jwVar, boolean z, boolean z2, boolean z3, int i) {
        this.f188205b = list;
        C58838bb.m90866a(collection, "drainedSubstreams");
        this.f188206c = collection;
        this.f188209f = jwVar;
        this.f188207d = collection2;
        this.f188210g = z;
        this.f188204a = z2;
        this.f188211h = z3;
        this.f188208e = i;
        boolean z4 = false;
        C58838bb.m90884s(!z2 || list == null, "passThrough should imply buffer is null");
        C58838bb.m90884s(!z2 || jwVar != null, "passThrough should imply winningSubstream != null");
        C58838bb.m90884s(!z2 || (collection.size() == 1 && collection.contains(jwVar)) || (collection.size() == 0 && jwVar.f188236b), "passThrough should imply winningSubstream is drained");
        C58838bb.m90884s((!z || jwVar != null) ? true : z4, "cancelled should imply committed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C70612jl mo62351a(C70623jw jwVar) {
        Collection collection;
        C58838bb.m90884s(!this.f188211h, "hedging frozen");
        C58838bb.m90884s(this.f188209f == null, "already committed");
        Collection collection2 = this.f188207d;
        if (collection2 == null) {
            collection = Collections.singleton(jwVar);
        } else {
            ArrayList arrayList = new ArrayList(collection2);
            arrayList.add(jwVar);
            collection = Collections.unmodifiableCollection(arrayList);
        }
        return new C70612jl(this.f188205b, this.f188206c, collection, this.f188209f, this.f188210g, this.f188204a, this.f188211h, this.f188208e + 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C70612jl mo62352b() {
        return this.f188211h ? this : new C70612jl(this.f188205b, this.f188206c, this.f188207d, this.f188209f, this.f188210g, this.f188204a, true, this.f188208e);
    }
}
