package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Size;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.h.d.i */
/* compiled from: PG */
final class C26757i extends C26763o {

    /* renamed from: a */
    private final Size f72903a;

    /* renamed from: b */
    private final boolean f72904b;

    /* renamed from: c */
    private final float f72905c;

    /* renamed from: d */
    private final int f72906d;

    /* renamed from: e */
    private final C58485gu f72907e;

    /* renamed from: f */
    private final C26747ap f72908f;

    public C26757i(Size size, boolean z, float f, int i, C58485gu guVar, C26747ap apVar) {
        this.f72903a = size;
        this.f72904b = z;
        this.f72905c = f;
        this.f72906d = i;
        this.f72907e = guVar;
        this.f72908f = apVar;
    }

    /* renamed from: a */
    public final float mo32096a() {
        return this.f72905c;
    }

    /* renamed from: b */
    public final int mo32097b() {
        return this.f72906d;
    }

    /* renamed from: c */
    public final Size mo32098c() {
        return this.f72903a;
    }

    /* renamed from: d */
    public final C58485gu mo32099d() {
        return this.f72907e;
    }

    /* renamed from: e */
    public final boolean mo32100e() {
        return this.f72904b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26763o) {
            C26763o oVar = (C26763o) obj;
            return this.f72903a.equals(oVar.mo32098c()) && this.f72904b == oVar.mo32100e() && Float.floatToIntBits(this.f72905c) == Float.floatToIntBits(oVar.mo32096a()) && this.f72906d == oVar.mo32097b() && C58597ky.m90218i(this.f72907e, oVar.mo32099d()) && this.f72908f.equals(oVar.mo32102f());
        }
    }

    /* renamed from: f */
    public final C26747ap mo32102f() {
        return this.f72908f;
    }

    public final int hashCode() {
        return ((((((((((this.f72903a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f72904b ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f72905c)) * 1000003) ^ this.f72906d) * 1000003) ^ this.f72907e.hashCode()) * 1000003) ^ this.f72908f.hashCode();
    }

    public final String toString() {
        String obj = this.f72903a.toString();
        boolean z = this.f72904b;
        float f = this.f72905c;
        int i = this.f72906d;
        String obj2 = this.f72907e.toString();
        String obj3 = this.f72908f.toString();
        return "CameraConfiguration{cameraOutputSize=" + obj + ", facingFront=" + z + ", maxZoom=" + f + ", orientation=" + i + ", supportedSizes=" + obj2 + ", cameraOutputTexture=" + obj3 + "}";
    }
}
