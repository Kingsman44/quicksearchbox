package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.p142e.C2988r;
import androidx.media3.exoplayer.p142e.C2989s;

/* renamed from: androidx.media3.exoplayer.video.c */
/* compiled from: PG */
public final class C3296c extends C2988r {
    public C3296c(Throwable th, C2989s sVar, Surface surface) {
        super(th, sVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
