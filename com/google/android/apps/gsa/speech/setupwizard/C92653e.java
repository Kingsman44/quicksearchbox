package com.google.android.apps.gsa.speech.setupwizard;

import android.content.ComponentName;
import android.content.Context;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.setupwizard.e */
/* compiled from: PG */
public final class C92653e {

    /* renamed from: a */
    private final Context f258634a;

    public C92653e(Context context) {
        this.f258634a = context;
    }

    /* renamed from: a */
    public final void mo87423a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f258634a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f258634a, "com.google.android.apps.gsa.speech.setupwizard.HotwordOptionalStep"), 2, 1);
    }
}
