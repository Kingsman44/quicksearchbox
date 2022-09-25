package androidx.work.impl.p207b;

import androidx.work.C4394ar;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.b.ac */
/* compiled from: PG */
public final class C4468ac {

    /* renamed from: a */
    public final String f14207a;

    /* renamed from: b */
    public final C4394ar f14208b;

    public C4468ac(String str, C4394ar arVar) {
        C69664n.m101061g(str, "id");
        C69664n.m101061g(arVar, "state");
        this.f14207a = str;
        this.f14208b = arVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4468ac)) {
            return false;
        }
        C4468ac acVar = (C4468ac) obj;
        return C69664n.m101066l(this.f14207a, acVar.f14207a) && this.f14208b == acVar.f14208b;
    }

    public final int hashCode() {
        return (this.f14207a.hashCode() * 31) + this.f14208b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.f14207a + ", state=" + this.f14208b + ')';
    }
}
