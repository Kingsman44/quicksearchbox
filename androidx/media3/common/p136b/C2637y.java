package androidx.media3.common.p136b;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: androidx.media3.common.b.y */
/* compiled from: PG */
final class C2637y extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a */
    private final C2602aa f7308a;

    public C2637y(C2602aa aaVar) {
        this.f7308a = aaVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        boolean z = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        C2602aa aaVar = this.f7308a;
        if (true == z) {
            i = 10;
        }
        aaVar.mo6115c(i);
    }
}
