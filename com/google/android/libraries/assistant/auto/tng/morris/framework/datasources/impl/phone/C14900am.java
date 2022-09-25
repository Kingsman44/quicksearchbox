package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import com.google.android.gms.car.CarCall;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.am */
/* compiled from: PG */
final class C14900am implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ CarCall f44811a;

    /* renamed from: b */
    final /* synthetic */ C14901an f44812b;

    public C14900am(C14901an anVar, CarCall carCall) {
        this.f44812b = anVar;
        this.f44811a = carCall;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C14901an.f44813a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45759)).mo56386p("Failed to stop DTMF tone");
        this.f44812b.f44820h = null;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f44812b.f44814b.mo21832n(this.f44811a);
        this.f44812b.f44820h = null;
    }
}
