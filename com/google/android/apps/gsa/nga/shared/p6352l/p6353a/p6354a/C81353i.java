package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6354a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81378l;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81379m;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.a.i */
/* compiled from: PG */
public final class C81353i implements C81379m {

    /* renamed from: c */
    public static final /* synthetic */ int f222667c = 0;

    /* renamed from: b */
    public final C81315k f222668b;

    /* renamed from: d */
    private final C60836bq f222669d = new C60836bq();

    public C81353i(C81315k kVar) {
        this.f222668b = kVar;
    }

    /* renamed from: a */
    public final C58485gu mo75018a(C80267v vVar, boolean z) {
        C58485gu q = this.f222668b.mo74901q(vVar.f220269g, z);
        return z ? (C58485gu) Stream.CC.concat(Collection.EL.stream(q), Collection.EL.stream(this.f222668b.mo74901q(vVar.f220269g, false))).sorted().collect(C58370cn.f155946a) : q;
    }

    /* renamed from: b */
    public final C58485gu mo75019b() {
        C58512hu t = this.f222668b.mo74904t(true);
        HashMap hashMap = new HashMap();
        C58800sl lA = t.map.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C80251f a = C81378l.m129447a((e) entry.getKey());
            if (!hashMap.containsKey(a)) {
                hashMap.put(a, 0);
            }
            hashMap.put(a, Integer.valueOf(((Integer) hashMap.get(a)).intValue() + ((java.util.Collection) entry.getValue()).size()));
        }
        return (C58485gu) Collection.EL.stream(hashMap.entrySet()).sorted(Comparator.CC.comparingInt(C81349e.f222660a)).map(C81350f.f222661a).filter(C81351g.f222662a).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public final C60870cx mo75020c() {
        return this.f222669d.mo57305b(new C81348d(this), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo75021d(Instant instant, C80267v vVar, boolean z) {
        return this.f222669d.mo57305b(new C81352h(this, instant, vVar, z), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo75022e(Instant instant, e eVar) {
        return this.f222669d.mo57305b(new C81347c(this, instant, eVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo75023f(Instant instant, e eVar) {
        return this.f222669d.mo57305b(new C81345a(this, instant, eVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo75024g(Instant instant, C80267v vVar, boolean z) {
        return this.f222669d.mo57305b(new C81346b(this, instant, vVar, z), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final Instant mo75025h() {
        Optional Z = this.f222668b.mo74878Z();
        C60948g gVar = C60948g.f165068a;
        return (Instant) Z.orElse(Instant.now());
    }

    /* renamed from: i */
    public final C58485gu mo75026i(C80267v vVar) {
        return this.f222668b.mo74885af(vVar.f220269g);
    }
}
