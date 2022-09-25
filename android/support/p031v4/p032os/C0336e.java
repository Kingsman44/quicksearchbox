package android.support.p031v4.p032os;

import android.os.Bundle;
import android.os.Handler;

/* renamed from: android.support.v4.os.e */
/* compiled from: PG */
final class C0336e extends C0333b {

    /* renamed from: a */
    final /* synthetic */ ResultReceiver f1058a;

    public C0336e(ResultReceiver resultReceiver) {
        this.f1058a = resultReceiver;
    }

    /* renamed from: a */
    public final void mo1099a(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.f1058a;
        Handler handler = resultReceiver.f1055b;
        if (handler != null) {
            handler.post(new C0337f(resultReceiver, i, bundle));
        } else {
            resultReceiver.mo806a(i, bundle);
        }
    }
}
