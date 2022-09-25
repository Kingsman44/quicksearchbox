package com.google.android.libraries.lens.view.gleam.region;

import android.graphics.RectF;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.c */
/* compiled from: PG */
final class C26612c extends C26614e {

    /* renamed from: b */
    private final RectF f72574b;

    /* renamed from: c */
    private final boolean f72575c;

    /* renamed from: d */
    private final C58833ax f72576d;

    /* renamed from: e */
    private final boolean f72577e;

    /* renamed from: f */
    private final int f72578f;

    public C26612c(RectF rectF, int i, boolean z, C58833ax axVar, boolean z2) {
        this.f72574b = rectF;
        this.f72578f = i;
        this.f72575c = z;
        this.f72576d = axVar;
        this.f72577e = z2;
    }

    /* renamed from: a */
    public final RectF mo31895a() {
        return this.f72574b;
    }

    /* renamed from: b */
    public final C58833ax mo31896b() {
        return this.f72576d;
    }

    /* renamed from: c */
    public final boolean mo31897c() {
        return this.f72577e;
    }

    /* renamed from: d */
    public final boolean mo31898d() {
        return this.f72575c;
    }

    /* renamed from: e */
    public final int mo31899e() {
        return this.f72578f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26614e) {
            C26614e eVar = (C26614e) obj;
            if (this.f72574b.equals(eVar.mo31895a())) {
                int i = this.f72578f;
                int e = eVar.mo31899e();
                if (i != 0) {
                    return e == 1 && this.f72575c == eVar.mo31898d() && this.f72576d.equals(eVar.mo31896b()) && this.f72577e == eVar.mo31897c();
                }
                throw null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.f72574b.hashCode() ^ 1000003) * 1000003;
        if (this.f72578f != 0) {
            int i = 1237;
            int hashCode2 = (((((hashCode ^ 1) * 1000003) ^ (true != this.f72575c ? 1237 : 1231)) * 1000003) ^ this.f72576d.hashCode()) * 1000003;
            if (true == this.f72577e) {
                i = 1231;
            }
            return hashCode2 ^ i;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f72574b);
        String str = this.f72578f != 1 ? "null" : "NORMALIZED_IN_VIEW_SPACE";
        boolean z = this.f72575c;
        String valueOf2 = String.valueOf(this.f72576d);
        boolean z2 = this.f72577e;
        return "Region{rect=" + valueOf + ", type=" + str + ", withAnimation=" + z + ", animationStartPoint=" + valueOf2 + ", isAutoSelectedRegion=" + z2 + "}";
    }
}
