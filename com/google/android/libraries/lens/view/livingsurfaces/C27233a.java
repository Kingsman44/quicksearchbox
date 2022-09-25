package com.google.android.libraries.lens.view.livingsurfaces;

import android.content.Context;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.a */
/* compiled from: PG */
public final class C27233a extends C27268v {

    /* renamed from: a */
    public final Context f74494a;

    /* renamed from: b */
    public final String f74495b;

    /* renamed from: c */
    public final String f74496c;

    /* renamed from: d */
    public final C58833ax f74497d;

    /* renamed from: e */
    public final float f74498e;

    /* renamed from: f */
    public final boolean f74499f;

    /* renamed from: g */
    public final C27262u f74500g;

    /* renamed from: h */
    private final float f74501h;

    public C27233a(Context context, String str, String str2, C58833ax axVar, float f, float f2, boolean z, C27262u uVar) {
        this.f74494a = context;
        this.f74495b = str;
        this.f74496c = str2;
        this.f74497d = axVar;
        this.f74501h = f;
        this.f74498e = f2;
        this.f74499f = z;
        this.f74500g = uVar;
    }

    /* renamed from: a */
    public final float mo32730a() {
        return this.f74501h;
    }

    /* renamed from: b */
    public final float mo32731b() {
        return this.f74498e;
    }

    /* renamed from: c */
    public final int mo32732c() {
        return 0;
    }

    /* renamed from: d */
    public final Context mo32733d() {
        return this.f74494a;
    }

    /* renamed from: e */
    public final C27262u mo32734e() {
        return this.f74500g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27268v) {
            C27268v vVar = (C27268v) obj;
            return this.f74494a.equals(vVar.mo32733d()) && this.f74495b.equals(vVar.mo32737g()) && this.f74496c.equals(vVar.mo32738h()) && this.f74497d.equals(vVar.mo32736f()) && Float.floatToIntBits(this.f74501h) == Float.floatToIntBits(vVar.mo32730a()) && Float.floatToIntBits(this.f74498e) == Float.floatToIntBits(vVar.mo32731b()) && this.f74499f == vVar.mo32740i() && vVar.mo32732c() == 0 && this.f74500g.equals(vVar.mo32734e());
        }
    }

    /* renamed from: f */
    public final C58833ax mo32736f() {
        return this.f74497d;
    }

    /* renamed from: g */
    public final String mo32737g() {
        return this.f74495b;
    }

    /* renamed from: h */
    public final String mo32738h() {
        return this.f74496c;
    }

    public final int hashCode() {
        return ((((((((((((((this.f74494a.hashCode() ^ 1000003) * 1000003) ^ this.f74495b.hashCode()) * 1000003) ^ this.f74496c.hashCode()) * 1000003) ^ this.f74497d.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f74501h)) * 1000003) ^ Float.floatToIntBits(this.f74498e)) * 1000003) ^ (true != this.f74499f ? 1237 : 1231)) * -721379959) ^ this.f74500g.hashCode();
    }

    /* renamed from: i */
    public final boolean mo32740i() {
        return this.f74499f;
    }

    public final String toString() {
        String obj = this.f74494a.toString();
        String str = this.f74495b;
        String str2 = this.f74496c;
        String obj2 = this.f74497d.toString();
        float f = this.f74501h;
        float f2 = this.f74498e;
        boolean z = this.f74499f;
        String obj3 = this.f74500g.toString();
        return "LivingSurfacePlayerOptions{context=" + obj + ", sourceUrl=" + str + ", videoUrl=" + str2 + ", youtubeId=" + obj2 + ", aspectRatio=" + f + ", quadAspectRatio=" + f2 + ", hasAudio=" + z + ", loadingViewStartDelayMs=0, listener=" + obj3 + "}";
    }
}
