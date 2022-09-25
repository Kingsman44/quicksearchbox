package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.g */
/* compiled from: PG */
public final class C30325g {

    /* renamed from: a */
    public static final String f82003a = "g";

    private C30325g() {
    }

    /* renamed from: a */
    public static C30464e m56486a(C30305n nVar, Context context) {
        CrossProfileApps crossProfileApps;
        if (!nVar.mo35859j().mo36095f() || (crossProfileApps = (CrossProfileApps) context.getSystemService(CrossProfileApps.class)) == null) {
            return null;
        }
        List<UserHandle> targetUserProfiles = crossProfileApps.getTargetUserProfiles();
        if (targetUserProfiles.isEmpty()) {
            return null;
        }
        UserHandle userHandle = targetUserProfiles.get(0);
        Drawable profileSwitchingIconDrawable = crossProfileApps.getProfileSwitchingIconDrawable(userHandle);
        CharSequence profileSwitchingLabel = crossProfileApps.getProfileSwitchingLabel(userHandle);
        C30462c g = C30464e.m56760g();
        g.mo36053f(R.id.og_ai_switch_profile);
        g.mo36052e(profileSwitchingIconDrawable);
        g.mo36054g(profileSwitchingLabel.toString());
        g.mo36056i(103027);
        ((C30466g) g).f82288b = new C30324f(crossProfileApps, userHandle, nVar, context);
        return g.mo36048a();
    }

    /* renamed from: b */
    public static boolean m56487b(Context context) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager == null) {
            Log.e(f82003a, "Failed to get DevicePolicyManager");
            return false;
        }
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName packageName : activeAdmins) {
                if (devicePolicyManager.isProfileOwnerApp(packageName.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
