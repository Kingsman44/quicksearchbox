package com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d;

import com.google.assistant.p3897e.p3921j.p3926e.C51952fe;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.d.b */
/* compiled from: PG */
public final class C33213b extends C33220i {

    /* renamed from: a */
    public C33218g f88820a;

    /* renamed from: b */
    private C33221j f88821b;

    /* renamed from: c */
    private C51952fe f88822c;

    /* renamed from: a */
    public final C33222k mo38594a() {
        C51952fe feVar;
        C33221j jVar = this.f88821b;
        if (jVar != null && (feVar = this.f88822c) != null) {
            return new C33214c(jVar, feVar, this.f88820a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f88821b == null) {
            sb.append(" renderingStatus");
        }
        if (this.f88822c == null) {
            sb.append(" renderingStrategy");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo38595b(C33221j jVar) {
        if (jVar != null) {
            this.f88821b = jVar;
            return;
        }
        throw new NullPointerException("Null renderingStatus");
    }

    /* renamed from: c */
    public final void mo38596c(C51952fe feVar) {
        if (feVar != null) {
            this.f88822c = feVar;
            return;
        }
        throw new NullPointerException("Null renderingStrategy");
    }
}
