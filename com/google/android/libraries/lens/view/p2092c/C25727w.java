package com.google.android.libraries.lens.view.p2092c;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import androidx.core.p094f.C1888a;
import com.google.android.libraries.lens.view.p2050aa.C24965m;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.c.w */
/* compiled from: PG */
final class C25727w implements C24965m {

    /* renamed from: a */
    static final ComponentName f69951a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider");

    /* renamed from: b */
    public final C60887da f69952b;

    /* renamed from: c */
    public final Context f69953c;

    /* renamed from: d */
    public final C25729y f69954d;

    /* renamed from: e */
    public final C25070bo f69955e;

    /* renamed from: f */
    public final C25043ao f69956f;

    /* renamed from: g */
    public final boolean f69957g;

    /* renamed from: h */
    public final boolean f69958h;

    /* renamed from: i */
    public final C25758g f69959i = new C25758g(false);

    /* renamed from: j */
    private C25725u f69960j;

    static {
        C58974d.m91135i("AppShortcutHelper");
    }

    public C25727w(C60887da daVar, Context context, C25729y yVar, C25070bo boVar, C25043ao aoVar, boolean z, boolean z2, Set set) {
        this.f69952b = daVar;
        this.f69953c = context;
        this.f69954d = yVar;
        this.f69955e = boVar;
        this.f69956f = aoVar;
        this.f69957g = z;
        this.f69958h = z2;
        set.add(this);
    }

    /* renamed from: a */
    public final void mo30190a() {
        mo30863c();
    }

    /* renamed from: b */
    public final void mo30862b() {
        if (this.f69960j == null) {
            this.f69960j = new C25725u(this);
            IntentFilter intentFilter = new IntentFilter("AppShortcutHelper.SHORTCUT_INSTALLED");
            if (C1888a.m5150d()) {
                this.f69953c.registerReceiver(this.f69960j, intentFilter, 4);
            } else {
                this.f69953c.registerReceiver(this.f69960j, intentFilter);
            }
        }
    }

    /* renamed from: c */
    public final void mo30863c() {
        C25725u uVar = this.f69960j;
        if (uVar != null) {
            this.f69953c.unregisterReceiver(uVar);
            this.f69960j = null;
        }
    }

    /* renamed from: d */
    public final boolean mo30864d() {
        String string = Settings.Secure.getString(this.f69953c.getContentResolver(), "selected_search_engine_aga");
        if (string == null || "NO_DATA".equals(string)) {
            string = "com.google.android.googlequicksearchbox";
        }
        return "com.google.android.googlequicksearchbox".equals(string);
    }

    /* renamed from: e */
    public final PendingIntent mo30865e(int i) {
        Intent intent = new Intent("AppShortcutHelper.SHORTCUT_INSTALLED");
        intent.setPackage(this.f69953c.getPackageName());
        intent.putExtra("LensAppShortcutType", C25726v.m47502a(i));
        return PendingIntent.getBroadcast(this.f69953c, 0, intent, 1409286144);
    }
}
