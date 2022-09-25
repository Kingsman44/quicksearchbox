package com.google.android.libraries.onegoogle.popovercontainer;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.d */
/* compiled from: PG */
public final class C31042d extends C31039an {

    /* renamed from: a */
    public final C31032ag f83626a;

    /* renamed from: b */
    public final C31032ag f83627b;

    /* renamed from: c */
    public final C31032ag f83628c;

    /* renamed from: d */
    public final int f83629d;

    public C31042d(C31032ag agVar, C31032ag agVar2, C31032ag agVar3, int i) {
        this.f83626a = agVar;
        this.f83627b = agVar2;
        this.f83628c = agVar3;
        this.f83629d = i;
    }

    /* renamed from: a */
    public final int mo36733a() {
        return this.f83629d;
    }

    /* renamed from: b */
    public final C31032ag mo36734b() {
        return this.f83627b;
    }

    /* renamed from: c */
    public final C31032ag mo36735c() {
        return this.f83628c;
    }

    /* renamed from: d */
    public final C31032ag mo36736d() {
        return this.f83626a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31039an) {
            C31039an anVar = (C31039an) obj;
            return this.f83626a.equals(anVar.mo36736d()) && this.f83627b.equals(anVar.mo36734b()) && this.f83628c.equals(anVar.mo36735c()) && this.f83629d == anVar.mo36733a();
        }
    }

    public final int hashCode() {
        return ((((((this.f83626a.hashCode() ^ 1000003) * 1000003) ^ this.f83627b.hashCode()) * 1000003) ^ this.f83628c.hashCode()) * 1000003) ^ this.f83629d;
    }

    public final String toString() {
        String obj = this.f83626a.toString();
        String obj2 = this.f83627b.toString();
        String obj3 = this.f83628c.toString();
        int i = this.f83629d;
        return "ViewProviders{headerViewProvider=" + obj + ", contentViewProvider=" + obj2 + ", footerViewProvider=" + obj3 + ", title=" + i + "}";
    }
}
