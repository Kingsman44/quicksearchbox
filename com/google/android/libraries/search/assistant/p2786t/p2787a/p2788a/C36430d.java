package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.notificationlistener.C83382ab;
import com.google.android.apps.gsa.notificationlistener.C83387d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.d */
/* compiled from: PG */
final class C36430d implements C83382ab {

    /* renamed from: a */
    final /* synthetic */ Optional f95125a;

    /* renamed from: b */
    final /* synthetic */ C2164c f95126b;

    /* renamed from: c */
    final /* synthetic */ C36431e f95127c;

    public C36430d(C36431e eVar, Optional optional, C2164c cVar) {
        this.f95127c = eVar;
        this.f95125a = optional;
        this.f95126b = cVar;
    }

    /* renamed from: a */
    public final void mo40164a() {
        C59071e eVar = C36431e.f95128a;
        C83387d.m132717g(this);
        Optional a = this.f95127c.mo40165a(this.f95125a);
        if (a.isPresent()) {
            this.f95126b.mo5437b((C58485gu) a.get());
            return;
        }
        ((C59052c) ((C59052c) C36431e.f95128a.mo56226d()).mo56372aa(51470)).mo56386p("NLS#getActiveNotifications() returned null");
        this.f95126b.mo5439d(new IllegalStateException("NLS#getActiveNotifications() returned null"));
    }
}
