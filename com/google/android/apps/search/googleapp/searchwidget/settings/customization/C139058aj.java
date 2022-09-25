package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.widget.SeekBar;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.aj */
/* compiled from: PG */
final class C139058aj implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C139059ak f378203a;

    public C139058aj(C139059ak akVar) {
        this.f378203a = akVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C139059ak akVar = this.f378203a;
        C139070av avVar = (C139070av) akVar.f378210g.toBuilder();
        avVar.copyOnWrite();
        C139080be beVar = (C139080be) avVar.instance;
        beVar.f378250a |= 2;
        beVar.f378252c = C139059ak.m225878a(i + 102);
        akVar.f378210g = (C139080be) avVar.build();
        akVar.f378208e.mo114666a(akVar.f378210g);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
