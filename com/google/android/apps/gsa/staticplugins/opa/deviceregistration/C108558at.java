package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.p7006ax.C89324c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.acz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.at */
/* compiled from: PG */
public final /* synthetic */ class C108558at implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108578bj f302008a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f302009b;

    public /* synthetic */ C108558at(C108578bj bjVar, C60870cx cxVar) {
        this.f302008a = bjVar;
        this.f302009b = cxVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108578bj bjVar = this.f302008a;
        C60870cx cxVar = this.f302009b;
        acz acz = (acz) obj;
        C108556ar arVar = bjVar.f302037e;
        long a = bjVar.f302036d.mo79743a(C90014bt.f247048M);
        C108680ez ezVar = bjVar.f302044l;
        C60870cx g = C60922j.m93044g(cxVar, C108550al.f301983a, C60826bg.f164896a);
        C89324c cVar = (C89324c) arVar.f302000h.mo17428b();
        cVar.mo83256h(arVar.f302001i, new C108555aq());
        C60870cx a2 = arVar.f301997e.mo28201a("performDiscoveryBlocking", new C108551am(arVar, cVar, (int) a));
        return arVar.f301996d.mo28209i(arVar.f301997e.mo28209i(C60856cj.m92897f(a2, g), "Process Scan Results", new C108552an(arVar, g, a2)), "Store merged results", new C108553ao(arVar, ezVar));
    }
}
