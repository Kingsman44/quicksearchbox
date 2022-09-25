package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.j */
/* compiled from: PG */
final class C12687j implements C12434h {

    /* renamed from: a */
    private static final C59071e f39743a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.j");

    /* renamed from: b */
    private final C12627a f39744b;

    /* renamed from: c */
    private final Executor f39745c;

    public C12687j(C12627a aVar, Executor executor) {
        this.f39744b = aVar;
        this.f39745c = executor;
    }

    /* renamed from: e */
    private final C60870cx m28941e(C60870cx cxVar, C60931s sVar) {
        cxVar.cancel(false);
        return C60922j.m93045h(cxVar, C47810es.m84966f(sVar), this.f39745c);
    }

    /* renamed from: a */
    public final C60870cx mo20591a() {
        ((C59052c) ((C59052c) f39743a.mo56224b()).mo56372aa(44356)).mo56386p("#cancel()");
        C60870cx e = m28941e(this.f39744b.mo20709d(), C12682e.f39738a);
        C60870cx e2 = m28941e(this.f39744b.mo20713h(), C12683f.f39739a);
        C60870cx e3 = m28941e(this.f39744b.mo20710e(), C12684g.f39740a);
        C60870cx e4 = m28941e(this.f39744b.mo20714i(), C12685h.f39741a);
        this.f39744b.mo20711f().cancel(false);
        this.f39744b.mo20708b().mo20409b();
        return C60856cj.m92901j(C47638k.m84751b(e, e2, e3, e4).mo51520a(C12686i.f39742a, this.f39745c));
    }

    /* renamed from: b */
    public final C60870cx mo20592b() {
        return this.f39744b.mo20711f();
    }

    /* renamed from: c */
    public final C60870cx mo20593c() {
        return this.f39744b.mo20712g();
    }

    /* renamed from: d */
    public final C57981b mo20594d() {
        return C13314n.m29569a(this.f39744b.mo20714i(), this.f39745c);
    }
}
