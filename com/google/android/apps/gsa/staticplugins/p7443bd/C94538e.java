package com.google.android.apps.gsa.staticplugins.p7443bd;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bd.e */
/* compiled from: PG */
final class C94538e extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C94540g f264423a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94538e(C94540g gVar) {
        super("Hallmonitor auth timeout", 2, 0);
        this.f264423a = gVar;
    }

    public final void run() {
        this.f264423a.f264426b = true;
        C60870cx cxVar = this.f264423a.f264425a;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }
}
