package kotlinx.coroutines.p5573a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.y */
/* compiled from: PG */
public final class C71392y {
    /* renamed from: a */
    public static /* synthetic */ C71389v m104158a(int i, C71387t tVar, int i2) {
        int i3 = 1;
        if (1 == (i2 & 1)) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            tVar = C71387t.SUSPEND;
        }
        C69664n.m101061g(tVar, "onBufferOverflow");
        if (i == -2) {
            if (tVar == C71387t.SUSPEND) {
                i3 = C71388u.f190595a;
            }
            return new C71386s(i3, tVar);
        } else if (i != -1) {
            if (i != 0) {
                if (i == Integer.MAX_VALUE) {
                    return new C71356aj();
                }
                if (i != 1) {
                    i3 = i;
                } else if (tVar == C71387t.DROP_OLDEST) {
                    return new C71355ai();
                }
                return new C71386s(i3, tVar);
            } else if (tVar == C71387t.SUSPEND) {
                return new C71365as();
            } else {
                return new C71386s(1, tVar);
            }
        } else if (tVar == C71387t.SUSPEND) {
            return new C71355ai();
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }
}
