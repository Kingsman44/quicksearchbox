package androidx.media;

import android.support.p031v4.p032os.ResultReceiver;
import android.util.Log;

/* renamed from: androidx.media.ai */
/* compiled from: PG */
final class C2411ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6672a;

    /* renamed from: b */
    final /* synthetic */ ResultReceiver f6673b;

    /* renamed from: c */
    final /* synthetic */ C2413ak f6674c;

    /* renamed from: d */
    final /* synthetic */ C2414al f6675d;

    public C2411ai(C2413ak akVar, C2414al alVar, String str, ResultReceiver resultReceiver) {
        this.f6674c = akVar;
        this.f6675d = alVar;
        this.f6672a = str;
        this.f6673b = resultReceiver;
    }

    public final void run() {
        if (((C2436m) this.f6674c.f6681a.f6687c.get(this.f6675d.f6682a.getBinder())) == null) {
            Log.w("MBServiceCompat", "search for callback that isn't registered query=".concat(String.valueOf(this.f6672a)));
            return;
        }
        String str = this.f6672a;
        C2433j jVar = new C2433j(str, this.f6673b);
        jVar.f6745h = 4;
        jVar.mo5863c((Object) null);
        if (!jVar.mo5864d()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(String.valueOf(str)));
        }
    }
}
