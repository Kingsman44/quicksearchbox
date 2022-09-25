package com.google.android.libraries.lens.sdk.avs;

import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.sdk.avs.data.C24870e;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.android.libraries.lens.sdk.avs.data.C24882q;
import com.google.android.libraries.lens.sdk.avs.data.C24884s;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.sdk.avs.d */
/* compiled from: PG */
final class C24865d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24890g f67918a;

    public C24865d(C24890g gVar) {
        this.f67918a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C24890g.f67980a.mo56226d()).mo56382g(th)).mo56372aa(48859)).mo56386p("Engine failed to load");
        this.f67918a.f67982c.f67907e.mo57061a(12);
        C24870e eVar = new C24870e();
        eVar.mo30074b(12);
        ((C24897n) this.f67918a.f67983d.get()).mo30121a(eVar);
        ((C24897n) this.f67918a.f67983d.get()).mo30124d(new C24884s());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24424r rVar = (C24424r) obj;
        ((C58970a) ((C58970a) C24890g.f67980a.mo56224b()).mo56372aa(48860)).mo56386p("Engine loaded successfully");
        this.f67918a.f67982c.mo30052b(C24874i.LENS_PRIME_ENGINE_READY);
        ((C24897n) this.f67918a.f67983d.get()).mo30123c(new C24882q());
    }
}
