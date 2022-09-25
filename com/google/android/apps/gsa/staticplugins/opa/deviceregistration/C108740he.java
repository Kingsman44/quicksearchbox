package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.he */
/* compiled from: PG */
public final class C108740he extends C83869ac {

    /* renamed from: a */
    private final Context f302387a;

    public C108740he(Context context) {
        this.f302387a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133537b(new C108739hd());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        WifiManager wifiManager = (WifiManager) this.f302387a.getSystemService("wifi");
        C58976aa aaVar = C58975e.f156826a;
        wifiManager.isWifiEnabled();
        return !wifiManager.isWifiEnabled();
    }
}
