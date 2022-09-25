package org.p5633c.p5634a;

import java.io.Serializable;
import org.p5633c.p5634a.p5635a.C72138f;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: org.c.a.aa */
/* compiled from: PG */
public final class C72143aa extends C72138f implements Cloneable, Serializable, C72147ae, C72149ag {
    private static final long serialVersionUID = 2852608688135209575L;

    public C72143aa() {
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    /* renamed from: d */
    public final void mo63422d(C72288l lVar) {
        C72288l e = C72285i.m106777e(lVar);
        C72288l e2 = C72285i.m106777e(this.f191963b.mo63325C());
        if (e != e2) {
            long k = e2.mo63664k(e, this.f191962a);
            this.f191963b = C72285i.m106775c(this.f191963b.mo63348e(e));
            super.mo63411mt(k);
        }
    }

    /* renamed from: mt */
    public final void mo63411mt(long j) {
        super.mo63411mt(j);
    }

    public final String toString() {
        return C72267x.f192324e.mo63596b(this);
    }

    public C72143aa(long j, C72288l lVar) {
        super(j, C72156ab.m105789X(lVar));
    }
}
