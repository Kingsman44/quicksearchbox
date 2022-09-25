package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60872cz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.o */
/* compiled from: PG */
public final /* synthetic */ class C95200o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95210y f266342a;

    /* renamed from: b */
    public final /* synthetic */ C95205t f266343b;

    /* renamed from: c */
    public final /* synthetic */ C95174a f266344c;

    public /* synthetic */ C95200o(C95210y yVar, C95205t tVar, C95174a aVar) {
        this.f266342a = yVar;
        this.f266343b = tVar;
        this.f266344c = aVar;
    }

    public final void run() {
        C95210y yVar = this.f266342a;
        C95205t tVar = this.f266343b;
        C95174a aVar = this.f266344c;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (yVar.f266362l) {
            C60872cz czVar = yVar.f266369s;
            if (czVar != null) {
                czVar.cancel(false);
                yVar.f266369s = null;
            }
        }
        if (!tVar.mo89111a()) {
            aVar.mo89085a();
        }
    }
}
