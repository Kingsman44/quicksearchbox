package com.google.android.libraries.search.assistant.notification.p2711b;

import android.service.notification.StatusBarNotification;
import androidx.core.app.C1787ad;
import androidx.core.app.C1788ae;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.d */
/* compiled from: PG */
public final /* synthetic */ class C34856d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C34860h f92439a;

    /* renamed from: b */
    public final /* synthetic */ C1788ae f92440b;

    /* renamed from: c */
    public final /* synthetic */ C1787ad f92441c;

    /* renamed from: d */
    public final /* synthetic */ StatusBarNotification f92442d;

    public /* synthetic */ C34856d(C34860h hVar, C1788ae aeVar, C1787ad adVar, StatusBarNotification statusBarNotification) {
        this.f92439a = hVar;
        this.f92440b = aeVar;
        this.f92441c = adVar;
        this.f92442d = statusBarNotification;
    }

    public final C60870cx apply(Object obj) {
        C34860h hVar = this.f92439a;
        C1788ae aeVar = this.f92440b;
        C1787ad adVar = this.f92441c;
        StatusBarNotification statusBarNotification = this.f92442d;
        Optional optional = (Optional) obj;
        if (!optional.isPresent() || C58837ba.m90859h((String) optional.get())) {
            return C60856cj.m92900i(Optional.empty());
        }
        C34866n nVar = hVar.f92451c;
        String str = (String) optional.get();
        C60870cx d = nVar.mo39537d(str, hVar.f92454f);
        C34864l lVar = new C34864l(str);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(lVar), nVar.f92463b);
        C34857e eVar = new C34857e(hVar, aeVar, adVar, statusBarNotification, optional);
        return C60922j.m93044g(g, C47810es.m84963c(eVar), hVar.f92452d);
    }
}
