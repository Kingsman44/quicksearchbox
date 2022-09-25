package com.google.apps.tiktok.account.p3603a;

import com.google.android.libraries.logging.p2181a.C28258a;
import com.google.android.libraries.logging.p2181a.C28259b;
import com.google.android.libraries.logging.p2182b.C28273d;
import com.google.android.libraries.logging.p2182b.C28280k;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28349b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.account.a.i */
/* compiled from: PG */
public final class C45959i implements C28273d {

    /* renamed from: a */
    public final C58833ax f120749a;

    /* renamed from: b */
    private final C46175b f120750b;

    /* renamed from: c */
    private final Executor f120751c;

    public C45959i(C46175b bVar, Executor executor, C58833ax axVar) {
        this.f120750b = bVar;
        this.f120751c = executor;
        this.f120749a = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo33773a(C28280k kVar) {
        Object obj;
        if (kVar instanceof C28258a) {
            return ((C28258a) kVar).mo33750a();
        }
        if (kVar instanceof C28349b) {
            C28481u a = ((C28349b) kVar).mo33862a();
            C62940bt r0 = C62942bv.checkIsLite(C45953c.f120745a);
            a.mo58887l(r0);
            Object l = a.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C45952b bVar = (C45952b) obj;
            if (bVar.f120744c) {
                return C60856cj.m92900i(C28259b.m52821a());
            }
            if ((bVar.f120742a & 1) != 0) {
                return C60922j.m93044g(C60846c.m92878g(C60838bs.m92859i(this.f120750b.mo50246c(AccountId.m82057b(bVar.f120743b))), Exception.class, C45957g.f120747a, this.f120751c), C47810es.m84963c(new C45958h(this)), this.f120751c);
            }
        }
        return C60866ct.f164955a;
    }
}
