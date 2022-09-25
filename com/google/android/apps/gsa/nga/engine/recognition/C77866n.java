package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.n */
/* compiled from: PG */
final class C77866n extends C77557aj {

    /* renamed from: a */
    public final Instant f214496a;

    /* renamed from: b */
    public final Optional f214497b;

    /* renamed from: c */
    public final Optional f214498c;

    /* renamed from: d */
    public final C58485gu f214499d;

    /* renamed from: e */
    public final Optional f214500e;

    /* renamed from: f */
    public final boolean f214501f;

    /* renamed from: g */
    public final C77556ai f214502g;

    /* renamed from: h */
    public final Optional f214503h;

    /* renamed from: i */
    public final Optional f214504i;

    /* renamed from: j */
    public final j f214505j;

    /* renamed from: k */
    public final Optional f214506k;

    /* renamed from: l */
    public final C77889u f214507l;

    /* renamed from: m */
    public final Optional f214508m;

    /* renamed from: n */
    public final C77563ap f214509n;

    /* renamed from: o */
    public final Optional f214510o;

    /* renamed from: p */
    public final Optional f214511p;

    /* renamed from: q */
    public final Optional f214512q;

    /* renamed from: r */
    public final Optional f214513r;

    /* renamed from: s */
    public final Optional f214514s;

    public C77866n(Instant instant, Optional optional, Optional optional2, C58485gu guVar, Optional optional3, boolean z, C77556ai aiVar, Optional optional4, Optional optional5, j jVar, Optional optional6, C77889u uVar, Optional optional7, C77563ap apVar, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12) {
        this.f214496a = instant;
        this.f214497b = optional;
        this.f214498c = optional2;
        this.f214499d = guVar;
        this.f214500e = optional3;
        this.f214501f = z;
        this.f214502g = aiVar;
        this.f214503h = optional4;
        this.f214504i = optional5;
        this.f214505j = jVar;
        this.f214506k = optional6;
        this.f214507l = uVar;
        this.f214508m = optional7;
        this.f214509n = apVar;
        this.f214510o = optional8;
        this.f214511p = optional9;
        this.f214512q = optional10;
        this.f214513r = optional11;
        this.f214514s = optional12;
    }

    /* renamed from: a */
    public final j mo72638a() {
        return this.f214505j;
    }

    /* renamed from: b */
    public final C77889u mo72639b() {
        return this.f214507l;
    }

    /* renamed from: c */
    public final C77555ah mo72640c() {
        return new C77830m(this);
    }

    /* renamed from: d */
    public final C77556ai mo72641d() {
        return this.f214502g;
    }

