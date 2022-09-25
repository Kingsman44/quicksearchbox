package androidx.biometric;

import android.util.Log;
import androidx.lifecycle.C2333ah;

/* renamed from: androidx.biometric.n */
/* compiled from: PG */
public final /* synthetic */ class C0940n implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C0951y f3041a;

    public /* synthetic */ C0940n(C0951y yVar) {
        this.f3041a = yVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C0951y yVar = this.f3041a;
        if (((Boolean) obj).booleanValue()) {
            yVar.mo3564e();
            C0908al alVar = yVar.f3048a;
            if (!alVar.f3001i) {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            } else {
                alVar.mo3540h().execute(new C0934h(yVar));
            }
            yVar.f3048a.mo3542j(false);
        }
    }
}
