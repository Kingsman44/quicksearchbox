package com.google.android.libraries.assistant.auto.tng.assistant.p885e;

import com.google.android.libraries.search.assistant.appactions.p2501a.C32434aa;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32438ae;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a */
/* compiled from: PG */
public final class C13081a extends C13100d {

    /* renamed from: a */
    private Optional f40585a = Optional.empty();

    /* renamed from: b */
    private Optional f40586b = Optional.empty();

    /* renamed from: c */
    private Optional f40587c = Optional.empty();

    public C13081a() {
    }

    /* renamed from: a */
    public final C13101e mo20879a() {
        return new C13098b(this.f40585a, this.f40586b, this.f40587c);
    }

    /* renamed from: b */
    public final void mo20880b(C32434aa aaVar) {
        this.f40585a = Optional.m71637of(aaVar);
    }

    /* renamed from: c */
    public final void mo20881c(C32438ae aeVar) {
        this.f40586b = Optional.m71637of(aeVar);
    }

    /* renamed from: d */
    public final void mo20882d(String str) {
        this.f40587c = Optional.m71637of(str);
    }

    public C13081a(C13101e eVar) {
        C13098b bVar = (C13098b) eVar;
        this.f40585a = bVar.f40629a;
        this.f40586b = bVar.f40630b;
        this.f40587c = bVar.f40631c;
    }
}
