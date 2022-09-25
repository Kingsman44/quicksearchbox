package com.google.android.libraries.lens.view.session;

import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;

/* renamed from: com.google.android.libraries.lens.view.session.j */
/* compiled from: PG */
final class C27790j extends C27776bl {

    /* renamed from: a */
    private final C58485gu f75822a;

    /* renamed from: b */
    private final C56226ag f75823b;

    /* renamed from: c */
    private final C24231w f75824c;

    /* renamed from: d */
    private final boolean f75825d;

    public C27790j(C58485gu guVar, C56226ag agVar, C24231w wVar, boolean z) {
        this.f75822a = guVar;
        this.f75823b = agVar;
        this.f75824c = wVar;
        this.f75825d = z;
    }

    /* renamed from: a */
    public final C58485gu mo33286a() {
        return this.f75822a;
    }

    /* renamed from: b */
    public final C56226ag mo33287b() {
        return this.f75823b;
    }

    /* renamed from: c */
    public final C24231w mo33256c() {
        return this.f75824c;
    }

    /* renamed from: d */
    public final boolean mo33257d() {
        return this.f75825d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27776bl) {
            C27776bl blVar = (C27776bl) obj;
            return C58597ky.m90218i(this.f75822a, blVar.mo33286a()) && this.f75823b.equals(blVar.mo33287b()) && this.f75824c.equals(blVar.mo33256c()) && this.f75825d == blVar.mo33257d();
        }
    }

    public final int hashCode() {
        return ((((((this.f75822a.hashCode() ^ 1000003) * 1000003) ^ this.f75823b.hashCode()) * 1000003) ^ this.f75824c.hashCode()) * 1000003) ^ (true != this.f75825d ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f75822a.toString();
        String obj2 = this.f75823b.toString();
        String obj3 = this.f75824c.toString();
        boolean z = this.f75825d;
        return "WordSelection{words=" + obj + ", clientTextSelection=" + obj2 + ", interactionOrigin=" + obj3 + ", isFrozenImageSelection=" + z + "}";
    }
}
