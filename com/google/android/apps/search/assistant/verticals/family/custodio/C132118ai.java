package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.p4479cg.C58077i;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ai */
/* compiled from: PG */
public final /* synthetic */ class C132118ai implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132123an f360637a;

    public /* synthetic */ C132118ai(C132123an anVar) {
        this.f360637a = anVar;
    }

    public final void onClick(View view) {
        C132123an anVar = this.f360637a;
        anVar.mo110489g();
        C46496q c = anVar.f360648d.mo50482c(anVar.f360646b);
        Bundle bundle = new Bundle(anVar.f360647c);
        ArrayList arrayList = new ArrayList();
        for (C58077i number : anVar.mo110484a()) {
            arrayList.add(Integer.valueOf(number.getNumber()));
        }
        bundle.putIntegerArrayList("downtime_days", arrayList);
        bundle.putBoolean("custom_downtime_dayoption", ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(anVar.f360655k)).f360521a == R.id.assistant_custodio_downtime_day_picker_fragment_customize_radio);
        c.mo50508d(R.id.assistant_custodio_downtime_day_picker_fragment_next, bundle);
    }
}
