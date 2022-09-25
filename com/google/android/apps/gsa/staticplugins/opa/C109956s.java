package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s */
/* compiled from: PG */
final class C109956s extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C60870cx f306403a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109956s(C60870cx cxVar) {
        super("Auth timeout task", 1, 0);
        this.f306403a = cxVar;
    }

    public final void run() {
        this.f306403a.cancel(true);
    }
}
