package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.b */
/* compiled from: PG */
public final class C33729b {

    /* renamed from: a */
    public final C34119a f90080a;

    /* renamed from: b */
    public final C34043bf f90081b;

    /* renamed from: c */
    public final C34697g f90082c;

    /* renamed from: d */
    public final boolean f90083d;

    /* renamed from: e */
    public final C34065ca f90084e;

    /* renamed from: f */
    public final C34093db f90085f;

    /* renamed from: g */
    public final Duration f90086g;

    public C33729b(C34119a aVar, C34043bf bfVar, C34697g gVar, boolean z, C34065ca caVar, C34093db dbVar, Duration duration) {
        C69664n.m101061g(aVar, "client");
        C69664n.m101061g(bfVar, "entrypoint");
        C69664n.m101061g(gVar, "invocationInputExtras");
        C69664n.m101061g(caVar, "resourceConfig");
        C69664n.m101061g(dbVar, "sessionParameters");
        this.f90080a = aVar;
        this.f90081b = bfVar;
        this.f90082c = gVar;
        this.f90083d = z;
        this.f90084e = caVar;
        this.f90085f = dbVar;
        this.f90086g = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33729b)) {
            return false;
        }
        C33729b bVar = (C33729b) obj;
        return C69664n.m101066l(this.f90080a, bVar.f90080a) && this.f90081b == bVar.f90081b && C69664n.m101066l(this.f90082c, bVar.f90082c) && this.f90083d == bVar.f90083d && C69664n.m101066l(this.f90084e, bVar.f90084e) && C69664n.m101066l(this.f90085f, bVar.f90085f) && C69664n.m101066l(this.f90086g, bVar.f90086g);
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.f90080a.hashCode() * 31) + this.f90081b.hashCode()) * 31) + this.f90082c.hashCode()) * 31) + (this.f90083d ? 1 : 0)) * 31) + this.f90084e.hashCode()) * 31) + this.f90085f.hashCode()) * 31;
        Duration duration = this.f90086g;
        return hashCode + (duration == null ? 0 : duration.hashCode());
    }

    public final String toString() {
        C34119a aVar = this.f90080a;
        C34043bf bfVar = this.f90081b;
        C34697g gVar = this.f90082c;
        boolean z = this.f90083d;
        C34065ca caVar = this.f90084e;
        C34093db dbVar = this.f90085f;
        Duration duration = this.f90086g;
        return "InvocationParams(client=" + aVar + ", entrypoint=" + bfVar + ", invocationInputExtras=" + gVar + ", implicit=" + z + ", resourceConfig=" + caVar + ", sessionParameters=" + dbVar + ", timeout=" + duration + ")";
    }
}
