package androidx.work.impl;

import androidx.work.impl.utils.p209a.C4568b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.work.impl.an */
/* compiled from: PG */
public final /* synthetic */ class C4459an implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4463ar f14169a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f14170b;

    public /* synthetic */ C4459an(C4463ar arVar, C60870cx cxVar) {
        this.f14169a = arVar;
        this.f14170b = cxVar;
    }

    public final void run() {
        C4463ar arVar = this.f14169a;
        C60870cx cxVar = this.f14170b;
        if (arVar.f14189g.f14444d instanceof C4568b) {
            cxVar.cancel(true);
        }
    }
}
