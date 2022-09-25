package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1297i;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.i.c */
/* compiled from: PG */
public final /* synthetic */ class C16585c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f48630a;

    /* renamed from: b */
    public final /* synthetic */ C15481g f48631b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f48632c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f48633d;

    public /* synthetic */ C16585c(C60870cx cxVar, C15481g gVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f48630a = cxVar;
        this.f48631b = gVar;
        this.f48632c = cxVar2;
        this.f48633d = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f48630a;
        C15481g gVar = this.f48631b;
        C60870cx cxVar2 = this.f48632c;
        C60870cx cxVar3 = this.f48633d;
        ArrayList arrayList = new ArrayList();
        C16587e.m33635a(arrayList, "logtop-aggregate", (C58485gu) C60856cj.m92909r(cxVar), gVar, C37179a.f97499bR.mo40779c());
        C16587e.m33635a(arrayList, "logtop-call", (C58485gu) C60856cj.m92909r(cxVar2), gVar, C37179a.f97500bS.mo40779c());
        C16587e.m33635a(arrayList, "logtop-text", (C58485gu) C60856cj.m92909r(cxVar3), gVar, C37179a.f97501bT.mo40779c());
        if (arrayList.isEmpty()) {
            gVar.mo22352b(C37179a.f97502bU.mo40805c(C62722b.NOT_FOUND));
        } else {
            gVar.mo22352b(C37179a.f97502bU.mo40805c(C62722b.OK));
        }
        return arrayList;
    }
}
