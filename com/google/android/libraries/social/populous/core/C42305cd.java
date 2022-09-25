package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58557jl;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.core.cd */
/* compiled from: PG */
public final class C42305cd implements C42310ci {

    /* renamed from: a */
    public boolean f110934a;

    /* renamed from: b */
    public boolean f110935b;

    /* renamed from: c */
    public final Set f110936c;

    /* renamed from: d */
    public Set f110937d;

    /* renamed from: e */
    public Set f110938e;

    public C42305cd() {
        this.f110934a = false;
        this.f110935b = false;
        this.f110936c = EnumSet.noneOf(C42331dc.class);
        this.f110937d = new HashSet();
        this.f110938e = new HashSet();
    }

    /* renamed from: a */
    public final Set mo45266a() {
        return this.f110937d;
    }

    /* renamed from: b */
    public final Set mo45267b() {
        return this.f110936c;
    }

    /* renamed from: c */
    public final Set mo45268c() {
        return this.f110938e;
    }

    /* renamed from: d */
    public final boolean mo45269d() {
        return !this.f110937d.isEmpty() || !this.f110938e.isEmpty();
    }

    /* renamed from: e */
    public final boolean mo45270e() {
        return this.f110934a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42310ci) {
            C42310ci ciVar = (C42310ci) obj;
            return this.f110934a == ciVar.mo45270e() && this.f110935b == ciVar.mo45272f() && C58832aw.m90831a(this.f110936c, ciVar.mo45267b()) && C58832aw.m90831a(this.f110937d, ciVar.mo45266a()) && C58832aw.m90831a(this.f110938e, ciVar.mo45268c());
        }
    }

    /* renamed from: f */
    public final boolean mo45272f() {
        return this.f110935b;
    }

    /* renamed from: g */
    public final C42305cd mo45273g() {
        return new C42305cd(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f110934a), Boolean.valueOf(this.f110935b), this.f110936c, this.f110937d, this.f110938e});
    }

    public C42305cd(C42310ci ciVar) {
        this.f110934a = ciVar.mo45270e();
        this.f110935b = ciVar.mo45272f();
        Set b = ciVar.mo45267b();
        EnumSet<E> noneOf = EnumSet.noneOf(C42331dc.class);
        C58557jl.m90136q(noneOf, b);
        this.f110936c = noneOf;
        this.f110937d = new HashSet(ciVar.mo45266a());
        this.f110938e = new HashSet(ciVar.mo45268c());
    }
}
