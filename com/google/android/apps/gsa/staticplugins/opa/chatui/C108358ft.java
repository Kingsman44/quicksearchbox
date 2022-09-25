package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ft */
/* compiled from: PG */
public final class C108358ft {

    /* renamed from: a */
    public final Optional f301404a;

    /* renamed from: b */
    public final C107698i f301405b;

    /* renamed from: c */
    public final Supplier f301406c;

    /* renamed from: d */
    private final C22871g f301407d;

    public C108358ft(Optional optional, C107698i iVar, C22871g gVar, Supplier supplier) {
        this.f301404a = optional;
        this.f301405b = iVar;
        this.f301407d = gVar;
        this.f301406c = supplier;
    }

    /* renamed from: a */
    public final void mo96808a(String str, String str2) {
        this.f301407d.mo28212l("sending speech", new C108357fs(this, str, str2));
    }

    /* renamed from: b */
    public final void mo96809b(String str) {
        if (this.f301406c != null) {
            this.f301407d.mo28212l("setting text", new C108356fr(this, str));
        }
    }
}
