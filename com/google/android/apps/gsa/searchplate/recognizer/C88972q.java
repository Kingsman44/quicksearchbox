package com.google.android.apps.gsa.searchplate.recognizer;

import android.view.View;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.q */
/* compiled from: PG */
final class C88972q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RecognizerView f241109a;

    public C88972q(RecognizerView recognizerView) {
        this.f241109a = recognizerView;
    }

    public final void onClick(View view) {
        RecognizerView recognizerView = this.f241109a;
        C88893c cVar = recognizerView.f241021c;
        if (cVar != null) {
            int i = recognizerView.f241022d;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            cVar.mo17639i();
                            return;
                        } else if (i != 10) {
                            return;
                        }
                    }
                }
                cVar.mo17640j();
                return;
            }
            cVar.mo17631a();
        }
    }
}
