package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;
import org.p5633c.p5634a.p5638d.C72217g;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5638d.C72221k;
import org.p5633c.p5634a.p5638d.C72222l;
import org.p5633c.p5634a.p5638d.C72223m;
import org.p5633c.p5634a.p5638d.C72225o;
import org.p5633c.p5634a.p5638d.C72226p;
import org.p5633c.p5634a.p5638d.C72232v;

/* renamed from: org.c.a.b.f */
/* compiled from: PG */
abstract class C72170f extends C72166b {

    /* renamed from: E */
    public static final C72291o f192081E;

    /* renamed from: F */
    public static final C72291o f192082F;

    /* renamed from: H */
    private static final C72291o f192083H;

    /* renamed from: I */
    private static final C72291o f192084I;

    /* renamed from: J */
    private static final C72291o f192085J;

    /* renamed from: K */
    private static final C72291o f192086K;

    /* renamed from: L */
    private static final C72291o f192087L = new C72225o(C72293q.f192441f, 604800000);

    /* renamed from: M */
    private static final C72233e f192088M;

    /* renamed from: N */
    private static final C72233e f192089N;

    /* renamed from: O */
    private static final C72233e f192090O;

    /* renamed from: P */
    private static final C72233e f192091P;

    /* renamed from: Q */
    private static final C72233e f192092Q;

    /* renamed from: R */
    private static final C72233e f192093R;

    /* renamed from: S */
    private static final C72233e f192094S;

    /* renamed from: T */
    private static final C72233e f192095T;

    /* renamed from: U */
    private static final C72233e f192096U;

    /* renamed from: V */
    private static final C72233e f192097V;

    /* renamed from: W */
    private static final C72233e f192098W = new C72168d();
    private static final long serialVersionUID = 8283225332206808863L;

    /* renamed from: G */
    public final int f192099G;

    /* renamed from: X */
    private final transient C72169e[] f192100X = new C72169e[1024];

    static {
        C72291o oVar = C72221k.f192190a;
        f192083H = oVar;
        C72225o oVar2 = new C72225o(C72293q.f192446k, 1000);
        f192084I = oVar2;
        C72225o oVar3 = new C72225o(C72293q.f192445j, 60000);
        f192085J = oVar3;
        C72225o oVar4 = new C72225o(C72293q.f192444i, 3600000);
        f192086K = oVar4;
        C72225o oVar5 = new C72225o(C72293q.f192443h, 43200000);
        f192081E = oVar5;
        C72225o oVar6 = new C72225o(C72293q.f192442g, 86400000);
        f192082F = oVar6;
        f192088M = new C72223m(C72283g.f192409y, oVar, oVar2);
        f192089N = new C72223m(C72283g.f192408x, oVar, oVar6);
        f192090O = new C72223m(C72283g.f192407w, oVar2, oVar3);
        f192091P = new C72223m(C72283g.f192406v, oVar2, oVar6);
        f192092Q = new C72223m(C72283g.f192405u, oVar3, oVar4);
        f192093R = new C72223m(C72283g.f192404t, oVar3, oVar6);
        C72223m mVar = new C72223m(C72283g.f192403s, oVar4, oVar6);
        f192094S = mVar;
        C72223m mVar2 = new C72223m(C72283g.f192400p, oVar4, oVar5);
        f192095T = mVar2;
        f192096U = new C72232v(mVar, C72283g.f192402r);
        f192097V = new C72232v(mVar2, C72283g.f192401q);
    }

    public C72170f(C72132a aVar, int i) {
        super(aVar, (Object) null);
        if (i > 0) {
            this.f192099G = i;
            return;
        }
        throw new IllegalArgumentException("Invalid min days in first week: 0");
    }

