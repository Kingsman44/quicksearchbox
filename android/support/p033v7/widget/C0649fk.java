package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.fk */
/* compiled from: PG */
final class C0649fk implements C0753jg {

    /* renamed from: a */
    final /* synthetic */ C0653fo f2414a;

    public C0649fk(C0653fo foVar) {
        this.f2414a = foVar;
    }

    /* renamed from: a */
    public final int mo2899a(View view) {
        return this.f2414a.getDecoratedRight(view) + ((C0654fp) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: b */
    public final int mo2900b(View view) {
        return this.f2414a.getDecoratedLeft(view) - ((C0654fp) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: c */
    public final int mo2901c() {
        return this.f2414a.getWidth() - this.f2414a.getPaddingRight();
    }

    /* renamed from: d */
    public final int mo2902d() {
        return this.f2414a.getPaddingLeft();
    }

    /* renamed from: e */
    public final View mo2903e(int i) {
        return this.f2414a.getChildAt(i);
    }
}
