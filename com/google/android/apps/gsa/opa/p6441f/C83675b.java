package com.google.android.apps.gsa.opa.p6441f;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.assistant.p3897e.p3921j.C52091ex;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.opa.f.b */
/* compiled from: PG */
public final class C83675b extends C83677d {

    /* renamed from: a */
    public final String f228087a;

    /* renamed from: b */
    public final e f228088b;

    /* renamed from: c */
    public final boolean f228089c;

    /* renamed from: d */
    public final QueryTriggerType f228090d;

    /* renamed from: e */
    public final String f228091e;

    /* renamed from: f */
    public final C52091ex f228092f;

    /* renamed from: g */
    public final Optional f228093g;

    /* renamed from: h */
    public final Bundle f228094h;

    /* renamed from: i */
    public final boolean f228095i;

    /* renamed from: j */
    public final Optional f228096j;

    /* renamed from: k */
    public final boolean f228097k;

    /* renamed from: l */
    public final boolean f228098l;

    public C83675b(String str, e eVar, boolean z, QueryTriggerType queryTriggerType, String str2, C52091ex exVar, Optional optional, Bundle bundle, boolean z2, Optional optional2, boolean z3, boolean z4) {
        this.f228087a = str;
        this.f228088b = eVar;
        this.f228089c = z;
        this.f228090d = queryTriggerType;
        this.f228091e = str2;
        this.f228092f = exVar;
        this.f228093g = optional;
        this.f228094h = bundle;
        this.f228095i = z2;
        this.f228096j = optional2;
        this.f228097k = z3;
        this.f228098l = z4;
    }

    /* renamed from: a */
    public final Bundle mo76973a() {
        return this.f228094h;
    }

    /* renamed from: b */
    public final e mo76974b() {
        return this.f228088b;
    }

    /* renamed from: c */
    public final QueryTriggerType mo76975c() {
        return this.f228090d;
    }

    /* renamed from: d */
    public final C52091ex mo76976d() {
        return this.f228092f;
    }

    /* renamed from: e */
    public final Optional mo76977e() {
        return this.f228093g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83677d) {
            C83677d dVar = (C83677d) obj;
            return this.f228087a.equals(dVar.mo76980g()) && this.f228088b.equals(dVar.mo76974b()) && this.f228089c == dVar.mo76983i() && this.f228090d.equals(dVar.mo76975c()) && this.f228091e.equals(dVar.mo76981h()) && this.f228092f.equals(dVar.mo76976d()) && this.f228093g.equals(dVar.mo76977e()) && this.f228094h.equals(dVar.mo76973a()) && this.f228095i == dVar.mo76984j() && this.f228096j.equals(dVar.mo76979f()) && this.f228097k == dVar.mo76985k() && this.f228098l == dVar.mo76986l();
        }
    }

    /* renamed from: f */
    public final Optional mo76979f() {
        return this.f228096j;
    }

    /* renamed from: g */
    public final String mo76980g() {
        return this.f228087a;
    }

    /* renamed from: h */
    public final String mo76981h() {
        return this.f228091e;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((this.f228087a.hashCode() ^ 1000003) * 1000003) ^ this.f228088b.hashCode()) * 1000003) ^ (true != this.f228089c ? 1237 : 1231)) * 1000003) ^ this.f228090d.hashCode()) * 1000003) ^ this.f228091e.hashCode()) * 1000003) ^ this.f228092f.hashCode()) * 1000003) ^ this.f228093g.hashCode()) * 1000003) ^ this.f228094h.hashCode()) * 1000003) ^ (true != this.f228095i ? 1237 : 1231)) * 1000003) ^ this.f228096j.hashCode()) * 1000003) ^ (true != this.f228097k ? 1237 : 1231)) * 1000003;
        if (true == this.f228098l) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo76983i() {
        return this.f228089c;
    }

    /* renamed from: j */
    public final boolean mo76984j() {
        return this.f228095i;
    }

    /* renamed from: k */
    public final boolean mo76985k() {
        return this.f228097k;
    }

    /* renamed from: l */
    public final boolean mo76986l() {
        return this.f228098l;
    }

    public final String toString() {
        String str = this.f228087a;
        String num = Integer.toString(this.f228088b.ca);
        boolean z = this.f228089c;
        String obj = this.f228090d.toString();
        String str2 = this.f228091e;
        String obj2 = this.f228092f.toString();
        String valueOf = String.valueOf(this.f228093g);
        String obj3 = this.f228094h.toString();
        boolean z2 = this.f228095i;
        String valueOf2 = String.valueOf(this.f228096j);
        boolean z3 = this.f228097k;
        boolean z4 = this.f228098l;
        return "QueryContext{queryId=" + str + ", opaTriggerType=" + num + ", nonVoice=" + z + ", queryTriggerType=" + obj + ", source=" + str2 + ", conversationParams=" + obj2 + ", clickTrackingCgi=" + valueOf + ", ngaQueryExtras=" + obj3 + ", refreshScreenContext=" + z2 + ", clientQueryParams=" + valueOf2 + ", queryTriggeredByBluetoothHeadset=" + z3 + ", queryTriggeredByWiredHeadset=" + z4 + "}";
    }
}
