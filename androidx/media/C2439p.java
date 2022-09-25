package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.core.p097i.C1970e;
import java.util.List;

/* renamed from: androidx.media.p */
/* compiled from: PG */
final class C2439p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6729a;

    /* renamed from: b */
    final /* synthetic */ C2441r f6730b;

    public C2439p(C2441r rVar, String str) {
        this.f6730b = rVar;
        this.f6729a = str;
    }

    public final void run() {
        int i;
        int i2;
        for (IBinder iBinder : this.f6730b.f6735d.f6687c.keySet()) {
            C2436m mVar = (C2436m) this.f6730b.f6735d.f6687c.get(iBinder);
            C2441r rVar = this.f6730b;
            String str = this.f6729a;
            List<C1970e> list = (List) mVar.f6722d.get(str);
            if (list != null) {
                for (C1970e eVar : list) {
                    Bundle bundle = (Bundle) eVar.f5889b;
                    if (bundle == null) {
                        i = -1;
                    } else {
                        i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                    }
                    if (bundle == null) {
                        i2 = -1;
                    } else {
                        i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                    }
                    if (i == -1 || i2 == -1 || ((i * i2) + i2) - 1 >= 0) {
                        rVar.f6735d.mo5834g(str, mVar, (Bundle) eVar.f5889b);
                    }
                }
            }
        }
    }
}
