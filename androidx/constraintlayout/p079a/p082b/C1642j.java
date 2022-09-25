package androidx.constraintlayout.p079a.p082b;

import androidx.constraintlayout.p079a.C1614b;
import androidx.constraintlayout.p079a.C1649d;
import androidx.constraintlayout.p079a.C1654i;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.a.b.j */
/* compiled from: PG */
public final class C1642j extends C1638f {

    /* renamed from: a */
    public float f4735a = -1.0f;

    /* renamed from: aN */
    public C1636d f4736aN = this.f4595O;

    /* renamed from: aO */
    public int f4737aO;

    /* renamed from: aP */
    private boolean f4738aP;

    /* renamed from: b */
    public int f4739b = -1;

    /* renamed from: c */
    public int f4740c = -1;

    /* renamed from: d */
    protected boolean f4741d = true;

    public C1642j() {
        this.f4737aO = 0;
        this.f4603W.clear();
        this.f4603W.add(this.f4736aN);
        int length = this.f4602V.length;
        for (int i = 0; i < 6; i++) {
            this.f4602V[i] = this.f4736aN;
        }
    }

    /* renamed from: L */
    public final C1636d mo4626L(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4737aO == 0) {
                return this.f4736aN;
            }
            return null;
        }
        if (this.f4737aO == 1) {
            return this.f4736aN;
        }
        return null;
    }

    /* renamed from: O */
    public final void mo4629O(boolean z) {
        if (this.f4606Z != null) {
            int n = C1649d.m4494n(this.f4736aN);
            if (this.f4737aO == 1) {
                this.f4625ae = n;
                this.f4626af = 0;
                mo4648z(this.f4606Z.mo4630h());
                mo4618D(0);
                return;
            }
            this.f4625ae = 0;
            this.f4626af = n;
            mo4618D(this.f4606Z.mo4631i());
            mo4648z(0);
        }
    }

    /* renamed from: a */
    public final void mo4663a(int i) {
        this.f4736aN.mo4605f(i);
        this.f4738aP = true;
    }

    /* renamed from: b */
    public final void mo4560b(C1649d dVar, boolean z) {
        C1639g gVar = (C1639g) this.f4606Z;
        if (gVar != null) {
            C1636d L = gVar.mo4626L(2);
            C1636d L2 = gVar.mo4626L(4);
            C1638f fVar = this.f4606Z;
            boolean z2 = true;
            boolean z3 = fVar != null && fVar.f4605Y[0] == C1637e.WRAP_CONTENT;
            if (this.f4737aO == 0) {
                L = gVar.mo4626L(3);
                L2 = gVar.mo4626L(5);
                C1638f fVar2 = this.f4606Z;
                if (fVar2 == null || fVar2.f4605Y[1] != C1637e.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.f4738aP) {
                C1636d dVar2 = this.f4736aN;
                if (dVar2.f4569c) {
                    C1654i b = dVar.mo4674b(dVar2);
                    dVar.mo4678f(b, this.f4736aN.mo4600a());
                    if (this.f4739b != -1) {
                        if (z3) {
                            dVar.mo4679g(dVar.mo4674b(L2), b, 0, 5);
                        }
                    } else if (this.f4740c != -1 && z3) {
                        C1654i b2 = dVar.mo4674b(L2);
                        dVar.mo4679g(b, dVar.mo4674b(L), 0, 5);
                        dVar.mo4679g(b2, b, 0, 5);
                    }
                    this.f4738aP = false;
                    return;
                }
            }
            if (this.f4739b != -1) {
                C1654i b3 = dVar.mo4674b(this.f4736aN);
                dVar.mo4684l(b3, dVar.mo4674b(L), this.f4739b, 8);
                if (z3) {
                    dVar.mo4679g(dVar.mo4674b(L2), b3, 0, 5);
                }
            } else if (this.f4740c != -1) {
                C1654i b4 = dVar.mo4674b(this.f4736aN);
                C1654i b5 = dVar.mo4674b(L2);
                dVar.mo4684l(b4, b5, -this.f4740c, 8);
                if (z3) {
                    dVar.mo4679g(b4, dVar.mo4674b(L), 0, 5);
                    dVar.mo4679g(b5, b4, 0, 5);
                }
            } else if (this.f4735a != -1.0f) {
                C1654i b6 = dVar.mo4674b(this.f4736aN);
                C1654i b7 = dVar.mo4674b(L2);
                float f = this.f4735a;
                C1614b a = dVar.mo4673a();
                a.f4481e.mo4507g(b6, -1.0f);
                a.f4481e.mo4507g(b7, f);
                dVar.mo4677e(a);
            }
        }
    }

    /* renamed from: c */
    public final void mo4561c(C1638f fVar, HashMap hashMap) {
        super.mo4561c(fVar, hashMap);
        C1642j jVar = (C1642j) fVar;
        this.f4735a = jVar.f4735a;
        this.f4739b = jVar.f4739b;
        this.f4740c = jVar.f4740c;
        this.f4741d = jVar.f4741d;
        mo4664d(jVar.f4737aO);
    }

    /* renamed from: d */
    public final void mo4664d(int i) {
        if (this.f4737aO != i) {
            this.f4737aO = i;
            this.f4603W.clear();
            if (this.f4737aO == 1) {
                this.f4736aN = this.f4594N;
            } else {
                this.f4736aN = this.f4595O;
            }
            this.f4603W.add(this.f4736aN);
            int length = this.f4602V.length;
            for (int i2 = 0; i2 < 6; i2++) {
                this.f4602V[i2] = this.f4736aN;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo4563e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo4564f() {
        return this.f4738aP;
    }

    /* renamed from: g */
    public final boolean mo4565g() {
        return this.f4738aP;
    }
}
