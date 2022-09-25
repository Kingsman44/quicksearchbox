package com.google.android.libraries.onegoogle.accountmenu.features.p2359a;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.a.b */
/* compiled from: PG */
final class C30505b extends C30508e {

    /* renamed from: a */
    private final C58833ax f82393a;

    /* renamed from: b */
    private final C58485gu f82394b;

    /* renamed from: c */
    private final C58833ax f82395c;

    public C30505b(C58833ax axVar, C58485gu guVar, C58833ax axVar2) {
        this.f82393a = axVar;
        this.f82394b = guVar;
        this.f82395c = axVar2;
    }

    /* renamed from: c */
    public final C58833ax mo36146c() {
        return this.f82393a;
    }

    /* renamed from: d */
    public final C58833ax mo36147d() {
        return this.f82395c;
    }

    /* renamed from: e */
    public final C58485gu mo36148e() {
        return this.f82394b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30508e) {
            C30508e eVar = (C30508e) obj;
            return this.f82393a.equals(eVar.mo36146c()) && C58597ky.m90218i(this.f82394b, eVar.mo36148e()) && this.f82395c.equals(eVar.mo36147d());
        }
    }

    public final int hashCode() {
        return ((((this.f82393a.hashCode() ^ 1000003) * 1000003) ^ this.f82394b.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82393a);
        String obj = this.f82394b.toString();
        return "CollapsibleAccountManagementFeatureImpl{commonCards=" + valueOf + ", flavorCustomActions=" + obj + ", dynamicCards=Optional.absent()}";
    }
}
