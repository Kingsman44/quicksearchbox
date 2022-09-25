package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.ap */
/* compiled from: PG */
public final class C106450ap {

    /* renamed from: a */
    private final Context f296929a;

    /* renamed from: b */
    private final C58974d f296930b;

    public C106450ap(Context context, C83564a aVar) {
        this.f296929a = context;
        this.f296930b = aVar.mo76900a("AppUsageUtils");
    }

    /* renamed from: a */
    public final Optional mo95540a() {
        if (this.f296929a.checkSelfPermission("android.permission.PACKAGE_USAGE_STATS") != -1) {
            return Optional.ofNullable((UsageStatsManager) this.f296929a.getSystemService("usagestats"));
        }
        ((C58970a) ((C58970a) this.f296930b.mo56226d()).mo56372aa(23084)).mo56386p("Missing Package Usage Stats permission");
        return Optional.empty();
    }
}
