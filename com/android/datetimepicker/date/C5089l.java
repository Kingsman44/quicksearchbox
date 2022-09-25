package com.android.datetimepicker.date;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.android.datetimepicker.C5069d;

/* renamed from: com.android.datetimepicker.date.l */
/* compiled from: PG */
public final class C5089l extends C5069d {

    /* renamed from: a */
    public DatePickerDialog.OnDateSetListener f16239a;

    /* renamed from: b */
    public long f16240b = -1;

    /* renamed from: c */
    public long f16241c = -1;

    /* renamed from: d */
    public int f16242d = -1;

    public final Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog.OnDateSetListener onDateSetListener = this.f16239a;
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C5084g) {
            onDateSetListener = new C5083f((C5084g) targetFragment);
        }
        return C5082e.m13955a(getActivity(), getArguments(), bundle, this.f16242d, this.f16240b, this.f16241c, onDateSetListener);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C5082e.m13957c(bundle, this.f16240b, this.f16241c, this.f16242d);
    }
}
