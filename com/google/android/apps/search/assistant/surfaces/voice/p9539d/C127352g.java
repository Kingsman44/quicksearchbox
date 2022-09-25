package com.google.android.apps.search.assistant.surfaces.voice.p9539d;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import dagger.C68214a;
import p3186j$.util.function.Supplier;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.g */
/* compiled from: PG */
public final class C127352g {

    /* renamed from: a */
    private final C32836cd f350708a;

    /* renamed from: b */
    private final C68214a f350709b;

    /* renamed from: c */
    private final boolean f350710c;

    public C127352g(C32836cd cdVar, C68214a aVar, boolean z) {
        C69664n.m101061g(cdVar, "key");
        C69664n.m101061g(aVar, "supplier");
        this.f350708a = cdVar;
        this.f350709b = aVar;
        this.f350710c = z;
    }

    /* renamed from: a */
    public final C32597b mo108030a(Supplier supplier) {
        return new C127370o(this.f350708a, supplier, this.f350710c, this.f350709b);
    }
}
