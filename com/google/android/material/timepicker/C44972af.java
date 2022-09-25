package com.google.android.material.timepicker;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.timepicker.af */
/* compiled from: PG */
final class C44972af implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TimePickerView f117542a;

    public C44972af(TimePickerView timePickerView) {
        this.f117542a = timePickerView;
    }

    public final void onClick(View view) {
        C44977ak akVar = this.f117542a.f117524g;
        if (akVar != null) {
            ((C44997u) akVar).mo48665e(((Integer) view.getTag(R.id.selection_type)).intValue(), true);
        }
    }
}
