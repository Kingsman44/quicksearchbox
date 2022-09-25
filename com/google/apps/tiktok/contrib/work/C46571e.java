package com.google.apps.tiktok.contrib.work;

import androidx.work.C4412h;
import androidx.work.C4632m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.apps.tiktok.contrib.work.e */
/* compiled from: PG */
final class C46571e extends C46586t {

    /* renamed from: a */
    public final Class f121760a;

    /* renamed from: b */
    public final C4412h f121761b;

    /* renamed from: c */
    public final C58833ax f121762c;

    /* renamed from: d */
    public final C46584r f121763d;

    /* renamed from: e */
    public final C4632m f121764e;

    /* renamed from: f */
    public final C58833ax f121765f;

    /* renamed from: g */
    public final C58833ax f121766g;

    /* renamed from: h */
    public final C58528ij f121767h;

    public C46571e(Class cls, C4412h hVar, C58833ax axVar, C46584r rVar, C4632m mVar, C58833ax axVar2, C58833ax axVar3, C58528ij ijVar) {
        this.f121760a = cls;
        this.f121761b = hVar;
        this.f121762c = axVar;
        this.f121763d = rVar;
        this.f121764e = mVar;
        this.f121765f = axVar2;
        this.f121766g = axVar3;
        this.f121767h = ijVar;
    }

    /* renamed from: a */
    public final C4412h mo50564a() {
        return this.f121761b;
    }

    /* renamed from: b */
    public final C4632m mo50565b() {
        return this.f121764e;
    }

    /* renamed from: c */
    public final C46582p mo50566c() {
        return new C46570d(this);
    }

    /* renamed from: d */
    public final C46584r mo50567d() {
        return this.f121763d;
    }

    /* renamed from: e */
    public final C58833ax mo50568e() {
        return this.f121762c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46586t) {
            C46586t tVar = (C46586t) obj;
            return this.f121760a.equals(tVar.mo50574i()) && this.f121761b.equals(tVar.mo50564a()) && this.f121762c.equals(tVar.mo50568e()) && this.f121763d.equals(tVar.mo50567d()) && this.f121764e.equals(tVar.mo50565b()) && this.f121765f.equals(tVar.mo50570f()) && this.f121766g.equals(tVar.mo50571g()) && this.f121767h.equals(tVar.mo50572h());
        }
    }

    /* renamed from: f */
    public final C58833ax mo50570f() {
        return this.f121765f;
    }

    /* renamed from: g */
    public final C58833ax mo50571g() {
        return this.f121766g;
    }

    /* renamed from: h */
    public final C58528ij mo50572h() {
        return this.f121767h;
    }

    public final int hashCode() {
        return ((((((((((((((this.f121760a.hashCode() ^ 1000003) * 1000003) ^ this.f121761b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f121763d.hashCode()) * 1000003) ^ this.f121764e.hashCode()) * 1000003) ^ this.f121765f.hashCode()) * 1000003) ^ this.f121766g.hashCode()) * 1000003) ^ this.f121767h.hashCode();
    }

    /* renamed from: i */
    public final Class mo50574i() {
        return this.f121760a;
    }

    public final String toString() {
        String obj = this.f121760a.toString();
        String obj2 = this.f121761b.toString();
        String valueOf = String.valueOf(this.f121762c);
        String obj3 = this.f121763d.toString();
        String obj4 = this.f121764e.toString();
        String valueOf2 = String.valueOf(this.f121765f);
        String valueOf3 = String.valueOf(this.f121766g);
        String obj5 = this.f121767h.toString();
        return "TikTokWorkSpec{workerClass=" + obj + ", constraints=" + obj2 + ", expedited=" + valueOf + ", initialDelay=" + obj3 + ", inputData=" + obj4 + ", periodic=" + valueOf2 + ", unique=" + valueOf3 + ", tags=" + obj5 + "}";
    }
}
