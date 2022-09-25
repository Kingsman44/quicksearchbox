package androidx.p182p.p185c;

import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.c.d */
/* compiled from: PG */
public final class C3942d {

    /* renamed from: a */
    public static final String[] f12610a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* renamed from: b */
    public final String f12611b;

    /* renamed from: c */
    public final Set f12612c;

    /* renamed from: d */
    public final Set f12613d;

    public C3942d(String str, Set set, Set set2) {
        C69664n.m101061g(set, "columns");
        C69664n.m101061g(set2, "options");
        this.f12611b = str;
        this.f12612c = set;
        this.f12613d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3942d)) {
            return false;
        }
        C3942d dVar = (C3942d) obj;
        if (C69664n.m101066l(this.f12611b, dVar.f12611b) && C69664n.m101066l(this.f12612c, dVar.f12612c)) {
            return C69664n.m101066l(this.f12613d, dVar.f12613d);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f12611b.hashCode() * 31) + this.f12612c.hashCode()) * 31) + this.f12613d.hashCode();
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.f12611b + "', columns=" + this.f12612c + ", options=" + this.f12613d + "'}";
    }
}
