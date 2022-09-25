package com.google.android.apps.gsa.nowoverlayservice;

import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0395p;
import com.google.android.apps.gsa.shared.p7148ui.C90702n;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.at */
/* compiled from: PG */
public final class C83445at implements C90702n {

    /* renamed from: a */
    private final C0395p f227476a;

    public C83445at(C0395p pVar) {
        this.f227476a = pVar;
    }

    /* renamed from: a */
    public final FragmentManager mo76781a() {
        return this.f227476a.mo545jw();
    }

    /* renamed from: b */
    public final boolean mo76782b() {
        FragmentManager jw = this.f227476a.mo545jw();
        return jw == null || jw.f659z || this.f227476a.isDestroyed();
    }
}
