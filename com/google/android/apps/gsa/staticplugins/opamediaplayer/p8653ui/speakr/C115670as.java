package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.app.Activity;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.as */
/* compiled from: PG */
public final /* synthetic */ class C115670as implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320862a;

    public /* synthetic */ C115670as(C115711cf cfVar) {
        this.f320862a = cfVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115711cf cfVar = this.f320862a;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        cfVar.f320953x = axVar;
        if (axVar.mo56113h()) {
            C115466j jVar = (C115466j) axVar.mo56107c();
            boolean z = false;
            if (cfVar.f321209c.mo56113h()) {
                Activity activity = (Activity) cfVar.f321209c.mo56107c();
                boolean z2 = (activity.getWindow().getAttributes().flags & 128) == 128;
                boolean z3 = jVar.f320310e;
                if (z3 && !z2) {
                    activity.getWindow().addFlags(128);
                } else if (!z3 && z2) {
                    activity.getWindow().clearFlags(128);
                }
            }
            if (!cfVar.f320946q) {
                boolean z4 = jVar.f320309d;
                int i = z4 ? R.integer.omp_play_toggle_level_paused : R.integer.omp_play_toggle_level_playing;
                int i2 = true != z4 ? R.string.omp_pause : R.string.omp_play;
                cfVar.f320942m.setImageLevel(cfVar.f321208b.getResources().getInteger(i));
                cfVar.f320942m.setContentDescription(cfVar.f321208b.getResources().getString(i2));
                ImageView imageView = cfVar.f320942m;
                if (cfVar.f320950u || cfVar.f320913A.get()) {
                    z = true;
                }
                imageView.setEnabled(z);
                cfVar.f320941l.setEnabled(jVar.f320316k);
                cfVar.mo102208h();
                cfVar.mo102217q();
            }
        }
    }
}
