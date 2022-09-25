package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

import com.google.protobuf.C63088z;
import java.io.File;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.h */
/* compiled from: PG */
final class C19404h extends C19422z {

    /* renamed from: a */
    private final boolean f54303a;

    /* renamed from: b */
    private final boolean f54304b;

    /* renamed from: c */
    private final boolean f54305c;

    /* renamed from: d */
    private final boolean f54306d;

    /* renamed from: e */
    private final Optional f54307e;

    /* renamed from: f */
    private final Optional f54308f;

    /* renamed from: g */
    private final Optional f54309g;

    /* renamed from: h */
    private final File f54310h;

    /* renamed from: i */
    private final File f54311i;

    /* renamed from: j */
    private final C63088z f54312j;

    public C19404h(boolean z, boolean z2, boolean z3, boolean z4, Optional optional, Optional optional2, Optional optional3, File file, File file2, C63088z zVar) {
        this.f54303a = z;
        this.f54304b = z2;
        this.f54305c = z3;
        this.f54306d = z4;
        this.f54307e = optional;
        this.f54308f = optional2;
        this.f54309g = optional3;
        this.f54310h = file;
        this.f54311i = file2;
        this.f54312j = zVar;
    }

    /* renamed from: a */
    public final C63088z mo24584a() {
        return this.f54312j;
    }

    /* renamed from: b */
    public final Optional mo24585b() {
        return this.f54308f;
    }

    /* renamed from: c */
    public final Optional mo24586c() {
        return this.f54309g;
    }

    /* renamed from: d */
    public final Optional mo24587d() {
        return this.f54307e;
    }

    /* renamed from: e */
    public final File mo24588e() {
        return this.f54310h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19422z) {
            C19422z zVar = (C19422z) obj;
            return this.f54303a == zVar.mo24595j() && this.f54304b == zVar.mo24591g() && this.f54305c == zVar.mo24592h() && this.f54306d == zVar.mo24594i() && this.f54307e.equals(zVar.mo24587d()) && this.f54308f.equals(zVar.mo24585b()) && this.f54309g.equals(zVar.mo24586c()) && this.f54310h.equals(zVar.mo24588e()) && this.f54311i.equals(zVar.mo24590f()) && this.f54312j.equals(zVar.mo24584a());
        }
    }

    /* renamed from: f */
    public final File mo24590f() {
        return this.f54311i;
    }

    /* renamed from: g */
    public final boolean mo24591g() {
        return this.f54304b;
    }

    /* renamed from: h */
    public final boolean mo24592h() {
        return this.f54305c;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.f54303a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f54304b ? 1237 : 1231)) * 1000003) ^ (true != this.f54305c ? 1237 : 1231)) * 1000003;
        if (true == this.f54306d) {
            i = 1231;
        }
        return ((((((((((((i2 ^ i) * 1000003) ^ this.f54307e.hashCode()) * 1000003) ^ this.f54308f.hashCode()) * 1000003) ^ this.f54309g.hashCode()) * 1000003) ^ this.f54310h.hashCode()) * 1000003) ^ this.f54311i.hashCode()) * 1000003) ^ this.f54312j.hashCode();
    }

    /* renamed from: i */
    public final boolean mo24594i() {
        return this.f54306d;
    }

    /* renamed from: j */
    public final boolean mo24595j() {
        return this.f54303a;
    }

    public final String toString() {
        boolean z = this.f54303a;
        boolean z2 = this.f54304b;
        boolean z3 = this.f54305c;
        boolean z4 = this.f54306d;
        String valueOf = String.valueOf(this.f54307e);
        String valueOf2 = String.valueOf(this.f54308f);
        String valueOf3 = String.valueOf(this.f54309g);
        String obj = this.f54310h.toString();
        String obj2 = this.f54311i.toString();
        String obj3 = this.f54312j.toString();
        return "SheldonTrainingParams{trainingOptinEnabled=" + z + ", asrFineTuningFlagEnabled=" + z2 + ", lmFineTuningFlagEnabled=" + z3 + ", sheldonDebugEnabled=" + z4 + ", sodaLpResourcesDir=" + valueOf + ", asrLcPlanFile=" + valueOf2 + ", lmLcPlanFile=" + valueOf3 + ", asrBrellaOutputDir=" + obj + ", lmBrellaOutputDir=" + obj2 + ", trainingContext=" + obj3 + "}";
    }
}
