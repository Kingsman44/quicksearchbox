package androidx.media;

import android.support.p031v4.p032os.ResultReceiver;
import android.util.Log;

/* renamed from: androidx.media.af */
/* compiled from: PG */
final class C2408af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6661a;

    /* renamed from: b */
    final /* synthetic */ ResultReceiver f6662b;

    /* renamed from: c */
    final /* synthetic */ C2413ak f6663c;

    /* renamed from: d */
    final /* synthetic */ C2414al f6664d;

    public C2408af(C2413ak akVar, C2414al alVar, String str, ResultReceiver resultReceiver) {
        this.f6663c = akVar;
        this.f6664d = alVar;
        this.f6661a = str;
        this.f6662b = resultReceiver;
    }

    public final void run() {
        if (((C2436m) this.f6663c.f6681a.f6687c.get(this.f6664d.f6682a.getBinder())) == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=".concat(String.valueOf(this.f6661a)));
            return;
        }
        String str = this.f6661a;
        C2432i iVar = new C2432i(str, this.f6662b);
        C2416an.m6441f(iVar);
        if (!iVar.mo5864d()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(str)));
        }
    }
}
