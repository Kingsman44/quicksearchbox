package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c;

import android.content.Intent;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147481d;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147485b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10994b.C147490a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.C147500d;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10998b.C147520b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4194a.C55912b;

/* renamed from: com.google.android.libraries.af.a.b.c.o */
/* compiled from: PG */
public final class C147541o extends C147537k implements C147485b {
    public C147541o(C147500d dVar, C147520b bVar, C147481d dVar2, C21370a aVar, C147490a aVar2) {
        super(dVar, bVar, dVar2, aVar, aVar2);
    }

    /* renamed from: g */
    public final C60870cx mo124239g() {
        mo124300k();
        long c = this.f398202c.mo26871c();
        C60870cx l = super.mo124301l(this.f398200a.mo124268c(), 3012, c, (C55912b) null);
        C147539m mVar = new C147539m(this, c);
        return C60922j.m93044g(l, C47810es.m84963c(mVar), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final C60870cx mo124240h() {
        mo124300k();
        long c = this.f398202c.mo26871c();
        C60870cx l = super.mo124301l(this.f398200a.mo124269d(), 3008, c, (C55912b) null);
        C147540n nVar = new C147540n(this, c);
        return C60922j.m93044g(l, C47810es.m84963c(nVar), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo124241i(Intent intent) {
        long c = this.f398202c.mo26871c();
        if (!"com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(intent.getAction())) {
            return C60866ct.f164955a;
        }
        C60870cx l = super.mo124301l(this.f398200a.mo124268c(), 3010, c, (C55912b) null);
        C147538l lVar = new C147538l(this, c);
        return C60922j.m93044g(l, C47810es.m84963c(lVar), C60826bg.f164896a);
    }
}
