package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.graphics.Bitmap;
import android.widget.SeekBar;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.p */
/* compiled from: PG */
final class C139118p implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ Bitmap f378343a;

    /* renamed from: b */
    final /* synthetic */ SeekBar f378344b;

    /* renamed from: c */
    final /* synthetic */ SeekBar f378345c;

    /* renamed from: d */
    final /* synthetic */ C139120r f378346d;

    public C139118p(C139120r rVar, Bitmap bitmap, SeekBar seekBar, SeekBar seekBar2) {
        this.f378346d = rVar;
        this.f378343a = bitmap;
        this.f378344b = seekBar;
        this.f378345c = seekBar2;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f378346d.mo114741b(C139120r.m225980a(this.f378343a, i, this.f378344b.getMax()), this.f378345c);
        this.f378346d.mo114742c(C139120r.m225980a(this.f378346d.f378355f, this.f378345c.getProgress(), this.f378345c.getMax()));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
