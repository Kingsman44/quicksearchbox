package android.support.p031v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.i */
/* compiled from: PG */
final class C0307i extends MediaController.Callback {

    /* renamed from: a */
    private final WeakReference f1036a;

    public C0307i(C0310l lVar) {
        this.f1036a = new WeakReference(lVar);
    }

    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = AudioAttributesCompat.f6633b;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            lVar.mo1001a(new C0314p());
        }
    }

    public final void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.m652b(bundle);
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null) {
            lVar.mo1004c(bundle);
        }
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null) {
            lVar.mo1005d(MediaMetadataCompat.m601e(mediaMetadata));
        }
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null && lVar.f1042c == null) {
            lVar.mo1006e(PlaybackStateCompat.m665a(playbackState));
        }
    }

    public final void onQueueChanged(List list) {
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null) {
            lVar.mo1007f(MediaSessionCompat.QueueItem.m664a(list));
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null) {
            lVar.mo1008g(charSequence);
        }
    }

    public final void onSessionDestroyed() {
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null) {
            lVar.mo1010i();
        }
    }

    public final void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.m652b(bundle);
        C0310l lVar = (C0310l) this.f1036a.get();
        if (lVar != null) {
            lVar.mo1011j(str, bundle);
        }
    }
}
