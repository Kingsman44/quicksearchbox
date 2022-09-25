package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.search.core.p6816p.C86267v;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.b */
/* compiled from: PG */
final class C102476b extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C60870cx f286004a;

    /* renamed from: b */
    final /* synthetic */ C86267v f286005b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102476b(C60870cx cxVar, C86267v vVar) {
        super("Cancel response", 2, 0);
        this.f286004a = cxVar;
        this.f286005b = vVar;
    }

    public final void run() {
        if (((C60873d) this.f286004a).value instanceof C60873d.C60875b) {
            this.f286005b.close();
        }
    }
}
