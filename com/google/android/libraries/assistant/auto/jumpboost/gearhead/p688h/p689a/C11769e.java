package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.e */
/* compiled from: PG */
final class C11769e implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ String f37896a;

    /* renamed from: b */
    final /* synthetic */ C69630p f37897b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f37898c;

    public C11769e(String str, C69630p pVar, C60870cx cxVar) {
        this.f37896a = str;
        this.f37897b = pVar;
        this.f37898c = cxVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C59052c cVar = (C59052c) C11750a.f37822a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "AssistantRequestFactory");
            String str = this.f37896a;
            cVar.mo56379ah(new C59094n(43444));
            cVar.mo56389s("No message notification found for %s", str);
            return null;
        }
        C59071e eVar = C11750a.f37822a;
        C58976aa aaVar = C58975e.f156826a;
        C69630p pVar = this.f37897b;
        Object obj2 = optional.get();
        C69664n.m101060f(obj2, "it.get()");
        Object r = C60856cj.m92909r(this.f37898c);
        C69664n.m101060f(r, "getDone(notificationsFuture)");
        return (C12985c) pVar.mo5192a(obj2, r);
    }
}
