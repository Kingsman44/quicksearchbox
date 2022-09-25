package androidx.mediarouter.p175a;

import android.media.AudioAttributes;
import android.support.p031v4.media.session.C0284aa;
import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media.C2423au;

/* renamed from: androidx.mediarouter.a.ak */
/* compiled from: PG */
final class C3675ak {

    /* renamed from: a */
    public final MediaSessionCompat f11808a;

    /* renamed from: b */
    public C2423au f11809b;

    /* renamed from: c */
    final /* synthetic */ C3679ao f11810c;

    public C3675ak(C3679ao aoVar, MediaSessionCompat mediaSessionCompat) {
        this.f11810c = aoVar;
        this.f11808a = mediaSessionCompat;
    }

    /* renamed from: a */
    public final void mo7729a() {
        MediaSessionCompat mediaSessionCompat = this.f11808a;
        int i = this.f11810c.f11829k.f11954d;
        C0284aa aaVar = mediaSessionCompat.f982b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((C0286ac) aaVar).f1013a.setPlaybackToLocal(builder.build());
        this.f11809b = null;
    }
}
