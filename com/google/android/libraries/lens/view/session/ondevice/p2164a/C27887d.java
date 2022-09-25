package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.d */
/* compiled from: PG */
final class C27887d extends C27851ah {

    /* renamed from: a */
    public final C58833ax f75995a;

    /* renamed from: b */
    public final C58833ax f75996b;

    public C27887d(C58833ax axVar, C58833ax axVar2) {
        this.f75995a = axVar;
        this.f75996b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo33330a() {
        return this.f75995a;
    }

    /* renamed from: b */
    public final C58833ax mo33331b() {
        return this.f75996b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27851ah) {
            C27851ah ahVar = (C27851ah) obj;
            return this.f75995a.equals(ahVar.mo33330a()) && this.f75996b.equals(ahVar.mo33331b());
        }
    }

    public final int hashCode() {
        return ((this.f75995a.hashCode() ^ 1000003) * 1000003) ^ this.f75996b.hashCode();
    }

    public final String toString() {
        String obj = this.f75995a.toString();
        String obj2 = this.f75996b.toString();
        return "SelectedConfigs{eligibleCascade=" + obj + ", selectedCascade=" + obj2 + "}";
    }
}
