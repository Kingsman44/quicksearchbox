package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.gsa.nga.engine.p5903ai.C74843aq;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.k */
/* compiled from: PG */
public final /* synthetic */ class C76678k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76687t f211960a;

    public /* synthetic */ C76678k(C76687t tVar) {
        this.f211960a = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76687t tVar = this.f211960a;
        C122472a aVar = (C122472a) obj;
        C47538ax c = tVar.f211977e.mo51613c("NGA");
        try {
            C122549e a = aVar.mo105629a();
            C76685r rVar = tVar.f211975c;
            C22719w wVar = new C22719w();
            ((C76669b) rVar).f211931b.b(wVar, C74843aq.f209020a);
            C52091ex a2 = wVar.mo27874a();
            C76689v vVar = tVar.f211982j;
            a.mo105650b(vVar.f211988d.mo72323a(a2, vVar.f211987c, vVar.f211989e, vVar.f211986b.mo74223h(vVar.f211985a.b())));
            if (c != null) {
                c.close();
            }
            return a;
        } catch (Throwable th) {
            C76670c.m123281a(th, th);
        }
        throw th;
    }
}
