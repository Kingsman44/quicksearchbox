package com.android.datetimepicker.date;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;
import com.android.datetimepicker.C5066a;

/* renamed from: com.android.datetimepicker.date.e */
/* compiled from: PG */
public final class C5082e extends C5066a {

    /* renamed from: a */
    public DatePickerDialog.OnDateSetListener f16232a;

    /* renamed from: b */
    public long f16233b = -1;

    /* renamed from: c */
    public long f16234c = -1;

    /* renamed from: d */
    public int f16235d = -1;

    /* renamed from: a */
    static Dialog m13955a(Context context, Bundle bundle, Bundle bundle2, int i, long j, long j2, DatePickerDialog.OnDateSetListener onDateSetListener) {
        long j3;
        long j4;
        int i2;
        Bundle bundle3 = bundle;
        Bundle bundle4 = bundle2;
        int i3 = bundle.getInt("year");
        int i4 = bundle.getInt("month");
        int i5 = bundle.getInt("day");
        if (bundle4 != null) {
            i2 = bundle2.getInt("first_day_of_week");
            j4 = bundle2.getLong("min_date");
            j3 = bundle2.getLong("max_date");
        } else {
            i2 = i;
            j4 = j;
            j3 = j2;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, onDateSetListener, i3, i4, i5);
        DatePicker datePicker = datePickerDialog.getDatePicker();
        if (j4 != -1) {
            datePicker.setMinDate(j4);
        }
        if (j3 != -1) {
            datePicker.setMaxDate(j3);
        }
        if (i2 != -1) {
            datePicker.setFirstDayOfWeek(i2);
        }
        return datePickerDialog;
    }

    /* renamed from: b */
    public static Bundle m13956b(int i, int i2, int i3) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("year", i);
        bundle.putInt("month", i2);
        bundle.putInt("day", i3);
        return bundle;
    }

    /* renamed from: c */
    static void m13957c(Bundle bundle, long j, long j2, int i) {
        bundle.putLong("min_date", j);
        bundle.putLong("max_date", j2);
        bundle.putInt("first_day_of_week", i);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog.OnDateSetListener onDateSetListener = this.f16232a;
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C5084g) {
            onDateSetListener = new C5083f((C5084g) targetFragment);
        }
        return m13955a(getActivity(), getArguments(), bundle, this.f16235d, this.f16233b, this.f16234c, onDateSetListener);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m13957c(bundle, this.f16233b, this.f16234c, this.f16235d);
    }
}
