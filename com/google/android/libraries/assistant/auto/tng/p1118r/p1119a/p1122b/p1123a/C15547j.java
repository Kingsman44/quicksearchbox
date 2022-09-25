package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5127o.p5128a.C65626g;
import com.google.protos.p5127o.p5128a.C65629j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C15547j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15553p f46530a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f46531b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f46532c;

    /* renamed from: d */
    public final /* synthetic */ String f46533d;

    public /* synthetic */ C15547j(C15553p pVar, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f46530a = pVar;
        this.f46531b = cxVar;
        this.f46532c = cxVar2;
        this.f46533d = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C15553p pVar = this.f46530a;
        C60870cx cxVar = this.f46531b;
        C60870cx cxVar2 = this.f46532c;
        String str = this.f46533d;
        boolean equals = ((C46108a) C60856cj.m92909r(cxVar)).mo50210b().f121165j.equals("pseudonymous");
        C58976aa aaVar = C58975e.f156826a;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        if (equals || booleanValue) {
            return C47633f.m84733g(pVar.f46551k.mo21005a()).mo51516i(new C15552o(pVar, str), pVar.f46545e).mo51516i(new C15539b(pVar, str), pVar.f46545e).mo51515h(C15540c.f46520a, pVar.f46545e);
        }
        C65626g gVar = (C65626g) C65629j.f178340d.createBuilder();
        gVar.copyOnWrite();
        C65629j jVar = (C65629j) gVar.instance;
        jVar.f178344c = 1;
        jVar.f178342a |= 2;
        return C60856cj.m92900i((C65629j) gVar.build());
    }
}
