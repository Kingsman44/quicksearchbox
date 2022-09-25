package com.google.android.libraries.home.coreui.devicetile;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bd */
/* compiled from: PG */
public final class C23685bd {

    /* renamed from: a */
    public static final SparseArray f64788a = new SparseArray();

    /* renamed from: b */
    public final Drawable f64789b;

    /* renamed from: c */
    public final int f64790c;

    /* renamed from: d */
    public final C23763y f64791d;

    public C23685bd(Drawable drawable, int i, C23763y yVar) {
        C69664n.m101061g(drawable, "icon");
        C69664n.m101061g(yVar, "colorSet");
        this.f64789b = drawable;
        this.f64790c = i;
        this.f64791d = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23685bd)) {
            return false;
        }
        C23685bd bdVar = (C23685bd) obj;
        return C69664n.m101066l(this.f64789b, bdVar.f64789b) && this.f64790c == bdVar.f64790c && C69664n.m101066l(this.f64791d, bdVar.f64791d);
    }

    public final int hashCode() {
        return (((this.f64789b.hashCode() * 31) + this.f64790c) * 31) + this.f64791d.hashCode();
    }

    public final String toString() {
        Drawable drawable = this.f64789b;
        int i = this.f64790c;
        C23763y yVar = this.f64791d;
        return "RenderInfo(icon=" + drawable + ", iconResId=" + i + ", colorSet=" + yVar + ")";
    }
}
