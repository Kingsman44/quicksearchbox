package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.C44732bd;

/* renamed from: com.google.android.material.timepicker.a */
/* compiled from: PG */
final class C44966a extends C44732bd {

    /* renamed from: a */
    final /* synthetic */ ChipTextInputComboView f117527a;

    public C44966a(ChipTextInputComboView chipTextInputComboView) {
        this.f117527a = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            ChipTextInputComboView chipTextInputComboView = this.f117527a;
            chipTextInputComboView.f117470a.setText(TimeModel.m79949c(chipTextInputComboView.getResources(), "00", "%02d"));
            return;
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f117527a;
        chipTextInputComboView2.f117470a.setText(TimeModel.m79949c(chipTextInputComboView2.getResources(), editable, "%02d"));
    }
}
