package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34880h;
import com.google.assistant.p3897e.p3921j.aeq;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.s */
/* compiled from: PG */
public final /* synthetic */ class C35658s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ aeq f93536a;

    public /* synthetic */ C35658s(aeq aeq) {
        this.f93536a = aeq;
    }

    public final C60870cx apply(Object obj) {
        aeq aeq = this.f93536a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("Cache has not been set"));
        }
        int i = aeq.f134950b;
        Optional a = C34880h.m63712a((C34890k) axVar.mo56107c(), i);
        if (a.isPresent()) {
            return C60856cj.m92900i((BundledMessageNotification) a.get());
        }
        return C60856cj.m92899h(new IllegalStateException("Notification at index " + i + " is not present"));
    }
}
