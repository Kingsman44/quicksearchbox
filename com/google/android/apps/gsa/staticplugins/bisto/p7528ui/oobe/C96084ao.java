package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.common.p4552o.C60105ky;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ao */
/* compiled from: PG */
public final class C96084ao {
    /* renamed from: a */
    public static C60105ky m159363a(Bundle bundle) {
        return C60105ky.m92528a(bundle.getInt("oobe_trigger", C60105ky.UNKNOWN.f162530s));
    }

    /* renamed from: b */
    public static String m159364b(Bundle bundle, C63138d dVar) {
        return (dVar == null || (dVar.f170496a & 1) == 0) ? bundle.getString("model_id") : dVar.f170497b;
    }

    /* renamed from: c */
    public static String m159365c(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("assistant_device_jwt");
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m159366d(Bundle bundle) {
        return bundle != null && bundle.getBoolean("enable_wear_data_layer_api");
    }

    /* renamed from: e */
    public static boolean m159367e(Bundle bundle) {
        return bundle != null && bundle.getBoolean("short_setup");
    }
}
