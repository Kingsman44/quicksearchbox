package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115630f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115632h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115633i;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.PlaybackSpeedSelector;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.o */
/* compiled from: PG */
public final /* synthetic */ class C115607o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115520an f320700a;

    public /* synthetic */ C115607o(C115520an anVar) {
        this.f320700a = anVar;
    }

    public final void onClick(View view) {
        C115520an anVar = this.f320700a;
        if (anVar.f320423w.getCurrentView() != anVar.f320425y) {
            anVar.f320423w.showNext();
            PlaybackSpeedSelector playbackSpeedSelector = anVar.f320426z;
            C115633i iVar = new C115633i(Float.valueOf(((Float) ((C115530ax) anVar.f320402b).f320456d.f63720e).floatValue()));
            C115632h hVar = playbackSpeedSelector.f320785a;
            int i = C115632h.f320774e;
            hVar.postDelayed(new C115630f(hVar, iVar), 50);
        }
        C2043bi.m5551ae(anVar.f320410j, 4);
    }
}
