package androidx.p182p.p185c;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.c.i */
/* compiled from: PG */
public final class C3947i {

    /* renamed from: a */
    public final String f12621a;

    /* renamed from: b */
    public final String f12622b;

    /* renamed from: c */
    public final String f12623c;

    /* renamed from: d */
    public final List f12624d;

    /* renamed from: e */
    public final List f12625e;

    public C3947i(String str, String str2, String str3, List list, List list2) {
        C69664n.m101061g(str, "referenceTable");
        C69664n.m101061g(str2, "onDelete");
        C69664n.m101061g(str3, "onUpdate");
        C69664n.m101061g(list, "columnNames");
        C69664n.m101061g(list2, "referenceColumnNames");
        this.f12621a = str;
        this.f12622b = str2;
        this.f12623c = str3;
        this.f12624d = list;
        this.f12625e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3947i)) {
            return false;
        }
        C3947i iVar = (C3947i) obj;
        if (C69664n.m101066l(this.f12621a, iVar.f12621a) && C69664n.m101066l(this.f12622b, iVar.f12622b) && C69664n.m101066l(this.f12623c, iVar.f12623c) && C69664n.m101066l(this.f12624d, iVar.f12624d)) {
            return C69664n.m101066l(this.f12625e, iVar.f12625e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f12621a.hashCode() * 31) + this.f12622b.hashCode()) * 31) + this.f12623c.hashCode()) * 31) + this.f12624d.hashCode()) * 31) + this.f12625e.hashCode();
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f12621a + "', onDelete='" + this.f12622b + " +', onUpdate='" + this.f12623c + "', columnNames=" + this.f12624d + ", referenceColumnNames=" + this.f12625e + '}';
    }
}
