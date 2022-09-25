package com.google.android.material.button;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.button.e */
/* compiled from: PG */
final class C44575e extends C2061c {

    /* renamed from: a */
    final /* synthetic */ MaterialButtonToggleGroup f116014a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44575e(MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f116014a = materialButtonToggleGroup;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f116014a;
        if (view instanceof MaterialButton) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < materialButtonToggleGroup.getChildCount()) {
                    if (materialButtonToggleGroup.getChildAt(i2) == view) {
                        i = i3;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.mo47575c(i2)) {
                        i3++;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            kVar.mo5155d(C1990j.m5333a(0, 1, i, 1, false, ((MaterialButton) view).f115973f));
        }
        i = -1;
        kVar.mo5155d(C1990j.m5333a(0, 1, i, 1, false, ((MaterialButton) view).f115973f));
    }
}
