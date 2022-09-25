package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.view.ViewTreeObserver;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.aa */
/* compiled from: PG */
final class C102394aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C102395ab f285777a;

    public C102394aa(C102395ab abVar) {
        this.f285777a = abVar;
    }

    public final void onGlobalLayout() {
        if (!C102416f.m169821g()) {
            C102395ab abVar = this.f285777a;
            int i = abVar.f285786i;
            if (i == 1 || i == 9) {
                int height = abVar.f285783f.getHeight();
                C102395ab abVar2 = this.f285777a;
                if (abVar2.f285787j != height) {
                    int height2 = abVar2.f285780c.getHeight();
                    int i2 = this.f285777a.f285782e.getLayoutParams().height;
                    int dimensionPixelSize = this.f285777a.f285785h.getResources().getDimensionPixelSize(R.dimen.dialog_plate_logo_view_size);
                    C102395ab abVar3 = this.f285777a;
                    int i3 = abVar3.f285779b;
                    if (i3 + height > height2 - dimensionPixelSize) {
                        int i4 = abVar3.f285778a;
                        if (i2 != i4) {
                            C102416f.m169819e(abVar3.f285785h, abVar3.f285782e, abVar3.f285780c, i3 - i4);
                        }
                    } else if (i2 != i3) {
                        C102416f.m169819e(abVar3.f285785h, abVar3.f285782e, abVar3.f285780c, 0);
                    }
                    this.f285777a.f285787j = height;
                }
            }
        }
    }
}
