package androidx.media;

import android.os.Bundle;
import android.support.p031v4.p032os.ResultReceiver;
import android.util.Log;

/* renamed from: androidx.media.aj */
/* compiled from: PG */
final class C2412aj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6676a;

    /* renamed from: b */
    final /* synthetic */ Bundle f6677b;

    /* renamed from: c */
    final /* synthetic */ ResultReceiver f6678c;

    /* renamed from: d */
    final /* synthetic */ C2413ak f6679d;

    /* renamed from: e */
    final /* synthetic */ C2414al f6680e;

    public C2412aj(C2413ak akVar, C2414al alVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6679d = akVar;
        this.f6680e = alVar;
        this.f6676a = str;
        this.f6677b = bundle;
        this.f6678c = resultReceiver;
    }

    public final void run() {
        if (((C2436m) this.f6679d.f6681a.f6687c.get(this.f6680e.f6682a.getBinder())) == null) {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f6676a + ", extras=" + this.f6677b);
            return;
        }
        String str = this.f6676a;
        Bundle bundle = this.f6677b;
        ResultReceiver resultReceiver = this.f6678c;
        C2449z zVar = new C2449z(str);
        if (zVar.f6743f || zVar.f6744g) {
            StringBuilder sb = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
            Object obj = zVar.f6742e;
            sb.append(obj);
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: ".concat(String.valueOf(obj)));
        }
        zVar.f6744g = true;
        resultReceiver.mo1096b(-1, (Bundle) null);
        if (!zVar.mo5864d()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }
}
