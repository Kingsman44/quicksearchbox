package com.google.android.libraries.onegoogle.popovercontainer;

import com.google.android.libraries.onegoogle.common.p2384a.C30900a;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.c */
/* compiled from: PG */
public final class C31041c extends C31031af {

    /* renamed from: a */
    public final C31035aj f83619a;

    /* renamed from: b */
    public final C31034ai f83620b;

    /* renamed from: c */
    public final C31033ah f83621c;

    /* renamed from: d */
    public final C30897z f83622d;

    /* renamed from: e */
    public final boolean f83623e;

    /* renamed from: f */
    public final C30900a f83624f;

    /* renamed from: g */
    public final int f83625g;

    public C31041c(C31035aj ajVar, C31034ai aiVar, C31033ah ahVar, C30897z zVar, boolean z, int i, C30900a aVar) {
        this.f83619a = ajVar;
        this.f83620b = aiVar;
        this.f83621c = ahVar;
        this.f83622d = zVar;
        this.f83623e = z;
        this.f83625g = i;
        this.f83624f = aVar;
    }

    /* renamed from: a */
    public final C30900a mo36721a() {
        return this.f83624f;
    }

    /* renamed from: b */
    public final C30897z mo36722b() {
        return this.f83622d;
    }

    /* renamed from: c */
    public final C31033ah mo36723c() {
        return this.f83621c;
    }

    /* renamed from: d */
    public final C31034ai mo36724d() {
        return this.f83620b;
    }

    /* renamed from: e */
    public final C31035aj mo36725e() {
        return this.f83619a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31031af) {
            C31031af afVar = (C31031af) obj;
            return this.f83619a.equals(afVar.mo36725e()) && this.f83620b.equals(afVar.mo36724d()) && this.f83621c.equals(afVar.mo36723c()) && this.f83622d.equals(afVar.mo36722b()) && this.f83623e == afVar.mo36726f() && this.f83625g == afVar.mo36727g() && this.f83624f.equals(afVar.mo36721a());
        }
    }

    /* renamed from: f */
    public final boolean mo36726f() {
        return this.f83623e;
    }

    /* renamed from: g */
    public final int mo36727g() {
        return this.f83625g;
    }

    public final int hashCode() {
        return ((((((((((((this.f83619a.hashCode() ^ 1000003) * 1000003) ^ this.f83620b.hashCode()) * 1000003) ^ this.f83621c.hashCode()) * 1000003) ^ this.f83622d.hashCode()) * 1000003) ^ (true != this.f83623e ? 1237 : 1231)) * 1000003) ^ this.f83625g) * 1000003) ^ this.f83624f.hashCode();
    }

    public final String toString() {
        String obj = this.f83619a.toString();
        String obj2 = this.f83620b.toString();
        String obj3 = this.f83621c.toString();
        String obj4 = this.f83622d.toString();
        boolean z = this.f83623e;
        String str = this.f83625g != 1 ? "ALIGN_END" : "ALIGN_CENTER";
        String obj5 = this.f83624f.toString();
        return "Configuration{onViewCreatedCallback=" + obj + ", onDismissCallback=" + obj2 + ", onDestroyCallback=" + obj3 + ", visualElements=" + obj4 + ", isExperimental=" + z + ", largeScreenDialogAlignment=" + str + ", materialVersion=" + obj5 + "}";
    }
}
