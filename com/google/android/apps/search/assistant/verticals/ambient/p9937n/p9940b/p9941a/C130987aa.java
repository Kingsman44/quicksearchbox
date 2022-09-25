package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.aa */
/* compiled from: PG */
public final class C130987aa {

    /* renamed from: a */
    private final Context f358376a;

    /* renamed from: b */
    private final C58974d f358377b;

    public C130987aa(Context context, C130603a aVar) {
        this.f358376a = context;
        this.f358377b = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final Optional mo110020a() {
        if (this.f358376a.checkSelfPermission("android.permission.PACKAGE_USAGE_STATS") != -1) {
            return Optional.ofNullable((UsageStatsManager) this.f358376a.getSystemService("usagestats"));
        }
        ((C58970a) ((C58970a) this.f358377b.mo56226d()).mo56372aa(39021)).mo56386p("Missing Package Usage Stats permission");
        return Optional.empty();
    }
}
