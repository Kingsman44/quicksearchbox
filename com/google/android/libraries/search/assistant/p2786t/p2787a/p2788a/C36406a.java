package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.notificationlistener.C83387d;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36406a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C36431e f95085a;

    /* renamed from: b */
    public final /* synthetic */ Optional f95086b;

    public /* synthetic */ C36406a(C36431e eVar, Optional optional) {
        this.f95085a = eVar;
        this.f95086b = optional;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C36431e eVar = this.f95085a;
        Optional optional = this.f95086b;
        C36430d dVar = new C36430d(eVar, optional, cVar);
        cVar.mo5436a(C47810es.m84977q(new C36428b(dVar)), eVar.f95132e);
        C83387d.m132714d(dVar);
        Optional a = eVar.mo40165a(optional);
        if (a.isPresent()) {
            C83387d.m132717g(dVar);
            cVar.mo5437b((C58485gu) a.get());
            return "#getActiveNotificationsInternal";
        }
        C36619a.m65147c(eVar.f95131d);
        eVar.f95130c.mo76689a();
        return "#getActiveNotificationsInternal";
    }
}
