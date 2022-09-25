package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.p820a;

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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a.i */
/* compiled from: PG */
final class C12607i implements C12434h {

    /* renamed from: a */
    private static final C59071e f39577a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a.i");

    /* renamed from: b */
    private final C12583a f39578b;

    /* renamed from: c */
    private final Executor f39579c;

    public C12607i(C12583a aVar, Executor executor) {
        this.f39578b = aVar;
        this.f39579c = executor;
    }

    /* renamed from: e */
    private final C60870cx m28801e(C60870cx cxVar, C60931s sVar) {
        cxVar.cancel(false);
        return C60922j.m93045h(cxVar, C47810es.m84966f(sVar), this.f39579c);
    }

    /* renamed from: a */
    public final C60870cx mo20591a() {
        ((C59052c) ((C59052c) f39577a.mo56224b()).mo56372aa(44318)).mo56386p("#cancel()");
        return C60856cj.m92901j(C47638k.m84751b(m28801e(this.f39578b.mo20670f(), C12603e.f39573a), m28801e(this.f39578b.mo20667c(), C12604f.f39574a), m28801e(this.f39578b.mo20671g(), C12605g.f39575a)).mo51520a(C12606h.f39576a, this.f39579c));
    }

    /* renamed from: b */
    public final C60870cx mo20592b() {
        return this.f39578b.mo20668d();
    }

    /* renamed from: c */
    public final C60870cx mo20593c() {
        return this.f39578b.mo20669e();
    }

    /* renamed from: d */
    public final C57981b mo20594d() {
        return C13314n.m29569a(this.f39578b.mo20671g(), this.f39579c);
    }
}
