package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util.lockednavigation.impl;

import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129565ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.util.lockednavigation.impl.a */
/* compiled from: PG */
final class C129342a implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ LockedNavigationRequestHandlerImpl f355233a;

    /* renamed from: b */
    final /* synthetic */ C129676j f355234b;

    public C129342a(LockedNavigationRequestHandlerImpl lockedNavigationRequestHandlerImpl, C129676j jVar) {
        this.f355233a = lockedNavigationRequestHandlerImpl;
        this.f355234b = jVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C128258a aVar = (C128258a) obj;
        if (aVar == C128258a.SUCCEEDED) {
            LockedNavigationRequestHandlerImpl lockedNavigationRequestHandlerImpl = this.f355233a;
            C129565ag.m211551a(lockedNavigationRequestHandlerImpl.f355227a, this.f355234b);
        } else if (aVar == C128258a.CANCELLED || aVar == C128258a.ERROR) {
            this.f355233a.f355228b.mo109082c();
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
        return C69788q.f186170a;
    }
}
