package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8645a.C115179h;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23257b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.q */
/* compiled from: PG */
public final class C115473q implements C23113i {

    /* renamed from: a */
    private final C115471o f320325a;

    public C115473q(C115471o oVar) {
        this.f320325a = oVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("MediaPlayerEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onAlertDismissed")) {
                this.f320325a.mo101875e();
            } else if (str.equals("onFastForward")) {
                ((C115179h) this.f320325a).mo101886q(C84269i.FAST_FORWARD);
            } else if (str.equals("onMediaItemSelected_int")) {
                this.f320325a.mo101877h(Integer.valueOf(pVar.f63472a.getInt("index")).intValue());
            } else if (str.equals("onPlaybackSpeedChanged_float")) {
                this.f320325a.mo101878i(Float.valueOf(pVar.f63472a.getFloat("newSpeed")).floatValue());
            } else if (str.equals("onRewind")) {
                ((C115179h) this.f320325a).mo101886q(C84269i.REWIND);
            } else if (str.equals("onSeekTo_long")) {
                this.f320325a.mo101880k(Long.valueOf(pVar.f63472a.getLong("seekPositionMillis")).longValue());
            } else if (str.equals("onSendFeedback_byte[]")) {
                this.f320325a.mo101881l(C23257b.m43596e("screenshot", pVar));
            } else if (str.equals("onShowInfo_int")) {
                this.f320325a.mo101882m(Integer.valueOf(pVar.f63472a.getInt("index")).intValue());
            } else if (str.equals("onShowPlaylist")) {
                this.f320325a.mo101883n();
            } else if (str.equals("onSkipNext")) {
                ((C115179h) this.f320325a).mo101886q(C84269i.PLAY_NEXT);
            } else if (str.equals("onTogglePlayPause")) {
                this.f320325a.mo101885p();
            }
        }
    }
}
