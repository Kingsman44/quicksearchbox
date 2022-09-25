package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p801a.p802a;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.a.a.i */
/* compiled from: PG */
final class C12421i implements C12434h {

    /* renamed from: a */
    private static final C59071e f39282a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.a.a.i");

    /* renamed from: b */
    private final C12398a f39283b;

    /* renamed from: c */
    private final Executor f39284c;

    public C12421i(C12398a aVar, Executor executor) {
        this.f39283b = aVar;
        this.f39284c = executor;
    }

    /* renamed from: e */
    private final C60870cx m28470e(C60870cx cxVar, C60931s sVar) {
        cxVar.cancel(false);
        return C60922j.m93045h(cxVar, C47810es.m84966f(sVar), this.f39284c);
    }

    /* renamed from: a */
    public final C60870cx mo20591a() {
        ((C59052c) ((C59052c) f39282a.mo56224b()).mo56372aa(44242)).mo56386p("#cancel()");
        return C60856cj.m92901j(C47638k.m84751b(m28470e(this.f39283b.mo20585c(), C12418f.f39279a), m28470e(this.f39283b.mo20588f(), C12419g.f39280a)).mo51520a(C12420h.f39281a, this.f39284c));
    }

    /* renamed from: b */
    public final C60870cx mo20592b() {
        return this.f39283b.mo20586d();
    }

    /* renamed from: c */
    public final C60870cx mo20593c() {
        return this.f39283b.mo20587e();
    }

    /* renamed from: d */
    public final C57981b mo20594d() {
        return C13314n.m29569a(this.f39283b.mo20588f(), this.f39284c);
    }
}
