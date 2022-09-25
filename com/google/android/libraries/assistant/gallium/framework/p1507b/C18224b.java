package com.google.android.libraries.assistant.gallium.framework.p1507b;

import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.assistant.gallium.framework.C18240h;
import com.google.android.libraries.assistant.gallium.framework.C18307j;
import com.google.android.libraries.assistant.gallium.framework.C18308k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.b.b */
/* compiled from: PG */
final class C18224b extends C18228f {

    /* renamed from: a */
    private final C18207ak f51773a;

    /* renamed from: b */
    private final C18308k f51774b;

    /* renamed from: c */
    private final C18240h f51775c;

    /* renamed from: d */
    private final C18225c f51776d;

    /* renamed from: e */
    private final C18307j f51777e;

    /* renamed from: f */
    private final Executor f51778f;

    /* renamed from: g */
    private final boolean f51779g;

    /* renamed from: h */
    private final boolean f51780h;

    /* renamed from: i */
    private final C58485gu f51781i;

    /* renamed from: j */
    private final String f51782j;

    /* renamed from: k */
    private final Optional f51783k;

    public C18224b(C18207ak akVar, C18308k kVar, C18240h hVar, C18225c cVar, C18307j jVar, Executor executor, boolean z, boolean z2, C58485gu guVar, String str, Optional optional) {
        this.f51773a = akVar;
        this.f51774b = kVar;
        this.f51775c = hVar;
        this.f51776d = cVar;
        this.f51777e = jVar;
        this.f51778f = executor;
        this.f51779g = z;
        this.f51780h = z2;
        this.f51781i = guVar;
        this.f51782j = str;
        if (optional != null) {
            this.f51783k = optional;
            return;
        }
        throw new NullPointerException("Null agsaClientStreamz");
    }

    /* renamed from: a */
    public final C18240h mo23714a() {
        return this.f51775c;
    }

    /* renamed from: b */
    public final C18307j mo23715b() {
        return this.f51777e;
    }

    /* renamed from: c */
    public final C18308k mo23716c() {
        return this.f51774b;
    }

    /* renamed from: d */
    public final C18207ak mo23717d() {
        return this.f51773a;
    }

    /* renamed from: e */
    public final C18225c mo23718e() {
        return this.f51776d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18228f) {
            C18228f fVar = (C18228f) obj;
            return this.f51773a.equals(fVar.mo23717d()) && this.f51774b.equals(fVar.mo23716c()) && this.f51775c.equals(fVar.mo23714a()) && this.f51776d.equals(fVar.mo23718e()) && this.f51777e.equals(fVar.mo23715b()) && this.f51778f.equals(fVar.mo23724i()) && this.f51779g == fVar.mo23726k() && this.f51780h == fVar.mo23725j() && C58597ky.m90218i(this.f51781i, fVar.mo23720f()) && this.f51782j.equals(fVar.mo23722h()) && this.f51783k.equals(fVar.mo23721g());
        }
    }

    /* renamed from: f */
    public final C58485gu mo23720f() {
        return this.f51781i;
    }

    /* renamed from: g */
    public final Optional mo23721g() {
        return this.f51783k;
    }

    /* renamed from: h */
    public final String mo23722h() {
        return this.f51782j;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.f51773a.hashCode() ^ 1000003) * 1000003) ^ this.f51774b.hashCode()) * 1000003) ^ this.f51775c.hashCode()) * 1000003) ^ this.f51776d.hashCode()) * 1000003) ^ this.f51777e.hashCode()) * 1000003) ^ this.f51778f.hashCode()) * 1000003) ^ (true != this.f51779g ? 1237 : 1231)) * 1000003;
        if (true == this.f51780h) {
            i = 1231;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f51781i.hashCode()) * 1000003) ^ this.f51782j.hashCode()) * 1000003) ^ this.f51783k.hashCode();
    }

    /* renamed from: i */
    public final Executor mo23724i() {
        return this.f51778f;
    }

    /* renamed from: j */
    public final boolean mo23725j() {
        return this.f51780h;
    }

    /* renamed from: k */
    public final boolean mo23726k() {
        return this.f51779g;
    }

    public final String toString() {
        String obj = this.f51773a.toString();
        String obj2 = this.f51774b.toString();
        String obj3 = this.f51775c.toString();
        String obj4 = this.f51776d.toString();
        String obj5 = this.f51777e.toString();
        String obj6 = this.f51778f.toString();
        boolean z = this.f51779g;
        boolean z2 = this.f51780h;
        String obj7 = this.f51781i.toString();
        String str = this.f51782j;
        String obj8 = this.f51783k.toString();
        return "DeploymentConfig{interfaceRegistry=" + obj + ", cppTracerProvider=" + obj2 + ", cppInterfaceRegistryProvider=" + obj3 + ", cppDeploymentConfigProvider=" + obj4 + ", cppResourceLoader=" + obj5 + ", executor=" + obj6 + ", enableLifetimeControl=" + z + ", enableBoundedNativeThreadPool=" + z2 + ", requestProcessors=" + obj7 + ", appVersionName=" + str + ", agsaClientStreamz=" + obj8 + "}";
    }
}
