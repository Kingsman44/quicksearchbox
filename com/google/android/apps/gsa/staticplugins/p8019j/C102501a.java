package com.google.android.apps.gsa.staticplugins.p8019j;

import android.text.TextUtils;
import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3917i.p3918a.C51230a;
import com.google.assistant.p3897e.p3917i.p3918a.C51257b;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p4986a.C64655ai;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a */
/* compiled from: PG */
public final class C102501a implements C85812bd {

    /* renamed from: a */
    private final C86124t f286081a;

    /* renamed from: b */
    private final C21370a f286082b;

    /* renamed from: c */
    private final b f286083c;

    /* renamed from: d */
    private final C86054o f286084d;

    public C102501a(C86124t tVar, C21370a aVar, b bVar, C86054o oVar) {
        this.f286081a = tVar;
        this.f286082b = aVar;
        this.f286083c = bVar;
        this.f286084d = oVar;
    }

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        C58485gu guVar;
        C58833ax axVar;
        String F = this.f286084d.mo79659F();
        if (F == null || TextUtils.isEmpty(F)) {
            guVar = C58485gu.m89845m();
        } else {
            Geller a = this.f286083c.a();
            if (a == null) {
                guVar = C58485gu.m89845m();
            } else {
                C58485gu d = a.mo27177d(F, C65753ak.ACTION_HISTORY, (String) null, C65031ap.f176100j, C63662ac.f172144a, C64655ai.f175254d);
                ArrayList arrayList = new ArrayList();
                long micros = TimeUnit.MILLISECONDS.toMicros(this.f286082b.mo26870b()) - TimeUnit.SECONDS.toMicros(this.f286081a.mo79743a(C90014bt.f247563jX));
                int size = d.size();
                int i = 0;
                while (i < size) {
                    C64655ai aiVar = (C64655ai) d.get(i);
                    if (aiVar.f175258c >= micros) {
                        arrayList.add(aiVar);
                        i++;
                        if (arrayList.size() >= 3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                guVar = C58485gu.m89842j(arrayList);
            }
        }
        if (guVar.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            C51230a aVar = (C51230a) C51257b.f133440b.createBuilder();
            aVar.copyOnWrite();
            C51257b bVar = (C51257b) aVar.instance;
            C62971cq cqVar = bVar.f133442a;
            if (!cqVar.mo58948c()) {
                bVar.f133442a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) guVar, (List) bVar.f133442a);
            axVar = C58833ax.m90834k((C51257b) aVar.build());
        }
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.ActionHistoryParams";
        C63088z byteString = ((C51257b) axVar.mo56107c()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.history.action_history";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }
}
