package com.google.apps.tiktok.account.p3606d.p3608b.p3609a;

import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42875aa;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42983ds;
import com.google.apps.tiktok.account.p3606d.C46092j;
import com.google.apps.tiktok.p3648i.p3650b.C47164h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60887da;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.d.b.a.b */
/* compiled from: PG */
public final class C46079b {

    /* renamed from: a */
    public final C46092j f120942a;

    /* renamed from: b */
    private final C69464a f120943b;

    public C46079b(C46092j jVar, C69464a aVar) {
        this.f120942a = jVar;
        this.f120943b = aVar;
    }

    /* renamed from: a */
    public final C42876ab mo50190a(C47164h hVar, C42813k kVar) {
        C58838bb.m90884s(hVar.mo51072c() == null, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        C60887da e = hVar.mo51074e() != null ? hVar.mo51074e() : (C60887da) this.f120943b.mo17428b();
        C42876ab a = C42983ds.m75880a(hVar.mo51077g(), e.mo19399b(C47810es.m84978r(new C46078a(this, hVar))), hVar.mo51076f(), e, hVar.mo51070a(), kVar);
        if (!hVar.mo51073d().isEmpty()) {
            a.mo46041c(new C42875aa(hVar.mo51073d(), e));
        }
        return a;
    }
}
