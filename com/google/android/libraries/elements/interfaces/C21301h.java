package com.google.android.libraries.elements.interfaces;

import com.facebook.litho.widget.C6427am;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c.C40338b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c.C40340d;

/* renamed from: com.google.android.libraries.elements.interfaces.h */
/* compiled from: PG */
public final class C21301h extends C21274bq {

    /* renamed from: a */
    private final int f59671a;

    /* renamed from: b */
    private final float f59672b;

    /* renamed from: c */
    private final float f59673c;

    public C21301h(int i, float f, float f2) {
        this.f59671a = i;
        this.f59672b = f;
        this.f59673c = f2;
    }

    /* renamed from: a */
    public final float mo26761a() {
        return this.f59673c;
    }

    /* renamed from: b */
    public final float mo26762b() {
        return this.f59672b;
    }

    /* renamed from: c */
    public final int mo26763c() {
        return this.f59671a;
    }

    /* renamed from: d */
    public final C6427am mo26764d() {
        return null;
    }

    /* renamed from: e */
    public final boolean mo26765e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21274bq) {
            C21274bq bqVar = (C21274bq) obj;
            return this.f59671a == bqVar.mo26763c() && Float.floatToIntBits(this.f59672b) == Float.floatToIntBits(bqVar.mo26762b()) && Float.floatToIntBits(this.f59673c) == Float.floatToIntBits(bqVar.mo26761a()) && !bqVar.mo26766f() && bqVar.mo26768h() == null && bqVar.mo26769i() == null && bqVar.mo26764d() == null && !bqVar.mo26767g() && !bqVar.mo26765e();
        }
    }

    /* renamed from: f */
    public final boolean mo26766f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo26767g() {
        return false;
    }

    /* renamed from: h */
    public final C40338b mo26768h() {
        return null;
    }

    public final int hashCode() {
        return ((((((((((this.f59671a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f59672b)) * 1000003) ^ Float.floatToIntBits(this.f59673c)) * 1000003) ^ 1237) * 1525764945) ^ 1237) * 1000003) ^ 1237;
    }

    /* renamed from: i */
    public final C40340d mo26769i() {
        return null;
    }

    public final String toString() {
        int i = this.f59671a;
        float f = this.f59672b;
        float f2 = this.f59673c;
        return "RecyclerConfig{initRangeSize=" + i + ", collectionRangeRatio=" + f + ", binderRangeRatio=" + f2 + ", recyclerViewItemPrefetch=false, layoutHandlerFactory=null, changeSetExecutor=null, layoutInfo=null, useLegacyVisible=false, cleanupOnDetach=false}";
    }
}
