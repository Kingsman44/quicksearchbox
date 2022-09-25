package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.n */
/* compiled from: PG */
final class C12474n implements C12434h {

    /* renamed from: a */
    private static final C59071e f39367a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.n");

    /* renamed from: b */
    private final C12436a f39368b;

    /* renamed from: c */
    private final Executor f39369c;

    public C12474n(C12436a aVar, Executor executor) {
        this.f39368b = aVar;
        this.f39369c = executor;
    }

    /* renamed from: e */
    private final C60870cx m28562e(C60870cx cxVar, C60931s sVar) {
        cxVar.cancel(false);
        return C60922j.m93045h(cxVar, C47810es.m84966f(sVar), this.f39369c);
    }

    /* renamed from: a */
    public final C60870cx mo20591a() {
        ((C59052c) ((C59052c) f39367a.mo56224b()).mo56372aa(44265)).mo56386p("#cancel()");
        C60870cx e = m28562e(this.f39368b.mo20610c(), C12470j.f39363a);
        C60870cx e2 = m28562e(this.f39368b.mo20614g(), C12470j.f39363a);
        C60870cx h = this.f39368b.mo20615h();
        C12471k kVar = C12471k.f39364a;
        return C60856cj.m92901j(C47638k.m84751b(e, e2, C60922j.m93045h(h, C47810es.m84966f(kVar), this.f39369c), m28562e(this.f39368b.mo20613f(), C12472l.f39365a)).mo51520a(C12473m.f39366a, this.f39369c));
    }

    /* renamed from: b */
    public final C60870cx mo20592b() {
        return this.f39368b.mo20611d();
    }

    /* renamed from: c */
    public final C60870cx mo20593c() {
        return this.f39368b.mo20612e();
    }

    /* renamed from: d */
    public final C57981b mo20594d() {
        return C13314n.m29569a(this.f39368b.mo20613f(), this.f39369c);
    }
}
