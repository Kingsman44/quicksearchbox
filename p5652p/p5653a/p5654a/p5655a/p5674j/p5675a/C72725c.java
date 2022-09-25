package p5652p.p5653a.p5654a.p5655a.p5674j.p5675a;

import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;

/* renamed from: p.a.a.a.j.a.c */
/* compiled from: PG */
final class C72725c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C72727e f193375a;

    public C72725c(C72727e eVar) {
        this.f193375a = eVar;
    }

    public final void onGlobalLayout() {
        if (((NestedScrollView) this.f193375a.f56305p).getScrollY() == 0) {
            C72727e eVar = this.f193375a;
            ((NestedScrollView) eVar.f56305p).scrollTo(0, (int) Math.round(eVar.f193378a.f14688d));
        }
    }
}
