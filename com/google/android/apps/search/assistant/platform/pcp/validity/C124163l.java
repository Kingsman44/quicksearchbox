package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.l */
/* compiled from: PG */
final class C124163l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f342889a;

    /* renamed from: b */
    final /* synthetic */ C124166o f342890b;

    public C124163l(C124166o oVar, boolean z) {
        this.f342890b = oVar;
        this.f342889a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f342890b.f342909o.mo56226d()).mo56382g(th)).mo56372aa(35428)).mo56386p("Failed to update next alarm time in database");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f342889a) {
            this.f342890b.mo106309c();
        }
    }
}
