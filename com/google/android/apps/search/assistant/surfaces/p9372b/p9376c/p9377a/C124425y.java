package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2828y.p2853n.C37004a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.y */
/* compiled from: PG */
public final /* synthetic */ class C124425y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124426z f343406a;

    /* renamed from: b */
    public final /* synthetic */ C32801aw f343407b;

    public /* synthetic */ C124425y(C124426z zVar, C32801aw awVar) {
        this.f343406a = zVar;
        this.f343407b = awVar;
    }

    public final C60870cx apply(Object obj) {
        C124426z zVar = this.f343406a;
        C32801aw awVar = this.f343407b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C60870cx a = zVar.f343411c.mo40535a(Optional.m71637of((C0320v) optional.get()), C37004a.m65697a());
            C124424x xVar = C124424x.f343405a;
            return C60922j.m93044g(a, C47810es.m84963c(xVar), zVar.f343412d);
        }
        ((C59052c) ((C59052c) C124426z.f343408a.mo56226d()).mo56372aa(37041)).mo56386p("Media controller not found");
        return C60856cj.m92900i(awVar);
    }
}
