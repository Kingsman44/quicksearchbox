package com.google.android.libraries.lens.view.infopanel.p2138a.p2139a;

import com.google.p4017at.p4056g.p4057a.p4058a.C53967ab;
import com.google.p4017at.p4056g.p4057a.p4058a.C54073y;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.a.b */
/* compiled from: PG */
final class C26963b extends C26965d {

    /* renamed from: a */
    private final String f73526a;

    /* renamed from: b */
    private final String f73527b;

    /* renamed from: c */
    private final C53967ab f73528c;

    /* renamed from: d */
    private final C54073y f73529d;

    public C26963b(String str, String str2, C53967ab abVar, C54073y yVar) {
        this.f73526a = str;
        this.f73527b = str2;
        this.f73528c = abVar;
        this.f73529d = yVar;
    }

    /* renamed from: a */
    public final C54073y mo32403a() {
        return this.f73529d;
    }

    /* renamed from: b */
    public final C53967ab mo32404b() {
        return this.f73528c;
    }

    /* renamed from: c */
    public final String mo32405c() {
        return this.f73527b;
    }

    /* renamed from: d */
    public final String mo32406d() {
        return this.f73526a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26965d) {
            C26965d dVar = (C26965d) obj;
            return this.f73526a.equals(dVar.mo32406d()) && this.f73527b.equals(dVar.mo32405c()) && this.f73528c.equals(dVar.mo32404b()) && this.f73529d.equals(dVar.mo32403a());
        }
    }

    public final int hashCode() {
        return ((((((this.f73526a.hashCode() ^ 1000003) * 1000003) ^ this.f73527b.hashCode()) * 1000003) ^ this.f73528c.hashCode()) * 1000003) ^ this.f73529d.hashCode();
    }

    public final String toString() {
        String str = this.f73526a;
        String str2 = this.f73527b;
        String obj = this.f73528c.toString();
        String obj2 = this.f73529d.toString();
        return "InfoPanelHeaderModel{title=" + str + ", subtitle=" + str2 + ", style=" + obj + ", educationHeaderMetadata=" + obj2 + "}";
    }
}
