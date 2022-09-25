package com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16360bg;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16379o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16383s;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.a.b.b */
/* compiled from: PG */
final class C15775b extends C15777d {

    /* renamed from: a */
    public final C16360bg f47003a;

    /* renamed from: b */
    public final C58833ax f47004b;

    /* renamed from: c */
    public final C58833ax f47005c;

    /* renamed from: d */
    public final C58833ax f47006d;

    /* renamed from: e */
    public final C58833ax f47007e;

    /* renamed from: f */
    public final C16383s f47008f;

    /* renamed from: g */
    public final C58833ax f47009g;

    /* renamed from: h */
    public final C16091aq f47010h;

    /* renamed from: i */
    public final C58495hd f47011i;

    /* renamed from: j */
    public final C58485gu f47012j;

    /* renamed from: k */
    public final C16379o f47013k;

    public C15775b(C16360bg bgVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C16383s sVar, C58833ax axVar5, C16091aq aqVar, C58495hd hdVar, C58485gu guVar, C16379o oVar) {
        this.f47003a = bgVar;
        this.f47004b = axVar;
        this.f47005c = axVar2;
        this.f47006d = axVar3;
        this.f47007e = axVar4;
        this.f47008f = sVar;
        this.f47009g = axVar5;
        this.f47010h = aqVar;
        this.f47011i = hdVar;
        this.f47012j = guVar;
        this.f47013k = oVar;
    }

    /* renamed from: a */
    public final C15776c mo22543a() {
        return new C15768a(this);
    }

    /* renamed from: b */
    public final C16091aq mo22544b() {
        return this.f47010h;
    }

    /* renamed from: c */
    public final C16379o mo22545c() {
        return this.f47013k;
    }

    /* renamed from: d */
    public final C16383s mo22546d() {
        return this.f47008f;
    }

    /* renamed from: e */
    public final C16360bg mo22547e() {
        return this.f47003a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15777d) {
            C15777d dVar = (C15777d) obj;
            return this.f47003a.equals(dVar.mo22547e()) && this.f47004b.equals(dVar.mo22554j()) && this.f47005c.equals(dVar.mo22551h()) && this.f47006d.equals(dVar.mo22549f()) && this.f47007e.equals(dVar.mo22553i()) && this.f47008f.equals(dVar.mo22546d()) && this.f47009g.equals(dVar.mo22550g()) && this.f47010h.equals(dVar.mo22544b()) && C58662ni.m90356o(this.f47011i, dVar.mo22556l()) && C58597ky.m90218i(this.f47012j, dVar.mo22555k()) && this.f47013k.equals(dVar.mo22545c());
        }
    }

    /* renamed from: f */
    public final C58833ax mo22549f() {
        return this.f47006d;
    }

    /* renamed from: g */
    public final C58833ax mo22550g() {
        return this.f47009g;
    }

    /* renamed from: h */
    public final C58833ax mo22551h() {
        return this.f47005c;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f47003a.hashCode() ^ 1000003) * 1000003) ^ this.f47004b.hashCode()) * 1000003) ^ this.f47005c.hashCode()) * 1000003) ^ this.f47006d.hashCode()) * 1000003) ^ this.f47007e.hashCode()) * 1000003) ^ this.f47008f.hashCode()) * 1000003) ^ this.f47009g.hashCode()) * 1000003) ^ this.f47010h.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f47011i.entrySet())) * 1000003) ^ this.f47012j.hashCode()) * 1000003) ^ this.f47013k.hashCode();
    }

    /* renamed from: i */
    public final C58833ax mo22553i() {
        return this.f47007e;
    }

    /* renamed from: j */
    public final C58833ax mo22554j() {
        return this.f47004b;
    }

    /* renamed from: k */
    public final C58485gu mo22555k() {
        return this.f47012j;
    }

    /* renamed from: l */
    public final C58495hd mo22556l() {
        return this.f47011i;
    }

    public final String toString() {
        String obj = this.f47003a.toString();
        String valueOf = String.valueOf(this.f47004b);
        String valueOf2 = String.valueOf(this.f47005c);
        String valueOf3 = String.valueOf(this.f47006d);
        String valueOf4 = String.valueOf(this.f47007e);
        String obj2 = this.f47008f.toString();
        String valueOf5 = String.valueOf(this.f47009g);
        String obj3 = this.f47010h.toString();
        String i = C58662ni.m90350i(this.f47011i);
        String obj4 = this.f47012j.toString();
        String obj5 = this.f47013k.toString();
        return "SuggestionContext{systemSignal=" + obj + ", vehicleSignal=" + valueOf + ", mediaSignal=" + valueOf2 + ", commsSignal=" + valueOf3 + ", partnerAppSignal=" + valueOf4 + ", mapsSignal=" + obj2 + ", gearheadNavigationSignal=" + valueOf5 + ", displayInfo=" + obj3 + ", candidateSuggestionMetricsMap=" + i + ", currentlyDisplayedCandidateSuggestionList=" + obj4 + ", customSignal=" + obj5 + "}";
    }
}
