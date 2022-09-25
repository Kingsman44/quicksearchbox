package com.google.android.apps.gsa.opa.smartspace;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.b */
/* compiled from: PG */
final class C83742b extends C83800p {

    /* renamed from: a */
    public final C58495hd f228255a;

    /* renamed from: b */
    public final C58833ax f228256b;

    /* renamed from: c */
    public final C83741am f228257c;

    /* renamed from: d */
    public final C58485gu f228258d;

    /* renamed from: e */
    public final C58485gu f228259e;

    /* renamed from: f */
    public final C58495hd f228260f;

    /* renamed from: g */
    public final C58485gu f228261g;

    /* renamed from: h */
    public final C58833ax f228262h;

    public C83742b(C58495hd hdVar, C58833ax axVar, C83741am amVar, C58485gu guVar, C58485gu guVar2, C58495hd hdVar2, C58485gu guVar3, C58833ax axVar2) {
        this.f228255a = hdVar;
        this.f228256b = axVar;
        this.f228257c = amVar;
        this.f228258d = guVar;
        this.f228259e = guVar2;
        this.f228260f = hdVar2;
        this.f228261g = guVar3;
        this.f228262h = axVar2;
    }

    /* renamed from: a */
    public final C83798n mo77055a() {
        return new C83724a(this);
    }

    /* renamed from: b */
    public final C83741am mo77056b() {
        return this.f228257c;
    }

    /* renamed from: c */
    public final C58833ax mo77057c() {
        return this.f228262h;
    }

    /* renamed from: d */
    public final C58833ax mo77058d() {
        return this.f228256b;
    }

    /* renamed from: e */
    public final C58485gu mo77059e() {
        return this.f228258d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83800p) {
            C83800p pVar = (C83800p) obj;
            return C58662ni.m90356o(this.f228255a, pVar.mo77065i()) && this.f228256b.equals(pVar.mo77058d()) && this.f228257c.equals(pVar.mo77056b()) && C58597ky.m90218i(this.f228258d, pVar.mo77059e()) && C58597ky.m90218i(this.f228259e, pVar.mo77061f()) && C58662ni.m90356o(this.f228260f, pVar.mo77063h()) && C58597ky.m90218i(this.f228261g, pVar.mo77062g()) && !pVar.mo77066j() && this.f228262h.equals(pVar.mo77057c());
        }
    }

    /* renamed from: f */
    public final C58485gu mo77061f() {
        return this.f228259e;
    }

    /* renamed from: g */
    public final C58485gu mo77062g() {
        return this.f228261g;
    }

    /* renamed from: h */
    public final C58495hd mo77063h() {
        return this.f228260f;
    }

    public final int hashCode() {
        return ((((((((((((((((C58758qx.m90643a(this.f228255a.entrySet()) ^ 1000003) * 1000003) ^ this.f228256b.hashCode()) * 1000003) ^ this.f228257c.hashCode()) * 1000003) ^ this.f228258d.hashCode()) * 1000003) ^ this.f228259e.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f228260f.entrySet())) * 1000003) ^ this.f228261g.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    /* renamed from: i */
    public final C58495hd mo77065i() {
        return this.f228255a;
    }

    /* renamed from: j */
    public final boolean mo77066j() {
        return false;
    }

    public final String toString() {
        String i = C58662ni.m90350i(this.f228255a);
        String valueOf = String.valueOf(this.f228256b);
        String obj = this.f228257c.toString();
        String obj2 = this.f228258d.toString();
        String obj3 = this.f228259e.toString();
        String i2 = C58662ni.m90350i(this.f228260f);
        String obj4 = this.f228261g.toString();
        String valueOf2 = String.valueOf(this.f228262h);
        return "SmartspaceCardsContent{primaryCardsMapInCache=" + i + ", weatherCardInCache=" + valueOf + ", newUpdateCard=" + obj + ", newUpdateCardIcon=" + obj2 + ", smartspaceChipsList=" + obj3 + ", primaryCardCachedIconMap=" + i2 + ", weatherCardInCacheIcon=" + obj4 + ", isTriggeringCardPresent=false, expirationDetails=" + valueOf2 + "}";
    }
}
