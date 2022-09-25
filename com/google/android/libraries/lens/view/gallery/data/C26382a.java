package com.google.android.libraries.lens.view.gallery.data;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.a */
/* compiled from: PG */
final class C26382a extends C26406y {

    /* renamed from: a */
    public final int f71783a;

    /* renamed from: b */
    public final C58495hd f71784b;

    /* renamed from: e */
    private final C26405x f71785e;

    /* renamed from: f */
    private final C58485gu f71786f;

    public C26382a(C26405x xVar, int i, C58495hd hdVar, C58485gu guVar) {
        if (xVar != null) {
            this.f71785e = xVar;
            this.f71783a = i;
            this.f71784b = hdVar;
            if (guVar != null) {
                this.f71786f = guVar;
                return;
            }
            throw new NullPointerException("Null photosWithoutScreenshots");
        }
        throw new NullPointerException("Null state");
    }

    /* renamed from: a */
    public final int mo31578a() {
        return this.f71783a;
    }

    /* renamed from: b */
    public final C26405x mo31579b() {
        return this.f71785e;
    }

    /* renamed from: c */
    public final C58485gu mo31580c() {
        return this.f71786f;
    }

    /* renamed from: d */
    public final C58495hd mo31581d() {
        return this.f71784b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26406y) {
            C26406y yVar = (C26406y) obj;
            return this.f71785e.equals(yVar.mo31579b()) && this.f71783a == yVar.mo31578a() && C58662ni.m90356o(this.f71784b, yVar.mo31581d()) && C58597ky.m90218i(this.f71786f, yVar.mo31580c());
        }
    }

    public final int hashCode() {
        return ((((((this.f71785e.hashCode() ^ 1000003) * 1000003) ^ this.f71783a) * 1000003) ^ C58758qx.m90643a(this.f71784b.entrySet())) * 1000003) ^ this.f71786f.hashCode();
    }

    public final String toString() {
        String obj = this.f71785e.toString();
        int i = this.f71783a;
        String i2 = C58662ni.m90350i(this.f71784b);
        String obj2 = this.f71786f.toString();
        return "PhotoLibrary{state=" + obj + ", allPhotosCount=" + i + ", photosInFolderMap=" + i2 + ", photosWithoutScreenshots=" + obj2 + "}";
    }
}
