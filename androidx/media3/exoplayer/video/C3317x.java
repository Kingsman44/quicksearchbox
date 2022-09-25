package androidx.media3.exoplayer.video;

import androidx.media3.common.C2658bt;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2632t;
import androidx.media3.exoplayer.C2844bn;
import androidx.media3.exoplayer.C2845bo;

/* renamed from: androidx.media3.exoplayer.video.x */
/* compiled from: PG */
public final /* synthetic */ class C3317x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3319z f10020a;

    /* renamed from: b */
    public final /* synthetic */ C2658bt f10021b;

    public /* synthetic */ C3317x(C3319z zVar, C2658bt btVar) {
        this.f10020a = zVar;
        this.f10021b = btVar;
    }

    public final void run() {
        C3319z zVar = this.f10020a;
        C2658bt btVar = this.f10021b;
        C2845bo boVar = zVar.f10025b;
        int i = C2612ak.f7249a;
        C2632t tVar = boVar.f7944a.f7992d;
        tVar.mo6204c(25, new C2844bn(btVar));
        tVar.mo6203b();
    }
}
