package com.google.android.apps.gsa.staticplugins.opa.tapas.p8551j;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.j.d */
/* compiled from: PG */
public final class C112106d {

    /* renamed from: a */
    public final C22871g f311323a;

    /* renamed from: b */
    public final C68214a f311324b;

    /* renamed from: c */
    public volatile C60870cx f311325c = C60856cj.m92900i(Optional.empty());

    /* renamed from: d */
    private final C22871g f311326d;

    /* renamed from: e */
    private final C22871g f311327e;

    public C112106d(C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar) {
        this.f311326d = gVar;
        this.f311327e = gVar2;
        this.f311323a = gVar3;
        this.f311324b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo99397a(String str) {
        return this.f311327e.mo28209i(this.f311326d.mo28210j(this.f311325c, "getServing", new C112104b(this)), "fetchSuggestions", new C112105c(str));
    }
}
