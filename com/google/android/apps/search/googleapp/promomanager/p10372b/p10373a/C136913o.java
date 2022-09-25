package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.promomanager.p10371a.C136897a;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63884p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.o */
/* compiled from: PG */
public final class C136913o implements C136903e {

    /* renamed from: c */
    private static final C58974d f372627c = C58974d.m91135i("SearchWidgetEnabledPE");

    /* renamed from: a */
    public final C136897a f372628a;

    /* renamed from: b */
    public final Executor f372629b;

    public C136913o(C136897a aVar, Executor executor) {
        this.f372628a = aVar;
        this.f372629b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        Object obj;
        C58970a aVar = (C58970a) ((C58970a) f372627c.mo56224b()).mo56372aa(40887);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        C62940bt r0 = C62942bv.checkIsLite(C63884p.f172736d);
        sVar.mo58887l(r0);
        if (!sVar.f169962ag.mo58857o(r0.f169971d)) {
            return this.f372628a.mo103977b();
        }
        C62940bt r02 = C62942bv.checkIsLite(C63884p.f172736d);
        sVar.mo58887l(r02);
        Object l = sVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C60870cx b = this.f372628a.mo103977b();
        C136912n nVar = new C136912n(this, (C63884p) obj, djVar);
        return C60922j.m93045h(b, C47810es.m84966f(nVar), this.f372629b);
    }
}
