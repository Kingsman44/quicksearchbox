package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.core.cj */
/* compiled from: PG */
public final class C42311cj implements C42310ci {

    /* renamed from: a */
    private final boolean f110961a;

    /* renamed from: b */
    private final boolean f110962b;

    /* renamed from: c */
    private final C58528ij f110963c;

    /* renamed from: d */
    private final C58528ij f110964d;

    /* renamed from: e */
    private final C58528ij f110965e;

    public C42311cj(C42310ci ciVar) {
        C42305cd cdVar = (C42305cd) ciVar;
        this.f110961a = cdVar.f110934a;
        this.f110962b = cdVar.f110935b;
        this.f110963c = C58758qx.m90644b(cdVar.f110936c);
        this.f110964d = C58528ij.m90006F(cdVar.f110937d);
        this.f110965e = C58528ij.m90006F(cdVar.f110938e);
    }

    /* renamed from: a */
    public final /* synthetic */ Set mo45266a() {
        return this.f110964d;
    }

    /* renamed from: b */
    public final /* synthetic */ Set mo45267b() {
        return this.f110963c;
    }

    /* renamed from: c */
    public final /* synthetic */ Set mo45268c() {
        return this.f110965e;
    }

    /* renamed from: d */
    public final boolean mo45269d() {
        return !this.f110964d.isEmpty() || !this.f110965e.isEmpty();
    }

    /* renamed from: e */
    public final boolean mo45270e() {
        return this.f110961a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42310ci) {
            C42310ci ciVar = (C42310ci) obj;
            return this.f110961a == ciVar.mo45270e() && this.f110962b == ciVar.mo45272f() && C58832aw.m90831a(this.f110963c, ciVar.mo45267b()) && C58832aw.m90831a(this.f110964d, ciVar.mo45266a()) && C58832aw.m90831a(this.f110965e, ciVar.mo45268c());
        }
    }

    /* renamed from: f */
    public final boolean mo45272f() {
        return this.f110962b;
    }

    /* renamed from: g */
    public final C42305cd mo45273g() {
        return new C42305cd(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f110961a), Boolean.valueOf(this.f110962b), this.f110963c, this.f110964d, this.f110965e});
    }
}
