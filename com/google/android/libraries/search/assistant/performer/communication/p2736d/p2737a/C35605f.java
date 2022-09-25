package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a;

import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C35605f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C35606g f93446a;

    /* renamed from: b */
    public final /* synthetic */ C34890k f93447b;

    /* renamed from: c */
    public final /* synthetic */ C35602c f93448c;

    public /* synthetic */ C35605f(C35606g gVar, C34890k kVar, C35602c cVar) {
        this.f93446a = gVar;
        this.f93447b = kVar;
        this.f93448c = cVar;
    }

    public final Object call() {
        C35606g gVar = this.f93446a;
        C34890k kVar = this.f93447b;
        C35602c cVar = this.f93448c;
        C58833ax j = C58833ax.m90833j(kVar);
        gVar.f93452d.set(j);
        C35604e eVar = new C35604e(gVar, j, cVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(eVar), gVar.f93450b), "Failed to run side effects", new Object[0]);
        return null;
    }
}
