package com.google.android.libraries.lens.view.p2154p.p2155a;

import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.p.a.a */
/* compiled from: PG */
final class C27531a extends C27538h {

    /* renamed from: a */
    public C27540j f75304a;

    /* renamed from: b */
    private C62491dn f75305b;

    /* renamed from: c */
    private float f75306c;

    /* renamed from: d */
    private byte f75307d;

    /* renamed from: a */
    public final C27539i mo33075a() {
        if (this.f75307d == 1 && this.f75305b != null && this.f75304a != null) {
            return new C27532b(this.f75305b, this.f75304a, this.f75306c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75305b == null) {
            sb.append(" quad");
        }
        if (this.f75304a == null) {
            sb.append(" size");
        }
        if (this.f75307d == 0) {
            sb.append(" confidence");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo33076b(float f) {
        this.f75306c = f;
        this.f75307d = 1;
    }

    /* renamed from: c */
    public final void mo33077c(C62491dn dnVar) {
        if (dnVar != null) {
            this.f75305b = dnVar;
            return;
        }
        throw new NullPointerException("Null quad");
    }
}
