package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.widget.SeekBar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.ap */
/* compiled from: PG */
final class C132469ap implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C132471ar f361566a;

    public C132469ap(C132471ar arVar) {
        this.f361566a = arVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f361566a.f361568a.f361586a.mo110707i(C62948a.m95459j((long) seekBar.getProgress()));
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
