package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C11984a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.r */
/* compiled from: PG */
final class C12084r implements C11984a {

    /* renamed from: a */
    public static final C59071e f38670a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.r");

    /* renamed from: b */
    public final C12063ab f38671b;

    /* renamed from: c */
    public final C15481g f38672c;

    /* renamed from: d */
    private final C60870cx f38673d;

    /* renamed from: e */
    private final Executor f38674e;

    /* renamed from: f */
    private final C60870cx f38675f;

    public C12084r(C60870cx cxVar, C60870cx cxVar2, C12063ab abVar, Executor executor, C15481g gVar) {
        this.f38673d = cxVar;
        this.f38675f = cxVar2;
        this.f38671b = abVar;
        this.f38674e = executor;
        this.f38672c = gVar;
        C60856cj.m92911t(C60922j.m93045h(C60922j.m93045h(cxVar, C47810es.m84966f(C12077k.f38663a), executor), C47810es.m84966f(new C12078l(this)), executor), C47810es.m84974n(new C12082p(this)), executor);
    }

    /* renamed from: a */
    public final C60870cx mo20351a() {
        ((C59052c) ((C59052c) f38670a.mo56224b()).mo56372aa(43988)).mo56386p("#release");
        C60870cx cxVar = this.f38673d;
        C12079m mVar = C12079m.f38665a;
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(mVar), this.f38674e);
        h.mo4106b(C47810es.m84977q(new C12080n(this)), this.f38674e);
        C12081o oVar = C12081o.f38667a;
        return C60856cj.m92901j(C60922j.m93045h(h, C47810es.m84966f(oVar), this.f38674e));
    }

    /* renamed from: b */
    public final void mo20402b() {
        C60870cx cxVar = this.f38675f;
        C12083q qVar = new C12083q(this);
        C60856cj.m92911t(cxVar, C47810es.m84974n(qVar), this.f38674e);
    }
}
