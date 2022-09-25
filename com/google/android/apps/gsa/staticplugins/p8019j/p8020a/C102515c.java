package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90016bv;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.c */
/* compiled from: PG */
public final class C102515c extends C68247h {

    /* renamed from: a */
    private final C68283d f286115a;

    /* renamed from: c */
    private final C68283d f286116c;

    /* renamed from: d */
    private final C68283d f286117d;

    public C102515c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C102515c.class), aVar);
        this.f286115a = C68236af.m98549d(dVar);
        this.f286116c = C68236af.m98549d(dVar2);
        this.f286117d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58485gu guVar;
        C52078ek ekVar;
        List list = (List) obj;
        C52091ex exVar = (C52091ex) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        exVar.getClass();
        enVar.f136685e = exVar;
        enVar.f136681a |= 16;
        if (((C86124t) list.get(0)).mo79746e(C90016bv.f247857d) && axVar.mo56113h()) {
            Iterator it = ((C52081en) axVar.mo56107c()).f136684d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C52083ep epVar = (C52083ep) it.next();
                if (epVar.f136692b == 3) {
                    ekVar = (C52078ek) epVar.f136693c;
                } else {
                    ekVar = C52078ek.f136671f;
                }
                if (ekVar.f136674b == 3) {
                    elVar.mo53784a(((C52081en) axVar.mo56109e(C52081en.f136679i)).f136684d);
                    break;
                }
            }
            return C60856cj.m92900i((C52081en) elVar.build());
        }
        if (!axVar.mo56113h()) {
            guVar = C58485gu.m89845m();
        } else {
            C58480gp gpVar = new C58480gp(4);
            for (C52083ep epVar2 : ((C52081en) axVar.mo56107c()).f136684d) {
                if (epVar2.f136692b == 3) {
                    gpVar.mo55395g((C52078ek) epVar2.f136693c);
                }
            }
            guVar = gpVar.mo55394f();
        }
        for (int i = 0; i < ((C58724pq) guVar).f156474d; i++) {
            C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
            eoVar.copyOnWrite();
            C52083ep epVar3 = (C52083ep) eoVar.instance;
            epVar3.f136691a |= 1;
            epVar3.f136694d = i;
            C52078ek ekVar2 = (C52078ek) guVar.get(i);
            eoVar.copyOnWrite();
            C52083ep epVar4 = (C52083ep) eoVar.instance;
            ekVar2.getClass();
            epVar4.f136693c = ekVar2;
            epVar4.f136692b = 3;
            elVar.mo53785b(eoVar);
        }
        return C60856cj.m92900i((C52081en) elVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286115a.mo60297gq(), this.f286116c.mo60297gq(), this.f286117d.mo60297gq());
    }
}
