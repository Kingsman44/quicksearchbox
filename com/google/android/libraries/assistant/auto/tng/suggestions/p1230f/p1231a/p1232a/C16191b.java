package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1232a;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C16191b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C13256b f47752a;

    public /* synthetic */ C16191b(C13256b bVar) {
        this.f47752a = bVar;
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
        C13256b bVar = this.f47752a;
        C13256b bVar2 = (C13256b) obj;
        return bVar2.f40930b.equals(bVar.f40930b) && bVar2.f40932d > bVar.f40932d;
    }
}
