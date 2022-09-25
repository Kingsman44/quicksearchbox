package androidx.mediarouter.app;

import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;

/* renamed from: androidx.mediarouter.app.y */
/* compiled from: PG */
final class C3788y extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C3758ad f12214d;

    public C3788y(C3758ad adVar) {
        this.f12214d = adVar;
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        C3758ad adVar = this.f12214d;
        adVar.f12089F = playbackStateCompat;
        adVar.mo7968q(false);
    }

    /* renamed from: i */
    public final void mo1010i() {
        C3758ad adVar = this.f12214d;
        C0320v vVar = adVar.f12087D;
        if (vVar != null) {
            vVar.mo1041i(adVar.f12088E);
            this.f12214d.f12087D = null;
        }
    }

    /* renamed from: d */
    public final void mo1005d(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat mediaDescriptionCompat;
        C3758ad adVar = this.f12214d;
        if (mediaMetadataCompat == null) {
            mediaDescriptionCompat = null;
        } else {
            mediaDescriptionCompat = mediaMetadataCompat.mo819d();
        }
        adVar.f12090G = mediaDescriptionCompat;
        this.f12214d.mo7969s();
        this.f12214d.mo7968q(false);
    }
}
