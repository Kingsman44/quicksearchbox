package com.google.android.libraries.assistant.pcp.datastore.room;

import com.google.android.libraries.assistant.pcp.p1578m.C18995y;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.a */
/* compiled from: PG */
public final class C18611a extends C18628o {

    /* renamed from: a */
    private final int f52635a;

    /* renamed from: b */
    private final String f52636b;

    /* renamed from: c */
    private final C18995y f52637c;

    /* renamed from: d */
    private final int f52638d;

    public C18611a(int i, String str, C18995y yVar, int i2) {
        this.f52635a = i;
        this.f52636b = str;
        this.f52637c = yVar;
        this.f52638d = i2;
    }

    /* renamed from: a */
    public final int mo24079a() {
        return this.f52635a;
    }

    /* renamed from: b */
    public final C18995y mo24080b() {
        return this.f52637c;
    }

    /* renamed from: c */
    public final String mo24081c() {
        return this.f52636b;
    }

    /* renamed from: d */
    public final int mo24082d() {
        return this.f52638d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18628o) {
            C18628o oVar = (C18628o) obj;
            return this.f52635a == oVar.mo24079a() && this.f52636b.equals(oVar.mo24081c()) && this.f52637c.equals(oVar.mo24080b()) && this.f52638d == oVar.mo24082d();
        }
    }

    public final int hashCode() {
        return ((((((this.f52635a ^ 1000003) * 1000003) ^ this.f52636b.hashCode()) * 1000003) ^ this.f52637c.hashCode()) * 1000003) ^ this.f52638d;
    }

    public final String toString() {
        int i = this.f52635a;
        String str = this.f52636b;
        String obj = this.f52637c.toString();
        String num = Integer.toString(this.f52638d - 1);
        return "StoredElementEntity{featureType=" + i + ", id=" + str + ", storedElement=" + obj + ", structuredDataStateType=" + num + "}";
    }
}
