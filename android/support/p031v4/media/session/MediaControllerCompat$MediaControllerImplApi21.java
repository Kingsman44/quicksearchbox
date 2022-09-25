package android.support.p031v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
/* compiled from: PG */
class MediaControllerCompat$MediaControllerImplApi21 implements C0311m {

    /* renamed from: a */
    protected final MediaController f975a;

    /* renamed from: b */
    final Object f976b = new Object();

    /* renamed from: c */
    public final List f977c = new ArrayList();

    /* renamed from: d */
    public final HashMap f978d = new HashMap();

    /* renamed from: e */
    final MediaSessionCompat.Token f979e;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* compiled from: PG */
    class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a */
        private WeakReference f980a;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super((Handler) null);
            this.f980a = new WeakReference(mediaControllerCompat$MediaControllerImplApi21);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[Catch:{ RemoteException -> 0x009c }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006f A[Catch:{ RemoteException -> 0x009c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceiveResult(int r7, android.os.Bundle r8) {
            /*
                r6 = this;
                java.lang.ref.WeakReference r7 = r6.f980a
                java.lang.Object r7 = r7.get()
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r7 = (android.support.p031v4.media.session.MediaControllerCompat$MediaControllerImplApi21) r7
                if (r7 == 0) goto L_0x00ae
                if (r8 != 0) goto L_0x000e
                goto L_0x00ae
            L_0x000e:
                java.lang.Object r0 = r7.f976b
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r7.f979e     // Catch:{ all -> 0x00ab }
                java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                android.os.IBinder r2 = androidx.core.app.C1826m.m5004a(r8, r2)     // Catch:{ all -> 0x00ab }
                r3 = 0
                if (r2 != 0) goto L_0x001e
                r4 = r3
                goto L_0x0032
            L_0x001e:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                android.os.IInterface r4 = r2.queryLocalInterface(r4)     // Catch:{ all -> 0x00ab }
                if (r4 == 0) goto L_0x002d
                boolean r5 = r4 instanceof android.support.p031v4.media.session.C0306h     // Catch:{ all -> 0x00ab }
                if (r5 == 0) goto L_0x002d
                android.support.v4.media.session.h r4 = (android.support.p031v4.media.session.C0306h) r4     // Catch:{ all -> 0x00ab }
                goto L_0x0032
            L_0x002d:
                android.support.v4.media.session.e r4 = new android.support.v4.media.session.e     // Catch:{ all -> 0x00ab }
                r4.<init>(r2)     // Catch:{ all -> 0x00ab }
            L_0x0032:
                r1.setExtraBinder(r4)     // Catch:{ all -> 0x00ab }
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r7.f979e     // Catch:{ all -> 0x00ab }
                java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2"
                android.os.Parcelable r8 = r8.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0062 }
                android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ RuntimeException -> 0x0062 }
                if (r8 != 0) goto L_0x0042
                goto L_0x0062
            L_0x0042:
                java.lang.Class<androidx.versionedparcelable.b> r2 = androidx.versionedparcelable.C4263b.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ RuntimeException -> 0x0062 }
                r8.setClassLoader(r2)     // Catch:{ RuntimeException -> 0x0062 }
                java.lang.String r2 = "a"
                android.os.Parcelable r8 = r8.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0062 }
                boolean r2 = r8 instanceof androidx.versionedparcelable.ParcelImpl     // Catch:{ RuntimeException -> 0x0062 }
                if (r2 == 0) goto L_0x005a
                androidx.versionedparcelable.ParcelImpl r8 = (androidx.versionedparcelable.ParcelImpl) r8     // Catch:{ RuntimeException -> 0x0062 }
                androidx.versionedparcelable.f r8 = r8.f13772a     // Catch:{ RuntimeException -> 0x0062 }
                goto L_0x0063
            L_0x005a:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0062 }
                java.lang.String r2 = "Invalid parcel"
                r8.<init>(r2)     // Catch:{ RuntimeException -> 0x0062 }
                throw r8     // Catch:{ RuntimeException -> 0x0062 }
            L_0x0062:
                r8 = r3
            L_0x0063:
                r1.setSession2Token(r8)     // Catch:{ all -> 0x00ab }
                android.support.v4.media.session.MediaSessionCompat$Token r8 = r7.f979e     // Catch:{ all -> 0x00ab }
                android.support.v4.media.session.h r8 = r8.getExtraBinder()     // Catch:{ all -> 0x00ab }
                if (r8 != 0) goto L_0x006f
                goto L_0x00a9
            L_0x006f:
                java.util.List r8 = r7.f977c     // Catch:{ all -> 0x00ab }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00ab }
            L_0x0075:
                boolean r1 = r8.hasNext()     // Catch:{ all -> 0x00ab }
                if (r1 == 0) goto L_0x00a4
                java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x00ab }
                android.support.v4.media.session.l r1 = (android.support.p031v4.media.session.C0310l) r1     // Catch:{ all -> 0x00ab }
                android.support.v4.media.session.n r2 = new android.support.v4.media.session.n     // Catch:{ all -> 0x00ab }
                r2.<init>(r1)     // Catch:{ all -> 0x00ab }
                java.util.HashMap r4 = r7.f978d     // Catch:{ all -> 0x00ab }
                r4.put(r1, r2)     // Catch:{ all -> 0x00ab }
                r1.f1042c = r2     // Catch:{ all -> 0x00ab }
                android.support.v4.media.session.MediaSessionCompat$Token r4 = r7.f979e     // Catch:{ RemoteException -> 0x009c }
                android.support.v4.media.session.h r4 = r4.getExtraBinder()     // Catch:{ RemoteException -> 0x009c }
                r4.mo965u(r2)     // Catch:{ RemoteException -> 0x009c }
                r2 = 13
                r1.mo1014m(r2, r3, r3)     // Catch:{ all -> 0x00ab }
                goto L_0x0075
            L_0x009c:
                r8 = move-exception
                java.lang.String r1 = "MediaControllerCompat"
                java.lang.String r2 = "Dead object in registerCallback."
                android.util.Log.e(r1, r2, r8)     // Catch:{ all -> 0x00ab }
            L_0x00a4:
                java.util.List r7 = r7.f977c     // Catch:{ all -> 0x00ab }
                r7.clear()     // Catch:{ all -> 0x00ab }
            L_0x00a9:
                monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                return
            L_0x00ab:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                throw r7
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.media.session.MediaControllerCompat$MediaControllerImplApi21.ExtraBinderRequestResultReceiver.onReceiveResult(int, android.os.Bundle):void");
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        this.f979e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.getToken());
        this.f975a = mediaController;
        if (token.getExtraBinder() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    /* renamed from: a */
    public final int mo858a() {
        return this.f975a.getRatingType();
    }

    /* renamed from: b */
    public final int mo859b() {
        if (this.f979e.getExtraBinder() == null) {
            return -1;
        }
        try {
            return this.f979e.getExtraBinder().mo947c();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e);
            return -1;
        }
    }

    /* renamed from: c */
    public final PendingIntent mo860c() {
        return this.f975a.getSessionActivity();
    }

    /* renamed from: d */
    public final Bundle mo861d() {
        return this.f975a.getExtras();
    }

    /* renamed from: e */
    public final MediaMetadataCompat mo862e() {
        MediaMetadata metadata = this.f975a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.m601e(metadata);
        }
        return null;
    }

    /* renamed from: f */
    public final C0315q mo863f() {
        return new C0319u(this.f975a.getTransportControls());
    }

    /* renamed from: g */
    public final PlaybackStateCompat mo864g() {
        if (this.f979e.getExtraBinder() != null) {
            try {
                return this.f979e.getExtraBinder().mo954j();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = this.f975a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.m665a(playbackState);
        }
        return null;
    }

    /* renamed from: h */
    public final String mo865h() {
        return this.f975a.getPackageName();
    }

    /* renamed from: i */
    public final List mo866i() {
        List<MediaSession.QueueItem> queue = this.f975a.getQueue();
        if (queue != null) {
            return MediaSessionCompat.QueueItem.m664a(queue);
        }
        return null;
    }

    /* renamed from: j */
    public final void mo867j(C0310l lVar, Handler handler) {
        this.f975a.registerCallback(lVar.f1040a, handler);
        synchronized (this.f976b) {
            if (this.f979e.getExtraBinder() != null) {
                C0312n nVar = new C0312n(lVar);
                this.f978d.put(lVar, nVar);
                lVar.f1042c = nVar;
                try {
                    this.f979e.getExtraBinder().mo965u(nVar);
                    lVar.mo1014m(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                lVar.f1042c = null;
                this.f977c.add(lVar);
            }
        }
    }

    /* renamed from: k */
    public final void mo868k(C0310l lVar) {
        this.f975a.unregisterCallback(lVar.f1040a);
        synchronized (this.f976b) {
            if (this.f979e.getExtraBinder() != null) {
                try {
                    C0312n nVar = (C0312n) this.f978d.remove(lVar);
                    if (nVar != null) {
                        lVar.f1042c = null;
                        this.f979e.getExtraBinder().mo968x(nVar);
                    }
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.f977c.remove(lVar);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo869l() {
        return this.f979e.getExtraBinder() != null;
    }
}
