package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.p079a.p082b.C1636d;
import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import androidx.constraintlayout.p079a.p082b.C1644l;
import androidx.constraintlayout.p079a.p082b.C1646n;
import androidx.constraintlayout.p079a.p082b.p083a.C1617b;

/* renamed from: androidx.constraintlayout.widget.e */
/* compiled from: PG */
public final class C1746e {

    /* renamed from: a */
    public final ConstraintLayout f5303a;

    /* renamed from: b */
    int f5304b;

    /* renamed from: c */
    int f5305c;

    /* renamed from: d */
    int f5306d;

    /* renamed from: e */
    int f5307e;

    /* renamed from: f */
    int f5308f;

    /* renamed from: g */
    int f5309g;

    /* renamed from: h */
    final /* synthetic */ ConstraintLayout f5310h;

    public C1746e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5310h = constraintLayout;
        this.f5303a = constraintLayout2;
    }

    /* renamed from: b */
    private static final boolean m4780b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            return false;
        }
        if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4865a(C1638f fVar, C1617b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C1638f fVar2 = fVar;
        C1617b bVar2 = bVar;
        if (fVar2 != null) {
            if (fVar2.f4637aq == 8) {
                bVar2.f4490e = 0;
                bVar2.f4491f = 0;
                bVar2.f4492g = 0;
            } else if (fVar2.f4606Z != null) {
                C1637e eVar = bVar2.f4486a;
                C1637e eVar2 = bVar2.f4487b;
                int i9 = bVar2.f4488c;
                int i10 = bVar2.f4489d;
                int i11 = this.f5304b + this.f5305c;
                int i12 = this.f5306d;
                Object obj = fVar2.f4636ap;
                C1637e eVar3 = C1637e.FIXED;
                int ordinal = eVar.ordinal();
                if (ordinal == 0) {
                    i = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                } else if (ordinal == 1) {
                    i = ViewGroup.getChildMeasureSpec(this.f5308f, i12, -2);
                } else if (ordinal == 2) {
                    i = ViewGroup.getChildMeasureSpec(this.f5308f, i12, -2);
                    int i13 = fVar2.f4664t;
                    int i14 = bVar2.f4495j;
                    if (i14 == 1 || i14 == 2) {
                        int measuredHeight = ((View) obj).getMeasuredHeight();
                        int h = fVar.mo4630h();
                        if (bVar2.f4495j == 2 || i13 != 1 || measuredHeight == h || (obj instanceof C1759r) || fVar.mo4564f()) {
                            i = View.MeasureSpec.makeMeasureSpec(fVar.mo4631i(), 1073741824);
                        }
                    }
                } else if (ordinal != 3) {
                    i = 0;
                } else {
                    int i15 = this.f5308f;
                    C1636d dVar = fVar2.f4594N;
                    int i16 = dVar != null ? dVar.f4572f : 0;
                    C1636d dVar2 = fVar2.f4596P;
                    if (dVar2 != null) {
                        i16 += dVar2.f4572f;
                    }
                    i = ViewGroup.getChildMeasureSpec(i15, i12 + i16, -1);
                }
                int ordinal2 = eVar2.ordinal();
                if (ordinal2 == 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else if (ordinal2 == 1) {
                    i2 = ViewGroup.getChildMeasureSpec(this.f5309g, i11, -2);
                } else if (ordinal2 == 2) {
                    i2 = ViewGroup.getChildMeasureSpec(this.f5309g, i11, -2);
                    int i17 = fVar2.f4665u;
                    int i18 = bVar2.f4495j;
                    if (i18 == 1 || i18 == 2) {
                        int measuredWidth = ((View) obj).getMeasuredWidth();
                        int i19 = fVar.mo4631i();
                        if (bVar2.f4495j == 2 || i17 != 1 || measuredWidth == i19 || (obj instanceof C1759r) || fVar.mo4565g()) {
                            i2 = View.MeasureSpec.makeMeasureSpec(fVar.mo4630h(), 1073741824);
                        }
                    }
                } else if (ordinal2 != 3) {
                    i2 = 0;
                } else {
                    int i20 = this.f5309g;
                    int i21 = fVar2.f4594N != null ? fVar2.f4595O.f4572f : 0;
                    if (fVar2.f4596P != null) {
                        i21 += fVar2.f4597Q.f4572f;
                    }
                    i2 = ViewGroup.getChildMeasureSpec(i20, i11 + i21, -1);
                }
                C1639g gVar = (C1639g) fVar2.f4606Z;
                if (gVar != null && C1644l.m4482b(this.f5310h.f5205U, 256)) {
                    View view = (View) obj;
                    if (view.getMeasuredWidth() == fVar.mo4631i() && view.getMeasuredWidth() < gVar.mo4631i() && view.getMeasuredHeight() == fVar.mo4630h() && view.getMeasuredHeight() < gVar.mo4630h() && view.getBaseline() == fVar2.f4631ak && !fVar.mo4625K() && m4780b(fVar2.f4592L, i, fVar.mo4631i()) && m4780b(fVar2.f4593M, i2, fVar.mo4630h())) {
                        bVar2.f4490e = fVar.mo4631i();
                        bVar2.f4491f = fVar.mo4630h();
                        bVar2.f4492g = fVar2.f4631ak;
                        return;
                    }
                }
                C1637e eVar4 = C1637e.MATCH_CONSTRAINT;
                boolean z = eVar == eVar4;
                boolean z2 = eVar2 == eVar4;
                C1637e eVar5 = C1637e.MATCH_PARENT;
                boolean z3 = eVar2 == eVar5 || eVar2 == C1637e.FIXED;
                boolean z4 = eVar == eVar5 || eVar == C1637e.FIXED;
                boolean z5 = z && fVar2.f4623ac > 0.0f;
                boolean z6 = z2 && fVar2.f4623ac > 0.0f;
                if (obj != null) {
                    View view2 = (View) obj;
                    C1745d dVar3 = (C1745d) view2.getLayoutParams();
                    int i22 = bVar2.f4495j;
                    if (i22 == 1 || i22 == 2 || !z || fVar2.f4664t != 0 || !z2 || fVar2.f4665u != 0) {
                        if (!(obj instanceof C1766y) || !(fVar2 instanceof C1646n)) {
                            view2.measure(i, i2);
                        } else {
                            ((C1766y) obj).mo4702c((C1646n) fVar2, i, i2);
                        }
                        fVar2.mo4615A(i, i2);
                        int measuredWidth2 = view2.getMeasuredWidth();
                        int measuredHeight2 = view2.getMeasuredHeight();
                        i5 = view2.getBaseline();
                        int i23 = fVar2.f4667w;
                        i4 = i23 > 0 ? Math.max(i23, measuredWidth2) : measuredWidth2;
                        int i24 = fVar2.f4668x;
                        if (i24 > 0) {
                            i4 = Math.min(i24, i4);
                        }
                        int i25 = fVar2.f4670z;
                        i3 = i25 > 0 ? Math.max(i25, measuredHeight2) : measuredHeight2;
                        int i26 = fVar2.f4581A;
                        if (i26 > 0) {
                            i3 = Math.min(i26, i3);
                        }
                        if (!C1644l.m4482b(this.f5310h.f5205U, 1)) {
                            if (z5 && z3) {
                                i4 = (int) ((((float) i3) * fVar2.f4623ac) + 0.5f);
                            } else if (z6 && z4) {
                                i3 = (int) ((((float) i4) / fVar2.f4623ac) + 0.5f);
                            }
                        }
                        if (!(measuredWidth2 == i4 && measuredHeight2 == i3)) {
                            if (measuredWidth2 != i4) {
                                i8 = 1073741824;
                                i = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                            } else {
                                i8 = 1073741824;
                            }
                            if (measuredHeight2 != i3) {
                                i2 = View.MeasureSpec.makeMeasureSpec(i3, i8);
                            }
                            view2.measure(i, i2);
                            fVar2.mo4615A(i, i2);
                            i4 = view2.getMeasuredWidth();
                            i3 = view2.getMeasuredHeight();
                            i5 = view2.getBaseline();
                        }
                        i6 = -1;
                    } else {
                        i6 = -1;
                        i5 = 0;
                        i4 = 0;
                        i3 = 0;
                    }
                    boolean z7 = i5 != i6;
                    bVar2.f4494i = (i4 == bVar2.f4488c && i3 == bVar2.f4489d) ? false : true;
                    boolean z8 = z7 | dVar3.f5261ac;
                    if (z8) {
                        i7 = -1;
                        if (i5 != -1) {
                            if (fVar2.f4631ak != i5) {
                                bVar2.f4494i = true;
                            }
                        }
                        bVar2.f4490e = i4;
                        bVar2.f4491f = i3;
                        bVar2.f4493h = z8;
                        bVar2.f4492g = i7;
                    }
                    i7 = i5;
                    bVar2.f4490e = i4;
                    bVar2.f4491f = i3;
                    bVar2.f4493h = z8;
                    bVar2.f4492g = i7;
                }
            }
        }
    }
}
