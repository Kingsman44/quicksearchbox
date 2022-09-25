package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.p6074a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122399ar;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.g.a.i */
/* compiled from: PG */
public final /* synthetic */ class C76713i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76716l f212036a;

    /* renamed from: b */
    public final /* synthetic */ C122399ar f212037b;

    public /* synthetic */ C76713i(C76716l lVar, C122399ar arVar) {
        this.f212036a = lVar;
        this.f212037b = arVar;
    }

    public final C60870cx apply(Object obj) {
        C76716l lVar = this.f212036a;
        C122399ar arVar = this.f212037b;
        C122472a aVar = (C122472a) obj;
        C47538ax c = lVar.f212041b.mo51613c("NGA");
        try {
            C60870cx j = aVar.mo105638j(arVar);
            if (c != null) {
                c.close();
            }
            return j;
        } catch (Throwable th) {
            C76711g.m123322a(th, th);
        }
        throw th;
    }
}
