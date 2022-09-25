package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p791a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.C12392d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.a.j */
/* compiled from: PG */
public final class C12351j implements C12392d {

    /* renamed from: a */
    private static final C59071e f39169a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.a.j");

    /* renamed from: b */
    private final C12325a f39170b;

    /* renamed from: c */
    private final Executor f39171c;

    public C12351j(C12325a aVar, Executor executor) {
        this.f39170b = aVar;
        this.f39171c = executor;
    }

    /* renamed from: f */
    private final C60870cx m28355f(C60870cx cxVar, C58817ah ahVar) {
        cxVar.cancel(false);
        return C60922j.m93044g(cxVar, C47810es.m84963c(ahVar), this.f39171c);
    }

    /* renamed from: a */
    public final C60870cx mo20563a() {
        ((C59052c) ((C59052c) f39169a.mo56224b()).mo56372aa(44198)).mo56386p("#cancel");
        return C60856cj.m92901j(C47638k.m84751b(m28355f(this.f39170b.mo20560g(), C12348g.f39166a), m28355f(this.f39170b.mo20555b(), C12349h.f39167a)).mo51520a(C12350i.f39168a, this.f39171c));
    }

    /* renamed from: b */
    public final C60870cx mo20564b() {
        return this.f39170b.mo20558e();
    }

    /* renamed from: c */
    public final C60870cx mo20565c() {
        return this.f39170b.mo20556c();
    }

    /* renamed from: d */
    public final C60870cx mo20566d() {
        return this.f39170b.mo20557d();
    }

    /* renamed from: e */
    public final C60870cx mo20567e() {
        return this.f39170b.mo20559f();
    }
}
