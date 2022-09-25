package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.media.MediaPlayer;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ag */
/* compiled from: PG */
final class C14667ag implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    final /* synthetic */ C14668ah f44290a;

    public C14667ag(C14668ah ahVar) {
        this.f44290a = ahVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f44290a.f44295e.get() < 4) {
            mediaPlayer.start();
            this.f44290a.f44295e.incrementAndGet();
            return;
        }
        C59104x d = C14668ah.f44291a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LowConnectivity");
        ((C59052c) ((C59052c) d).mo56372aa(45360)).mo56386p("Think ring playing reaches MAX_PLAY_TIME.");
    }
}
