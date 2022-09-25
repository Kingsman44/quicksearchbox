package androidx.work.impl.p204a.p206b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.p093e.C1887a;
import androidx.work.C4380ad;
import androidx.work.impl.p204a.C4425b;
import androidx.work.impl.utils.C4606m;
import androidx.work.impl.utils.C4607n;
import androidx.work.impl.utils.p210b.C4595b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.m */
/* compiled from: PG */
public final class C4438m {

    /* renamed from: a */
    public static final String f14124a = C4380ad.m12561i("NetworkStateTracker");

    /* renamed from: a */
    public static final C4425b m12664a(ConnectivityManager connectivityManager) {
        boolean z;
        C69664n.m101061g(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        C69664n.m101061g(connectivityManager, "<this>");
        try {
            NetworkCapabilities a = C4606m.m12999a(connectivityManager, C4607n.m13002a(connectivityManager));
            if (a != null) {
                z = C4606m.m13001c(a, 16);
                boolean a2 = C1887a.m5146a(connectivityManager);
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new C4425b(z3, z, a2, z2);
            }
        } catch (SecurityException e) {
            C4380ad.m12560h().mo9312d(f14124a, "Unable to validate active network", e);
        }
        z = false;
        boolean a22 = C1887a.m5146a(connectivityManager);
        z2 = false;
        return new C4425b(z3, z, a22, z2);
    }

    /* renamed from: b */
    public static final C4434i m12665b(Context context, C4595b bVar) {
        C69664n.m101061g(context, "context");
        return new C4437l(context, bVar);
    }
}
