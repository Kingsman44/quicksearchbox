package com.google.android.enterprise.connectedapps;

import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.enterprise.connectedapps.a */
/* compiled from: PG */
public class C142539a {

    /* renamed from: a */
    private boolean f386792a = false;

    /* renamed from: b */
    private boolean f386793b = false;

    /* renamed from: c */
    private boolean f386794c = false;

    /* renamed from: d */
    private boolean f386795d = false;

    /* renamed from: a */
    public final boolean mo117142a(Context context) {
        if (!this.f386792a) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo != null) {
                    if (packageInfo.requestedPermissions != null) {
                        for (String str : packageInfo.requestedPermissions) {
                            if (str.equals("android.permission.INTERACT_ACROSS_PROFILES")) {
                                this.f386793b = true;
                            } else if (str.equals("android.permission.INTERACT_ACROSS_USERS")) {
                                this.f386794c = true;
                            } else if (str.equals("android.permission.INTERACT_ACROSS_USERS_FULL")) {
                                this.f386795d = true;
                            }
                        }
                        this.f386792a = true;
                    }
                }
                this.f386792a = true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AbstractProfileBinder", "Could not find package.", e);
                this.f386793b = false;
                this.f386794c = false;
                this.f386795d = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && this.f386793b && ((CrossProfileApps) context.getSystemService(CrossProfileApps.class)).canInteractAcrossProfiles()) {
            return true;
        }
        if (!this.f386795d || context.checkSelfPermission("android.permission.INTERACT_ACROSS_USERS_FULL") != 0) {
            return this.f386794c && context.checkSelfPermission("android.permission.INTERACT_ACROSS_USERS") == 0;
        }
        return true;
    }
}
