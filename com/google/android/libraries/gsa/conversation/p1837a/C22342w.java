package com.google.android.libraries.gsa.conversation.p1837a;

import android.media.AudioManager;
import android.media.MediaPlayer;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.gsa.conversation.a.w */
/* compiled from: PG */
final class C22342w implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C22343x f61677a;

    public C22342w(C22343x xVar) {
        this.f61677a = xVar;
    }

    public final void onAudioFocusChange(int i) {
        synchronized (this.f61677a.f61680c) {
            if (i == -3 || i == -2) {
                C22343x xVar = this.f61677a;
                MediaPlayer mediaPlayer = xVar.f61682e;
                if (mediaPlayer != null && xVar.f61684g) {
                    mediaPlayer.pause();
                    C22343x xVar2 = this.f61677a;
                    xVar2.f61684g = false;
                    xVar2.f61685h = true;
                }
            } else if (i == -1) {
                C2164c cVar = this.f61677a.f61683f;
                if (cVar != null) {
                    cVar.mo5439d(new IllegalStateException("Audio focus lost"));
                }
                this.f61677a.mo27568a();
            } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                C22343x xVar3 = this.f61677a;
                if (xVar3.f61685h) {
                    xVar3.f61685h = false;
                    MediaPlayer mediaPlayer2 = xVar3.f61682e;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.start();
                        this.f61677a.f61684g = true;
                    }
                }
            } else {
                ((C59052c) ((C59052c) C22343x.f61678a.mo56226d()).mo56372aa(48237)).mo56387q("Unexpected focusChange in playMp3: %d", i);
            }
        }
    }
}
