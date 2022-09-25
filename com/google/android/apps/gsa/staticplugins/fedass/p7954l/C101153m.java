package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import com.google.android.libraries.geller.portable.C21952d;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.m */
/* compiled from: PG */
public final /* synthetic */ class C101153m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101166z f282378a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f282379b;

    /* renamed from: c */
    public final /* synthetic */ C65768az f282380c;

    public /* synthetic */ C101153m(C101166z zVar, C60870cx cxVar, C65768az azVar) {
        this.f282378a = zVar;
        this.f282379b = cxVar;
        this.f282380c = azVar;
    }

    public final C60870cx apply(Object obj) {
        C101166z zVar = this.f282378a;
        C60870cx cxVar = this.f282379b;
        C65768az azVar = this.f282380c;
        Void voidR = (Void) obj;
        Geller geller = zVar.f282406k;
        String str = (String) C60856cj.m92909r(cxVar);
        C65753ak akVar = C65753ak.ASSISTANT_HISTORY;
        String str2 = azVar.f178798d;
        C65139d dVar = azVar.f178796b;
        if (dVar == null) {
            dVar = C65139d.f176307e;
        }
        return geller.mo27180g(str, akVar, C58485gu.m89846n(C21952d.m41118c(str2, dVar.f176310b)), true);
    }
}
