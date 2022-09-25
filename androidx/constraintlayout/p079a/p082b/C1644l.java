package androidx.constraintlayout.p079a.p082b;

import androidx.constraintlayout.p079a.C1649d;

/* renamed from: androidx.constraintlayout.a.b.l */
/* compiled from: PG */
public final class C1644l {

    /* renamed from: a */
    static final boolean[] f4744a = new boolean[3];

    /* renamed from: a */
    static void m4481a(C1639g gVar, C1649d dVar, C1638f fVar) {
        fVar.f4661q = -1;
        fVar.f4662r = -1;
        if (gVar.f4605Y[0] != C1637e.WRAP_CONTENT && fVar.f4605Y[0] == C1637e.MATCH_PARENT) {
            C1636d dVar2 = fVar.f4594N;
            int i = dVar2.f4572f;
            int i2 = gVar.mo4631i() - fVar.f4596P.f4572f;
            dVar2.f4574h = dVar.mo4674b(dVar2);
            C1636d dVar3 = fVar.f4596P;
            dVar3.f4574h = dVar.mo4674b(dVar3);
            dVar.mo4678f(fVar.f4594N.f4574h, i);
            dVar.mo4678f(fVar.f4596P.f4574h, i2);
            fVar.f4661q = 2;
            fVar.f4625ae = i;
            int i3 = i2 - i;
            fVar.f4621aa = i3;
            int i4 = fVar.f4632al;
            if (i3 < i4) {
                fVar.f4621aa = i4;
            }
        }
        if (gVar.f4605Y[1] != C1637e.WRAP_CONTENT && fVar.f4605Y[1] == C1637e.MATCH_PARENT) {
            C1636d dVar4 = fVar.f4595O;
            int i5 = dVar4.f4572f;
            int h = gVar.mo4630h() - fVar.f4597Q.f4572f;
            dVar4.f4574h = dVar.mo4674b(dVar4);
            C1636d dVar5 = fVar.f4597Q;
            dVar5.f4574h = dVar.mo4674b(dVar5);
            dVar.mo4678f(fVar.f4595O.f4574h, i5);
            dVar.mo4678f(fVar.f4597Q.f4574h, h);
            if (fVar.f4631ak > 0 || fVar.f4637aq == 8) {
                C1636d dVar6 = fVar.f4598R;
                dVar6.f4574h = dVar.mo4674b(dVar6);
                dVar.mo4678f(fVar.f4598R.f4574h, fVar.f4631ak + i5);
            }
            fVar.f4662r = 2;
            fVar.f4626af = i5;
            int i6 = h - i5;
            fVar.f4622ab = i6;
            int i7 = fVar.f4633am;
            if (i6 < i7) {
                fVar.f4622ab = i7;
            }
        }
    }

    /* renamed from: b */
    public static final boolean m4482b(int i, int i2) {
        return (i & i2) == i2;
    }
}
