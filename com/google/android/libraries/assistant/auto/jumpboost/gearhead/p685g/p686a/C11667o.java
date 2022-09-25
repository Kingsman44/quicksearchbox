package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13336t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.o */
/* compiled from: PG */
public final /* synthetic */ class C11667o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11668p f37649a;

    /* renamed from: b */
    public final /* synthetic */ boolean f37650b;

    /* renamed from: c */
    public final /* synthetic */ String f37651c;

    public /* synthetic */ C11667o(C11668p pVar, boolean z, String str) {
        this.f37649a = pVar;
        this.f37650b = z;
        this.f37651c = str;
    }

    public final C60870cx apply(Object obj) {
        C47633f fVar;
        C11668p pVar = this.f37649a;
        boolean z = this.f37650b;
        String str = this.f37651c;
        MessagingInfo messagingInfo = (MessagingInfo) obj;
        StatusBarNotification statusBarNotification = z ? messagingInfo.f387115a : null;
        if (statusBarNotification == null) {
            List list = messagingInfo.f387116b;
            if (list == null) {
                fVar = C13336t.m29580c(C58485gu.m89842j(messagingInfo.f387119e), new C11664l(pVar, messagingInfo), pVar.f37653b);
            } else {
                fVar = C13336t.m29580c(C58485gu.m89842j(list), new C11665m(pVar, messagingInfo), pVar.f37653b);
            }
            return C60922j.m93044g(C60922j.m93044g(C13336t.m29579b(fVar, pVar.f37653b), C47810es.m84963c(C11666n.f37648a), pVar.f37653b), C47810es.m84963c(C11662j.f37641a), pVar.f37653b);
        }
        return C13336t.m29578a(C60922j.m93045h(pVar.f37652a.mo39529a(C58485gu.m89846n(statusBarNotification), str), C47810es.m84966f(new C11663k(pVar, messagingInfo)), pVar.f37653b), pVar.f37653b);
    }
}
