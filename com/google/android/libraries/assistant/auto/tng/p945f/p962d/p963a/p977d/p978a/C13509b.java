package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.b */
/* compiled from: PG */
final class C13509b extends C13512e {

    /* renamed from: a */
    private final String f41440a;

    /* renamed from: b */
    private final String f41441b;

    /* renamed from: c */
    private final String f41442c;

    /* renamed from: d */
    private final C58833ax f41443d;

    /* renamed from: e */
    private final C58833ax f41444e;

    /* renamed from: f */
    private final C58833ax f41445f;

    /* renamed from: g */
    private final C58833ax f41446g;

    /* renamed from: h */
    private final C58833ax f41447h;

    /* renamed from: i */
    private final C58833ax f41448i;

    /* renamed from: j */
    private final C58833ax f41449j;

    /* renamed from: k */
    private final int f41450k;

    public C13509b(String str, String str2, String str3, int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7) {
        this.f41440a = str;
        this.f41441b = str2;
        this.f41442c = str3;
        this.f41450k = i;
        this.f41443d = axVar;
        this.f41444e = axVar2;
        this.f41445f = axVar3;
        this.f41446g = axVar4;
        this.f41447h = axVar5;
        this.f41448i = axVar6;
        this.f41449j = axVar7;
    }

    /* renamed from: a */
    public final C58833ax mo21141a() {
        return this.f41445f;
    }

    /* renamed from: b */
    public final C58833ax mo21142b() {
        return this.f41447h;
    }

    /* renamed from: c */
    public final C58833ax mo21143c() {
        return this.f41449j;
    }

    /* renamed from: d */
    public final C58833ax mo21144d() {
        return this.f41446g;
    }

    /* renamed from: e */
    public final C58833ax mo21145e() {
        return this.f41448i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13512e) {
            C13512e eVar = (C13512e) obj;
            return this.f41440a.equals(eVar.mo21149h()) && this.f41441b.equals(eVar.mo21151i()) && this.f41442c.equals(eVar.mo21152j()) && this.f41450k == eVar.mo21153k() && this.f41443d.equals(eVar.mo21148g()) && this.f41444e.equals(eVar.mo21147f()) && this.f41445f.equals(eVar.mo21141a()) && this.f41446g.equals(eVar.mo21144d()) && this.f41447h.equals(eVar.mo21142b()) && this.f41448i.equals(eVar.mo21145e()) && this.f41449j.equals(eVar.mo21143c());
        }
    }

    /* renamed from: f */
    public final C58833ax mo21147f() {
        return this.f41444e;
    }

    /* renamed from: g */
    public final C58833ax mo21148g() {
        return this.f41443d;
    }

    /* renamed from: h */
    public final String mo21149h() {
        return this.f41440a;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f41440a.hashCode() ^ 1000003) * 1000003) ^ this.f41441b.hashCode()) * 1000003) ^ this.f41442c.hashCode()) * 1000003) ^ this.f41450k) * 1000003) ^ this.f41443d.hashCode()) * 1000003) ^ this.f41444e.hashCode()) * 1000003) ^ this.f41445f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    /* renamed from: i */
    public final String mo21151i() {
        return this.f41441b;
    }

    /* renamed from: j */
    public final String mo21152j() {
        return this.f41442c;
    }

    /* renamed from: k */
    public final int mo21153k() {
        return this.f41450k;
    }

    public final String toString() {
        String str = this.f41440a;
        String str2 = this.f41441b;
        String str3 = this.f41442c;
        int i = this.f41450k;
        String valueOf = String.valueOf(this.f41443d);
        String valueOf2 = String.valueOf(this.f41444e);
        String valueOf3 = String.valueOf(this.f41445f);
        String valueOf4 = String.valueOf(this.f41446g);
        String valueOf5 = String.valueOf(this.f41447h);
        String valueOf6 = String.valueOf(this.f41448i);
        String valueOf7 = String.valueOf(this.f41449j);
        return "EtaOrLocationString{displayString=" + str + ", messageString=" + str2 + ", type=" + str3 + ", queryStatus=" + C13511d.m29781a(i) + ", mapsNavigationStateOptional=" + valueOf + ", mapsEtaSecondsOptional=" + valueOf2 + ", destinationCountOptional=" + valueOf3 + ", locationHasProviderOptional=" + valueOf4 + ", locationAccurateOptional=" + valueOf5 + ", locationTimeOptional=" + valueOf6 + ", locationElapsedRealtimeNanoesOptional=" + valueOf7 + "}";
    }
}
