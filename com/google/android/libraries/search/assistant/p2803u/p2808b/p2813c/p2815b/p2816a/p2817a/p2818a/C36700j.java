package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36734j;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.j */
/* compiled from: PG */
final class C36700j implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ String f95598a;

    /* renamed from: b */
    final /* synthetic */ C36701k f95599b;

    public C36700j(C36701k kVar, String str) {
        this.f95599b = kVar;
        this.f95598a = str;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C46688af afVar;
        C58976aa aaVar = C58975e.f156826a;
        C36701k kVar = this.f95599b;
        C58833ax axVar = kVar.f95606g;
        if (axVar.mo56113h()) {
            afVar = C46688af.m83205b((C36734j) axVar.mo56107c(), kVar.f95603d.mo26870b());
        } else {
            afVar = C46688af.f121976a;
        }
        return new C46463o(new C60817ay(C60856cj.m92900i(afVar)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C58976aa aaVar = C58975e.f156826a;
        C36701k kVar = this.f95599b;
        String str = this.f95598a;
        C60870cx a = kVar.f95602c.mo50214a(kVar.f95601b);
        C36693c cVar = new C36693c(kVar, str);
        return C60922j.m93045h(a, C47810es.m84966f(cVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        C58976aa aaVar = C58975e.f156826a;
        return "ONBOARDING_FETCH_CONSENT_UI_DATA_SOURCE_KEY";
    }
}
