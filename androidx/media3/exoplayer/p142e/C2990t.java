package androidx.media3.exoplayer.p142e;

import android.media.metrics.LogSessionId;
import androidx.media3.exoplayer.p137a.C2731bt;

/* renamed from: androidx.media3.exoplayer.e.t */
/* compiled from: PG */
final class C2990t {
    /* renamed from: a */
    public static void m8468a(C2985o oVar, C2731bt btVar) {
        LogSessionId a = btVar.mo6450a();
        if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            oVar.f8580b.setString("log-session-id", a.getStringId());
        }
    }
}
