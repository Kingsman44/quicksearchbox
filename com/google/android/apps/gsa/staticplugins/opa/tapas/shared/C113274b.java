package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.b */
/* compiled from: PG */
class C113274b extends C113502n {

    /* renamed from: a */
    public final C58495hd f313692a;

    /* renamed from: b */
    public final Optional f313693b;

    /* renamed from: c */
    private final Optional f313694c;

    /* renamed from: d */
    private final Optional f313695d;

    /* renamed from: e */
    private final Optional f313696e;

    /* renamed from: f */
    private final Optional f313697f;

    /* renamed from: g */
    private final Optional f313698g;

    /* renamed from: h */
    private final Optional f313699h;

    /* renamed from: i */
    private final Optional f313700i;

    /* renamed from: j */
    private final Optional f313701j;

    /* renamed from: k */
    private final Optional f313702k;

    /* renamed from: l */
    private final C58495hd f313703l;

    public C113274b(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, C58495hd hdVar, C58495hd hdVar2, Optional optional10) {
        if (optional != null) {
            this.f313694c = optional;
            if (optional2 != null) {
                this.f313695d = optional2;
                if (optional3 != null) {
                    this.f313696e = optional3;
                    if (optional4 != null) {
                        this.f313697f = optional4;
                        if (optional5 != null) {
                            this.f313698g = optional5;
                            if (optional6 != null) {
                                this.f313699h = optional6;
                                if (optional7 != null) {
                                    this.f313700i = optional7;
                                    if (optional8 != null) {
                                        this.f313701j = optional8;
                                        if (optional9 != null) {
                                            this.f313702k = optional9;
                                            this.f313703l = hdVar;
                                            this.f313692a = hdVar2;
                                            if (optional10 != null) {
                                                this.f313693b = optional10;
                                                return;
                                            }
                                            throw new NullPointerException("Null deeplinkUriSupplier");
                                        }
                                        throw new NullPointerException("Null shortcutCanonicalText");
                                    }
                                    throw new NullPointerException("Null shortcutPriority");
                                }
                                throw new NullPointerException("Null shortcutActionIntent");
                            }
                            throw new NullPointerException("Null appActionIntent");
                        }
                        throw new NullPointerException("Null appActionIcon");
                    }
                    throw new NullPointerException("Null fulfillment");
                }
                throw new NullPointerException("Null appActionType");
            }
            throw new NullPointerException("Null packageName");
        }
        throw new NullPointerException("Null appName");
    }

    /* renamed from: a */
    public final C113501m mo100036a() {
        return new C113246a(this);
    }

    /* renamed from: b */
    public final C58495hd mo100037b() {
        return this.f313703l;
    }

    /* renamed from: c */
    public final C58495hd mo100038c() {
        return this.f313692a;
    }

    /* renamed from: d */
    public final Optional mo100039d() {
        return this.f313698g;
    }

    /* renamed from: e */
    public final Optional mo100040e() {
        return this.f313699h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113502n) {
            C113502n nVar = (C113502n) obj;
            return this.f313694c.equals(nVar.mo100043g()) && this.f313695d.equals(nVar.mo100047j()) && this.f313696e.equals(nVar.mo100042f()) && this.f313697f.equals(nVar.mo100046i()) && this.f313698g.equals(nVar.mo100039d()) && this.f313699h.equals(nVar.mo100040e()) && this.f313700i.equals(nVar.mo100048k()) && this.f313701j.equals(nVar.mo100050m()) && this.f313702k.equals(nVar.mo100049l()) && this.f313703l.equals(nVar.mo100037b()) && this.f313692a.equals(nVar.mo100038c()) && this.f313693b.equals(nVar.mo100044h());
        }
    }

    /* renamed from: f */
    public final Optional mo100042f() {
        return this.f313696e;
    }

    /* renamed from: g */
    public final Optional mo100043g() {
        return this.f313694c;
    }

    /* renamed from: h */
    public final Optional mo100044h() {
        return this.f313693b;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f313694c.hashCode() ^ 1000003) * 1000003) ^ this.f313695d.hashCode()) * 1000003) ^ this.f313696e.hashCode()) * 1000003) ^ this.f313697f.hashCode()) * 1000003) ^ this.f313698g.hashCode()) * 1000003) ^ this.f313699h.hashCode()) * 1000003) ^ this.f313700i.hashCode()) * 1000003) ^ this.f313701j.hashCode()) * 1000003) ^ this.f313702k.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f313703l.entrySet())) * 1000003) ^ C58758qx.m90643a(this.f313692a.entrySet())) * 1000003) ^ this.f313693b.hashCode();
    }

    /* renamed from: i */
    public final Optional mo100046i() {
        return this.f313697f;
    }

    /* renamed from: j */
    public final Optional mo100047j() {
        return this.f313695d;
    }

    /* renamed from: k */
    public final Optional mo100048k() {
        return this.f313700i;
    }

    /* renamed from: l */
    public final Optional mo100049l() {
        return this.f313702k;
    }

    /* renamed from: m */
    public final Optional mo100050m() {
        return this.f313701j;
    }

    public final String toString() {
        String obj = this.f313694c.toString();
        String obj2 = this.f313695d.toString();
        String obj3 = this.f313696e.toString();
        String obj4 = this.f313697f.toString();
        String obj5 = this.f313698g.toString();
        String obj6 = this.f313699h.toString();
        String obj7 = this.f313700i.toString();
        String obj8 = this.f313701j.toString();
        String obj9 = this.f313702k.toString();
        String obj10 = this.f313703l.toString();
        String obj11 = this.f313692a.toString();
        String obj12 = this.f313693b.toString();
        return "AppActionSuggestionParams{appName=" + obj + ", packageName=" + obj2 + ", appActionType=" + obj3 + ", fulfillment=" + obj4 + ", appActionIcon=" + obj5 + ", appActionIntent=" + obj6 + ", shortcutActionIntent=" + obj7 + ", shortcutPriority=" + obj8 + ", shortcutCanonicalText=" + obj9 + ", availableFulfillmentParams=" + obj10 + ", prefilledFulfillmentParams=" + obj11 + ", deeplinkUriSupplier=" + obj12 + "}";
    }
}
