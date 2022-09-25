package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.d */
/* compiled from: PG */
public final class C95529d implements C95538m {

    /* renamed from: a */
    private final Context f267331a;

    /* renamed from: b */
    private final C95307m f267332b;

    /* renamed from: c */
    private final C21370a f267333c;

    public C95529d(Context context, C95307m mVar, C21370a aVar) {
        this.f267331a = context;
        this.f267332b = mVar;
        this.f267333c = aVar;
    }

    /* renamed from: a */
    public final C94640d mo89393a() {
        if (!C36619a.m65148d(this.f267331a)) {
            Context context = this.f267331a;
            return new C94650n(context, this.f267332b, this.f267333c, context.getString(R.string.no_notif_permission_fetch), (Uri) null);
        }
        int i = Settings.Global.getInt(this.f267331a.getContentResolver(), "airplane_mode_on", 0);
        WifiManager wifiManager = (WifiManager) this.f267331a.getApplicationContext().getSystemService("wifi");
        if (i == 0 || wifiManager.isWifiEnabled()) {
            return null;
        }
        Context context2 = this.f267331a;
        return new C94650n(context2, this.f267332b, this.f267333c, context2.getString(R.string.airplane_mode_enabled), (Uri) null);
    }

    /* renamed from: b */
    public final void mo89394b() {
    }

    /* renamed from: c */
    public final boolean mo89395c() {
        return true;
    }
}