    /* renamed from: e */
    public final C77563ap mo72642e() {
        return this.f214509n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77557aj) {
            C77557aj ajVar = (C77557aj) obj;
            return this.f214496a.equals(ajVar.mo72644g()) && this.f214497b.equals(ajVar.mo72653p()) && this.f214498c.equals(ajVar.mo72654q()) && C58597ky.m90218i(this.f214499d, ajVar.mo72643f()) && this.f214500e.equals(ajVar.mo72656s()) && this.f214501f == ajVar.mo72657t() && !ajVar.mo72658u() && this.f214502g.equals(ajVar.mo72641d()) && this.f214503h.equals(ajVar.mo72651n()) && this.f214504i.equals(ajVar.mo72650m()) && this.f214505j.equals(ajVar.mo72638a()) && this.f214506k.equals(ajVar.mo72646i()) && this.f214507l.equals(ajVar.mo72639b()) && this.f214508m.equals(ajVar.mo72647j()) && this.f214509n.equals(ajVar.mo72642e()) && this.f214510o.equals(ajVar.mo72645h()) && this.f214511p.equals(ajVar.mo72655r()) && this.f214512q.equals(ajVar.mo72648k()) && this.f214513r.equals(ajVar.mo72649l()) && this.f214514s.equals(ajVar.mo72652o());
        }
    }

    /* renamed from: f */
    public final C58485gu mo72643f() {
        return this.f214499d;
    }

    /* renamed from: g */
    public final Instant mo72644g() {
        return this.f214496a;
    }

    /* renamed from: h */
    public final Optional mo72645h() {
        return this.f214510o;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((this.f214496a.hashCode() ^ 1000003) * 1000003) ^ this.f214497b.hashCode()) * 1000003) ^ this.f214498c.hashCode()) * 1000003) ^ this.f214499d.hashCode()) * 1000003) ^ this.f214500e.hashCode()) * 1000003) ^ (true != this.f214501f ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.f214502g.hashCode()) * 1000003) ^ this.f214503h.hashCode()) * 1000003) ^ this.f214504i.hashCode()) * 1000003) ^ this.f214505j.hashCode()) * 1000003) ^ this.f214506k.hashCode()) * 1000003) ^ this.f214507l.hashCode()) * 1000003) ^ this.f214508m.hashCode()) * 1000003) ^ this.f214509n.hashCode()) * 1000003) ^ this.f214510o.hashCode()) * 1000003) ^ this.f214511p.hashCode()) * 1000003) ^ this.f214512q.hashCode()) * 1000003) ^ this.f214513r.hashCode()) * 1000003) ^ this.f214514s.hashCode();
    }

    /* renamed from: i */
    public final Optional mo72646i() {
        return this.f214506k;
    }

    /* renamed from: j */
    public final Optional mo72647j() {
        return this.f214508m;
    }

    /* renamed from: k */
    public final Optional mo72648k() {
        return this.f214512q;
    }

    /* renamed from: l */
    public final Optional mo72649l() {
        return this.f214513r;
    }

    /* renamed from: m */
    public final Optional mo72650m() {
        return this.f214504i;
    }

    /* renamed from: n */
    public final Optional mo72651n() {
        return this.f214503h;
    }

    /* renamed from: o */
    public final Optional mo72652o() {
        return this.f214514s;
    }

    /* renamed from: p */
    public final Optional mo72653p() {
        return this.f214497b;
    }

    /* renamed from: q */
    public final Optional mo72654q() {
        return this.f214498c;
    }

    /* renamed from: r */
    public final Optional mo72655r() {
        return this.f214511p;
    }

    /* renamed from: s */
    public final Optional mo72656s() {
        return this.f214500e;
    }

    /* renamed from: t */
    public final boolean mo72657t() {
        return this.f214501f;
    }

    public final String toString() {
        String obj = this.f214496a.toString();
        String valueOf = String.valueOf(this.f214497b);
        String valueOf2 = String.valueOf(this.f214498c);
        String obj2 = this.f214499d.toString();
        String valueOf3 = String.valueOf(this.f214500e);
        boolean z = this.f214501f;
        String obj3 = this.f214502g.toString();
        String valueOf4 = String.valueOf(this.f214503h);
        String valueOf5 = String.valueOf(this.f214504i);
        String obj4 = this.f214505j.toString();
        String valueOf6 = String.valueOf(this.f214506k);
        String obj5 = this.f214507l.toString();
        String valueOf7 = String.valueOf(this.f214508m);
        String obj6 = this.f214509n.toString();
        String valueOf8 = String.valueOf(this.f214510o);
        String valueOf9 = String.valueOf(this.f214511p);
        String valueOf10 = String.valueOf(this.f214512q);
        String valueOf11 = String.valueOf(this.f214513r);
        return "RecognitionResult{instant=" + obj + ", speechEndTime=" + valueOf + ", strictSpeechDuration=" + valueOf2 + ", hypotheses=" + obj2 + ", transcription=" + valueOf3 + ", initial=" + z + ", userEndpointingInitiated=false, eventType=" + obj3 + ", magicMicScore=" + valueOf4 + ", magicMicAcousticScore=" + valueOf5 + ", candidateIdentifier=" + obj4 + ", deliberateInputDetectionResult=" + valueOf6 + ", engine=" + obj5 + ", engineVersion=" + valueOf7 + ", speakerInfo=" + obj6 + ", audioLevelInfoResult=" + valueOf8 + ", topAsrHypothesis=" + valueOf9 + ", hotqueryResult=" + valueOf10 + ", hotwordValidationResult=" + valueOf11 + ", recognitionEventDebugData=" + String.valueOf(this.f214514s) + "}";
    }

    /* renamed from: u */
    public final boolean mo72658u() {
        return false;
    }
}
