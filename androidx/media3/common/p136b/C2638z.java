package androidx.media3.common.p136b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: androidx.media3.common.b.z */
/* compiled from: PG */
final class C2638z extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C2602aa f7309a;

    public C2638z(C2602aa aaVar) {
        this.f7309a = aaVar;
    }

    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                i = 1;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (!(type == 4 || type == 5)) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            break;
                        case 18:
                            break;
                        case 20:
                            int i2 = C2612ak.f7249a;
                            i = 9;
                            break;
                        default:
                            i = 6;
                            break;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (C2612ak.f7249a < 31 || i != 5) {
            this.f7309a.mo6115c(i);
            return;
        }
        C2602aa aaVar = this.f7309a;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C2637y yVar = new C2637y(aaVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), yVar);
            telephonyManager.unregisterTelephonyCallback(yVar);
        } catch (RuntimeException unused2) {
            aaVar.mo6115c(5);
        }
    }
}
