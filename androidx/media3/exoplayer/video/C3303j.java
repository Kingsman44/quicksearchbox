package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.video.j */
/* compiled from: PG */
final class C3303j {
    /* renamed from: a */
    public static void m9593a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            C2633u.m7048c("VideoFrameReleaseHelper", C2633u.m7046a("Failed to call Surface.setFrameRate", e));
        }
    }
}
