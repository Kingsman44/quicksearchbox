package com.google.android.apps.search.assistant.verticals.familyshare.p10063a;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.a.e */
/* compiled from: PG */
public final /* synthetic */ class C132372e implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C132372e f361349a = new C132372e();

    private /* synthetic */ C132372e() {
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C132370c cVar = (C132370c) obj;
        C58976aa aaVar = C58975e.f156826a;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) cVar.f361342a.getSystemService("device_policy");
        List<ComponentName> activeAdmins = ((DevicePolicyManager) Objects.requireNonNull(devicePolicyManager)).getActiveAdmins();
        if (activeAdmins != null) {
            Iterator<ComponentName> it = activeAdmins.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                        cxVar = C60856cj.m92900i(true);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cxVar = C60856cj.m92900i(false);
        return C47633f.m84733g(cxVar).mo51516i(new C132368a(cVar), cVar.f361346e);
    }
}
