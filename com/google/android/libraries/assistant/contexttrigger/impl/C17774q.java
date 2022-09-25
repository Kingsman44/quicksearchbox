package com.google.android.libraries.assistant.contexttrigger.impl;

import android.content.Intent;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.libraries.assistant.contexttrigger.C17693f;
import com.google.android.libraries.assistant.contexttrigger.C17737g;
import com.google.android.libraries.assistant.contexttrigger.C17742i;
import com.google.android.libraries.assistant.contexttrigger.C17784j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48911m;
import com.google.assistant.p3803ag.p3807b.p3808a.C48912n;
import com.google.assistant.p3803ag.p3807b.p3808a.C48913o;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48920v;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.q */
/* compiled from: PG */
public final class C17774q implements C17742i {

    /* renamed from: b */
    private static final C59071e f51028b = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.impl.q");

    /* renamed from: a */
    public final C36314g f51029a;

    /* renamed from: c */
    private final AccountId f51030c;

    /* renamed from: d */
    private final C46128f f51031d;

    /* renamed from: e */
    private final C21370a f51032e;

    /* renamed from: f */
    private final C17760d f51033f;

    /* renamed from: g */
    private final C69464a f51034g;

    /* renamed from: h */
    private final Executor f51035h;

    public C17774q(AccountId accountId, C46128f fVar, C21370a aVar, C17760d dVar, C36314g gVar, C69464a aVar2, Executor executor) {
        this.f51030c = accountId;
        this.f51031d = fVar;
        this.f51032e = aVar;
        this.f51033f = dVar;
        this.f51029a = gVar;
        this.f51034g = aVar2;
        this.f51035h = executor;
    }

