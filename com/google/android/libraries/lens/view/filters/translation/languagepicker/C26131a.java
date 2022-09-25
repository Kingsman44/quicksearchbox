package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.a */
/* compiled from: PG */
final class C26131a extends C26199z {

    /* renamed from: a */
    public final boolean f71032a;

    /* renamed from: b */
    public final C58485gu f71033b;

    /* renamed from: c */
    public final C58485gu f71034c;

    /* renamed from: d */
    public final C58833ax f71035d;

    /* renamed from: e */
    public final Locale f71036e;

    /* renamed from: f */
    public final C58495hd f71037f;

    /* renamed from: g */
    public final C58495hd f71038g;

    /* renamed from: h */
    public final boolean f71039h;

    /* renamed from: i */
    public final boolean f71040i;

    public C26131a(boolean z, C58485gu guVar, C58485gu guVar2, C58833ax axVar, Locale locale, C58495hd hdVar, C58495hd hdVar2, boolean z2, boolean z3) {
        this.f71032a = z;
        this.f71033b = guVar;
        this.f71034c = guVar2;
        this.f71035d = axVar;
        this.f71036e = locale;
        this.f71037f = hdVar;
        this.f71038g = hdVar2;
        this.f71039h = z2;
        this.f71040i = z3;
    }

    /* renamed from: a */
    public final C58833ax mo31339a() {
        return this.f71035d;
    }

    /* renamed from: b */
    public final C58485gu mo31340b() {
        return this.f71034c;
    }

    /* renamed from: c */
    public final C58485gu mo31341c() {
        return this.f71033b;
    }

    /* renamed from: d */
    public final C58495hd mo31342d() {
        return this.f71038g;
    }

    /* renamed from: e */
    public final C58495hd mo31343e() {
        return this.f71037f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26199z) {
            C26199z zVar = (C26199z) obj;
            return this.f71032a == zVar.mo31347h() && C58597ky.m90218i(this.f71033b, zVar.mo31341c()) && C58597ky.m90218i(this.f71034c, zVar.mo31340b()) && this.f71035d.equals(zVar.mo31339a()) && this.f71036e.equals(zVar.mo31345f()) && this.f71037f.equals(zVar.mo31343e()) && this.f71038g.equals(zVar.mo31342d()) && this.f71039h == zVar.mo31346g() && this.f71040i == zVar.mo31349i();
        }
    }

    /* renamed from: f */
    public final Locale mo31345f() {
        return this.f71036e;
    }

    /* renamed from: g */
    public final boolean mo31346g() {
        return this.f71039h;
    }

    /* renamed from: h */
    public final boolean mo31347h() {
        return this.f71032a;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((true != this.f71032a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f71033b.hashCode()) * 1000003) ^ this.f71034c.hashCode()) * 1000003) ^ this.f71035d.hashCode()) * 1000003) ^ this.f71036e.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f71037f.entrySet())) * 1000003) ^ C58758qx.m90643a(this.f71038g.entrySet())) * 1000003) ^ (true != this.f71039h ? 1237 : 1231)) * 1000003;
        if (true == this.f71040i) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo31349i() {
        return this.f71040i;
    }

    public final String toString() {
        boolean z = this.f71032a;
        String obj = this.f71033b.toString();
        String obj2 = this.f71034c.toString();
        String obj3 = this.f71035d.toString();
        String obj4 = this.f71036e.toString();
        String obj5 = this.f71037f.toString();
        String obj6 = this.f71038g.toString();
        boolean z2 = this.f71039h;
        boolean z3 = this.f71040i;
        return "DataParameters{shouldShowAuto=" + z + ", recentLocales=" + obj + ", locales=" + obj2 + ", detectedLocale=" + obj3 + ", selectedLocale=" + obj4 + ", downloadStates=" + obj5 + ", downloadProgresses=" + obj6 + ", isConnected=" + z2 + ", shouldShowTooltip=" + z3 + "}";
    }
}
