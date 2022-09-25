package com.google.apps.tiktok.account.p3606d.p3608b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42875aa;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42882ah;
import com.google.android.libraries.storage.protostore.C42897aw;
import com.google.android.libraries.storage.protostore.C42905ba;
import com.google.android.libraries.storage.protostore.C42981dq;
import com.google.android.libraries.storage.protostore.C42984dt;
import com.google.android.libraries.storage.protostore.C43007j;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.android.libraries.storage.protostore.p3320e.C42992a;
import com.google.apps.tiktok.account.p3606d.C46092j;
import com.google.apps.tiktok.p3648i.p3650b.C47164h;
import com.google.apps.tiktok.tracing.C47523ai;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.d.b.d */
/* compiled from: PG */
public final class C46082d {

    /* renamed from: a */
    public final C46092j f120947a;

    /* renamed from: b */
    private final C69464a f120948b;

    /* renamed from: c */
    private final C69464a f120949c;

    public C46082d(C46092j jVar, C69464a aVar, C69464a aVar2) {
        this.f120947a = jVar;
        this.f120948b = aVar;
        this.f120949c = aVar2;
    }

    /* renamed from: a */
    public final C42876ab mo50192a(C47164h hVar, C42813k kVar) {
        C58838bb.m90884s(hVar.mo51072c() == null, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        C60887da e = hVar.mo51074e() != null ? hVar.mo51074e() : (C60887da) this.f120948b.mo17428b();
        C42876ab a = C42984dt.m75881a(hVar.mo51077g(), e.mo19399b(C47810es.m84978r(new C46081c(this, hVar))), hVar.mo51076f(), e, hVar.mo51070a(), kVar);
        if (!hVar.mo51073d().isEmpty()) {
            a.mo46041c(new C42875aa(hVar.mo51073d(), e));
        }
        return a;
    }

    /* renamed from: b */
    public final C42876ab mo50193b(C47164h hVar, C42813k kVar) {
        C60887da daVar;
        C58838bb.m90866a(hVar.mo51072c(), "LamsConfig must be specified for @LamsSync");
        if (hVar.mo51074e() != null) {
            daVar = hVar.mo51074e();
        } else {
            daVar = (C60887da) this.f120948b.mo17428b();
        }
        C60870cx b = daVar.mo19399b(C47810es.m84978r(new C46077a(this, hVar)));
        String g = hVar.mo51077g();
        MessageLite f = hVar.mo51076f();
        C43007j a = hVar.mo51070a();
        C42882ah b2 = hVar.mo51072c().mo51059b();
        C21370a a2 = hVar.mo51072c().mo51058a();
        int f2 = hVar.mo51072c().mo51064f();
        C58833ax c = hVar.mo51072c().mo51060c();
        C58833ax d = hVar.mo51072c().mo51061d();
        C42981dq dqVar = new C42981dq(g, b, new C42992a(f, C62921ba.m95368a()), daVar, kVar, a, new C47523ai());
        C58833ax axVar = d;
        C58833ax axVar2 = c;
        C42897aw awVar = new C42897aw(dqVar, hVar.mo51072c().mo51062e(), b2, (C60888db) this.f120949c.mo17428b(), a2, f2, C62921ba.m95368a());
        awVar.mo45980a(axVar2, axVar);
        C42876ab abVar = new C42876ab(new C42905ba(awVar), C42932a.f112315a, C60856cj.m92900i(BuildConfig.FLAVOR), true);
        if (!hVar.mo51073d().isEmpty()) {
            abVar.mo46041c(new C42875aa(hVar.mo51073d(), daVar));
        }
        hVar.mo51072c().f122808a = new C46080b(abVar);
        return abVar;
    }
}
