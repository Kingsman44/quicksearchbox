package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12434h;
import com.google.android.libraries.assistant.auto.tng.common.p931p.C13314n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4449cd.p4456g.C57981b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.m */
/* compiled from: PG */
final class C12578m implements C12434h {

    /* renamed from: a */
    private static final C59071e f39534a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.m");

    /* renamed from: b */
    private final C12537a f39535b;

    /* renamed from: c */
    private final Executor f39536c;

    public C12578m(C12537a aVar, Executor executor) {
        this.f39535b = aVar;
        this.f39536c = executor;
    }

    /* renamed from: e */
    private final C60870cx m28747e(C60870cx cxVar, C60931s sVar) {
        cxVar.cancel(false);
        return C60922j.m93045h(cxVar, C47810es.m84966f(sVar), this.f39536c);
    }

    /* renamed from: a */
    public final C60870cx mo20591a() {
        ((C59052c) ((C59052c) f39534a.mo56224b()).mo56372aa(44303)).mo56386p("#cancel()");
        return C60856cj.m92901j(C47638k.m84751b(m28747e(this.f39535b.mo20655b(), C12575j.f39531a), m28747e(this.f39535b.mo20658e(), C12576k.f39532a)).mo51520a(C12577l.f39533a, this.f39536c));
    }

    /* renamed from: b */
    public final C60870cx mo20592b() {
        return this.f39535b.mo20656c();
    }

    /* renamed from: c */
    public final C60870cx mo20593c() {
        return this.f39535b.mo20657d();
    }

    /* renamed from: d */
    public final C57981b mo20594d() {
        return C13314n.m29569a(this.f39535b.mo20658e(), this.f39536c);
    }
}
