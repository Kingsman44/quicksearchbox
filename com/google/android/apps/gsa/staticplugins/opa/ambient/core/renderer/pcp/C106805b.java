package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp;

import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.b */
/* compiled from: PG */
public final /* synthetic */ class C106805b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106816m f297657a;

    public /* synthetic */ C106805b(C106816m mVar) {
        this.f297657a = mVar;
    }

    public final Object call() {
        C106816m mVar = this.f297657a;
        C123598n nVar = mVar.f297675f;
        if (nVar != null) {
            mVar.f297671b.mo90817g(nVar);
            mVar.f297675f = null;
            if (mVar.f297673d.isPresent()) {
                mVar.f297674e.mo5707k((C2391v) mVar.f297673d.get());
            }
        }
        return C118826c.f331422a;
    }
}
