package com.google.android.libraries.appactions.serviceengine.api;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.serviceengine.api.e */
/* compiled from: PG */
final class C147872e extends C147881n {

    /* renamed from: a */
    private final Optional f398915a;

    /* renamed from: b */
    private final Optional f398916b;

    /* renamed from: c */
    private final Optional f398917c;

    /* renamed from: d */
    private final Optional f398918d;

    /* renamed from: e */
    private final Optional f398919e;

    /* renamed from: f */
    private final Optional f398920f;

    /* renamed from: g */
    private final Optional f398921g;

    /* renamed from: h */
    private final C58495hd f398922h;

    /* renamed from: i */
    private final Optional f398923i;

    /* renamed from: j */
    private final C58495hd f398924j;

    public C147872e(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, C58495hd hdVar, Optional optional8, C58495hd hdVar2) {
        this.f398915a = optional;
        this.f398916b = optional2;
        this.f398917c = optional3;
        this.f398918d = optional4;
        this.f398919e = optional5;
        this.f398920f = optional6;
        this.f398921g = optional7;
        this.f398922h = hdVar;
        this.f398923i = optional8;
        this.f398924j = hdVar2;
    }

    /* renamed from: a */
    public final C58495hd mo124546a() {
        return this.f398924j;
    }

    /* renamed from: b */
    public final C58495hd mo124547b() {
        return this.f398922h;
    }

    /* renamed from: c */
    public final Optional mo124548c() {
        return this.f398918d;
    }

    /* renamed from: d */
    public final Optional mo124549d() {
        return this.f398923i;
    }

    /* renamed from: e */
    public final Optional mo124550e() {
        return this.f398916b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147881n) {
            C147881n nVar = (C147881n) obj;
            return this.f398915a.equals(nVar.mo124552f()) && this.f398916b.equals(nVar.mo124550e()) && this.f398917c.equals(nVar.mo124557j()) && this.f398918d.equals(nVar.mo124548c()) && this.f398919e.equals(nVar.mo124553g()) && this.f398920f.equals(nVar.mo124556i()) && this.f398921g.equals(nVar.mo124554h()) && C58662ni.m90356o(this.f398922h, nVar.mo124547b()) && this.f398923i.equals(nVar.mo124549d()) && C58662ni.m90356o(this.f398924j, nVar.mo124546a());
        }
    }

    /* renamed from: f */
    public final Optional mo124552f() {
        return this.f398915a;
    }

    /* renamed from: g */
    public final Optional mo124553g() {
        return this.f398919e;
    }

    /* renamed from: h */
    public final Optional mo124554h() {
        return this.f398921g;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f398915a.hashCode() ^ 1000003) * 1000003) ^ this.f398916b.hashCode()) * 1000003) ^ this.f398917c.hashCode()) * 1000003) ^ this.f398918d.hashCode()) * 1000003) ^ this.f398919e.hashCode()) * 1000003) ^ this.f398920f.hashCode()) * 1000003) ^ this.f398921g.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f398922h.entrySet())) * 1000003) ^ this.f398923i.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f398924j.entrySet());
    }

    /* renamed from: i */
    public final Optional mo124556i() {
        return this.f398920f;
    }

    /* renamed from: j */
    public final Optional mo124557j() {
        return this.f398917c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f398915a);
        String valueOf2 = String.valueOf(this.f398916b);
        String valueOf3 = String.valueOf(this.f398917c);
        String valueOf4 = String.valueOf(this.f398918d);
        String valueOf5 = String.valueOf(this.f398919e);
        String valueOf6 = String.valueOf(this.f398920f);
        String valueOf7 = String.valueOf(this.f398921g);
        String valueOf8 = String.valueOf(this.f398922h);
        String valueOf9 = String.valueOf(this.f398923i);
        String valueOf10 = String.valueOf(this.f398924j);
        return "ServiceEngineSuggestionRequest{surfaceType=" + valueOf + ", packageName=" + valueOf2 + ", webpageUrl=" + valueOf3 + ", actionLink=" + valueOf4 + ", urlValidator=" + valueOf5 + ", verifyPackageInstalled=" + valueOf6 + ", verifyExecutionPackage=" + valueOf7 + ", urlParams=" + valueOf8 + ", biiName=" + valueOf9 + ", biiParams=" + valueOf10 + "}";
    }
}
