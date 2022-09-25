package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.C44732bd;

/* renamed from: com.google.android.material.timepicker.y */
/* compiled from: PG */
final class C45001y extends C44732bd {

    /* renamed from: a */
    final /* synthetic */ C44970ad f117600a;

    public C45001y(C44970ad adVar) {
        this.f117600a = adVar;
    }

    public final void afterTextChanged(Editable editable) {
        try {
            if (TextUtils.isEmpty(editable)) {
                this.f117600a.f117531a.f117515e = 0;
                return;
            }
            this.f117600a.f117531a.f117515e = Integer.parseInt(editable.toString()) % 60;
        } catch (NumberFormatException unused) {
        }
    }
}
