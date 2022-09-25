package android.support.p033v7.widget.p041a;

import android.animation.Animator;
import android.support.p033v7.widget.C0673gh;
import android.view.View;

/* renamed from: android.support.v7.widget.a.c */
/* compiled from: PG */
final class C0493c extends C0499i {

    /* renamed from: a */
    final /* synthetic */ int f1978a;

    /* renamed from: b */
    final /* synthetic */ C0673gh f1979b;

    /* renamed from: c */
    final /* synthetic */ C0502l f1980c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0493c(C0502l lVar, C0673gh ghVar, int i, float f, float f2, float f3, float f4, int i2, C0673gh ghVar2) {
        super(ghVar, i, f, f2, f3, f4);
        this.f1980c = lVar;
        this.f1978a = i2;
        this.f1979b = ghVar2;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.f1998n) {
            if (this.f1978a <= 0) {
                C0502l lVar = this.f1980c;
                lVar.f2014j.mo2441d(lVar.f2017m, this.f1979b);
            } else {
                this.f1980c.f2005a.add(this.f1979b.itemView);
                this.f1995k = true;
                if (this.f1978a > 0) {
                    C0502l lVar2 = this.f1980c;
                    lVar2.f2017m.post(new C0494d(lVar2, this));
                }
            }
            C0502l lVar3 = this.f1980c;
            View view = lVar3.f2020p;
            View view2 = this.f1979b.itemView;
            if (view == view2) {
                lVar3.mo2466i(view2);
            }
        }
    }
}
