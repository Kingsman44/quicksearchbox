package androidx.media3.exoplayer.p150j;

import android.media.Spatializer;
import android.os.Handler;

/* renamed from: androidx.media3.exoplayer.j.u */
/* compiled from: PG */
public final class C3225u {

    /* renamed from: a */
    public final Spatializer f9691a;

    /* renamed from: b */
    public final boolean f9692b;

    /* renamed from: c */
    public Handler f9693c;

    /* renamed from: d */
    public Spatializer.OnSpatializerStateChangedListener f9694d;

    public C3225u(Spatializer spatializer) {
        this.f9691a = spatializer;
        this.f9692b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
