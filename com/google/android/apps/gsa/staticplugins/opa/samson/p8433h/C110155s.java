package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.widget.SeekBar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.s */
/* compiled from: PG */
final class C110155s implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C110161y f306926a;

    public C110155s(C110161y yVar) {
        this.f306926a = yVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        MediaController mediaController = this.f306926a.f306936D;
        if (mediaController == null) {
            C59104x d = C110161y.f306932a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaCtl");
            ((C59052c) ((C59052c) d).mo56372aa(25762)).mo56386p("onProgressChanged(): null controller");
            return;
        }
        PlaybackState playbackState = mediaController.getPlaybackState();
        if (playbackState == null) {
            C59104x d2 = C110161y.f306932a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaCtl");
            ((C59052c) ((C59052c) d2).mo56372aa(25761)).mo56386p("onProgressChanged(): null playbackstate");
        } else if (C110161y.m183451n(playbackState.getActions(), 256) && z) {
            C58976aa aaVar = C58975e.f156826a;
            MediaController mediaController2 = this.f306926a.f306936D;
            mediaController2.getClass();
            mediaController2.getTransportControls().seekTo((long) i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
