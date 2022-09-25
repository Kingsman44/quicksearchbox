package androidx.media3.exoplayer.hls.p148a;

import android.net.Uri;

/* renamed from: androidx.media3.exoplayer.hls.a.c */
/* compiled from: PG */
public final /* synthetic */ class C3135c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3136d f9225a;

    /* renamed from: b */
    public final /* synthetic */ Uri f9226b;

    public /* synthetic */ C3135c(C3136d dVar, Uri uri) {
        this.f9225a = dVar;
        this.f9226b = uri;
    }

    public final void run() {
        C3136d dVar = this.f9225a;
        Uri uri = this.f9226b;
        dVar.f9232f = false;
        dVar.mo7138d(uri);
    }
}
