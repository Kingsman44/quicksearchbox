package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.evernote.android.state.BuildConfig;
import java.util.Arrays;
import org.chromium.base.C72382h;

/* compiled from: PG */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private static final int UNKNOWN_LINK_SPEED = -1;
    /* access modifiers changed from: private */
    public C72547l mConnectivityManagerDelegate = new C72547l(C72382h.f192527a);
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler;
    /* access modifiers changed from: private */
    public boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private C72554s mNetworkCallback = new C72554s(this);
    private NetworkRequest mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
    private NetworkState mNetworkState;
    /* access modifiers changed from: private */
    public final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    /* access modifiers changed from: private */
    public boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private C72555t mWifiManagerDelegate;

    /* compiled from: PG */
    class NetworkConnectivityIntentFilter extends IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* compiled from: PG */
    public class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z, int i, int i2, boolean z2, String str, boolean z3, String str2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mIsMetered = z2;
            this.mNetworkIdentifier = str == null ? BuildConfig.FLAVOR : str;
            this.mIsPrivateDnsActive = z3;
            this.mPrivateDnsServerName = str2 == null ? BuildConfig.FLAVOR : str2;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case 12:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public int getConnectionType() {
            if (!isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
        }

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }
    }

    /* compiled from: PG */
    public interface Observer {
        void onConnectionCostChanged(int i);

        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* compiled from: PG */
    public abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        /* access modifiers changed from: protected */
        public abstract void destroy();

        /* access modifiers changed from: protected */
        public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        /* access modifiers changed from: protected */
        public final void register() {
            this.mNotifier.register();
        }

        /* access modifiers changed from: protected */
        public final void unregister() {
            this.mNotifier.unregister();
        }
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
        this.mObserver = observer;
        if (Build.VERSION.SDK_INT >= 30) {
            this.mDefaultNetworkCallback = new C72546k(this);
        } else {
            this.mDefaultNetworkCallback = new C72548m(this);
        }
        this.mNetworkState = getCurrentNetworkState();
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        registrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }

    private void assertOnThread() {
    }

    /* access modifiers changed from: private */
    public void connectionTypeChanged() {
        connectionTypeChangedTo(getCurrentNetworkState());
    }

    /* access modifiers changed from: private */
    public void connectionTypeChangedTo(NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (!(networkState.getConnectionType() == this.mNetworkState.getConnectionType() && networkState.getConnectionSubtype() == this.mNetworkState.getConnectionSubtype())) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    /* access modifiers changed from: private */
    public static int convertToConnectionType(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (!(i == 4 || i == 5)) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: private */
    public static Network[] getAllNetworksFiltered(C72547l lVar, Network network) {
        NetworkCapabilities c;
        Network[] allNetworks = lVar.f193059a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network) && (c = lVar.mo64292c(network2)) != null && c.hasCapability(12)) {
                if (!c.hasTransport(4)) {
                    allNetworks[i] = network2;
                    i++;
                } else if (C72547l.m107239f(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i);
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0(this, runnable));
        }
    }

    public void destroy() {
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState getCurrentNetworkState() {
        /*
            r21 = this;
            r0 = r21
            org.chromium.net.l r1 = r0.mConnectivityManagerDelegate
            android.net.Network r2 = r1.mo64291b()
            android.net.NetworkInfo r3 = r1.mo64293d(r2)
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000f:
            r3 = r4
            goto L_0x0024
        L_0x0011:
            boolean r5 = r3.isConnected()
            if (r5 != 0) goto L_0x0024
            android.net.NetworkInfo$DetailedState r3 = r3.getDetailedState()
            android.net.NetworkInfo$DetailedState r5 = android.net.NetworkInfo.DetailedState.BLOCKED
            if (r3 == r5) goto L_0x0020
            goto L_0x000f
        L_0x0020:
            org.chromium.base.ApplicationStatus.getStateForApplication()
            goto L_0x000f
        L_0x0024:
            if (r3 != 0) goto L_0x0036
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r1 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            r6 = 0
            r7 = -1
            r8 = -1
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = ""
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00dc
        L_0x0036:
            r5 = 1
            if (r2 == 0) goto L_0x008e
            android.net.NetworkCapabilities r1 = r1.mo64292c(r2)
            r4 = 0
            if (r1 == 0) goto L_0x004a
            r6 = 11
            boolean r1 = r1.hasCapability(r6)
            if (r1 != 0) goto L_0x004a
            r10 = 1
            goto L_0x004b
        L_0x004a:
            r10 = 0
        L_0x004b:
            org.chromium.net.DnsStatus r1 = org.chromium.net.AndroidNetworkLibrary.m107073a(r2)
            if (r1 != 0) goto L_0x006d
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r1 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            r7 = 1
            int r8 = r3.getType()
            int r9 = r3.getSubtype()
            long r2 = networkToNetId(r2)
            java.lang.String r11 = java.lang.String.valueOf(r2)
            r12 = 0
            java.lang.String r13 = ""
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00dc
        L_0x006d:
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r4 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            r7 = 1
            int r8 = r3.getType()
            int r9 = r3.getSubtype()
            long r2 = networkToNetId(r2)
            java.lang.String r11 = java.lang.String.valueOf(r2)
            boolean r12 = r1.getPrivateDnsActive()
            java.lang.String r13 = r1.getPrivateDnsServerName()
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r1 = r4
            goto L_0x00dc
        L_0x008e:
            int r1 = r3.getType()
            if (r1 != r5) goto L_0x00c5
            java.lang.String r1 = r3.getExtraInfo()
            if (r1 == 0) goto L_0x00be
            java.lang.String r1 = ""
            java.lang.String r2 = r3.getExtraInfo()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00be
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r1 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            r6 = 1
            int r7 = r3.getType()
            int r8 = r3.getSubtype()
            r9 = 0
            java.lang.String r10 = r3.getExtraInfo()
            r11 = 0
            java.lang.String r12 = ""
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00dc
        L_0x00be:
            r3.getType()
            r3.getSubtype()
            throw r4
        L_0x00c5:
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r1 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            r14 = 1
            int r15 = r3.getType()
            int r16 = r3.getSubtype()
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r20 = ""
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
        L_0x00dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkChangeNotifierAutoDetect.getCurrentNetworkState():org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState");
    }

    public long getDefaultNetId() {
        Network b = this.mConnectivityManagerDelegate.mo64291b();
        if (b == null) {
            return -1;
        }
        return networkToNetId(b);
    }

    public long[] getNetworksAndTypes() {
        long[] jArr = new long[(r1 + r1)];
        int i = 0;
        for (Network network : getAllNetworksFiltered(this.mConnectivityManagerDelegate, (Network) null)) {
            int i2 = i + 1;
            jArr[i] = networkToNetId(network);
            i = i2 + 1;
            jArr[i2] = (long) this.mConnectivityManagerDelegate.mo64290a(network);
        }
        return jArr;
    }

    /* access modifiers changed from: package-private */
    public RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    /* access modifiers changed from: package-private */
    public boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    /* renamed from: lambda$runOnThread$0$org-chromium-net-NetworkChangeNotifierAutoDetect */
    public /* synthetic */ void mo64012x7a563379(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    public void onReceive(Context context, Intent intent) {
        runOnThread(new C72545j(this));
    }

    public void register() {
        NetworkCapabilities c;
        if (this.mRegistered) {
            connectionTypeChanged();
            return;
        }
        if (this.mShouldSignalObserver) {
            connectionTypeChanged();
        }
        ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
        if (networkCallback != null) {
            try {
                this.mConnectivityManagerDelegate.f193059a.registerDefaultNetworkCallback(networkCallback, this.mHandler);
            } catch (RuntimeException unused) {
                this.mDefaultNetworkCallback = null;
            }
        }
        if (this.mDefaultNetworkCallback == null) {
            this.mIgnoreNextBroadcast = C72382h.f192527a.registerReceiver(this, this.mIntentFilter) != null;
        }
        this.mRegistered = true;
        C72554s sVar = this.mNetworkCallback;
        if (sVar != null) {
            Network[] r4 = getAllNetworksFiltered(sVar.f193075b.mConnectivityManagerDelegate, (Network) null);
            sVar.f193074a = null;
            if (r4.length == 1 && (c = sVar.f193075b.mConnectivityManagerDelegate.mo64292c(r4[0])) != null && c.hasTransport(4)) {
                sVar.f193074a = r4[0];
            }
            try {
                this.mConnectivityManagerDelegate.f193059a.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
            } catch (RuntimeException unused2) {
                this.mRegisterNetworkCallbackFailed = true;
                this.mNetworkCallback = null;
            }
            if (!this.mRegisterNetworkCallbackFailed && this.mShouldSignalObserver) {
                Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, (Network) null);
                long[] jArr = new long[allNetworksFiltered.length];
                for (int i = 0; i < allNetworksFiltered.length; i++) {
                    jArr[i] = networkToNetId(allNetworksFiltered[i]);
                }
                this.mObserver.purgeActiveNetworkList(jArr);
            }
        }
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    /* access modifiers changed from: package-private */
    public void setConnectivityManagerDelegateForTests(C72547l lVar) {
        this.mConnectivityManagerDelegate = lVar;
    }

    /* access modifiers changed from: package-private */
    public void setWifiManagerDelegateForTests(C72555t tVar) {
        this.mWifiManagerDelegate = tVar;
    }

    public void unregister() {
        if (this.mRegistered) {
            this.mRegistered = false;
            C72554s sVar = this.mNetworkCallback;
            if (sVar != null) {
                this.mConnectivityManagerDelegate.f193059a.unregisterNetworkCallback(sVar);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                this.mConnectivityManagerDelegate.f193059a.unregisterNetworkCallback(networkCallback);
            } else {
                C72382h.f192527a.unregisterReceiver(this);
            }
        }
    }
}
