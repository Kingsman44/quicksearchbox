package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4575r.C60745b;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ao */
/* compiled from: PG */
final class C132126ao implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f360660a;

    public C132126ao(View view) {
        this.f360660a = view;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!z) {
            View view = this.f360660a;
            if (C60745b.m92717b(((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_0)).isChecked(), ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_1)).isChecked(), ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_2)).isChecked(), ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_3)).isChecked(), ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_4)).isChecked(), ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_5)).isChecked(), ((CompoundButton) view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkbox_6)).isChecked()) <= 0) {
                compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                compoundButton.setChecked(true);
                compoundButton.setOnCheckedChangeListener(this);
            }
        }
    }
}
