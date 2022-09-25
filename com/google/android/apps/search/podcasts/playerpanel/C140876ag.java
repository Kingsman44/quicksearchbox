package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import android.widget.SeekBar;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.ag */
/* compiled from: PG */
public final class C140876ag implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C140879aj f382544a;

    public C140876ag(C140879aj ajVar) {
        this.f382544a = ajVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C69664n.m101061g(seekBar, "seekBar");
        if (z) {
            C140879aj ajVar = this.f382544a;
            if (!ajVar.f382560m) {
                ajVar.mo115981d();
            }
            C140879aj ajVar2 = this.f382544a;
            View requireView = ajVar2.f382548a.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            ajVar2.mo115982e(requireView);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        C69664n.m101061g(seekBar, "seekBar");
        this.f382544a.f382560m = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C69664n.m101061g(seekBar, "seekBar");
        C140879aj ajVar = this.f382544a;
        ajVar.f382560m = false;
        ajVar.mo115981d();
    }
}
