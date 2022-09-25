package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.apps.auto.p450a.C8963i;
import com.google.android.apps.auto.p450a.p451a.C8915h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.z */
/* compiled from: PG */
final class C11519z implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C11485ag f37398a;

    /* renamed from: b */
    final /* synthetic */ C8915h f37399b;

    /* renamed from: c */
    final /* synthetic */ C8963i f37400c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f37401d;

    public C11519z(C11485ag agVar, C8915h hVar, C8963i iVar, C60870cx cxVar) {
        this.f37398a = agVar;
        this.f37399b = hVar;
        this.f37400c = iVar;
        this.f37401d = cxVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        Void voidR = (Void) obj;
        C11485ag agVar = this.f37398a;
        C8915h hVar = this.f37399b;
        C8963i iVar = this.f37400c;
        C60870cx cxVar = this.f37401d;
        Object b = agVar.f37319m.mo17428b();
        C69664n.m101060f(b, "mediaRecEnabled.get()");
        if (!((Boolean) b).booleanValue()) {
            return agVar.mo20016f(hVar, iVar, cxVar);
        }
        C60870cx b2 = agVar.f37311e.mo20149b();
        C11481ac acVar = new C11481ac(agVar, hVar, iVar, cxVar);
        return C60922j.m93045h(b2, C47810es.m84966f(acVar), agVar.f37318l);
    }
}
