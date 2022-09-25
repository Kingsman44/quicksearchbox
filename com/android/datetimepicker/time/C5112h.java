package com.android.datetimepicker.time;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import com.android.datetimepicker.C5066a;

/* renamed from: com.android.datetimepicker.time.h */
/* compiled from: PG */
public final class C5112h extends C5066a {

    /* renamed from: a */
    public TimePickerDialog.OnTimeSetListener f16303a;

    public final Dialog onCreateDialog(Bundle bundle) {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f16303a;
        getTargetFragment();
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        return new C5111g(activity, onTimeSetListener, arguments.getInt("hour"), arguments.getInt("minute"), arguments.getBoolean("24hour"));
    }
}
