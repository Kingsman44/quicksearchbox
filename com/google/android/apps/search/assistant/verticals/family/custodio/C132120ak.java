package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ak */
/* compiled from: PG */
public final /* synthetic */ class C132120ak implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C132123an f360639a;

    /* renamed from: b */
    public final /* synthetic */ CompoundButton f360640b;

    /* renamed from: c */
    public final /* synthetic */ View f360641c;

    public /* synthetic */ C132120ak(C132123an anVar, CompoundButton compoundButton, View view) {
        this.f360639a = anVar;
        this.f360640b = compoundButton;
        this.f360641c = view;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C132123an anVar = this.f360639a;
        CompoundButton compoundButton2 = this.f360640b;
        View view = this.f360641c;
        if (compoundButton.equals(compoundButton2)) {
            if (z) {
                view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkboxes_container).setVisibility(0);
            } else {
                view.findViewById(R.id.assistant_custodio_downtime_day_picker_fragment_checkboxes_container).setVisibility(8);
                return;
            }
        } else if (!z) {
            return;
        }
        anVar.mo110489g();
    }
}
