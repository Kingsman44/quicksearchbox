package com.google.android.apps.search.assistant.surfaces.voice.p9539d;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.function.Supplier;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.o */
/* compiled from: PG */
public final class C127370o implements C32597b {

    /* renamed from: a */
    private final C32836cd f350740a;

    /* renamed from: b */
    private final Supplier f350741b;

    /* renamed from: c */
    private final C68214a f350742c;

    /* renamed from: d */
    private final C32601f f350743d;

    public C127370o(C32836cd cdVar, Supplier supplier, boolean z, C68214a aVar) {
        C69664n.m101061g(cdVar, "supportedContextKey");
        C69664n.m101061g(aVar, "supplier");
        this.f350740a = cdVar;
        this.f350741b = supplier;
        this.f350742c = aVar;
        this.f350743d = z ? new C32601f() : null;
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        return this.f350743d;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return this.f350740a;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        Object obj = this.f350741b.get();
        C69664n.m101060f(obj, "queryContext.get()");
        return ((C127369n) this.f350742c.mo27525b()).mo107986a((C127289i) obj, beVar);
    }
}
