package androidx.p182p.p183a;

import android.os.CancellationSignal;
import androidx.p104d.p105a.C2153a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.p.a.a */
/* compiled from: PG */
final class C3913a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f12526a;

    /* renamed from: b */
    final /* synthetic */ CancellationSignal f12527b;

    public C3913a(C60870cx cxVar, CancellationSignal cancellationSignal) {
        this.f12526a = cxVar;
        this.f12527b = cancellationSignal;
    }

    public final void run() {
        if (((C2153a) this.f12526a).value instanceof C2153a.C2155b) {
            this.f12527b.cancel();
        }
    }
}
