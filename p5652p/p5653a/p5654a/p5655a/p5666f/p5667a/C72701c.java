package p5652p.p5653a.p5654a.p5655a.p5666f.p5667a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: p.a.a.a.f.a.c */
/* compiled from: PG */
final class C72701c extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ C72703e f193313a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72701c(C72703e eVar, Context context) {
        super(context);
        this.f193313a = eVar;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        C72703e eVar = this.f193313a;
        if (!eVar.f193322j) {
            eVar.f193320h = 0;
            eVar.f193319g = 0;
            for (int i4 = 0; i4 < eVar.f193316a.getChildCount(); i4++) {
                View childAt = eVar.f193316a.getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                if (i4 < eVar.f193318c) {
                    eVar.f193320h += measuredHeight;
                }
                eVar.f193319g += measuredHeight;
            }
            C72703e eVar2 = this.f193313a;
            if (eVar2.f193321i) {
                i3 = eVar2.f193319g;
            } else {
                i3 = eVar2.f193320h;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }
}
