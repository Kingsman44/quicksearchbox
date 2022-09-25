package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.timepicker.t */
/* compiled from: PG */
final class C44996t extends C44978b {

    /* renamed from: a */
    final /* synthetic */ C44997u f117586a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44996t(C44997u uVar, Context context) {
        super(context, R.string.material_minute_selection);
        this.f117586a = uVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, new Object[]{String.valueOf(this.f117586a.f117591b.f117515e)}));
    }
}
