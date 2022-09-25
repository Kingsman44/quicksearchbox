package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.widget.SeekBar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.o */
/* compiled from: PG */
final class C129216o implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C129217p f354936a;

    /* renamed from: b */
    private int f354937b = -1;

    /* renamed from: c */
    private final String f354938c;

    public C129216o(C129217p pVar, String str) {
        this.f354936a = pVar;
        this.f354938c = str;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f354937b = i;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f354937b;
        if (i >= 0) {
            this.f354936a.f354942d.mo108897e(i, this.f354938c);
        }
    }
}
