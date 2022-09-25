package androidx.media;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* renamed from: androidx.media.ag */
/* compiled from: PG */
final class C2409ag implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f6665a;

    /* renamed from: b */
    final /* synthetic */ String f6666b;

    /* renamed from: c */
    final /* synthetic */ int f6667c;

    /* renamed from: d */
    final /* synthetic */ C2413ak f6668d;

    /* renamed from: e */
    final /* synthetic */ C2414al f6669e;

    public C2409ag(C2413ak akVar, C2414al alVar, int i, String str, int i2) {
        this.f6668d = akVar;
        this.f6669e = alVar;
        this.f6665a = i;
        this.f6666b = str;
        this.f6667c = i2;
    }

    public final void run() {
        C2436m mVar;
        IBinder binder = this.f6669e.f6682a.getBinder();
        this.f6668d.f6681a.f6687c.remove(binder);
        Iterator it = this.f6668d.f6681a.f6686b.iterator();
        while (true) {
            mVar = null;
            if (!it.hasNext()) {
                break;
            }
            C2436m mVar2 = (C2436m) it.next();
            if (mVar2.f6721c == this.f6665a) {
                if (TextUtils.isEmpty(this.f6666b) || this.f6667c <= 0) {
                    mVar = new C2436m(this.f6668d.f6681a, mVar2.f6719a, mVar2.f6720b, mVar2.f6721c, this.f6669e);
                }
                it.remove();
            }
        }
        if (mVar == null) {
            mVar = new C2436m(this.f6668d.f6681a, this.f6666b, this.f6667c, this.f6665a, this.f6669e);
        }
        this.f6668d.f6681a.f6687c.put(binder, mVar);
        try {
            binder.linkToDeath(mVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
