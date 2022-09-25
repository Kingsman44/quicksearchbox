package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.material.timepicker.ag */
/* compiled from: PG */
final class C44973ag extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ TimePickerView f117543a;

    public C44973ag(TimePickerView timePickerView) {
        this.f117543a = timePickerView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C44975ai aiVar = this.f117543a.f117525h;
        boolean z = false;
        if (aiVar == null) {
            return false;
        }
        C44989m mVar = (C44989m) aiVar;
        mVar.f117558e = 1;
        mVar.mo48655c(mVar.f117557d);
        C44970ad adVar = mVar.f117556c;
        adVar.f117532b.setChecked(adVar.f117531a.f117516f == 12);
        ChipTextInputComboView chipTextInputComboView = adVar.f117533c;
        if (adVar.f117531a.f117516f == 10) {
            z = true;
        }
        chipTextInputComboView.setChecked(z);
        return true;
    }
}
