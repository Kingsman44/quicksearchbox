package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;
import androidx.constraintlayout.p079a.p082b.C1615a;
import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import androidx.constraintlayout.p079a.p082b.C1641i;
import androidx.constraintlayout.p079a.p082b.C1642j;
import androidx.constraintlayout.p079a.p082b.C1643k;
import androidx.constraintlayout.p079a.p082b.C1645m;
import androidx.constraintlayout.p079a.p082b.C1646n;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C1743b;
import androidx.constraintlayout.widget.C1751j;
import androidx.constraintlayout.widget.C1753l;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.C1757p;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.x */
/* compiled from: PG */
final class C1739x {

    /* renamed from: a */
    C1639g f5184a = new C1639g();

    /* renamed from: b */
    C1639g f5185b = new C1639g();

    /* renamed from: c */
    C1756o f5186c = null;

    /* renamed from: d */
    C1756o f5187d = null;

    /* renamed from: e */
    int f5188e;

    /* renamed from: f */
    int f5189f;

    /* renamed from: g */
    final /* synthetic */ MotionLayout f5190g;

    public C1739x(MotionLayout motionLayout) {
        this.f5190g = motionLayout;
    }

    /* renamed from: c */
    static final void m4725c(C1639g gVar, C1639g gVar2) {
        C1638f fVar;
        ArrayList arrayList = gVar.f4756be;
        HashMap hashMap = new HashMap();
        hashMap.put(gVar, gVar2);
        gVar2.f4756be.clear();
        gVar2.mo4561c(gVar, hashMap);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1638f fVar2 = (C1638f) arrayList.get(i);
            if (fVar2 instanceof C1615a) {
                fVar = new C1615a();
            } else if (fVar2 instanceof C1642j) {
                fVar = new C1642j();
            } else if (fVar2 instanceof C1641i) {
                fVar = new C1641i();
            } else if (fVar2 instanceof C1645m) {
                fVar = new C1645m();
            } else if (fVar2 instanceof C1643k) {
                fVar = new C1643k();
            } else {
                fVar = new C1638f();
            }
            gVar2.mo4671T(fVar);
            hashMap.put(fVar2, fVar);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1638f fVar3 = (C1638f) arrayList.get(i2);
            ((C1638f) hashMap.get(fVar3)).mo4561c(fVar3, hashMap);
        }
    }

    /* renamed from: d */
    static final C1638f m4726d(C1639g gVar, View view) {
        if (gVar.f4636ap == view) {
            return gVar;
        }
        ArrayList arrayList = gVar.f4756be;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1638f fVar = (C1638f) arrayList.get(i);
            if (fVar.f4636ap == view) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final void m4727f(int i, int i2) {
        MotionLayout motionLayout = this.f5190g;
        int i3 = motionLayout.f5203S.f4679aU;
        if (motionLayout.f4857g == motionLayout.f4856f) {
            C1639g gVar = this.f5185b;
            C1756o oVar = this.f5187d;
            motionLayout.mo4828G(gVar, i3, (oVar == null || oVar.f5455d == 0) ? i : i2, (oVar == null || oVar.f5455d == 0) ? i2 : i);
            C1756o oVar2 = this.f5186c;
            if (oVar2 != null) {
                MotionLayout motionLayout2 = this.f5190g;
                C1639g gVar2 = this.f5184a;
                int i4 = oVar2.f5455d;
                int i5 = i4 == 0 ? i : i2;
                if (i4 == 0) {
                    i = i2;
                }
                motionLayout2.mo4828G(gVar2, i3, i5, i);
                return;
            }
            return;
        }
        C1756o oVar3 = this.f5186c;
        if (oVar3 != null) {
            C1639g gVar3 = this.f5184a;
            int i6 = oVar3.f5455d;
            motionLayout.mo4828G(gVar3, i3, i6 == 0 ? i : i2, i6 == 0 ? i2 : i);
        }
        MotionLayout motionLayout3 = this.f5190g;
        C1639g gVar4 = this.f5185b;
        C1756o oVar4 = this.f5187d;
        int i7 = (oVar4 == null || oVar4.f5455d == 0) ? i : i2;
        if (oVar4 == null || oVar4.f5455d == 0) {
            i = i2;
        }
        motionLayout3.mo4828G(gVar4, i3, i7, i);
    }

    /* renamed from: g */
    private final void m4728g(C1639g gVar, C1756o oVar) {
        C1751j jVar;
        C1751j jVar2;
        C1639g gVar2 = gVar;
        C1756o oVar2 = oVar;
        SparseArray sparseArray = new SparseArray();
        C1757p pVar = new C1757p();
        sparseArray.clear();
        sparseArray.put(0, gVar2);
        sparseArray.put(this.f5190g.getId(), gVar2);
        if (!(oVar2 == null || oVar2.f5455d == 0)) {
            MotionLayout motionLayout = this.f5190g;
            motionLayout.mo4828G(this.f5185b, motionLayout.f5203S.f4679aU, View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5190g.getWidth(), 1073741824));
        }
        ArrayList arrayList = gVar2.f4756be;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1638f fVar = (C1638f) arrayList.get(i);
            sparseArray.put(((View) fVar.f4636ap).getId(), fVar);
        }
        ArrayList arrayList2 = gVar2.f4756be;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1638f fVar2 = (C1638f) arrayList2.get(i2);
            Object obj = fVar2.f4636ap;
            View view = (View) obj;
            int id = view.getId();
            HashMap hashMap = oVar2.f5457f;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap.containsKey(valueOf) && (jVar2 = (C1751j) oVar2.f5457f.get(valueOf)) != null) {
                jVar2.mo4875c(pVar);
            }
            fVar2.mo4618D(oVar2.mo4884b(view.getId()));
            fVar2.mo4648z(oVar2.mo4883a(view.getId()));
            if (obj instanceof C1743b) {
                C1743b bVar = (C1743b) obj;
                int id2 = bVar.getId();
                HashMap hashMap2 = oVar2.f5457f;
                Integer valueOf2 = Integer.valueOf(id2);
                if (hashMap2.containsKey(valueOf2) && (jVar = (C1751j) oVar2.f5457f.get(valueOf2)) != null && (fVar2 instanceof C1643k)) {
                    bVar.mo4701b(jVar, (C1643k) fVar2, pVar, sparseArray);
                }
                if (obj instanceof Barrier) {
                    ((Barrier) obj).mo4859o();
                }
            }
            pVar.resolveLayoutDirection(this.f5190g.getLayoutDirection());
            this.f5190g.mo4826E(false, view, fVar2, pVar, sparseArray);
            if (oVar2.mo4885e(view.getId()).f5340c.f5432c == 1) {
                fVar2.f4637aq = view.getVisibility();
            } else {
                fVar2.f4637aq = oVar2.mo4885e(view.getId()).f5340c.f5431b;
            }
        }
        ArrayList arrayList3 = gVar2.f4756be;
        int size3 = arrayList3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C1638f fVar3 = (C1638f) arrayList3.get(i3);
            if (fVar3 instanceof C1646n) {
                C1743b bVar2 = (C1743b) fVar3.f4636ap;
                C1643k kVar = (C1643k) fVar3;
                kVar.mo4667S();
                for (int i4 = 0; i4 < bVar2.f5225d; i4++) {
                    kVar.mo4665Q((C1638f) sparseArray.get(bVar2.f5224c[i4]));
                }
                ((C1646n) kVar).mo4669U();
            }
        }
    }

    /* renamed from: a */
    public final void mo4817a() {
        int i;
        int[] iArr;
        SparseArray sparseArray;
        int childCount = this.f5190g.getChildCount();
        this.f5190g.f4862l.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f5190g.getChildAt(i2);
            C1733r rVar = new C1733r(childAt);
            int id = childAt.getId();
            iArr2[i2] = id;
            sparseArray2.put(id, rVar);
            this.f5190g.f4862l.put(childAt, rVar);
        }
        int i3 = 0;
        while (i3 < childCount) {
            View childAt2 = this.f5190g.getChildAt(i3);
            C1733r rVar2 = (C1733r) this.f5190g.f4862l.get(childAt2);
            if (rVar2 == null) {
                i = childCount;
                sparseArray = sparseArray2;
                iArr = iArr2;
            } else {
                if (this.f5186c != null) {
                    C1638f d = m4726d(this.f5184a, childAt2);
                    if (d != null) {
                        Rect a = this.f5190g.mo4714a(d);
                        C1756o oVar = this.f5186c;
                        int width = this.f5190g.getWidth();
                        int height = this.f5190g.getHeight();
                        int i4 = oVar.f5455d;
                        sparseArray = sparseArray2;
                        if (i4 != 0) {
                            C1733r.m4704e(a, rVar2.f5138a, i4, width, height);
                        }
                        C1703ab abVar = rVar2.f5142e;
                        abVar.f4880d = 0.0f;
                        abVar.f4881e = 0.0f;
                        rVar2.mo4808c(abVar);
                        iArr = iArr2;
                        i = childCount;
                        rVar2.f5142e.mo4752c((float) a.left, (float) a.top, (float) a.width(), (float) a.height());
                        C1751j e = oVar.mo4885e(rVar2.f5140c);
                        rVar2.f5142e.mo4750a(e);
                        rVar2.f5148k = e.f5341d.f5422h;
                        rVar2.f5144g.mo4803c(a, oVar, i4, rVar2.f5140c);
                        rVar2.f5161x = e.f5343f.f5444j;
                        C1753l lVar = e.f5341d;
                        rVar2.f5162y = lVar.f5426l;
                        rVar2.f5163z = lVar.f5425k;
                        Context context = rVar2.f5139b.getContext();
                        C1753l lVar2 = e.f5341d;
                        int i5 = lVar2.f5428n;
                        String str = lVar2.f5427m;
                        int i6 = lVar2.f5429o;
                        Interpolator interpolator = null;
                        switch (i5) {
                            case -2:
                                interpolator = AnimationUtils.loadInterpolator(context, i6);
                                break;
                            case -1:
                                interpolator = new C1732q(C1596f.m4246c(str));
                                break;
                            case 0:
                                interpolator = new AccelerateDecelerateInterpolator();
                                break;
                            case 1:
                                interpolator = new AccelerateInterpolator();
                                break;
                            case 2:
                                interpolator = new DecelerateInterpolator();
                                break;
                            case 4:
                                interpolator = new BounceInterpolator();
                                break;
                            case 5:
                                interpolator = new OvershootInterpolator();
                                break;
                        }
                        rVar2.f5130A = interpolator;
                    } else {
                        i = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        if (this.f5190g.f4868r != 0) {
                            String a2 = C1701a.m4618a();
                            String b = C1701a.m4619b(childAt2);
                            String name = childAt2.getClass().getName();
                            int length = String.valueOf(b).length();
                            StringBuilder sb = new StringBuilder(a2.length() + 18 + length + String.valueOf(name).length());
                            sb.append(a2);
                            sb.append("no widget for  ");
                            sb.append(b);
                            sb.append(" (");
                            sb.append(name);
                            sb.append(")");
                            Log.e("MotionLayout", sb.toString());
                        }
                    }
                } else {
                    i = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                }
                if (this.f5187d != null) {
                    C1638f d2 = m4726d(this.f5185b, childAt2);
                    if (d2 != null) {
                        Rect a3 = this.f5190g.mo4714a(d2);
                        C1756o oVar2 = this.f5187d;
                        int width2 = this.f5190g.getWidth();
                        int height2 = this.f5190g.getHeight();
                        int i7 = oVar2.f5455d;
                        if (i7 != 0) {
                            C1733r.m4704e(a3, rVar2.f5138a, i7, width2, height2);
                            a3 = rVar2.f5138a;
                        }
                        C1703ab abVar2 = rVar2.f5143f;
                        abVar2.f4880d = 1.0f;
                        abVar2.f4881e = 1.0f;
                        rVar2.mo4808c(abVar2);
                        rVar2.f5143f.mo4752c((float) a3.left, (float) a3.top, (float) a3.width(), (float) a3.height());
                        rVar2.f5143f.mo4750a(oVar2.mo4885e(rVar2.f5140c));
                        rVar2.f5145h.mo4803c(a3, oVar2, i7, rVar2.f5140c);
                    } else if (this.f5190g.f4868r != 0) {
                        String a4 = C1701a.m4618a();
                        String b2 = C1701a.m4619b(childAt2);
                        String name2 = childAt2.getClass().getName();
                        int length2 = String.valueOf(b2).length();
                        StringBuilder sb2 = new StringBuilder(a4.length() + 18 + length2 + String.valueOf(name2).length());
                        sb2.append(a4);
                        sb2.append("no widget for  ");
                        sb2.append(b2);
                        sb2.append(" (");
                        sb2.append(name2);
                        sb2.append(")");
                        Log.e("MotionLayout", sb2.toString());
                    }
                }
            }
            i3++;
            sparseArray2 = sparseArray;
            iArr2 = iArr;
            childCount = i;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i8 = 0;
        while (i8 < childCount) {
            SparseArray sparseArray4 = sparseArray3;
            C1733r rVar3 = (C1733r) sparseArray4.get(iArr3[i8]);
            int i9 = rVar3.f5142e.f4888l;
            if (i9 != -1) {
                C1733r rVar4 = (C1733r) sparseArray4.get(i9);
                rVar3.f5142e.mo4754d(rVar4, rVar4.f5142e);
                rVar3.f5143f.mo4754d(rVar4, rVar4.f5143f);
            }
            i8++;
            sparseArray3 = sparseArray4;
        }
    }

    /* renamed from: b */
    public final void mo4818b() {
        MotionLayout motionLayout = this.f5190g;
        int i = motionLayout.f4859i;
        int i2 = motionLayout.f4860j;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        MotionLayout motionLayout2 = this.f5190g;
        motionLayout2.f4824G = mode;
        motionLayout2.f4825H = mode2;
        int i3 = motionLayout2.f5203S.f4679aU;
        m4727f(i, i2);
        int i4 = 0;
        if (!((this.f5190g.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824)) {
            m4727f(i, i2);
            this.f5190g.f4820C = this.f5184a.mo4631i();
            this.f5190g.f4821D = this.f5184a.mo4630h();
            this.f5190g.f4822E = this.f5185b.mo4631i();
            this.f5190g.f4823F = this.f5185b.mo4630h();
            MotionLayout motionLayout3 = this.f5190g;
            motionLayout3.f4819B = (motionLayout3.f4820C == motionLayout3.f4822E && motionLayout3.f4821D == motionLayout3.f4823F) ? false : true;
        }
        MotionLayout motionLayout4 = this.f5190g;
        int i5 = motionLayout4.f4820C;
        int i6 = motionLayout4.f4821D;
        int i7 = motionLayout4.f4824G;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) (((float) i5) + (motionLayout4.f4826I * ((float) (motionLayout4.f4822E - i5))));
        }
        int i8 = motionLayout4.f4825H;
        if (i8 == Integer.MIN_VALUE || i8 == 0) {
            i6 = (int) (((float) i6) + (motionLayout4.f4826I * ((float) (motionLayout4.f4823F - i6))));
        }
        int i9 = i6;
        C1639g gVar = this.f5184a;
        motionLayout4.mo4827F(i, i2, i5, i9, gVar.f4680aV || this.f5185b.f4680aV, gVar.f4681aW || this.f5185b.f4681aW);
        MotionLayout motionLayout5 = this.f5190g;
        int childCount = motionLayout5.getChildCount();
        motionLayout5.f4830M.mo4817a();
        motionLayout5.f4866p = true;
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = motionLayout5.getChildAt(i10);
            sparseArray.put(childAt.getId(), (C1733r) motionLayout5.f4862l.get(childAt));
        }
        int width = motionLayout5.getWidth();
        int height = motionLayout5.getHeight();
        C1706ae aeVar = motionLayout5.f4852b.f4919c;
        int i11 = aeVar != null ? aeVar.f4914p : -1;
        if (i11 != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                C1733r rVar = (C1733r) motionLayout5.f4862l.get(motionLayout5.getChildAt(i12));
                if (rVar != null) {
                    rVar.f5160w = i11;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[motionLayout5.f4862l.size()];
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            C1733r rVar2 = (C1733r) motionLayout5.f4862l.get(motionLayout5.getChildAt(i14));
            int i15 = rVar2.f5142e.f4888l;
            if (i15 != -1) {
                sparseBooleanArray.put(i15, true);
                iArr[i13] = rVar2.f5142e.f4888l;
                i13++;
            }
        }
        for (int i16 = 0; i16 < i13; i16++) {
            C1733r rVar3 = (C1733r) motionLayout5.f4862l.get(motionLayout5.findViewById(iArr[i16]));
            if (rVar3 != null) {
                motionLayout5.f4852b.mo4769h(rVar3);
                rVar3.mo4810f(width, height, System.nanoTime());
            }
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = motionLayout5.getChildAt(i17);
            C1733r rVar4 = (C1733r) motionLayout5.f4862l.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && rVar4 != null) {
                motionLayout5.f4852b.mo4769h(rVar4);
                rVar4.mo4810f(width, height, System.nanoTime());
            }
        }
        float c = motionLayout5.f4852b.mo4764c();
        if (c != 0.0f) {
            double d = (double) c;
            float abs = Math.abs(c);
            float f = Float.MAX_VALUE;
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            for (int i18 = 0; i18 < childCount; i18++) {
                C1733r rVar5 = (C1733r) motionLayout5.f4862l.get(motionLayout5.getChildAt(i18));
                if (!Float.isNaN(rVar5.f5148k)) {
                    float f4 = -3.4028235E38f;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        C1733r rVar6 = (C1733r) motionLayout5.f4862l.get(motionLayout5.getChildAt(i19));
                        if (!Float.isNaN(rVar6.f5148k)) {
                            f = Math.min(f, rVar6.f5148k);
                            f4 = Math.max(f4, rVar6.f5148k);
                        }
                    }
                    while (i4 < childCount) {
                        C1733r rVar7 = (C1733r) motionLayout5.f4862l.get(motionLayout5.getChildAt(i4));
                        if (!Float.isNaN(rVar7.f5148k)) {
                            rVar7.f5150m = 1.0f / (1.0f - abs);
                            if (d < C59203do.f157270a) {
                                rVar7.f5149l = abs - (((f4 - rVar7.f5148k) / (f4 - f)) * abs);
                            } else {
                                rVar7.f5149l = abs - (((rVar7.f5148k - f) * abs) / (f4 - f));
                            }
                        }
                        i4++;
                    }
                    return;
                }
                C1703ab abVar = rVar5.f5143f;
                float f5 = abVar.f4882f;
                float f6 = abVar.f4883g;
                float f7 = d < C59203do.f157270a ? f6 - f5 : f6 + f5;
                f2 = Math.min(f2, f7);
                f3 = Math.max(f3, f7);
            }
            while (i4 < childCount) {
                C1733r rVar8 = (C1733r) motionLayout5.f4862l.get(motionLayout5.getChildAt(i4));
                C1703ab abVar2 = rVar8.f5143f;
                float f8 = abVar2.f4882f;
                float f9 = abVar2.f4883g;
                float f10 = d < C59203do.f157270a ? f9 - f8 : f9 + f8;
                rVar8.f5150m = 1.0f / (1.0f - abs);
                rVar8.f5149l = abs - (((f10 - f2) * abs) / (f3 - f2));
                i4++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo4819e(C1756o oVar, C1756o oVar2) {
        this.f5186c = oVar;
        this.f5187d = oVar2;
        this.f5184a = new C1639g();
        this.f5185b = new C1639g();
        this.f5184a.mo4651R(this.f5190g.f5203S.f4689bd);
        this.f5185b.mo4651R(this.f5190g.f5203S.f4689bd);
        this.f5184a.f4756be.clear();
        this.f5185b.f4756be.clear();
        m4725c(this.f5190g.f5203S, this.f5184a);
        m4725c(this.f5190g.f5203S, this.f5185b);
        if (((double) this.f5190g.f4864n) > 0.5d) {
            if (oVar != null) {
                m4728g(this.f5184a, oVar);
            }
            m4728g(this.f5185b, oVar2);
        } else {
            m4728g(this.f5185b, oVar2);
            if (oVar != null) {
                m4728g(this.f5184a, oVar);
            }
        }
        this.f5184a.f4691d = this.f5190g.mo4830I();
        C1639g gVar = this.f5184a;
        gVar.f4671a.mo4567a(gVar);
        this.f5185b.f4691d = this.f5190g.mo4830I();
        C1639g gVar2 = this.f5185b;
        gVar2.f4671a.mo4567a(gVar2);
        ViewGroup.LayoutParams layoutParams = this.f5190g.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C1639g gVar3 = this.f5184a;
                gVar3.f4605Y[0] = C1637e.WRAP_CONTENT;
                C1639g gVar4 = this.f5185b;
                gVar4.f4605Y[0] = C1637e.WRAP_CONTENT;
            }
            if (layoutParams.height == -2) {
                C1639g gVar5 = this.f5184a;
                gVar5.f4605Y[1] = C1637e.WRAP_CONTENT;
                C1639g gVar6 = this.f5185b;
                gVar6.f4605Y[1] = C1637e.WRAP_CONTENT;
            }
        }
    }
}
