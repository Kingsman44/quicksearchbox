package com.google.android.apps.gsa.nga.engine.education;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.f */
/* compiled from: PG */
public final class C75751f {

    /* renamed from: a */
    private static final C58974d f210233a = C58974d.m91136j();

    /* renamed from: b */
    private final ConnectivityManager f210234b;

    /* renamed from: c */
    private final C22871g f210235c;

    public C75751f(Context context, C22871g gVar) {
        this.f210234b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f210235c = gVar;
        gVar.mo28202b("[NGA] warmup TSIP network monitor", new C75750e(this));
    }

    /* renamed from: a */
    public final Boolean mo71869a() {
        ConnectivityManager connectivityManager = this.f210234b;
        boolean z = false;
        if (connectivityManager == null) {
            ((C58970a) ((C58970a) f210233a.mo56224b()).mo56372aa(3246)).mo56386p("connectivityManager is null. Returning false for isNetworkAvailable");
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            ((C58970a) ((C58970a) f210233a.mo56224b()).mo56372aa(3245)).mo56386p("No active network");
            return false;
        }
        ConnectivityManager connectivityManager2 = this.f210234b;
        long networkHandle = activeNetwork.getNetworkHandle();
        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            C58800sl lA = C58528ij.m90012L(21, 16, 12).iterator();
            while (true) {
                if (!lA.hasNext()) {
                    z = true;
                    break;
                }
                Integer num = (Integer) lA.next();
                if (!networkCapabilities.hasCapability(num.intValue())) {
                    ((C58970a) ((C58970a) f210233a.mo56224b()).mo56372aa(3247)).mo56359L("Capability not met: %s, Network: %s, NetworkCapabilities: %s", num, Long.valueOf(networkHandle), networkCapabilities);
                    break;
                }
            }
        } else {
            ((C58970a) ((C58970a) f210233a.mo56224b()).mo56372aa(3248)).mo56388r("No network capabilities for network: %s", networkHandle);
        }
        return Boolean.valueOf(z);
    }
}
