package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Range;
import android.util.Size;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.h.d.m */
/* compiled from: PG */
final class C26761m extends C26741aj {

    /* renamed from: a */
    private final boolean f72935a;

    /* renamed from: b */
    private final float f72936b;

    /* renamed from: c */
    private final C58833ax f72937c;

    /* renamed from: d */
    private final C58833ax f72938d;

    /* renamed from: e */
    private final boolean f72939e;

    /* renamed from: f */
    private final Range f72940f;

    /* renamed from: g */
    private final Size f72941g;

    public C26761m(boolean z, float f, C58833ax axVar, C58833ax axVar2, boolean z2, Range range, Size size) {
        this.f72935a = z;
        this.f72936b = f;
        this.f72937c = axVar;
        this.f72938d = axVar2;
        this.f72939e = z2;
        this.f72940f = range;
        this.f72941g = size;
    }

    /* renamed from: a */
    public final float mo32069a() {
        return this.f72936b;
    }

    /* renamed from: b */
    public final Range mo32070b() {
        return this.f72940f;
    }

    /* renamed from: c */
    public final Size mo32071c() {
        return this.f72941g;
    }

    /* renamed from: d */
    public final C58833ax mo32072d() {
        return this.f72938d;
    }

    /* renamed from: e */
    public final C58833ax mo32073e() {
        return this.f72937c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26741aj) {
            C26741aj ajVar = (C26741aj) obj;
            return this.f72935a == ajVar.mo32074f() && Float.floatToIntBits(this.f72936b) == Float.floatToIntBits(ajVar.mo32069a()) && this.f72937c.equals(ajVar.mo32073e()) && this.f72938d.equals(ajVar.mo32072d()) && this.f72939e == ajVar.mo32075g() && this.f72940f.equals(ajVar.mo32070b()) && this.f72941g.equals(ajVar.mo32071c());
        }
    }

    /* renamed from: f */
    public final boolean mo32074f() {
        return this.f72935a;
    }

    /* renamed from: g */
    public final boolean mo32075g() {
        return this.f72939e;
    }

    public final int hashCode() {
        int i = 1237;
        int floatToIntBits = ((((((((true != this.f72935a ? 1237 : 1231) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f72936b)) * 1000003) ^ this.f72937c.hashCode()) * 1000003) ^ this.f72938d.hashCode()) * 1000003;
        if (true == this.f72939e) {
            i = 1231;
        }
        return ((((floatToIntBits ^ i) * 1000003) ^ this.f72940f.hashCode()) * 1000003) ^ this.f72941g.hashCode();
    }

    public final String toString() {
        boolean z = this.f72935a;
        float f = this.f72936b;
        String valueOf = String.valueOf(this.f72937c);
        String valueOf2 = String.valueOf(this.f72938d);
        boolean z2 = this.f72939e;
        String obj = this.f72940f.toString();
        String obj2 = this.f72941g.toString();
        return "LensCaptureParams{flashOn=" + z + ", zoom=" + f + ", focusRegion=" + valueOf + ", focusArea=" + valueOf2 + ", syncFocusAndExposureRegion=" + z2 + ", fpsDesiredRange=" + obj + ", previewSize=" + obj2 + "}";
    }
}
