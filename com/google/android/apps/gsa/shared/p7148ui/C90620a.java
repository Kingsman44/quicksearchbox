package com.google.android.apps.gsa.shared.p7148ui;

import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0395p;

/* renamed from: com.google.android.apps.gsa.shared.ui.a */
/* compiled from: PG */
public final class C90620a implements C90702n {

    /* renamed from: a */
    private final C0395p f253400a;

    /* renamed from: b */
    private final FragmentManager f253401b;

    public C90620a(C0395p pVar) {
        this.f253400a = pVar;
        this.f253401b = pVar.mo545jw();
    }

    /* renamed from: a */
    public final FragmentManager mo76781a() {
        return this.f253401b;
    }

    /* renamed from: b */
    public final boolean mo76782b() {
        if (this.f253401b.f659z) {
            return true;
        }
        return this.f253400a.isDestroyed();
    }
}
