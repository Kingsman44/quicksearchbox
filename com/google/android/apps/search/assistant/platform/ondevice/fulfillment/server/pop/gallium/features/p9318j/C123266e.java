package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9318j;

import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5130a.C65740y;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.j.e */
/* compiled from: PG */
public final /* synthetic */ class C123266e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123269h f340993a;

    /* renamed from: b */
    public final /* synthetic */ String f340994b;

    /* renamed from: c */
    public final /* synthetic */ C65740y f340995c;

    public /* synthetic */ C123266e(C123269h hVar, String str, C65740y yVar) {
        this.f340993a = hVar;
        this.f340994b = str;
        this.f340995c = yVar;
    }

    public final C60870cx apply(Object obj) {
        C123269h hVar = this.f340993a;
        String str = this.f340994b;
        Geller geller = (Geller) obj;
        C62963cj<C65753ak> cjVar = new C62963cj(this.f340995c.f178595b, C65740y.f178591c);
        ArrayList arrayList = new ArrayList();
        for (C65753ak akVar : cjVar) {
            C60870cx j = geller.mo27183j(str, akVar);
            C123267f fVar = new C123267f(akVar);
            arrayList.add(C60846c.m92878g(j, Throwable.class, C47810es.m84963c(fVar), hVar.f340999b));
        }
        return C60922j.m93044g(C60856cj.m92906o(arrayList), C47810es.m84963c(new C123268g(cjVar)), hVar.f340999b);
    }
}
