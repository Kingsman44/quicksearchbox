package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.a */
/* compiled from: PG */
final class C82045a extends C82070ay {

    /* renamed from: a */
    private final Drawable f224276a;

    /* renamed from: b */
    private final Drawable f224277b;

    /* renamed from: c */
    private final Drawable f224278c;

    public C82045a(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        this.f224276a = drawable;
        this.f224277b = drawable2;
        this.f224278c = drawable3;
    }

    /* renamed from: a */
    public final Drawable mo75482a() {
        return this.f224278c;
    }

    /* renamed from: b */
    public final Drawable mo75483b() {
        return this.f224277b;
    }

    /* renamed from: c */
    public final Drawable mo75484c() {
        return this.f224276a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82070ay) {
            C82070ay ayVar = (C82070ay) obj;
            Drawable drawable = this.f224276a;
            if (drawable != null ? drawable.equals(ayVar.mo75484c()) : ayVar.mo75484c() == null) {
                Drawable drawable2 = this.f224277b;
                if (drawable2 != null ? drawable2.equals(ayVar.mo75483b()) : ayVar.mo75483b() == null) {
                    Drawable drawable3 = this.f224278c;
                    if (drawable3 != null ? drawable3.equals(ayVar.mo75482a()) : ayVar.mo75482a() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f224276a);
        String valueOf2 = String.valueOf(this.f224277b);
        String valueOf3 = String.valueOf(this.f224278c);
        return "ShadowConfig{topShadow=" + valueOf + ", middleShadow=" + valueOf2 + ", bottomShadow=" + valueOf3 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        Drawable drawable = this.f224276a;
        int i3 = 0;
        if (drawable == null) {
            i = 0;
        } else {
            i = drawable.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        Drawable drawable2 = this.f224277b;
        if (drawable2 == null) {
            i2 = 0;
        } else {
            i2 = drawable2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Drawable drawable3 = this.f224278c;
        if (drawable3 != null) {
            i3 = drawable3.hashCode();
        }
        return i5 ^ i3;
    }
}
