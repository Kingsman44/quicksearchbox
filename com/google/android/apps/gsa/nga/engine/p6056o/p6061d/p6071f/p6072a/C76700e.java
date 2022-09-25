package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6071f.p6072a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122401at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.f.a.e */
/* compiled from: PG */
public final /* synthetic */ class C76700e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76703h f212002a;

    /* renamed from: b */
    public final /* synthetic */ C122401at f212003b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f212004c;

    public /* synthetic */ C76700e(C76703h hVar, C122401at atVar, C74965n nVar) {
        this.f212002a = hVar;
        this.f212003b = atVar;
        this.f212004c = nVar;
    }

    public final C60870cx apply(Object obj) {
        C76703h hVar = this.f212002a;
        C122401at atVar = this.f212003b;
        C74965n nVar = this.f212004c;
        C122472a aVar = (C122472a) obj;
        C47538ax c = hVar.f212015f.mo51613c("NGA");
        try {
            C60870cx e = aVar.mo105633e(atVar, hVar.f212016g.mo72285a(nVar));
            if (c != null) {
                c.close();
            }
            return e;
        } catch (Throwable th) {
            C76696a.m123306a(th, th);
        }
        throw th;
    }
}
