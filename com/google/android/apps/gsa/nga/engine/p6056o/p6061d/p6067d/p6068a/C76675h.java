package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C76675h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f211953a;

    /* renamed from: b */
    public final /* synthetic */ C76684q f211954b;

    /* renamed from: c */
    public final /* synthetic */ C122549e f211955c;

    public /* synthetic */ C76675h(C47770dh dhVar, C76684q qVar, C122549e eVar) {
        this.f211953a = dhVar;
        this.f211954b = qVar;
        this.f211955c = eVar;
    }

    public final void run() {
        C47770dh dhVar = this.f211953a;
        C76684q qVar = this.f211954b;
        C122549e eVar = this.f211955c;
        C47538ax c = dhVar.mo51613c("NGA");
        try {
            C122502bb bbVar = qVar.f211972a;
            if (bbVar != null) {
                eVar.mo105651c(bbVar);
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C76670c.m123281a(th, th);
        }
        throw th;
    }
}
