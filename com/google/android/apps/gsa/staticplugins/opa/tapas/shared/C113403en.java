package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4535g.C59203do;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.en */
/* compiled from: PG */
public abstract class C113403en {
    /* renamed from: a */
    public abstract double mo100083a();

    /* renamed from: b */
    public abstract double mo100084b();

    /* renamed from: c */
    public abstract C48670ae mo100085c();

    /* renamed from: d */
    public abstract List mo100086d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final double mo100181e() {
        return 1.0d - ((Double) Collection.EL.stream(mo100086d()).collect(Collectors.reducing(Double.valueOf(1.0d), C113400ek.f314032a, C113401el.f314033a))).doubleValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C113403en)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C113403en enVar = (C113403en) obj;
        return mo100085c().equals(enVar.mo100085c()) && mo100086d().equals(enVar.mo100086d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final double mo100183f() {
        return Collection.EL.stream(mo100086d()).mapToDouble(C113402em.f314034a).max().orElse(C59203do.f157270a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo100184g() {
        return ((mo100085c().hashCode() ^ 1000003) * 1000003) ^ mo100086d().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo100185h() {
        return String.format("ImmutableTapasSuggestionGroup{groupId=%s, suggestions=%s}", new Object[]{Integer.valueOf(mo100085c().f125872ao), mo100086d()});
    }
}
