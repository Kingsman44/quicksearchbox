package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.h */
/* compiled from: PG */
public final /* synthetic */ class C91352h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ EntriesRefreshIntentService f254906a;

    /* renamed from: b */
    public final /* synthetic */ boolean f254907b;

    public /* synthetic */ C91352h(EntriesRefreshIntentService entriesRefreshIntentService, boolean z) {
        this.f254906a = entriesRefreshIntentService;
        this.f254907b = z;
    }

    public final C60870cx apply(Object obj) {
        EntriesRefreshIntentService entriesRefreshIntentService = this.f254906a;
        boolean z = this.f254907b;
        return entriesRefreshIntentService.f254798c.mo77612a((String) obj, z, false);
    }
}
