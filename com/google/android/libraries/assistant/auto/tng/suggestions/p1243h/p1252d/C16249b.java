package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.p1214b.C15967a;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.b */
/* compiled from: PG */
public final /* synthetic */ class C16249b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f47858a;

    /* renamed from: b */
    public final /* synthetic */ Instant f47859b;

    public /* synthetic */ C16249b(C58495hd hdVar, Instant instant) {
        this.f47858a = hdVar;
        this.f47859b = instant;
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
        C58495hd hdVar = this.f47858a;
        Instant instant = this.f47859b;
        C16143co coVar = (C16143co) obj;
        C59071e eVar = C16267t.f47888a;
        if (hdVar.containsKey(coVar.mo22800d())) {
            return C15967a.m32772a((C16077ac) hdVar.get(coVar.mo22800d()), C16267t.f47889b, instant, true);
        }
        return true;
    }
}
