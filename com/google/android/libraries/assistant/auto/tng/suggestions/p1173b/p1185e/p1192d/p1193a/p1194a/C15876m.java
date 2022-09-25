package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36527a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36602e;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36604g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36616s;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36617t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C15876m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15878o f47147a;

    /* renamed from: b */
    public final /* synthetic */ C36604g f47148b;

    public /* synthetic */ C15876m(C15878o oVar, C36604g gVar) {
        this.f47147a = oVar;
        this.f47148b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C15878o oVar = this.f47147a;
        C36527a aVar = (C36527a) this.f47148b;
        int a = C36602e.m65133a(aVar.f95302a.f95439b);
        if (a == 0) {
            a = 1;
        }
        if (a == 6 || a == 7) {
            C58976aa aaVar = C58975e.f156826a;
            oVar.f47151b.f47373n = C58485gu.m89842j(C58485gu.m89845m());
            C36616s sVar = (C36616s) C36617t.f95460c.createBuilder();
            sVar.copyOnWrite();
            C36617t tVar = (C36617t) sVar.instance;
            tVar.f95463b = 1;
            tVar.f95462a |= 1;
            return C60856cj.m92900i((C36617t) sVar.build());
        }
        return C60922j.m93044g(oVar.f47152c.mo20104b((C58485gu) Collection.EL.stream(aVar.f95303b).filter(C15873j.f47144a).map(C15874k.f47145a).collect(C58370cn.f155946a), false), C47810es.m84963c(new C15875l(oVar)), oVar.f47153d);
    }
}
