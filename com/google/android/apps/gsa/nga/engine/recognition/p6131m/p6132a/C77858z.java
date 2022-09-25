package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77564aq;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.C77864c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82324az;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.z */
/* compiled from: PG */
public final class C77858z implements C77564aq, C77864c {

    /* renamed from: a */
    private final C77564aq f214453a;

    /* renamed from: b */
    private final Optional f214454b;

    /* renamed from: c */
    private final Optional f214455c;

    /* renamed from: d */
    private final C77732a f214456d;

    /* renamed from: e */
    private C80471b f214457e = C80471b.SODA;

    public C77858z(Optional optional, Optional optional2, C77564aq aqVar, C77732a aVar) {
        this.f214454b = optional;
        this.f214455c = optional2;
        this.f214453a = aqVar;
        this.f214456d = aVar;
    }

    /* renamed from: g */
    private final synchronized Optional m124912g() {
        if (C80471b.SODA.equals(this.f214457e)) {
            return this.f214454b;
        } else if (C80471b.S3.equals(this.f214457e)) {
            return Optional.m71637of(this.f214453a);
        } else if (C80471b.ROHAN_SODA.equals(this.f214457e)) {
            return this.f214455c;
        } else {
            return Optional.empty();
        }
    }

    /* renamed from: h */
    private final synchronized void m124913h(C77566as asVar) {
        C77732a aVar = this.f214456d;
        String name = this.f214457e.name();
        C83305i iVar = aVar.f214135e;
        int bitCount = Integer.bitCount(asVar.mo72678a());
        int b = asVar.mo72679b();
        int c = asVar.mo72680c();
        int m = asVar.mo72690m();
        String a = C77568au.m124486a(m);
        if (m == 0) {
            throw null;
        } else if (name != null) {
            iVar.mo75579d(new C82324az("NGA_AUDIO_FORMAT", a, bitCount, b, c, name));
        } else {
            throw new NullPointerException("Null engine");
        }
    }

    /* renamed from: a */
    public final void mo72673a(ac acVar) {
        m124912g().ifPresent(new C77857y(acVar));
    }

    /* renamed from: b */
    public final boolean mo72674b() {
        return ((Boolean) m124912g().map(C77855w.f214450a).orElse(false)).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo72675c(C77566as asVar, C79856d dVar) {
        m124913h(asVar);
        return ((Boolean) m124912g().map(new C77853u(asVar, dVar)).orElse(false)).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo72676d(C77566as asVar, C79856d dVar) {
        m124913h(asVar);
        return ((Boolean) m124912g().map(new C77854v(asVar, dVar)).orElse(false)).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo72677e() {
        return ((Boolean) m124912g().map(C77856x.f214451a).orElse(false)).booleanValue();
    }

    /* renamed from: f */
    public final synchronized void mo72836f(C80471b bVar) {
        mo72677e();
        this.f214457e = bVar;
    }
}
