package com.google.android.apps.gsa.staticplugins.p8043n;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.e */
/* compiled from: PG */
public final /* synthetic */ class C102875e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102889s f287316a;

    public /* synthetic */ C102875e(C102889s sVar) {
        this.f287316a = sVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102889s sVar = this.f287316a;
        MediaPlayer mediaPlayer = (MediaPlayer) obj;
        try {
            sVar.f287335h = sVar.f287332c.isSpeakerphoneOn();
            AudioManager audioManager = sVar.f287332c;
            if (audioManager != null) {
                audioManager.setSpeakerphoneOn(true);
            }
            mediaPlayer.reset();
            mediaPlayer.setDataSource(sVar.f287331b, Uri.parse(sVar.f287334g));
            mediaPlayer.prepare();
            mediaPlayer.start();
            sVar.mo93524k(mediaPlayer, 2);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C102889s.f287330a.mo56226d()).mo56382g(e)).mo56372aa(14039)).mo56386p("MediaPlayer fails to play audio uri.");
        }
    }
}
