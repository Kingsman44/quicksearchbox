package com.android.datetimepicker.time;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.android.datetimepicker.time.g */
/* compiled from: PG */
final class C5111g extends TimePickerDialog {
    public C5111g(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, boolean z) {
        super(context, onTimeSetListener, i, i2, z);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            super.onClick(dialogInterface, i);
        } else {
            cancel();
        }
    }
}
