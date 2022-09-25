package com.google.android.libraries.lens.view.main;

import android.graphics.Bitmap;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.main.b */
/* compiled from: PG */
final class C27310b extends C27423fd {

    /* renamed from: a */
    public final Bitmap f74722a;

    /* renamed from: b */
    public final C58833ax f74723b;

    public C27310b(Bitmap bitmap, C58833ax axVar) {
        if (bitmap != null) {
            this.f74722a = bitmap;
            this.f74723b = axVar;
            return;
        }
        throw new NullPointerException("Null image");
    }

    /* renamed from: a */
    public final Bitmap mo32854a() {
        return this.f74722a;
    }

    /* renamed from: b */
    public final C58833ax mo32855b() {
        return this.f74723b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27423fd) {
            C27423fd fdVar = (C27423fd) obj;
            return this.f74722a.equals(fdVar.mo32854a()) && this.f74723b.equals(fdVar.mo32855b());
        }
    }

    public final int hashCode() {
        return ((this.f74722a.hashCode() ^ 1000003) * 1000003) ^ this.f74723b.hashCode();
    }

    public final String toString() {
        String obj = this.f74722a.toString();
        String obj2 = this.f74723b.toString();
        return "RenderedResultImage{image=" + obj + ", normalizedCropRegion=" + obj2 + "}";
    }
}
