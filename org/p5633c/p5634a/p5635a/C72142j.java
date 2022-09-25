package org.p5633c.p5634a.p5635a;

import java.io.Serializable;
import org.p5633c.p5634a.C72146ad;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72152aj;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72293q;

/* renamed from: org.c.a.a.j */
/* compiled from: PG */
public abstract class C72142j implements Comparable, Serializable, C72152aj {
    private static final long serialVersionUID = 9386874258972L;

    /* renamed from: k */
    public volatile int f191967k;

    protected C72142j(int i) {
        this.f191967k = i;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C72142j jVar = (C72142j) obj;
        if (jVar.getClass() == getClass()) {
            int i = jVar.f191967k;
            int i2 = this.f191967k;
            if (i2 > i) {
                return 1;
            }
            return i2 < i ? -1 : 0;
        }
        String valueOf = String.valueOf(getClass());
        String valueOf2 = String.valueOf(jVar.getClass());
        throw new ClassCastException(valueOf + " cannot be compared to " + valueOf2);
    }

    /* renamed from: d */
    public abstract C72293q mo63418d();

    /* renamed from: e */
    public abstract C72146ad mo63413e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72152aj)) {
            return false;
        }
        C72152aj ajVar = (C72152aj) obj;
        return ajVar.mo63413e() == mo63413e() && ajVar.mo63415h(0) == this.f191967k;
    }

    /* renamed from: g */
    public final int mo63403g(C72293q qVar) {
        throw null;
    }

    /* renamed from: h */
    public final int mo63415h(int i) {
        if (i == 0) {
            return this.f191967k;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public final int hashCode() {
        return ((this.f191967k + 459) * 27) + mo63418d().hashCode();
    }

    /* renamed from: i */
    public final int mo63405i() {
        return 1;
    }

    /* renamed from: j */
    public final C72293q mo63406j(int i) {
        if (i == 0) {
            return mo63418d();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    /* renamed from: k */
    protected static int m105746k(C72149ag agVar, C72149ag agVar2, C72293q qVar) {
        if (agVar != null && agVar2 != null) {
            return qVar.mo63674a(C72285i.m106776d(agVar)).mo63473a(agVar2.mo63409mr(), agVar.mo63409mr());
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }
}
