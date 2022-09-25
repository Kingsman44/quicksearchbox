package com.google.android.libraries.assistant.p1484g.p1490c.p1491a;

import android.net.Uri;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b */
/* compiled from: PG */
final class C17963b extends C18095i {

    /* renamed from: a */
    private final Uri f51425a;

    /* renamed from: b */
    private final String f51426b;

    public C17963b(Uri uri, String str) {
        this.f51425a = uri;
        this.f51426b = str;
    }

    /* renamed from: a */
    public final Uri mo23509a() {
        return this.f51425a;
    }

    /* renamed from: b */
    public final String mo23510b() {
        return this.f51426b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18095i) {
            C18095i iVar = (C18095i) obj;
            return this.f51425a.equals(iVar.mo23509a()) && this.f51426b.equals(iVar.mo23510b());
        }
    }

    public final int hashCode() {
        return ((this.f51425a.hashCode() ^ 1000003) * 1000003) ^ this.f51426b.hashCode();
    }

    public final String toString() {
        String obj = this.f51425a.toString();
        String str = this.f51426b;
        return "Results{uri=" + obj + ", mimeType=" + str + "}";
    }
}
