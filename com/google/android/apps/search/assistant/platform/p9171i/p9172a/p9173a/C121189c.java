package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9173a;

import com.google.assistant.p3781ad.p3789d.p3790a.C48561n;
import com.google.assistant.p3781ad.p3789d.p3790a.C48562o;
import com.google.assistant.p3781ad.p3789d.p3790a.C48563p;
import com.google.assistant.p3781ad.p3789d.p3790a.C48564q;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.a.c */
/* compiled from: PG */
public final class C121189c implements C121185a, C121190d {

    /* renamed from: a */
    private static final C58974d f336696a = C58974d.m91136j();

    /* renamed from: b */
    private final boolean f336697b;

    /* renamed from: c */
    private final C60950i f336698c;

    /* renamed from: d */
    private final ArrayDeque f336699d = new ArrayDeque(10);

    /* renamed from: e */
    private final HashMap f336700e = C58662ni.m90351j(10);

    public C121189c(boolean z, C60950i iVar) {
        this.f336697b = z;
        this.f336698c = iVar;
    }

    /* renamed from: g */
    private final void m200483g(long j, C58485gu guVar, C58485gu guVar2, C58485gu guVar3) {
        if (this.f336697b) {
            synchronized (this) {
                HashMap hashMap = this.f336700e;
                Long valueOf = Long.valueOf(j);
                if (!hashMap.containsKey(valueOf)) {
                    ((C58970a) ((C58970a) f336696a.mo56226d()).mo56372aa(35732)).mo56388r("logRawSuggestions: request with requestId %d not found.", j);
                    return;
                }
                ((C58970a) ((C58970a) f336696a.mo56224b()).mo56372aa(35731)).mo56387q("logRawSuggestions: logging %d suggestions", guVar3.size());
                C48562o oVar = (C48562o) this.f336700e.get(valueOf);
                oVar.getClass();
                C48564q qVar = oVar.f125459e;
                if (qVar == null) {
                    qVar = C48564q.f125461d;
                }
                C48561n nVar = (C48561n) oVar.toBuilder();
                C48563p pVar = (C48563p) qVar.toBuilder();
                pVar.copyOnWrite();
                C48564q qVar2 = (C48564q) pVar.instance;
                C62971cq cqVar = qVar2.f125465c;
                if (!cqVar.mo58948c()) {
                    qVar2.f125465c = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) guVar, (List) qVar2.f125465c);
                pVar.copyOnWrite();
                C48564q qVar3 = (C48564q) pVar.instance;
                C62971cq cqVar2 = qVar3.f125463a;
                if (!cqVar2.mo58948c()) {
                    qVar3.f125463a = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) guVar3, (List) qVar3.f125463a);
                pVar.copyOnWrite();
                C48564q qVar4 = (C48564q) pVar.instance;
                C62971cq cqVar3 = qVar4.f125464b;
                if (!cqVar3.mo58948c()) {
                    qVar4.f125464b = C62942bv.mutableCopy(cqVar3);
                }
                C62947c.addAll((Iterable) guVar2, (List) qVar4.f125464b);
                nVar.copyOnWrite();
                C48562o oVar2 = (C48562o) nVar.instance;
                C48564q qVar5 = (C48564q) pVar.build();
                qVar5.getClass();
                oVar2.f125459e = qVar5;
                oVar2.f125455a |= 8;
                this.f336700e.put(valueOf, (C48562o) nVar.build());
            }
        }
    }

    /* renamed from: a */
    public final void mo105073a(long j, String str) {
        if (!this.f336697b) {
            ((C58970a) ((C58970a) f336696a.mo56224b()).mo56372aa(35735)).mo56386p("logNewRequest: Tapas Debug Info flag not enabled.");
            return;
        }
        C58974d dVar = f336696a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(35733)).mo56388r("logNewRequest: logging request with id %d", j);
        synchronized (this) {
            HashMap hashMap = this.f336700e;
            Long valueOf = Long.valueOf(j);
            if (!hashMap.containsKey(valueOf)) {
                if (this.f336699d.size() == 10) {
                    this.f336700e.remove(this.f336699d.pollLast());
                }
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(35734)).mo56389s("#Prefix is: %s", str);
                C48561n nVar = (C48561n) C48562o.f125453f.createBuilder();
                nVar.copyOnWrite();
                C48562o oVar = (C48562o) nVar.instance;
                oVar.f125455a |= 1;
                oVar.f125456b = j;
                nVar.copyOnWrite();
                C48562o oVar2 = (C48562o) nVar.instance;
                str.getClass();
                oVar2.f125455a |= 4;
                oVar2.f125458d = str;
                long epochMilli = this.f336698c.mo57444a().toEpochMilli();
                nVar.copyOnWrite();
                C48562o oVar3 = (C48562o) nVar.instance;
                oVar3.f125455a |= 2;
                oVar3.f125457c = epochMilli;
                this.f336699d.offerFirst(valueOf);
                this.f336700e.put(valueOf, (C48562o) nVar.build());
            }
        }
    }

    /* renamed from: b */
    public final void mo105074b(long j, C58485gu guVar) {
        m200483g(j, C58485gu.m89845m(), guVar, C58485gu.m89845m());
    }

    /* renamed from: c */
    public final void mo105075c(long j, C58485gu guVar) {
        m200483g(j, C58485gu.m89845m(), C58485gu.m89845m(), guVar);
    }

    /* renamed from: d */
    public final void mo105076d(long j, C58485gu guVar) {
        m200483g(j, guVar, C58485gu.m89845m(), C58485gu.m89845m());
    }

    /* renamed from: e */
    public final synchronized C58485gu mo105077e() {
        return (C58485gu) Collection.EL.stream(this.f336699d).flatMap(new C121188b(this)).collect(C58370cn.f155946a);
    }

    /* renamed from: f */
    public final synchronized Stream mo105078f(long j) {
        HashMap hashMap = this.f336700e;
        Long valueOf = Long.valueOf(j);
        if (hashMap.containsKey(valueOf)) {
            C48562o oVar = (C48562o) this.f336700e.get(valueOf);
            oVar.getClass();
            return Stream.CC.m71935of(oVar);
        }
        ((C58970a) ((C58970a) f336696a.mo56226d()).mo56372aa(35730)).mo56388r("getFromMapHelper: missing key %d in debugInfoMap", j);
        return Stream.CC.empty();
    }
}
