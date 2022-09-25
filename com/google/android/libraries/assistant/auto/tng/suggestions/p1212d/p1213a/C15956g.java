package com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1213a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1214b.C15967a;
import com.google.assistant.p3994s.p3995a.C53448og;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.d.a.g */
/* compiled from: PG */
public final /* synthetic */ class C15956g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C15965p f47331a;

    /* renamed from: b */
    public final /* synthetic */ C15777d f47332b;

    /* renamed from: c */
    public final /* synthetic */ C16090ap f47333c;

    /* renamed from: d */
    public final /* synthetic */ C15938h f47334d;

    public /* synthetic */ C15956g(C15965p pVar, C15777d dVar, C16090ap apVar, C15938h hVar) {
        this.f47331a = pVar;
        this.f47332b = dVar;
        this.f47333c = apVar;
        this.f47334d = hVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C15965p pVar = this.f47331a;
        C15777d dVar = this.f47332b;
        C16090ap apVar = this.f47333c;
        C15938h hVar = this.f47334d;
        C16170n nVar = (C16170n) obj;
        boolean z = true;
        if ((nVar.mo22747b().f48076a & 128) != 0) {
            C16077ac acVar = (C16077ac) dVar.mo22556l().getOrDefault(nVar.mo22752f(), C15965p.f47344a);
            if (!apVar.equals(C16090ap.COOLWALK) || hVar.mo22605a().equals(C15937g.PERIODIC_SUGGESTION_GENERATION) || !((Instant) pVar.f47348d.mo22630e(apVar).mo56109e(Instant.EPOCH)).isBefore(Instant.ofEpochMilli(acVar.mo22702f()))) {
                z = false;
            }
            C53448og ogVar = nVar.mo22747b().f48086k;
            if (ogVar == null) {
                ogVar = C53448og.f140280h;
            }
            z = C15967a.m32772a(acVar, ogVar, Instant.ofEpochMilli(pVar.f47347c.mo26870b()), z);
            if (!z) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        return z;
    }
}
