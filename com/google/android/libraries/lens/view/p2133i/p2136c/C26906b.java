package com.google.android.libraries.lens.view.p2133i.p2136c;

import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.lens.p4707j.C62584r;

/* renamed from: com.google.android.libraries.lens.view.i.c.b */
/* compiled from: PG */
final class C26906b extends C26915k {

    /* renamed from: a */
    private C62584r f73338a;

    /* renamed from: b */
    private C26897b f73339b;

    public C26906b() {
    }

    public C26906b(C26916l lVar) {
        C26907c cVar = (C26907c) lVar;
        this.f73338a = cVar.f73340a;
        this.f73339b = cVar.f73341b;
    }

    /* renamed from: a */
    public final C26916l mo32285a() {
        C26897b bVar;
        C62584r rVar = this.f73338a;
        if (rVar != null && (bVar = this.f73339b) != null) {
            return new C26907c(rVar, bVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f73338a == null) {
            sb.append(" deviceInfo");
        }
        if (this.f73339b == null) {
            sb.append(" deviceState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo32286b(C62584r rVar) {
        if (rVar != null) {
            this.f73338a = rVar;
            return;
        }
        throw new NullPointerException("Null deviceInfo");
    }

    /* renamed from: c */
    public final void mo32287c(C26897b bVar) {
        if (bVar != null) {
            this.f73339b = bVar;
            return;
        }
        throw new NullPointerException("Null deviceState");
    }
}
