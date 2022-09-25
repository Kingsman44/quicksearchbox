package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104436am;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104437an;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.b.h */
/* compiled from: PG */
public final /* synthetic */ class C104847h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104850k f292186a;

    /* renamed from: b */
    public final /* synthetic */ View f292187b;

    /* renamed from: c */
    public final /* synthetic */ C104436am f292188c;

    public /* synthetic */ C104847h(C104850k kVar, View view, C104436am amVar) {
        this.f292186a = kVar;
        this.f292187b = view;
        this.f292188c = amVar;
    }

    public final void onClick(View view) {
        C104850k kVar = this.f292186a;
        View view2 = this.f292187b;
        C104436am amVar = this.f292188c;
        kVar.mo94374a();
        boolean isChecked = ((Switch) view2.findViewById(R.id.domain_switch)).isChecked();
        Bundle bundle = new Bundle();
        bundle.putBoolean("update", Boolean.valueOf(!isChecked).booleanValue());
        ((C104437an) amVar).f290566a.mo28345s("updateUserSettings_boolean", "WhyThisAdEventsDispatcher", bundle);
    }
}
