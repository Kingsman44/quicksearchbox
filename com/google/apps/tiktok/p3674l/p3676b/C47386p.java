package com.google.apps.tiktok.p3674l.p3676b;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.apps.tiktok.l.b.p */
/* compiled from: PG */
public final class C47386p {

    /* renamed from: a */
    private final AccessibilityManager f123112a;

    /* renamed from: b */
    private final C47374e f123113b;

    /* renamed from: c */
    private final C47770dh f123114c;

    public C47386p(AccessibilityManager accessibilityManager, C47374e eVar, C47770dh dhVar) {
        this.f123112a = accessibilityManager;
        this.f123113b = eVar;
        this.f123114c = dhVar;
    }

    /* renamed from: a */
    public final void mo51246a(Throwable th, View view) {
        C47380k b = this.f123113b.mo51243b(th);
        Snackbar q = Snackbar.m79661q((Context) null, view, b.f123104a, 0);
        if (!b.f123106c.isEmpty()) {
            C47378i iVar = (C47378i) b.f123106c.get(0);
            q.mo48352s(iVar.f123100a, new C47591co(this.f123114c, "snackbar_action_click", new C47385o(iVar, view)));
        }
        if (this.f123112a.isTouchExplorationEnabled()) {
            q.f117090k = -2;
        }
        q.mo48343h();
    }
}
