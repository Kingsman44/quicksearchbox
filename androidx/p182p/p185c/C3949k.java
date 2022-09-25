package androidx.p182p.p185c;

import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.p.c.k */
/* compiled from: PG */
public final class C3949k {

    /* renamed from: a */
    public final String f12630a;

    /* renamed from: b */
    public final boolean f12631b;

    /* renamed from: c */
    public final List f12632c;

    /* renamed from: d */
    public List f12633d;

    public C3949k(String str, boolean z, List list, List list2) {
        C69664n.m101061g(str, "name");
        C69664n.m101061g(list, "columns");
        C69664n.m101061g(list2, "orders");
        this.f12630a = str;
        this.f12631b = z;
        this.f12632c = list;
        this.f12633d = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add("ASC");
            }
            arrayList = arrayList2;
        }
        this.f12633d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3949k)) {
            return false;
        }
        C3949k kVar = (C3949k) obj;
        if (this.f12631b != kVar.f12631b || !C69664n.m101066l(this.f12632c, kVar.f12632c) || !C69664n.m101066l(this.f12633d, kVar.f12633d)) {
            return false;
        }
        if (C69764m.m101234m(this.f12630a, "index_")) {
            return C69764m.m101234m(kVar.f12630a, "index_");
        }
        return C69664n.m101066l(this.f12630a, kVar.f12630a);
    }

    public final int hashCode() {
        int i;
        if (C69764m.m101234m(this.f12630a, "index_")) {
            i = -1184239155;
        } else {
            i = this.f12630a.hashCode();
        }
        return (((((i * 31) + (this.f12631b ? 1 : 0)) * 31) + this.f12632c.hashCode()) * 31) + this.f12633d.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.f12630a + "', unique=" + this.f12631b + ", columns=" + this.f12632c + ", orders=" + this.f12633d + "'}";
    }
}
