package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.C44732bd;

/* renamed from: com.google.android.material.timepicker.z */
/* compiled from: PG */
final class C45002z extends C44732bd {

    /* renamed from: a */
    final /* synthetic */ C44970ad f117601a;

    public C45002z(C44970ad adVar) {
        this.f117601a = adVar;
    }

    public final void afterTextChanged(Editable editable) {
        try {
            if (TextUtils.isEmpty(editable)) {
                this.f117601a.f117531a.mo48630d(0);
                return;
            }
            this.f117601a.f117531a.mo48630d(Integer.parseInt(editable.toString()));
        } catch (NumberFormatException unused) {
        }
    }
}
