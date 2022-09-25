package com.google.android.libraries.performance.primes;

import com.google.common.base.C58833ax;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.a */
/* compiled from: PG */
public class C31124a extends C31189bh {

    /* renamed from: a */
    public final C69464a f83831a;

    /* renamed from: b */
    public final C58833ax f83832b;

    /* renamed from: c */
    public final C58833ax f83833c;

    /* renamed from: d */
    public final C58833ax f83834d;

    /* renamed from: e */
    public final C58833ax f83835e;

    /* renamed from: f */
    public final C58833ax f83836f;

    /* renamed from: g */
    public final C58833ax f83837g;

    /* renamed from: h */
    public final C58833ax f83838h;

    /* renamed from: i */
    public final C58833ax f83839i;

    /* renamed from: j */
    public final C58833ax f83840j;

    /* renamed from: k */
    public final C58833ax f83841k;

    /* renamed from: l */
    public final C58833ax f83842l;

    /* renamed from: m */
    public final C58833ax f83843m;

    /* renamed from: n */
    public final C58833ax f83844n;

    public C31124a(C69464a aVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9, C58833ax axVar10, C58833ax axVar11, C58833ax axVar12, C58833ax axVar13) {
        this.f83831a = aVar;
        this.f83832b = axVar;
        this.f83833c = axVar2;
        this.f83834d = axVar3;
        this.f83835e = axVar4;
        this.f83836f = axVar5;
        this.f83837g = axVar6;
        this.f83838h = axVar7;
        this.f83839i = axVar8;
        this.f83840j = axVar9;
        this.f83841k = axVar10;
        this.f83842l = axVar11;
        this.f83843m = axVar12;
        this.f83844n = axVar13;
    }

    /* renamed from: a */
    public final C58833ax mo36869a() {
        return this.f83836f;
    }

    /* renamed from: b */
    public final C58833ax mo36870b() {
        return this.f83843m;
    }

    /* renamed from: c */
    public final C58833ax mo36871c() {
        return this.f83844n;
    }

    /* renamed from: d */
    public final C58833ax mo36872d() {
        return this.f83835e;
    }

    /* renamed from: e */
    public final C58833ax mo36873e() {
        return this.f83832b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31189bh) {
            C31189bh bhVar = (C31189bh) obj;
            return this.f83831a.equals(bhVar.mo36884n()) && this.f83832b.equals(bhVar.mo36873e()) && this.f83833c.equals(bhVar.mo36876g()) && this.f83834d.equals(bhVar.mo36882l()) && this.f83835e.equals(bhVar.mo36872d()) && this.f83836f.equals(bhVar.mo36869a()) && this.f83837g.equals(bhVar.mo36879i()) && this.f83838h.equals(bhVar.mo36880j()) && this.f83839i.equals(bhVar.mo36875f()) && this.f83840j.equals(bhVar.mo36877h()) && this.f83841k.equals(bhVar.mo36881k()) && this.f83842l.equals(bhVar.mo36883m()) && this.f83843m.equals(bhVar.mo36870b()) && this.f83844n.equals(bhVar.mo36871c());
        }
    }

    /* renamed from: f */
    public final C58833ax mo36875f() {
        return this.f83839i;
    }

    /* renamed from: g */
    public final C58833ax mo36876g() {
        return this.f83833c;
    }

    /* renamed from: h */
    public final C58833ax mo36877h() {
        return this.f83840j;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((this.f83831a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.f83833c.hashCode()) * 1000003) ^ this.f83834d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    /* renamed from: i */
    public final C58833ax mo36879i() {
        return this.f83837g;
    }

    /* renamed from: j */
    public final C58833ax mo36880j() {
        return this.f83838h;
    }

    /* renamed from: k */
    public final C58833ax mo36881k() {
        return this.f83841k;
    }

    /* renamed from: l */
    public final C58833ax mo36882l() {
        return this.f83834d;
    }

    /* renamed from: m */
    public final C58833ax mo36883m() {
        return this.f83842l;
    }

    /* renamed from: n */
    public final C69464a mo36884n() {
        return this.f83831a;
    }

    public final String toString() {
        String obj = this.f83831a.toString();
        String obj2 = this.f83833c.toString();
        String obj3 = this.f83834d.toString();
        return "PrimesConfigurations{metricTransmittersProvider=" + obj + ", globalConfigurationsProvider=Optional.absent(), memoryConfigurationsProvider=" + obj2 + ", timerConfigurationsProvider=" + obj3 + ", crashConfigurationsProvider=Optional.absent(), applicationExitConfigurationsProvider=Optional.absent(), networkConfigurationsProvider=Optional.absent(), storageConfigurationsProvider=Optional.absent(), jankConfigurationsProvider=Optional.absent(), monitorAllActivitiesProvider=Optional.absent(), tikTokTraceConfigurationsProvider=Optional.absent(), traceConfigurationsProvider=Optional.absent(), batteryConfigurationsProvider=Optional.absent(), cpuProfilingConfigurationsProvider=Optional.absent()}";
    }
}
