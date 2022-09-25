package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ah */
/* compiled from: PG */
public final class C113123ah extends C113165bw {

    /* renamed from: a */
    private final String f313419a;

    /* renamed from: b */
    private final C19167ba f313420b;

    /* renamed from: c */
    private final Optional f313421c;

    /* renamed from: d */
    private final C51331dt f313422d;

    /* renamed from: e */
    private final C48674ai f313423e;

    /* renamed from: f */
    private final Optional f313424f;

    public C113123ah(String str, C19167ba baVar, Optional optional, C51331dt dtVar, C48674ai aiVar, Optional optional2) {
        if (str != null) {
            this.f313419a = str;
            if (baVar != null) {
                this.f313420b = baVar;
                if (optional != null) {
                    this.f313421c = optional;
                    if (dtVar != null) {
                        this.f313422d = dtVar;
                        if (aiVar != null) {
                            this.f313423e = aiVar;
                            if (optional2 != null) {
                                this.f313424f = optional2;
                                return;
                            }
                            throw new NullPointerException("Null getOfflineRequestOptions");
                        }
                        throw new NullPointerException("Null getSurfaceType");
                    }
                    throw new NullPointerException("Null getTriggerTrustLevel");
                }
                throw new NullPointerException("Null getImmediateResponse");
            }
            throw new NullPointerException("Null configFlags");
        }
        throw new NullPointerException("Null prefix");
    }

    /* renamed from: a */
    public final C19167ba mo99878a() {
        return this.f313420b;
    }

    /* renamed from: b */
    public final C51331dt mo99879b() {
        return this.f313422d;
    }

    /* renamed from: c */
    public final C48674ai mo99880c() {
        return this.f313423e;
    }

    /* renamed from: d */
    public final Optional mo99881d() {
        return this.f313421c;
    }

    /* renamed from: e */
    public final Optional mo99882e() {
        return this.f313424f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113165bw) {
            C113165bw bwVar = (C113165bw) obj;
            return this.f313419a.equals(bwVar.mo99884f()) && this.f313420b.equals(bwVar.mo99878a()) && this.f313421c.equals(bwVar.mo99881d()) && this.f313422d.equals(bwVar.mo99879b()) && this.f313423e.equals(bwVar.mo99880c()) && this.f313424f.equals(bwVar.mo99882e());
        }
    }

    /* renamed from: f */
    public final String mo99884f() {
        return this.f313419a;
    }

    public final int hashCode() {
        return ((((((((((this.f313419a.hashCode() ^ 1000003) * 1000003) ^ this.f313420b.hashCode()) * 1000003) ^ this.f313421c.hashCode()) * 1000003) ^ this.f313422d.hashCode()) * 1000003) ^ this.f313423e.hashCode()) * 1000003) ^ this.f313424f.hashCode();
    }

    public final String toString() {
        String str = this.f313419a;
        String obj = this.f313420b.toString();
        String obj2 = this.f313421c.toString();
        String num = Integer.toString(this.f313422d.f133647e);
        String num2 = Integer.toString(this.f313423e.f125923f);
        String obj3 = this.f313424f.toString();
        return "Request{prefix=" + str + ", configFlags=" + obj + ", getImmediateResponse=" + obj2 + ", getTriggerTrustLevel=" + num + ", getSurfaceType=" + num2 + ", getOfflineRequestOptions=" + obj3 + "}";
    }
}
