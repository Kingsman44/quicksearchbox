package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.support.p033v7.widget.LinearLayoutManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import org.chromium.base.C72382h;

/* compiled from: PG */
class AndroidNetworkLibrary {

    /* renamed from: a */
    private static Boolean f192595a;

    /* renamed from: b */
    private static Boolean f192596b;

    /* compiled from: PG */
    public class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public boolean isCleartextTrafficPermitted() {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }

        public boolean isCleartextTrafficPermitted(String str) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
    }

    AndroidNetworkLibrary() {
    }

    /* renamed from: a */
    public static DnsStatus m107073a(Network network) {
        ConnectivityManager connectivityManager;
        if (f192595a == null) {
            boolean z = false;
            try {
                if (C72382h.f192527a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                    z = true;
                }
            } catch (RuntimeException unused) {
            }
            f192595a = Boolean.valueOf(z);
        }
        if (!f192595a.booleanValue() || (connectivityManager = (ConnectivityManager) C72382h.f192527a.getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            return new DnsStatus(linkProperties.getDnsServers(), linkProperties.isPrivateDnsActive(), linkProperties.getPrivateDnsServerName(), linkProperties.getDomains());
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.addTestRootCertificate(bArr);
    }

    /* renamed from: b */
    private static WifiInfo m107074b() {
        TransportInfo transportInfo;
        if (!m107075c()) {
            Intent registerReceiver = C72382h.f192527a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null) {
                return (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            }
            return null;
        } else if (Build.VERSION.SDK_INT < 31) {
            return ((WifiManager) C72382h.f192527a.getSystemService("wifi")).getConnectionInfo();
        } else {
            ConnectivityManager connectivityManager = (ConnectivityManager) C72382h.f192527a.getSystemService("connectivity");
            for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                if (networkCapabilities2 != null && networkCapabilities2.hasTransport(1) && (transportInfo = networkCapabilities2.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                    return (WifiInfo) transportInfo;
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m107075c() {
        if (f192596b == null) {
            boolean z = false;
            try {
                if (C72382h.f192527a.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                    z = true;
                }
            } catch (RuntimeException unused) {
            }
            f192596b = Boolean.valueOf(z);
        }
        return f192596b.booleanValue();
    }

    public static void clearTestRootCertificates() {
        X509Util.clearTestRootCertificates();
    }

    public static DnsStatus getCurrentDnsStatus() {
        return m107073a((Network) null);
    }

    public static DnsStatus getDnsStatusForNetwork(long j) {
        try {
            return m107073a(Network.fromNetworkHandle(j));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) C72382h.f192527a.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C72382h.f192527a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) C72382h.f192527a.getSystemService("phone");
        if (telephonyManager == null) {
            return BuildConfig.FLAVOR;
        }
        return telephonyManager.getNetworkOperator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getSSID();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getWifiSSID() {
        /*
            android.net.wifi.WifiInfo r0 = m107074b()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.getSSID()
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "<unknown ssid>"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0015
            return r0
        L_0x0015:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.AndroidNetworkLibrary.getWifiSSID():java.lang.String");
    }

    public static int getWifiSignalLevel(int i) {
        int i2;
        int calculateSignalLevel;
        Context context = C72382h.f192527a;
        if (context == null || context.getContentResolver() == null) {
            return -1;
        }
        if (m107075c()) {
            WifiInfo b = m107074b();
            if (b == null) {
                return -1;
            }
            i2 = b.getRssi();
        } else {
            try {
                Intent registerReceiver = C72382h.f192527a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (registerReceiver == null) {
                    return -1;
                }
                i2 = registerReceiver.getIntExtra("newRssi", LinearLayoutManager.INVALID_OFFSET);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (i2 != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(i2, i)) >= 0 && calculateSignalLevel < i) {
            return calculateSignalLevel;
        }
        return -1;
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e) {
            new StringBuilder("could not get network interfaces: ").append(e);
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: ".concat(e.toString()));
            return false;
        }
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C72382h.f192527a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity((Network) null, false);
        return true;
    }

    public static void setWifiEnabled(boolean z) {
        ((WifiManager) C72382h.f192527a.getSystemService("wifi")).setWifiEnabled(z);
    }

    private static void tagSocket(int i, int i2, int i3) {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            ThreadStatsUid.set(i2);
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(i);
        C72432b bVar = new C72432b(adoptFd.getFileDescriptor());
        TrafficStats.tagSocket(bVar);
        bVar.close();
        if (adoptFd != null) {
            adoptFd.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            ThreadStatsUid.clear();
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
