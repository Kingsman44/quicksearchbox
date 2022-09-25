package com.youtube.p5283a.p5284a;

import com.google.p370af.C7490c;
import com.google.p370af.C7492e;

/* renamed from: com.youtube.a.a.g */
/* compiled from: PG */
public final class C68085g extends C7492e {
    /* renamed from: k */
    public static int m98389k(C7490c cVar, int[] iArr) {
        int length = iArr.length;
        cVar.mo16907o(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return cVar.mo16896d();
            }
            cVar.mo16900h(iArr[length]);
        }
    }

    /* renamed from: l */
    public static int m98390l(C7490c cVar, int[] iArr) {
        int length = iArr.length;
        cVar.mo16907o(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return cVar.mo16896d();
            }
            cVar.mo16900h(iArr[length]);
        }
    }

    /* renamed from: m */
    public static int m98391m(C7490c cVar, int[] iArr) {
        int length = iArr.length;
        cVar.mo16907o(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return cVar.mo16896d();
            }
            cVar.mo16900h(iArr[length]);
        }
    }

    /* renamed from: n */
    public static int m98392n(C7490c cVar, int[] iArr) {
        int length = iArr.length;
        cVar.mo16907o(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return cVar.mo16896d();
            }
            cVar.mo16900h(iArr[length]);
        }
    }

    /* renamed from: g */
    public final float mo60216g() {
        int a = mo16913a(6);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final int mo60217h() {
        int a = mo16913a(8);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo60218i() {
        int a = mo16913a(20);
        if (a != 0) {
            return mo16915c(a);
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo60219j() {
        int a = mo16913a(12);
        if (a != 0) {
            return mo16915c(a);
        }
        return 0;
    }

    /* renamed from: o */
    public final int mo60220o() {
        int a = mo16913a(26);
        if (a != 0) {
            return mo16915c(a);
        }
        return 0;
    }

    /* renamed from: p */
    public final int mo60221p() {
        int a = mo16913a(10);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }

    /* renamed from: q */
    public final int mo60222q() {
        int a = mo16913a(14);
        if (a != 0) {
            return mo16915c(a);
        }
        return 0;
    }

    /* renamed from: r */
    public final int mo60223r() {
        int a = mo16913a(24);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }

    /* renamed from: s */
    public final C68084f mo60224s(int i) {
        C68084f fVar = new C68084f();
        int a = mo16913a(20);
        if (a == 0) {
            return null;
        }
        int b = mo16914b(a) + (i * 4);
        fVar.mo16917e(b + this.f24704b.getInt(b), this.f24704b);
        return fVar;
    }

    /* renamed from: t */
    public final C68097s mo60225t(int i) {
        C68097s sVar = new C68097s();
        int a = mo16913a(12);
        if (a == 0) {
            return null;
        }
        int b = mo16914b(a) + (i * 4);
        sVar.mo16917e(b + this.f24704b.getInt(b), this.f24704b);
        return sVar;
    }

    /* renamed from: u */
    public final C68100v mo60226u(int i) {
        C68100v vVar = new C68100v();
        int a = mo16913a(26);
        if (a == 0) {
            return null;
        }
        int b = mo16914b(a) + (i * 4);
        vVar.mo16917e(b + this.f24704b.getInt(b), this.f24704b);
        return vVar;
    }

    /* renamed from: v */
    public final C68046ai mo60227v() {
        C68046ai aiVar = new C68046ai();
        int a = mo16913a(28);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        aiVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return aiVar;
    }

    /* renamed from: w */
    public final C68073bi mo60228w(int i) {
        return mo60229x(new C68073bi(), i);
    }

    /* renamed from: x */
    public final C68073bi mo60229x(C68073bi biVar, int i) {
        int a = mo16913a(14);
        if (a == 0) {
            return null;
        }
        int b = mo16914b(a) + (i * 4);
        biVar.mo16917e(b + this.f24704b.getInt(b), this.f24704b);
        return biVar;
    }

    /* renamed from: y */
    public final String mo60230y() {
        int a = mo16913a(4);
        if (a != 0) {
            return mo16916d(a + this.f24703a);
        }
        return null;
    }

    /* renamed from: z */
    public final boolean mo60231z() {
        int a = mo16913a(22);
        return a == 0 || this.f24704b.get(a + this.f24703a) != 0;
    }
}
