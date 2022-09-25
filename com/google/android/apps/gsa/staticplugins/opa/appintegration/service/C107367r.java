package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.content.Context;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r */
/* compiled from: PG */
public final class C107367r {

    /* renamed from: a */
    public static final C59071e f298815a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.service.r");

    /* renamed from: b */
    public final Context f298816b;

    /* renamed from: c */
    public final Object f298817c = new Object();

    /* renamed from: d */
    public final Object f298818d = new Object();

    /* renamed from: e */
    public final List f298819e = new ArrayList();

    /* renamed from: f */
    public C107366q f298820f;

    /* renamed from: g */
    public Optional f298821g = Optional.empty();

    /* renamed from: h */
    private final C22871g f298822h;

    public C107367r(Context context, C22871g gVar) {
        this.f298816b = context;
        this.f298822h = gVar;
    }

    /* renamed from: a */
    public final void mo95986a() {
        this.f298822h.mo28212l("[OPA] Schedule public search service connection", new C107365p(this));
    }

    /* renamed from: b */
    public final void mo95987b(C17883am amVar) {
        synchronized (this.f298817c) {
            this.f298819e.add(amVar.toByteArray());
        }
        mo95986a();
    }
}
