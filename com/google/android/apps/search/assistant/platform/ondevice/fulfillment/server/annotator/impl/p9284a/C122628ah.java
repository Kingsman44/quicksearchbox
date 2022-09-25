package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C122628ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ WebrefAndPkgModelProvider f339826a;

    /* renamed from: b */
    public final /* synthetic */ C122640at f339827b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f339828c;

    /* renamed from: d */
    public final /* synthetic */ C122964p f339829d;

    public /* synthetic */ C122628ah(WebrefAndPkgModelProvider webrefAndPkgModelProvider, C122640at atVar, C122964p pVar, Runnable runnable) {
        this.f339826a = webrefAndPkgModelProvider;
        this.f339827b = atVar;
        this.f339829d = pVar;
        this.f339828c = runnable;
    }

    public final C60870cx apply(Object obj) {
        WebrefAndPkgModelProvider webrefAndPkgModelProvider = this.f339826a;
        C122640at atVar = this.f339827b;
        C122964p pVar = this.f339829d;
        Runnable runnable = this.f339828c;
        C122641au.m202045e(webrefAndPkgModelProvider, (Optional) obj, atVar, pVar);
        C122641au.m202042b(((C122639as) runnable).f339857a);
        return C60866ct.f164955a;
    }
}
