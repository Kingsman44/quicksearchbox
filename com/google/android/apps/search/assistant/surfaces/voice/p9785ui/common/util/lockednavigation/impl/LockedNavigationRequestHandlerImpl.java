package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util.lockednavigation.impl;

import android.app.KeyguardManager;
import android.content.Intent;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128245a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util.lockednavigation.C129340a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129565ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.util.lockednavigation.impl.LockedNavigationRequestHandlerImpl */
/* compiled from: PG */
public final class LockedNavigationRequestHandlerImpl implements C129340a {

    /* renamed from: a */
    public final C129566ah f355227a;

    /* renamed from: b */
    public final C129540c f355228b;

    /* renamed from: c */
    public C60870cx f355229c;

    /* renamed from: d */
    private final KeyguardManager f355230d;

    /* renamed from: e */
    private final C128245a f355231e;

    public LockedNavigationRequestHandlerImpl(KeyguardManager keyguardManager, C128245a aVar, C129566ah ahVar, C129540c cVar, C47215a aVar2) {
        C69664n.m101061g(keyguardManager, "keyguardManager");
        C69664n.m101061g(aVar, "lockscreenKeyguard");
        C69664n.m101061g(aVar2, "fragmentHost");
        this.f355230d = keyguardManager;
        this.f355231e = aVar;
        this.f355227a = ahVar;
        this.f355228b = cVar;
        aVar2.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                C60870cx cxVar = LockedNavigationRequestHandlerImpl.this.f355229c;
                if (cxVar != null) {
                    cxVar.cancel(false);
                }
                LockedNavigationRequestHandlerImpl.this.f355229c = null;
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: a */
    public final void mo108978a(C129676j jVar) {
        C69664n.m101061g(jVar, "request");
        if (this.f355230d.isKeyguardLocked()) {
            C60870cx a = this.f355231e.mo108383a((Intent) null);
            C129342a aVar = new C129342a(this, jVar);
            this.f355229c = C60922j.m93044g(a, C47810es.m84963c(aVar), C60826bg.f164896a);
            return;
        }
        C129565ag.m211551a(this.f355227a, jVar);
    }
}
