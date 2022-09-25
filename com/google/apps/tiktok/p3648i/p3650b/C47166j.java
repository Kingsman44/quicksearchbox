package com.google.apps.tiktok.p3648i.p3650b;

import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42875aa;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42984dt;
import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60887da;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.i.b.j */
/* compiled from: PG */
public final class C47166j {

    /* renamed from: a */
    public final C47151b f122811a;

    /* renamed from: b */
    private final C69464a f122812b;

    public C47166j(C69464a aVar, C47151b bVar) {
        this.f122812b = aVar;
        this.f122811a = bVar;
    }

    /* renamed from: a */
    public final C42876ab mo51081a(C47164h hVar, C42813k kVar) {
        C58838bb.m90884s(hVar.mo51072c() == null, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        C60887da e = hVar.mo51074e() != null ? hVar.mo51074e() : (C60887da) this.f122812b.mo17428b();
        C42876ab a = C42984dt.m75881a(hVar.mo51077g(), e.mo19399b(C47810es.m84978r(new C47165i(this, hVar))), hVar.mo51076f(), e, hVar.mo51070a(), kVar);
        if (!hVar.mo51073d().isEmpty()) {
            a.mo46041c(new C42875aa(hVar.mo51073d(), e));
        }
        return a;
    }
}
