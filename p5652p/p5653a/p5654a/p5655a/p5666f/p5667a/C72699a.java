package p5652p.p5653a.p5654a.p5655a.p5666f.p5667a;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: p.a.a.a.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C72699a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C72703e f193311a;

    public /* synthetic */ C72699a(C72703e eVar) {
        this.f193311a = eVar;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        C72703e eVar = this.f193311a;
        boolean z = !eVar.f193321i;
        eVar.f193321i = z;
        if (z) {
            i = eVar.f193320h;
        } else {
            i = eVar.f193319g;
        }
        if (z) {
            i2 = eVar.f193319g;
        } else {
            i2 = eVar.f193320h;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C72700b(eVar));
        ofInt.addListener(new C72702d(eVar, z));
        ofInt.setDuration(300);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.start();
        eVar.f193317b.animate().rotation(true != eVar.f193321i ? 0.0f : 180.0f);
    }
}
