package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4566l.C60218r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.c */
/* compiled from: PG */
public final class C112695c extends C112667ae {

    /* renamed from: a */
    public final String f312417a;

    /* renamed from: b */
    public final C113415ez f312418b;

    /* renamed from: c */
    public final C113408es f312419c;

    /* renamed from: d */
    public final C59743a f312420d;

    /* renamed from: e */
    public final C60218r f312421e;

    /* renamed from: f */
    public final Optional f312422f;

    /* renamed from: g */
    public final int f312423g;

    public C112695c(String str, C113415ez ezVar, C113408es esVar, C59743a aVar, C60218r rVar, Optional optional, int i) {
        this.f312417a = str;
        this.f312418b = ezVar;
        this.f312419c = esVar;
        this.f312420d = aVar;
        this.f312421e = rVar;
        this.f312422f = optional;
        this.f312423g = i;
    }

    /* renamed from: a */
    public final C113408es mo99618a() {
        return this.f312419c;
    }

    /* renamed from: b */
    public final C113415ez mo99619b() {
        return this.f312418b;
    }

    /* renamed from: c */
    public final C59743a mo99620c() {
        return this.f312420d;
    }

    /* renamed from: d */
    public final C60218r mo99621d() {
        return this.f312421e;
    }

    /* renamed from: e */
    public final Optional mo99622e() {
        return this.f312422f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112667ae) {
            C112667ae aeVar = (C112667ae) obj;
            return this.f312417a.equals(aeVar.mo99623f()) && this.f312418b.equals(aeVar.mo99619b()) && this.f312419c.equals(aeVar.mo99618a()) && this.f312420d.equals(aeVar.mo99620c()) && this.f312421e.equals(aeVar.mo99621d()) && this.f312422f.equals(aeVar.mo99622e()) && this.f312423g == aeVar.mo99624g();
        }
    }

    /* renamed from: f */
    public final String mo99623f() {
        return this.f312417a;
    }

    /* renamed from: g */
    public final int mo99624g() {
        return this.f312423g;
    }

    public final int hashCode() {
        return ((((((((((((this.f312417a.hashCode() ^ 1000003) * 1000003) ^ this.f312418b.hashCode()) * 1000003) ^ this.f312419c.hashCode()) * 1000003) ^ this.f312420d.hashCode()) * 1000003) ^ this.f312421e.hashCode()) * 1000003) ^ this.f312422f.hashCode()) * 1000003) ^ this.f312423g;
    }

    public final String toString() {
        String str = this.f312417a;
        String obj = this.f312418b.toString();
        String obj2 = this.f312419c.toString();
        String num = Integer.toString(this.f312420d.f161421ts);
        String obj3 = this.f312421e.toString();
        String obj4 = this.f312422f.toString();
        String num2 = Integer.toString(this.f312423g - 1);
        return "TapasQueryLogParams{requestId=" + str + ", tapasSuggestionWrapper=" + obj + ", tapasSuggestionResponse=" + obj2 + ", eventName=" + num + ", clientEventId=" + obj3 + ", featureVEIdsOptional=" + obj4 + ", fulfillmentType=" + num2 + "}";
    }
}
