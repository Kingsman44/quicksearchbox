package androidx.media3.exoplayer.p138b;

import android.os.Handler;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C3004h;

/* renamed from: androidx.media3.exoplayer.b.p */
/* compiled from: PG */
public final class C2820p {

    /* renamed from: a */
    public final Handler f7869a;

    /* renamed from: b */
    public final C2845bo f7870b;

    public C2820p(Handler handler, C2845bo boVar) {
        this.f7869a = boVar == null ? null : handler;
        this.f7870b = boVar;
    }

    /* renamed from: a */
    public final void mo6562a(C3004h hVar) {
        hVar.mo6936a();
        Handler handler = this.f7869a;
        if (handler != null) {
            handler.post(new C2811g(this, hVar));
        }
    }
}
