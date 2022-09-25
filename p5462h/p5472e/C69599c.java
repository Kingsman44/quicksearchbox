package p5462h.p5472e;

import java.io.File;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.e.c */
/* compiled from: PG */
public final class C69599c {

    /* renamed from: a */
    public final File f185998a;

    /* renamed from: b */
    public final List f185999b;

    public C69599c(File file, List list) {
        this.f185998a = file;
        this.f185999b = list;
    }

    /* renamed from: a */
    public final int mo61359a() {
        return this.f185999b.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69599c)) {
            return false;
        }
        C69599c cVar = (C69599c) obj;
        return C69664n.m101066l(this.f185998a, cVar.f185998a) && C69664n.m101066l(this.f185999b, cVar.f185999b);
    }

    public final int hashCode() {
        return (this.f185998a.hashCode() * 31) + this.f185999b.hashCode();
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f185998a + ", segments=" + this.f185999b + ')';
    }
}
