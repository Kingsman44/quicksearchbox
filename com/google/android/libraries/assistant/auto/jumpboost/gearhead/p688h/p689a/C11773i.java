package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.i */
/* compiled from: PG */
final class C11773i implements C58817ah {

    /* renamed from: a */
    public static final C11773i f37902a = new C11773i();

    public final /* synthetic */ Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C69664n.m101061g(guVar, "notificationList");
        if (!guVar.isEmpty()) {
            return (BundledMessageNotification) guVar.get(0);
        }
        C59071e eVar = C11750a.f37822a;
        C58976aa aaVar = C58975e.f156826a;
        throw new IllegalStateException("Failed to parse tapped notification");
    }
}
