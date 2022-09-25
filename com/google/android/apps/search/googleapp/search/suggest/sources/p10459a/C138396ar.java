package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.C138542t;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62974ct;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ar */
/* compiled from: PG */
public final class C138396ar {

    /* renamed from: a */
    public static final C58974d f376491a = C58974d.m91136j();

    /* renamed from: b */
    public final C42876ab f376492b;

    /* renamed from: c */
    public final C46407v f376493c;

    /* renamed from: d */
    public final Set f376494d;

    /* renamed from: e */
    public final C138473cu f376495e;

    /* renamed from: f */
    public final C21370a f376496f;

    /* renamed from: g */
    public final C60887da f376497g;

    public C138396ar(C42876ab abVar, C46407v vVar, Set set, C138473cu cuVar, C60887da daVar, C21370a aVar) {
        this.f376492b = abVar;
        this.f376493c = vVar;
        this.f376494d = set;
        this.f376495e = cuVar;
        this.f376497g = daVar;
        this.f376496f = aVar;
    }

    /* renamed from: a */
    public static C138678v m224805a(C138678v vVar) {
        C138542t tVar = vVar.f377200d;
        if (tVar == null) {
            tVar = C138542t.f376811i;
        }
        if ((tVar.f376813a & 16) == 0) {
            C138542t tVar2 = vVar.f377200d;
            if (tVar2 == null) {
                tVar2 = C138542t.f376811i;
            }
            if ((tVar2.f376813a & 32) == 0) {
                return vVar;
            }
        }
        C138543u uVar = (C138543u) vVar.toBuilder();
        C138542t tVar3 = vVar.f377200d;
        if (tVar3 == null) {
            tVar3 = C138542t.f376811i;
        }
        C138134p pVar = (C138134p) tVar3.toBuilder();
        pVar.copyOnWrite();
        C138542t tVar4 = (C138542t) pVar.instance;
        tVar4.f376813a &= -17;
        tVar4.f376818f = 0;
        pVar.copyOnWrite();
        C138542t tVar5 = (C138542t) pVar.instance;
        tVar5.f376813a &= -33;
        tVar5.f376819g = 0;
        uVar.copyOnWrite();
        C138678v vVar2 = (C138678v) uVar.instance;
        C138542t tVar6 = (C138542t) pVar.build();
        tVar6.getClass();
        vVar2.f377200d = tVar6;
        vVar2.f377197a |= 2;
        return (C138678v) uVar.build();
    }

    /* renamed from: b */
    public static C138461ci m224806b(C138133o oVar) {
        C138460ch chVar = (C138460ch) C138461ci.f376626c.createBuilder();
        String str = oVar.f375825b;
        chVar.copyOnWrite();
        C138461ci ciVar = (C138461ci) chVar.instance;
        str.getClass();
        ciVar.f376628a |= 1;
        ciVar.f376629b = str;
        return (C138461ci) chVar.build();
    }

    /* renamed from: c */
    public final C60870cx mo114271c() {
        return this.f376493c.mo50343c();
    }

    /* renamed from: d */
    public final C60870cx mo114272d() {
        C60870cx d = this.f376492b.mo46042d();
        C138391am amVar = new C138391am(this);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(amVar), this.f376497g);
        C47633f.m84733g(g).mo51516i(new C138392an(this), this.f376497g);
        C138393ao aoVar = C138393ao.f376487a;
        return C60846c.m92878g(g, C62974ct.class, C47810es.m84963c(aoVar), this.f376497g);
    }

    /* renamed from: e */
    public final C60870cx mo114273e(C60870cx cxVar, int i) {
        C138390al alVar = new C138390al(this, i);
        return C60922j.m93045h(cxVar, C47810es.m84966f(alVar), this.f376497g);
    }
}
