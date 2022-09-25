package androidx.p182p.p185c;

import java.util.Map;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.c.l */
/* compiled from: PG */
public final class C3950l {

    /* renamed from: a */
    public final String f12634a;

    /* renamed from: b */
    public final Map f12635b;

    /* renamed from: c */
    public final Set f12636c;

    /* renamed from: d */
    public final Set f12637d;

    public C3950l(String str, Map map, Set set, Set set2) {
        C69664n.m101061g(map, "columns");
        C69664n.m101061g(set, "foreignKeys");
        this.f12634a = str;
        this.f12635b = map;
        this.f12636c = set;
        this.f12637d = set2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3950l)) {
            return false;
        }
        C3950l lVar = (C3950l) obj;
        if (!C69664n.m101066l(this.f12634a, lVar.f12634a) || !C69664n.m101066l(this.f12635b, lVar.f12635b) || !C69664n.m101066l(this.f12636c, lVar.f12636c)) {
            return false;
        }
        Set set2 = this.f12637d;
        if (set2 == null || (set = lVar.f12637d) == null) {
            return true;
        }
        return C69664n.m101066l(set2, set);
    }

    public final int hashCode() {
        return (((this.f12634a.hashCode() * 31) + this.f12635b.hashCode()) * 31) + this.f12636c.hashCode();
    }

    public final String toString() {
        return "TableInfo{name='" + this.f12634a + "', columns=" + this.f12635b + ", foreignKeys=" + this.f12636c + ", indices=" + this.f12637d + '}';
    }
}
