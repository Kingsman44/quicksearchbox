package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ia */
/* compiled from: PG */
public final /* synthetic */ class C29194ia implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79156a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f79157b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f79158c;

    /* renamed from: d */
    public final /* synthetic */ C60931s f79159d;

    public /* synthetic */ C29194ia(C29211ir irVar, C29392ep epVar, C29334dr drVar, C60931s sVar) {
        this.f79156a = irVar;
        this.f79157b = epVar;
        this.f79158c = drVar;
        this.f79159d = sVar;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79156a;
        C29392ep epVar = this.f79157b;
        C29334dr drVar = this.f79158c;
        C60931s sVar = this.f79159d;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(true);
        }
        C60870cx p = irVar.f79194d.mo34593p(epVar, drVar, sVar);
        C29177hk hkVar = new C29177hk(irVar, drVar);
        return C60922j.m93044g(p, C47810es.m84963c(hkVar), irVar.f79204n);
    }
}
