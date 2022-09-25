package org.p5633c.p5634a.p5635a;

import org.p5633c.p5634a.C72152aj;
import org.p5633c.p5634a.C72293q;
import org.p5633c.p5634a.p5639e.C72244aj;
import org.p5633c.p5634a.p5639e.C72268y;

/* renamed from: org.c.a.a.e */
/* compiled from: PG */
public abstract class C72137e implements C72152aj {
    protected C72137e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72152aj)) {
            return false;
        }
        C72152aj ajVar = (C72152aj) obj;
        if (mo63413e().f191978h.length != ajVar.mo63405i()) {
            return false;
        }
        int length = mo63413e().f191978h.length;
        for (int i = 0; i < length; i++) {
            if (mo63415h(i) != ajVar.mo63415h(i) || mo63413e().f191978h[i] != ajVar.mo63406j(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final int mo63403g(C72293q qVar) {
        int b = mo63413e().mo63430b(qVar);
        if (b == -1) {
            return 0;
        }
        return mo63415h(b);
    }

    public final int hashCode() {
        int length = mo63413e().f191978h.length;
        int i = 17;
        for (int i2 = 0; i2 < length; i2++) {
            i = (((i * 27) + mo63415h(i2)) * 27) + mo63413e().f191978h[i2].hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final int mo63405i() {
        return mo63413e().f191978h.length;
    }

    /* renamed from: j */
    public final C72293q mo63406j(int i) {
        return mo63413e().f191978h[i];
    }

    public final String toString() {
        C72244aj ajVar = C72268y.m106711a().f192347a;
        if (ajVar != null) {
            StringBuffer stringBuffer = new StringBuffer(ajVar.mo63582a(this));
            ajVar.mo63585d(stringBuffer, this);
            return stringBuffer.toString();
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
}
