package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.datepicker.q */
/* compiled from: PG */
final class C44644q extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C44649v f116309a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44644q(C44649v vVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f116309a = vVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        String str;
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        if (this.f116309a.f116324g.getVisibility() == 0) {
            str = this.f116309a.getString(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.f116309a.getString(R.string.mtrl_picker_toggle_to_day_selection);
        }
        kVar.f5921a.setHintText(str);
    }
}
