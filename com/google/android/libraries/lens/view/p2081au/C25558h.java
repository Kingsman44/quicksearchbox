package com.google.android.libraries.lens.view.p2081au;

import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.au.h */
/* compiled from: PG */
public final class C25558h extends C25574x {

    /* renamed from: a */
    public final C27777bm f69578a;

    /* renamed from: b */
    public final C58833ax f69579b;

    /* renamed from: c */
    private final C58833ax f69580c;

    /* renamed from: d */
    private final boolean f69581d;

    /* renamed from: e */
    private final C58833ax f69582e;

    /* renamed from: f */
    private final C58833ax f69583f;

    public C25558h(C27777bm bmVar, C58833ax axVar, boolean z, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        if (bmVar != null) {
            this.f69578a = bmVar;
            this.f69580c = axVar;
            this.f69581d = z;
            this.f69582e = axVar2;
            this.f69579b = axVar3;
            this.f69583f = axVar4;
            return;
        }
        throw new NullPointerException("Null userSelection");
    }

    /* renamed from: a */
    public final C27777bm mo30644a() {
        return this.f69578a;
    }

    /* renamed from: b */
    public final C58833ax mo30645b() {
        return this.f69582e;
    }

    /* renamed from: c */
    public final C58833ax mo30646c() {
        return this.f69583f;
    }

    /* renamed from: d */
    public final C58833ax mo30647d() {
        return this.f69580c;
    }

    /* renamed from: e */
    public final C58833ax mo30648e() {
        return this.f69579b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25574x) {
            C25574x xVar = (C25574x) obj;
            return this.f69578a.equals(xVar.mo30644a()) && this.f69580c.equals(xVar.mo30647d()) && this.f69581d == xVar.mo30650f() && this.f69582e.equals(xVar.mo30645b()) && this.f69579b.equals(xVar.mo30648e()) && this.f69583f.equals(xVar.mo30646c());
        }
    }

    /* renamed from: f */
    public final boolean mo30650f() {
        return this.f69581d;
    }

    public final int hashCode() {
        return ((((((((((this.f69578a.hashCode() ^ 1000003) * 1000003) ^ this.f69580c.hashCode()) * 1000003) ^ (true != this.f69581d ? 1237 : 1231)) * 1000003) ^ this.f69582e.hashCode()) * 1000003) ^ this.f69579b.hashCode()) * 1000003) ^ this.f69583f.hashCode();
    }

    public final String toString() {
        String obj = this.f69578a.toString();
        String obj2 = this.f69580c.toString();
        boolean z = this.f69581d;
        String obj3 = this.f69582e.toString();
        String obj4 = this.f69579b.toString();
        String obj5 = this.f69583f.toString();
        return "EyesInteraction{userSelection=" + obj + ", queryRequestMetadata=" + obj2 + ", hideTranslations=" + z + ", gleamingViewSize=" + obj3 + ", resultParentVed=" + obj4 + ", multimodalQuerySourceForLogging=" + obj5 + "}";
    }
}
