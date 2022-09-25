package com.google.android.libraries.lens.view.gleam;

import android.graphics.Path;

/* renamed from: com.google.android.libraries.lens.view.gleam.h */
/* compiled from: PG */
final class C26599h extends C26490bv {

    /* renamed from: a */
    private final String f72524a;

    /* renamed from: b */
    private final Path f72525b;

    public C26599h(String str, Path path) {
        if (str != null) {
            this.f72524a = str;
            this.f72525b = path;
            return;
        }
        throw new NullPointerException("Null visualObjectId");
    }

    /* renamed from: a */
    public final Path mo31738a() {
        return this.f72525b;
    }

    /* renamed from: b */
    public final String mo31739b() {
        return this.f72524a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26490bv) {
            C26490bv bvVar = (C26490bv) obj;
            return this.f72524a.equals(bvVar.mo31739b()) && this.f72525b.equals(bvVar.mo31738a());
        }
    }

    public final int hashCode() {
        return ((this.f72524a.hashCode() ^ 1000003) * 1000003) ^ this.f72525b.hashCode();
    }

    public final String toString() {
        String str = this.f72524a;
        String obj = this.f72525b.toString();
        return "VisualObjectIdToPath{visualObjectId=" + str + ", path=" + obj + "}";
    }
}
