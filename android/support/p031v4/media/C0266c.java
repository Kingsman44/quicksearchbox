package android.support.p031v4.media;

import android.media.browse.MediaBrowser;

/* renamed from: android.support.v4.media.c */
/* compiled from: PG */
final class C0266c extends MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    final /* synthetic */ C0268e f953a;

    public C0266c(C0268e eVar) {
        this.f953a = eVar;
    }

    public final void onConnected() {
        C0267d dVar = this.f953a.f955b;
        if (dVar != null) {
            dVar.mo837a();
        }
        this.f953a.mo839a();
    }

    public final void onConnectionFailed() {
        this.f953a.mo840b();
    }

    public final void onConnectionSuspended() {
        C0267d dVar = this.f953a.f955b;
        if (dVar != null) {
            dVar.mo838b();
        }
        this.f953a.mo841c();
    }
}
