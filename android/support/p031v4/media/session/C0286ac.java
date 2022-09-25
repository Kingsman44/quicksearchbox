package android.support.p031v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.versionedparcelable.C4267f;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.ac */
/* compiled from: PG */
public class C0286ac implements C0284aa {

    /* renamed from: a */
    public final MediaSession f1013a;

    /* renamed from: b */
    public final MediaSessionCompat.Token f1014b;

    /* renamed from: c */
    final Object f1015c = new Object();

    /* renamed from: d */
    boolean f1016d = false;

    /* renamed from: e */
    final RemoteCallbackList f1017e = new RemoteCallbackList();

    /* renamed from: f */
    PlaybackStateCompat f1018f;

    /* renamed from: g */
    List f1019g;

    /* renamed from: h */
    MediaMetadataCompat f1020h;

    /* renamed from: i */
    int f1021i;

    /* renamed from: j */
    int f1022j;

    /* renamed from: k */
    C0324z f1023k;

    public C0286ac(Context context, String str) {
        MediaSession e = mo971e(context, str);
        this.f1013a = e;
        this.f1014b = new MediaSessionCompat.Token(e.getSessionToken(), new C0285ab(this), (C4267f) null);
        mo920d();
    }

    /* renamed from: a */
    public final C0324z mo917a() {
        C0324z zVar;
        synchronized (this.f1015c) {
            zVar = this.f1023k;
        }
        return zVar;
    }

    /* renamed from: b */
    public final void mo918b(C0324z zVar, Handler handler) {
        MediaSession.Callback callback;
        synchronized (this.f1015c) {
            this.f1023k = zVar;
            MediaSession mediaSession = this.f1013a;
            C0322x xVar = null;
            if (zVar == null) {
                callback = null;
            } else {
                callback = zVar.f1050b;
            }
            mediaSession.setCallback(callback, handler);
            if (zVar != null) {
                synchronized (zVar.f1049a) {
                    zVar.f1051c = new WeakReference(this);
                    C0322x xVar2 = zVar.f1052d;
                    if (xVar2 != null) {
                        xVar2.removeCallbacksAndMessages((Object) null);
                    }
                    if (handler != null) {
                        xVar = new C0322x(zVar, handler.getLooper());
                    }
                    zVar.f1052d = xVar;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo919c() {
        synchronized (this.f1015c) {
        }
    }

    /* renamed from: d */
    public final void mo920d() {
        this.f1013a.setFlags(3);
    }

    /* renamed from: e */
    public MediaSession mo971e(Context context, String str) {
        return new MediaSession(context, str);
    }
}
