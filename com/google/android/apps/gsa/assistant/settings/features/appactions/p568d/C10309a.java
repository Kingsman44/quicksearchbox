package com.google.android.apps.gsa.assistant.settings.features.appactions.p568d;

import android.app.usage.UsageStatsManager;
import android.os.Build;
import androidx.core.p094f.C1902o;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.d.a */
/* compiled from: PG */
public final /* synthetic */ class C10309a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C10311c f34927a;

    public /* synthetic */ C10309a(C10311c cVar) {
        this.f34927a = cVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C10311c cVar = this.f34927a;
        UsageStatsManager usageStatsManager = (UsageStatsManager) cVar.f34929a.getSystemService("usagestats");
        if (usageStatsManager == null || (Build.VERSION.SDK_INT >= 30 && !C1902o.m5170a(cVar.f34929a))) {
            return C58729pv.f156485a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return C58495hd.m89898l(usageStatsManager.queryAndAggregateUsageStats(-604800000 + currentTimeMillis, currentTimeMillis));
    }
}
