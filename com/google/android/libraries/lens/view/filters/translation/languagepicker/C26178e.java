package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.common.base.C58833ax;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.e */
/* compiled from: PG */
final class C26178e extends C26136ae {

    /* renamed from: a */
    public final boolean f71120a;

    /* renamed from: b */
    public final boolean f71121b;

    /* renamed from: c */
    public final C25327c f71122c;

    /* renamed from: d */
    public final C58833ax f71123d;

    /* renamed from: e */
    public final boolean f71124e;

    /* renamed from: f */
    public final Locale f71125f;

    /* renamed from: g */
    public final boolean f71126g;

    /* renamed from: h */
    public final String f71127h;

    /* renamed from: i */
    public final C58833ax f71128i;

    /* renamed from: j */
    public final C58833ax f71129j;

    /* renamed from: k */
    public final String f71130k;

    public C26178e(boolean z, boolean z2, C25327c cVar, C58833ax axVar, boolean z3, Locale locale, boolean z4, String str, C58833ax axVar2, C58833ax axVar3, String str2) {
        this.f71120a = z;
        this.f71121b = z2;
        this.f71122c = cVar;
        this.f71123d = axVar;
        this.f71124e = z3;
        this.f71125f = locale;
        this.f71126g = z4;
        this.f71127h = str;
        this.f71128i = axVar2;
        this.f71129j = axVar3;
        this.f71130k = str2;
    }

    /* renamed from: a */
    public final C26135ad mo31361a() {
        return new C26177d(this);
    }

    /* renamed from: b */
    public final C25327c mo31362b() {
        return this.f71122c;
    }

    /* renamed from: c */
    public final C58833ax mo31363c() {
        return this.f71123d;
    }

    /* renamed from: d */
    public final C58833ax mo31364d() {
        return this.f71129j;
    }

    /* renamed from: e */
    public final C58833ax mo31365e() {
        return this.f71128i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26136ae) {
            C26136ae aeVar = (C26136ae) obj;
            return this.f71120a == aeVar.mo31371k() && this.f71121b == aeVar.mo31369i() && this.f71122c.equals(aeVar.mo31362b()) && this.f71123d.equals(aeVar.mo31363c()) && this.f71124e == aeVar.mo31372l() && this.f71125f.equals(aeVar.mo31368h()) && this.f71126g == aeVar.mo31370j() && this.f71127h.equals(aeVar.mo31366f()) && this.f71128i.equals(aeVar.mo31365e()) && this.f71129j.equals(aeVar.mo31364d()) && this.f71130k.equals(aeVar.mo31367g());
        }
    }

    /* renamed from: f */
    public final String mo31366f() {
        return this.f71127h;
    }

    /* renamed from: g */
    public final String mo31367g() {
        return this.f71130k;
    }

    /* renamed from: h */
    public final Locale mo31368h() {
        return this.f71125f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((true != this.f71120a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f71121b ? 1237 : 1231)) * 1000003) ^ this.f71122c.hashCode()) * 1000003) ^ this.f71123d.hashCode()) * 1000003) ^ (true != this.f71124e ? 1237 : 1231)) * 1000003) ^ this.f71125f.hashCode()) * 1000003;
        if (true == this.f71126g) {
            i = 1231;
        }
        return ((((((((hashCode ^ i) * 1000003) ^ this.f71127h.hashCode()) * 1000003) ^ this.f71128i.hashCode()) * 1000003) ^ this.f71129j.hashCode()) * 1000003) ^ this.f71130k.hashCode();
    }

    /* renamed from: i */
    public final boolean mo31369i() {
        return this.f71121b;
    }

    /* renamed from: j */
    public final boolean mo31370j() {
        return this.f71126g;
    }

    /* renamed from: k */
    public final boolean mo31371k() {
        return this.f71120a;
    }

    /* renamed from: l */
    public final boolean mo31372l() {
        return this.f71124e;
    }

    public final String toString() {
        boolean z = this.f71120a;
        boolean z2 = this.f71121b;
        String num = Integer.toString(this.f71122c.getNumber());
        String valueOf = String.valueOf(this.f71123d);
        boolean z3 = this.f71124e;
        String obj = this.f71125f.toString();
        boolean z4 = this.f71126g;
        String str = this.f71127h;
        String valueOf2 = String.valueOf(this.f71128i);
        String valueOf3 = String.valueOf(this.f71129j);
        String str2 = this.f71130k;
        return "ListItem{isSelected=" + z + ", isEnabled=" + z2 + ", downloadState=" + num + ", downloadProgress=" + valueOf + ", shouldShowTooltip=" + z3 + ", locale=" + obj + ", isRecent=" + z4 + ", displayName=" + str + ", secondaryText=" + valueOf2 + ", highlightInfo=" + valueOf3 + ", endonym=" + str2 + "}";
    }
}
