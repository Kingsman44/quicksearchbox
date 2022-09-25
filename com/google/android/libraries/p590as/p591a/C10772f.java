package com.google.android.libraries.p590as.p591a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.libraries.as.a.f */
/* compiled from: PG */
public final class C10772f extends C10775i {

    /* renamed from: a */
    public C58833ax f35765a;

    /* renamed from: b */
    public C58833ax f35766b;

    /* renamed from: c */
    public C58833ax f35767c;

    /* renamed from: d */
    private C67451at f35768d;

    public C10772f() {
        C58836b bVar = C58836b.f156633a;
        this.f35765a = bVar;
        this.f35766b = bVar;
        this.f35767c = bVar;
    }

    /* renamed from: a */
    public final C10776j mo19251a() {
        C67451at atVar = this.f35768d;
        if (atVar != null) {
            return new C10773g(atVar, this.f35765a, this.f35766b, this.f35767c);
        }
        throw new IllegalStateException("Missing required properties: format");
    }

    /* renamed from: b */
    public final C58833ax mo19252b() {
        return this.f35767c;
    }

    /* renamed from: c */
    public final C58833ax mo19253c() {
        return this.f35765a;
    }

    /* renamed from: d */
    public final C58833ax mo19254d() {
        return this.f35766b;
    }

    /* renamed from: e */
    public final C67451at mo19255e() {
        C67451at atVar = this.f35768d;
        if (atVar != null) {
            return atVar;
        }
        throw new IllegalStateException("Property \"format\" has not been set");
    }

    /* renamed from: f */
    public final void mo19256f(C58833ax axVar) {
        this.f35767c = axVar;
    }

    /* renamed from: g */
    public final void mo19257g(C67451at atVar) {
        if (atVar != null) {
            this.f35768d = atVar;
            return;
        }
        throw new NullPointerException("Null format");
    }

    /* renamed from: h */
    public final void mo19258h(C58833ax axVar) {
        this.f35765a = axVar;
    }

    /* renamed from: i */
    public final void mo19259i(C58833ax axVar) {
        this.f35766b = axVar;
    }
}
