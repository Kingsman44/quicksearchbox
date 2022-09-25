package androidx.media3.exoplayer.hls;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.p134c.C2529g;
import com.google.common.p4522b.C58557jl;

/* renamed from: androidx.media3.exoplayer.hls.r */
/* compiled from: PG */
final class C3178r implements C3095cf {

    /* renamed from: a */
    public final int f9469a;

    /* renamed from: b */
    public final C3185y f9470b;

    /* renamed from: c */
    public int f9471c = -1;

    public C3178r(C3185y yVar, int i) {
        this.f9470b = yVar;
        this.f9469a = i;
    }

    /* renamed from: e */
    private final boolean m9281e() {
        int i = this.f9471c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: a */
    public final int mo6843a(C2874cc ccVar, C2529g gVar, int i) {
        C2680x xVar;
        int i2 = this.f9471c;
        if (i2 == -3) {
            gVar.f6941a |= 4;
            return -4;
        } else if (!m9281e()) {
            return -3;
        } else {
            C3185y yVar = this.f9470b;
            if (yVar.mo7186s()) {
                return -3;
            }
            int i3 = 0;
            if (!yVar.f9512e.isEmpty()) {
                int i4 = 0;
                loop0:
                while (i4 < yVar.f9512e.size() - 1) {
                    int i5 = ((C3175o) yVar.f9512e.get(i4)).f9433a;
                    int length = yVar.f9516i.length;
                    for (int i6 = 0; i6 < length; i6++) {
                        if (yVar.f9530w[i6] && yVar.f9516i[i6].mo7073i() == i5) {
                            break loop0;
                        }
                    }
                    i4++;
                }
                C2612ak.m6942Y(yVar.f9512e, 0, i4);
                C3175o oVar = (C3175o) yVar.f9512e.get(0);
                C2680x xVar2 = oVar.f8848n;
                if (!xVar2.equals(yVar.f9524q)) {
                    C3065bc bcVar = yVar.f9511d;
                    int i7 = yVar.f9508a;
                    int i8 = oVar.f8849o;
                    Object obj = oVar.f8850p;
                    bcVar.mo7016o(i7, xVar2, i8, oVar.f8851q);
                }
                yVar.f9524q = xVar2;
            }
            if (!yVar.f9512e.isEmpty() && !((C3175o) yVar.f9512e.get(0)).f9442j) {
                return -3;
            }
            int j = yVar.f9516i[i2].mo7074j(ccVar, gVar, i, yVar.f9485B);
            if (j != -5) {
                return j;
            }
            C2680x xVar3 = ccVar.f8096a;
            xVar3.getClass();
            if (i2 == yVar.f9519l) {
                int i9 = yVar.f9516i[i2].mo7073i();
                while (i3 < yVar.f9512e.size() && ((C3175o) yVar.f9512e.get(i3)).f9433a != i9) {
                    i3++;
                }
                if (i3 < yVar.f9512e.size()) {
                    xVar = ((C3175o) yVar.f9512e.get(i3)).f8848n;
                } else {
                    xVar = yVar.f9523p;
                    if (xVar == null) {
                        throw null;
                    }
                }
                xVar3 = xVar3.mo6358c(xVar);
            }
            ccVar.f8096a = xVar3;
            return -5;
        }
    }

    /* renamed from: b */
    public final int mo6844b(long j) {
        if (!m9281e()) {
            return 0;
        }
        C3185y yVar = this.f9470b;
        int i = this.f9471c;
        if (yVar.mo7186s()) {
            return 0;
        }
        C3184x xVar = yVar.f9516i[i];
        int h = xVar.mo7072h(j, yVar.f9485B);
        C3175o oVar = (C3175o) C58557jl.m90132m(yVar.f9512e, (Object) null);
        if (oVar != null && !oVar.f9442j) {
            h = Math.min(h, oVar.mo7172a(i) - (xVar.f9043e + xVar.f9044f));
        }
        xVar.mo7088y(h);
        return h;
    }

    /* renamed from: d */
    public final void mo7175d() {
        C2601a.m6830b(this.f9471c == -1);
        C3185y yVar = this.f9470b;
        int i = this.f9469a;
        yVar.mo7180g();
        int[] iArr = yVar.f9528u;
        iArr.getClass();
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = yVar.f9530w;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.f9471c = i2;
            }
        } else if (yVar.f9527t.contains(yVar.f9526s.mo7097b(i))) {
            i2 = -3;
            this.f9471c = i2;
        }
        i2 = -2;
        this.f9471c = i2;
    }

    /* renamed from: f */
    public final boolean mo6847f() {
        int i = this.f9471c;
        if (i == -3) {
            return true;
        }
        if (!m9281e()) {
            return false;
        }
        C3185y yVar = this.f9470b;
        return !yVar.mo7186s() && yVar.f9516i[i].mo7068A(yVar.f9485B);
    }

    /* renamed from: fd */
    public final void mo6848fd() {
        int i = this.f9471c;
        if (i == -2) {
            C3185y yVar = this.f9470b;
            yVar.mo7180g();
            throw new C3159ab(yVar.f9526s.mo7097b(this.f9469a).f7357d[0].f7496n);
        } else if (i == -1) {
            this.f9470b.mo7183k();
        } else if (i != -3) {
            C3185y yVar2 = this.f9470b;
            yVar2.mo7183k();
            yVar2.f9516i[i].mo7083t();
        }
    }
}
