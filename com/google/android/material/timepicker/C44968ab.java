package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.timepicker.ab */
/* compiled from: PG */
final class C44968ab extends C44978b {

    /* renamed from: a */
    final /* synthetic */ TimeModel f117529a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44968ab(Context context, TimeModel timeModel) {
        super(context, R.string.material_hour_selection);
        this.f117529a = timeModel;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setContentDescription(view.getResources().getString(this.f117529a.mo48628a(), new Object[]{String.valueOf(this.f117529a.mo48629b())}));
    }
}
