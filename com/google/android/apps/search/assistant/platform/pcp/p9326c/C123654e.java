package com.google.android.apps.search.assistant.platform.pcp.p9326c;

import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.api.C123597m;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.search.assistant.p2566g.C33421p;
import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.c.e */
/* compiled from: PG */
public final class C123654e implements C33421p {

    /* renamed from: a */
    private final C123587c f341606a;

    /* renamed from: b */
    private final Executor f341607b;

    public C123654e(C123587c cVar, Executor executor) {
        this.f341606a = cVar;
        this.f341607b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo38837a(AccountId accountId, C33423r rVar) {
        Object obj;
        C62940bt r7 = C62942bv.checkIsLite(C123656g.f341609c);
        rVar.mo58887l(r7);
        if (!rVar.f169962ag.mo58857o(r7.f169971d)) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid request"));
        }
        C62940bt r72 = C62942bv.checkIsLite(C123656g.f341609c);
        rVar.mo58887l(r72);
        Object l = rVar.f169962ag.mo58854l(r72.f169971d);
        if (l == null) {
            obj = r72.f169969b;
        } else {
            obj = r72.mo58889c(l);
        }
        C123656g gVar = (C123656g) obj;
        C33426u uVar = (C33426u) C33427v.f89523e.createBuilder();
        C33425t tVar = C33425t.PCP;
        uVar.copyOnWrite();
        C33427v vVar = (C33427v) uVar.instance;
        vVar.f89526b = tVar.f89522p;
        vVar.f89525a |= 1;
        try {
            C123587c cVar = this.f341606a;
            C123651b bVar = gVar.f341611a;
            if (bVar == null) {
                bVar = C123651b.f341596e;
            }
            C53306j a = C53306j.m86809a(bVar.f341598a);
            if (a == null) {
                a = C53306j.UNKNOWNN;
            }
            C123651b bVar2 = gVar.f341611a;
            if (bVar2 == null) {
                bVar2 = C123651b.f341596e;
            }
            C58528ij F = C58528ij.m90006F(bVar2.f341599b);
            C123651b bVar3 = gVar.f341611a;
            boolean z = (bVar3 == null ? C123651b.f341596e : bVar3).f341600c;
            if (bVar3 == null) {
                bVar3 = C123651b.f341596e;
            }
            C123755bv bvVar = bVar3.f341601d;
            if (bvVar == null) {
                bvVar = C123755bv.f341837o;
            }
            return C60846c.m92878g(C60922j.m93044g(((C123597m) cVar).mo106043c(a, F, z, bvVar, C123777f.f341922a), C47810es.m84963c(new C123652c(uVar)), this.f341607b), Exception.class, C47810es.m84963c(new C123653d(uVar)), this.f341607b);
        } catch (RuntimeException e) {
            String runtimeException = e.toString();
            uVar.copyOnWrite();
            C33427v vVar2 = (C33427v) uVar.instance;
            runtimeException.getClass();
            vVar2.f89525a |= 4;
            vVar2.f89528d = runtimeException;
            return C60856cj.m92900i(C58485gu.m89846n((C33427v) uVar.build()));
        }
    }
}
