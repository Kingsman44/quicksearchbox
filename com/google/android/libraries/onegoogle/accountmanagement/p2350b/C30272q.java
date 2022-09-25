package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.q */
/* compiled from: PG */
public final class C30272q extends C30263h {

    /* renamed from: a */
    public final C30213m f81860a;

    /* renamed from: b */
    public final C30158c f81861b;

    /* renamed from: c */
    public final C30253a f81862c;

    /* renamed from: d */
    public final Class f81863d;

    /* renamed from: e */
    public final boolean f81864e;

    /* renamed from: f */
    public final C30860b f81865f;

    /* renamed from: g */
    public final C58833ax f81866g;

    public C30272q(C30213m mVar, C30158c cVar, C30253a aVar, Class cls, boolean z, C30860b bVar, C58833ax axVar) {
        this.f81860a = mVar;
        this.f81861b = cVar;
        this.f81862c = aVar;
        this.f81863d = cls;
        this.f81864e = z;
        this.f81865f = bVar;
        this.f81866g = axVar;
    }

    /* renamed from: a */
    public final C30158c mo35773a() {
        return this.f81861b;
    }

    /* renamed from: b */
    public final C30213m mo35774b() {
        return this.f81860a;
    }

    /* renamed from: c */
    public final C30253a mo35775c() {
        return this.f81862c;
    }

    /* renamed from: d */
    public final C30860b mo35776d() {
        return this.f81865f;
    }

    /* renamed from: e */
    public final C58833ax mo35777e() {
        return this.f81866g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30263h) {
            C30263h hVar = (C30263h) obj;
            return this.f81860a.equals(hVar.mo35774b()) && this.f81861b.equals(hVar.mo35773a()) && this.f81862c.equals(hVar.mo35775c()) && this.f81863d.equals(hVar.mo35778f()) && this.f81864e == hVar.mo35779g() && this.f81865f.equals(hVar.mo35776d()) && this.f81866g.equals(hVar.mo35777e());
        }
    }

    /* renamed from: f */
    public final Class mo35778f() {
        return this.f81863d;
    }

    /* renamed from: g */
    public final boolean mo35779g() {
        return this.f81864e;
    }

    public final int hashCode() {
        return ((((((((((((this.f81860a.hashCode() ^ 1000003) * 1000003) ^ this.f81861b.hashCode()) * 1000003) ^ this.f81862c.hashCode()) * 1000003) ^ this.f81863d.hashCode()) * 1000003) ^ (true != this.f81864e ? 1237 : 1231)) * 1000003) ^ this.f81865f.hashCode()) * 1000003) ^ this.f81866g.hashCode();
    }

    public final String toString() {
        String obj = this.f81860a.toString();
        String obj2 = this.f81861b.toString();
        String obj3 = this.f81862c.toString();
        String obj4 = this.f81863d.toString();
        boolean z = this.f81864e;
        String obj5 = this.f81865f.toString();
        String obj6 = this.f81866g.toString();
        return "AccountManagementSpec{avatarImageLoader=" + obj + ", accountConverter=" + obj2 + ", accountsModel=" + obj3 + ", accountClass=" + obj4 + ", allowRings=" + z + ", oneGoogleEventLogger=" + obj5 + ", deactivatedAccountsFeature=" + obj6 + "}";
    }
}
