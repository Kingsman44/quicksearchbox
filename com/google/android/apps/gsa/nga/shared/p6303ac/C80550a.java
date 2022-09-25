package com.google.android.apps.gsa.nga.shared.p6303ac;

import android.content.Context;
import android.provider.Settings;

/* renamed from: com.google.android.apps.gsa.nga.shared.ac.a */
/* compiled from: PG */
public final class C80550a {

    /* renamed from: a */
    private final Context f221103a;

    public C80550a(Context context) {
        this.f221103a = context;
    }

    /* renamed from: a */
    public final boolean mo74349a() {
        try {
            if (Settings.Secure.getInt(this.f221103a.getContentResolver(), "assist_structure_enabled") == 1) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }
}
