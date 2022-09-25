package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.ab */
/* compiled from: PG */
final class C44606ab implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44608ad f116207a;

    public C44606ab(C44608ad adVar) {
        this.f116207a = adVar;
    }

    public final void onClick(View view) {
        C44608ad adVar = this.f116207a;
        adVar.f116216d.setEnabled(adVar.mo47840a().mo47805g());
        this.f116207a.f116215c.toggle();
        C44608ad adVar2 = this.f116207a;
        adVar2.mo47843d(adVar2.f116215c);
        this.f116207a.mo47841b();
    }
}
