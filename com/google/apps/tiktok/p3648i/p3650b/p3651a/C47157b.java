package com.google.apps.tiktok.p3648i.p3650b.p3651a;

import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42875aa;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42983ds;
import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.apps.tiktok.p3648i.p3650b.C47164h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60887da;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.i.b.a.b */
/* compiled from: PG */
public final class C47157b {

    /* renamed from: a */
    public final C47151b f122785a;

    /* renamed from: b */
    private final C69464a f122786b;

    public C47157b(C69464a aVar, C47151b bVar) {
        this.f122786b = aVar;
        this.f122785a = bVar;
    }

    /* renamed from: a */
    public final C42876ab mo51057a(C47164h hVar, C42813k kVar) {
        C60887da daVar;
        C58838bb.m90884s(hVar.mo51072c() == null, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        if (hVar.mo51074e() != null) {
            daVar = hVar.mo51074e();
        } else {
            daVar = (C60887da) this.f122786b.mo17428b();
        }
        C42876ab a = C42983ds.m75880a(hVar.mo51077g(), daVar.mo19399b(C47810es.m84978r(new C47156a(this, hVar))), hVar.mo51076f(), daVar, hVar.mo51070a(), kVar);
        if (!hVar.mo51073d().isEmpty()) {
            a.mo46041c(new C42875aa(hVar.mo51073d(), daVar));
        }
        return a;
    }
}
