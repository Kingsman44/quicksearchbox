package com.google.android.apps.gsa.staticplugins.opa;

import android.net.Uri;
import android.provider.Settings;
import com.google.android.googlequicksearchbox.R;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jz */
/* compiled from: PG */
public final class C109335jz implements C109339kb {
    /* renamed from: a */
    public final int mo97767a() {
        return R.string.opa_offline_airplane_mode_setting_name;
    }

    /* renamed from: b */
    public final Uri mo97768b() {
        return C109334jy.m182002a("airplane_mode");
    }

    /* renamed from: c */
    public final Uri mo97769c() {
        return Settings.Global.getUriFor("airplane_mode_on");
    }

    /* renamed from: d */
    public final C63490p mo97770d() {
        return C63490p.AIRPLANE_MODE;
    }
}
