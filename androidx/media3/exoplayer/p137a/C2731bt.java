package androidx.media3.exoplayer.p137a;

import android.media.metrics.LogSessionId;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.a.bt */
/* compiled from: PG */
public final class C2731bt {

    /* renamed from: a */
    private final C2730bs f7607a;

    static {
        if (C2612ak.f7249a < 31) {
            new C2731bt();
        } else {
            int i = C2730bs.f7605b;
        }
    }

    public C2731bt() {
        this.f7607a = null;
        C2601a.m6832d(C2612ak.f7249a < 31);
    }

    /* renamed from: a */
    public final LogSessionId mo6450a() {
        C2730bs bsVar = this.f7607a;
        bsVar.getClass();
        return bsVar.f7606a;
    }

    public C2731bt(LogSessionId logSessionId) {
        this.f7607a = new C2730bs(logSessionId);
    }
}
