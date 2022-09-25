package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public class BuildInfo {

    /* renamed from: m */
    private static String f192475m = "";

    /* renamed from: a */
    public final String f192476a;

    /* renamed from: b */
    public final long f192477b;

    /* renamed from: c */
    public final String f192478c;

    /* renamed from: d */
    public final long f192479d;

    /* renamed from: e */
    public final String f192480e;

    /* renamed from: f */
    public final String f192481f;

    /* renamed from: g */
    public final String f192482g;

    /* renamed from: h */
    public final String f192483h;

    /* renamed from: i */
    public final String f192484i;

    /* renamed from: j */
    public final String f192485j;

    /* renamed from: k */
    public final String f192486k;

    /* renamed from: l */
    public final boolean f192487l;

    public BuildInfo() {
        PackageInfo packageInfo;
        try {
            Context context = C72382h.f192527a;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 0);
            long longVersionCode = packageInfo2.getLongVersionCode();
            this.f192477b = longVersionCode;
            this.f192478c = packageName;
            this.f192479d = longVersionCode;
            this.f192480e = m107012a(packageInfo2.versionName);
            context.getApplicationInfo();
            this.f192476a = m107012a(packageManager.getApplicationLabel(packageInfo2.applicationInfo));
            this.f192481f = m107012a(packageManager.getInstallerPackageName(packageName));
            try {
                packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            this.f192482g = packageInfo != null ? String.valueOf(packageInfo.getLongVersionCode()) : "gms versionCode not available.";
            String str = "true";
            try {
                packageManager.getPackageInfo("projekt.substratum", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "false";
            }
            this.f192485j = str;
            this.f192486k = "Not Enabled";
            this.f192483h = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            this.f192484i = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                z = true;
            }
            this.f192487l = z;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static String m107012a(CharSequence charSequence) {
        return charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
    }

    private static String[] getAll() {
        String str;
        BuildInfo buildInfo = C72378d.f192524a;
        String packageName = C72382h.f192527a.getPackageName();
        String[] strArr = new String[27];
        boolean z = false;
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(Build.VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(buildInfo.f192477b);
        strArr[10] = buildInfo.f192476a;
        strArr[11] = buildInfo.f192478c;
        strArr[12] = String.valueOf(buildInfo.f192479d);
        strArr[13] = buildInfo.f192480e;
        strArr[14] = buildInfo.f192484i;
        strArr[15] = buildInfo.f192482g;
        strArr[16] = buildInfo.f192481f;
        strArr[17] = buildInfo.f192483h;
        strArr[18] = f192475m;
        strArr[19] = buildInfo.f192485j;
        strArr[20] = buildInfo.f192486k;
        strArr[21] = String.valueOf(C72382h.f192527a.getApplicationInfo().targetSdkVersion);
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            z = true;
        }
        String str2 = "0";
        strArr[22] = true != z ? str2 : "1";
        if (true != buildInfo.f192487l) {
            str = str2;
        } else {
            str = "1";
        }
        strArr[23] = str;
        strArr[24] = Build.VERSION.INCREMENTAL;
        strArr[25] = Build.HARDWARE;
        if (true == C1888a.m5150d()) {
            str2 = "1";
        }
        strArr[26] = str2;
        return strArr;
    }
}
