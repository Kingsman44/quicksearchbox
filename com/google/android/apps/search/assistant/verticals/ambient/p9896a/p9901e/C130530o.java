package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9901e;

import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.e.o */
/* compiled from: PG */
final class C130530o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C50819dp f357562a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f357563b;

    /* renamed from: c */
    final /* synthetic */ C130531p f357564c;

    public C130530o(C130531p pVar, C50819dp dpVar, C60870cx cxVar) {
        this.f357564c = pVar;
        this.f357562a = dpVar;
        this.f357563b = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C46459k.m82829b(this.f357564c.mo109721d(this.f357562a, 3, th.toString(), this.f357563b), "Failed to store the update to Geller storage.", new Object[0]);
        ((C58970a) ((C58970a) this.f357564c.f357565a.mo56226d()).mo56372aa(38902)).mo56389s("Failed to send Smartspace card update to AiAi: %s", th.getMessage());
        this.f357564c.mo109720c(this.f357562a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C46459k.m82829b(this.f357564c.mo109721d(this.f357562a, 2, BuildConfig.FLAVOR, this.f357563b), "Failed to store the update to Geller storage.", new Object[0]);
        ((C58970a) ((C58970a) this.f357564c.f357565a.mo56224b()).mo56372aa(38903)).mo56386p("Smartspace card update to AiAi successfully");
        this.f357564c.mo109720c(this.f357562a);
    }
}
