package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.em */
/* compiled from: PG */
public final class C0624em extends C0626eo {
    public C0624em(C0653fo foVar) {
        super(foVar);
    }

    /* renamed from: a */
    public final int mo2838a(View view) {
        return this.f2386a.getDecoratedRight(view) + ((C0654fp) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: b */
    public final int mo2839b(View view) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        return this.f2386a.getDecoratedMeasuredWidth(view) + fpVar.leftMargin + fpVar.rightMargin;
    }

    /* renamed from: c */
    public final int mo2840c(View view) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        return this.f2386a.getDecoratedMeasuredHeight(view) + fpVar.topMargin + fpVar.bottomMargin;
    }

    /* renamed from: d */
    public final int mo2841d(View view) {
        return this.f2386a.getDecoratedLeft(view) - ((C0654fp) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: e */
    public final int mo2842e() {
        return this.f2386a.getWidth();
    }

    /* renamed from: f */
    public final int mo2843f() {
        return this.f2386a.getWidth() - this.f2386a.getPaddingRight();
    }

    /* renamed from: g */
    public final int mo2844g() {
        return this.f2386a.getPaddingRight();
    }

    /* renamed from: h */
    public final int mo2845h() {
        return this.f2386a.getWidthMode();
    }

    /* renamed from: i */
    public final int mo2846i() {
        return this.f2386a.getHeightMode();
    }

    /* renamed from: j */
    public final int mo2847j() {
        return this.f2386a.getPaddingLeft();
    }

    /* renamed from: k */
    public final int mo2848k() {
        return (this.f2386a.getWidth() - this.f2386a.getPaddingLeft()) - this.f2386a.getPaddingRight();
    }

    /* renamed from: l */
    public final int mo2849l(View view) {
        this.f2386a.getTransformedBoundingBox(view, true, this.f2388c);
        return this.f2388c.right;
    }

    /* renamed from: m */
    public final int mo2850m(View view) {
        this.f2386a.getTransformedBoundingBox(view, true, this.f2388c);
        return this.f2388c.left;
    }

    /* renamed from: n */
    public final void mo2851n(int i) {
        this.f2386a.offsetChildrenHorizontal(i);
    }
}
