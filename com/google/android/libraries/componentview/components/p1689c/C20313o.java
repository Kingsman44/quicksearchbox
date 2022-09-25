package com.google.android.libraries.componentview.components.p1689c;

import com.google.android.libraries.componentview.components.p1689c.p1690a.C20162h;

/* renamed from: com.google.android.libraries.componentview.components.c.o */
/* compiled from: PG */
final class C20313o extends C20304f {

    /* renamed from: a */
    private final String f57085a;

    /* renamed from: b */
    private final C20162h f57086b;

    public C20313o(String str, C20162h hVar) {
        if (str != null) {
            this.f57085a = str;
            this.f57086b = hVar;
            return;
        }
        throw new NullPointerException("Null editTextId");
    }

    /* renamed from: a */
    public final C20162h mo25348a() {
        return this.f57086b;
    }

    /* renamed from: b */
    public final String mo25349b() {
        return this.f57085a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20304f) {
            C20304f fVar = (C20304f) obj;
            return this.f57085a.equals(fVar.mo25349b()) && this.f57086b.equals(fVar.mo25348a());
        }
    }

    public final int hashCode() {
        return ((this.f57085a.hashCode() ^ 1000003) * 1000003) ^ this.f57086b.hashCode();
    }

    public final String toString() {
        String str = this.f57085a;
        String obj = this.f57086b.toString();
        return "AppActionClickEventData{editTextId=" + str + ", selectedCandidate=" + obj + "}";
    }
}
