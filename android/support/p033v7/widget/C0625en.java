package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.en */
/* compiled from: PG */
public final class C0625en extends C0626eo {
    public C0625en(C0653fo foVar) {
        super(foVar);
    }

    /* renamed from: a */
    public final int mo2838a(View view) {
        return this.f2386a.getDecoratedBottom(view) + ((C0654fp) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: b */
    public final int mo2839b(View view) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        return this.f2386a.getDecoratedMeasuredHeight(view) + fpVar.topMargin + fpVar.bottomMargin;
    }

    /* renamed from: c */
    public final int mo2840c(View view) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        return this.f2386a.getDecoratedMeasuredWidth(view) + fpVar.leftMargin + fpVar.rightMargin;
    }

    /* renamed from: d */
    public final int mo2841d(View view) {
        return this.f2386a.getDecoratedTop(view) - ((C0654fp) view.getLayoutParams()).topMargin;
    }

    /* renamed from: e */
    public final int mo2842e() {
        return this.f2386a.getHeight();
    }

    /* renamed from: f */
    public final int mo2843f() {
        return this.f2386a.getHeight() - this.f2386a.getPaddingBottom();
    }

    /* renamed from: g */
    public final int mo2844g() {
        return this.f2386a.getPaddingBottom();
    }

    /* renamed from: h */
    public final int mo2845h() {
        return this.f2386a.getHeightMode();
    }

    /* renamed from: i */
    public final int mo2846i() {
        return this.f2386a.getWidthMode();
    }

    /* renamed from: j */
    public final int mo2847j() {
        return this.f2386a.getPaddingTop();
    }

    /* renamed from: k */
    public final int mo2848k() {
        return (this.f2386a.getHeight() - this.f2386a.getPaddingTop()) - this.f2386a.getPaddingBottom();
    }

    /* renamed from: l */
    public final int mo2849l(View view) {
        this.f2386a.getTransformedBoundingBox(view, true, this.f2388c);
        return this.f2388c.bottom;
    }

    /* renamed from: m */
    public final int mo2850m(View view) {
        this.f2386a.getTransformedBoundingBox(view, true, this.f2388c);
        return this.f2388c.top;
    }

    /* renamed from: n */
    public final void mo2851n(int i) {
        this.f2386a.offsetChildrenVertical(i);
    }
}
