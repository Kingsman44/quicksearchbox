package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41409h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63874f;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.i */
/* compiled from: PG */
public final class C136907i implements C136903e {

    /* renamed from: a */
    private static final C58974d f372613a = C58974d.m91135i("SettingEnabledPE");

    /* renamed from: b */
    private final C41409h f372614b;

    /* renamed from: c */
    private final Executor f372615c;

    public C136907i(C41409h hVar, Executor executor) {
        this.f372614b = hVar;
        this.f372615c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        Object obj;
        C58970a aVar = (C58970a) ((C58970a) f372613a.mo56224b()).mo56372aa(40883);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        C62940bt r4 = C62942bv.checkIsLite(C63874f.f172715c);
        sVar.mo58887l(r4);
        if (!sVar.f169962ag.mo58857o(r4.f169971d)) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
        }
        C62940bt r42 = C62942bv.checkIsLite(C63874f.f172715c);
        sVar.mo58887l(r42);
        Object l = sVar.f169962ag.mo58854l(r42.f169971d);
        if (l == null) {
            obj = r42.f169969b;
        } else {
            obj = r42.mo58889c(l);
        }
        C41387c a2 = C41387c.m72380a(((C63874f) obj).f172717a);
        if (a2 == null || a2 == C41387c.DEFAULT) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
        }
        C60870cx b = this.f372614b.mo43949b(new C41387c[]{a2}, C41385a.PROMO_MANAGER);
        C136906h hVar = new C136906h(a2);
        return C60922j.m93044g(b, C47810es.m84963c(hVar), this.f372615c);
    }
}
