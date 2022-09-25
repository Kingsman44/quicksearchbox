package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63870b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63872d;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.d */
/* compiled from: PG */
public final class C136902d implements C136903e {

    /* renamed from: a */
    private static final C58974d f372605a = C58974d.m91135i("AccountStatePE");

    /* renamed from: b */
    private final C46175b f372606b;

    /* renamed from: c */
    private final AccountId f372607c;

    public C136902d(C46175b bVar, AccountId accountId) {
        this.f372606b = bVar;
        this.f372607c = accountId;
    }

    /* renamed from: b */
    public static boolean m222570b(C46108a aVar) {
        return "incognito".equals(aVar.mo50210b().f121165j);
    }

    /* renamed from: c */
    public static boolean m222571c(C46108a aVar) {
        return "pseudonymous".equals(aVar.mo50210b().f121165j);
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        Object obj;
        C58970a aVar = (C58970a) ((C58970a) f372605a.mo56224b()).mo56372aa(40880);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        C62940bt r4 = C62942bv.checkIsLite(C63872d.f172710c);
        sVar.mo58887l(r4);
        if (!sVar.f169962ag.mo58857o(r4.f169971d)) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
        }
        C62940bt r42 = C62942bv.checkIsLite(C63872d.f172710c);
        sVar.mo58887l(r42);
        Object l = sVar.f169962ag.mo58854l(r42.f169971d);
        if (l == null) {
            obj = r42.f169969b;
        } else {
            obj = r42.mo58889c(l);
        }
        C60870cx c = this.f372606b.mo50246c(this.f372607c);
        int a2 = C63870b.m96315a(((C63872d) obj).f172712a);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            return C60922j.m93044g(c, C47810es.m84963c(C136901c.f372604a), C60826bg.f164896a);
        } else if (i == 2) {
            return C60922j.m93044g(c, C47810es.m84963c(C136899a.f372602a), C60826bg.f164896a);
        } else if (i != 3) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
        } else {
            return C60922j.m93044g(c, C47810es.m84963c(C136900b.f372603a), C60826bg.f164896a);
        }
    }
}
