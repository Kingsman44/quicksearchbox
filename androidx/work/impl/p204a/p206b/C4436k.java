package androidx.work.impl.p204a.p206b;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.C4380ad;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.k */
/* compiled from: PG */
public final class C4436k extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ C4437l f14121a;

    public C4436k(C4437l lVar) {
        this.f14121a = lVar;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C69664n.m101061g(network, "network");
        C69664n.m101061g(networkCapabilities, "capabilities");
        C4380ad h = C4380ad.m12560h();
        String str = C4438m.f14124a;
        new StringBuilder("Network capabilities changed: ").append(networkCapabilities);
        h.mo9309a(str, "Network capabilities changed: ".concat(String.valueOf(networkCapabilities)));
        C4437l lVar = this.f14121a;
        lVar.mo9384g(C4438m.m12664a(lVar.f14122e));
    }

    public final void onLost(Network network) {
        C69664n.m101061g(network, "network");
        C4380ad.m12560h().mo9309a(C4438m.f14124a, "Network connection lost");
        C4437l lVar = this.f14121a;
        lVar.mo9384g(C4438m.m12664a(lVar.f14122e));
    }
}
