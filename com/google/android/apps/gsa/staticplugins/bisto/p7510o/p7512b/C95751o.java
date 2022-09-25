package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.o */
/* compiled from: PG */
final class C95751o extends C95754r {

    /* renamed from: a */
    final /* synthetic */ C95759w f268068a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95751o(C95759w wVar) {
        super(wVar);
        this.f268068a = wVar;
    }

    /* renamed from: b */
    public final void mo89732b(byte[] bArr) {
        synchronized (this.f268068a) {
            if (!this.f268068a.mo89750p(bArr) && this.f268068a.f268110u >= 19200) {
                C59104x b = C95759w.f268078a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) b).mo56372aa(15395)).mo56386p("1st stage times out in 500ms");
                C95759w wVar = this.f268068a;
                wVar.f268081B = Long.valueOf(wVar.f268097h.mo26870b() + 500);
            }
        }
    }

    /* renamed from: e */
    public final void mo89735e() {
        this.f268068a.mo89748n(C95748l.FIRST_STAGE_TIMEOUT);
    }
}
