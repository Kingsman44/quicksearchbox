package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.accl.C92718b;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.h */
/* compiled from: PG */
public final class C102520h extends C68247h {

    /* renamed from: a */
    private final C68283d f286129a;

    /* renamed from: c */
    private final C68283d f286130c;

    /* renamed from: d */
    private final C68283d f286131d;

    public C102520h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C102520h.class), aVar);
        this.f286129a = C68236af.m98549d(dVar);
        this.f286130c = C68236af.m98549d(dVar2);
        this.f286131d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(0);
        int intValue = ((Integer) list.get(1)).intValue();
        C58833ax axVar = (C58833ax) list.get(2);
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
            C58485gu c = tVar.mo79745c(C90014bt.f247628kj);
            for (C52232kc kcVar : ((C92718b) axVar.mo56107c()).mo87449a(intValue).f136712a) {
                if ((kcVar.f137064a & 1) != 0 && c.contains(kcVar.f137065b)) {
                    ewVar.mo53792e(kcVar);
                }
            }
            obj2 = C58833ax.m90834k((C52091ex) ewVar.build());
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286129a.mo60297gq(), this.f286130c.mo60297gq(), this.f286131d.mo60297gq());
    }
}
