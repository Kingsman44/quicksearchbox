package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C127771g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127773i f351698a;

    public /* synthetic */ C127771g(C127773i iVar) {
        this.f351698a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C127773i iVar = this.f351698a;
        C130348b bVar = (C130348b) obj;
        Optional d = bVar.mo109680d();
        if (d.isEmpty() || !iVar.f351702c) {
            return C60856cj.m92900i(C127746g.MODE_UNSPECIFIED);
        }
        C60870cx b = iVar.f351701b.mo108218b((String) d.get());
        C127772h hVar = new C127772h(bVar);
        return C60922j.m93044g(b, C47810es.m84963c(hVar), iVar.f351703d);
    }
}
