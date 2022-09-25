package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118586d;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ay */
/* compiled from: PG */
public final /* synthetic */ class C125489ay implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C125495bd f346048a;

    /* renamed from: b */
    public final /* synthetic */ Set f346049b;

    public /* synthetic */ C125489ay(C125495bd bdVar, Set set) {
        this.f346048a = bdVar;
        this.f346049b = set;
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
        return this.f346049b.add(this.f346048a.f346058b.mo107533a(((C118586d) obj).f330856b));
    }
}
