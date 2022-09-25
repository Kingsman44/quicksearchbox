package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.graphics.Bitmap;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.aj */
/* compiled from: PG */
final class C80654aj extends C80671b {

    /* renamed from: b */
    private final Bitmap f221409b;

    /* renamed from: c */
    private final C58485gu f221410c;

    /* renamed from: d */
    private final Boolean f221411d;

    /* renamed from: e */
    private final C58485gu f221412e;

    public C80654aj(Bitmap bitmap, C58485gu guVar, Boolean bool, C58485gu guVar2) {
        this.f221409b = bitmap;
        this.f221410c = guVar;
        this.f221411d = bool;
        this.f221412e = guVar2;
    }

    /* renamed from: a */
    public final Bitmap mo74413a() {
        return this.f221409b;
    }

    /* renamed from: c */
    public final C58485gu mo74414c() {
        return this.f221412e;
    }

    /* renamed from: d */
    public final C58485gu mo74415d() {
        return this.f221410c;
    }

    /* renamed from: e */
    public final Boolean mo74416e() {
        return this.f221411d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80671b) {
            C80671b bVar = (C80671b) obj;
            return this.f221409b.equals(bVar.mo74413a()) && C58597ky.m90218i(this.f221410c, bVar.mo74415d()) && this.f221411d.equals(bVar.mo74416e()) && C58597ky.m90218i(this.f221412e, bVar.mo74414c());
        }
    }

    public final int hashCode() {
        return ((((((this.f221409b.hashCode() ^ 1000003) * 1000003) ^ this.f221410c.hashCode()) * 1000003) ^ this.f221411d.hashCode()) * 1000003) ^ this.f221412e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f221409b);
        String valueOf2 = String.valueOf(this.f221410c);
        Boolean bool = this.f221411d;
        String valueOf3 = String.valueOf(this.f221412e);
        return "AmbientVisualSearchGleams{bitmap=" + valueOf + ", boundingBoxes=" + valueOf2 + ", shouldShowGleamTapPreview=" + bool + ", appFlowEvents=" + valueOf3 + "}";
    }
}
