package com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c;

import com.google.android.libraries.search.rendering.xuikit.bubbles.C40101b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import com.google.p4283bv.p4287b.p4342b.C56943g;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.c.c */
/* compiled from: PG */
final class C40110c extends C40113f {

    /* renamed from: a */
    public final C40111d f105357a;

    /* renamed from: b */
    public final C56943g f105358b;

    /* renamed from: c */
    public final C58495hd f105359c;

    /* renamed from: d */
    public final int f105360d;

    /* renamed from: e */
    public final int f105361e;

    /* renamed from: f */
    public final C40101b f105362f;

    public C40110c(C40111d dVar, C56943g gVar, C58495hd hdVar, int i, int i2, C40101b bVar) {
        this.f105357a = dVar;
        this.f105358b = gVar;
        this.f105359c = hdVar;
        this.f105360d = i;
        this.f105361e = i2;
        this.f105362f = bVar;
    }

    /* renamed from: a */
    public final int mo42192a() {
        return this.f105360d;
    }

    /* renamed from: b */
    public final int mo42193b() {
        return this.f105361e;
    }

    /* renamed from: c */
    public final C40101b mo42194c() {
        return this.f105362f;
    }

    /* renamed from: d */
    public final C40111d mo42195d() {
        return this.f105357a;
    }

    /* renamed from: e */
    public final C40112e mo42196e() {
        return new C40109b(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40113f) {
            C40113f fVar = (C40113f) obj;
            return this.f105357a.equals(fVar.mo42195d()) && this.f105358b.equals(fVar.mo42199g()) && this.f105359c.equals(fVar.mo42198f()) && this.f105360d == fVar.mo42192a() && this.f105361e == fVar.mo42193b() && this.f105362f.equals(fVar.mo42194c());
        }
    }

    /* renamed from: f */
    public final C58495hd mo42198f() {
        return this.f105359c;
    }

    /* renamed from: g */
    public final C56943g mo42199g() {
        return this.f105358b;
    }

    public final int hashCode() {
        return ((((((((((this.f105357a.hashCode() ^ 1000003) * 1000003) ^ this.f105358b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f105359c.entrySet())) * 1000003) ^ this.f105360d) * 1000003) ^ this.f105361e) * 1000003) ^ this.f105362f.hashCode();
    }

    public final String toString() {
        String obj = this.f105357a.toString();
        String obj2 = this.f105358b.toString();
        String obj3 = this.f105359c.toString();
        int i = this.f105360d;
        int i2 = this.f105361e;
        String obj4 = this.f105362f.toString();
        return "BubbleStartupData{bubbleId=" + obj + ", bubbleXBlendAddress=" + obj2 + ", queryParameters=" + obj3 + ", layoutDirection=" + i + ", triggerSourceVeId=" + i2 + ", bubbleContainerConfig=" + obj4 + "}";
    }
}
