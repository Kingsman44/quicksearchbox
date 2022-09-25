package com.google.android.apps.gsa.opa.p6435c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3745ab.C48273ca;

/* renamed from: com.google.android.apps.gsa.opa.c.e */
/* compiled from: PG */
public final /* synthetic */ class C83593e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C83600l f227899a;

    /* renamed from: b */
    public final /* synthetic */ C22411a f227900b;

    public /* synthetic */ C83593e(C83600l lVar, C22411a aVar) {
        this.f227899a = lVar;
        this.f227900b = aVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118826c cVar;
        C83600l lVar = this.f227899a;
        C22411a aVar = this.f227900b;
        synchronized (lVar.f227909d) {
            if (!lVar.mo76956c()) {
                lVar.mo76955b();
                aVar.mo27600a(2, (C48273ca) null);
                cVar = C118826c.f331422a;
            } else {
                throw new IllegalStateException("Call connect timeout future executed after call connected.");
            }
        }
        return cVar;
    }
}
