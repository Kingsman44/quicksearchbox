package androidx.media3.exoplayer;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p137a.C2727bp;
import androidx.media3.exoplayer.p137a.C2731bt;

/* renamed from: androidx.media3.exoplayer.be */
/* compiled from: PG */
final class C2835be {
    /* renamed from: a */
    public static C2731bt m7795a(Context context, C2848br brVar, boolean z) {
        C2727bp z2 = C2727bp.m7521z(context);
        if (z2 == null) {
            C2633u.m7050e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new C2731bt(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            brVar.mo6462M(z2);
        }
        return new C2731bt(z2.f7579a.getSessionId());
    }
}
