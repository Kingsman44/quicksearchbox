package com.google.android.libraries.web.coordinator;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.b */
/* compiled from: PG */
public final class C43730b {

    /* renamed from: a */
    private final Fragment f114065a;

    /* renamed from: b */
    private final C69464a f114066b;

    public C43730b(Fragment fragment, C69464a aVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(aVar, "coordinatorInternalProvider");
        this.f114065a = fragment;
        this.f114066b = aVar;
    }

    /* renamed from: a */
    public final void mo46766a() {
        if (this.f114065a.getLifecycle().mo5789a() == C2383n.INITIALIZED) {
            this.f114066b.mo17428b();
            return;
        }
        throw new IllegalStateException("WebCoordinatorConfigurator.initialize() must be called from a fragment peer's constructor.");
    }
}
