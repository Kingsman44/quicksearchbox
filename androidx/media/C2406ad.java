package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.core.p097i.C1970e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media.ad */
/* compiled from: PG */
final class C2406ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6652a;

    /* renamed from: b */
    final /* synthetic */ IBinder f6653b;

    /* renamed from: c */
    final /* synthetic */ Bundle f6654c;

    /* renamed from: d */
    final /* synthetic */ C2413ak f6655d;

    /* renamed from: e */
    final /* synthetic */ C2414al f6656e;

    public C2406ad(C2413ak akVar, C2414al alVar, String str, IBinder iBinder, Bundle bundle) {
        this.f6655d = akVar;
        this.f6656e = alVar;
        this.f6652a = str;
        this.f6653b = iBinder;
        this.f6654c = bundle;
    }

    public final void run() {
        C2436m mVar = (C2436m) this.f6655d.f6681a.f6687c.get(this.f6656e.f6682a.getBinder());
        if (mVar == null) {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=".concat(String.valueOf(this.f6652a)));
            return;
        }
        C2416an anVar = this.f6655d.f6681a;
        String str = this.f6652a;
        IBinder iBinder = this.f6653b;
        Bundle bundle = this.f6654c;
        List<C1970e> list = (List) mVar.f6722d.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C1970e eVar : list) {
            if (iBinder == eVar.f5888a && C2430g.m6455a(bundle, (Bundle) eVar.f5889b)) {
                return;
            }
        }
        list.add(new C1970e(iBinder, bundle));
        mVar.f6722d.put(str, list);
        anVar.mo5834g(str, mVar, bundle);
    }
}
