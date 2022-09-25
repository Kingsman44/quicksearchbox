package androidx.media3.exoplayer.p138b;

import android.os.Handler;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C2851bu;

/* renamed from: androidx.media3.exoplayer.b.ap */
/* compiled from: PG */
final class C2799ap {

    /* renamed from: a */
    final /* synthetic */ C2800aq f7770a;

    public C2799ap(C2800aq aqVar) {
        this.f7770a = aqVar;
    }

    /* renamed from: a */
    public final void mo6502a(Exception exc) {
        C2633u.m7048c("MediaCodecAudioRenderer", C2633u.m7046a("Audio sink error", exc));
        C2820p pVar = this.f7770a.f7771f;
        Handler handler = pVar.f7869a;
        if (handler != null) {
            handler.post(new C2816l(pVar, exc));
        }
    }

    /* renamed from: b */
    public final void mo6503b() {
        C2851bu buVar = this.f7770a.f7773h;
        if (buVar != null) {
            buVar.f8016a.f8070a.mo6170i(2);
        }
    }
}
