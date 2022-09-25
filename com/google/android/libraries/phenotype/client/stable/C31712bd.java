package com.google.android.libraries.phenotype.client.stable;

import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bd */
/* compiled from: PG */
public final /* synthetic */ class C31712bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C31760t f85261a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f85262b;

    /* renamed from: c */
    public final /* synthetic */ C31691aj f85263c;

    /* renamed from: d */
    public final /* synthetic */ String f85264d;

    public /* synthetic */ C31712bd(C31760t tVar, C60870cx cxVar, C31691aj ajVar, String str) {
        this.f85261a = tVar;
        this.f85262b = cxVar;
        this.f85263c = ajVar;
        this.f85264d = str;
    }

    public final C60870cx apply(Object obj) {
        C31760t tVar = this.f85261a;
        C60870cx cxVar = this.f85262b;
        C31691aj ajVar = this.f85263c;
        String str = this.f85264d;
        Void voidR = (Void) obj;
        C31733by byVar = (C31733by) C60856cj.m92909r(cxVar);
        if (byVar.f85308b.isEmpty()) {
            return C60866ct.f164955a;
        }
        return C60922j.m93045h(C60838bs.m92859i(C60922j.m93044g(C60838bs.m92859i(C31700as.m59035a(tVar).mo46042d()), new C31696ao(ajVar.f85214a), tVar.mo37368h())), new C31713be(str, ajVar, tVar, byVar), tVar.mo37368h());
    }
}
