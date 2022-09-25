package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24148f;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24151a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60757n;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.l */
/* compiled from: PG */
public final class C24171l {

    /* renamed from: a */
    private final LayoutInflater f66048a;

    /* renamed from: b */
    private final FrameLayout f66049b;

    /* renamed from: c */
    private final FrameLayout.LayoutParams f66050c;

    /* renamed from: d */
    private final int f66051d;

    /* renamed from: e */
    private final Point f66052e = new Point();

    /* renamed from: f */
    private final Point f66053f = new Point();

    /* renamed from: g */
    private final C24168i f66054g;

    /* renamed from: h */
    private final C24168i f66055h;

    /* renamed from: i */
    private float f66056i;

    /* renamed from: j */
    private float f66057j = 1.0f;

    /* renamed from: k */
    private final C24170k f66058k;

    /* renamed from: l */
    private View f66059l;

    public C24171l(Context context, LayoutInflater layoutInflater, FrameLayout frameLayout, C24168i iVar, C24168i iVar2, C24170k kVar) {
        this.f66048a = layoutInflater;
        this.f66049b = frameLayout;
        this.f66058k = kVar;
        this.f66054g = iVar;
        this.f66055h = iVar2;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lens_teardrop_diameter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        this.f66050c = layoutParams;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lens_hit_target_minimum_diameter);
        this.f66051d = layoutParams.width < dimensionPixelSize2 ? (dimensionPixelSize2 - layoutParams.width) / 2 : 0;
    }

    /* renamed from: k */
    private final int m44948k() {
        return this.f66058k.mo29620b(this.f66050c);
    }

    /* renamed from: l */
    private final int m44949l() {
        return this.f66058k.mo29625g();
    }

    /* renamed from: m */
    private final Point m44950m(float f) {
        float[] fArr = {((float) this.f66050c.width) / 2.0f, ((float) this.f66050c.height) / 2.0f};
        Matrix matrix = new Matrix();
        matrix.setRotate(f, (float) m44948k(), (float) m44949l());
        float f2 = 1.0f / this.f66057j;
        matrix.postScale(f2, f2, (float) m44948k(), (float) m44949l());
        matrix.mapPoints(fArr);
        float f3 = fArr[0];
        return new Point(((int) f3) + this.f66050c.leftMargin, ((int) fArr[1]) + this.f66050c.topMargin);
    }

    /* renamed from: n */
    private final void m44951n() {
        this.f66059l.setRotation(this.f66056i);
        int i = m44950m(this.f66056i).x;
        int i2 = 0;
        if (this.f66054g.mo29617i(i)) {
            C58485gu e = this.f66058k.mo29623e();
            int size = e.size();
            while (i2 < size) {
                C24169j jVar = (C24169j) e.get(i2);
                if (this.f66056i < ((float) jVar.mo29579b()) || this.f66056i > ((float) jVar.mo29578a())) {
                    i2++;
                } else {
                    View view = this.f66059l;
                    float f = this.f66056i;
                    view.setRotation(f + (this.f66054g.mo29610b(i) * (((float) jVar.mo29580c()) - f)));
                    return;
                }
            }
        } else if (this.f66054g.mo29618j(i)) {
            C58485gu f2 = this.f66058k.mo29624f();
            int size2 = f2.size();
            while (i2 < size2) {
                C24169j jVar2 = (C24169j) f2.get(i2);
                if (this.f66056i < ((float) jVar2.mo29579b()) || this.f66056i > ((float) jVar2.mo29578a())) {
                    i2++;
                } else {
                    View view2 = this.f66059l;
                    float f3 = this.f66056i;
                    view2.setRotation(f3 + (this.f66054g.mo29613e(i) * (((float) jVar2.mo29580c()) - f3)));
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Point mo29626a(int i, int i2) {
        Point point = new Point();
        mo29629d(point);
        return new Point(point.x - i, point.y - i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58833ax mo29627b() {
        if (!mo29635j()) {
            return C58836b.f156633a;
        }
        Point m = m44950m(this.f66059l.getRotation());
        int i = (int) (((((float) this.f66050c.width) / 2.0f) + ((float) this.f66051d)) / this.f66057j);
        int i2 = (int) (((((float) this.f66050c.height) / 2.0f) + ((float) this.f66051d)) / this.f66057j);
        return C58833ax.m90834k(new Rect(m.x - i, m.y - i2, m.x + i, m.y + i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29628c(Point point, int i, int i2) {
        point.x = C60757n.m92742c(this.f66053f.x + i, 0, this.f66055h.f66047d.getWidth());
        point.y = i2 + this.f66053f.y;
        if (this.f66055h.mo29617i(i)) {
            float f = (float) this.f66053f.x;
            float min = Math.min(-this.f66055h.mo29611c(), (float) this.f66053f.x);
            point.x = this.f66055h.mo29614f(i + ((int) (f + (this.f66055h.mo29610b(i) * (min - f)))));
        } else if (this.f66055h.mo29618j(i)) {
            float f2 = (float) this.f66053f.x;
            float max = Math.max(this.f66055h.mo29611c(), (float) this.f66053f.x);
            point.x = this.f66055h.mo29614f(i + ((int) (f2 + (this.f66055h.mo29613e(i) * (max - f2)))));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo29629d(Point point) {
        point.x = this.f66050c.leftMargin + m44948k() + this.f66052e.x;
        point.y = this.f66050c.topMargin + m44949l() + this.f66052e.y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo29630e(Point point) {
        this.f66053f.set(point.x, point.y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo29631f(C24148f fVar) {
        C24151a aVar = fVar.f65936a;
        Rect rect = aVar.f65943a;
        float f = aVar.f65944b;
        Point c = this.f66058k.mo29621c(rect);
        int i = c.x;
        int i2 = c.y;
        Point d = this.f66058k.mo29622d(rect);
        int i3 = d.x;
        int i4 = d.y;
        if (!C24151a.m44878b(f, 0.0f)) {
            Matrix matrix = new Matrix();
            matrix.setRotate(f, rect.exactCenterX(), rect.exactCenterY());
            float[] fArr = {(float) i, (float) i2};
            matrix.mapPoints(fArr);
            int rint = (int) Math.rint((double) fArr[0]);
            fArr[0] = (float) i3;
            fArr[1] = (float) i4;
            matrix.mapPoints(fArr);
            i3 = (int) Math.rint((double) fArr[0]);
            i4 = (int) Math.rint((double) fArr[1]);
            i = rint;
            i2 = (int) Math.rint((double) fArr[1]);
        }
        this.f66052e.set(i3 - i, i4 - i2);
        this.f66056i = f;
        this.f66050c.leftMargin = i - m44948k();
        this.f66050c.topMargin = i2 - m44949l();
        View view = this.f66059l;
        if (view != null) {
            view.setRotation(f);
            this.f66059l.requestLayout();
        }
        if (this.f66059l != null) {
            m44951n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo29632g(float f) {
        this.f66057j = f;
        View view = this.f66059l;
        if (view != null) {
            view.setPivotX((float) m44948k());
            this.f66059l.setPivotY((float) m44949l());
            float f2 = 1.0f / f;
            this.f66059l.setScaleX(f2);
            this.f66059l.setScaleY(f2);
            m44951n();
        }
    }

    /* renamed from: h */
    public final void mo29633h(boolean z) {
        if (mo29635j() != z) {
            if (z) {
                if (this.f66059l == null) {
                    View inflate = this.f66048a.inflate(this.f66058k.mo29619a(), (ViewGroup) null);
                    this.f66059l = inflate;
                    inflate.setLayoutParams(this.f66050c);
                    this.f66059l.setRotation(this.f66056i);
                    mo29632g(this.f66057j);
                    this.f66049b.addView(this.f66059l);
                }
                this.f66059l.setVisibility(0);
                return;
            }
            View view = this.f66059l;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo29634i(int i, int i2) {
        if (!mo29635j()) {
            return false;
        }
        View view = this.f66059l;
        int i3 = this.f66051d;
        if (view.isShown()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            Rect rect2 = new Rect((layoutParams.leftMargin + rect.left) - i3, layoutParams.topMargin + rect.top, layoutParams.leftMargin + rect.right + i3, layoutParams.topMargin + rect.bottom + i3);
            Matrix matrix = new Matrix();
            view.getMatrix().invert(matrix);
            float[] fArr = {(float) (i - layoutParams.leftMargin), (float) (i2 - layoutParams.topMargin)};
            matrix.mapPoints(fArr);
            int i4 = (int) (fArr[0] + ((float) layoutParams.leftMargin));
            int i5 = (int) (fArr[1] + ((float) layoutParams.topMargin));
            if (i4 < rect2.left || i4 > rect2.right || i5 < rect2.top || i5 > rect2.bottom) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo29635j() {
        View view = this.f66059l;
        return view != null && view.getVisibility() == 0;
    }
}
