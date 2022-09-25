package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;

/* renamed from: androidx.media.ab */
/* compiled from: PG */
final class C2404ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6645a;

    /* renamed from: b */
    final /* synthetic */ int f6646b;

    /* renamed from: c */
    final /* synthetic */ int f6647c;

    /* renamed from: d */
    final /* synthetic */ C2413ak f6648d;

    /* renamed from: e */
    final /* synthetic */ C2414al f6649e;

    public C2404ab(C2413ak akVar, C2414al alVar, String str, int i, int i2) {
        this.f6648d = akVar;
        this.f6649e = alVar;
        this.f6645a = str;
        this.f6646b = i;
        this.f6647c = i2;
    }

    public final void run() {
        IBinder binder = this.f6649e.f6682a.getBinder();
        this.f6648d.f6681a.f6687c.remove(binder);
        C2436m mVar = new C2436m(this.f6648d.f6681a, this.f6645a, this.f6646b, this.f6647c, this.f6649e);
        mVar.f6723e = this.f6648d.f6681a.mo5835h(this.f6645a, this.f6647c);
        if (mVar.f6723e == null) {
            Log.i("MBServiceCompat", "No root for client " + this.f6645a + " from service " + getClass().getName());
            try {
                this.f6649e.mo5826a(2, (Bundle) null);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(this.f6645a));
            }
        } else {
            try {
                this.f6648d.f6681a.f6687c.put(binder, mVar);
                binder.linkToDeath(mVar, 0);
                MediaSessionCompat.Token token = this.f6648d.f6681a.f6689e;
                if (token != null) {
                    C2414al alVar = this.f6649e;
                    C2434k kVar = mVar.f6723e;
                    String str = kVar.f6716a;
                    Bundle bundle = kVar.f6717b;
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putInt("extra_service_version", 2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_media_item_id", str);
                    bundle2.putParcelable("data_media_session_token", token);
                    bundle2.putBundle("data_root_hints", bundle);
                    alVar.mo5826a(1, bundle2);
                }
            } catch (RemoteException unused2) {
                Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(this.f6645a));
                this.f6648d.f6681a.f6687c.remove(binder);
            }
        }
    }
}
