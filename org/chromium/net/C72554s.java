package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.TraceEvent;

/* renamed from: org.chromium.net.s */
/* compiled from: PG */
final class C72554s extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public Network f193074a;

    /* renamed from: b */
    final /* synthetic */ NetworkChangeNotifierAutoDetect f193075b;

    public C72554s(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f193075b = networkChangeNotifierAutoDetect;
    }

    /* renamed from: a */
    private final boolean m107245a(Network network, NetworkCapabilities networkCapabilities) {
        if (m107246b(network)) {
            return true;
        }
        if (networkCapabilities == null) {
            networkCapabilities = this.f193075b.mConnectivityManagerDelegate.mo64292c(network);
        }
        if (networkCapabilities == null) {
            return true;
        }
        if (!networkCapabilities.hasTransport(4)) {
            return false;
        }
        C72547l unused = this.f193075b.mConnectivityManagerDelegate;
        return !C72547l.m107239f(network);
    }

    /* renamed from: b */
    private final boolean m107246b(Network network) {
        Network network2 = this.f193074a;
        return network2 != null && !network2.equals(network);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r3 = r10.f193074a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAvailable(android.net.Network r11) {
        /*
            r10 = this;
            java.lang.String r0 = "NetworkChangeNotifierCallback::onAvailable"
            org.chromium.base.TraceEvent r0 = org.chromium.base.TraceEvent.m107032c(r0)
            r1 = 0
            org.chromium.net.NetworkChangeNotifierAutoDetect r3 = r10.f193075b     // Catch:{ all -> 0x005a }
            org.chromium.net.l r3 = r3.mConnectivityManagerDelegate     // Catch:{ all -> 0x005a }
            android.net.NetworkCapabilities r3 = r3.mo64292c(r11)     // Catch:{ all -> 0x005a }
            boolean r4 = r10.m107245a(r11, r3)     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001f
            java.lang.String r11 = r0.f192513d
        L_0x001c:
            org.chromium.base.TraceEvent.m107031b(r11, r1)
        L_0x001f:
            return
        L_0x0020:
            r4 = 4
            boolean r3 = r3.hasTransport(r4)     // Catch:{ all -> 0x005a }
            r4 = 0
            if (r3 == 0) goto L_0x0035
            android.net.Network r3 = r10.f193074a     // Catch:{ all -> 0x005a }
            r5 = 1
            if (r3 == 0) goto L_0x0033
            boolean r3 = r11.equals(r3)     // Catch:{ all -> 0x005a }
            if (r3 != 0) goto L_0x0035
        L_0x0033:
            r8 = 1
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            if (r8 == 0) goto L_0x003a
            r10.f193074a = r11     // Catch:{ all -> 0x005a }
        L_0x003a:
            long r5 = org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(r11)     // Catch:{ all -> 0x005a }
            org.chromium.net.NetworkChangeNotifierAutoDetect r3 = r10.f193075b     // Catch:{ all -> 0x005a }
            org.chromium.net.l r3 = r3.mConnectivityManagerDelegate     // Catch:{ all -> 0x005a }
            int r7 = r3.mo64290a(r11)     // Catch:{ all -> 0x005a }
            org.chromium.net.NetworkChangeNotifierAutoDetect r11 = r10.f193075b     // Catch:{ all -> 0x005a }
            org.chromium.net.n r9 = new org.chromium.net.n     // Catch:{ all -> 0x005a }
            r3 = r9
            r4 = r10
            r3.<init>(r4, r5, r7, r8)     // Catch:{ all -> 0x005a }
            r11.runOnThread(r9)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0059
            java.lang.String r11 = r0.f192513d
            goto L_0x001c
        L_0x0059:
            return
        L_0x005a:
            r11 = move-exception
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r0.f192513d     // Catch:{ all -> 0x0063 }
            org.chromium.base.TraceEvent.m107031b(r0, r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            org.chromium.net.C72415xcb5e2d47.m107078m(r11, r0)
        L_0x0067:
            goto L_0x0069
        L_0x0068:
            throw r11
        L_0x0069:
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.C72554s.onAvailable(android.net.Network):void");
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String str;
        TraceEvent c = TraceEvent.m107032c("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (!m107245a(network, networkCapabilities)) {
                this.f193075b.runOnThread(new C72550o(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), this.f193075b.mConnectivityManagerDelegate.mo64290a(network)));
                if (c != null) {
                    str = c.f192513d;
                } else {
                    return;
                }
            } else if (c != null) {
                str = c.f192513d;
            } else {
                return;
            }
            TraceEvent.m107031b(str, 0);
            return;
        } catch (Throwable th) {
            C72415xcb5e2d47.m107078m(th, th);
        }
        throw th;
    }

    public final void onLosing(Network network, int i) {
        String str;
        TraceEvent c = TraceEvent.m107032c("NetworkChangeNotifierCallback::onLosing");
        try {
            if (!m107245a(network, (NetworkCapabilities) null)) {
                this.f193075b.runOnThread(new C72551p(this, NetworkChangeNotifierAutoDetect.networkToNetId(network)));
                if (c != null) {
                    str = c.f192513d;
                } else {
                    return;
                }
            } else if (c != null) {
                str = c.f192513d;
            } else {
                return;
            }
            TraceEvent.m107031b(str, 0);
            return;
        } catch (Throwable th) {
            C72415xcb5e2d47.m107078m(th, th);
        }
        throw th;
    }

    public final void onLost(Network network) {
        String str;
        TraceEvent c = TraceEvent.m107032c("NetworkChangeNotifierCallback::onLost");
        try {
            if (!m107246b(network)) {
                this.f193075b.runOnThread(new C72552q(this, network));
                if (this.f193074a != null) {
                    this.f193074a = null;
                    for (Network onAvailable : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this.f193075b.mConnectivityManagerDelegate, network)) {
                        onAvailable(onAvailable);
                    }
                    this.f193075b.runOnThread(new C72553r(this, this.f193075b.getCurrentNetworkState().getConnectionType()));
                }
                if (c != null) {
                    str = c.f192513d;
                } else {
                    return;
                }
            } else if (c != null) {
                str = c.f192513d;
            } else {
                return;
            }
            TraceEvent.m107031b(str, 0);
            return;
        } catch (Throwable th) {
            C72415xcb5e2d47.m107078m(th, th);
        }
        throw th;
    }
}
