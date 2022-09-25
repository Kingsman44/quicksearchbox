package androidx.media3.exoplayer.p150j;

import android.text.TextUtils;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58391dh;
import com.google.common.p4522b.C58393dj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58739qe;
import com.google.common.p4575r.C60745b;

/* renamed from: androidx.media3.exoplayer.j.n */
/* compiled from: PG */
final class C3218n extends C3228x implements Comparable {

    /* renamed from: e */
    private final int f9645e;

    /* renamed from: f */
    private final boolean f9646f;

    /* renamed from: g */
    private final String f9647g = C3195ab.m9358c(this.f9707d.f7487e);

    /* renamed from: h */
    private final C3221q f9648h;

    /* renamed from: i */
    private final boolean f9649i;

    /* renamed from: j */
    private final int f9650j;

    /* renamed from: k */
    private final int f9651k;

    /* renamed from: l */
    private final int f9652l;

    /* renamed from: m */
    private final boolean f9653m;

    /* renamed from: n */
    private final int f9654n;

    /* renamed from: o */
    private final int f9655o;

    /* renamed from: p */
    private final boolean f9656p;

    /* renamed from: q */
    private final int f9657q;

    /* renamed from: r */
    private final int f9658r;

    /* renamed from: s */
    private final int f9659s;

    /* renamed from: t */
    private final int f9660t;

    /* renamed from: u */
    private final boolean f9661u;

    /* renamed from: v */
    private final boolean f9662v;

    public C3218n(int i, C2652bn bnVar, int i2, C3221q qVar, int i3, boolean z, C58839bc bcVar) {
        super(i, bnVar, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.f9648h = qVar;
        int i7 = 0;
        this.f9649i = C3195ab.m9359f(i3, false);
        int i8 = 0;
        while (true) {
            C58485gu guVar = qVar.f7388n;
            i4 = Integer.MAX_VALUE;
            if (i8 >= ((C58724pq) guVar).f156474d) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = C3195ab.m9356a(this.f9707d, (String) guVar.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.f9651k = i8;
        this.f9650j = i5;
        int i9 = this.f9707d.f7489g;
        int i10 = qVar.f7389o;
        this.f9652l = C3195ab.m9357b(i9, 0);
        C2680x xVar = this.f9707d;
        int i11 = xVar.f7489g;
        this.f9653m = i11 == 0 || (i11 & 1) != 0;
        this.f9656p = 1 == (xVar.f7488f & 1);
        this.f9657q = xVar.f7477A;
        this.f9658r = xVar.f7478B;
        this.f9659s = xVar.f7492j;
        if (xVar.f7492j != -1) {
            int i12 = qVar.f7391q;
        }
        if (xVar.f7477A != -1) {
            int i13 = qVar.f7390p;
        }
        this.f9646f = bcVar.mo5941a(xVar);
        String[] ap = C2612ak.m6966ap();
        int i14 = 0;
        while (true) {
            if (i14 >= ap.length) {
                i14 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = C3195ab.m9356a(this.f9707d, ap[i14], false);
            if (i6 > 0) {
                break;
            }
            i14++;
        }
        this.f9654n = i14;
        this.f9655o = i6;
        int i15 = 0;
        while (true) {
            C58485gu guVar2 = qVar.f7392r;
            if (i15 < ((C58724pq) guVar2).f156474d) {
                String str = this.f9707d.f7496n;
                if (str != null && str.equals(guVar2.get(i15))) {
                    i4 = i15;
                    break;
                }
                i15++;
            } else {
                break;
            }
        }
        this.f9660t = i4;
        this.f9661u = (i3 & 128) == 128;
        this.f9662v = (i3 & 64) == 64;
        C3221q qVar2 = this.f9648h;
        if (C3195ab.m9359f(i3, qVar2.f9684L) && ((z2 = this.f9646f) || qVar2.f9678F)) {
            if (C3195ab.m9359f(i3, false) && z2 && this.f9707d.f7492j != -1) {
                boolean z3 = qVar2.f7398x;
                boolean z4 = qVar2.f7397w;
                if (qVar2.f9686N || !z) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.f9645e = i7;
    }

    /* renamed from: b */
    public final int mo7202b() {
        return this.f9645e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo7203c(C3228x xVar) {
        C3218n nVar = (C3218n) xVar;
        C3221q qVar = this.f9648h;
        boolean z = qVar.f9681I;
        C2680x xVar2 = this.f9707d;
        int i = xVar2.f7477A;
        if (i == -1) {
            return false;
        }
        C2680x xVar3 = nVar.f9707d;
        if (i != xVar3.f7477A) {
            return false;
        }
        boolean z2 = qVar.f9679G;
        String str = xVar2.f7496n;
        if (str == null || !TextUtils.equals(str, xVar3.f7496n)) {
            return false;
        }
        C3221q qVar2 = this.f9648h;
        boolean z3 = qVar2.f9680H;
        int i2 = this.f9707d.f7478B;
        if (i2 == -1 || i2 != nVar.f9707d.f7478B) {
            return false;
        }
        boolean z4 = qVar2.f9682J;
        return this.f9661u == nVar.f9661u && this.f9662v == nVar.f9662v;
    }

    /* renamed from: a */
    public final int compareTo(C3218n nVar) {
        C58710pc pcVar;
        if (!this.f9646f || !this.f9649i) {
            pcVar = C3195ab.f9596a.mo55783c();
        } else {
            pcVar = C3195ab.f9596a;
        }
        C58393dj d = C58391dh.m89477g(C60745b.m92716a(this.f9649i, nVar.f9649i)).mo55137d(Integer.valueOf(this.f9651k), Integer.valueOf(nVar.f9651k), C58739qe.f156510a).mo55135b(this.f9650j, nVar.f9650j).mo55135b(this.f9652l, nVar.f9652l).mo55138e(this.f9656p, nVar.f9656p).mo55138e(this.f9653m, nVar.f9653m).mo55137d(Integer.valueOf(this.f9654n), Integer.valueOf(nVar.f9654n), C58739qe.f156510a).mo55135b(this.f9655o, nVar.f9655o).mo55138e(this.f9646f, nVar.f9646f).mo55137d(Integer.valueOf(this.f9660t), Integer.valueOf(nVar.f9660t), C58739qe.f156510a);
        Integer valueOf = Integer.valueOf(this.f9659s);
        Integer valueOf2 = Integer.valueOf(nVar.f9659s);
        boolean z = this.f9648h.f7397w;
        C58393dj d2 = d.mo55137d(valueOf, valueOf2, C3195ab.f9597b).mo55138e(this.f9661u, nVar.f9661u).mo55138e(this.f9662v, nVar.f9662v).mo55137d(Integer.valueOf(this.f9657q), Integer.valueOf(nVar.f9657q), pcVar).mo55137d(Integer.valueOf(this.f9658r), Integer.valueOf(nVar.f9658r), pcVar);
        Integer valueOf3 = Integer.valueOf(this.f9659s);
        Integer valueOf4 = Integer.valueOf(nVar.f9659s);
        if (!C2612ak.m6951aa(this.f9647g, nVar.f9647g)) {
            pcVar = C3195ab.f9597b;
        }
        return d2.mo55137d(valueOf3, valueOf4, pcVar).mo55134a();
    }
}
