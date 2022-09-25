package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.notificationlistener.C83382ab;
import com.google.android.apps.gsa.notificationlistener.C83387d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.q */
/* compiled from: PG */
final class C36589q implements C83382ab {

    /* renamed from: a */
    final /* synthetic */ C36557ac f95409a;

    /* renamed from: b */
    final /* synthetic */ C2164c f95410b;

    /* renamed from: c */
    final /* synthetic */ C36591s f95411c;

    public C36589q(C36591s sVar, C36557ac acVar, C2164c cVar) {
        this.f95411c = sVar;
        this.f95409a = acVar;
        this.f95410b = cVar;
    }

    /* renamed from: a */
    public final void mo40164a() {
        C83387d.m132717g(this);
        if (C83387d.m132712b(this.f95411c.f95417c, this.f95409a)) {
            this.f95410b.mo5437b((Object) null);
            return;
        }
        ((C59052c) ((C59052c) C36591s.f95415a.mo56226d()).mo56372aa(51498)).mo56386p("Failed to register subscriber while GNLS is connected");
        this.f95410b.mo5439d(new IllegalStateException("Failed to register subscriber while GNLS is connected"));
    }
}
