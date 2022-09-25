package androidx.media3.exoplayer.p138b;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.media3.exoplayer.p137a.C2731bt;

/* renamed from: androidx.media3.exoplayer.b.ab */
/* compiled from: PG */
final class C2785ab {
    /* renamed from: a */
    public static void m7651a(AudioTrack audioTrack, C2731bt btVar) {
        LogSessionId a = btVar.mo6450a();
        if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(a);
        }
    }
}
