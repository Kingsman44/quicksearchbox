package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4552o.p4553a.C59509cf;
import com.google.common.p4552o.p4553a.C59514ck;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.d */
/* compiled from: PG */
class C113356d extends C113408es {

    /* renamed from: a */
    public final C58495hd f313883a;

    /* renamed from: c */
    private final C113405ep f313884c;

    /* renamed from: d */
    private final Optional f313885d;

    /* renamed from: e */
    private final Optional f313886e;

    /* renamed from: f */
    private final Optional f313887f;

    /* renamed from: g */
    private final Optional f313888g;

    /* renamed from: h */
    private final Optional f313889h;

    /* renamed from: i */
    private final Optional f313890i;

    /* renamed from: j */
    private final C59514ck f313891j;

    /* renamed from: k */
    private final C59509cf f313892k;

    /* renamed from: l */
    private final Optional f313893l;

    /* renamed from: m */
    private final Optional f313894m;

    /* renamed from: n */
    private final C58528ij f313895n;

    public C113356d(C113405ep epVar, C58495hd hdVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, C59514ck ckVar, C59509cf cfVar, Optional optional7, Optional optional8, C58528ij ijVar) {
        if (epVar != null) {
            this.f313884c = epVar;
            if (hdVar != null) {
                this.f313883a = hdVar;
                if (optional != null) {
                    this.f313885d = optional;
                    if (optional2 != null) {
                        this.f313886e = optional2;
                        if (optional3 != null) {
                            this.f313887f = optional3;
                            if (optional4 != null) {
                                this.f313888g = optional4;
                                if (optional5 != null) {
                                    this.f313889h = optional5;
                                    if (optional6 != null) {
                                        this.f313890i = optional6;
                                        if (ckVar != null) {
                                            this.f313891j = ckVar;
                                            if (cfVar != null) {
                                                this.f313892k = cfVar;
                                                if (optional7 != null) {
                                                    this.f313893l = optional7;
                                                    if (optional8 != null) {
                                                        this.f313894m = optional8;
                                                        if (ijVar != null) {
                                                            this.f313895n = ijVar;
                                                            return;
                                                        }
                                                        throw new NullPointerException("Null incompleteSourcesBeforeFastTimeout");
                                                    }
                                                    throw new NullPointerException("Null counterfactualLogTag");
                                                }
                                                throw new NullPointerException("Null previousQuery");
                                            }
                                            throw new NullPointerException("Null cortexMetadata");
                                        }
                                        throw new NullPointerException("Null mixerResponseLog");
                                    }
                                    throw new NullPointerException("Null deviceCountry");
                                }
                                throw new NullPointerException("Null detectedLanguages");
                            }
                            throw new NullPointerException("Null tapasModelExtensionSupplier");
                        }
                        throw new NullPointerException("Null ctrStat");
                    }
                    throw new NullPointerException("Null suggestResponse");
                }
                throw new NullPointerException("Null suggestionsFuture");
            }
            throw new NullPointerException("Null suggestionsByGroup");
        }
        throw new NullPointerException("Null originalRequest");
    }

    /* renamed from: a */
    public final C113405ep mo100118a() {
        return this.f313884c;
    }

    /* renamed from: b */
    public final C113407er mo100119b() {
        return new C113302c(this);
    }

    /* renamed from: c */
    public final C58495hd mo100120c() {
        return this.f313883a;
    }

    /* renamed from: d */
    public final C58528ij mo100121d() {
        return this.f313895n;
    }

    /* renamed from: e */
    public final C59509cf mo100122e() {
        return this.f313892k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113408es) {
            C113408es esVar = (C113408es) obj;
            return this.f313884c.equals(esVar.mo100118a()) && this.f313883a.equals(esVar.mo100120c()) && this.f313885d.equals(esVar.mo100132m()) && this.f313886e.equals(esVar.mo100131l()) && this.f313887f.equals(esVar.mo100126h()) && this.f313888g.equals(esVar.mo100133n()) && this.f313889h.equals(esVar.mo100128i()) && this.f313890i.equals(esVar.mo100129j()) && this.f313891j.equals(esVar.mo100124f()) && this.f313892k.equals(esVar.mo100122e()) && this.f313893l.equals(esVar.mo100130k()) && this.f313894m.equals(esVar.mo100125g()) && this.f313895n.equals(esVar.mo100121d());
        }
    }

    /* renamed from: f */
    public final C59514ck mo100124f() {
        return this.f313891j;
    }

    /* renamed from: g */
    public final Optional mo100125g() {
        return this.f313894m;
    }

    /* renamed from: h */
    public final Optional mo100126h() {
        return this.f313887f;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.f313884c.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f313883a.entrySet())) * 1000003) ^ this.f313885d.hashCode()) * 1000003) ^ this.f313886e.hashCode()) * 1000003) ^ this.f313887f.hashCode()) * 1000003) ^ this.f313888g.hashCode()) * 1000003) ^ this.f313889h.hashCode()) * 1000003) ^ this.f313890i.hashCode()) * 1000003) ^ this.f313891j.hashCode()) * 1000003) ^ this.f313892k.hashCode()) * 1000003) ^ this.f313893l.hashCode()) * 1000003) ^ this.f313894m.hashCode()) * 1000003) ^ this.f313895n.hashCode();
    }

    /* renamed from: i */
    public final Optional mo100128i() {
        return this.f313889h;
    }

    /* renamed from: j */
    public final Optional mo100129j() {
        return this.f313890i;
    }

    /* renamed from: k */
    public final Optional mo100130k() {
        return this.f313893l;
    }

    /* renamed from: l */
    public final Optional mo100131l() {
        return this.f313886e;
    }

    /* renamed from: m */
    public final Optional mo100132m() {
        return this.f313885d;
    }

    /* renamed from: n */
    public final Optional mo100133n() {
        return this.f313888g;
    }

    public final String toString() {
        String obj = this.f313884c.toString();
        String obj2 = this.f313883a.toString();
        String obj3 = this.f313885d.toString();
        String obj4 = this.f313886e.toString();
        String obj5 = this.f313887f.toString();
        String obj6 = this.f313888g.toString();
        String obj7 = this.f313889h.toString();
        String obj8 = this.f313890i.toString();
        String obj9 = this.f313891j.toString();
        String obj10 = this.f313892k.toString();
        String obj11 = this.f313893l.toString();
        String obj12 = this.f313894m.toString();
        String obj13 = this.f313895n.toString();
        return "TapasSuggestionResponse{originalRequest=" + obj + ", suggestionsByGroup=" + obj2 + ", suggestionsFuture=" + obj3 + ", suggestResponse=" + obj4 + ", ctrStat=" + obj5 + ", tapasModelExtensionSupplier=" + obj6 + ", detectedLanguages=" + obj7 + ", deviceCountry=" + obj8 + ", mixerResponseLog=" + obj9 + ", cortexMetadata=" + obj10 + ", previousQuery=" + obj11 + ", counterfactualLogTag=" + obj12 + ", incompleteSourcesBeforeFastTimeout=" + obj13 + "}";
    }
}
