package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.f */
/* compiled from: PG */
final class C111798f implements C111799g {

    /* renamed from: a */
    private final C22871g f310720a;

    public C111798f(C22871g gVar) {
        this.f310720a = gVar;
    }

    /* renamed from: a */
    public final void mo99248a() {
        try {
            C90877ak.m148472f(this.f310720a.mo28204d("sleep event", 200, C111797e.f310719a));
        } catch (ExecutionException e) {
            C59104x d = C111800h.f310721a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(27421)).mo56386p("Error executiong delayed sleep event.");
        }
    }
}
