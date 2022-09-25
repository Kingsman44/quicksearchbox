package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.jh */
/* compiled from: PG */
final class C0754jh {

    /* renamed from: a */
    final C0753jg f2636a;

    /* renamed from: b */
    final C0752jf f2637b = new C0752jf();

    public C0754jh(C0753jg jgVar) {
        this.f2636a = jgVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo3261a(int i, int i2, int i3, int i4) {
        int d = this.f2636a.mo2902d();
        int c = this.f2636a.mo2901c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = this.f2636a.mo2903e(i);
            this.f2637b.mo3259a(d, c, this.f2636a.mo2900b(e), this.f2636a.mo2899a(e));
            C0752jf jfVar = this.f2637b;
            jfVar.f2631a = i3;
            if (jfVar.mo3260b()) {
                return e;
            }
            if (i4 != 0) {
                jfVar.f2631a = i4;
                if (jfVar.mo3260b()) {
                    view = e;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo3262b(View view) {
        this.f2637b.mo3259a(this.f2636a.mo2902d(), this.f2636a.mo2901c(), this.f2636a.mo2900b(view), this.f2636a.mo2899a(view));
        C0752jf jfVar = this.f2637b;
        jfVar.f2631a = 24579;
        return jfVar.mo3260b();
    }
}
