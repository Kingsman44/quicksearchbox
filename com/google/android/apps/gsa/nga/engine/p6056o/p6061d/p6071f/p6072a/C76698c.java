package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6071f.p6072a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122456k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.f.a.c */
/* compiled from: PG */
public final /* synthetic */ class C76698c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76703h f211995a;

    /* renamed from: b */
    public final /* synthetic */ C122456k f211996b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f211997c;

    public /* synthetic */ C76698c(C76703h hVar, C122456k kVar, C74965n nVar) {
        this.f211995a = hVar;
        this.f211996b = kVar;
        this.f211997c = nVar;
    }

    public final C60870cx apply(Object obj) {
        C76703h hVar = this.f211995a;
        C122456k kVar = this.f211996b;
        C74965n nVar = this.f211997c;
        C122472a aVar = (C122472a) obj;
        C47538ax c = hVar.f212015f.mo51613c("NGA");
        try {
            C60870cx c2 = aVar.mo105631c(kVar, hVar.f212016g.mo72285a(nVar));
            if (c != null) {
                c.close();
            }
            return c2;
        } catch (Throwable th) {
            C76696a.m123306a(th, th);
        }
        throw th;
    }
}
