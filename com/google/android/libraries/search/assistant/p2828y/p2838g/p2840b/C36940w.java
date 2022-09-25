package com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.y.g.b.w */
/* compiled from: PG */
final class C36940w extends MediaController.Callback {

    /* renamed from: a */
    final MediaController f96195a;

    /* renamed from: b */
    final /* synthetic */ C36942y f96196b;

    public C36940w(C36942y yVar, MediaController mediaController) {
        this.f96196b = yVar;
        this.f96195a = mediaController;
    }

    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        C59071e eVar = C36942y.f96199a;
        C36942y yVar = this.f96196b;
        yVar.f96202d.mo40465b(yVar.f96201c);
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        C59071e eVar = C36942y.f96199a;
        if (mediaMetadata != null) {
            C36942y yVar = this.f96196b;
            yVar.f96202d.mo40465b(yVar.f96201c);
        }
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C59071e eVar = C36942y.f96199a;
        if (playbackState != null) {
            C36942y yVar = this.f96196b;
            yVar.f96202d.mo40465b(yVar.f96201c);
        }
    }

    public final void onQueueChanged(List list) {
        C59071e eVar = C36942y.f96199a;
        if (list != null) {
            C36942y yVar = this.f96196b;
            yVar.f96202d.mo40465b(yVar.f96201c);
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        C59071e eVar = C36942y.f96199a;
        if (charSequence != null) {
            C36942y yVar = this.f96196b;
            yVar.f96202d.mo40465b(yVar.f96201c);
        }
    }

    public final void onSessionDestroyed() {
        C59071e eVar = C36942y.f96199a;
        C36942y yVar = this.f96196b;
        yVar.f96202d.mo40465b(yVar.f96201c);
        this.f96195a.unregisterCallback(this);
        this.f96196b.f96200b.remove(new C36941x(this.f96195a));
    }
}
