package com.google.android.libraries.lens.view.infopanel.p2138a.p2139a;

import com.google.p4017at.p4056g.p4057a.p4058a.C53967ab;
import com.google.p4017at.p4056g.p4057a.p4058a.C54073y;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.a.a */
/* compiled from: PG */
final class C26962a extends C26964c {

    /* renamed from: a */
    public String f73522a;

    /* renamed from: b */
    public String f73523b;

    /* renamed from: c */
    private C53967ab f73524c;

    /* renamed from: d */
    private C54073y f73525d;

    /* renamed from: a */
    public final C26965d mo32399a() {
        String str;
        C53967ab abVar;
        C54073y yVar;
        String str2 = this.f73522a;
        if (str2 != null && (str = this.f73523b) != null && (abVar = this.f73524c) != null && (yVar = this.f73525d) != null) {
            return new C26963b(str2, str, abVar, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f73522a == null) {
            sb.append(" title");
        }
        if (this.f73523b == null) {
            sb.append(" subtitle");
        }
        if (this.f73524c == null) {
            sb.append(" style");
        }
        if (this.f73525d == null) {
            sb.append(" educationHeaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo32400b(C54073y yVar) {
        if (yVar != null) {
            this.f73525d = yVar;
            return;
        }
        throw new NullPointerException("Null educationHeaderMetadata");
    }

    /* renamed from: c */
    public final void mo32401c(C53967ab abVar) {
        if (abVar != null) {
            this.f73524c = abVar;
            return;
        }
        throw new NullPointerException("Null style");
    }

    /* renamed from: d */
    public final void mo32402d(String str) {
        if (str != null) {
            this.f73522a = str;
            return;
        }
        throw new NullPointerException("Null title");
    }
}
