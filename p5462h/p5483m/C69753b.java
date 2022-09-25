package p5462h.p5483m;

import p5462h.p5480j.C69695c;

/* renamed from: h.m.b */
/* compiled from: PG */
class C69753b {
    /* renamed from: a */
    public static final boolean m101207a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: b */
    public static final void m101208b(int i) {
        if (!new C69695c(2, 36).mo61416c(i)) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C69695c(2, 36));
        }
    }
}
