package com.google.android.libraries.assistant.contexttrigger.p1462f;

import android.content.ComponentName;
import com.google.android.libraries.assistant.contexttrigger.C17784j;
import com.google.android.libraries.assistant.contexttrigger.p1454a.C17613i;
import com.google.android.libraries.assistant.contexttrigger.p1463g.C17739b;
import com.google.android.libraries.assistant.contexttrigger.p1464h.C17741a;
import com.google.android.libraries.assistant.contexttrigger.p1465i.C17747e;
import com.google.android.libraries.assistant.contexttrigger.p1465i.C17748f;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17787c;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17788d;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17793i;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.location.C38713s;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3807b.p3808a.C48887ab;
import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.l */
/* compiled from: PG */
public final /* synthetic */ class C17722l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17730t f50926a;

    /* renamed from: b */
    public final /* synthetic */ C48915q f50927b;

    /* renamed from: c */
    public final /* synthetic */ boolean f50928c;

    public /* synthetic */ C17722l(C17730t tVar, C48915q qVar, boolean z) {
        this.f50926a = tVar;
        this.f50927b = qVar;
        this.f50928c = z;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C17730t tVar = this.f50926a;
        C48915q qVar = this.f50927b;
        boolean z = this.f50928c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60866ct.f164955a;
        }
        C17741a aVar = tVar.f50946i;
        C48919u uVar = qVar.f126577b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        int i = 3;
        ((C19567d) aVar.f50964a.f102819aC.mo6453a()).mo24822a(1, aVar.f50965b, a.name(), Boolean.valueOf(z));
        C17696ab abVar = (C17696ab) optional.get();
        C48917s sVar = abVar.mo23433a().f126535b;
        if (sVar == null) {
            sVar = C48917s.f126578f;
        }
        C48919u uVar2 = sVar.f126581b;
        if (uVar2 == null) {
            uVar2 = C48919u.f126586g;
        }
        C58471gg g = abVar.mo23434b().values();
        C58480gp e = C58485gu.m89837e();
        C58800sl lA = g.iterator();
        while (lA.hasNext()) {
            C48888ac acVar = (C48888ac) lA.next();
            acVar.getClass();
            int b = C48887ab.m85291b(acVar.f126515g);
            if (b == 0) {
                b = 1;
            }
            int i2 = b - 1;
            if (i2 == 1) {
                C17613i iVar = tVar.f50939b;
                ((C59052c) ((C59052c) C17613i.f50727a.mo56224b()).mo56372aa(46934)).mo56389s("Remove awareness node with sub trigger id: %s", acVar.f126510b);
                C17784j jVar = iVar.f50728b;
                C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
                C48918t tVar2 = (C48918t) uVar2.toBuilder();
                String str = acVar.f126510b;
                tVar2.copyOnWrite();
                C48919u uVar3 = (C48919u) tVar2.instance;
                str.getClass();
                uVar3.f126588a |= 4;
                uVar3.f126591d = str;
                pVar.copyOnWrite();
                C48915q qVar2 = (C48915q) pVar.instance;
                C48919u uVar4 = (C48919u) tVar2.build();
                uVar4.getClass();
                qVar2.f126577b = uVar4;
                qVar2.f126576a |= 1;
                e.mo55395g(jVar.mo23442a((C48915q) pVar.build()));
                i = 3;
            } else if (i2 == 2) {
                C17793i iVar2 = tVar.f50940c;
                C59104x b2 = C17793i.f51060a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "TimeContextManager");
                ((C59052c) ((C59052c) b2).mo56372aa(47043)).mo56389s("Remove time trigger with sub trigger id: %s", acVar.f126510b);
                e.mo55395g(iVar2.f51061b.mo46039a(new C17788d(iVar2, acVar), iVar2.f51063d));
            } else if (i2 == i) {
                if (tVar.f50942e.f50810e.f50788a) {
                    cxVar = C60856cj.m92899h(new UnsupportedOperationException("Need to implement this method before turning on the flag"));
                } else {
                    cxVar = C60866ct.f164955a;
                }
                e.mo55395g(cxVar);
            } else if (i2 == 4) {
                C17748f fVar = tVar.f50943f;
                ((C59052c) ((C59052c) C17748f.f50974a.mo56224b()).mo56372aa(47037)).mo56389s("Remove awareness node with sub trigger id: %s", acVar.f126510b);
                Collection.EL.stream(fVar.f50975b.getActiveSessions((ComponentName) null)).forEach(new C17747e(fVar));
                e.mo55395g(C60866ct.f164955a);
            } else if (i2 != 5) {
                C59104x d = C17730t.f50938a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CtfManager");
                ((C59052c) ((C59052c) d).mo56372aa(47016)).mo56386p("Unknown context backend type.");
            } else {
                C17739b bVar = tVar.f50941d;
                ((C59052c) ((C59052c) C17739b.f50960a.mo56224b()).mo56372aa(47033)).mo56389s("Remove location node with sub trigger id: %s", acVar.f126510b);
                C38713s sVar2 = bVar.f50962c;
                C58485gu n = C58485gu.m89846n(acVar.f126510b);
                C39226b a2 = C39226b.m68655a(uVar2.f126592e);
                if (a2 == null) {
                    a2 = C39226b.TAG_DO_NOT_USE;
                }
                e.mo55395g(sVar2.mo41568b(n, a2));
            }
        }
        C47633f h = C47633f.m84733g(C60856cj.m92896e(e.mo55394f())).mo51515h(C17729s.f50937a, tVar.f50945h);
        C60870cx cxVar2 = C60866ct.f164955a;
        if (abVar.mo23435c().isPresent()) {
            C17793i iVar3 = tVar.f50940c;
            cxVar2 = iVar3.f51061b.mo46039a(new C17787c(iVar3, (C17805u) abVar.mo23435c().get()), iVar3.f51063d);
        }
        return C47638k.m84751b(h, cxVar2).mo51520a(C17721k.f50925a, tVar.f50945h);
    }
}
