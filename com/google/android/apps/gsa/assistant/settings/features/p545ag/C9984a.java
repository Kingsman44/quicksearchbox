package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.a */
/* compiled from: PG */
final class C9984a extends C10053s {

    /* renamed from: a */
    public final int f34166a;

    /* renamed from: b */
    private final C58528ij f34167b;

    /* renamed from: c */
    private final int f34168c;

    /* renamed from: d */
    private final int f34169d;

    public C9984a(C58528ij ijVar, int i, int i2, int i3) {
        if (ijVar != null) {
            this.f34167b = ijVar;
            this.f34166a = i;
            this.f34168c = i2;
            this.f34169d = i3;
            return;
        }
        throw new NullPointerException("Null contextTypes");
    }

    /* renamed from: a */
    public final int mo18168a() {
        return this.f34166a;
    }

    /* renamed from: b */
    public final int mo18169b() {
        return this.f34168c;
    }

    /* renamed from: c */
    public final int mo18170c() {
        return this.f34169d;
    }

    /* renamed from: d */
    public final C58528ij mo18171d() {
        return this.f34167b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10053s) {
            C10053s sVar = (C10053s) obj;
            return this.f34167b.equals(sVar.mo18171d()) && this.f34166a == sVar.mo18168a() && this.f34168c == sVar.mo18169b() && this.f34169d == sVar.mo18170c();
        }
    }

    public final int hashCode() {
        return ((((((this.f34167b.hashCode() ^ 1000003) * 1000003) ^ this.f34166a) * 1000003) ^ this.f34168c) * 1000003) ^ this.f34169d;
    }

    public final String toString() {
        String obj = this.f34167b.toString();
        int i = this.f34166a;
        int i2 = this.f34168c;
        int i3 = this.f34169d;
        return "ContextTypesToggle{contextTypes=" + obj + ", itemViewId=" + i + ", subtitleTextId=" + i2 + ", visualElementId=" + i3 + "}";
    }
}
