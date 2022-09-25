package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: org.chromium.net.l */
/* compiled from: PG */
final class C72547l {

    /* renamed from: a */
    public final ConnectivityManager f193059a;

    C72547l() {
        this.f193059a = null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x002e */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m107239f(android.net.Network r4) {
        /*
            java.net.Socket r0 = new java.net.Socket
            r0.<init>()
            android.os.StrictMode$VmPolicy r1 = android.os.StrictMode.getVmPolicy()     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            android.os.StrictMode$VmPolicy r2 = android.os.StrictMode.VmPolicy.LAX     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            android.os.StrictMode.setVmPolicy(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            org.chromium.base.u r2 = new org.chromium.base.u     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r3 = 0
            r2.<init>(r3, r1)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r4.bindSocket(r0)     // Catch:{ all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r4 = 1
            return r4
        L_0x001f:
            r4 = move-exception
            r2.close()     // Catch:{ all -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r1 = move-exception
            org.chromium.net.C72414xee27811b.m107077m(r4, r1)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
        L_0x0028:
            throw r4     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
        L_0x0029:
            r4 = move-exception
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r4
        L_0x002e:
            r0.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.C72547l.m107239f(android.net.Network):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo64290a(Network network) {
        NetworkInfo d = mo64293d(network);
        if (d == null || !d.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionType(d.getType(), d.getSubtype());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Network mo64291b() {
        Network activeNetwork = this.f193059a.getActiveNetwork();
        if (activeNetwork == null) {
            NetworkInfo activeNetworkInfo = this.f193059a.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, (Network) null)) {
                NetworkInfo e = mo64294e(network);
                if (e != null && (e.getType() == activeNetworkInfo.getType() || e.getType() == 17)) {
                    activeNetwork = network;
                }
            }
        }
        return activeNetwork;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final NetworkCapabilities mo64292c(Network network) {
        int i = 0;
        while (i < 2) {
            try {
                return this.f193059a.getNetworkCapabilities(network);
            } catch (SecurityException unused) {
                i++;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final NetworkInfo mo64293d(Network network) {
        NetworkInfo e = mo64294e(network);
        return (e == null || e.getType() != 17) ? e : this.f193059a.getActiveNetworkInfo();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        return r1.f193059a.getNetworkInfo(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.NetworkInfo mo64294e(android.net.Network r2) {
        /*
            r1 = this;
            android.net.ConnectivityManager r0 = r1.f193059a     // Catch:{ NullPointerException -> 0x0007 }
            android.net.NetworkInfo r2 = r0.getNetworkInfo(r2)     // Catch:{ NullPointerException -> 0x0007 }
            return r2
        L_0x0007:
            android.net.ConnectivityManager r0 = r1.f193059a     // Catch:{ NullPointerException -> 0x000e }
            android.net.NetworkInfo r2 = r0.getNetworkInfo(r2)     // Catch:{ NullPointerException -> 0x000e }
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.C72547l.mo64294e(android.net.Network):android.net.NetworkInfo");
    }

    public C72547l(Context context) {
        this.f193059a = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
