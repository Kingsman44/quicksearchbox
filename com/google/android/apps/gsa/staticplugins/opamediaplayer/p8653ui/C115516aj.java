package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115475s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115476t;
import com.google.android.material.bottomsheet.C44555f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.aj */
/* compiled from: PG */
final class C115516aj extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C115520an f320382a;

    public C115516aj(C115520an anVar) {
        this.f320382a = anVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        C115519am amVar = this.f320382a.f320406f;
        if (amVar.f320385a.getVisibility() == 8) {
            amVar.mo102064a();
        }
        amVar.f320385a.setAlpha(f);
        double d = (double) f;
        if (d < 0.5d) {
            float f2 = 1.0f - (f + f);
            this.f320382a.f320420t.setVisibility(0);
            this.f320382a.f320414n.setVisibility(0);
            this.f320382a.f320420t.setAlpha(f2);
            this.f320382a.f320414n.setAlpha(f2);
            this.f320382a.f320421u.setVisibility(8);
            this.f320382a.f320415o.setVisibility(8);
            return;
        }
        this.f320382a.f320420t.setVisibility(8);
        this.f320382a.f320414n.setVisibility(8);
        Double.isNaN(d);
        float f3 = (float) (d - 8.0d);
        float f4 = f3 + f3;
        this.f320382a.f320421u.setVisibility(0);
        this.f320382a.f320415o.setVisibility(0);
        this.f320382a.f320421u.setAlpha(f4);
        this.f320382a.f320415o.setAlpha(f4);
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        this.f320382a.mo102076r();
        C115534ba baVar = (C115534ba) this.f320382a.f320405e;
        if (baVar.mo102079a()) {
            C115475s sVar = baVar.f320470a;
            Bundle bundle = new Bundle();
            bundle.putInt("state", Integer.valueOf(i).intValue());
            ((C115476t) sVar).f320326a.mo28345s("onPlaybackPanelStateChanged_int", "PlaybackPanelEventsDispatcher", bundle);
        }
    }
}
