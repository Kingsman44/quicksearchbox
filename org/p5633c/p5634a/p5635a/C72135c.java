package org.p5633c.p5634a.p5635a;

import org.p5633c.p5634a.C72143aa;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72296t;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: org.c.a.a.c */
/* compiled from: PG */
public abstract class C72135c implements C72149ag {
    protected C72135c() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72149ag)) {
            return false;
        }
        C72149ag agVar = (C72149ag) obj;
        return mo63409mr() == agVar.mo63409mr() && C72218h.m106362h(mo63410ms(), agVar.mo63410ms());
    }

    public final int hashCode() {
        return ((int) (mo63409mr() ^ (mo63409mr() >>> 32))) + mo63410ms().hashCode();
    }

    /* renamed from: o */
    public final int compareTo(C72149ag agVar) {
        if (this == agVar) {
            return 0;
        }
        long mr = agVar.mo63409mr();
        long mr2 = mo63409mr();
        if (mr2 == mr) {
            return 0;
        }
        return mr2 < mr ? -1 : 1;
    }

    /* renamed from: p */
    public final C72210d mo63385p() {
        return new C72210d(mo63409mr(), mo63410ms().mo63325C());
    }

    /* renamed from: q */
    public final C72296t mo63386q() {
        return new C72296t(mo63409mr());
    }

    /* renamed from: r */
    public final C72143aa mo63387r() {
        return new C72143aa(mo63409mr(), mo63410ms().mo63325C());
    }

    /* renamed from: s */
    public final boolean mo63388s(long j) {
        return mo63409mr() > j;
    }

    /* renamed from: t */
    public final boolean mo63389t(long j) {
        return mo63409mr() < j;
    }

    public String toString() {
        return C72267x.f192324e.mo63596b(this);
    }
}
