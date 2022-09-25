package androidx.media;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.p031v4.media.session.C0306h;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.core.app.C1826m;

/* renamed from: androidx.media.n */
/* compiled from: PG */
final class C2437n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MediaSessionCompat.Token f6726a;

    /* renamed from: b */
    final /* synthetic */ C2441r f6727b;

    public C2437n(C2441r rVar, MediaSessionCompat.Token token) {
        this.f6727b = rVar;
        this.f6726a = token;
    }

    public final void run() {
        C2441r rVar = this.f6727b;
        MediaSessionCompat.Token token = this.f6726a;
        if (!rVar.f6732a.isEmpty()) {
            C0306h extraBinder = token.getExtraBinder();
            if (extraBinder != null) {
                for (Bundle b : rVar.f6732a) {
                    C1826m.m5005b(b, "extra_session_binder", extraBinder.asBinder());
                }
            }
            rVar.f6732a.clear();
        }
        rVar.f6733b.setSessionToken((MediaSession.Token) token.getToken());
    }
}
