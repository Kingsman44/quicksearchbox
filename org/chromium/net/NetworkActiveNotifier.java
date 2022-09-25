package org.chromium.net;

import android.net.ConnectivityManager;
import org.chromium.base.C72382h;
import p000J.C0000N;

/* compiled from: PG */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    private boolean mAreNotificationsEnabled;
    private final ConnectivityManager mConnectivityManager = ((ConnectivityManager) C72382h.f192527a.getSystemService("connectivity"));
    private final long mNativeNetworkActiveObserver;

    private NetworkActiveNotifier(long j) {
        this.mNativeNetworkActiveObserver = j;
    }

    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }

    public void disableNotifications() {
        this.mAreNotificationsEnabled = false;
        this.mConnectivityManager.removeDefaultNetworkActiveListener(this);
    }

    public void enableNotifications() {
        this.mAreNotificationsEnabled = true;
        this.mConnectivityManager.addDefaultNetworkActiveListener(this);
    }

    public void fakeDefaultNetworkActive() {
        if (this.mAreNotificationsEnabled) {
            onNetworkActive();
        }
    }

    public boolean isDefaultNetworkActive() {
        return this.mConnectivityManager.isDefaultNetworkActive();
    }

    public void onNetworkActive() {
        C0000N.MSZPA7qE(this.mNativeNetworkActiveObserver);
    }
}
