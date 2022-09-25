package com.google.android.libraries.kids.p1982a.p1985c.p1986a;

import com.google.android.gms.auth.TokenData;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.kids.a.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C24034b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C24036d f65681a;

    public /* synthetic */ C24034b(C24036d dVar) {
        this.f65681a = dVar;
    }

    public final C60870cx apply(Object obj) {
        TokenData tokenData = (TokenData) obj;
        C60870cx b = C43205e.m76192b(this.f65681a.f65686d.mo117810a(tokenData.f387646b));
        C24035c cVar = new C24035c(tokenData);
        return C60922j.m93044g(b, C47810es.m84963c(cVar), C60826bg.f164896a);
    }
}
