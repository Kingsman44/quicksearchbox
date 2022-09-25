package com.google.android.libraries.lens.view.gleam;

import android.graphics.Path;

/* renamed from: com.google.android.libraries.lens.view.gleam.d */
/* compiled from: PG */
final class C26522d extends C26464aw {

    /* renamed from: a */
    private final Path f72270a;

    /* renamed from: b */
    private final float f72271b;

    public C26522d(Path path, float f) {
        this.f72270a = path;
        this.f72271b = f;
    }

    /* renamed from: a */
    public final float mo31717a() {
        return this.f72271b;
    }

    /* renamed from: b */
    public final Path mo31718b() {
        return this.f72270a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26464aw) {
            C26464aw awVar = (C26464aw) obj;
            return this.f72270a.equals(awVar.mo31718b()) && Float.floatToIntBits(this.f72271b) == Float.floatToIntBits(awVar.mo31717a());
        }
    }

    public final int hashCode() {
        return ((this.f72270a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f72271b);
    }

    public final String toString() {
        String obj = this.f72270a.toString();
        float f = this.f72271b;
        return "DrawableScrimCutoutPath{path=" + obj + ", alphaFactor=" + f + "}";
    }
}
