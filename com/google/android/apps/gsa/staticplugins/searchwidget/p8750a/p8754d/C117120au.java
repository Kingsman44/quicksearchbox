package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.widget.SeekBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.au */
/* compiled from: PG */
final class C117120au implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C117121av f325144a;

    public C117120au(C117121av avVar) {
        this.f325144a = avVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C117121av avVar = this.f325144a;
        if (!avVar.f325146b) {
            avVar.f63126Q.mo28345s("VALUE_CHANGED", "ALPHA_SELECT", avVar.mo103157g());
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
