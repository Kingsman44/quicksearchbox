package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112560o;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56339j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.az */
/* compiled from: PG */
final class C113273az extends C113405ep {

    /* renamed from: a */
    public final long f313676a;

    /* renamed from: b */
    public final String f313677b;

    /* renamed from: c */
    public final C19167ba f313678c;

    /* renamed from: d */
    public final Optional f313679d;

    /* renamed from: e */
    public final long f313680e;

    /* renamed from: f */
    public final long f313681f;

    /* renamed from: g */
    public final String f313682g;

    /* renamed from: h */
    public final C60870cx f313683h;

    /* renamed from: i */
    public final C56339j f313684i;

    /* renamed from: j */
    public final C51331dt f313685j;

    /* renamed from: k */
    public final C48674ai f313686k;

    /* renamed from: l */
    public final Optional f313687l;

    /* renamed from: m */
    public final Optional f313688m;

    /* renamed from: n */
    public final Optional f313689n;

    /* renamed from: o */
    public final Optional f313690o;

    /* renamed from: p */
    public final C112560o f313691p;

    public C113273az(long j, String str, C19167ba baVar, Optional optional, long j2, long j3, String str2, C60870cx cxVar, C56339j jVar, C51331dt dtVar, C48674ai aiVar, Optional optional2, Optional optional3, Optional optional4, Optional optional5, C112560o oVar) {
        this.f313676a = j;
        this.f313677b = str;
        this.f313678c = baVar;
        this.f313679d = optional;
        this.f313680e = j2;
        this.f313681f = j3;
        this.f313682g = str2;
        this.f313683h = cxVar;
        this.f313684i = jVar;
        this.f313685j = dtVar;
        this.f313686k = aiVar;
        this.f313687l = optional2;
        this.f313688m = optional3;
        this.f313689n = optional4;
        this.f313690o = optional5;
        this.f313691p = oVar;
    }

    /* renamed from: a */
    public final long mo100016a() {
        return this.f313676a;
    }

    /* renamed from: b */
    public final long mo100017b() {
        return this.f313680e;
    }

    /* renamed from: c */
    public final long mo100018c() {
        return this.f313681f;
    }

    /* renamed from: d */
    public final C112560o mo100019d() {
        return this.f313691p;
    }

    /* renamed from: e */
    public final C113404eo mo100020e() {
        return new C113272ay(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113405ep) {
            C113405ep epVar = (C113405ep) obj;
            return this.f313676a == epVar.mo100016a() && this.f313677b.equals(epVar.mo100033p()) && this.f313678c.equals(epVar.mo100022f()) && this.f313679d.equals(epVar.mo100028k()) && this.f313680e == epVar.mo100017b() && this.f313681f == epVar.mo100018c() && this.f313682g.equals(epVar.mo100034q()) && this.f313683h.equals(epVar.mo100026i()) && this.f313684i.equals(epVar.mo100027j()) && this.f313685j.equals(epVar.mo100023g()) && this.f313686k.equals(epVar.mo100024h()) && this.f313687l.equals(epVar.mo100030m()) && this.f313688m.equals(epVar.mo100032o()) && this.f313689n.equals(epVar.mo100029l()) && this.f313690o.equals(epVar.mo100031n()) && this.f313691p.equals(epVar.mo100019d());
        }
    }

    /* renamed from: f */
    public final C19167ba mo100022f() {
        return this.f313678c;
    }

    /* renamed from: g */
    public final C51331dt mo100023g() {
        return this.f313685j;
    }

    /* renamed from: h */
    public final C48674ai mo100024h() {
        return this.f313686k;
    }

    public final int hashCode() {
        long j = this.f313676a;
        int hashCode = this.f313677b.hashCode();
        int hashCode2 = this.f313678c.hashCode();
        int hashCode3 = this.f313679d.hashCode();
        long j2 = this.f313680e;
        long j3 = this.f313681f;
        return this.f313691p.hashCode() ^ ((((((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f313682g.hashCode()) * 1000003) ^ this.f313683h.hashCode()) * 1000003) ^ this.f313684i.hashCode()) * 1000003) ^ this.f313685j.hashCode()) * 1000003) ^ this.f313686k.hashCode()) * 1000003) ^ this.f313687l.hashCode()) * 1000003) ^ this.f313688m.hashCode()) * 1000003) ^ this.f313689n.hashCode()) * 1000003) ^ this.f313690o.hashCode()) * 1000003);
    }

    /* renamed from: i */
    public final C60870cx mo100026i() {
        return this.f313683h;
    }

    /* renamed from: j */
    public final C56339j mo100027j() {
        return this.f313684i;
    }

    /* renamed from: k */
    public final Optional mo100028k() {
        return this.f313679d;
    }

    /* renamed from: l */
    public final Optional mo100029l() {
        return this.f313689n;
    }

    /* renamed from: m */
    public final Optional mo100030m() {
        return this.f313687l;
    }

    /* renamed from: n */
    public final Optional mo100031n() {
        return this.f313690o;
    }

    /* renamed from: o */
    public final Optional mo100032o() {
        return this.f313688m;
    }

    /* renamed from: p */
    public final String mo100033p() {
        return this.f313677b;
    }

    /* renamed from: q */
    public final String mo100034q() {
        return this.f313682g;
    }

    public final String toString() {
        long j = this.f313676a;
        String str = this.f313677b;
        String valueOf = String.valueOf(this.f313678c);
        String valueOf2 = String.valueOf(this.f313679d);
        long j2 = this.f313680e;
        long j3 = this.f313681f;
        String str2 = this.f313682g;
        String valueOf3 = String.valueOf(this.f313683h);
        String valueOf4 = String.valueOf(this.f313684i);
        String valueOf5 = String.valueOf(this.f313685j);
        String valueOf6 = String.valueOf(this.f313686k);
        String valueOf7 = String.valueOf(this.f313687l);
        String valueOf8 = String.valueOf(this.f313688m);
        String valueOf9 = String.valueOf(this.f313689n);
        String valueOf10 = String.valueOf(this.f313690o);
        return "TapasSuggestionRequest{requestId=" + j + ", prefix=" + str + ", configFlags=" + valueOf + ", immediateResponse=" + valueOf2 + ", timestampMsec=" + j2 + ", timestampMsecSinceEpoch=" + j3 + ", shortcutPackage=" + str2 + ", reflectionEventPullFuture=" + valueOf3 + ", ctrStat=" + valueOf4 + ", triggerTrustLevel=" + valueOf5 + ", surfaceType=" + valueOf6 + ", maxSuggestionCount=" + valueOf7 + ", previousQuery=" + valueOf8 + ", MLLoggingRequest=" + valueOf9 + ", offlineRequestOptions=" + valueOf10 + ", cache=" + String.valueOf(this.f313691p) + "}";
    }
}
