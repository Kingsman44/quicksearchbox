package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.location.ar;
import com.google.android.apps.gsa.shared.util.C90763bg;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.m */
/* compiled from: PG */
public final class C93521m extends C93518j {

    /* renamed from: a */
    private static final C59071e f261148a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.a.m");

    /* renamed from: b */
    private final WifiManager f261149b;

    /* renamed from: d */
    private final ConnectivityManager f261150d;

    /* renamed from: e */
    private final ar f261151e;

    /* renamed from: f */
    private boolean f261152f;

    /* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.m$a */
    /* compiled from: PG */
    public interface C93522a {
        /* renamed from: C */
        ar mo87937C();
    }

    public C93521m(Context context) {
        WifiManager wifiManager = (WifiManager) C39239a.m68666a(context.getApplicationContext(), C39226b.TAG_CLASSIC_ASSISTANT_VOICEACTIONS).getSystemService("wifi");
        ar C = ((C93522a) C47266f.m84076a(context.getApplicationContext(), C93522a.class)).mo87937C();
        this.f261149b = wifiManager;
        this.f261150d = (ConnectivityManager) context.getSystemService("connectivity");
        this.f261151e = C;
        if (wifiManager != null) {
            this.f261152f = wifiManager.isWifiEnabled();
        }
    }

    /* renamed from: i */
    private final WifiInfo m154242i() {
        NetworkInfo networkInfo = this.f261150d.getNetworkInfo(1);
        if (!this.f261152f || !networkInfo.isConnected()) {
            return null;
        }
        C91018d.m148680c();
        try {
            return (WifiInfo) C90877ak.m148472f(this.f261151e.a(C39226b.TAG_CLASSIC_ASSISTANT_VOICEACTIONS));
        } catch (InterruptedException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f261148a.mo56225c()).mo56382g(e)).mo56372aa(13762)).mo56386p("can't get wifi connection info");
            return null;
        }
    }

    /* renamed from: a */
    public final int mo87923a() {
        WifiInfo i = m154242i();
        if (i == null) {
            return R.drawable.ic_wifi_off_action_card_material;
        }
        int calculateSignalLevel = WifiManager.calculateSignalLevel(i.getRssi(), 5);
        if (calculateSignalLevel == 1) {
            return R.drawable.ic_wifi_1_action_card_material;
        }
        if (calculateSignalLevel == 2) {
            return R.drawable.ic_wifi_2_action_card_material;
        }
        if (calculateSignalLevel != 3) {
            return calculateSignalLevel != 4 ? R.drawable.ic_wifi_off_action_card_material : R.drawable.ic_wifi_4_action_card_material;
        }
        return R.drawable.ic_wifi_3_action_card_material;
    }

    /* renamed from: b */
    public final int mo87924b() {
        return this.f261152f ? R.string.wifi_on : R.string.wifi_off;
    }

    /* renamed from: c */
    public final int mo87925c() {
        return -1;
    }

    /* renamed from: d */
    public final IntentFilter mo87926d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.NETWORK_IDS_CHANGED");
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
        return intentFilter;
    }

    /* renamed from: e */
    public final CharSequence mo87927e(Resources resources) {
        if (!this.f261152f) {
            return BuildConfig.FLAVOR;
        }
        WifiInfo i = m154242i();
        if (i != null) {
            String ssid = i.getSSID();
            if (!TextUtils.isEmpty(ssid)) {
                return C90763bg.m148262b(ssid);
            }
            return BuildConfig.FLAVOR;
        }
        Network[] allNetworks = this.f261150d.getAllNetworks();
        if (allNetworks != null) {
            for (Network networkCapabilities : allNetworks) {
                NetworkCapabilities networkCapabilities2 = this.f261150d.getNetworkCapabilities(networkCapabilities);
                if (networkCapabilities2 != null && networkCapabilities2.hasTransport(1)) {
                    return resources.getString(R.string.no_wifi_network_connected);
                }
            }
        }
        return resources.getString(R.string.no_wifi_networks_available);
    }

    /* renamed from: f */
    public final void mo87928f() {
        WifiManager wifiManager = this.f261149b;
        if (wifiManager != null) {
            this.f261152f = wifiManager.isWifiEnabled();
        }
    }

    /* renamed from: g */
    public final boolean mo87929g() {
        return this.f261152f;
    }
}
