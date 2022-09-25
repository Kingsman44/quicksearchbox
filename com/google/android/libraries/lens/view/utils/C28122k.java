package com.google.android.libraries.lens.view.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.provider.Settings;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.utils.k */
/* compiled from: PG */
public final class C28122k {

    /* renamed from: a */
    private static final C58974d f76519a = C58974d.m91135i("DeviceUtils");

    /* renamed from: a */
    public static int m52401a(Context context) {
        try {
            return ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
        } catch (RuntimeException e) {
            ((C58970a) ((C58970a) ((C58970a) f76519a.mo56226d()).mo56382g(e)).mo56372aa(50260)).mo56386p("Not able to retrieve GLES version.");
            return 0;
        }
    }

    /* renamed from: b */
    public static int m52402b(View view) {
        DisplayCutout displayCutout;
        int safeInsetTop;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || (safeInsetTop = displayCutout.getSafeInsetTop()) <= 0) {
            return 0;
        }
        return safeInsetTop;
    }

    /* renamed from: c */
    public static int m52403c(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: d */
    public static C60870cx m52404d(Context context, C60887da daVar) {
        return C60856cj.m92904m(C47810es.m84978r(new C28121j(context)), daVar);
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m52405e(Context context) {
        try {
            boolean z = true;
            if (Settings.Secure.getInt(context.getContentResolver(), "ui_translation_enabled") != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Settings.SettingNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) f76519a.mo56224b()).mo56382g(e)).mo56372aa(50261)).mo56386p("Live Translate secure setting not found.");
            return false;
        }
    }

    /* renamed from: f */
    public static Locale m52406f(Context context) {
        Locale locale = C1897j.m5167d(C1894g.m5157a(context.getResources().getConfiguration())).f5774b.f5775a.get(0);
        locale.getClass();
        return locale;
    }
}
