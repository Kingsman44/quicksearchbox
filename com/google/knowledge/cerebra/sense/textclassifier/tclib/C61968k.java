package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.assistant.p3863av.p3864a.p3865a.p3866a.C50532j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.k */
/* compiled from: PG */
final class C61968k extends C61925ch {

    /* renamed from: a */
    private final boolean f167455a;

    /* renamed from: b */
    private final boolean f167456b;

    /* renamed from: c */
    private final boolean f167457c;

    /* renamed from: d */
    private final boolean f167458d;

    /* renamed from: e */
    private final boolean f167459e;

    /* renamed from: f */
    private final boolean f167460f;

    /* renamed from: g */
    private final C58485gu f167461g;

    /* renamed from: h */
    private final C61908br f167462h;

    /* renamed from: i */
    private final C50532j f167463i;

    public C61968k(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C58485gu guVar, C61908br brVar, C50532j jVar) {
        this.f167455a = z;
        this.f167456b = z2;
        this.f167457c = z3;
        this.f167458d = z4;
        this.f167459e = z5;
        this.f167460f = z6;
        this.f167461g = guVar;
        this.f167462h = brVar;
        this.f167463i = jVar;
    }

    /* renamed from: a */
    public final C50532j mo58371a() {
        return this.f167463i;
    }

    /* renamed from: b */
    public final C58485gu mo58372b() {
        return this.f167461g;
    }

    /* renamed from: c */
    public final C61908br mo58373c() {
        return this.f167462h;
    }

    /* renamed from: d */
    public final boolean mo58374d() {
        return this.f167457c;
    }

    /* renamed from: e */
    public final boolean mo58375e() {
        return this.f167456b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61925ch) {
            C61925ch chVar = (C61925ch) obj;
            return this.f167455a == chVar.mo58376f() && this.f167456b == chVar.mo58375e() && this.f167457c == chVar.mo58374d() && this.f167458d == chVar.mo58377g() && this.f167459e == chVar.mo58378h() && !chVar.mo58379i() && this.f167460f == chVar.mo58380j() && C58597ky.m90218i(this.f167461g, chVar.mo58372b()) && this.f167462h.equals(chVar.mo58373c()) && this.f167463i.equals(chVar.mo58371a());
        }
    }

    /* renamed from: f */
    public final boolean mo58376f() {
        return this.f167455a;
    }

    /* renamed from: g */
    public final boolean mo58377g() {
        return this.f167458d;
    }

    /* renamed from: h */
    public final boolean mo58378h() {
        return this.f167459e;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((true != this.f167455a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f167456b ? 1237 : 1231)) * 1000003) ^ (true != this.f167457c ? 1237 : 1231)) * 1000003) ^ (true != this.f167458d ? 1237 : 1231)) * 1000003) ^ (true != this.f167459e ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        if (true != this.f167460f) {
            i = 1237;
        }
        return ((((((i2 ^ i) * 1000003) ^ this.f167461g.hashCode()) * 1000003) ^ this.f167462h.hashCode()) * 1000003) ^ this.f167463i.hashCode();
    }

    /* renamed from: i */
    public final boolean mo58379i() {
        return false;
    }

    /* renamed from: j */
    public final boolean mo58380j() {
        return this.f167460f;
    }

    public final String toString() {
        boolean z = this.f167455a;
        boolean z2 = this.f167456b;
        boolean z3 = this.f167457c;
        boolean z4 = this.f167458d;
        boolean z5 = this.f167459e;
        boolean z6 = this.f167460f;
        String obj = this.f167461g.toString();
        String obj2 = this.f167462h.toString();
        String obj3 = this.f167463i.toString();
        return "TextClassifierContactOptions{annotateName=" + z + ", annotateGivenName=" + z2 + ", annotateFamilyName=" + z3 + ", annotateNickname=" + z4 + ", enableChangeMonitoring=" + z5 + ", enableDeclension=false, enableShortcutContacts=" + z6 + ", shortcutContactNames=" + obj + ", lightweightTokensProvider=" + obj2 + ", neuralContactMatchingConfig=" + obj3 + "}";
    }
}
