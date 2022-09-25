package com.google.android.apps.gsa.shared.bisto.p7029b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60105ky;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.g */
/* compiled from: PG */
public final class C89636g {
    /* renamed from: a */
    public static Intent m145895a(Context context, String str, String str2, int i, C60105ky kyVar) {
        ComponentName componentName = new ComponentName(context, "com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.OobeActivity");
        C90476a aVar = C91018d.f254254a;
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        Intent addFlags = new Intent().setComponent(componentName).putExtra("key_device_id", str).putExtra("oobe_trigger", kyVar.f162530s).addFlags(268468224);
        if (str2 != null) {
            addFlags.putExtra("model_id", str2);
        }
        addFlags.putExtra("mode", i);
        return addFlags;
    }

    /* renamed from: b */
    public static C124633az m145896b(Intent intent) {
        if (intent.hasExtra("EXTRA_OOBE_STATE")) {
            return C124633az.m204299a(intent.getIntExtra("EXTRA_OOBE_STATE", -1));
        }
        return null;
    }

    /* renamed from: c */
    public static void m145897c(Intent intent) {
        intent.putExtra("extra_bisto_ble", true);
    }

    /* renamed from: d */
    public static boolean m145898d(Intent intent) {
        return intent.getBooleanExtra("extra_bisto_ble", false);
    }

    /* renamed from: e */
    public static boolean m145899e(Intent intent) {
        return intent.getBooleanExtra("extra_bisto_simple_bt", false);
    }

    /* renamed from: f */
    public static void m145900f(Context context, String str, C124633az azVar) {
        Intent intent = new Intent("bisto_set_headphones_enable_state");
        intent.putExtra("extra_enable_state", true);
        if (azVar != null) {
            intent.putExtra("EXTRA_OOBE_STATE", azVar.f343841h);
        }
        intent.putExtra("key_device_id", str);
        C124519a.m203974a(context, intent);
    }

    /* renamed from: g */
    public static void m145901g(Context context, String str, boolean z, C58833ax axVar, C58833ax axVar2) {
        Intent intent = new Intent("bisto_set_gacs_opa_enable_state");
        m145897c(intent);
        intent.putExtra("extra_enable_state", true);
        intent.putExtra("key_device_id", str);
        if (z && axVar.mo56113h() && axVar2.mo56113h()) {
            intent.putExtra("acct_sync_on", true);
            intent.putExtra("account_name", (String) axVar.mo56107c());
            intent.putExtra("host_device_id", (String) axVar2.mo56107c());
        }
        C124519a.m203974a(context, intent);
    }
}
