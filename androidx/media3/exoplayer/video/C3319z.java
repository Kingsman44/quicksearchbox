package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C2658bt;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C3004h;

/* renamed from: androidx.media3.exoplayer.video.z */
/* compiled from: PG */
public final class C3319z {

    /* renamed from: a */
    public final Handler f10024a;

    /* renamed from: b */
    public final C2845bo f10025b;

    public C3319z(Handler handler, C2845bo boVar) {
        this.f10024a = boVar == null ? null : handler;
        this.f10025b = boVar;
    }

    /* renamed from: a */
    public final void mo7308a(C3004h hVar) {
        hVar.mo6936a();
        Handler handler = this.f10024a;
        if (handler != null) {
            handler.post(new C3314u(this, hVar));
        }
    }

    /* renamed from: b */
    public final void mo7309b(Object obj) {
        if (this.f10024a != null) {
            this.f10024a.post(new C3310q(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: c */
    public final void mo7310c(C2658bt btVar) {
        Handler handler = this.f10024a;
        if (handler != null) {
            handler.post(new C3317x(this, btVar));
        }
    }
}
