package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.p.e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8536b.C111846a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112078c;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C111841e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111844h f310811a;

    public /* synthetic */ C111841e(C111844h hVar) {
        this.f310811a = hVar;
    }

    public final void run() {
        C111844h hVar = this.f310811a;
        C112078c cVar = hVar.f310817d;
        cVar.f311253d = false;
        cVar.f311254e = false;
        cVar.mo99353d();
        hVar.f310817d.b(e.d);
        C111846a aVar = hVar.f310823j;
        C2393x a = aVar.mo99266a();
        int i = aVar.f310824a;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                a.mo5793e(C2382m.ON_CREATE);
                a.mo5793e(C2382m.ON_START);
                a.mo5793e(C2382m.ON_RESUME);
                a.mo5793e(C2382m.ON_PAUSE);
                a.mo5793e(C2382m.ON_STOP);
            } else if (i2 == 1) {
                a.mo5793e(C2382m.ON_PAUSE);
                a.mo5793e(C2382m.ON_STOP);
            }
            aVar.f310824a = 3;
            return;
        }
        throw null;
    }
}
