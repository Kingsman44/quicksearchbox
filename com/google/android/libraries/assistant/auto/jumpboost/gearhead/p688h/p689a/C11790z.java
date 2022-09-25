package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.z */
/* compiled from: PG */
final class C11790z implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ String f37945a;

    /* renamed from: b */
    final /* synthetic */ C69630p f37946b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f37947c;

    public C11790z(String str, C69630p pVar, C60870cx cxVar) {
        this.f37945a = str;
        this.f37946b = pVar;
        this.f37947c = cxVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            ((C58970a) C11760ai.f37857a.mo56226d()).mo56389s("No message notification found for %s", this.f37945a);
            return null;
        }
        C58974d dVar = C11760ai.f37857a;
        C69630p pVar = this.f37946b;
        Object obj2 = optional.get();
        C69664n.m101060f(obj2, "it.get()");
        Object r = C60856cj.m92909r(this.f37947c);
        C69664n.m101060f(r, "getDone(notificationsFuture)");
        return (C12985c) pVar.mo5192a(obj2, r);
    }
}
