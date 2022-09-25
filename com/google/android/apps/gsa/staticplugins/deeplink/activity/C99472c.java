package com.google.android.apps.gsa.staticplugins.deeplink.activity;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.activity.c */
/* compiled from: PG */
public final class C99472c implements C86109e {

    /* renamed from: a */
    private final Context f278354a;

    public C99472c(Context context) {
        this.f278354a = context;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f278354a.getPackageManager().setComponentEnabledSetting(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.deeplink.DeeplinkActivityEntrypoint"), 0, 1);
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        mo70818a(tVar, C86117m.f232762a);
    }
}
