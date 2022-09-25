package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.os.Bundle;
import android.widget.RadioGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bm */
/* compiled from: PG */
final class C117139bm implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ C117140bn f325202a;

    public C117139bm(C117140bn bnVar) {
        this.f325202a = bnVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2;
        if (!this.f325202a.f325204b) {
            Bundle bundle = new Bundle();
            int checkedRadioButtonId = this.f325202a.f325203a.getCheckedRadioButtonId();
            if (checkedRadioButtonId == R.id.shape_2dp) {
                i2 = 0;
            } else if (checkedRadioButtonId == R.id.shape_8dp) {
                i2 = 1;
            } else if (checkedRadioButtonId == R.id.shape_24dp) {
                i2 = 2;
            } else {
                throw new IllegalArgumentException("No valid shape button selected");
            }
            bundle.putInt("BAR_RADIUS", i2);
            this.f325202a.f63126Q.mo28345s("UPDATE_BAR_RADIUS", "UPDATE_BAR_RADIUS", bundle);
        }
    }
}
