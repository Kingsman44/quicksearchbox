package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.timepicker.s */
/* compiled from: PG */
final class C44995s extends C44978b {

    /* renamed from: a */
    final /* synthetic */ C44997u f117585a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44995s(C44997u uVar, Context context) {
        super(context, R.string.material_hour_selection);
        this.f117585a = uVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setContentDescription(view.getResources().getString(this.f117585a.f117591b.mo48628a(), new Object[]{String.valueOf(this.f117585a.f117591b.mo48629b())}));
    }
}
