package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83959a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.d */
/* compiled from: PG */
final class C102009d extends C102016k {

    /* renamed from: a */
    private final C83959a f284621a;

    /* renamed from: b */
    private final Drawable f284622b;

    public C102009d(C83959a aVar, Drawable drawable) {
        this.f284621a = aVar;
        this.f284622b = drawable;
    }

    /* renamed from: a */
    public final Drawable mo92774a() {
        return this.f284622b;
    }

    /* renamed from: b */
    public final C83959a mo92775b() {
        return this.f284621a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102016k) {
            C102016k kVar = (C102016k) obj;
            C83959a aVar = this.f284621a;
            if (aVar != null ? aVar.equals(kVar.mo92775b()) : kVar.mo92775b() == null) {
                Drawable drawable = this.f284622b;
                if (drawable != null ? drawable.equals(kVar.mo92774a()) : kVar.mo92774a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f284621a);
        String valueOf2 = String.valueOf(this.f284622b);
        return "HotwordScreenAnimationData{animSequence=" + valueOf + ", imageDrawable=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        C83959a aVar = this.f284621a;
        int i2 = 0;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        Drawable drawable = this.f284622b;
        if (drawable != null) {
            i2 = drawable.hashCode();
        }
        return i3 ^ i2;
    }
}
