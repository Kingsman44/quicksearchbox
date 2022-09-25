package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24807r;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.ondevice.f.p */
/* compiled from: PG */
final class C24487p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f67006a;

    /* renamed from: b */
    final /* synthetic */ C24491t f67007b;

    public C24487p(C24491t tVar, long j) {
        this.f67007b = tVar;
        this.f67006a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C24491t.f67010a.mo56226d()).mo56382g(th)).mo56372aa(48788)).mo56386p("getModels failed");
        this.f67007b.f67014e.mo29947f(C24805p.MODEL_RETRIEVAL_ERROR, (C24808s) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        C24530h hVar = this.f67007b.f67014e;
        C24805p pVar = C24805p.MODEL_RETRIEVAL_SUCCESS;
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        long b = this.f67007b.f67015f.mo26870b();
        long j = this.f67006a;
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        sVar.f67806a |= 128;
        sVar.f67814i = b - j;
        hVar.mo29947f(pVar, (C24808s) rVar.build());
    }
}
