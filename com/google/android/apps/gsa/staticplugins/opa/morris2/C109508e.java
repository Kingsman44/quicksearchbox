package com.google.android.apps.gsa.staticplugins.opa.morris2;

import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e */
/* compiled from: PG */
public final /* synthetic */ class C109508e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109710m f305011a;

    public /* synthetic */ C109508e(C109710m mVar) {
        this.f305011a = mVar;
    }

    public final void run() {
        C109710m mVar = this.f305011a;
        C58976aa aaVar = C58975e.f156826a;
        if (!mVar.f305631f.mo79746e(C90051dc.f248819aa) || !mVar.f305629d.p()) {
            C60870cx a = mVar.f305630e.mo21026a();
            C109709l lVar = new C109709l(mVar);
            C60856cj.m92911t(a, C47810es.m84974n(lVar), mVar.f305642q);
            return;
        }
        C59104x d = C109710m.f305620a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
        ((C59052c) ((C59052c) d).mo56372aa(24757)).mo56386p("#onForegroundAppPoll(): device is in landscape mode.");
        mVar.mo98040p();
        mVar.f305633h.mo21431e(C37182a.f98085fz.mo40813g());
        mVar.f305629d.n(Optional.empty());
    }
}
