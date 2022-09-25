package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ad */
/* compiled from: PG */
final class C11755ad implements C58817ah {

    /* renamed from: a */
    public static final C11755ad f37848a = new C11755ad();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C69664n.m101061g(guVar, "notificationList");
        if (!guVar.isEmpty()) {
            return (BundledMessageNotification) guVar.get(0);
        }
        C58974d dVar = C11760ai.f37857a;
        throw new IllegalStateException("Failed to parse tapped notification");
    }
}
