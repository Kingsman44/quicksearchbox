package com.google.assistant.p3838ao.p3839a.p3840a;

import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49555bl;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.assistant.ao.a.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C49389ag implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C49692r f127650a;

    public /* synthetic */ C49389ag(C49692r rVar) {
        this.f127650a = rVar;
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
        return ((Boolean) ((C49381a) this.f127650a).f127639e.map(new C49390ah((C49555bl) obj)).orElse(false)).booleanValue();
    }
}
