package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.portable.C21997x;
import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65743aa;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65819cw;

/* renamed from: com.google.android.libraries.geller.f.j */
/* compiled from: PG */
public final /* synthetic */ class C21860j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21875y f60327a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f60328b;

    /* renamed from: c */
    public final /* synthetic */ C65743aa f60329c;

    public /* synthetic */ C21860j(C21875y yVar, C65753ak akVar, C65743aa aaVar) {
        this.f60327a = yVar;
        this.f60328b = akVar;
        this.f60329c = aaVar;
    }

    public final C60870cx apply(Object obj) {
        C65819cw cwVar;
        C21875y yVar = this.f60327a;
        C65753ak akVar = this.f60328b;
        C65743aa aaVar = this.f60329c;
        Void voidR = (Void) obj;
        if (aaVar.f178599a == 2) {
            cwVar = (C65819cw) aaVar.f178600b;
        } else {
            cwVar = C65819cw.f178926i;
        }
        String[] strArr = new String[cwVar.f178932e.size()];
        for (int i = 0; i < cwVar.f178932e.size(); i++) {
            strArr[i] = ((C65768az) cwVar.f178932e.get(i)).f178798d;
        }
        Geller geller = yVar.f60361e;
        String str = yVar.f60363g;
        C58838bb.m90884s(!geller.f60382d, "readAndClearUsage() not allowed if Geller is read-only");
        C21997x xVar = new C21997x(geller, str, akVar, strArr);
        return C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(C60856cj.m92904m(C47810es.m84978r(xVar), geller.f60380b)), new C21866p(yVar, akVar, cwVar), yVar.f60365i), new C21867q(akVar), yVar.f60365i);
    }
}
