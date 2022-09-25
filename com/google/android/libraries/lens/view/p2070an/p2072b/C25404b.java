package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.an.b.b */
/* compiled from: PG */
final class C25404b extends C25411i {

    /* renamed from: a */
    private final Bitmap f69235a;

    /* renamed from: b */
    private final Rect f69236b;

    /* renamed from: c */
    private final int f69237c;

    /* renamed from: d */
    private final C58833ax f69238d;

    /* renamed from: e */
    private final C58833ax f69239e;

    /* renamed from: f */
    private final C58833ax f69240f;

    public C25404b(Bitmap bitmap, Rect rect, int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f69235a = bitmap;
        this.f69236b = rect;
        this.f69237c = i;
        this.f69238d = axVar;
        this.f69239e = axVar2;
        this.f69240f = axVar3;
    }

    /* renamed from: a */
    public final int mo30448a() {
        return this.f69237c;
    }

    /* renamed from: b */
    public final Bitmap mo30449b() {
        return this.f69235a;
    }

    /* renamed from: c */
    public final Rect mo30450c() {
        return this.f69236b;
    }

    /* renamed from: d */
    public final C58833ax mo30451d() {
        return this.f69239e;
    }

    /* renamed from: e */
    public final C58833ax mo30452e() {
        return this.f69240f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25411i) {
            C25411i iVar = (C25411i) obj;
            return this.f69235a.equals(iVar.mo30449b()) && this.f69236b.equals(iVar.mo30450c()) && this.f69237c == iVar.mo30448a() && this.f69238d.equals(iVar.mo30454f()) && this.f69239e.equals(iVar.mo30451d()) && this.f69240f.equals(iVar.mo30452e());
        }
    }

    /* renamed from: f */
    public final C58833ax mo30454f() {
        return this.f69238d;
    }

    public final int hashCode() {
        return ((((((((((this.f69235a.hashCode() ^ 1000003) * 1000003) ^ this.f69236b.hashCode()) * 1000003) ^ this.f69237c) * 1000003) ^ this.f69238d.hashCode()) * 1000003) ^ this.f69239e.hashCode()) * 1000003) ^ this.f69240f.hashCode();
    }

    public final String toString() {
        String obj = this.f69235a.toString();
        String obj2 = this.f69236b.toString();
        int i = this.f69237c;
        String valueOf = String.valueOf(this.f69238d);
        String valueOf2 = String.valueOf(this.f69239e);
        String valueOf3 = String.valueOf(this.f69240f);
        return "ServerImage{bitmap=" + obj + ", croppedRect=" + obj2 + ", quality=" + i + ", fifeUrl=" + valueOf + ", compressedBitmapBytes=" + valueOf2 + ", embeddingInfo=" + valueOf3 + "}";
    }
}
