package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.evernote.android.state.BuildConfig;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: org.chromium.net.k */
/* compiled from: PG */
final class C72546k extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    LinkProperties f193056a;

    /* renamed from: b */
    NetworkCapabilities f193057b;

    /* renamed from: c */
    final /* synthetic */ NetworkChangeNotifierAutoDetect f193058c;

    public C72546k(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f193058c = networkChangeNotifierAutoDetect;
    }

    /* renamed from: a */
    private final NetworkChangeNotifierAutoDetect.NetworkState m107238a(Network network) {
        int i;
        int i2;
        int i3;
        int i4 = -1;
        if (this.f193057b.hasTransport(1) || this.f193057b.hasTransport(5)) {
            i2 = 1;
        } else if (this.f193057b.hasTransport(0)) {
            NetworkInfo e = this.f193058c.mConnectivityManagerDelegate.mo64294e(network);
            if (e != null) {
                i4 = e.getSubtype();
            }
            i = i4;
            i2 = 0;
            return new NetworkChangeNotifierAutoDetect.NetworkState(true, i2, i, !this.f193057b.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.f193056a.isPrivateDnsActive(), this.f193056a.getPrivateDnsServerName());
        } else if (this.f193057b.hasTransport(3)) {
            i2 = 9;
        } else if (this.f193057b.hasTransport(2)) {
            i2 = 7;
        } else if (this.f193057b.hasTransport(4)) {
            NetworkInfo d = this.f193058c.mConnectivityManagerDelegate.mo64293d(network);
            if (d != null) {
                i3 = d.getType();
            } else {
                i3 = 17;
            }
            i2 = i3;
        } else {
            i2 = -1;
        }
        i = -1;
        return new NetworkChangeNotifierAutoDetect.NetworkState(true, i2, i, !this.f193057b.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.f193056a.isPrivateDnsActive(), this.f193056a.getPrivateDnsServerName());
    }

    public final void onAvailable(Network network) {
        this.f193056a = null;
        this.f193057b = null;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.f193057b = networkCapabilities;
        if (this.f193058c.mRegistered && this.f193056a != null && this.f193057b != null) {
            this.f193058c.connectionTypeChangedTo(m107238a(network));
        }
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.f193056a = linkProperties;
        if (this.f193058c.mRegistered && this.f193056a != null && this.f193057b != null) {
            this.f193058c.connectionTypeChangedTo(m107238a(network));
        }
    }

    public final void onLost(Network network) {
        this.f193056a = null;
        this.f193057b = null;
        if (this.f193058c.mRegistered) {
            this.f193058c.connectionTypeChangedTo(new NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, false, (String) null, false, BuildConfig.FLAVOR));
        }
    }
}
