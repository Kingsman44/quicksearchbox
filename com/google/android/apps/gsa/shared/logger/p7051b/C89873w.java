package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.common.p4522b.C58541iw;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.w */
/* compiled from: PG */
final class C89873w extends C89853c {

    /* renamed from: a */
    public C22804a f246228a;

    /* renamed from: b */
    public C22804a f246229b;

    /* renamed from: c */
    private C89851ag f246230c;

    /* renamed from: d */
    private C58541iw f246231d;

    /* renamed from: e */
    private int f246232e;

    /* renamed from: a */
    public final C89854d mo83687a() {
        int i;
        C22804a aVar;
        C58541iw iwVar;
        C89851ag agVar = this.f246230c;
        if (agVar != null && (i = this.f246232e) != 0 && (aVar = this.f246229b) != null && (iwVar = this.f246231d) != null) {
            return new C89874x(agVar, i, this.f246228a, aVar, iwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f246230c == null) {
            sb.append(" flowType");
        }
        if (this.f246232e == 0) {
            sb.append(" status");
        }
        if (this.f246229b == null) {
            sb.append(" endEvent");
        }
        if (this.f246231d == null) {
            sb.append(" events");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo83688b(C58541iw iwVar) {
        if (iwVar != null) {
            this.f246231d = iwVar;
            return;
        }
        throw new NullPointerException("Null events");
    }

    /* renamed from: c */
    public final void mo83689c(C89851ag agVar) {
        if (agVar != null) {
            this.f246230c = agVar;
            return;
        }
        throw new NullPointerException("Null flowType");
    }

    /* renamed from: d */
    public final void mo83690d(int i) {
        this.f246232e = i;
    }
}
