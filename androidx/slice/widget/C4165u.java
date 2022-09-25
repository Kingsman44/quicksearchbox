package androidx.slice.widget;

import android.widget.RatingBar;

/* renamed from: androidx.slice.widget.u */
/* compiled from: PG */
final class C4165u implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C4168x f13432a;

    public C4165u(C4168x xVar) {
        this.f13432a = xVar;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        C4168x xVar = this.f13432a;
        xVar.f13478k = Math.round(f + ((float) xVar.f13479l));
        long currentTimeMillis = System.currentTimeMillis();
        C4168x xVar2 = this.f13432a;
        long j = xVar2.f13477j;
        if (j != 0 && currentTimeMillis - j > 200) {
            xVar2.f13475h = false;
            xVar2.f13476i.removeCallbacks(xVar2.f13481n);
            this.f13432a.mo8764a();
        } else if (!xVar2.f13475h) {
            xVar2.f13475h = true;
            xVar2.f13476i.postDelayed(xVar2.f13481n, 200);
        }
    }
}
