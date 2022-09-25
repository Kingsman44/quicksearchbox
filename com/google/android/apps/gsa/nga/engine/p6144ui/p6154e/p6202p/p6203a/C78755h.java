package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.p.a.h */
/* compiled from: PG */
public final /* synthetic */ class C78755h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78757j f216804a;

    public /* synthetic */ C78755h(C78757j jVar) {
        this.f216804a = jVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78757j jVar = this.f216804a;
        if (((C78245d) obj).mo73180b().mo73175h() == 1 && ((Boolean) ((C83361k) jVar.f216808b).f227199b.get()).booleanValue()) {
            ((C59052c) ((C59052c) C78757j.f216807a.mo56226d()).mo56372aa(5300)).mo56386p("UI unexpectedly suppressed for screenshot. Restoring.");
            jVar.mo73249c();
        }
    }
}
