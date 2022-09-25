package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134548am;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.ab */
/* compiled from: PG */
public final class C135295ab {

    /* renamed from: a */
    public final C134555at f368542a;

    /* renamed from: b */
    public final Instant f368543b;

    /* renamed from: c */
    public final Instant f368544c;

    /* renamed from: d */
    public final String f368545d;

    /* renamed from: e */
    public final C60218r f368546e;

    /* renamed from: f */
    public final C57051b f368547f;

    /* renamed from: g */
    public final Optional f368548g;

    /* renamed from: h */
    public final C134548am f368549h;

    /* renamed from: i */
    private final Throwable f368550i;

    public C135295ab(C134555at atVar, Throwable th, Instant instant, Instant instant2, String str, C60218r rVar, C57051b bVar, Optional optional, C134548am amVar) {
        C69664n.m101061g(atVar, "status");
        C69664n.m101061g(instant, "lastRefreshAttempt");
        C69664n.m101061g(instant2, "creationTime");
        C69664n.m101061g(str, "sessionId");
        C69664n.m101061g(rVar, "rootResponseEventId");
        C69664n.m101061g(bVar, "feedId");
        C69664n.m101061g(optional, "optionalToken");
        C69664n.m101061g(amVar, "contentLifetime");
        this.f368542a = atVar;
        this.f368550i = th;
        this.f368543b = instant;
        this.f368544c = instant2;
        this.f368545d = str;
        this.f368546e = rVar;
        this.f368547f = bVar;
        this.f368548g = optional;
        this.f368549h = amVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135295ab)) {
            return false;
        }
        C135295ab abVar = (C135295ab) obj;
        return this.f368542a == abVar.f368542a && C69664n.m101066l(this.f368550i, abVar.f368550i) && C69664n.m101066l(this.f368543b, abVar.f368543b) && C69664n.m101066l(this.f368544c, abVar.f368544c) && C69664n.m101066l(this.f368545d, abVar.f368545d) && C69664n.m101066l(this.f368546e, abVar.f368546e) && C69664n.m101066l(this.f368547f, abVar.f368547f) && C69664n.m101066l(this.f368548g, abVar.f368548g) && C69664n.m101066l(this.f368549h, abVar.f368549h);
    }

    public final int hashCode() {
        int hashCode = this.f368542a.hashCode() * 31;
        Throwable th = this.f368550i;
        return ((((((((((((((hashCode + (th == null ? 0 : th.hashCode())) * 31) + this.f368543b.hashCode()) * 31) + this.f368544c.hashCode()) * 31) + this.f368545d.hashCode()) * 31) + this.f368546e.hashCode()) * 31) + this.f368547f.hashCode()) * 31) + this.f368548g.hashCode()) * 31) + this.f368549h.hashCode();
    }

    public final String toString() {
        C134555at atVar = this.f368542a;
        Throwable th = this.f368550i;
        Instant instant = this.f368543b;
        Instant instant2 = this.f368544c;
        String str = this.f368545d;
        C60218r rVar = this.f368546e;
        C57051b bVar = this.f368547f;
        Optional optional = this.f368548g;
        C134548am amVar = this.f368549h;
        return "SessionMetadata(status=" + atVar + ", cause=" + th + ", lastRefreshAttempt=" + instant + ", creationTime=" + instant2 + ", sessionId=" + str + ", rootResponseEventId=" + rVar + ", feedId=" + bVar + ", optionalToken=" + optional + ", contentLifetime=" + amVar + ")";
    }
}
