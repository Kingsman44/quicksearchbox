package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.provider.Settings;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C102918b implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C102977f f287390a;

    public /* synthetic */ C102918b(C102977f fVar) {
        this.f287390a = fVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        String string = Settings.Secure.getString(this.f287390a.f287549a.getContentResolver(), "enabled_accessibility_services");
        boolean z = false;
        if (string != null && string.contains("com.google.android.apps.accessibility.voiceaccess")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
