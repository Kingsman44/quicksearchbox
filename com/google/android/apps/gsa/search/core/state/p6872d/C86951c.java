package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.c */
/* compiled from: PG */
public final /* synthetic */ class C86951c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C86954f f234866a;

    public /* synthetic */ C86951c(C86954f fVar) {
        this.f234866a = fVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C86954f fVar = this.f234866a;
        if (((Boolean) obj).booleanValue()) {
            C58838bb.m90883r(fVar.f234872d);
            fVar.f234872d = false;
            fVar.f234871c.remove();
            fVar.mo80610i();
            fVar.mo80609g();
            return;
        }
        fVar.mo80608e();
    }
}