    /* renamed from: C */
    public final C72288l mo63325C() {
        C72132a aVar = this.f192053a;
        if (aVar != null) {
            return aVar.mo63325C();
        }
        return C72288l.f192416b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo63441V(C72154a aVar) {
        aVar.f191990a = f192083H;
        aVar.f191991b = f192084I;
        aVar.f191992c = f192085J;
        aVar.f191993d = f192086K;
        aVar.f191994e = f192081E;
        aVar.f191995f = f192082F;
        aVar.f191996g = f192087L;
        aVar.f192002m = f192088M;
        aVar.f192003n = f192089N;
        aVar.f192004o = f192090O;
        aVar.f192005p = f192091P;
        aVar.f192006q = f192092Q;
        aVar.f192007r = f192093R;
        aVar.f192008s = f192094S;
        aVar.f192010u = f192095T;
        aVar.f192009t = f192096U;
        aVar.f192011v = f192097V;
        aVar.f192012w = f192098W;
        aVar.f191985E = new C72178n(this);
        aVar.f191986F = new C72189y(aVar.f191985E, this);
        aVar.f191988H = new C72217g(new C72222l(aVar.f191986F, 99), C72283g.f192389e);
        C72217g gVar = (C72217g) aVar.f191988H;
        aVar.f191987G = new C72222l(new C72226p(gVar, gVar.f192177i), C72283g.f192390f, 1);
        aVar.f191989I = new C72186v(this);
        aVar.f192013x = new C72185u(this, aVar.f191995f);
        aVar.f192014y = new C72171g(this, aVar.f191995f);
        aVar.f192015z = new C72172h(this, aVar.f191995f);
        aVar.f191984D = new C72188x(this);
        aVar.f191982B = new C72177m(this);
        aVar.f191981A = new C72176l(this, aVar.f191996g);
        aVar.f191983C = new C72222l(new C72226p(aVar.f191982B, C72283g.f192395k), C72283g.f192395k, 1);
        aVar.f191999j = aVar.f191985E.mo63464A();
        aVar.f192000k = aVar.f191988H.mo63464A();
        aVar.f191998i = aVar.f191984D.mo63464A();
        aVar.f191997h = aVar.f191982B.mo63464A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final int mo63492W(long j, int i, int i2) {
        return ((int) ((j - (mo63511ax(i).f192080b + mo63507at(i, i2))) / 86400000)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final int mo63493X(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final int mo63494Y(long j, int i) {
        return ((int) ((j - mo63511ax(i).f192080b) / 86400000)) + 1;
    }

    /* renamed from: Z */
    public abstract int mo63495Z(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public final int mo63496aa(long j) {
        int al = mo63505al(j);
        return mo63499ad(al, mo63501ah(j, al));
    }

    /* renamed from: ab */
    public int mo63497ab(long j, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ac */
    public final int mo63498ac(int i) {
        return mo63463ay(i) ? 366 : 365;
    }

    /* renamed from: ad */
    public abstract int mo63499ad(int i, int i2);

    /* renamed from: ae */
    public abstract int mo63455ae();

    /* access modifiers changed from: package-private */
    /* renamed from: af */
    public final int mo63500af(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* renamed from: ag */
    public abstract int mo63456ag();

    /* renamed from: ah */
    public abstract int mo63501ah(long j, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public final int mo63502ai(long j, int i) {
        long as = mo63506as(i);
        if (j < as) {
            return mo63503aj(i - 1);
        }
        if (j >= mo63506as(i + 1)) {
            return 1;
        }
        return ((int) ((j - as) / 604800000)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aj */
    public final int mo63503aj(int i) {
        return (int) ((mo63506as(i + 1) - mo63506as(i)) / 604800000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ak */
    public final int mo63504ak(long j) {
        int al = mo63505al(j);
        int ai = mo63502ai(j, al);
        if (ai == 1) {
            return mo63505al(j + 604800000);
        }
        return ai > 51 ? mo63505al(j - 1209600000) : al;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: al */
    public final int mo63505al(long j) {
        long aq = mo63461aq();
        long an = (j >> 1) + mo63458an();
        if (an < 0) {
            an = (an - aq) + 1;
        }
        int i = (int) (an / aq);
        long j2 = mo63511ax(i).f192080b;
        long j3 = j - j2;
        if (j3 < 0) {
            return i - 1;
        }
        long j4 = 31536000000L;
        if (j3 < 31536000000L) {
            return i;
        }
        if (true == mo63463ay(i)) {
            j4 = 31622400000L;
        }
        return j2 + j4 > j ? i : i + 1;
    }

    /* renamed from: am */
    public abstract long mo63457am(int i);

    /* renamed from: an */
    public abstract long mo63458an();

    /* renamed from: ao */
    public abstract long mo63459ao();

    /* renamed from: ap */
    public abstract long mo63460ap();

    /* renamed from: aq */
    public abstract long mo63461aq();

    /* renamed from: ar */
    public long mo63462ar(int i, int i2, int i3) {
        C72218h.m106361g(C72283g.f192391g, i, mo63456ag(), mo63455ae());
        C72218h.m106361g(C72283g.f192393i, i2, 1, 12);
        C72218h.m106361g(C72283g.f192394j, i3, 1, mo63499ad(i, i2));
        return mo63509av(i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: as */
    public final long mo63506as(int i) {
        long j = mo63511ax(i).f192080b;
        int X = mo63493X(j);
        return X > 8 - this.f192099G ? j + (((long) (8 - X)) * 86400000) : j - (((long) (X - 1)) * 86400000);
    }

    /* renamed from: at */
    public abstract long mo63507at(int i, int i2);

    /* renamed from: au */
    public abstract long mo63508au(long j, long j2);

    /* access modifiers changed from: package-private */
    /* renamed from: av */
    public final long mo63509av(int i, int i2, int i3) {
        return mo63511ax(i).f192080b + mo63507at(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    /* renamed from: aw */
    public abstract long mo63510aw(long j, int i);

    /* renamed from: ax */
    public final C72169e mo63511ax(int i) {
        C72169e[] eVarArr = this.f192100X;
        int i2 = i & 1023;
        C72169e eVar = eVarArr[i2];
        if (eVar != null && eVar.f192079a == i) {
            return eVar;
        }
        C72169e eVar2 = new C72169e(i, mo63457am(i));
        eVarArr[i2] = eVar2;
        return eVar2;
    }

    /* renamed from: ay */
    public abstract boolean mo63463ay(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C72170f fVar = (C72170f) obj;
            return this.f192099G == fVar.f192099G && mo63325C().equals(fVar.mo63325C());
        }
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + mo63325C().hashCode() + this.f192099G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        C72288l C = mo63325C();
        if (C != null) {
            sb.append(C.f192423d);
        }
        if (this.f192099G != 4) {
            sb.append(",mdfw=");
            sb.append(this.f192099G);
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: b */
    public final long mo63345b(int i, int i2, int i3, int i4) {
        C72132a aVar = this.f192053a;
        if (aVar != null) {
            return aVar.mo63345b(i, i2, i3, i4);
        }
        C72218h.m106361g(C72283g.f192408x, i4, 0, 86399999);
        return mo63462ar(i, i2, i3) + ((long) i4);
    }

    /* renamed from: c */
    public final long mo63346c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C72132a aVar = this.f192053a;
        if (aVar != null) {
            return aVar.mo63346c(i, i2, i3, i4, i5, i6, i7);
        }
        C72218h.m106361g(C72283g.f192403s, i4, 0, 23);
        C72218h.m106361g(C72283g.f192405u, i5, 0, 59);
        C72218h.m106361g(C72283g.f192407w, i6, 0, 59);
        C72218h.m106361g(C72283g.f192409y, i7, 0, 999);
        return mo63462ar(i, i2, i3) + ((long) (i4 * 3600000)) + ((long) (i5 * 60000)) + ((long) (i6 * 1000)) + ((long) i7);
    }
}
