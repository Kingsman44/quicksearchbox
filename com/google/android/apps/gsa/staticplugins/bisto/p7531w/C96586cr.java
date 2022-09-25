package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.p10712d.C142458gb;
import com.google.android.p10712d.C142462gf;
import com.google.android.p10712d.C142468gl;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.cr */
/* compiled from: PG */
class C96586cr {

    /* renamed from: b */
    public C60870cx f270191b;

    /* renamed from: c */
    final /* synthetic */ C96588ct f270192c;

    public C96586cr(C96588ct ctVar) {
        this.f270192c = ctVar;
    }

    /* renamed from: a */
    public boolean mo90252a(C142462gf gfVar) {
        return true;
    }

    /* renamed from: b */
    public boolean mo90253b(C142468gl glVar) {
        return true;
    }

    /* renamed from: c */
    public final void mo90254c() {
        synchronized (this.f270192c) {
            C60870cx cxVar = this.f270191b;
            if (cxVar != null && !cxVar.isDone()) {
                this.f270191b.cancel(false);
            }
            this.f270191b = null;
        }
    }

    /* renamed from: d */
    public void mo90255d(C142458gb gbVar) {
    }
}
