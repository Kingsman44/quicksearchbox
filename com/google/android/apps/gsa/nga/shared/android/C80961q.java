package com.google.android.apps.gsa.nga.shared.android;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import com.google.common.base.C58881cr;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.q */
/* compiled from: PG */
public final /* synthetic */ class C80961q implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f221959a;

    public /* synthetic */ C80961q(Context context) {
        this.f221959a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f221959a.getSystemService("device_policy");
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
