package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.y */
/* compiled from: PG */
final class C11789y implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C11760ai f37944a;

    public C11789y(C11760ai aiVar) {
        this.f37944a = aiVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C69664n.m101061g(guVar, "it");
        if (guVar.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return this.f37944a.f37860d.mo20103a((BundledMessageNotification) guVar.get(0), 0, false);
    }
}
