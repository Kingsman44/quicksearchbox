package android.support.p031v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.p032os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C1826m;
import androidx.media.C2430g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
/* compiled from: PG */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f927a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b */
    private final C0269f f928b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    /* compiled from: PG */
    class CustomActionResultReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo806a(int i, Bundle bundle) {
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    /* compiled from: PG */
    class ItemReceiver extends ResultReceiver {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo806a(int i, Bundle bundle) {
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    /* compiled from: PG */
    class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final C0277n f931d;

        public SearchResultReceiver(C0277n nVar, Handler handler) {
            super(handler);
            this.f931d = nVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo806a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m651a(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f931d.mo849a();
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList(r5);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                this.f931d.mo850b(arrayList);
                return;
            }
            this.f931d.mo849a();
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0268e eVar, Bundle bundle) {
        this.f928b = new C0274k(context, componentName, eVar, bundle);
    }

    /* renamed from: a */
    public final Bundle mo797a() {
        return ((C0272i) this.f928b).f959b.getExtras();
    }

    /* renamed from: b */
    public final MediaSessionCompat.Token mo798b() {
        C0272i iVar = (C0272i) this.f928b;
        if (iVar.f966i == null) {
            iVar.f966i = MediaSessionCompat.Token.fromToken(iVar.f959b.getSessionToken());
        }
        return iVar.f966i;
    }

    /* renamed from: c */
    public final String mo799c() {
        return ((C0272i) this.f928b).f959b.getRoot();
    }

    /* renamed from: d */
    public final void mo800d() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        ((C0272i) this.f928b).f959b.connect();
    }

    /* renamed from: e */
    public final void mo801e() {
        Messenger messenger;
        C0272i iVar = (C0272i) this.f928b;
        C0278o oVar = iVar.f964g;
        if (!(oVar == null || (messenger = iVar.f965h) == null)) {
            try {
                oVar.mo851a(7, (Bundle) null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        iVar.f959b.disconnect();
    }

    /* renamed from: f */
    public final void mo802f(String str, Bundle bundle, C0277n nVar) {
        if (!TextUtils.isEmpty(str)) {
            C0269f fVar = this.f928b;
            C0272i iVar = (C0272i) fVar;
            if (iVar.f959b.isConnected()) {
                C0278o oVar = iVar.f964g;
                if (oVar == null) {
                    Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
                    iVar.f961d.post(new C0270g(nVar));
                    return;
                }
                SearchResultReceiver searchResultReceiver = new SearchResultReceiver(nVar, iVar.f961d);
                try {
                    Messenger messenger = ((C0272i) fVar).f965h;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_search_query", str);
                    bundle2.putBundle("data_search_extras", bundle);
                    bundle2.putParcelable("data_result_receiver", searchResultReceiver);
                    oVar.mo851a(8, bundle2, messenger);
                } catch (RemoteException e) {
                    Log.i("MediaBrowserCompat", "Remote error searching items with query: ".concat(String.valueOf(str)), e);
                    iVar.f961d.post(new C0271h(nVar));
                }
            } else {
                throw new IllegalStateException("search() called while not connected");
            }
        } else {
            throw new IllegalArgumentException("query cannot be empty");
        }
    }

    /* renamed from: g */
    public final void mo803g(String str, C0282s sVar) {
        if (!TextUtils.isEmpty(str)) {
            C0269f fVar = this.f928b;
            C0274k kVar = (C0274k) fVar;
            if (kVar.f964g == null || kVar.f963f < 2) {
                kVar.f959b.subscribe(str, sVar.f972a);
                return;
            }
            C0272i iVar = (C0272i) fVar;
            C0279p pVar = (C0279p) iVar.f962e.get(str);
            if (pVar == null) {
                pVar = new C0279p();
                iVar.f962e.put(str, pVar);
            }
            sVar.f974c = new WeakReference(pVar);
            int i = 0;
            while (true) {
                if (i >= pVar.f970b.size()) {
                    pVar.f969a.add(sVar);
                    pVar.f970b.add((Object) null);
                    break;
                } else if (C2430g.m6455a((Bundle) pVar.f970b.get(i), (Bundle) null)) {
                    pVar.f969a.set(i, sVar);
                    break;
                } else {
                    i++;
                }
            }
            C0278o oVar = iVar.f964g;
            if (oVar != null) {
                try {
                    IBinder iBinder = sVar.f973b;
                    Messenger messenger = ((C0272i) fVar).f965h;
                    Bundle bundle = new Bundle();
                    bundle.putString("data_media_item_id", str);
                    C1826m.m5005b(bundle, "data_callback_token", iBinder);
                    bundle.putBundle("data_options", (Bundle) null);
                    oVar.mo851a(3, bundle, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error subscribing media item: ".concat(String.valueOf(str)));
                }
            } else {
                iVar.f959b.subscribe(str, sVar.f972a);
            }
        } else {
            throw new IllegalArgumentException("parentId is empty");
        }
    }

    /* renamed from: h */
    public final void mo804h(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0269f fVar = this.f928b;
            C0274k kVar = (C0274k) fVar;
            if (kVar.f964g == null || kVar.f963f < 2) {
                kVar.f959b.unsubscribe(str);
                return;
            }
            C0272i iVar = (C0272i) fVar;
            C0279p pVar = (C0279p) iVar.f962e.get(str);
            if (pVar != null) {
                C0278o oVar = iVar.f964g;
                if (oVar == null) {
                    iVar.f959b.unsubscribe(str);
                } else {
                    try {
                        Messenger messenger = ((C0272i) fVar).f965h;
                        Bundle bundle = new Bundle();
                        bundle.putString("data_media_item_id", str);
                        C1826m.m5005b(bundle, "data_callback_token", (IBinder) null);
                        oVar.mo851a(4, bundle, messenger);
                    } catch (RemoteException unused) {
                        Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=".concat(String.valueOf(str)));
                    }
                }
                pVar.f969a.isEmpty();
                iVar.f962e.remove(str);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    /* renamed from: i */
    public final boolean mo805i() {
        return ((C0272i) this.f928b).f959b.isConnected();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    /* compiled from: PG */
    public class MediaItem implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0276m();

        /* renamed from: a */
        public final int f929a;

        /* renamed from: b */
        public final MediaDescriptionCompat f930b;

        public MediaItem(Parcel parcel) {
            this.f929a = parcel.readInt();
            this.f930b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        /* renamed from: a */
        public static List m595a(List list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object next : list) {
                if (next != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) next;
                    mediaItem = new MediaItem(MediaDescriptionCompat.m599a(C0264a.m619b(mediaItem2)), C0264a.m618a(mediaItem2));
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        /* renamed from: b */
        public final boolean mo807b() {
            return (this.f929a & 1) != 0;
        }

        /* renamed from: c */
        public final boolean mo808c() {
            return (this.f929a & 2) != 0;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.f929a + ", mDescription=" + this.f930b + '}';
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f929a);
            ((MediaDescription) this.f930b.mo812b()).writeToParcel(parcel, i);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f932a)) {
                this.f929a = i;
                this.f930b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }
    }
}
