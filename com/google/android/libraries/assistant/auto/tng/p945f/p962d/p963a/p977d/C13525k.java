package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13539o;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.k */
/* compiled from: PG */
public final /* synthetic */ class C13525k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C13539o f41458a;

    public /* synthetic */ C13525k(C13539o oVar) {
        this.f41458a = oVar;
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
        C13539o oVar = this.f41458a;
        return oVar.f41490b > 0 && ((C13530f) obj).f41480e.length() > oVar.f41490b;
    }
}
