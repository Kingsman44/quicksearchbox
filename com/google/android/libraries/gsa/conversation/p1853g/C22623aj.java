package com.google.android.libraries.gsa.conversation.p1853g;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.gsa.conversation.g.aj */
/* compiled from: PG */
public final /* synthetic */ class C22623aj implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62324a;

    public /* synthetic */ C22623aj(C22654bn bnVar) {
        this.f62324a = bnVar;
    }

    public final Object call() {
        C22654bn bnVar = this.f62324a;
        C22668l lVar = bnVar.f62413k;
        if (lVar != null) {
            List d = lVar.mo27781d(false);
            bnVar.f62413k = null;
            bnVar.mo27774p(d);
        }
        return bnVar.mo27764d();
    }
}
