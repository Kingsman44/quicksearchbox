package com.google.android.apps.gsa.staticplugins.settings;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import com.google.common.base.C58881cr;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.e */
/* compiled from: PG */
public final /* synthetic */ class C117313e implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f325653a;

    public /* synthetic */ C117313e(Context context) {
        this.f325653a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f325653a.getSystemService("device_policy");
        List<ComponentName> activeAdmins = ((DevicePolicyManager) Objects.requireNonNull(devicePolicyManager)).getActiveAdmins();
        boolean z = false;
        if (activeAdmins != null) {
            Iterator<ComponentName> it = activeAdmins.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
