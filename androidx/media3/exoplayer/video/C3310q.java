package androidx.media3.exoplayer.video;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2632t;
import androidx.media3.exoplayer.C2837bg;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C2848br;

/* renamed from: androidx.media3.exoplayer.video.q */
/* compiled from: PG */
public final /* synthetic */ class C3310q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3319z f10001a;

    /* renamed from: b */
    public final /* synthetic */ Object f10002b;

    /* renamed from: c */
    public final /* synthetic */ long f10003c;

    public /* synthetic */ C3310q(C3319z zVar, Object obj, long j) {
        this.f10001a = zVar;
        this.f10002b = obj;
        this.f10003c = j;
    }

    public final void run() {
        C3319z zVar = this.f10001a;
        Object obj = this.f10002b;
        C2845bo boVar = zVar.f10025b;
        int i = C2612ak.f7249a;
        boVar.f7944a.f7994f.mo6389X(obj);
        C2848br brVar = boVar.f7944a;
        if (brVar.f8007t == obj) {
            C2632t tVar = brVar.f7992d;
            tVar.mo6204c(26, C2837bg.f7934a);
            tVar.mo6203b();
        }
    }
}
