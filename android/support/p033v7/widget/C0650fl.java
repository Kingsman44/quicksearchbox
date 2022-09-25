package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.fl */
/* compiled from: PG */
final class C0650fl implements C0753jg {

    /* renamed from: a */
    final /* synthetic */ C0653fo f2415a;

    public C0650fl(C0653fo foVar) {
        this.f2415a = foVar;
    }

    /* renamed from: a */
    public final int mo2899a(View view) {
        return this.f2415a.getDecoratedBottom(view) + ((C0654fp) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: b */
    public final int mo2900b(View view) {
        return this.f2415a.getDecoratedTop(view) - ((C0654fp) view.getLayoutParams()).topMargin;
    }

    /* renamed from: c */
    public final int mo2901c() {
        return this.f2415a.getHeight() - this.f2415a.getPaddingBottom();
    }

    /* renamed from: d */
    public final int mo2902d() {
        return this.f2415a.getPaddingTop();
    }

    /* renamed from: e */
    public final View mo2903e(int i) {
        return this.f2415a.getChildAt(i);
    }
}
