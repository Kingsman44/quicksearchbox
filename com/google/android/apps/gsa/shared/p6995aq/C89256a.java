package com.google.android.apps.gsa.shared.p6995aq;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.provider.Settings;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.aq.a */
/* compiled from: PG */
public final class C89256a {

    /* renamed from: a */
    private static final C59071e f242017a = C59071e.m91332i("com.google.android.apps.gsa.shared.aq.a");

    /* renamed from: b */
    private final Context f242018b;

    public C89256a(Context context) {
        this.f242018b = context;
    }

    /* renamed from: e */
    private final boolean m145184e(String str) {
        int identifier = Resources.getSystem().getIdentifier(str, "bool", "android");
        if (identifier != 0) {
            return this.f242018b.getResources().getBoolean(identifier);
        }
        ((C59052c) ((C59052c) f242017a.mo56225c()).mo56372aa(11061)).mo56389s("Failed to get system boolean resource ID for %s.", str);
        return false;
    }

    /* renamed from: a */
    public final int mo83213a() {
        PackageManager packageManager = this.f242018b.getPackageManager();
        String b = mo83214b();
        if (b == null) {
            return -1;
        }
        try {
            return packageManager.getPackageInfo(b, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final String mo83214b() {
        PackageManager packageManager = this.f242018b.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            return null;
        }
        return resolveActivity.activityInfo.packageName;
    }

    /* renamed from: c */
    public final boolean mo83215c() {
        boolean e = m145184e("config_swipe_up_gesture_default");
        if (m145184e("config_swipe_up_gesture_setting_available")) {
            return Settings.Secure.getInt(this.f242018b.getContentResolver(), "swipe_up_to_switch_apps_enabled", e ? 1 : 0) == 1;
        }
        return e;
    }

    /* renamed from: d */
    public final int mo83216d() {
        int identifier = Resources.getSystem().getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier == 0) {
            return -1;
        }
        try {
            return this.f242018b.getResources().getInteger(identifier);
        } catch (Resources.NotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f242017a.mo56226d()).mo56382g(e)).mo56372aa(11060)).mo56389s("Failed to get system integer resource ID for %s.", "config_navBarInteractionMode");
            return -1;
        }
    }
}
