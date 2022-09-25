package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3931f.p3939c.C52816af;
import com.google.assistant.p3931f.p3939c.C52818ah;
import com.google.assistant.p3931f.p3939c.C52828e;
import com.google.assistant.p3931f.p3939c.C52838o;
import com.google.assistant.p3931f.p3939c.C52840q;
import com.google.assistant.p3931f.p3939c.C52841r;
import com.google.assistant.p3931f.p3939c.C52842s;
import com.google.protobuf.C62971cq;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.b */
/* compiled from: PG */
public final class C125317b {
    /* renamed from: a */
    public static final boolean m205265a(List list, String str, String str2) {
        C69664n.m101061g(list, "<this>");
        C69664n.m101061g(str2, "identifier");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C52828e eVar = (C52828e) it.next();
            if (C69664n.m101066l(eVar.f138604a, str)) {
                C62971cq<C52838o> cqVar = eVar.f138606c;
                C69664n.m101060f(cqVar, "it.possibleEntitiesList");
                if (!(cqVar instanceof Collection) || !cqVar.isEmpty()) {
                    for (C52838o oVar : cqVar) {
                        if (C69664n.m101066l(oVar.f138636b, str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m205266b(C52840q qVar, String str, String str2, String str3) {
        C52841r rVar = (C52841r) C52842s.f138640d.createBuilder();
        rVar.copyOnWrite();
        ((C52842s) rVar.instance).f138642a = str;
        C52816af afVar = (C52816af) C52818ah.f138576e.createBuilder();
        if (str2 != null) {
            C69664n.m101060f(afVar, BuildConfig.FLAVOR);
            afVar.copyOnWrite();
            C52818ah ahVar = (C52818ah) afVar.instance;
            ahVar.f138578a |= 1;
            ahVar.f138581d = str2;
        }
        if (str3 != null) {
            C69664n.m101060f(afVar, BuildConfig.FLAVOR);
            afVar.copyOnWrite();
            C52818ah ahVar2 = (C52818ah) afVar.instance;
            ahVar2.f138579b = 2;
            ahVar2.f138580c = str3;
        }
        C52818ah ahVar3 = (C52818ah) afVar.build();
        rVar.copyOnWrite();
        C52842s sVar = (C52842s) rVar.instance;
        ahVar3.getClass();
        sVar.mo53928a();
        sVar.f138643b.add(ahVar3);
        qVar.mo53926a(rVar);
    }

    /* renamed from: c */
    public static /* synthetic */ void m205267c(C52840q qVar, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        m205266b(qVar, str, str2, str3);
    }
}
