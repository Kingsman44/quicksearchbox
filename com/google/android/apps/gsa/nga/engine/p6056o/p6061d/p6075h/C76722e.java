package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.h.e */
/* compiled from: PG */
public final /* synthetic */ class C76722e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76739v f212048a;

    /* renamed from: b */
    public final /* synthetic */ C122472a f212049b;

    public /* synthetic */ C76722e(C76739v vVar, C122472a aVar) {
        this.f212048a = vVar;
        this.f212049b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C76739v vVar = this.f212048a;
        C122472a aVar = this.f212049b;
        Void voidR = (Void) obj;
        C47538ax c = vVar.f212076j.mo51613c("NGA");
        try {
            C60870cx i = aVar.mo105637i();
            if (c != null) {
                c.close();
            }
            return i;
        } catch (Throwable th) {
            C76720c.m123338a(th, th);
        }
        throw th;
    }
}
