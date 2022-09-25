package android.support.p031v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.mediarouter.p175a.C3668ad;
import androidx.versionedparcelable.C4267f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* compiled from: PG */
public final class MediaSessionCompat {

    /* renamed from: a */
    static int f981a;

    /* renamed from: b */
    public final C0284aa f982b;

    /* renamed from: c */
    public final C0320v f983c;

    /* renamed from: d */
    private final ArrayList f984d = new ArrayList();

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* compiled from: PG */
    final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0292ai();

        /* renamed from: a */
        ResultReceiver f988a;

        public ResultReceiverWrapper(Parcel parcel) {
            this.f988a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f988a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* compiled from: PG */
    public final class Token implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0293aj();
        private C0306h mExtraBinder;
        private final Object mInner;
        private final Object mLock;
        private C4267f mSession2Token;

        public Token(Object obj) {
            this(obj, (C0306h) null, (C4267f) null);
        }

        public Token(Object obj, C0306h hVar, C4267f fVar) {
            this.mLock = new Object();
            this.mInner = obj;
            this.mExtraBinder = hVar;
            this.mSession2Token = null;
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, (C0306h) null);
        }

        public static Token fromToken(Object obj, C0306h hVar) {
            if (obj != null) {
                return new Token(obj, hVar);
            }
            return null;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.mInner;
            if (obj2 == null) {
                return token.mInner == null;
            }
            Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public C0306h getExtraBinder() {
            C0306h hVar;
            synchronized (this.mLock) {
                hVar = this.mExtraBinder;
            }
            return hVar;
        }

        public C4267f getSession2Token() {
            C4267f fVar;
            synchronized (this.mLock) {
                fVar = this.mSession2Token;
            }
            return fVar;
        }

        public Object getToken() {
            return this.mInner;
        }

        public int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void setExtraBinder(C0306h hVar) {
            synchronized (this.mLock) {
                this.mExtraBinder = hVar;
            }
        }

        public void setSession2Token(C4267f fVar) {
            synchronized (this.mLock) {
                this.mSession2Token = fVar;
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }

        public Token(Object obj, C0306h hVar) {
            this(obj, hVar, (C4267f) null);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        ComponentName componentName2;
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ResolveInfo resolveInfo = queryBroadcastReceivers.get(0);
                    componentName2 = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                } else {
                    componentName2 = null;
                    if (queryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                }
                componentName = componentName2;
                if (componentName == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            C0289af afVar = new C0289af(context, str);
            this.f982b = afVar;
            mo873e(new C0321w(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            afVar.f1013a.setMediaButtonReceiver(pendingIntent);
            this.f983c = new C0320v(context, this);
            if (f981a == 0) {
                f981a = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    /* renamed from: a */
    public static Bundle m651a(Bundle bundle) {
        m652b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: b */
    public static void m652b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: c */
    public final void mo871c() {
        C0286ac acVar = (C0286ac) this.f982b;
        acVar.f1016d = true;
        acVar.f1017e.kill();
        acVar.f1013a.setCallback((MediaSession.Callback) null);
        acVar.f1013a.release();
    }

    /* renamed from: d */
    public final void mo872d(boolean z) {
        ((C0286ac) this.f982b).f1013a.setActive(z);
        ArrayList arrayList = this.f984d;
        if (arrayList.size() > 0) {
            C3668ad adVar = (C3668ad) arrayList.get(0);
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo873e(C0324z zVar, Handler handler) {
        if (zVar == null) {
            this.f982b.mo918b((C0324z) null, (Handler) null);
            return;
        }
        C0284aa aaVar = this.f982b;
        if (handler == null) {
            handler = new Handler();
        }
        aaVar.mo918b(zVar, handler);
    }

    /* renamed from: f */
    public final void mo874f(Bundle bundle) {
        ((C0286ac) this.f982b).f1013a.setExtras(bundle);
    }

    /* renamed from: h */
    public final void mo876h(PlaybackStateCompat playbackStateCompat) {
        PlaybackState playbackState;
        C0284aa aaVar = this.f982b;
        C0286ac acVar = (C0286ac) aaVar;
        acVar.f1018f = playbackStateCompat;
        synchronized (acVar.f1015c) {
            int beginBroadcast = ((C0286ac) aaVar).f1017e.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((C0302d) ((C0286ac) aaVar).f1017e.getBroadcastItem(beginBroadcast)).mo909e(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            ((C0286ac) aaVar).f1017e.finishBroadcast();
        }
        MediaSession mediaSession = acVar.f1013a;
        if (playbackStateCompat == null) {
            playbackState = null;
        } else {
            if (playbackStateCompat.f1005l == null) {
                PlaybackState.Builder i = C0296am.m750i();
                C0296am.m765x(i, playbackStateCompat.f994a, playbackStateCompat.f995b, playbackStateCompat.f997d, playbackStateCompat.f1001h);
                C0296am.m762u(i, playbackStateCompat.f996c);
                C0296am.m760s(i, playbackStateCompat.f998e);
                C0296am.m763v(i, playbackStateCompat.f1000g);
                for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f1002i) {
                    PlaybackState.CustomAction customAction2 = customAction.f1010e;
                    if (customAction2 == null) {
                        PlaybackState.CustomAction.Builder j = C0296am.m751j(customAction.f1006a, customAction.f1007b, customAction.f1008c);
                        C0296am.m764w(j, customAction.f1009d);
                        customAction2 = C0296am.m752k(j);
                    }
                    C0296am.m759r(i, customAction2);
                }
                C0296am.m761t(i, playbackStateCompat.f1003j);
                C0297an.m767b(i, playbackStateCompat.f1004k);
                playbackStateCompat.f1005l = C0296am.m753l(i);
            }
            playbackState = playbackStateCompat.f1005l;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    /* renamed from: i */
    public final void mo877i(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                QueueItem queueItem = (QueueItem) it.next();
                if (queueItem != null) {
                    if (hashSet.contains(Long.valueOf(queueItem.f986b))) {
                        Log.e("MediaSessionCompat", "Found duplicate queue id: " + queueItem.f986b, new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(queueItem.f986b));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        C0286ac acVar = (C0286ac) this.f982b;
        acVar.f1019g = list;
        if (list == null) {
            acVar.f1013a.setQueue((List) null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            QueueItem queueItem2 = (QueueItem) it2.next();
            MediaSession.QueueItem queueItem3 = queueItem2.f987c;
            if (queueItem3 == null) {
                queueItem2.f987c = C0291ah.m741c((MediaDescription) queueItem2.f985a.mo812b(), queueItem2.f986b);
                queueItem3 = queueItem2.f987c;
            }
            arrayList.add(queueItem3);
        }
        acVar.f1013a.setQueue(arrayList);
    }

    /* renamed from: j */
    public final void mo878j(int i) {
        C0284aa aaVar = this.f982b;
        C0286ac acVar = (C0286ac) aaVar;
        if (acVar.f1021i != i) {
            acVar.f1021i = i;
            synchronized (acVar.f1015c) {
                int beginBroadcast = ((C0286ac) aaVar).f1017e.beginBroadcast();
                while (true) {
                    beginBroadcast--;
                    if (beginBroadcast >= 0) {
                        try {
                            ((C0302d) ((C0286ac) aaVar).f1017e.getBroadcastItem(beginBroadcast)).mo912h(i);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        ((C0286ac) aaVar).f1017e.finishBroadcast();
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo879k(PendingIntent pendingIntent) {
        ((C0286ac) this.f982b).f1013a.setSessionActivity(pendingIntent);
    }

    /* renamed from: l */
    public final void mo880l(int i) {
        C0284aa aaVar = this.f982b;
        C0286ac acVar = (C0286ac) aaVar;
        if (acVar.f1022j != i) {
            acVar.f1022j = i;
            synchronized (acVar.f1015c) {
                int beginBroadcast = ((C0286ac) aaVar).f1017e.beginBroadcast();
                while (true) {
                    beginBroadcast--;
                    if (beginBroadcast >= 0) {
                        try {
                            ((C0302d) ((C0286ac) aaVar).f1017e.getBroadcastItem(beginBroadcast)).mo915k(i);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        ((C0286ac) aaVar).f1017e.finishBroadcast();
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo881m() {
        this.f982b.mo920d();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* compiled from: PG */
    public final class QueueItem implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0290ag();

        /* renamed from: a */
        public final MediaDescriptionCompat f985a;

        /* renamed from: b */
        public final long f986b;

        /* renamed from: c */
        public MediaSession.QueueItem f987c;

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f985a = mediaDescriptionCompat;
                this.f986b = j;
                this.f987c = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static List m664a(List list) {
            QueueItem queueItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object next : list) {
                if (next != null) {
                    MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) next;
                    queueItem = new QueueItem(queueItem2, MediaDescriptionCompat.m599a(C0291ah.m740b(queueItem2)), C0291ah.m739a(queueItem2));
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f985a + ", Id=" + this.f986b + " }";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            ((MediaDescription) this.f985a.mo812b()).writeToParcel(parcel, i);
            parcel.writeLong(this.f986b);
        }

        public QueueItem(Parcel parcel) {
            this.f985a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f986b = parcel.readLong();
        }
    }

    /* renamed from: g */
    public final void mo875g(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        C0286ac acVar = (C0286ac) this.f982b;
        acVar.f1020h = mediaMetadataCompat;
        MediaSession mediaSession = acVar.f1013a;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.f946c == null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(mediaMetadataCompat.f945b);
                obtain.setDataPosition(0);
                mediaMetadataCompat.f946c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.f946c;
        }
        mediaSession.setMetadata(mediaMetadata);
    }
}
