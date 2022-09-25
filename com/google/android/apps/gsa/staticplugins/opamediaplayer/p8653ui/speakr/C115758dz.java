package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.app.Activity;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.dz */
/* compiled from: PG */
public final /* synthetic */ class C115758dz implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321026a;

    public /* synthetic */ C115758dz(C115791fe feVar) {
        this.f321026a = feVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115791fe feVar = this.f321026a;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        feVar.f321114y = axVar;
        if (axVar.mo56113h()) {
            C115466j jVar = (C115466j) axVar.mo56107c();
            boolean z = false;
            if (feVar.f321209c.mo56113h()) {
                Activity activity = (Activity) feVar.f321209c.mo56107c();
                boolean z2 = (activity.getWindow().getAttributes().flags & 128) == 128;
                boolean z3 = jVar.f320310e;
                if (z3 && !z2) {
                    activity.getWindow().addFlags(128);
                } else if (!z3 && z2) {
                    activity.getWindow().clearFlags(128);
                }
            }
            if (!feVar.f321109t) {
                boolean z4 = jVar.f320309d;
                int i = z4 ? R.integer.omp_play_toggle_level_paused : R.integer.omp_play_toggle_level_playing;
                int i2 = true != z4 ? R.string.omp_pause : R.string.omp_play;
                feVar.f321103n.setImageLevel(feVar.f321208b.getResources().getInteger(i));
                feVar.f321103n.setContentDescription(feVar.f321208b.getResources().getString(i2));
                ImageView imageView = feVar.f321103n;
                if (feVar.f321111v || feVar.f321075G.get()) {
                    z = true;
                }
                imageView.setEnabled(z);
                feVar.f321102m.setEnabled(jVar.f320316k);
                feVar.mo102251h();
                feVar.mo102260q();
            }
        }
    }
}
