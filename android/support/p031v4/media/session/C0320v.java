package android.support.p031v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.v */
/* compiled from: PG */
public final class C0320v {

    /* renamed from: a */
    public final C0311m f1044a;

    /* renamed from: b */
    public final MediaSessionCompat.Token f1045b;

    /* renamed from: c */
    private final ConcurrentHashMap f1046c = new ConcurrentHashMap();

    public C0320v(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f1045b = token;
            this.f1044a = new MediaControllerCompat$MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: a */
    public final int mo1033a() {
        return this.f1044a.mo858a();
    }

    /* renamed from: b */
    public final int mo1034b() {
        return this.f1044a.mo859b();
    }

    /* renamed from: c */
    public final PendingIntent mo1035c() {
        return this.f1044a.mo860c();
    }

    /* renamed from: d */
    public final MediaMetadataCompat mo1036d() {
        return this.f1044a.mo862e();
    }

    /* renamed from: e */
    public final C0315q mo1037e() {
        return this.f1044a.mo863f();
    }

    /* renamed from: f */
    public final PlaybackStateCompat mo1038f() {
        return this.f1044a.mo864g();
    }

    /* renamed from: g */
    public final String mo1039g() {
        return this.f1044a.mo865h();
    }

    /* renamed from: h */
    public final void mo1040h(C0310l lVar, Handler handler) {
        if (lVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f1046c.putIfAbsent(lVar, true) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            if (handler == null) {
                handler = new Handler();
            }
            lVar.mo1015n(handler);
            this.f1044a.mo867j(lVar, handler);
        }
    }

    /* renamed from: i */
    public final void mo1041i(C0310l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f1046c.remove(lVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
        } else {
            try {
                this.f1044a.mo868k(lVar);
            } finally {
                lVar.mo1015n((Handler) null);
            }
        }
    }

    public C0320v(Context context, MediaSessionCompat mediaSessionCompat) {
        MediaSessionCompat.Token token = ((C0286ac) mediaSessionCompat.f982b).f1014b;
        this.f1045b = token;
        this.f1044a = new C0313o(context, token);
    }
}