    /* renamed from: a */
    public final C60870cx mo23439a(Intent intent) {
        C58833ax axVar;
        C58833ax axVar2;
        C58833ax axVar3;
        C58833ax a = C17749a.m35013a(intent);
        FenceStateImpl fenceStateImpl = (FenceStateImpl) FenceStateImpl.m234223a(intent);
        if (fenceStateImpl.f390277a == 0 && fenceStateImpl.f390280d == 0) {
            ((C59052c) ((C59052c) f51028b.mo56225c()).mo56372aa(46998)).mo56386p("Can't parse ContextTriggerResult from Awareness Intent.");
            axVar = C58836b.f156633a;
        } else {
            C48920v vVar = (C48920v) C48923y.f126600f.createBuilder();
            C48922x d = m35038d(fenceStateImpl.f390277a);
            vVar.copyOnWrite();
            C48923y yVar = (C48923y) vVar.instance;
            yVar.f126605d = d.f126599d;
            yVar.f126602a |= 4;
            C48922x d2 = m35038d(fenceStateImpl.f390280d);
            vVar.copyOnWrite();
            C48923y yVar2 = (C48923y) vVar.instance;
            yVar2.f126606e = d2.f126599d;
            yVar2.f126602a |= 8;
            axVar = C58833ax.m90834k((C48923y) vVar.build());
        }
        if (!a.mo56113h() || !axVar.mo56113h()) {
            ((C59052c) ((C59052c) f51028b.mo56225c()).mo56372aa(46999)).mo56386p("Received invalid Intent from Awareness API.");
            return C60866ct.f164955a;
        }
        try {
            C17693f fVar = (C17693f) a.mo56107c();
            C17693f fVar2 = (C17693f) a.mo56107c();
            C48920v vVar2 = (C48920v) ((C48923y) axVar.mo56107c()).toBuilder();
            C48917s sVar = fVar2.f50869c;
            if (sVar == null) {
                sVar = C48917s.f126578f;
            }
            C48919u uVar = sVar.f126581b;
            if (uVar == null) {
                uVar = C48919u.f126586g;
            }
            vVar2.copyOnWrite();
            C48923y yVar3 = (C48923y) vVar2.instance;
            uVar.getClass();
            yVar3.f126603b = uVar;
            yVar3.f126602a |= 1;
            C48917s sVar2 = fVar2.f50869c;
            if (sVar2 == null) {
                sVar2 = C48917s.f126578f;
            }
            C48904f fVar3 = sVar2.f126583d;
            if (fVar3 == null) {
                fVar3 = C48904f.f126552a;
            }
            vVar2.copyOnWrite();
            C48923y yVar4 = (C48923y) vVar2.instance;
            fVar3.getClass();
            yVar4.f126604c = fVar3;
            yVar4.f126602a |= 2;
            C48923y yVar5 = (C48923y) vVar2.build();
            C48917s sVar3 = fVar.f50869c;
            if (sVar3 == null) {
                sVar3 = C48917s.f126578f;
            }
            C48919u uVar2 = sVar3.f126581b;
            if (uVar2 == null) {
                uVar2 = C48919u.f126586g;
            }
            C48900b a2 = C48900b.m85301a(uVar2.f126589b);
            if (a2 == null) {
                a2 = C48900b.UNSPECIFIED;
            }
            C17760d dVar = this.f51033f;
            if (!dVar.f51001b.containsKey(a2)) {
                C59104x d3 = C17760d.f51000a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "ContextClientRegistry");
                ((C59052c) ((C59052c) d3).mo56372aa(46991)).mo56389s("ContextTriggerClient with id: %s is not registered", a2.name());
                axVar2 = C58836b.f156633a;
            } else {
                axVar2 = C58833ax.m90834k((C17737g) ((C69464a) dVar.f51001b.get(a2)).mo17428b());
            }
            if (axVar2.mo56113h()) {
                C48917s sVar4 = fVar.f50869c;
                if (sVar4 == null) {
                    sVar4 = C48917s.f126578f;
                }
                C48913o oVar = sVar4.f126584e;
                if (oVar == null) {
                    oVar = C48913o.f126569d;
                }
                C48912n nVar = oVar.f126573c;
                if (nVar == null) {
                    nVar = C48912n.f126565c;
                }
                int i = nVar.f126567a;
                int a3 = C48911m.m85305a(i);
                int i2 = a3 - 1;
                if (a3 != 0) {
                    long j = 0;
                    if (i2 == 0) {
                        if (i == 1) {
                            j = ((Long) nVar.f126568b).longValue();
                        }
                        axVar3 = C58833ax.m90834k(Long.valueOf(j));
                    } else if (i2 != 1) {
                        axVar3 = C58836b.f156633a;
                    } else {
                        long j2 = fVar.f50870d;
                        if (i == 2) {
                            j = ((Long) nVar.f126568b).longValue();
                        }
                        axVar3 = C58833ax.m90834k(Long.valueOf(j2 + j));
                    }
                    if (axVar3.mo56113h()) {
                        if (((Long) axVar3.mo56107c()).longValue() <= this.f51032e.mo26870b()) {
                            throw new C17773p(String.format("Trigger is expired at: %d, current time: %s.", new Object[]{axVar3.mo56107c(), Long.valueOf(this.f51032e.mo26870b())}), true);
                        }
                    }
                    C48917s sVar5 = fVar.f50869c;
                    if (sVar5 == null) {
                        sVar5 = C48917s.f126578f;
                    }
                    C48919u uVar3 = sVar5.f126581b;
                    if (uVar3 == null) {
                        uVar3 = C48919u.f126586g;
                    }
                    String str = uVar3.f126590c;
                    C60870cx b = this.f51031d.mo50215b(this.f51030c);
                    return C60922j.m93045h(C47638k.m84751b(b).mo51521b(new C17772o(b, str, sVar5), C60826bg.f164896a), C47810es.m84966f(new C17771n(this, yVar5, fVar, axVar2)), this.f51035h);
                }
                throw null;
            }
            throw new C17773p(String.format("Listener for client: %s is not registered or disabled.", new Object[]{a2.name()}), true);
        } catch (C17773p e) {
            ((C59052c) ((C59052c) f51028b.mo56226d()).mo56372aa(47000)).mo56359L("Context trigger for key: '%s' is suppressed: '%s', will remove trigger: %b.", ((C17693f) a.mo56107c()).f50868b, e.getMessage(), Boolean.valueOf(e.f51027a));
            if (e.f51027a) {
                C48917s sVar6 = ((C17693f) a.mo56107c()).f50869c;
                if (sVar6 == null) {
                    sVar6 = C48917s.f126578f;
                }
                C48919u uVar4 = sVar6.f126581b;
                if (uVar4 == null) {
                    uVar4 = C48919u.f126586g;
                }
                C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
                pVar.copyOnWrite();
                C48915q qVar = (C48915q) pVar.instance;
                uVar4.getClass();
                qVar.f126577b = uVar4;
                qVar.f126576a |= 1;
                C48915q qVar2 = (C48915q) pVar.build();
                if (this.f51034g.mo17428b() != null) {
                    ((C17784j) this.f51034g.mo17428b()).mo23442a(qVar2);
                }
            }
            return C60866ct.f164955a;
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) f51028b.mo56225c()).mo56382g(e2)).mo56372aa(47001)).mo56386p("Unexpected error while processing context trigger.");
            return C60866ct.f164955a;
        }
    }

    /* renamed from: b */
    public final C60870cx mo23440b(List list) {
        return C60856cj.m92899h(new Exception("NOT SUPPORTED"));
    }

    /* renamed from: c */
    public final C60870cx mo23441c(List list) {
        return C60856cj.m92899h(new Exception("NOT SUPPORTED"));
    }

    /* renamed from: d */
    private static C48922x m35038d(int i) {
        if (i == 1) {
            return C48922x.NOT_ACTIVE;
        }
        if (i != 2) {
            return C48922x.UNKNOWN;
        }
        return C48922x.ACTIVE;
    }
}
