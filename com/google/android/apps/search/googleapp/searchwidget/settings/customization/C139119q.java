package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.widget.SeekBar;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.q */
/* compiled from: PG */
final class C139119q implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SeekBar f378347a;

    /* renamed from: b */
    final /* synthetic */ C139120r f378348b;

    public C139119q(C139120r rVar, SeekBar seekBar) {
        this.f378348b = rVar;
        this.f378347a = seekBar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f378348b.mo114742c(C139120r.m225980a(this.f378348b.f378355f, i, this.f378347a.getMax()));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
