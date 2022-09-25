package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl;

import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.g */
/* compiled from: PG */
public final /* synthetic */ class C81852g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81865t f223842a;

    public /* synthetic */ C81852g(C81865t tVar) {
        this.f223842a = tVar;
    }

    public final void run() {
        C81865t tVar = this.f223842a;
        C59104x b = C81865t.f223856a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TransparentAssistCont");
        ((C59052c) ((C59052c) b).mo56372aa(6292)).mo56386p("onDestroy");
        C22871g gVar = tVar.f223858c;
        C83363m mVar = tVar.f223862g;
        Objects.requireNonNull(mVar);
        gVar.mo28212l("[NGA] subscriptionsManager.dispose", new C81858m(mVar));
        tVar.f223864i.mo76660b(false);
        tVar.f223861f.mo76661a();
    }
}
